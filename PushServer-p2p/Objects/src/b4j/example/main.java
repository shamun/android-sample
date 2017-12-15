package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.ShellBA.delegateBA = new anywheresoftware.b4a.StandardBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) throws Exception{
        try {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            ba.raiseEvent(null, "appstart", (Object)args);
        } catch (Throwable t) {
			BA.printException(t, true);
		
        } finally {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program terminated (StartMessageLoop was not called).");
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.SQL _db = null;
public static int _type_ios = 0;
public static int _type_android = 0;
public static anywheresoftware.b4j.object.ServerWrapper _srvr = null;
public static anywheresoftware.b4a.objects.collections.Map _config = null;
public static String _version = "";
public static b4j.example.dbutils _dbutils = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.androidpush _androidpush = null;
public static String  _appstart(String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart"))
	return (String) Debug.delegate(ba, "appstart", new Object[] {_args});
String[] _row = null;
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Args() As String)";
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="config = File.ReadMap(File.DirApp, \"config.txt\")";
_config = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"config.txt");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="InitDB";
_initdb();
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="srvr.Initialize(\"srvr\")";
_srvr.Initialize(ba,"srvr");
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="srvr.Port = config.Get(\"PushServerPort\")";
_srvr.setPort((int)(BA.ObjectToNumber(_config.Get((Object)("PushServerPort")))));
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="srvr.AddHandler(\"/devicetoken\", \"DeviceToken\", Fa";
_srvr.AddHandler("/devicetoken","DeviceToken",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="srvr.AddHandler(\"/send\", \"Send\", False)";
_srvr.AddHandler("/send","Send",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="srvr.Start";
_srvr.Start();
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="Log(\"server version: \" & version)";
anywheresoftware.b4a.keywords.Common.Log("server version: "+_version);
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="Log(\"server is listening on port: \" & srvr.Port)";
anywheresoftware.b4a.keywords.Common.Log("server is listening on port: "+BA.NumberToString(_srvr.getPort()));
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="iOSPush.Start 'comment these two lines to disable";
_iospush._start();
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="iOSFeedback.Start";
_iosfeedback._start();
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="For Each row() As String In DBUtils.ExecuteMemory";
{
final anywheresoftware.b4a.BA.IterableList group12 = _dbutils._executememorytable(_db,"SELECT name FROM sqlite_master WHERE type='table'",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_row = (String[])(group12.Get(index12));
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="Log($\"Table: ${row(0)}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Table: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_row[(int) (0)]))+""));
 }
};
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="End Sub";
return "";
}
public static String  _initdb() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "initdb"))
	return (String) Debug.delegate(ba, "initdb", null);
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub InitDB";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="If File.Exists(File.DirApp, \"push.db\") = False Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"push.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Log(\"Creating new database.\")";
anywheresoftware.b4a.keywords.Common.Log("Creating new database.");
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="db.InitializeSQLite(File.DirApp, \"push.db\", True";
_db.InitializeSQLite(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"push.db",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="db.ExecNonQuery(\"PRAGMA journal_mode = wal\")";
_db.ExecNonQuery("PRAGMA journal_mode = wal");
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="DBUtils.CreateTable(db, \"tokens\", _ 			CreateMap";
_dbutils._createtable(_db,"tokens",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("token"),(Object)(_dbutils._db_text),(Object)("type"),(Object)(_dbutils._db_integer),(Object)("updated_time"),(Object)(_dbutils._db_integer),(Object)("userid"),(Object)(_dbutils._db_text),(Object)("username"),(Object)(_dbutils._db_text)}),"token");
 }else {
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="db.InitializeSQLite(File.DirApp, \"push.db\", True";
_db.InitializeSQLite(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"push.db",anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="End Sub";
return "";
}
}