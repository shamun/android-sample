package org.tpt;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_main_subs_0 {


public static RemoteObject  _application_background() throws Exception{
try {
		Debug.PushSubsStack("Application_Background (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,56);
if (RapidSub.canDelegate("application_background")) return b4i_main.remoteMe.runUserSub(false, "main","application_background");
 BA.debugLineNum = 56;BA.debugLine="Private Sub Application_Background";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_receivelocalnotification(RemoteObject _ln) throws Exception{
try {
		Debug.PushSubsStack("Application_ReceiveLocalNotification (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,48);
if (RapidSub.canDelegate("application_receivelocalnotification")) return b4i_main.remoteMe.runUserSub(false, "main","application_receivelocalnotification", _ln);
Debug.locals.put("LN", _ln);
 BA.debugLineNum = 48;BA.debugLine="Sub Application_ReceiveLocalNotification (LN As No";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="hd.ToastMessageShow(\"Notification arrived: \" & LN";
Debug.ShouldStop(131072);
b4i_main._hd.runVoidMethod ("ToastMessageShow::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Notification arrived: "),_ln.runMethod(true,"AlertBody"))),(Object)(b4i_main.__c.runMethod(true,"True")));
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
public static RemoteObject  _application_start(RemoteObject _nav) throws Exception{
try {
		Debug.PushSubsStack("Application_Start (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,19);
if (RapidSub.canDelegate("application_start")) return b4i_main.remoteMe.runUserSub(false, "main","application_start", _nav);
RemoteObject _ln = RemoteObject.declareNull("B4INotificationWrapper");
Debug.locals.put("Nav", _nav);
 BA.debugLineNum = 19;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="NavControl = Nav";
Debug.ShouldStop(524288);
b4i_main._navcontrol = _nav;
 BA.debugLineNum = 21;BA.debugLine="Page1.Initialize(\"Page1\")";
Debug.ShouldStop(1048576);
b4i_main._page1.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("Page1")));
 BA.debugLineNum = 22;BA.debugLine="Page1.Title = \"Page 1\"";
Debug.ShouldStop(2097152);
b4i_main._page1.runMethod(true,"setTitle:",BA.ObjectToString("Page 1"));
 BA.debugLineNum = 23;BA.debugLine="Page1.RootPanel.Color = Colors.White";
Debug.ShouldStop(4194304);
b4i_main._page1.runMethod(false,"RootPanel").runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White"));
 BA.debugLineNum = 24;BA.debugLine="Page1.RootPanel.LoadLayout(\"1\")";
Debug.ShouldStop(8388608);
b4i_main._page1.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("1")),b4i_main.ba);
 BA.debugLineNum = 25;BA.debugLine="NavControl.ShowPage(Page1)";
Debug.ShouldStop(16777216);
b4i_main._navcontrol.runVoidMethod ("ShowPage:",(Object)(((b4i_main._page1).getObject())));
 BA.debugLineNum = 26;BA.debugLine="App.RegisterUserNotifications(True, True, True) '";
Debug.ShouldStop(33554432);
b4i_main._app.runVoidMethod ("RegisterUserNotifications:::",(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 27;BA.debugLine="App.ApplicationIconBadgeNumber = 0";
Debug.ShouldStop(67108864);
b4i_main._app.runMethod(true,"setApplicationIconBadgeNumber:",BA.numberCast(int.class, 0));
 BA.debugLineNum = 29;BA.debugLine="If App.LaunchOptions.IsInitialized Then";
Debug.ShouldStop(268435456);
if (b4i_main._app.runMethod(false,"LaunchOptions").runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 30;BA.debugLine="Dim ln As Notification = App.LaunchOptions.Get(\"";
Debug.ShouldStop(536870912);
_ln = RemoteObject.createNew ("B4INotificationWrapper");
_ln.setObject(b4i_main._app.runMethod(false,"LaunchOptions").runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("UIApplicationLaunchOptionsLocalNotificationKey")))));Debug.locals.put("ln", _ln);
 BA.debugLineNum = 31;BA.debugLine="If ln.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (_ln.runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 32;BA.debugLine="hd.ToastMessageShow(\"Application was started fr";
Debug.ShouldStop(-2147483648);
b4i_main._hd.runVoidMethod ("ToastMessageShow::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Application was started from a notification: "),_ln.runMethod(true,"AlertBody"))),(Object)(b4i_main.__c.runMethod(true,"True")));
 };
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
public static RemoteObject  _btnnotification_click() throws Exception{
try {
		Debug.PushSubsStack("btnNotification_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,38);
if (RapidSub.canDelegate("btnnotification_click")) return b4i_main.remoteMe.runUserSub(false, "main","btnnotification_click");
RemoteObject _ln = RemoteObject.declareNull("B4INotificationWrapper");
 BA.debugLineNum = 38;BA.debugLine="Sub btnNotification_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Dim ln As Notification";
Debug.ShouldStop(64);
_ln = RemoteObject.createNew ("B4INotificationWrapper");Debug.locals.put("ln", _ln);
 BA.debugLineNum = 40;BA.debugLine="ln.Initialize(DateTime.Now + 6 * DateTime.TicksPe";
Debug.ShouldStop(128);
_ln.runVoidMethod ("Initialize:",(Object)(RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Now"),RemoteObject.createImmutable(6),b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"TicksPerSecond")}, "+*",1, 2)));
 BA.debugLineNum = 41;BA.debugLine="ln.IconBadgeNumber = 1";
Debug.ShouldStop(256);
_ln.runMethod(true,"setIconBadgeNumber:",BA.numberCast(int.class, 1));
 BA.debugLineNum = 42;BA.debugLine="ln.AlertBody = \"Moo is hungry\"";
Debug.ShouldStop(512);
_ln.runMethod(true,"setAlertBody:",BA.ObjectToString("Moo is hungry"));
 BA.debugLineNum = 43;BA.debugLine="ln.PlaySound = True";
Debug.ShouldStop(1024);
_ln.runMethod(true,"setPlaySound:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 44;BA.debugLine="ln.Register";
Debug.ShouldStop(2048);
_ln.runVoidMethod ("Register");
 BA.debugLineNum = 45;BA.debugLine="hd.ToastMessageShow(\"Notification will fire in 6";
Debug.ShouldStop(4096);
b4i_main._hd.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Notification will fire in 6 seconds.")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Page1_Resize (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,52);
if (RapidSub.canDelegate("page1_resize")) return b4i_main.remoteMe.runUserSub(false, "main","page1_resize", _width, _height);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 52;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
Debug.ShouldStop(524288);
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
public static RemoteObject  _process_globals() throws Exception{
b4i_main._httputils2service=RemoteObject.createNew ("b4i_httputils2service");
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Public App As Application";
b4i_main._app = RemoteObject.createNew ("B4IApplicationWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Public NavControl As NavigationController";
b4i_main._navcontrol = RemoteObject.createNew ("B4INavigationControllerWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private Page1 As Page";
b4i_main._page1 = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 16;BA.debugLine="Private hd As HUD";
b4i_main._hd = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}