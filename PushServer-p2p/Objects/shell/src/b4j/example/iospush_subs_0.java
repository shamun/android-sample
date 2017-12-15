package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class iospush_subs_0 {


public static RemoteObject  _astream_error() throws Exception{
try {
		Debug.PushSubsStack("astream_Error (iospush) ","iospush",5,iospush.ba,iospush.mostCurrent,54);
if (RapidSub.canDelegate("astream_error")) return b4j.example.iospush.remoteMe.runUserSub(false, "iospush","astream_error");
 BA.debugLineNum = 54;BA.debugLine="Private Sub astream_Error";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Log(\"error: \" & LastException)";
Debug.ShouldStop(4194304);
iospush.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("error: "),iospush.__c.runMethod(false,"LastException",iospush.ba))));
 BA.debugLineNum = 56;BA.debugLine="Reconnect";
Debug.ShouldStop(8388608);
_reconnect();
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _astream_newdata(RemoteObject _buffer) throws Exception{
try {
		Debug.PushSubsStack("astream_NewData (iospush) ","iospush",5,iospush.ba,iospush.mostCurrent,47);
if (RapidSub.canDelegate("astream_newdata")) return b4j.example.iospush.remoteMe.runUserSub(false, "iospush","astream_newdata", _buffer);
Debug.locals.put("Buffer", _buffer);
 BA.debugLineNum = 47;BA.debugLine="Private Sub astream_NewData (Buffer() As Byte)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="If Buffer.Length >=6 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("g",_buffer.getField(true,"length"),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 49;BA.debugLine="Log(\"status=\" & Buffer(1))";
Debug.ShouldStop(65536);
iospush.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("status="),_buffer.getArrayElement(true,BA.numberCast(int.class, 1)))));
 }else {
 BA.debugLineNum = 51;BA.debugLine="Log(\"Invalid response\")";
Debug.ShouldStop(262144);
iospush.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Invalid response")));
 };
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("astream_Terminated (iospush) ","iospush",5,iospush.ba,iospush.mostCurrent,58);
if (RapidSub.canDelegate("astream_terminated")) return b4j.example.iospush.remoteMe.runUserSub(false, "iospush","astream_terminated");
 BA.debugLineNum = 58;BA.debugLine="Private Sub astream_Terminated";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Log(\"terminated\")";
Debug.ShouldStop(67108864);
iospush.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("terminated")));
 BA.debugLineNum = 60;BA.debugLine="Reconnect";
Debug.ShouldStop(134217728);
_reconnect();
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Connect (iospush) ","iospush",5,iospush.ba,iospush.mostCurrent,20);
if (RapidSub.canDelegate("connect")) return b4j.example.iospush.remoteMe.runUserSub(false, "iospush","connect");
 BA.debugLineNum = 20;BA.debugLine="Private Sub Connect";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="If sock.IsInitialized Then sock.Close";
Debug.ShouldStop(1048576);
if (iospush._sock.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
iospush._sock.runVoidMethod ("Close");};
 BA.debugLineNum = 22;BA.debugLine="Dim sock As Socket";
Debug.ShouldStop(2097152);
iospush._sock = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper");
 BA.debugLineNum = 23;BA.debugLine="sock.InitializeSSL(\"sock\", File.OpenInput(Main.co";
Debug.ShouldStop(4194304);
iospush._sock.runVoidMethod ("InitializeSSL",(Object)(BA.ObjectToString("sock")),(Object)((iospush.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(BA.ObjectToString(iospush._main._config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iPushKeystore")))))),(Object)(RemoteObject.createImmutable(""))).getObject())),(Object)(BA.ObjectToString(iospush._main._config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iPushKeystorePassword")))))));
 BA.debugLineNum = 24;BA.debugLine="sock.Connect(Main.config.Get(\"iGateway\"), Main.co";
Debug.ShouldStop(8388608);
iospush._sock.runVoidMethod ("Connect",iospush.ba,(Object)(BA.ObjectToString(iospush._main._config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iGateway")))))),(Object)(BA.numberCast(int.class, iospush._main._config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iGateWayPort")))))),(Object)(BA.numberCast(int.class, 30000)));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
iospush._sock = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper");
 //BA.debugLineNum = 4;BA.debugLine="Private astream As AsyncStreams";
