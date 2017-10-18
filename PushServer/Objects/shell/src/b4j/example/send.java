
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class send {
    public static RemoteObject myClass;
	public send() {
	}
    public static PCBA staticBA = new PCBA(null, send.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _days_limit = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.androidpush _androidpush = null;
public static b4j.example.dbutils _dbutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DAYS_LIMIT",_ref.getField(false, "_days_limit")};
}
}