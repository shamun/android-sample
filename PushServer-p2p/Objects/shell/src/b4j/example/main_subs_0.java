package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,17);
if (RapidSub.canDelegate("appstart")) return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _args);
RemoteObject _row = null;
Debug.locals.put("Args", _args);
 BA.debugLineNum = 17;BA.debugLine="Sub AppStart (Args() As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="config = File.ReadMap(File.DirApp, \"config.txt\")";
Debug.ShouldStop(262144);
main._config = main.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("config.txt")));
 BA.debugLineNum = 20;BA.debugLine="InitDB";
Debug.ShouldStop(524288);
_initdb();
 BA.debugLineNum = 21;BA.debugLine="srvr.Initialize(\"srvr\")";
Debug.ShouldStop(1048576);
main._srvr.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("srvr")));
 BA.debugLineNum = 22;BA.debugLine="srvr.Port = config.Get(\"PushServerPort\")";
Debug.ShouldStop(2097152);
main._srvr.runMethod(true,"setPort",BA.numberCast(int.class, main._config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PushServerPort"))))));
 BA.debugLineNum = 23;BA.debugLine="srvr.AddHandler(\"/devicetoken\", \"DeviceToken\", Fa";
Debug.ShouldStop(4194304);
main._srvr.runVoidMethod ("AddHandler",(Object)(BA.ObjectToString("/devicetoken")),(Object)(BA.ObjectToString("DeviceToken")),(Object)(main.__c.getField(true,"False")));
 BA.debugLineNum = 24;BA.debugLine="srvr.AddHandler(\"/send\", \"Send\", False)";
Debug.ShouldStop(8388608);
main._srvr.runVoidMethod ("AddHandler",(Object)(BA.ObjectToString("/send")),(Object)(BA.ObjectToString("Send")),(Object)(main.__c.getField(true,"False")));
 BA.debugLineNum = 25;BA.debugLine="srvr.Start";
Debug.ShouldStop(16777216);
main._srvr.runVoidMethod ("Start");
 BA.debugLineNum = 26;BA.debugLine="Log(\"server version: \" & version)";
Debug.ShouldStop(33554432);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("server version: "),main._version)));
 BA.debugLineNum = 27;BA.debugLine="Log(\"server is listening on port: \" & srvr.Port)";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("server is listening on port: "),main._srvr.runMethod(true,"getPort"))));
 BA.debugLineNum = 28;BA.debugLine="iOSPush.Start 'comment these two lines to disable";
Debug.ShouldStop(134217728);
main._iospush.runVoidMethod ("_start");
 BA.debugLineNum = 29;BA.debugLine="iOSFeedback.Start";
Debug.ShouldStop(268435456);
main._iosfeedback.runVoidMethod ("_start");
 BA.debugLineNum = 30;BA.debugLine="For Each row() As String In DBUtils.ExecuteMemory";
Debug.ShouldStop(536870912);
{
final RemoteObject group12 = main._dbutils.runMethod(false,"_executememorytable",(Object)(main._db),(Object)(BA.ObjectToString("SELECT name FROM sqlite_master WHERE type='table'")),(Object)((main.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_row = (group12.runMethod(false,"Get",index12));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 31;BA.debugLine="Log($\"Table: ${row(0)}\"$)";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Table: "),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_row.getArrayElement(true,BA.numberCast(int.class, 0))))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 33;BA.debugLine="StartMessageLoop";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("StartMessageLoop",main.ba);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initdb() throws Exception{
try {
		Debug.PushSubsStack("InitDB (main) ","main",0,main.ba,main.mostCurrent,36);
if (RapidSub.canDelegate("initdb")) return b4j.example.main.remoteMe.runUserSub(false, "main","initdb");
 BA.debugLineNum = 36;BA.debugLine="Private Sub InitDB";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="If File.Exists(File.DirApp, \"push.db\") = False Th";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("push.db"))),main.__c.getField(true,"False"))) { 
 BA.debugLineNum = 38;BA.debugLine="Log(\"Creating new database.\")";
Debug.ShouldStop(32);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Creating new database.")));
 BA.debugLineNum = 39;BA.debugLine="db.InitializeSQLite(File.DirApp, \"push.db\", True";
Debug.ShouldStop(64);
main._db.runVoidMethod ("InitializeSQLite",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("push.db")),(Object)(main.__c.getField(true,"True")));
 BA.debugLineNum = 40;BA.debugLine="db.ExecNonQuery(\"PRAGMA journal_mode = wal\")";
Debug.ShouldStop(128);
main._db.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("PRAGMA journal_mode = wal")));
 BA.debugLineNum = 41;BA.debugLine="DBUtils.CreateTable(db, \"tokens\", _ 			CreateMap";
Debug.ShouldStop(256);
main._dbutils.runVoidMethod ("_createtable",(Object)(main._db),(Object)(BA.ObjectToString("tokens")),(Object)(main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("token")),(main._dbutils._db_text),RemoteObject.createImmutable(("type")),(main._dbutils._db_integer),RemoteObject.createImmutable(("updated_time")),(main._dbutils._db_integer),RemoteObject.createImmutable(("userid")),(main._dbutils._db_text),RemoteObject.createImmutable(("username")),(main._dbutils._db_text)}))),(Object)(RemoteObject.createImmutable("token")));
 }else {
 BA.debugLineNum = 50;BA.debugLine="db.InitializeSQLite(File.DirApp, \"push.db\", True";
Debug.ShouldStop(131072);
main._db.runVoidMethod ("InitializeSQLite",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("push.db")),(Object)(main.__c.getField(true,"True")));
 };
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
dbutils_subs_0._process_globals();
iosfeedback_subs_0._process_globals();
iospush_subs_0._process_globals();
httputils2service_subs_0._process_globals();
webutils_subs_0._process_globals();
androidpush_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
send.myClass = BA.getDeviceClass ("b4j.example.send");
devicetoken.myClass = BA.getDeviceClass ("b4j.example.devicetoken");
dbutils.myClass = BA.getDeviceClass ("b4j.example.dbutils");
iosfeedback.myClass = BA.getDeviceClass ("b4j.example.iosfeedback");
iospush.myClass = BA.getDeviceClass ("b4j.example.iospush");
httpjob.myClass = BA.getDeviceClass ("b4j.example.httpjob");
httputils2service.myClass = BA.getDeviceClass ("b4j.example.httputils2service");
webutils.myClass = BA.getDeviceClass ("b4j.example.webutils");
androidpush.myClass = BA.getDeviceClass ("b4j.example.androidpush");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public db As SQL";
main._db = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");
 //BA.debugLineNum = 11;BA.debugLine="Public Const TYPE_IOS = 1, TYPE_ANDROID = 2 As In";
main._type_ios = BA.numberCast(int.class, 1);
main._type_android = BA.numberCast(int.class, 2);
 //BA.debugLineNum = 12;BA.debugLine="Public srvr As Server";
main._srvr = RemoteObject.createNew ("anywheresoftware.b4j.object.ServerWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Public config As Map";
main._config = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 14;BA.debugLine="Private Const version As String = \"0.97\"";
main._version = BA.ObjectToString("0.97");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}