iospush._astream = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
 //BA.debugLineNum = 5;BA.debugLine="Private bc As ByteConverter";
iospush._bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 //BA.debugLineNum = 6;BA.debugLine="Private timer1 As Timer";
iospush._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 7;BA.debugLine="Type Message(Text As String, Sound As Boolean, Ba";
;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _reconnect() throws Exception{
try {
		Debug.PushSubsStack("Reconnect (iospush) ","iospush",5,iospush.ba,iospush.mostCurrent,38);
if (RapidSub.canDelegate("reconnect")) return b4j.example.iospush.remoteMe.runUserSub(false, "iospush","reconnect");
 BA.debugLineNum = 38;BA.debugLine="Private Sub Reconnect";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Log(\"Trying to reconnect...\")";
Debug.ShouldStop(64);
iospush.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Trying to reconnect...")));
 BA.debugLineNum = 40;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(128);
iospush._timer1.runMethod(true,"setEnabled",iospush.__c.getField(true,"True"));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendmessageto(RemoteObject _devices,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("SendMessageTo (iospush) ","iospush",5,iospush.ba,iospush.mostCurrent,63);
if (RapidSub.canDelegate("sendmessageto")) return b4j.example.iospush.remoteMe.runUserSub(false, "iospush","sendmessageto", _devices, _msg);
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _device = RemoteObject.createImmutable("");
RemoteObject _framedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.createImmutable((byte)0);
RemoteObject _payload = null;
Debug.locals.put("Devices", _devices);
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 63;BA.debugLine="Public Sub SendMessageTo(Devices As List, msg As M";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Log(\">>> Send message to userID: \" & msg.userID";
Debug.ShouldStop(-2147483648);
iospush.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(">>> Send message to userID: "),_msg.getField(true,"userID"),RemoteObject.createImmutable(", userName: "),_msg.getField(true,"userName"),RemoteObject.createImmutable(", Badge: "),_msg.getField(true,"Badge"))));
 BA.debugLineNum = 66;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(2);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 67;BA.debugLine="out.InitializeToBytesArray(0)";
Debug.ShouldStop(4);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 68;BA.debugLine="For Each device As String In Devices";
Debug.ShouldStop(8);
{
final RemoteObject group4 = _devices;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_device = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("device", _device);
Debug.locals.put("device", _device);
 BA.debugLineNum = 69;BA.debugLine="Dim FrameData As OutputStream";
Debug.ShouldStop(16);
_framedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("FrameData", _framedata);
 BA.debugLineNum = 70;BA.debugLine="FrameData.InitializeToBytesArray(0)";
Debug.ShouldStop(32);
_framedata.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 71;BA.debugLine="WriteItem(FrameData, 1, bc.HexToBytes(device))";
Debug.ShouldStop(64);
_writeitem(_framedata,BA.numberCast(byte.class, 1),iospush._bc.runMethod(false,"HexToBytes",(Object)(_device)));
 BA.debugLineNum = 72;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(128);
_jg = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 74;BA.debugLine="Dim m As Map =  CreateMap(\"alert\": CreateMap(\"ti";
Debug.ShouldStop(512);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = iospush.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("alert")),(iospush.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),RemoteObject.createImmutable(("___TITLE___")),RemoteObject.createImmutable(("body")),(_msg.getField(true,"Text"))})).getObject()),RemoteObject.createImmutable(("badge")),(_msg.getField(true,"Badge")),RemoteObject.createImmutable(("userid")),(_msg.getField(true,"userID")),RemoteObject.createImmutable(("username")),(_msg.getField(true,"userName"))}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 78;BA.debugLine="If msg.Sound Then m.Put(\"sound\", \"default\")";
Debug.ShouldStop(8192);
if (_msg.getField(true,"Sound").<Boolean>get().booleanValue()) { 
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sound"))),(Object)((RemoteObject.createImmutable("default"))));};
 BA.debugLineNum = 79;BA.debugLine="jg.Initialize(CreateMap(\"aps\":m))";
Debug.ShouldStop(16384);
_jg.runVoidMethod ("Initialize",(Object)(iospush.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("aps")),(_m.getObject())}))));
 BA.debugLineNum = 81;BA.debugLine="WriteItem(FrameData,2, jg.ToString.GetBytes(\"UTF";
