package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
int _i = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"1\")";
Debug.ShouldStop(1);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="clv1.AddTextItem(\"Aaaa\", \"a\")";
Debug.ShouldStop(2);
main.mostCurrent._clv1.runVoidMethod ("_addtextitem",(Object)(RemoteObject.createImmutable(("Aaaa"))),(Object)((RemoteObject.createImmutable("a"))));
 BA.debugLineNum = 35;BA.debugLine="clv1.AddTextItem(\"Aaaa\" & CRLF & \"Bbbb\", \"b\")";
Debug.ShouldStop(4);
main.mostCurrent._clv1.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Aaaa"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Bbbb")))),(Object)((RemoteObject.createImmutable("b"))));
 BA.debugLineNum = 36;BA.debugLine="clv1.AddTextItem(\"Aaaa\" & CRLF & \"Bbbb\" & CRLF &";
Debug.ShouldStop(8);
main.mostCurrent._clv1.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Aaaa"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Bbbb"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Cccc")))),(Object)((RemoteObject.createImmutable("c"))));
 BA.debugLineNum = 37;BA.debugLine="clv1.AddTextItem(\"Aaaa\" & CRLF & \"Bbbb\" & CRLF &";
Debug.ShouldStop(16);
main.mostCurrent._clv1.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Aaaa"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Bbbb"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Cccc"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Dddd")))),(Object)((RemoteObject.createImmutable("d"))));
 BA.debugLineNum = 38;BA.debugLine="clv1.AddTextItem(\"Aaaa\" & CRLF & \"Bbbb\" & CRLF &";
Debug.ShouldStop(32);
main.mostCurrent._clv1.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Aaaa"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Bbbb"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Cccc"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Dddd"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Eeee")))),(Object)((RemoteObject.createImmutable("e"))));
 BA.debugLineNum = 40;BA.debugLine="For i = 1 To 100";
Debug.ShouldStop(128);
{
final int step7 = 1;
final int limit7 = 100;
_i = 1 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 41;BA.debugLine="ListView1.AddSingleLine(cs.Initialize.Color(Rnd(";
Debug.ShouldStop(256);
main.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(main.mostCurrent._cs.runMethod(false,"Initialize").runMethod(false,"Color",(Object)(main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0xff000000)),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))))).runMethod(false,"Alignment",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.text.Layout.Alignment"),RemoteObject.createImmutable("ALIGN_CENTER")))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Item #"),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("")))))).runMethod(false,"PopAll").getObject())));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,49);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private clv1 As CustomListView";
main.mostCurrent._clv1 = RemoteObject.createNew ("anywheresoftware.b4a.samples.customlistview.customlistview");
 //BA.debugLineNum = 26;BA.debugLine="Private ListView1 As ListView";
main.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim cs As CSBuilder";
main.mostCurrent._cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _listview1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("listview1_itemclick")) return b4a.example.main.remoteMe.runUserSub(false, "main","listview1_itemclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 53;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Msgbox(Value,Value)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_value)),(Object)(BA.ObjectToCharSequence(_value)),main.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listview1_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemLongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,59);
if (RapidSub.canDelegate("listview1_itemlongclick")) return b4a.example.main.remoteMe.runUserSub(false, "main","listview1_itemlongclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 59;BA.debugLine="Sub ListView1_ItemLongClick (Position As Int, Valu";
Debug.ShouldStop(67108864);
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}