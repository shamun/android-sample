package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class iospush extends Object{
public static iospush mostCurrent = new iospush();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.iospush", null);
		ba.loadHtSubs(iospush.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.iospush", ba);
		}
	}
    public static Class<?> getObject() {
		return iospush.class;
	}

 
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
public static String  _start() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "start"))
	return (String) Debug.delegate(ba, "start", null);
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Start";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="bc.LittleEndian = False";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="timer1.Initialize(\"timer1\", 3000) 'this timer is";
_timer1.Initialize(ba,"timer1",(long) (3000));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Connect";
_connect();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return "";
}
public static String  _astream_error() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "astream_error"))
	return (String) Debug.delegate(ba, "astream_error", null);
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub astream_Error";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Log(\"error: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("error: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Reconnect";
_reconnect();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
return "";
}
public static String  _reconnect() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "reconnect"))
	return (String) Debug.delegate(ba, "reconnect", null);
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub Reconnect";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Log(\"Trying to reconnect...\")";
anywheresoftware.b4a.keywords.Common.Log("Trying to reconnect...");
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
return "";
}
public static String  _astream_newdata(byte[] _buffer) throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "astream_newdata"))
	return (String) Debug.delegate(ba, "astream_newdata", new Object[] {_buffer});
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub astream_NewData (Buffer() As Byte)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If Buffer.Length >=6 Then";
if (_buffer.length>=6) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Log(\"status=\" & Buffer(1))";
anywheresoftware.b4a.keywords.Common.Log("status="+BA.NumberToString(_buffer[(int) (1)]));
 }else {
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Log(\"Invalid response\")";
anywheresoftware.b4a.keywords.Common.Log("Invalid response");
 };
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="End Sub";
return "";
}
public static String  _astream_terminated() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "astream_terminated"))
	return (String) Debug.delegate(ba, "astream_terminated", null);
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub astream_Terminated";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Log(\"terminated\")";
anywheresoftware.b4a.keywords.Common.Log("terminated");
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Reconnect";
_reconnect();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="End Sub";
return "";
}
public static String  _connect() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "connect"))
	return (String) Debug.delegate(ba, "connect", null);
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub Connect";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="If sock.IsInitialized Then sock.Close";
if (_sock.IsInitialized()) { 
_sock.Close();};
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Dim sock As Socket";
_sock = new anywheresoftware.b4a.objects.SocketWrapper();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="sock.InitializeSSL(\"sock\", File.OpenInput(Main.co";
_sock.InitializeSSL("sock",(java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(BA.ObjectToString(_main._config.Get((Object)("iPushKeystore"))),"").getObject()),BA.ObjectToString(_main._config.Get((Object)("iPushKeystorePassword"))));
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="sock.Connect(Main.config.Get(\"iGateway\"), Main.co";
_sock.Connect(ba,BA.ObjectToString(_main._config.Get((Object)("iGateway"))),(int)(BA.ObjectToNumber(_main._config.Get((Object)("iGateWayPort")))),(int) (30000));
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="End Sub";
return "";
}
public static String  _sendmessageto(anywheresoftware.b4a.objects.collections.List _devices,b4j.example.iospush._message _msg) throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "sendmessageto"))
	return (String) Debug.delegate(ba, "sendmessageto", new Object[] {_devices,_msg});
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
String _device = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _framedata = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jg = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
byte _p = (byte)0;
byte[] _payload = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub SendMessageTo(Devices As List, msg As M";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Log(\"send message to\")";
anywheresoftware.b4a.keywords.Common.Log("send message to");
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="For Each device As String In Devices";
{
final anywheresoftware.b4a.BA.IterableList group4 = _devices;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_device = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Dim FrameData As OutputStream";
_framedata = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="FrameData.InitializeToBytesArray(0)";
_framedata.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="WriteItem(FrameData, 1, bc.HexToBytes(device))";
_writeitem(_framedata,(byte) (1),_bc.HexToBytes(_device));
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Dim m As Map =  CreateMap(\"alert\": CreateMap(\"ti";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("alert"),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("my title"),(Object)("body"),(Object)(_msg.Text)}).getObject()),(Object)("badge"),(Object)(_msg.Badge)});
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="If msg.Sound Then m.Put(\"sound\", \"default\")";
if (_msg.Sound) { 
_m.Put((Object)("sound"),(Object)("default"));};
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="jg.Initialize(CreateMap(\"aps\":m))";
_jg.Initialize(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("aps"),(Object)(_m.getObject())}));
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="WriteItem(FrameData,2, jg.ToString.GetBytes(\"UTF";
_writeitem(_framedata,(byte) (2),_jg.ToString().getBytes("UTF8"));
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="WriteItem(FrameData,3, bc.IntsToBytes(Array As I";
_writeitem(_framedata,(byte) (3),_bc.IntsToBytes(new int[]{anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (9999999))}));
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="WriteItem(FrameData,4, bc.IntsToBytes(Array As I";
_writeitem(_framedata,(byte) (4),_bc.IntsToBytes(new int[]{(int) (_msg.ExpirationDate/(double)1000)}));
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="Dim p As Byte";
_p = (byte)0;
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="If msg.HighPriority Then p = 10 Else p = 5";
if (_msg.HighPriority) { 
_p = (byte) (10);}
else {
_p = (byte) (5);};
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="WriteItem(FrameData,5, Array As Byte(p))";
_writeitem(_framedata,(byte) (5),new byte[]{_p});
RDebugUtils.currentLine=1376275;
 //BA.debugLineNum = 1376275;BA.debugLine="Dim payload() As Byte = FrameData.ToBytesArray";
