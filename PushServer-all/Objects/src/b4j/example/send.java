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
public b4j.example.iosfeedback _iosfeedback = null;
public b4j.example.iospush _iospush = null;
public b4j.example.httputils2service _httputils2service = null;
public b4j.example.webutils _webutils = null;
public b4j.example.androidpush _androidpush = null;
public b4j.example.dbutils _dbutils = null;
public String  _class_globals(b4j.example.send __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="send";
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Private Const DAYS_LIMIT As Int = 300";
_days_limit = (int) (300);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public String  _handle(b4j.example.send __ref,anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="send";
if (Debug.shouldDelegate(ba, "handle"))
	return (String) Debug.delegate(ba, "handle", new Object[] {_req,_resp});
b4j.example.iospush._message _m = null;
anywheresoftware.b4a.objects.collections.List _rows = null;
anywheresoftware.b4a.objects.collections.List _iostokens = null;
anywheresoftware.b4a.objects.collections.List _androidtokens = null;
String[] _row = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="If req.GetParameter(\"password\") <> Main.config.Ge";
if ((_req.GetParameter("password")).equals(BA.ObjectToString(_main._config.Get((Object)("PushServerPassword")))) == false) { 
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="resp.SendError(500, \"Invalid password\")";
_resp.SendError((int) (500),"Invalid password");
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Dim m As Message";
_m = new b4j.example.iospush._message();
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="If IsNumber(req.GetParameter(\"badge\")) Then";
if (__c.IsNumber(_req.GetParameter("badge"))) { 
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="m.Badge = req.GetParameter(\"badge\")";
_m.Badge = (int)(Double.parseDouble(_req.GetParameter("badge")));
 };
RDebugUtils.currentLine=3538954;
 //BA.debugLineNum = 3538954;BA.debugLine="m.Text = req.GetParameter(\"text\")";
_m.Text = _req.GetParameter("text");
RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="m.Sound = True";
_m.Sound = __c.True;
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="m.HighPriority = True";
_m.HighPriority = __c.True;
RDebugUtils.currentLine=3538957;
 //BA.debugLineNum = 3538957;BA.debugLine="m.ExpirationDate = DateTime.Now + DateTime.TicksP";
_m.ExpirationDate = (long) (__c.DateTime.getNow()+__c.DateTime.TicksPerDay);
RDebugUtils.currentLine=3538958;
 //BA.debugLineNum = 3538958;BA.debugLine="Dim rows As List = DBUtils.ExecuteMemoryTable(Mai";
_rows = new anywheresoftware.b4a.objects.collections.List();
_rows = _dbutils._executememorytable(_main._db,"SELECT token, type FROM tokens WHERE updated_time > ? ORDER BY updated_time DESC",new String[]{BA.NumberToString(__c.DateTime.getNow()-__ref._days_limit*__c.DateTime.TicksPerDay)},(int) (0));
RDebugUtils.currentLine=3538961;
 //BA.debugLineNum = 3538961;BA.debugLine="Dim iosTokens, AndroidTokens As List";
_iostokens = new anywheresoftware.b4a.objects.collections.List();
_androidtokens = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3538962;
 //BA.debugLineNum = 3538962;BA.debugLine="iosTokens.Initialize";
_iostokens.Initialize();
RDebugUtils.currentLine=3538963;
 //BA.debugLineNum = 3538963;BA.debugLine="AndroidTokens.Initialize";
_androidtokens.Initialize();
RDebugUtils.currentLine=3538964;
 //BA.debugLineNum = 3538964;BA.debugLine="For Each row() As String In rows";
{
final anywheresoftware.b4a.BA.IterableList group18 = _rows;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_row = (String[])(group18.Get(index18));
RDebugUtils.currentLine=3538965;
 //BA.debugLineNum = 3538965;BA.debugLine="If row(1) = Main.TYPE_IOS Then";
if ((_row[(int) (1)]).equals(BA.NumberToString(_main._type_ios))) { 
RDebugUtils.currentLine=3538966;
 //BA.debugLineNum = 3538966;BA.debugLine="iosTokens.Add(row(0))";
_iostokens.Add((Object)(_row[(int) (0)]));
RDebugUtils.currentLine=3538967;
 //BA.debugLineNum = 3538967;BA.debugLine="If iosTokens.Size > 900 Then";
if (_iostokens.getSize()>900) { 
RDebugUtils.currentLine=3538968;
 //BA.debugLineNum = 3538968;BA.debugLine="CallSubDelayed3(iOSPush, \"SendMessageTo\", iosT";
__c.CallSubDelayed3(ba,(Object)(_iospush.getObject()),"SendMessageTo",(Object)(_iostokens),(Object)(_m));
RDebugUtils.currentLine=3538969;
 //BA.debugLineNum = 3538969;BA.debugLine="Dim iosTokens As List";
_iostokens = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3538970;
 //BA.debugLineNum = 3538970;BA.debugLine="iosTokens.Initialize";
_iostokens.Initialize();
 };
 }else {
RDebugUtils.currentLine=3538973;
 //BA.debugLineNum = 3538973;BA.debugLine="AndroidTokens.Add(row(0))";
_androidtokens.Add((Object)(_row[(int) (0)]));
RDebugUtils.currentLine=3538974;
 //BA.debugLineNum = 3538974;BA.debugLine="If AndroidTokens.Size > 900 Then";
if (_androidtokens.getSize()>900) { 
RDebugUtils.currentLine=3538975;
 //BA.debugLineNum = 3538975;BA.debugLine="CallSubDelayed3(AndroidPush, \"SendMessageTo\",";
__c.CallSubDelayed3(ba,(Object)(_androidpush.getObject()),"SendMessageTo",(Object)(_androidtokens),(Object)(_m));
RDebugUtils.currentLine=3538976;
 //BA.debugLineNum = 3538976;BA.debugLine="Dim AndroidTokens As List";
_androidtokens = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3538977;
 //BA.debugLineNum = 3538977;BA.debugLine="AndroidTokens.Initialize";
_androidtokens.Initialize();
 };
 };
 }
};
RDebugUtils.currentLine=3538981;
 //BA.debugLineNum = 3538981;BA.debugLine="If iosTokens.Size > 0 Then CallSubDelayed3(iOSPus";
if (_iostokens.getSize()>0) { 
__c.CallSubDelayed3(ba,(Object)(_iospush.getObject()),"SendMessageTo",(Object)(_iostokens),(Object)(_m));};
RDebugUtils.currentLine=3538982;
 //BA.debugLineNum = 3538982;BA.debugLine="If AndroidTokens.Size > 0 Then CallSubDelayed3(An";
if (_androidtokens.getSize()>0) { 
__c.CallSubDelayed3(ba,(Object)(_androidpush.getObject()),"SendMessageTo",(Object)(_androidtokens),(Object)(_m));};
RDebugUtils.currentLine=3538984;
 //BA.debugLineNum = 3538984;BA.debugLine="resp.Write(\"Message sent to \" & rows.Size & \" dev";
_resp.Write("Message sent to "+BA.NumberToString(_rows.getSize())+" device(s).");
RDebugUtils.currentLine=3538985;
 //BA.debugLineNum = 3538985;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.send __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="send";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
}