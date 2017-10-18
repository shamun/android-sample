
package org.tpt.push;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_httpjob {
    public static RemoteObject myClass;
	public b4i_httpjob() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_httpjob.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _jobname = RemoteObject.createImmutable("");
public static RemoteObject _success = RemoteObject.createImmutable(false);
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _password = RemoteObject.createImmutable("");
public static RemoteObject _errormessage = RemoteObject.createImmutable("");
public static RemoteObject _target = RemoteObject.declareNull("NSObject");
public static RemoteObject _req = RemoteObject.declareNull("B4IHttpRequest");
public static RemoteObject _tag = RemoteObject.declareNull("NSObject");
public static RemoteObject _res = RemoteObject.declareNull("B4IHttpResponse");
public static b4i_main _main = null;
public static b4i_httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ErrorMessage",_ref.getField(false, "_errormessage"),"JobName",_ref.getField(false, "_jobname"),"Password",_ref.getField(false, "_password"),"req",_ref.getField(false, "_req"),"res",_ref.getField(false, "_res"),"Success",_ref.getField(false, "_success"),"Tag",_ref.getField(false, "_tag"),"target",_ref.getField(false, "_target"),"Username",_ref.getField(false, "_username")};
}
}