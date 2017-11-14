package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class iosfeedback extends Object{
public static iosfeedback mostCurrent = new iosfeedback();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.StandardBA("b4j.example", "b4j.example.iosfeedback", null);
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
public static String  _astream_error() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Private Sub AStream_Error";
 //BA.debugLineNum = 66;BA.debugLine="Log(\"Error: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _astream_newdata(byte[] _data) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Private Sub AStream_NewData (data() As Byte)";
 //BA.debugLineNum = 41;BA.debugLine="Log(\"Feedback data available\")";
anywheresoftware.b4a.keywords.Common.Log("Feedback data available");
 //BA.debugLineNum = 42;BA.debugLine="buffer.AddAll(data)";
_buffer.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(_data));
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public static String  _astream_terminated() throws Exception{
int _i = 0;
byte[] _date = null;
byte[] _token = null;
String _hextoken = "";
 //BA.debugLineNum = 45;BA.debugLine="Private Sub AStream_Terminated";
 //BA.debugLineNum = 46;BA.debugLine="Log(\"feedback terminated\")";
anywheresoftware.b4a.keywords.Common.Log("feedback terminated");
 //BA.debugLineNum = 47;BA.debugLine="For i = 0 To buffer.Size - 1 Step 38";
{
final int step2 = (int) (38);
final int limit2 = (int) (_buffer.getSize()-1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
 //BA.debugLineNum = 48;BA.debugLine="Dim date() As Byte = SubListToArray(i, 4)";
_date = _sublisttoarray(_i,(int) (4));
 //BA.debugLineNum = 49;BA.debugLine="Dim token() As Byte = SubListToArray(i + 6, 32)";
_token = _sublisttoarray((int) (_i+6),(int) (32));
 //BA.debugLineNum = 50;BA.debugLine="Log(bc.IntsFromBytes(date)(0))";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_bc.IntsFromBytes(_date)[(int) (0)]));
 //BA.debugLineNum = 51;BA.debugLine="Dim HexToken As String = bc.HexFromBytes(token)";
_hextoken = _bc.HexFromBytes(_token);
 //BA.debugLineNum = 52;BA.debugLine="Log($\"Deleting token ${HexToken}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Deleting token "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_hextoken))+""));
 //BA.debugLineNum = 53;BA.debugLine="Main.db.ExecNonQuery2(\"DELETE FROM tokens WHERE";
_main._db.ExecNonQuery2("DELETE FROM tokens WHERE token = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_hextoken)}));
 }
};
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static String  _connect() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Private Sub Connect";
 //BA.debugLineNum = 23;BA.debugLine="If sock.IsInitialized Then sock.Close";
if (_sock.IsInitialized()) { 
_sock.Close();};
 //BA.debugLineNum = 24;BA.debugLine="Dim sock As Socket";
_sock = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 25;BA.debugLine="sock.InitializeSSL(\"sock\", File.OpenInput(Main.co";
_sock.InitializeSSL("sock",(java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(BA.ObjectToString(_main._config.Get((Object)("iPushKeystore"))),"").getObject()),BA.ObjectToString(_main._config.Get((Object)("iPushKeystorePassword"))));
 //BA.debugLineNum = 26;BA.debugLine="sock.Connect(Main.config.Get(\"iFeedback\"), Main.c";
_sock.Connect(ba,BA.ObjectToString(_main._config.Get((Object)("iFeedback"))),(int)(BA.ObjectToNumber(_main._config.Get((Object)("iFeedbackPort")))),(int) (30000));
 //BA.debugLineNum = 27;BA.debugLine="buffer.Clear";
_buffer.Clear();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Private buffer As List";
_buffer = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _sock_connected(boolean _successful) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Private Sub sock_Connected (Successful As Boolean)";
 //BA.debugLineNum = 31;BA.debugLine="If Successful Then";
if (_successful) { 
 //BA.debugLineNum = 32;BA.debugLine="Log(\"Feedback Socket connected.\")";
anywheresoftware.b4a.keywords.Common.Log("Feedback Socket connected.");
 //BA.debugLineNum = 33;BA.debugLine="If astream.IsInitialized Then astream.Close";
if (_astream.IsInitialized()) { 
_astream.Close();};
 //BA.debugLineNum = 34;BA.debugLine="astream.Initialize(sock.InputStream, sock.Output";
_astream.Initialize(ba,_sock.getInputStream(),_sock.getOutputStream(),"astream");
 }else {
 //BA.debugLineNum = 36;BA.debugLine="Log(\"Error connecting feedback socket: \" & LastE";
anywheresoftware.b4a.keywords.Common.Log("Error connecting feedback socket: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public static String  _start() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Start";
 //BA.debugLineNum = 11;BA.debugLine="bc.LittleEndian = False";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 12;BA.debugLine="buffer.Initialize";
_buffer.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="timer1.Initialize(\"timer1\", 1 * DateTime.TicksPer";
_timer1.Initialize(ba,"timer1",(long) (1*anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour));
 //BA.debugLineNum = 14;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 15;BA.debugLine="Connect";
_connect();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public static byte[]  _sublisttoarray(int _st,int _len) throws Exception{
byte[] _data = null;
int _i = 0;
 //BA.debugLineNum = 57;BA.debugLine="Private Sub SubListToArray(st As Int, len As Int)";
 //BA.debugLineNum = 58;BA.debugLine="Dim data(len) As Byte";
_data = new byte[_len];
;
 //BA.debugLineNum = 59;BA.debugLine="For i = st To st + len - 1";
{
final int step2 = 1;
final int limit2 = (int) (_st+_len-1);
_i = _st ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
 //BA.debugLineNum = 60;BA.debugLine="data(i - st) = buffer.Get(i)";
_data[(int) (_i-_st)] = (byte)(BA.ObjectToNumber(_buffer.Get(_i)));
 }
};
 //BA.debugLineNum = 62;BA.debugLine="Return data";
if (true) return _data;
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public static String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 19;BA.debugLine="Connect";
_connect();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
}
