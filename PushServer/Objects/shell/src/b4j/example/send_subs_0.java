package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class send_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Const DAYS_LIMIT As Int = 300";
send._days_limit = BA.numberCast(int.class, 300);__ref.setField("_days_limit",send._days_limit);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _handle(RemoteObject __ref,RemoteObject _req,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("Handle (send) ","send",6,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("handle")) return __ref.runUserSub(false, "send","handle", __ref, _req, _resp);
RemoteObject _m = RemoteObject.declareNull("b4j.example.iospush._message");
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _iostokens = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _androidtokens = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = null;
Debug.locals.put("req", _req);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 10;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="If req.GetParameter(\"password\") <> Main.config.Ge";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("!",_req.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("password"))),BA.ObjectToString(send._main._config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PushServerPassword"))))))) { 
 BA.debugLineNum = 12;BA.debugLine="resp.SendError(500, \"Invalid password\")";
Debug.ShouldStop(2048);
_resp.runVoidMethodAndSync ("SendError",(Object)(BA.numberCast(int.class, 500)),(Object)(RemoteObject.createImmutable("Invalid password")));
 BA.debugLineNum = 13;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 15;BA.debugLine="Dim m As Message";
Debug.ShouldStop(16384);
_m = RemoteObject.createNew ("b4j.example.iospush._message");Debug.locals.put("m", _m);
 BA.debugLineNum = 16;BA.debugLine="m.Initialize";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="If IsNumber(req.GetParameter(\"badge\")) Then";
Debug.ShouldStop(65536);
if (send.__c.runMethod(true,"IsNumber",(Object)(_req.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("badge"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 18;BA.debugLine="m.Badge = req.GetParameter(\"badge\")";
Debug.ShouldStop(131072);
_m.setField ("Badge",BA.numberCast(int.class, _req.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("badge")))));
 };
 BA.debugLineNum = 20;BA.debugLine="m.Text = req.GetParameter(\"text\")";
Debug.ShouldStop(524288);
_m.setField ("Text",_req.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("text"))));
 BA.debugLineNum = 21;BA.debugLine="m.Sound = True";
Debug.ShouldStop(1048576);
_m.setField ("Sound",send.__c.getField(true,"True"));
 BA.debugLineNum = 22;BA.debugLine="m.HighPriority = True";
Debug.ShouldStop(2097152);
_m.setField ("HighPriority",send.__c.getField(true,"True"));
 BA.debugLineNum = 23;BA.debugLine="m.ExpirationDate = DateTime.Now + DateTime.TicksP";
