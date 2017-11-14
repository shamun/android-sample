package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.StandardBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
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
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.SQL _db = null;
public static int _type_ios = 0;
public static int _type_android = 0;
public static anywheresoftware.b4j.object.ServerWrapper _srvr = null;
public static anywheresoftware.b4a.objects.collections.Map _config = null;
public static String _version = "";
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.androidpush _androidpush = null;
public static b4j.example.dbutils _dbutils = null;
public static String  _appstart(String[] _args) throws Exception{
String[] _row = null;
 //BA.debugLineNum = 17;BA.debugLine="Sub AppStart (Args() As String)";
 //BA.debugLineNum = 19;BA.debugLine="config = File.ReadMap(File.DirApp, \"config.txt\")";
_config = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"config.txt");
 //BA.debugLineNum = 20;BA.debugLine="InitDB";
_initdb();
 //BA.debugLineNum = 21;BA.debugLine="srvr.Initialize(\"srvr\")";
_srvr.Initialize(ba,"srvr");
 //BA.debugLineNum = 22;BA.debugLine="srvr.Port = config.Get(\"PushServerPort\")";
_srvr.setPort((int)(BA.ObjectToNumber(_config.Get((Object)("PushServerPort")))));
 //BA.debugLineNum = 23;BA.debugLine="srvr.AddHandler(\"/devicetoken\", \"DeviceToken\", Fa";
_srvr.AddHandler("/devicetoken","DeviceToken",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 24;BA.debugLine="srvr.AddHandler(\"/send\", \"Send\", False)";
_srvr.AddHandler("/send","Send",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 25;BA.debugLine="srvr.Start";
_srvr.Start();
 //BA.debugLineNum = 26;BA.debugLine="Log(\"server version: \" & version)";
anywheresoftware.b4a.keywords.Common.Log("server version: "+_version);
 //BA.debugLineNum = 27;BA.debugLine="Log(\"server is listening on port: \" & srvr.Port)";
anywheresoftware.b4a.keywords.Common.Log("server is listening on port: "+BA.NumberToString(_srvr.getPort()));
 //BA.debugLineNum = 28;BA.debugLine="iOSPush.Start 'comment these two lines to disable";
_iospush._start();
 //BA.debugLineNum = 29;BA.debugLine="iOSFeedback.Start";
_iosfeedback._start();
 //BA.debugLineNum = 30;BA.debugLine="For Each row() As String In DBUtils.ExecuteMemory";
{
final anywheresoftware.b4a.BA.IterableList group12 = _dbutils._executememorytable(_db,"SELECT name FROM sqlite_master WHERE type='table'",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_row = (String[])(group12.Get(index12));
 //BA.debugLineNum = 31;BA.debugLine="Log($\"Table: ${row(0)}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Table: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_row[(int) (0)]))+""));
 }
};
 //BA.debugLineNum = 33;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public static String  _initdb() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Private Sub InitDB";
 //BA.debugLineNum = 37;BA.debugLine="If File.Exists(File.DirApp, \"push.db\") = False Th";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"push.db")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 38;BA.debugLine="Log(\"Creating new database.\")";
anywheresoftware.b4a.keywords.Common.Log("Creating new database.");
 //BA.debugLineNum = 39;BA.debugLine="db.InitializeSQLite(File.DirApp, \"push.db\", True";
_db.InitializeSQLite(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"push.db",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 40;BA.debugLine="db.ExecNonQuery(\"PRAGMA journal_mode = wal\")";
_db.ExecNonQuery("PRAGMA journal_mode = wal");
 //BA.debugLineNum = 41;BA.debugLine="DBUtils.CreateTable(db, \"tokens\", _ 			CreateMap";
_dbutils._createtable(_db,"tokens",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("token"),(Object)(_dbutils._db_text),(Object)("type"),(Object)(_dbutils._db_integer),(Object)("updated_time"),(Object)(_dbutils._db_integer)}),"token");
 }else {
 //BA.debugLineNum = 45;BA.debugLine="db.InitializeSQLite(File.DirApp, \"push.db\", True";
_db.InitializeSQLite(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"push.db",anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
iosfeedback._process_globals();
iospush._process_globals();
httputils2service._process_globals();
webutils._process_globals();
androidpush._process_globals();
dbutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public db As SQL";
_db = new anywheresoftware.b4j.objects.SQL();
 //BA.debugLineNum = 11;BA.debugLine="Public Const TYPE_IOS = 1, TYPE_ANDROID = 2 As In";
_type_ios = (int) (1);
_type_android = (int) (2);
 //BA.debugLineNum = 12;BA.debugLine="Public srvr As Server";
_srvr = new anywheresoftware.b4j.object.ServerWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Public config As Map";
_config = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 14;BA.debugLine="Private Const version As String = \"0.97\"";
_version = "0.97";
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
}
