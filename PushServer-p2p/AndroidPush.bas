Type=StaticCode
Version=5.9
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@

Sub Process_Globals
	
End Sub

Public Sub SendMessageTo(Devices As List, msg As Message)
	
	Dim json As JSONGenerator
	Dim m As Map
	m.Initialize
	m.Put("registration_ids", Devices)
	Dim data As Map
	data.Initialize
	data.Put("data", msg.Text)
	'you can add more fields to data and then read them on the device.
	m.Put("data", data)
	json.Initialize(m)
	Dim Job As HttpJob
	Job.Initialize("send message", Me)
	Job.PostString("https://android.googleapis.com/gcm/send", json.ToString)
	Job.GetRequest.SetContentType("application/json")
	Job.GetRequest.SetHeader("Authorization", "key=" & Main.config.Get("AndroidApiKey"))
End Sub

Private Sub JobDone(j As HttpJob)
	If j.Success Then
		Log("Message was sent successfully")
	Else
		Log("Error sending Android message: " & j.ErrorMessage)
	End If
	j.Release
End Sub