Debug.ShouldStop(4194304);
_m.setField ("ExpirationDate",RemoteObject.solve(new RemoteObject[] {send.__c.getField(false,"DateTime").runMethod(true,"getNow"),send.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "+",1, 2));
 BA.debugLineNum = 24;BA.debugLine="Dim rows As List = DBUtils.ExecuteMemoryTable(Mai";
Debug.ShouldStop(8388608);
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rows = send._dbutils.runMethod(false,"_executememorytable",(Object)(send._main._db),(Object)(BA.ObjectToString("SELECT token, type FROM tokens WHERE updated_time > ? ORDER BY updated_time DESC")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(RemoteObject.solve(new RemoteObject[] {send.__c.getField(false,"DateTime").runMethod(true,"getNow"),__ref.getField(true,"_days_limit"),send.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "-*",1, 2))})),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("rows", _rows);Debug.locals.put("rows", _rows);
 BA.debugLineNum = 27;BA.debugLine="Dim iosTokens, AndroidTokens As List";
Debug.ShouldStop(67108864);
_iostokens = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("iosTokens", _iostokens);
_androidtokens = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("AndroidTokens", _androidtokens);
 BA.debugLineNum = 28;BA.debugLine="iosTokens.Initialize";
Debug.ShouldStop(134217728);
_iostokens.runVoidMethod ("Initialize");
 BA.debugLineNum = 29;BA.debugLine="AndroidTokens.Initialize";
Debug.ShouldStop(268435456);
_androidtokens.runVoidMethod ("Initialize");
 BA.debugLineNum = 30;BA.debugLine="For Each row() As String In rows";
Debug.ShouldStop(536870912);
{
final RemoteObject group18 = _rows;
final int groupLen18 = group18.runMethod(true,"getSize").<Integer>get()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_row = (group18.runMethod(false,"Get",index18));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 31;BA.debugLine="If row(1) = Main.TYPE_IOS Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_row.getArrayElement(true,BA.numberCast(int.class, 1)),BA.NumberToString(send._main._type_ios))) { 
 BA.debugLineNum = 32;BA.debugLine="iosTokens.Add(row(0))";
Debug.ShouldStop(-2147483648);
_iostokens.runVoidMethod ("Add",(Object)((_row.getArrayElement(true,BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 33;BA.debugLine="If iosTokens.Size > 900 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_iostokens.runMethod(true,"getSize"),BA.numberCast(double.class, 900))) { 
 BA.debugLineNum = 34;BA.debugLine="CallSubDelayed3(iOSPush, \"SendMessageTo\", iosT";
Debug.ShouldStop(2);
send.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((send._iospush.getObject())),(Object)(BA.ObjectToString("SendMessageTo")),(Object)((_iostokens)),(Object)((_m)));
 BA.debugLineNum = 35;BA.debugLine="Dim iosTokens As List";
Debug.ShouldStop(4);
_iostokens = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("iosTokens", _iostokens);
 BA.debugLineNum = 36;BA.debugLine="iosTokens.Initialize";
Debug.ShouldStop(8);
_iostokens.runVoidMethod ("Initialize");
 };
 }else {
 BA.debugLineNum = 39;BA.debugLine="AndroidTokens.Add(row(0))";
Debug.ShouldStop(64);
_androidtokens.runVoidMethod ("Add",(Object)((_row.getArrayElement(true,BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 40;BA.debugLine="If AndroidTokens.Size > 900 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_androidtokens.runMethod(true,"getSize"),BA.numberCast(double.class, 900))) { 
 BA.debugLineNum = 41;BA.debugLine="CallSubDelayed3(AndroidPush, \"SendMessageTo\",";
Debug.ShouldStop(256);
send.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((send._androidpush.getObject())),(Object)(BA.ObjectToString("SendMessageTo")),(Object)((_androidtokens)),(Object)((_m)));
 BA.debugLineNum = 42;BA.debugLine="Dim AndroidTokens As List";
Debug.ShouldStop(512);
_androidtokens = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("AndroidTokens", _androidtokens);
 BA.debugLineNum = 43;BA.debugLine="AndroidTokens.Initialize";
Debug.ShouldStop(1024);
_androidtokens.runVoidMethod ("Initialize");
 };
 };
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 47;BA.debugLine="If iosTokens.Size > 0 Then CallSubDelayed3(iOSPus";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_iostokens.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
send.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((send._iospush.getObject())),(Object)(BA.ObjectToString("SendMessageTo")),(Object)((_iostokens)),(Object)((_m)));};
 BA.debugLineNum = 48;BA.debugLine="If AndroidTokens.Size > 0 Then CallSubDelayed3(An";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_androidtokens.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
send.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((send._androidpush.getObject())),(Object)(BA.ObjectToString("SendMessageTo")),(Object)((_androidtokens)),(Object)((_m)));};
 BA.debugLineNum = 50;BA.debugLine="resp.Write(\"Message sent to \" & rows.Size & \" dev";
Debug.ShouldStop(131072);
_resp.runVoidMethod ("Write",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Message sent to "),_rows.runMethod(true,"getSize"),RemoteObject.createImmutable(" device(s)."))));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (send) ","send",6,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "send","initialize", __ref, _ba);
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