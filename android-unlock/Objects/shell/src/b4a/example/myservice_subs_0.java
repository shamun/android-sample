package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class myservice_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim T1 As Timer";
myservice._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 8;BA.debugLine="Dim WS As PhoneWakeState";
myservice._ws = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
 //BA.debugLineNum = 10;BA.debugLine="Dim FOREFRONT_STATE As Boolean";
myservice._forefront_state = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (myservice) ","myservice",2,myservice.processBA,myservice.mostCurrent,13);
if (RapidSub.canDelegate("service_create")) return b4a.example.myservice.remoteMe.runUserSub(false, "myservice","service_create");
 BA.debugLineNum = 13;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="T1.Initialize(\"T1\",5*1000)";
Debug.ShouldStop(8192);
myservice._t1.runVoidMethod ("Initialize",myservice.processBA,(Object)(BA.ObjectToString("T1")),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(5),RemoteObject.createImmutable(1000)}, "*",0, 1))));
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (myservice) ","myservice",2,myservice.processBA,myservice.mostCurrent,25);
if (RapidSub.canDelegate("service_destroy")) return b4a.example.myservice.remoteMe.runUserSub(false, "myservice","service_destroy");
 BA.debugLineNum = 25;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="WS.ReleaseKeepAlive";
Debug.ShouldStop(33554432);
myservice._ws.runVoidMethod ("ReleaseKeepAlive");
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (myservice) ","myservice",2,myservice.processBA,myservice.mostCurrent,17);
if (RapidSub.canDelegate("service_start")) return b4a.example.myservice.remoteMe.runUserSub(false, "myservice","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 17;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="T1.Enabled=True";
Debug.ShouldStop(131072);
myservice._t1.runMethod(true,"setEnabled",myservice.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 19;BA.debugLine="WS.KeepAlive(True)";
Debug.ShouldStop(262144);
myservice._ws.runVoidMethod ("KeepAlive",myservice.processBA,(Object)(myservice.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 20;BA.debugLine="If IsPaused(Main) Then";
Debug.ShouldStop(524288);
if (myservice.mostCurrent.__c.runMethod(true,"IsPaused",myservice.processBA,(Object)((myservice.mostCurrent._main.getObject()))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 21;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(1048576);
myservice.mostCurrent.__c.runVoidMethod ("StartActivity",myservice.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 };
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t1_tick() throws Exception{
try {
		Debug.PushSubsStack("T1_Tick (myservice) ","myservice",2,myservice.processBA,myservice.mostCurrent,29);
if (RapidSub.canDelegate("t1_tick")) return b4a.example.myservice.remoteMe.runUserSub(false, "myservice","t1_tick");
 BA.debugLineNum = 29;BA.debugLine="Sub T1_Tick";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="If FOREFRONT_STATE Then";
Debug.ShouldStop(536870912);
if (myservice._forefront_state.<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 33;BA.debugLine="Log(\">>> ON - Forefront from service, from minim";
Debug.ShouldStop(1);
myservice.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable(">>> ON - Forefront from service, from minimise")));
 BA.debugLineNum = 34;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(2);
myservice.mostCurrent.__c.runVoidMethod ("StartActivity",myservice.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 35;BA.debugLine="FOREFRONT_STATE = True";
Debug.ShouldStop(4);
myservice._forefront_state = myservice.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 38;BA.debugLine="CallSub(Main,\"SetShowWhenLocked\")";
Debug.ShouldStop(32);
myservice.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",myservice.processBA,(Object)((myservice.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("SetShowWhenLocked")));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}