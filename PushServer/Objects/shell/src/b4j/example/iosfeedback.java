
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

public class iosfeedback implements IRemote{
	public static iosfeedback mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public iosfeedback() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new iosfeedback();
		remoteMe = RemoteObject.declareNull("b4j.example.iosfeedback");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("iosfeedback"), "b4j.example.iosfeedback");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, iosfeedback.class);
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
		pcBA = new PCBA(this, iosfeedback.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sock = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper");
public static RemoteObject _astream = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
public static RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _buffer = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static b4j.example.main _main = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.androidpush _androidpush = null;
public static b4j.example.dbutils _dbutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"AndroidPush",Debug.moduleToString(b4j.example.androidpush.class),"astream",iosfeedback._astream,"bc",iosfeedback._bc,"buffer",iosfeedback._buffer,"DBUtils",Debug.moduleToString(b4j.example.dbutils.class),"HttpUtils2Service",Debug.moduleToString(b4j.example.httputils2service.class),"iOSPush",Debug.moduleToString(b4j.example.iospush.class),"Main",Debug.moduleToString(b4j.example.main.class),"sock",iosfeedback._sock,"timer1",iosfeedback._timer1,"WebUtils",Debug.moduleToString(b4j.example.webutils.class)};
}
}