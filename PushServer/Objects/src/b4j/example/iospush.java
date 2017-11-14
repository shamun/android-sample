package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class iospush extends Object{
public static iospush mostCurrent = new iospush();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.StandardBA("b4j.example", "b4j.example.iospush", null);
		ba.loadHtSubs(iospush.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.iospush", ba);
		}
	}
    public static Class<?> getObject() {
		return iospush.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.SocketWrapper _sock = null;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astream = null;
public static anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static b4j.example.main _main = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.androidpush _androidpush = null;
public static b4j.example.dbutils _dbutils = null;
public static class _message{
public boolean IsInitialized;
public String Text;
public boolean Sound;
public int Badge;
public long ExpirationDate;
public boolean HighPriority;
public void Initialize() {
IsInitialized = true;
Text = "";
Sound = false;
Badge = 0;
ExpirationDate = 0L;
HighPriority = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _astream_error() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Private Sub astream_Error";
 //BA.debugLineNum = 51;BA.debugLine="Log(\"error: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("error: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 52;BA.debugLine="Reconnect";
_reconnect();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static String  _astream_newdata(byte[] _buffer) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Private Sub astream_NewData (Buffer() As Byte)";
 //BA.debugLineNum = 44;BA.debugLine="If Buffer.Length >=6 Then";
if (_buffer.length>=6) { 
 //BA.debugLineNum = 45;BA.debugLine="Log(\"status=\" & Buffer(1))";
anywheresoftware.b4a.keywords.Common.Log("status="+BA.NumberToString(_buffer[(int) (1)]));
 }else {
 //BA.debugLineNum = 47;BA.debugLine="Log(\"Invalid response\")";
anywheresoftware.b4a.keywords.Common.Log("Invalid response");
 };
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public static String  _astream_terminated() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Private Sub astream_Terminated";
 //BA.debugLineNum = 55;BA.debugLine="Log(\"terminated\")";
anywheresoftware.b4a.keywords.Common.Log("terminated");
 //BA.debugLineNum = 56;BA.debugLine="Reconnect";
_reconnect();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public static String  _connect() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Private Sub Connect";
 //BA.debugLineNum = 17;BA.debugLine="If sock.IsInitialized Then sock.Close";
if (_sock.IsInitialized()) { 
_sock.Close();};
 //BA.debugLineNum = 18;BA.debugLine="Dim sock As Socket";
_sock = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 19;BA.debugLine="sock.InitializeSSL(\"sock\", File.OpenInput(Main.co";
_sock.InitializeSSL("sock",(java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(BA.ObjectToString(_main._config.Get((Object)("iPushKeystore"))),"").getObject()),BA.ObjectToString(_main._config.Get((Object)("iPushKeystorePassword"))));
 //BA.debugLineNum = 20;BA.debugLine="sock.Connect(Main.config.Get(\"iGateway\"), Main.co";
_sock.Connect(ba,BA.ObjectToString(_main._config.Get((Object)("iGateway"))),(int)(BA.ObjectToNumber(_main._config.Get((Object)("iGateWayPort")))),(int) (30000));
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private sock As Socket";
_sock = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private astream As AsyncStreams";
_astream = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 5;BA.debugLine="Private bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
 //BA.debugLineNum = 6;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 7;BA.debugLine="Type Message(Text As String, Sound As Boolean, Ba";
;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _reconnect() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Private Sub Reconnect";
 //BA.debugLineNum = 35;BA.debugLine="Log(\"Trying to reconnect...\")";
anywheresoftware.b4a.keywords.Common.Log("Trying to reconnect...");
 //BA.debugLineNum = 36;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static String  _sendmessageto(anywheresoftware.b4a.objects.collections.List _devices,b4j.example.iospush._message _msg) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
String _device = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _framedata = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jg = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
byte _p = (byte)0;
byte[] _payload = null;
 //BA.debugLineNum = 59;BA.debugLine="Public Sub SendMessageTo(Devices As List, msg As M";
 //BA.debugLineNum = 60;BA.debugLine="Log(\"send message to\")";
anywheresoftware.b4a.keywords.Common.Log("send message to");
 //BA.debugLineNum = 61;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 62;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
 //BA.debugLineNum = 63;BA.debugLine="For Each device As String In Devices";
{
final anywheresoftware.b4a.BA.IterableList group4 = _devices;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_device = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 64;BA.debugLine="Dim FrameData As OutputStream";
_framedata = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 65;BA.debugLine="FrameData.InitializeToBytesArray(0)";
_framedata.InitializeToBytesArray((int) (0));
 //BA.debugLineNum = 66;BA.debugLine="WriteItem(FrameData, 1, bc.HexToBytes(device))";
_writeitem(_framedata,(byte) (1),_bc.HexToBytes(_device));
 //BA.debugLineNum = 67;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 68;BA.debugLine="Dim m As Map =  CreateMap(\"alert\": CreateMap(\"ti";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("alert"),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("my title"),(Object)("body"),(Object)(_msg.Text)}).getObject()),(Object)("badge"),(Object)(_msg.Badge)});
 //BA.debugLineNum = 69;BA.debugLine="If msg.Sound Then m.Put(\"sound\", \"default\")";
if (_msg.Sound) { 
_m.Put((Object)("sound"),(Object)("default"));};
 //BA.debugLineNum = 70;BA.debugLine="jg.Initialize(CreateMap(\"aps\":m))";
_jg.Initialize(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("aps"),(Object)(_m.getObject())}));
 //BA.debugLineNum = 72;BA.debugLine="WriteItem(FrameData,2, jg.ToString.GetBytes(\"UTF";
_writeitem(_framedata,(byte) (2),_jg.ToString().getBytes("UTF8"));
 //BA.debugLineNum = 73;BA.debugLine="WriteItem(FrameData,3, bc.IntsToBytes(Array As I";
_writeitem(_framedata,(byte) (3),_bc.IntsToBytes(new int[]{anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (9999999))}));
 //BA.debugLineNum = 74;BA.debugLine="WriteItem(FrameData,4, bc.IntsToBytes(Array As I";
_writeitem(_framedata,(byte) (4),_bc.IntsToBytes(new int[]{(int) (_msg.ExpirationDate/(double)1000)}));
 //BA.debugLineNum = 75;BA.debugLine="Dim p As Byte";
_p = (byte)0;
 //BA.debugLineNum = 76;BA.debugLine="If msg.HighPriority Then p = 10 Else p = 5";
if (_msg.HighPriority) { 
_p = (byte) (10);}
else {
_p = (byte) (5);};
 //BA.debugLineNum = 77;BA.debugLine="WriteItem(FrameData,5, Array As Byte(p))";
_writeitem(_framedata,(byte) (5),new byte[]{_p});
 //BA.debugLineNum = 78;BA.debugLine="Dim payload() As Byte = FrameData.ToBytesArray";
_payload = _framedata.ToBytesArray();
 //BA.debugLineNum = 79;BA.debugLine="out.WriteBytes(Array As Byte(2), 0, 1)";
_out.WriteBytes(new byte[]{(byte) (2)},(int) (0),(int) (1));
 //BA.debugLineNum = 80;BA.debugLine="out.WriteBytes(bc.IntsToBytes(Array As Int(paylo";
_out.WriteBytes(_bc.IntsToBytes(new int[]{_payload.length}),(int) (0),(int) (4));
 //BA.debugLineNum = 81;BA.debugLine="out.WriteBytes(payload, 0, payload.Length)";
_out.WriteBytes(_payload,(int) (0),_payload.length);
 }
};
 //BA.debugLineNum = 83;BA.debugLine="astream.Write(out.ToBytesArray)";
