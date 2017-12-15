Type=Class
Version=5.9
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Handler class
Sub Class_Globals
	
End Sub

Public Sub Initialize
	
End Sub

Sub Handle(req As ServletRequest, resp As ServletResponse)
	Dim token As String = req.GetParameter("token")
	Dim deviceType As Int = req.GetParameter("type")
	Main.db.BeginTransaction
	Try
		Main.db.ExecNonQuery2("DELETE FROM tokens WHERE token = ?", Array(token))
		Main.db.ExecNonQuery2("INSERT INTO tokens VALUES (?, ?, ?)", _
			Array(token, deviceType, DateTime.Now))
		Main.db.TransactionSuccessful
		Log("Token added: " & token)
	Catch
		Main.db.Rollback
	End Try
End Sub