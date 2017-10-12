Type=Service
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	Dim T1 As Timer
	Dim WS As PhoneWakeState
	
	Dim FOREFRONT_STATE As Boolean
End Sub

Sub Service_Create
	T1.Initialize("T1",5*1000)
End Sub

Sub Service_Start (StartingIntent As Intent)
	T1.Enabled=True
	WS.KeepAlive(True)
	If IsPaused(Main) Then
		StartActivity("Main")
	End If
End Sub

Sub Service_Destroy
	WS.ReleaseKeepAlive
End Sub

Sub T1_Tick	
	If FOREFRONT_STATE Then
		
	Else
		Log(">>> ON - Forefront from service, from minimise")
		StartActivity("Main")
		FOREFRONT_STATE = True
	End If
	
	CallSub(Main,"SetShowWhenLocked")
End Sub