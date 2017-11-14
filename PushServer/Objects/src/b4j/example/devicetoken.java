package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class devicetoken extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.StandardBA("b4j.example", "b4j.example.devicetoken", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.main _main = null;
public b4j.example.iosfeedback _iosfeedback = null;
public b4j.example.iospush _iospush = null;
public b4j.example.httputils2service _httputils2service = null;
public b4j.example.webutils _webutils = null;
public b4j.example.androidpush _androidpush = null;
public b4j.example.dbutils _dbutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _handle(anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
String _token = "";
int _devicetype = 0;
 //BA.debugLineNum = 10;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
 //BA.debugLineNum = 11;BA.debugLine="Dim token As String = req.GetParameter(\"token\")";
_token = _req.GetParameter("token");
 //BA.debugLineNum = 12;BA.debugLine="Dim deviceType As Int = req.GetParameter(\"type\")";
_devicetype = (int)(Double.parseDouble(_req.GetParameter("type")));
 //BA.debugLineNum = 13;BA.debugLine="Main.db.BeginTransaction";
_main._db.BeginTransaction();
 //BA.debugLineNum = 14;BA.debugLine="Try";
try { //BA.debugLineNum = 15;BA.debugLine="Main.db.ExecNonQuery2(\"DELETE FROM tokens WHERE";
_main._db.ExecNonQuery2("DELETE FROM tokens WHERE token = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_token)}));
 //BA.debugLineNum = 16;BA.debugLine="Main.db.ExecNonQuery2(\"INSERT INTO tokens VALUES";
_main._db.ExecNonQuery2("INSERT INTO tokens VALUES (?, ?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_token),(Object)(_devicetype),(Object)(__c.DateTime.getNow())}));
 //BA.debugLineNum = 18;BA.debugLine="Main.db.TransactionSuccessful";
_main._db.TransactionSuccessful();
 //BA.debugLineNum = 19;BA.debugLine="Log(\"Token added: \" & token)";
__c.Log("Token added: "+_token);
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 21;BA.debugLine="Main.db.Rollback";
_main._db.Rollback();
 };
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
