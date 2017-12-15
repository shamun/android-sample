
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("b4j.example.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4j.example.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _db = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _type_ios = RemoteObject.createImmutable(0);
public static RemoteObject _type_android = RemoteObject.createImmutable(0);
public static RemoteObject _srvr = RemoteObject.declareNull("anywheresoftware.b4j.object.ServerWrapper");
public static RemoteObject _config = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _version = RemoteObject.createImmutable("");
public static b4j.example.dbutils _dbutils = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.androidpush _androidpush = null;
  public Object[] GetGlobals() {
		return new Object[] {"AndroidPush",Debug.moduleToString(b4j.example.androidpush.class),"config",main._config,"db",main._db,"DBUtils",Debug.moduleToString(b4j.example.dbutils.class),"HttpUtils2Service",Debug.moduleToString(b4j.example.httputils2service.class),"iOSFeedback",Debug.moduleToString(b4j.example.iosfeedback.class),"iOSPush",Debug.moduleToString(b4j.example.iospush.class),"srvr",main._srvr,"TYPE_ANDROID",main._type_android,"TYPE_IOS",main._type_ios,"version",main._version,"WebUtils",Debug.moduleToString(b4j.example.webutils.class)};
}
}