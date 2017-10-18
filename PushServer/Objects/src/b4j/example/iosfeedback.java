package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class iosfeedback extends Object{
public static iosfeedback mostCurrent = new iosfeedback();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.iosfeedback", null);
		ba.loadHtSubs(iosfeedback.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.iosfeedback", ba);
		}
	}
    public static Class<?> getObject() {
		return iosfeedback.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.SocketWrapper _sock = null;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astream = null;
public static anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static anywheresoftware.b4a.objects.collections.List _buffer = null;
public static b4j.example.main _main = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.androidpush _androidpush = null;
public static b4j.example.dbutils _dbutils = null;
public static String  _start() throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "start"))
	return (String) Debug.delegate(ba, "start", null);
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub Start";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="bc.LittleEndian = False";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="buffer.Initialize";
_buffer.Initialize();
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="timer1.Initialize(\"timer1\", 1 * DateTime.TicksPer";
_timer1.Initialize(ba,"timer1",(long) (1*anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour));
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Connect";
_connect();
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="End Sub";
return "";
}
public static String  _astream_error() throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "astream_error"))
	return (String) Debug.delegate(ba, "astream_error", null);
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub AStream_Error";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Log(\"Error: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _astream_newdata(byte[] _data) throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "astream_newdata"))
	return (String) Debug.delegate(ba, "astream_newdata", new Object[] {_data});
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub AStream_NewData (data() As Byte)";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Log(\"Feedback data available\")";
anywheresoftware.b4a.keywords.Common.Log("Feedback data available");
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="buffer.AddAll(data)";
_buffer.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(_data));
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="End Sub";
return "";
}
public static String  _astream_terminated() throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "astream_terminated"))
	return (String) Debug.delegate(ba, "astream_terminated", null);
int _i = 0;
byte[] _date = null;
byte[] _token = null;
String _hextoken = "";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub AStream_Terminated";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Log(\"feedback terminated\")";
anywheresoftware.b4a.keywords.Common.Log("feedback terminated");
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="For i = 0 To buffer.Size - 1 Step 38";
{
final int step2 = (int) (38);
final int limit2 = (int) (_buffer.getSize()-1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Dim date() As Byte = SubListToArray(i, 4)";
_date = _sublisttoarray(_i,(int) (4));
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Dim token() As Byte = SubListToArray(i + 6, 32)";
_token = _sublisttoarray((int) (_i+6),(int) (32));
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Log(bc.IntsFromBytes(date)(0))";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_bc.IntsFromBytes(_date)[(int) (0)]));
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Dim HexToken As String = bc.HexFromBytes(token)";
_hextoken = _bc.HexFromBytes(_token);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Log($\"Deleting token ${HexToken}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Deleting token "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_hextoken))+""));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Main.db.ExecNonQuery2(\"DELETE FROM tokens WHERE";
_main._db.ExecNonQuery2("DELETE FROM tokens WHERE token = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_hextoken)}));
 }
};
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="End Sub";
return "";
}
public static byte[]  _sublisttoarray(int _st,int _len) throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "sublisttoarray"))
	return (byte[]) Debug.delegate(ba, "sublisttoarray", new Object[] {_st,_len});
byte[] _data = null;
int _i = 0;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub SubListToArray(st As Int, len As Int)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim data(len) As Byte";
_data = new byte[_len];
;
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="For i = st To st + len - 1";
{
final int step2 = 1;
final int limit2 = (int) (_st+_len-1);
_i = _st ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="data(i - st) = buffer.Get(i)";
_data[(int) (_i-_st)] = (byte)(BA.ObjectToNumber(_buffer.Get(_i)));
 }
};
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="End Sub";
return null;
}
public static String  _connect() throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "connect"))
	return (String) Debug.delegate(ba, "connect", null);
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub Connect";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If sock.IsInitialized Then sock.Close";
if (_sock.IsInitialized()) { 
_sock.Close();};
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Dim sock As Socket";
_sock = new anywheresoftware.b4a.objects.SocketWrapper();
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="sock.InitializeSSL(\"sock\", File.OpenInput(Main.co";
_sock.InitializeSSL("sock",(java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(BA.ObjectToString(_main._config.Get((Object)("iPushKeystore"))),"").getObject()),BA.ObjectToString(_main._config.Get((Object)("iPushKeystorePassword"))));
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="sock.Connect(Main.config.Get(\"iFeedback\"), Main.c";
_sock.Connect(ba,BA.ObjectToString(_main._config.Get((Object)("iFeedback"))),(int)(BA.ObjectToNumber(_main._config.Get((Object)("iFeedbackPort")))),(int) (30000));
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="buffer.Clear";
_buffer.Clear();
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="End Sub";
return "";
}
public static String  _sock_connected(boolean _successful) throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "sock_connected"))
	return (String) Debug.delegate(ba, "sock_connected", new Object[] {_successful});
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub sock_Connected (Successful As Boolean)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="If Successful Then";
if (_successful) { 
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Log(\"Feedback Socket connected.\")";
anywheresoftware.b4a.keywords.Common.Log("Feedback Socket connected.");
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="If astream.IsInitialized Then astream.Close";
if (_astream.IsInitialized()) { 
_astream.Close();};
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="astream.Initialize(sock.InputStream, sock.Output";
_astream.Initialize(ba,_sock.getInputStream(),_sock.getOutputStream(),"astream");
 }else {
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Log(\"Error connecting feedback socket: \" & LastE";
anywheresoftware.b4a.keywords.Common.Log("Error connecting feedback socket: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "timer1_tick"))
	return (String) Debug.delegate(ba, "timer1_tick", null);
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Connect";
_connect();
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
}