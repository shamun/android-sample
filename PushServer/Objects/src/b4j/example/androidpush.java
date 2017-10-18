package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class androidpush extends Object{
public static androidpush mostCurrent = new androidpush();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.androidpush", null);
		ba.loadHtSubs(androidpush.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.androidpush", ba);
		}
	}
    public static Class<?> getObject() {
		return androidpush.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.main _main = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.dbutils _dbutils = null;
public static String  _jobdone(b4j.example.httpjob _j) throws Exception{
RDebugUtils.currentModule="androidpush";
if (Debug.shouldDelegate(ba, "jobdone"))
	return (String) Debug.delegate(ba, "jobdone", new Object[] {_j});
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub JobDone(j As HttpJob)";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="If j.Success Then";
if (_j._success) { 
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Log(\"Message was sent successfully\")";
anywheresoftware.b4a.keywords.Common.Log("Message was sent successfully");
 }else {
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Log(\"Error sending Android message: \" & j.ErrorM";
anywheresoftware.b4a.keywords.Common.Log("Error sending Android message: "+_j._errormessage);
 };
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="j.Release";
_j._release(null);
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="End Sub";
return "";
}
public static String  _sendmessageto(anywheresoftware.b4a.objects.collections.List _devices,b4j.example.iospush._message _msg) throws Exception{
RDebugUtils.currentModule="androidpush";
if (Debug.shouldDelegate(ba, "sendmessageto"))
	return (String) Debug.delegate(ba, "sendmessageto", new Object[] {_devices,_msg});
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
b4j.example.httpjob _job = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub SendMessageTo(Devices As List, msg As M";
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="m.Put(\"registration_ids\", Devices)";
_m.Put((Object)("registration_ids"),(Object)(_devices.getObject()));
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="data.Put(\"data\", msg.Text)";
_data.Put((Object)("data"),(Object)(_msg.Text));
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="m.Put(\"data\", data)";
_m.Put((Object)("data"),(Object)(_data.getObject()));
RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="json.Initialize(m)";
_json.Initialize(_m);
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="Dim Job As HttpJob";
_job = new b4j.example.httpjob();
RDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="Job.Initialize(\"send message\", Me)";
_job._initialize(null,ba,"send message",androidpush.getObject());
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="Job.PostString(\"https://android.googleapis.com/gc";
_job._poststring(null,"https://android.googleapis.com/gcm/send",_json.ToString());
RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="Job.GetRequest.SetHeader(\"Authorization\", \"key=\"";
_job._getrequest(null).SetHeader("Authorization","key="+BA.ObjectToString(_main._config.Get((Object)("AndroidApiKey"))));
RDebugUtils.currentLine=4128785;
 //BA.debugLineNum = 4128785;BA.debugLine="End Sub";
return "";
}
}