Debug.ShouldStop(65536);
_writeitem(_framedata,BA.numberCast(byte.class, 2),_jg.runMethod(true,"ToString").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8"))));
 BA.debugLineNum = 82;BA.debugLine="WriteItem(FrameData,3, bc.IntsToBytes(Array As I";
Debug.ShouldStop(131072);
_writeitem(_framedata,BA.numberCast(byte.class, 3),iospush._bc.runMethod(false,"IntsToBytes",(Object)(RemoteObject.createNewArray("int",new int[] {1},new Object[] {iospush.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 9999999)))}))));
 BA.debugLineNum = 83;BA.debugLine="WriteItem(FrameData,4, bc.IntsToBytes(Array As I";
Debug.ShouldStop(262144);
_writeitem(_framedata,BA.numberCast(byte.class, 4),iospush._bc.runMethod(false,"IntsToBytes",(Object)(RemoteObject.createNewArray("int",new int[] {1},new Object[] {BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_msg.getField(true,"ExpirationDate"),RemoteObject.createImmutable(1000)}, "/",0, 0))}))));
 BA.debugLineNum = 84;BA.debugLine="Dim p As Byte";
Debug.ShouldStop(524288);
_p = RemoteObject.createImmutable((byte)0);Debug.locals.put("p", _p);
 BA.debugLineNum = 85;BA.debugLine="If msg.HighPriority Then p = 10 Else p = 5";
Debug.ShouldStop(1048576);
if (_msg.getField(true,"HighPriority").<Boolean>get().booleanValue()) { 
_p = BA.numberCast(byte.class, 10);Debug.locals.put("p", _p);}
else {
_p = BA.numberCast(byte.class, 5);Debug.locals.put("p", _p);};
 BA.debugLineNum = 86;BA.debugLine="WriteItem(FrameData,5, Array As Byte(p))";
Debug.ShouldStop(2097152);
_writeitem(_framedata,BA.numberCast(byte.class, 5),RemoteObject.createNewArray("byte",new int[] {1},new Object[] {_p}));
 BA.debugLineNum = 87;BA.debugLine="Dim payload() As Byte = FrameData.ToBytesArray";
Debug.ShouldStop(4194304);
_payload = _framedata.runMethod(false,"ToBytesArray");Debug.locals.put("payload", _payload);Debug.locals.put("payload", _payload);
 BA.debugLineNum = 88;BA.debugLine="out.WriteBytes(Array As Byte(2), 0, 1)";
Debug.ShouldStop(8388608);
_out.runVoidMethod ("WriteBytes",(Object)(RemoteObject.createNewArray("byte",new int[] {1},new Object[] {BA.numberCast(byte.class, 2)})),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 89;BA.debugLine="out.WriteBytes(bc.IntsToBytes(Array As Int(paylo";
Debug.ShouldStop(16777216);
_out.runVoidMethod ("WriteBytes",(Object)(iospush._bc.runMethod(false,"IntsToBytes",(Object)(RemoteObject.createNewArray("int",new int[] {1},new Object[] {_payload.getField(true,"length")})))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4)));
 BA.debugLineNum = 90;BA.debugLine="out.WriteBytes(payload, 0, payload.Length)";
Debug.ShouldStop(33554432);
_out.runVoidMethod ("WriteBytes",(Object)(_payload),(Object)(BA.numberCast(int.class, 0)),(Object)(_payload.getField(true,"length")));
 }
}Debug.locals.put("device", _device);
;
 BA.debugLineNum = 92;BA.debugLine="astream.Write(out.ToBytesArray)";
