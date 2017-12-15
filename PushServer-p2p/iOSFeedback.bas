Type=StaticCode
Version=5.9
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@

Sub Process_Globals
	Private sock As Socket
	Private astream As AsyncStreams
	Private bc As ByteConverter
	Private timer1 As Timer
	Private buffer As List
End Sub

Public Sub Start
	bc.LittleEndian = False
	buffer.Initialize
	timer1.Initialize("timer1", 1 * DateTime.TicksPerHour)
	timer1.Enabled = True
	Connect
End Sub

Sub Timer1_Tick
	Connect
End Sub

Private Sub Connect
	If sock.IsInitialized Then sock.Close
	Dim sock As Socket
	sock.InitializeSSL("sock", File.OpenInput(Main.config.Get("iPushKeystore"), ""), Main.config.Get("iPushKeystorePassword"))
	sock.Connect(Main.config.Get("iFeedback"), Main.config.Get("iFeedbackPort"), 30000)
	buffer.Clear
End Sub

Private Sub sock_Connected (Successful As Boolean)
	If Successful Then
		Log("Feedback Socket connected.")
		If astream.IsInitialized Then astream.Close
		astream.Initialize(sock.InputStream, sock.OutputStream, "astream")
	Else
		Log("Error connecting feedback socket: " & LastException)
	End If
End Sub

Private Sub AStream_NewData (data() As Byte)
	Log("Feedback data available")
	buffer.AddAll(data)
End Sub

Private Sub AStream_Terminated
	Log("feedback terminated")
	For i = 0 To buffer.Size - 1 Step 38
		Dim date() As Byte = SubListToArray(i, 4)
		Dim token() As Byte = SubListToArray(i + 6, 32)
		Log(bc.IntsFromBytes(date)(0))
		Dim HexToken As String = bc.HexFromBytes(token)
		Log($"Deleting token ${HexToken}"$)
		Main.db.ExecNonQuery2("DELETE FROM tokens WHERE token = ?", Array(HexToken))
	Next
End Sub

Private Sub SubListToArray(st As Int, len As Int) As Byte()
	Dim data(len) As Byte
	For i = st To st + len - 1
		data(i - st) = buffer.Get(i)
	Next
	Return data
End Sub

Private Sub AStream_Error
	Log("Error: " & LastException)
End Sub