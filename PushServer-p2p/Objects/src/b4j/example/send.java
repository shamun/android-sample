package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class send extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.send", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.send.class).invoke(this, new Object[] {null});
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
public int _days_limit = 0;
public b4j.example.main _main = null;
public b4j.example.iospush _iospush = null;
public b4j.example.iosfeedback _iosfeedback = null;
public b4j.example.webutils _webutils = null;
public b4j.example.androidpush _androidpush = null;
public b4j.example.dbutils _dbutils = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _class_globals(b4j.example.send __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="send";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Private Const DAYS_LIMIT As Int = 300";
_days_limit = (int) (300);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public String  _handle(b4j.example.send __ref,anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="send";
if (Debug.shouldDelegate(ba, "handle"))
	return (String) Debug.delegate(ba, "handle", new Object[] {_req,_resp});
b4j.example.iospush._message _m = null;
String _userid = "";
String _username = "";
anywheresoftware.b4a.objects.collections.List _rows = null;
anywheresoftware.b4a.objects.collections.List _iostokens = null;
anywheresoftware.b4a.objects.collections.List _androidtokens = null;
String[] _row = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If req.GetParameter(\"password\") <> Main.config.Ge";
if ((_req.GetParameter("password")).equals(BA.ObjectToString(_main._config.Get((Object)("PushServerPassword")))) == false) { 
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="resp.SendError(500, \"Invalid password\")";
_resp.SendError((int) (500),"Invalid password");
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="Dim m As Message";
_m = new b4j.example.iospush._message();
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="If IsNumber(req.GetParameter(\"badge\")) Then";
if (__c.IsNumber(_req.GetParameter("badge"))) { 
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="m.Badge = req.GetParameter(\"badge\")";
_m.Badge = (int)(Double.parseDouble(_req.GetParameter("badge")));
 };
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="m.Text = req.GetParameter(\"text\")";
_m.Text = _req.GetParameter("text");
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="m.Sound = True";
_m.Sound = __c.True;
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="m.HighPriority = True";
_m.HighPriority = __c.True;
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="m.ExpirationDate = DateTime.Now + DateTime.TicksP";
_m.ExpirationDate = (long) (__c.DateTime.getNow()+__c.DateTime.TicksPerDay);
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="Dim userID As String = req.GetParameter(\"userid\")";
_userid = _req.GetParameter("userid");
RDebugUtils.currentLine=327697;
 //BA.debugLineNum = 327697;BA.debugLine="Dim userName As String = req.GetParameter(\"userna";
_username = _req.GetParameter("username");
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="Dim rows As List = DBUtils.ExecuteMemoryTable(Mai";
_rows = new anywheresoftware.b4a.objects.collections.List();
_rows = _dbutils._executememorytable(_main._db,"SELECT token, type, userid, username FROM tokens WHERE updated_time > ? and userid=? and username=? ORDER BY updated_time DESC",new String[]{BA.NumberToString(__c.DateTime.getNow()-__ref._days_limit*__c.DateTime.TicksPerDay),_userid,_username},(int) (0));
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="Dim iosTokens, AndroidTokens As List";
_iostokens = new anywheresoftware.b4a.objects.collections.List();
_androidtokens = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=327703;
 //BA.debugLineNum = 327703;BA.debugLine="iosTokens.Initialize";
_iostokens.Initialize();
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="AndroidTokens.Initialize";
_androidtokens.Initialize();
RDebugUtils.currentLine=327705;
 //BA.debugLineNum = 327705;BA.debugLine="For Each row() As String In rows";
{
final anywheresoftware.b4a.BA.IterableList group20 = _rows;
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_row = (String[])(group20.Get(index20));
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="If row(1) = Main.TYPE_IOS Then";
if ((_row[(int) (1)]).equals(BA.NumberToString(_main._type_ios))) { 
RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="iosTokens.Add(row(0))";
_iostokens.Add((Object)(_row[(int) (0)]));
RDebugUtils.currentLine=327708;
 //BA.debugLineNum = 327708;BA.debugLine="If iosTokens.Size > 900 Then";
if (_iostokens.getSize()>900) { 
RDebugUtils.currentLine=327709;
 //BA.debugLineNum = 327709;BA.debugLine="CallSubDelayed3(iOSPush, \"SendMessageTo\", iosT";
__c.CallSubDelayed3(ba,(Object)(_iospush.getObject()),"SendMessageTo",(Object)(_iostokens),(Object)(_m));
RDebugUtils.currentLine=327710;
 //BA.debugLineNum = 327710;BA.debugLine="Dim iosTokens As List";
_iostokens = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="iosTokens.Initialize";
_iostokens.Initialize();
 };
 }else {
RDebugUtils.currentLine=327714;
 //BA.debugLineNum = 327714;BA.debugLine="AndroidTokens.Add(row(0))";
_androidtokens.Add((Object)(_row[(int) (0)]));
RDebugUtils.currentLine=327715;
 //BA.debugLineNum = 327715;BA.debugLine="If AndroidTokens.Size > 900 Then";
if (_androidtokens.getSize()>900) { 
RDebugUtils.currentLine=327716;
 //BA.debugLineNum = 327716;BA.debugLine="CallSubDelayed3(AndroidPush, \"SendMessageTo\",";
__c.CallSubDelayed3(ba,(Object)(_androidpush.getObject()),"SendMessageTo",(Object)(_androidtokens),(Object)(_m));
RDebugUtils.currentLine=327717;
 //BA.debugLineNum = 327717;BA.debugLine="Dim AndroidTokens As List";
_androidtokens = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=327718;
 //BA.debugLineNum = 327718;BA.debugLine="AndroidTokens.Initialize";
_androidtokens.Initialize();
 };
 };
 }
};
RDebugUtils.currentLine=327722;
 //BA.debugLineNum = 327722;BA.debugLine="If iosTokens.Size > 0 Then CallSubDelayed3(iOSPus";
if (_iostokens.getSize()>0) { 
__c.CallSubDelayed3(ba,(Object)(_iospush.getObject()),"SendMessageTo",(Object)(_iostokens),(Object)(_m));};
RDebugUtils.currentLine=327723;
 //BA.debugLineNum = 327723;BA.debugLine="If AndroidTokens.Size > 0 Then CallSubDelayed3(An";
if (_androidtokens.getSize()>0) { 
__c.CallSubDelayed3(ba,(Object)(_androidpush.getObject()),"SendMessageTo",(Object)(_androidtokens),(Object)(_m));};
RDebugUtils.currentLine=327725;
 //BA.debugLineNum = 327725;BA.debugLine="resp.Write(\"Message sent to \" & rows.Size & \" dev";
_resp.Write("Message sent to "+BA.NumberToString(_rows.getSize())+" device(s).");
RDebugUtils.currentLine=327726;
 //BA.debugLineNum = 327726;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.send __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="send";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
}