Debug.ShouldStop(134217728);
iospush._astream.runVoidMethod ("Write",(Object)(_out.runMethod(false,"ToBytesArray")));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sock_connected(RemoteObject _successful) throws Exception{
try {
		Debug.PushSubsStack("sock_Connected (iospush) ","iospush",5,iospush.ba,iospush.mostCurrent,27);
if (RapidSub.canDelegate("sock_connected")) return b4j.example.iospush.remoteMe.runUserSub(false, "iospush","sock_connected", _successful);
Debug.locals.put("Successful", _successful);
 BA.debugLineNum = 27;BA.debugLine="Private Sub sock_Connected (Successful As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="If Successful Then";
Debug.ShouldStop(134217728);
if (_successful.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 29;BA.debugLine="timer1.Enabled = False";
Debug.ShouldStop(268435456);
iospush._timer1.runMethod(true,"setEnabled",iospush.__c.getField(true,"False"));
 BA.debugLineNum = 30;BA.debugLine="Log(\"Socket connected.\")";
Debug.ShouldStop(536870912);
iospush.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Socket connected.")));
 BA.debugLineNum = 31;BA.debugLine="If astream.IsInitialized Then astream.Close";
Debug.ShouldStop(1073741824);
if (iospush._astream.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
iospush._astream.runVoidMethod ("Close");};
 BA.debugLineNum = 32;BA.debugLine="astream.Initialize(sock.InputStream, sock.Output";
Debug.ShouldStop(-2147483648);
iospush._astream.runVoidMethod ("Initialize",iospush.ba,(Object)(iospush._sock.runMethod(false,"getInputStream")),(Object)(iospush._sock.runMethod(false,"getOutputStream")),(Object)(RemoteObject.createImmutable("astream")));
 }else {
 BA.debugLineNum = 34;BA.debugLine="Log(\"Error connecting socket: \" & LastException)";
Debug.ShouldStop(2);
iospush.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error connecting socket: "),iospush.__c.runMethod(false,"LastException",iospush.ba))));
 BA.debugLineNum = 35;BA.debugLine="Reconnect";
Debug.ShouldStop(4);
_reconnect();
 };
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Start (iospush) ","iospush",5,iospush.ba,iospush.mostCurrent,14);
if (RapidSub.canDelegate("start")) return b4j.example.iospush.remoteMe.runUserSub(false, "iospush","start");
 BA.debugLineNum = 14;BA.debugLine="Public Sub Start";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="bc.LittleEndian = False";
Debug.ShouldStop(16384);
iospush._bc.runMethod(true,"setLittleEndian",iospush.__c.getField(true,"False"));
 BA.debugLineNum = 16;BA.debugLine="timer1.Initialize(\"timer1\", 3000) 'this timer is";
Debug.ShouldStop(32768);
iospush._timer1.runVoidMethod ("Initialize",iospush.ba,(Object)(BA.ObjectToString("timer1")),(Object)(BA.numberCast(long.class, 3000)));
 BA.debugLineNum = 17;BA.debugLine="Connect";
Debug.ShouldStop(65536);
_connect();
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (iospush) ","iospush",5,iospush.ba,iospush.mostCurrent,42);
if (RapidSub.canDelegate("timer1_tick")) return b4j.example.iospush.remoteMe.runUserSub(false, "iospush","timer1_tick");
 BA.debugLineNum = 42;BA.debugLine="Private Sub Timer1_Tick";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="timer1.Enabled = False";
Debug.ShouldStop(1024);
iospush._timer1.runMethod(true,"setEnabled",iospush.__c.getField(true,"False"));
 BA.debugLineNum = 44;BA.debugLine="Connect";
Debug.ShouldStop(2048);
_connect();
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writeitem(RemoteObject _out,RemoteObject _id,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("WriteItem (iospush) ","iospush",5,iospush.ba,iospush.mostCurrent,95);
if (RapidSub.canDelegate("writeitem")) return b4j.example.iospush.remoteMe.runUserSub(false, "iospush","writeitem", _out, _id, _data);
Debug.locals.put("out", _out);
Debug.locals.put("id", _id);
Debug.locals.put("data", _data);
 BA.debugLineNum = 95;BA.debugLine="Private Sub WriteItem(out As OutputStream, id As B";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="out.WriteBytes(Array As Byte(id), 0, 1)";
Debug.ShouldStop(-2147483648);
_out.runVoidMethod ("WriteBytes",(Object)(RemoteObject.createNewArray("byte",new int[] {1},new Object[] {_id})),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 97;BA.debugLine="out.WriteBytes(bc.ShortsToBytes(Array As Short(da";
Debug.ShouldStop(1);
_out.runVoidMethod ("WriteBytes",(Object)(iospush._bc.runMethod(false,"ShortsToBytes",(Object)(RemoteObject.createNewArray("short",new int[] {1},new Object[] {BA.numberCast(short.class, _data.getField(true,"length"))})))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 98;BA.debugLine="out.WriteBytes(data, 0, data.Length)";
Debug.ShouldStop(2);
_out.runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}