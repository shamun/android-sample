package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class iosfeedback_subs_0 {


public static RemoteObject  _astream_error() throws Exception{
try {
		Debug.PushSubsStack("AStream_Error (iosfeedback) ","iosfeedback",4,iosfeedback.ba,iosfeedback.mostCurrent,65);
if (RapidSub.canDelegate("astream_error")) return b4j.example.iosfeedback.remoteMe.runUserSub(false, "iosfeedback","astream_error");
 BA.debugLineNum = 65;BA.debugLine="Private Sub AStream_Error";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Log(\"Error: \" & LastException)";
Debug.ShouldStop(2);
iosfeedback.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),iosfeedback.__c.runMethod(false,"LastException",iosfeedback.ba))));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _astream_newdata(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("AStream_NewData (iosfeedback) ","iosfeedback",4,iosfeedback.ba,iosfeedback.mostCurrent,40);
if (RapidSub.canDelegate("astream_newdata")) return b4j.example.iosfeedback.remoteMe.runUserSub(false, "iosfeedback","astream_newdata", _data);
Debug.locals.put("data", _data);
 BA.debugLineNum = 40;BA.debugLine="Private Sub AStream_NewData (data() As Byte)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Log(\"Feedback data available\")";
Debug.ShouldStop(256);
iosfeedback.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Feedback data available")));
 BA.debugLineNum = 42;BA.debugLine="buffer.AddAll(data)";
Debug.ShouldStop(512);
iosfeedback._buffer.runVoidMethod ("AddAll",(Object)(iosfeedback.__c.runMethod(false, "ArrayToList", (Object)(_data))));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _astream_terminated() throws Exception{
try {
		Debug.PushSubsStack("AStream_Terminated (iosfeedback) ","iosfeedback",4,iosfeedback.ba,iosfeedback.mostCurrent,45);
if (RapidSub.canDelegate("astream_terminated")) return b4j.example.iosfeedback.remoteMe.runUserSub(false, "iosfeedback","astream_terminated");
int _i = 0;
RemoteObject _date = null;
RemoteObject _token = null;
RemoteObject _hextoken = RemoteObject.createImmutable("");
 BA.debugLineNum = 45;BA.debugLine="Private Sub AStream_Terminated";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Log(\"feedback terminated\")";
Debug.ShouldStop(8192);
iosfeedback.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("feedback terminated")));
 BA.debugLineNum = 47;BA.debugLine="For i = 0 To buffer.Size - 1 Step 38";
Debug.ShouldStop(16384);
{
final int step2 = 38;
final int limit2 = RemoteObject.solve(new RemoteObject[] {iosfeedback._buffer.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 48;BA.debugLine="Dim date() As Byte = SubListToArray(i, 4)";
Debug.ShouldStop(32768);
_date = _sublisttoarray(BA.numberCast(int.class, _i),BA.numberCast(int.class, 4));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 49;BA.debugLine="Dim token() As Byte = SubListToArray(i + 6, 32)";
Debug.ShouldStop(65536);
_token = _sublisttoarray(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(6)}, "+",1, 1),BA.numberCast(int.class, 32));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 BA.debugLineNum = 50;BA.debugLine="Log(bc.IntsFromBytes(date)(0))";
Debug.ShouldStop(131072);
iosfeedback.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(iosfeedback._bc.runMethod(false,"IntsFromBytes",(Object)(_date)).getArrayElement(true,BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 51;BA.debugLine="Dim HexToken As String = bc.HexFromBytes(token)";
Debug.ShouldStop(262144);
_hextoken = iosfeedback._bc.runMethod(true,"HexFromBytes",(Object)(_token));Debug.locals.put("HexToken", _hextoken);Debug.locals.put("HexToken", _hextoken);
 BA.debugLineNum = 52;BA.debugLine="Log($\"Deleting token ${HexToken}\"$)";
Debug.ShouldStop(524288);
iosfeedback.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Deleting token "),iosfeedback.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_hextoken))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 53;BA.debugLine="Main.db.ExecNonQuery2(\"DELETE FROM tokens WHERE";
Debug.ShouldStop(1048576);
iosfeedback._main._db.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM tokens WHERE token = ?")),(Object)(iosfeedback.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_hextoken)})))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _connect() throws Exception{
try {
		Debug.PushSubsStack("Connect (iosfeedback) ","iosfeedback",4,iosfeedback.ba,iosfeedback.mostCurrent,22);
if (RapidSub.canDelegate("connect")) return b4j.example.iosfeedback.remoteMe.runUserSub(false, "iosfeedback","connect");
 BA.debugLineNum = 22;BA.debugLine="Private Sub Connect";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="If sock.IsInitialized Then sock.Close";
Debug.ShouldStop(4194304);
if (iosfeedback._sock.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
iosfeedback._sock.runVoidMethod ("Close");};
 BA.debugLineNum = 24;BA.debugLine="Dim sock As Socket";
Debug.ShouldStop(8388608);
iosfeedback._sock = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper");
 BA.debugLineNum = 25;BA.debugLine="sock.InitializeSSL(\"sock\", File.OpenInput(Main.co";
Debug.ShouldStop(16777216);
iosfeedback._sock.runVoidMethod ("InitializeSSL",(Object)(BA.ObjectToString("sock")),(Object)((iosfeedback.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(BA.ObjectToString(iosfeedback._main._config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iPushKeystore")))))),(Object)(RemoteObject.createImmutable(""))).getObject())),(Object)(BA.ObjectToString(iosfeedback._main._config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iPushKeystorePassword")))))));
 BA.debugLineNum = 26;BA.debugLine="sock.Connect(Main.config.Get(\"iFeedback\"), Main.c";
Debug.ShouldStop(33554432);
iosfeedback._sock.runVoidMethod ("Connect",iosfeedback.ba,(Object)(BA.ObjectToString(iosfeedback._main._config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iFeedback")))))),(Object)(BA.numberCast(int.class, iosfeedback._main._config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iFeedbackPort")))))),(Object)(BA.numberCast(int.class, 30000)));
 BA.debugLineNum = 27;BA.debugLine="buffer.Clear";
Debug.ShouldStop(67108864);
iosfeedback._buffer.runVoidMethod ("Clear");
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private sock As Socket";
iosfeedback._sock = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper");
 //BA.debugLineNum = 4;BA.debugLine="Private astream As AsyncStreams";
iosfeedback._astream = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
 //BA.debugLineNum = 5;BA.debugLine="Private bc As ByteConverter";
iosfeedback._bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 //BA.debugLineNum = 6;BA.debugLine="Private timer1 As Timer";
iosfeedback._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 7;BA.debugLine="Private buffer As List";
iosfeedback._buffer = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sock_connected(RemoteObject _successful) throws Exception{
try {
		Debug.PushSubsStack("sock_Connected (iosfeedback) ","iosfeedback",4,iosfeedback.ba,iosfeedback.mostCurrent,30);
if (RapidSub.canDelegate("sock_connected")) return b4j.example.iosfeedback.remoteMe.runUserSub(false, "iosfeedback","sock_connected", _successful);
Debug.locals.put("Successful", _successful);
 BA.debugLineNum = 30;BA.debugLine="Private Sub sock_Connected (Successful As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="If Successful Then";
Debug.ShouldStop(1073741824);
if (_successful.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 32;BA.debugLine="Log(\"Feedback Socket connected.\")";
Debug.ShouldStop(-2147483648);
iosfeedback.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Feedback Socket connected.")));
 BA.debugLineNum = 33;BA.debugLine="If astream.IsInitialized Then astream.Close";
Debug.ShouldStop(1);
if (iosfeedback._astream.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
iosfeedback._astream.runVoidMethod ("Close");};
 BA.debugLineNum = 34;BA.debugLine="astream.Initialize(sock.InputStream, sock.Output";
Debug.ShouldStop(2);
iosfeedback._astream.runVoidMethod ("Initialize",iosfeedback.ba,(Object)(iosfeedback._sock.runMethod(false,"getInputStream")),(Object)(iosfeedback._sock.runMethod(false,"getOutputStream")),(Object)(RemoteObject.createImmutable("astream")));
 }else {
 BA.debugLineNum = 36;BA.debugLine="Log(\"Error connecting feedback socket: \" & LastE";
Debug.ShouldStop(8);
iosfeedback.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error connecting feedback socket: "),iosfeedback.__c.runMethod(false,"LastException",iosfeedback.ba))));
 };
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start() throws Exception{
try {
		Debug.PushSubsStack("Start (iosfeedback) ","iosfeedback",4,iosfeedback.ba,iosfeedback.mostCurrent,10);
if (RapidSub.canDelegate("start")) return b4j.example.iosfeedback.remoteMe.runUserSub(false, "iosfeedback","start");
 BA.debugLineNum = 10;BA.debugLine="Public Sub Start";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="bc.LittleEndian = False";
Debug.ShouldStop(1024);
iosfeedback._bc.runMethod(true,"setLittleEndian",iosfeedback.__c.getField(true,"False"));
 BA.debugLineNum = 12;BA.debugLine="buffer.Initialize";
Debug.ShouldStop(2048);
iosfeedback._buffer.runVoidMethod ("Initialize");
 BA.debugLineNum = 13;BA.debugLine="timer1.Initialize(\"timer1\", 1 * DateTime.TicksPer";
Debug.ShouldStop(4096);
iosfeedback._timer1.runVoidMethod ("Initialize",iosfeedback.ba,(Object)(BA.ObjectToString("timer1")),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),iosfeedback.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "*",0, 2)));
 BA.debugLineNum = 14;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(8192);
iosfeedback._timer1.runMethod(true,"setEnabled",iosfeedback.__c.getField(true,"True"));
 BA.debugLineNum = 15;BA.debugLine="Connect";
Debug.ShouldStop(16384);
_connect();
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sublisttoarray(RemoteObject _st,RemoteObject _len) throws Exception{
try {
		Debug.PushSubsStack("SubListToArray (iosfeedback) ","iosfeedback",4,iosfeedback.ba,iosfeedback.mostCurrent,57);
if (RapidSub.canDelegate("sublisttoarray")) return b4j.example.iosfeedback.remoteMe.runUserSub(false, "iosfeedback","sublisttoarray", _st, _len);
RemoteObject _data = null;
int _i = 0;
Debug.locals.put("st", _st);
Debug.locals.put("len", _len);
 BA.debugLineNum = 57;BA.debugLine="Private Sub SubListToArray(st As Int, len As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim data(len) As Byte";
Debug.ShouldStop(33554432);
_data = RemoteObject.createNewArray ("byte", new int[] {_len.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("data", _data);
 BA.debugLineNum = 59;BA.debugLine="For i = st To st + len - 1";
Debug.ShouldStop(67108864);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_st,_len,RemoteObject.createImmutable(1)}, "+-",2, 1).<Integer>get().intValue();
_i = _st.<Integer>get().intValue() ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="data(i - st) = buffer.Get(i)";
Debug.ShouldStop(134217728);
_data.setArrayElement (BA.numberCast(byte.class, iosfeedback._buffer.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_st}, "-",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 62;BA.debugLine="Return data";
Debug.ShouldStop(536870912);
if (true) return _data;
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (iosfeedback) ","iosfeedback",4,iosfeedback.ba,iosfeedback.mostCurrent,18);
if (RapidSub.canDelegate("timer1_tick")) return b4j.example.iosfeedback.remoteMe.runUserSub(false, "iosfeedback","timer1_tick");
 BA.debugLineNum = 18;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Connect";
Debug.ShouldStop(262144);
_connect();
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}