
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

public class androidpush implements IRemote{
	public static androidpush mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public androidpush() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new androidpush();
		remoteMe = RemoteObject.declareNull("b4j.example.androidpush");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("androidpush"), "b4j.example.androidpush");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, androidpush.class);
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
		pcBA = new PCBA(this, androidpush.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static b4j.example.main _main = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.dbutils _dbutils = null;
public static b4j.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"DBUtils",Debug.moduleToString(b4j.example.dbutils.class),"HttpUtils2Service",Debug.moduleToString(b4j.example.httputils2service.class),"iOSFeedback",Debug.moduleToString(b4j.example.iosfeedback.class),"iOSPush",Debug.moduleToString(b4j.example.iospush.class),"Main",Debug.moduleToString(b4j.example.main.class),"WebUtils",Debug.moduleToString(b4j.example.webutils.class)};
}
}