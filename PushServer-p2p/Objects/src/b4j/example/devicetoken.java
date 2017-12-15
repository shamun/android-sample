package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class devicetoken extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.devicetoken", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.devicetoken.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.main _main = null;
public b4j.example.dbutils _dbutils = null;
public b4j.example.iosfeedback _iosfeedback = null;
public b4j.example.iospush _iospush = null;
public b4j.example.httputils2service _httputils2service = null;
public b4j.example.webutils _webutils = null;
public b4j.example.androidpush _androidpush = null;
public String  _class_globals(b4j.example.devicetoken __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="devicetoken";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
public String  _handle(b4j.example.devicetoken __ref,anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="devicetoken";
if (Debug.shouldDelegate(ba, "handle"))
	return (String) Debug.delegate(ba, "handle", new Object[] {_req,_resp});
String _token = "";
int _devicetype = 0;
String _userid = "";
String _username = "";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim token As String = req.GetParameter(\"token\")";
_token = _req.GetParameter("token");
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Dim deviceType As Int = req.GetParameter(\"type\")";
_devicetype = (int)(Double.parseDouble(_req.GetParameter("type")));
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Dim userID As String = req.GetParameter(\"userid\")";
_userid = _req.GetParameter("userid");
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Dim userName As String = req.GetParameter(\"userna";
_username = _req.GetParameter("username");
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Log(\">>> Username: \" & userID)";
__c.Log(">>> Username: "+_userid);
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Log(\">>> Username: \" & userName)";
__c.Log(">>> Username: "+_username);
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Main.db.BeginTransaction";
_main._db.BeginTransaction();
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Try";
try {RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Main.db.ExecNonQuery2(\"DELETE FROM tokens WHERE";
_main._db.ExecNonQuery2("DELETE FROM tokens WHERE token = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_token)}));
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Main.db.ExecNonQuery2(\"INSERT INTO tokens VALUES";
_main._db.ExecNonQuery2("INSERT INTO tokens VALUES (?, ?, ?, ?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_token),(Object)(_devicetype),(Object)(__c.DateTime.getNow()),(Object)(_userid),(Object)(_username)}));
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="Main.db.TransactionSuccessful";
_main._db.TransactionSuccessful();
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="Log(\"Token added: \" & token)";
__c.Log("Token added: "+_token);
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="Main.db.Rollback";
_main._db.Rollback();
 };
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.devicetoken __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="devicetoken";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
}