_astream.Write(_out.ToBytesArray());
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public static String  _sock_connected(boolean _successful) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Private Sub sock_Connected (Successful As Boolean)";
 //BA.debugLineNum = 24;BA.debugLine="If Successful Then";
if (_successful) { 
 //BA.debugLineNum = 25;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 26;BA.debugLine="Log(\"Socket connected.\")";
anywheresoftware.b4a.keywords.Common.Log("Socket connected.");
 //BA.debugLineNum = 27;BA.debugLine="If astream.IsInitialized Then astream.Close";
if (_astream.IsInitialized()) { 
_astream.Close();};
 //BA.debugLineNum = 28;BA.debugLine="astream.Initialize(sock.InputStream, sock.Output";
_astream.Initialize(ba,_sock.getInputStream(),_sock.getOutputStream(),"astream");
 }else {
 //BA.debugLineNum = 30;BA.debugLine="Log(\"Error connecting socket: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("Error connecting socket: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 31;BA.debugLine="Reconnect";
_reconnect();
 };
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public static String  _start() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Start";
 //BA.debugLineNum = 11;BA.debugLine="bc.LittleEndian = False";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 12;BA.debugLine="timer1.Initialize(\"timer1\", 3000) 'this timer is";
_timer1.Initialize(ba,"timer1",(long) (3000));
 //BA.debugLineNum = 13;BA.debugLine="Connect";
_connect();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub Timer1_Tick";
 //BA.debugLineNum = 39;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 40;BA.debugLine="Connect";
_connect();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public static String  _writeitem(anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out,byte _id,byte[] _data) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Private Sub WriteItem(out As OutputStream, id As B";
 //BA.debugLineNum = 87;BA.debugLine="out.WriteBytes(Array As Byte(id), 0, 1)";
_out.WriteBytes(new byte[]{_id},(int) (0),(int) (1));
 //BA.debugLineNum = 88;BA.debugLine="out.WriteBytes(bc.ShortsToBytes(Array As Short(da";
_out.WriteBytes(_bc.ShortsToBytes(new short[]{(short) (_data.length)}),(int) (0),(int) (2));
 //BA.debugLineNum = 89;BA.debugLine="out.WriteBytes(data, 0, data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
}
