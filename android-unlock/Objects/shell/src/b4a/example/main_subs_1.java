package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_1 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"1\")";
Debug.ShouldStop(4194304);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="If UserClosed Then";
Debug.ShouldStop(1073741824);
if (_userclosed.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 32;BA.debugLine="Log(\">>> OFF - Forefront\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable(">>> OFF - Forefront")));
 BA.debugLineNum = 33;BA.debugLine="myService.FOREFRONT_STATE = False";
Debug.ShouldStop(1);
main.mostCurrent._myservice._forefront_state = main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,26);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("button1_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");
 BA.debugLineNum = 45;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="StartServiceAt(myService, DateTime.Now+20*1000,Tr";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("StartServiceAt",main.processBA,(Object)((main.mostCurrent._myservice.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(20),RemoteObject.createImmutable(1000)}, "+*",1, 2)),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 47;BA.debugLine="Button1.Enabled=False";
Debug.ShouldStop(16384);
main.mostCurrent._button1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,50);
if (RapidSub.canDelegate("button2_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","button2_click");
 BA.debugLineNum = 50;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="StopService(myService)";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("StopService",main.processBA,(Object)((main.mostCurrent._myservice.getObject())));
 BA.debugLineNum = 52;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 53;BA.debugLine="ExitApplication";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Dim Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
myservice_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
myservice.myClass = BA.getDeviceClass ("b4a.example.myservice");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setshowwhenlocked() throws Exception{
try {
		Debug.PushSubsStack("SetShowWhenLocked (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,37);
if (RapidSub.canDelegate("setshowwhenlocked")) return b4a.example.main.remoteMe.runUserSub(false, "main","setshowwhenlocked");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 37;BA.debugLine="Sub SetShowWhenLocked";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(32);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 39;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(64);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",main.processBA)));
 BA.debugLineNum = 40;BA.debugLine="r.Target = r.RunMethod(\"getWindow\")";
Debug.ShouldStop(128);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWindow"))));
 BA.debugLineNum = 41;BA.debugLine="r.RunMethod2(\"addFlags\", 6815872, \"java.lang.int\"";
Debug.ShouldStop(256);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("addFlags")),(Object)(BA.NumberToString(6815872)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 42;BA.debugLine="Log(\">>> ON - Forefront\")";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable(">>> ON - Forefront")));
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
}