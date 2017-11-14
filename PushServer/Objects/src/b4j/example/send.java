package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class send extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.StandardBA("b4j.example", "b4j.example.send", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public int _days_limit = 0;
public b4j.example.main _main = null;
public b4j.example.iosfeedback _iosfeedback = null;
public b4j.example.iospush _iospush = null;
public b4j.example.httputils2service _httputils2service = null;
public b4j.example.webutils _webutils = null;
public b4j.example.androidpush _androidpush = null;
public b4j.example.dbutils _dbutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Const DAYS_LIMIT As Int = 300";
_days_limit = (int) (300);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _handle(anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
b4j.example.iospush._message _m = null;
anywheresoftware.b4a.objects.collections.List _rows = null;
anywheresoftware.b4a.objects.collections.List _iostokens = null;
anywheresoftware.b4a.objects.collections.List _androidtokens = null;
String[] _row = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
 //BA.debugLineNum = 11;BA.debugLine="If req.GetParameter(\"password\") <> Main.config.Ge";
if ((_req.GetParameter("password")).equals(BA.ObjectToString(_main._config.Get((Object)("PushServerPassword")))) == false) { 
 //BA.debugLineNum = 12;BA.debugLine="resp.SendError(500, \"Invalid password\")";
_resp.SendError((int) (500),"Invalid password");
 //BA.debugLineNum = 13;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 15;BA.debugLine="Dim m As Message";
_m = new b4j.example.iospush._message();
 //BA.debugLineNum = 16;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="If IsNumber(req.GetParameter(\"badge\")) Then";
if (__c.IsNumber(_req.GetParameter("badge"))) { 
 //BA.debugLineNum = 18;BA.debugLine="m.Badge = req.GetParameter(\"badge\")";
_m.Badge = (int)(Double.parseDouble(_req.GetParameter("badge")));
 };
 //BA.debugLineNum = 20;BA.debugLine="m.Text = req.GetParameter(\"text\")";
_m.Text = _req.GetParameter("text");
 //BA.debugLineNum = 21;BA.debugLine="m.Sound = True";
_m.Sound = __c.True;
 //BA.debugLineNum = 22;BA.debugLine="m.HighPriority = True";
_m.HighPriority = __c.True;
 //BA.debugLineNum = 23;BA.debugLine="m.ExpirationDate = DateTime.Now + DateTime.TicksP";
_m.ExpirationDate = (long) (__c.DateTime.getNow()+__c.DateTime.TicksPerDay);
 //BA.debugLineNum = 24;BA.debugLine="Dim rows As List = DBUtils.ExecuteMemoryTable(Mai";
_rows = new anywheresoftware.b4a.objects.collections.List();
_rows = _dbutils._executememorytable(_main._db,"SELECT token, type FROM tokens WHERE updated_time > ? ORDER BY updated_time DESC",new String[]{BA.NumberToString(__c.DateTime.getNow()-_days_limit*__c.DateTime.TicksPerDay)},(int) (0));
 //BA.debugLineNum = 27;BA.debugLine="Dim iosTokens, AndroidTokens As List";
_iostokens = new anywheresoftware.b4a.objects.collections.List();
_androidtokens = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 28;BA.debugLine="iosTokens.Initialize";
_iostokens.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="AndroidTokens.Initialize";
_androidtokens.Initialize();
 //BA.debugLineNum = 30;BA.debugLine="For Each row() As String In rows";
{
final anywheresoftware.b4a.BA.IterableList group18 = _rows;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_row = (String[])(group18.Get(index18));
 //BA.debugLineNum = 31;BA.debugLine="If row(1) = Main.TYPE_IOS Then";
if ((_row[(int) (1)]).equals(BA.NumberToString(_main._type_ios))) { 
 //BA.debugLineNum = 32;BA.debugLine="iosTokens.Add(row(0))";
_iostokens.Add((Object)(_row[(int) (0)]));
 //BA.debugLineNum = 33;BA.debugLine="If iosTokens.Size > 900 Then";
if (_iostokens.getSize()>900) { 
 //BA.debugLineNum = 34;BA.debugLine="CallSubDelayed3(iOSPush, \"SendMessageTo\", iosT";
__c.CallSubDelayed3(ba,(Object)(_iospush.getObject()),"SendMessageTo",(Object)(_iostokens),(Object)(_m));
 //BA.debugLineNum = 35;BA.debugLine="Dim iosTokens As List";
_iostokens = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 36;BA.debugLine="iosTokens.Initialize";
_iostokens.Initialize();
 };
 }else {
 //BA.debugLineNum = 39;BA.debugLine="AndroidTokens.Add(row(0))";
_androidtokens.Add((Object)(_row[(int) (0)]));
 //BA.debugLineNum = 40;BA.debugLine="If AndroidTokens.Size > 900 Then";
if (_androidtokens.getSize()>900) { 
 //BA.debugLineNum = 41;BA.debugLine="CallSubDelayed3(AndroidPush, \"SendMessageTo\",";
__c.CallSubDelayed3(ba,(Object)(_androidpush.getObject()),"SendMessageTo",(Object)(_androidtokens),(Object)(_m));
 //BA.debugLineNum = 42;BA.debugLine="Dim AndroidTokens As List";
_androidtokens = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 43;BA.debugLine="AndroidTokens.Initialize";
_androidtokens.Initialize();
 };
 };
 }
};
 //BA.debugLineNum = 47;BA.debugLine="If iosTokens.Size > 0 Then CallSubDelayed3(iOSPus";
if (_iostokens.getSize()>0) { 
__c.CallSubDelayed3(ba,(Object)(_iospush.getObject()),"SendMessageTo",(Object)(_iostokens),(Object)(_m));};
 //BA.debugLineNum = 48;BA.debugLine="If AndroidTokens.Size > 0 Then CallSubDelayed3(An";
if (_androidtokens.getSize()>0) { 
__c.CallSubDelayed3(ba,(Object)(_androidpush.getObject()),"SendMessageTo",(Object)(_androidtokens),(Object)(_m));};
 //BA.debugLineNum = 50;BA.debugLine="resp.Write(\"Message sent to \" & rows.Size & \" dev";
_resp.Write("Message sent to "+BA.NumberToString(_rows.getSize())+" device(s).");
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
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
