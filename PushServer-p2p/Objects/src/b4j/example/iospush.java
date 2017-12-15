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
public String userID;
public String userName;
public void Initialize() {
IsInitialized = true;
Text = "";
Sound = false;
Badge = 0;
ExpirationDate = 0L;
HighPriority = false;
userID = "";
userName = "";
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
public static b4j.example.dbutils _dbutils = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.androidpush _androidpush = null;
public static String  _start() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "start"))
	return (String) Debug.delegate(ba, "start", null);
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Start";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="bc.LittleEndian = False";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="timer1.Initialize(\"timer1\", 3000) 'this timer is";
_timer1.Initialize(ba,"timer1",(long) (3000));
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Connect";
_connect();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public static String  _astream_error() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "astream_error"))
	return (String) Debug.delegate(ba, "astream_error", null);
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub astream_Error";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Log(\"error: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("error: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Reconnect";
_reconnect();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="End Sub";
return "";
}
public static String  _reconnect() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "reconnect"))
	return (String) Debug.delegate(ba, "reconnect", null);
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub Reconnect";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Log(\"Trying to reconnect...\")";
anywheresoftware.b4a.keywords.Common.Log("Trying to reconnect...");
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return "";
}
public static String  _astream_newdata(byte[] _buffer) throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "astream_newdata"))
	return (String) Debug.delegate(ba, "astream_newdata", new Object[] {_buffer});
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub astream_NewData (Buffer() As Byte)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="If Buffer.Length >=6 Then";
if (_buffer.length>=6) { 
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Log(\"status=\" & Buffer(1))";
anywheresoftware.b4a.keywords.Common.Log("status="+BA.NumberToString(_buffer[(int) (1)]));
 }else {
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Log(\"Invalid response\")";
anywheresoftware.b4a.keywords.Common.Log("Invalid response");
 };
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="End Sub";
return "";
}
public static String  _astream_terminated() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "astream_terminated"))
	return (String) Debug.delegate(ba, "astream_terminated", null);
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub astream_Terminated";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Log(\"terminated\")";
anywheresoftware.b4a.keywords.Common.Log("terminated");
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Reconnect";
_reconnect();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="End Sub";
return "";
}
public static String  _connect() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "connect"))
	return (String) Debug.delegate(ba, "connect", null);
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub Connect";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="If sock.IsInitialized Then sock.Close";
if (_sock.IsInitialized()) { 
_sock.Close();};
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Dim sock As Socket";
_sock = new anywheresoftware.b4a.objects.SocketWrapper();
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="sock.InitializeSSL(\"sock\", File.OpenInput(Main.co";
_sock.InitializeSSL("sock",(java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(BA.ObjectToString(_main._config.Get((Object)("iPushKeystore"))),"").getObject()),BA.ObjectToString(_main._config.Get((Object)("iPushKeystorePassword"))));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="sock.Connect(Main.config.Get(\"iGateway\"), Main.co";
_sock.Connect(ba,BA.ObjectToString(_main._config.Get((Object)("iGateway"))),(int)(BA.ObjectToNumber(_main._config.Get((Object)("iGateWayPort")))),(int) (30000));
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub SendMessageTo(Devices As List, msg As M";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Log(\">>> Send message to userID: \" & msg.userID";
anywheresoftware.b4a.keywords.Common.Log(">>> Send message to userID: "+_msg.userID+", userName: "+_msg.userName+", Badge: "+BA.NumberToString(_msg.Badge));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="For Each device As String In Devices";
{
final anywheresoftware.b4a.BA.IterableList group4 = _devices;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_device = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Dim FrameData As OutputStream";
_framedata = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="FrameData.InitializeToBytesArray(0)";
_framedata.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="WriteItem(FrameData, 1, bc.HexToBytes(device))";
_writeitem(_framedata,(byte) (1),_bc.HexToBytes(_device));
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Dim m As Map =  CreateMap(\"alert\": CreateMap(\"ti";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("alert"),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)("___TITLE___"),(Object)("body"),(Object)(_msg.Text)}).getObject()),(Object)("badge"),(Object)(_msg.Badge),(Object)("userid"),(Object)(_msg.userID),(Object)("username"),(Object)(_msg.userName)});
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="If msg.Sound Then m.Put(\"sound\", \"default\")";
if (_msg.Sound) { 
_m.Put((Object)("sound"),(Object)("default"));};
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="jg.Initialize(CreateMap(\"aps\":m))";
_jg.Initialize(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("aps"),(Object)(_m.getObject())}));
RDebugUtils.currentLine=2752530;
 //BA.debugLineNum = 2752530;BA.debugLine="WriteItem(FrameData,2, jg.ToString.GetBytes(\"UTF";
