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
	Type Message(Text As String, Sound As Boolean, Badge As Int, ExpirationDate As Long, HighPriority As Boolean)
End Sub

Public Sub Start
	bc.LittleEndian = False
	timer1.Initialize("timer1", 3000) 'this timer is used when trying to reconnect
	Connect
End Sub

Private Sub Connect
	If sock.IsInitialized Then sock.Close
	Dim sock As Socket
	sock.InitializeSSL("sock", File.OpenInput(Main.config.Get("iPushKeystore"), ""), Main.config.Get("iPushKeystorePassword"))
	sock.Connect(Main.config.Get("iGateway"), Main.config.Get("iGateWayPort"), 30000)
End Sub

Private Sub sock_Connected (Successful As Boolean)
	If Successful Then
		timer1.Enabled = False
		Log("Socket connected.")
		If astream.IsInitialized Then astream.Close
		astream.Initialize(sock.InputStream, sock.OutputStream, "astream")
	Else
		Log("Error connecting socket: " & LastException)
		Reconnect
	End If
End Sub
Private Sub Reconnect
	Log("Trying to reconnect...")
	timer1.Enabled = True
End Sub
Private Sub Timer1_Tick
	timer1.Enabled = False
	Connect
End Sub

Private Sub astream_NewData (Buffer() As Byte)
	If Buffer.Length >=6 Then
		Log("status=" & Buffer(1))
	Else
		Log("Invalid response")
	End If
End Sub
Private Sub astream_Error
	Log("error: " & LastException)
	Reconnect
End Sub
Private Sub astream_Terminated
	Log("terminated")
	Reconnect
End Sub

Public Sub SendMessageTo(Devices As List, msg As Message)
	Log("send message to")
	Dim out As OutputStream
	out.InitializeToBytesArray(0)
	For Each device As String In Devices
		Dim FrameData As OutputStream
		FrameData.InitializeToBytesArray(0)
		WriteItem(FrameData, 1, bc.HexToBytes(device))
		Dim jg As JSONGenerator
		Dim m As Map =  CreateMap("alert": CreateMap("title": "my title", "body": msg.Text), "badge": msg.Badge)
		If msg.Sound Then m.Put("sound", "default")
		jg.Initialize(CreateMap("aps":m))
		'jg.Initialize(CreateMap("aps":CreateMap("content-available": 1)))
		WriteItem(FrameData,2, jg.ToString.GetBytes("UTF8"))
		WriteItem(FrameData,3, bc.IntsToBytes(Array As Int(Rnd(0, 9999999))))
		WriteItem(FrameData,4, bc.IntsToBytes(Array As Int(msg.ExpirationDate / 1000)))
		Dim p As Byte
		If msg.HighPriority Then p = 10 Else p = 5
		WriteItem(FrameData,5, Array As Byte(p))
		Dim payload() As Byte = FrameData.ToBytesArray
		out.WriteBytes(Array As Byte(2), 0, 1)
		out.WriteBytes(bc.IntsToBytes(Array As Int(payload.Length)), 0, 4)
		out.WriteBytes(payload, 0, payload.Length)
	Next
	astream.Write(out.ToBytesArray)
End Sub

Private Sub WriteItem(out As OutputStream, id As Byte, data() As Byte)
	out.WriteBytes(Array As Byte(id), 0, 1)
	out.WriteBytes(bc.ShortsToBytes(Array As Short(data.Length)), 0, 2)
	out.WriteBytes(data, 0, data.Length)
End Sub