_payload = _framedata.ToBytesArray();
RDebugUtils.currentLine=1376276;
 //BA.debugLineNum = 1376276;BA.debugLine="out.WriteBytes(Array As Byte(2), 0, 1)";
_out.WriteBytes(new byte[]{(byte) (2)},(int) (0),(int) (1));
RDebugUtils.currentLine=1376277;
 //BA.debugLineNum = 1376277;BA.debugLine="out.WriteBytes(bc.IntsToBytes(Array As Int(paylo";
_out.WriteBytes(_bc.IntsToBytes(new int[]{_payload.length}),(int) (0),(int) (4));
RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="out.WriteBytes(payload, 0, payload.Length)";
_out.WriteBytes(_payload,(int) (0),_payload.length);
 }
};
RDebugUtils.currentLine=1376280;
 //BA.debugLineNum = 1376280;BA.debugLine="astream.Write(out.ToBytesArray)";
_astream.Write(_out.ToBytesArray());
RDebugUtils.currentLine=1376281;
 //BA.debugLineNum = 1376281;BA.debugLine="End Sub";
return "";
}
public static String  _writeitem(anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out,byte _id,byte[] _data) throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "writeitem"))
	return (String) Debug.delegate(ba, "writeitem", new Object[] {_out,_id,_data});
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub WriteItem(out As OutputStream, id As B";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="out.WriteBytes(Array As Byte(id), 0, 1)";
_out.WriteBytes(new byte[]{_id},(int) (0),(int) (1));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="out.WriteBytes(bc.ShortsToBytes(Array As Short(da";
_out.WriteBytes(_bc.ShortsToBytes(new short[]{(short) (_data.length)}),(int) (0),(int) (2));
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="out.WriteBytes(data, 0, data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="End Sub";
return "";
}
public static String  _sock_connected(boolean _successful) throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "sock_connected"))
	return (String) Debug.delegate(ba, "sock_connected", new Object[] {_successful});
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub sock_Connected (Successful As Boolean)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="If Successful Then";
if (_successful) { 
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Log(\"Socket connected.\")";
anywheresoftware.b4a.keywords.Common.Log("Socket connected.");
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="If astream.IsInitialized Then astream.Close";
if (_astream.IsInitialized()) { 
_astream.Close();};
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="astream.Initialize(sock.InputStream, sock.Output";
_astream.Initialize(ba,_sock.getInputStream(),_sock.getOutputStream(),"astream");
 }else {
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Log(\"Error connecting socket: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("Error connecting socket: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Reconnect";
_reconnect();
 };
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "timer1_tick"))
	return (String) Debug.delegate(ba, "timer1_tick", null);
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub Timer1_Tick";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Connect";
_connect();
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return "";
}
}