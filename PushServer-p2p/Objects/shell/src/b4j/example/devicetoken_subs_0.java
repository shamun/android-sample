package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class devicetoken_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _handle(RemoteObject __ref,RemoteObject _req,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("Handle (devicetoken) ","devicetoken",2,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("handle")) return __ref.runUserSub(false, "devicetoken","handle", __ref, _req, _resp);
RemoteObject _token = RemoteObject.createImmutable("");
RemoteObject _devicetype = RemoteObject.createImmutable(0);
RemoteObject _userid = RemoteObject.createImmutable("");
RemoteObject _username = RemoteObject.createImmutable("");
Debug.locals.put("req", _req);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 10;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim token As String = req.GetParameter(\"token\")";
Debug.ShouldStop(1024);
_token = _req.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("token")));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 BA.debugLineNum = 12;BA.debugLine="Dim deviceType As Int = req.GetParameter(\"type\")";
Debug.ShouldStop(2048);
_devicetype = BA.numberCast(int.class, _req.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("type"))));Debug.locals.put("deviceType", _devicetype);Debug.locals.put("deviceType", _devicetype);
 BA.debugLineNum = 14;BA.debugLine="Dim userID As String = req.GetParameter(\"userid\")";
Debug.ShouldStop(8192);
_userid = _req.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("userid")));Debug.locals.put("userID", _userid);Debug.locals.put("userID", _userid);
 BA.debugLineNum = 15;BA.debugLine="Dim userName As String = req.GetParameter(\"userna";
Debug.ShouldStop(16384);
_username = _req.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("username")));Debug.locals.put("userName", _username);Debug.locals.put("userName", _username);
 BA.debugLineNum = 17;BA.debugLine="Log(\">>> Username: \" & userID)";
Debug.ShouldStop(65536);
devicetoken.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(">>> Username: "),_userid)));
 BA.debugLineNum = 18;BA.debugLine="Log(\">>> Username: \" & userName)";
Debug.ShouldStop(131072);
devicetoken.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable(">>> Username: "),_username)));
 BA.debugLineNum = 20;BA.debugLine="Main.db.BeginTransaction";
Debug.ShouldStop(524288);
devicetoken._main._db.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 21;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 22;BA.debugLine="Main.db.ExecNonQuery2(\"DELETE FROM tokens WHERE";
Debug.ShouldStop(2097152);
devicetoken._main._db.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM tokens WHERE token = ?")),(Object)(devicetoken.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_token)})))));
 BA.debugLineNum = 23;BA.debugLine="Main.db.ExecNonQuery2(\"INSERT INTO tokens VALUES";
Debug.ShouldStop(4194304);
devicetoken._main._db.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO tokens VALUES (?, ?, ?, ?, ?)")),(Object)(devicetoken.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_token),(_devicetype),(devicetoken.__c.getField(false,"DateTime").runMethod(true,"getNow")),(_userid),(_username)})))));
 BA.debugLineNum = 25;BA.debugLine="Main.db.TransactionSuccessful";
Debug.ShouldStop(16777216);
devicetoken._main._db.runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 26;BA.debugLine="Log(\"Token added: \" & token)";
Debug.ShouldStop(33554432);
devicetoken.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Token added: "),_token)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 28;BA.debugLine="Main.db.Rollback";
Debug.ShouldStop(134217728);
devicetoken._main._db.runVoidMethod ("Rollback");
 };
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (devicetoken) ","devicetoken",2,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "devicetoken","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}