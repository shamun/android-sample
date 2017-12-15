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
public static b4j.example.dbutils _dbutils = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.androidpush _androidpush = null;
public static String  _start() throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "start"))
	return (String) Debug.delegate(ba, "start", null);
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub Start";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="bc.LittleEndian = False";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="buffer.Initialize";
_buffer.Initialize();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="timer1.Initialize(\"timer1\", 1 * DateTime.TicksPer";
_timer1.Initialize(ba,"timer1",(long) (1*anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Connect";
_connect();
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="End Sub";
return "";
}
public static String  _astream_error() throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "astream_error"))
	return (String) Debug.delegate(ba, "astream_error", null);
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub AStream_Error";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Log(\"Error: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _astream_newdata(byte[] _data) throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "astream_newdata"))
	return (String) Debug.delegate(ba, "astream_newdata", new Object[] {_data});
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub AStream_NewData (data() As Byte)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Log(\"Feedback data available\")";
anywheresoftware.b4a.keywords.Common.Log("Feedback data available");
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="buffer.AddAll(data)";
_buffer.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(_data));
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub AStream_Terminated";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Log(\"feedback terminated\")";
anywheresoftware.b4a.keywords.Common.Log("feedback terminated");
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="For i = 0 To buffer.Size - 1 Step 38";
{
final int step2 = (int) (38);
final int limit2 = (int) (_buffer.getSize()-1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Dim date() As Byte = SubListToArray(i, 4)";
_date = _sublisttoarray(_i,(int) (4));
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Dim token() As Byte = SubListToArray(i + 6, 32)";
_token = _sublisttoarray((int) (_i+6),(int) (32));
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Log(bc.IntsFromBytes(date)(0))";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_bc.IntsFromBytes(_date)[(int) (0)]));
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Dim HexToken As String = bc.HexFromBytes(token)";
_hextoken = _bc.HexFromBytes(_token);
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="Log($\"Deleting token ${HexToken}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Deleting token "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_hextoken))+""));
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Main.db.ExecNonQuery2(\"DELETE FROM tokens WHERE";
_main._db.ExecNonQuery2("DELETE FROM tokens WHERE token = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_hextoken)}));
 }
};
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="End Sub";
return "";
}
public static byte[]  _sublisttoarray(int _st,int _len) throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "sublisttoarray"))
	return (byte[]) Debug.delegate(ba, "sublisttoarray", new Object[] {_st,_len});
byte[] _data = null;
int _i = 0;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub SubListToArray(st As Int, len As Int)";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim data(len) As Byte";
_data = new byte[_len];
;
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="For i = st To st + len - 1";
{
final int step2 = 1;
final int limit2 = (int) (_st+_len-1);
_i = _st ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="data(i - st) = buffer.Get(i)";
_data[(int) (_i-_st)] = (byte)(BA.ObjectToNumber(_buffer.Get(_i)));
 }
};
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="End Sub";
return null;
}
public static String  _connect() throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "connect"))
	return (String) Debug.delegate(ba, "connect", null);
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub Connect";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="If sock.IsInitialized Then sock.Close";
if (_sock.IsInitialized()) { 
_sock.Close();};
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim sock As Socket";
_sock = new anywheresoftware.b4a.objects.SocketWrapper();
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="sock.InitializeSSL(\"sock\", File.OpenInput(Main.co";
_sock.InitializeSSL("sock",(java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(BA.ObjectToString(_main._config.Get((Object)("iPushKeystore"))),"").getObject()),BA.ObjectToString(_main._config.Get((Object)("iPushKeystorePassword"))));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="sock.Connect(Main.config.Get(\"iFeedback\"), Main.c";
_sock.Connect(ba,BA.ObjectToString(_main._config.Get((Object)("iFeedback"))),(int)(BA.ObjectToNumber(_main._config.Get((Object)("iFeedbackPort")))),(int) (30000));
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="buffer.Clear";
_buffer.Clear();
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="End Sub";
return "";
}
public static String  _sock_connected(boolean _successful) throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "sock_connected"))
	return (String) Debug.delegate(ba, "sock_connected", new Object[] {_successful});
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub sock_Connected (Successful As Boolean)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If Successful Then";
if (_successful) { 
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Log(\"Feedback Socket connected.\")";
anywheresoftware.b4a.keywords.Common.Log("Feedback Socket connected.");
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="If astream.IsInitialized Then astream.Close";
if (_astream.IsInitialized()) { 
_astream.Close();};
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="astream.Initialize(sock.InputStream, sock.Output";
_astream.Initialize(ba,_sock.getInputStream(),_sock.getOutputStream(),"astream");
 }else {
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Log(\"Error connecting feedback socket: \" & LastE";
anywheresoftware.b4a.keywords.Common.Log("Error connecting feedback socket: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="iosfeedback";
if (Debug.shouldDelegate(ba, "timer1_tick"))
	return (String) Debug.delegate(ba, "timer1_tick", null);
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Connect";
_connect();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
}