_writeitem(_framedata,(byte) (2),_jg.ToString().getBytes("UTF8"));
RDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="WriteItem(FrameData,3, bc.IntsToBytes(Array As I";
_writeitem(_framedata,(byte) (3),_bc.IntsToBytes(new int[]{anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (9999999))}));
RDebugUtils.currentLine=2752532;
 //BA.debugLineNum = 2752532;BA.debugLine="WriteItem(FrameData,4, bc.IntsToBytes(Array As I";
_writeitem(_framedata,(byte) (4),_bc.IntsToBytes(new int[]{(int) (_msg.ExpirationDate/(double)1000)}));
RDebugUtils.currentLine=2752533;
 //BA.debugLineNum = 2752533;BA.debugLine="Dim p As Byte";
_p = (byte)0;
RDebugUtils.currentLine=2752534;
 //BA.debugLineNum = 2752534;BA.debugLine="If msg.HighPriority Then p = 10 Else p = 5";
if (_msg.HighPriority) { 
_p = (byte) (10);}
else {
_p = (byte) (5);};
RDebugUtils.currentLine=2752535;
 //BA.debugLineNum = 2752535;BA.debugLine="WriteItem(FrameData,5, Array As Byte(p))";
_writeitem(_framedata,(byte) (5),new byte[]{_p});
RDebugUtils.currentLine=2752536;
 //BA.debugLineNum = 2752536;BA.debugLine="Dim payload() As Byte = FrameData.ToBytesArray";
_payload = _framedata.ToBytesArray();
RDebugUtils.currentLine=2752537;
 //BA.debugLineNum = 2752537;BA.debugLine="out.WriteBytes(Array As Byte(2), 0, 1)";
_out.WriteBytes(new byte[]{(byte) (2)},(int) (0),(int) (1));
RDebugUtils.currentLine=2752538;
 //BA.debugLineNum = 2752538;BA.debugLine="out.WriteBytes(bc.IntsToBytes(Array As Int(paylo";
_out.WriteBytes(_bc.IntsToBytes(new int[]{_payload.length}),(int) (0),(int) (4));
RDebugUtils.currentLine=2752539;
 //BA.debugLineNum = 2752539;BA.debugLine="out.WriteBytes(payload, 0, payload.Length)";
_out.WriteBytes(_payload,(int) (0),_payload.length);
 }
};
RDebugUtils.currentLine=2752541;
 //BA.debugLineNum = 2752541;BA.debugLine="astream.Write(out.ToBytesArray)";
_astream.Write(_out.ToBytesArray());
RDebugUtils.currentLine=2752542;
 //BA.debugLineNum = 2752542;BA.debugLine="End Sub";
return "";
}
public static String  _writeitem(anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out,byte _id,byte[] _data) throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "writeitem"))
	return (String) Debug.delegate(ba, "writeitem", new Object[] {_out,_id,_data});
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub WriteItem(out As OutputStream, id As B";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="out.WriteBytes(Array As Byte(id), 0, 1)";
_out.WriteBytes(new byte[]{_id},(int) (0),(int) (1));
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="out.WriteBytes(bc.ShortsToBytes(Array As Short(da";
_out.WriteBytes(_bc.ShortsToBytes(new short[]{(short) (_data.length)}),(int) (0),(int) (2));
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="out.WriteBytes(data, 0, data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="End Sub";
return "";
}
public static String  _sock_connected(boolean _successful) throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "sock_connected"))
	return (String) Debug.delegate(ba, "sock_connected", new Object[] {_successful});
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub sock_Connected (Successful As Boolean)";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If Successful Then";
if (_successful) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Log(\"Socket connected.\")";
anywheresoftware.b4a.keywords.Common.Log("Socket connected.");
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="If astream.IsInitialized Then astream.Close";
if (_astream.IsInitialized()) { 
_astream.Close();};
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="astream.Initialize(sock.InputStream, sock.Output";
_astream.Initialize(ba,_sock.getInputStream(),_sock.getOutputStream(),"astream");
 }else {
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Log(\"Error connecting socket: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("Error connecting socket: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Reconnect";
_reconnect();
 };
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="iospush";
if (Debug.shouldDelegate(ba, "timer1_tick"))
	return (String) Debug.delegate(ba, "timer1_tick", null);
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub Timer1_Tick";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Connect";
_connect();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="End Sub";
return "";
}
}