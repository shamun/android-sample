package org.tpt.push;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_main_subs_0 {


public static RemoteObject  _application_background() throws Exception{
try {
		Debug.PushSubsStack("Application_Background (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,73);
if (RapidSub.canDelegate("application_background")) return b4i_main.remoteMe.runUserSub(false, "main","application_background");
 BA.debugLineNum = 73;BA.debugLine="Private Sub Application_Background";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_pushtoken(RemoteObject _success,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("Application_PushToken (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,42);
if (RapidSub.canDelegate("application_pushtoken")) return b4i_main.remoteMe.runUserSub(false, "main","application_pushtoken", _success, _token);
RemoteObject _bc = RemoteObject.declareNull("B4IByteConverter");
RemoteObject _j = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("Success", _success);
Debug.locals.put("Token", _token);
 BA.debugLineNum = 42;BA.debugLine="Private Sub Application_PushToken (Success As Bool";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="If Success Then";
Debug.ShouldStop(1024);
if (_success.getBoolean()) { 
 BA.debugLineNum = 44;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(2048);
_bc = RemoteObject.createNew ("B4IByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 45;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(4096);
_j = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 46;BA.debugLine="j.Initialize(\"j\", Me)";
Debug.ShouldStop(8192);
_j.runClassMethod (b4i_httpjob.class, "_initialize:::",b4i_main.ba,(Object)(BA.ObjectToString("j")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 47;BA.debugLine="j.PostString(ServerUrl & \"/devicetoken\", \"token=";
Debug.ShouldStop(16384);
_j.runClassMethod (b4i_httpjob.class, "_poststring::",(Object)(RemoteObject.concat(b4i_main._serverurl,RemoteObject.createImmutable("/devicetoken"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("token="),_bc.runMethod(true,"HexFromBytes:",(Object)(_token)),RemoteObject.createImmutable("&type=1"))));
 }else {
 BA.debugLineNum = 49;BA.debugLine="Log(\"Error getting token: \" & LastException)";
Debug.ShouldStop(65536);
b4i_main.__c.runVoidMethod ("Log:",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error getting token: "),b4i_main.__c.runMethod(false,"LastException"))));
 };
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_remotenotification(RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("Application_RemoteNotification (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,62);
if (RapidSub.canDelegate("application_remotenotification")) return b4i_main.remoteMe.runUserSub(false, "main","application_remotenotification", _message);
RemoteObject _m = RemoteObject.declareNull("B4IMap");
Debug.locals.put("Message", _message);
 BA.debugLineNum = 62;BA.debugLine="Private Sub Application_RemoteNotification (Messag";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Log(\"Remote notification: \" & Message)";
Debug.ShouldStop(1073741824);
b4i_main.__c.runVoidMethod ("Log:",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Remote notification: "),_message)));
 BA.debugLineNum = 64;BA.debugLine="Dim m As Map = Message.Get(\"aps\")";
Debug.ShouldStop(-2147483648);
_m = (_message.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("aps")))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 65;BA.debugLine="Log(m)";
Debug.ShouldStop(1);
b4i_main.__c.runVoidMethod ("Log:",(Object)(BA.ObjectToString(_m)));
 BA.debugLineNum = 66;BA.debugLine="Log(m.Get(\"alert\"))";
Debug.ShouldStop(2);
b4i_main.__c.runVoidMethod ("Log:",(Object)(BA.ObjectToString(_m.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("alert")))))));
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
public static RemoteObject  _application_start(RemoteObject _nav) throws Exception{
try {
		Debug.PushSubsStack("Application_Start (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,32);
if (RapidSub.canDelegate("application_start")) return b4i_main.remoteMe.runUserSub(false, "main","application_start", _nav);
Debug.locals.put("Nav", _nav);
 BA.debugLineNum = 32;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="NavControl = Nav";
Debug.ShouldStop(1);
b4i_main._navcontrol = _nav;
 BA.debugLineNum = 34;BA.debugLine="Page1.Initialize(\"Page1\")";
Debug.ShouldStop(2);
b4i_main._page1.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("Page1")));
 BA.debugLineNum = 35;BA.debugLine="Page1.Title = \"Page 1\"";
Debug.ShouldStop(4);
b4i_main._page1.runMethod(true,"setTitle:",BA.ObjectToString("Page 1"));
 BA.debugLineNum = 36;BA.debugLine="Page1.RootPanel.Color = Colors.White";
Debug.ShouldStop(8);
b4i_main._page1.runMethod(false,"RootPanel").runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White"));
 BA.debugLineNum = 37;BA.debugLine="NavControl.ShowPage(Page1)";
Debug.ShouldStop(16);
b4i_main._navcontrol.runVoidMethod ("ShowPage:",(Object)(((b4i_main._page1).getObject())));
 BA.debugLineNum = 38;BA.debugLine="App.RegisterUserNotifications(True, True, True)";
Debug.ShouldStop(32);
b4i_main._app.runVoidMethod ("RegisterUserNotifications:::",(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 39;BA.debugLine="App.RegisterForRemoteNotifications";
Debug.ShouldStop(64);
b4i_main._app.runVoidMethod ("RegisterForRemoteNotifications");
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _j) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,53);
if (RapidSub.canDelegate("jobdone")) return b4i_main.remoteMe.runUserSub(false, "main","jobdone", _j);
Debug.locals.put("j", _j);
 BA.debugLineNum = 53;BA.debugLine="Private Sub JobDone(j As HttpJob)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2097152);
if (_j.getField(true,"_success").getBoolean()) { 
 BA.debugLineNum = 55;BA.debugLine="Log(\"Token uploaded successfully.\")";
Debug.ShouldStop(4194304);
b4i_main.__c.runVoidMethod ("Log:",(Object)(RemoteObject.createImmutable("Token uploaded successfully.")));
 }else {
 BA.debugLineNum = 57;BA.debugLine="Log(\"Error uploading token\")";
Debug.ShouldStop(16777216);
b4i_main.__c.runVoidMethod ("Log:",(Object)(RemoteObject.createImmutable("Error uploading token")));
 };
 BA.debugLineNum = 59;BA.debugLine="j.Release";
Debug.ShouldStop(67108864);
_j.runClassMethod (b4i_httpjob.class, "_release");
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _page1_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Page1_Resize (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,69);
if (RapidSub.canDelegate("page1_resize")) return b4i_main.remoteMe.runUserSub(false, "main","page1_resize", _width, _height);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 69;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Public App As Application";
b4i_main._app = RemoteObject.createNew ("B4IApplicationWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Public NavControl As NavigationController";
b4i_main._navcontrol = RemoteObject.createNew ("B4INavigationControllerWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Page1 As Page";
b4i_main._page1 = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 26;BA.debugLine="Private Const ServerUrl As String = \"http://192.1";
b4i_main._serverurl = BA.ObjectToString("http://192.168.1.32:51044");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}