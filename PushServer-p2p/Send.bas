﻿Type=Class
Version=5.9
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Handler class
Sub Class_Globals
	Private Const DAYS_LIMIT As Int = 300
End Sub

Public Sub Initialize
	
End Sub

Sub Handle(req As ServletRequest, resp As ServletResponse)
	If req.GetParameter("password") <> Main.config.Get("PushServerPassword") Then
		resp.SendError(500, "Invalid password")
		Return
	End If
	
	Dim m As Message
	m.Initialize
	If IsNumber(req.GetParameter("badge")) Then
		m.Badge = req.GetParameter("badge")
	End If
	m.Text = req.GetParameter("text")
	m.Sound = True
	m.HighPriority = True
	m.ExpirationDate = DateTime.Now + DateTime.TicksPerDay
	m.userID  = req.GetParameter("userid")
	m.userName  = req.GetParameter("username")
	
	'Dim userID As String = req.GetParameter("userid")
	'Dim userName As String = req.GetParameter("username")
	Dim rows As List = DBUtils.ExecuteMemoryTable(Main.db, _
		"SELECT token, type, userid, username FROM tokens WHERE updated_time > ? and userid=? and username=? ORDER BY updated_time DESC", _
		Array As String (DateTime.Now - DAYS_LIMIT * DateTime.TicksPerDay, m.userID, m.userName), 0)
		
	Dim iosTokens, AndroidTokens As List
	iosTokens.Initialize
	AndroidTokens.Initialize
	For Each row() As String In rows
		If row(1) = Main.TYPE_IOS Then
			iosTokens.Add(row(0))
			If iosTokens.Size > 900 Then
				CallSubDelayed3(iOSPush, "SendMessageTo", iosTokens, m)
				Dim iosTokens As List
				iosTokens.Initialize
			End If
		Else
			AndroidTokens.Add(row(0))
			If AndroidTokens.Size > 900 Then
				CallSubDelayed3(AndroidPush, "SendMessageTo", AndroidTokens, m)
				Dim AndroidTokens As List
				AndroidTokens.Initialize
			End If
		End If
	Next
	If iosTokens.Size > 0 Then CallSubDelayed3(iOSPush, "SendMessageTo", iosTokens, m)
	If AndroidTokens.Size > 0 Then CallSubDelayed3(AndroidPush, "SendMessageTo", AndroidTokens, m)
	
	resp.Write("Message sent to " & rows.Size & " device(s).")
End Sub