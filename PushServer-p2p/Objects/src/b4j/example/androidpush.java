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
public static b4j.example.iospush _iospush = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.dbutils _dbutils = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _jobdone(b4j.example.httpjob _j) throws Exception{
RDebugUtils.currentModule="androidpush";
if (Debug.shouldDelegate(ba, "jobdone"))
	return (String) Debug.delegate(ba, "jobdone", new Object[] {_j});
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub JobDone(j As HttpJob)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="If j.Success Then";
if (_j._success) { 
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Log(\"Message was sent successfully\")";
anywheresoftware.b4a.keywords.Common.Log("Message was sent successfully");
 }else {
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Log(\"Error sending Android message: \" & j.ErrorM";
anywheresoftware.b4a.keywords.Common.Log("Error sending Android message: "+_j._errormessage);
 };
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="j.Release";
_j._release(null);
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub SendMessageTo(Devices As List, msg As M";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="m.Put(\"registration_ids\", Devices)";
_m.Put((Object)("registration_ids"),(Object)(_devices.getObject()));
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="data.Put(\"data\", msg.Text)";
_data.Put((Object)("data"),(Object)(_msg.Text));
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="m.Put(\"data\", data)";
_m.Put((Object)("data"),(Object)(_data.getObject()));
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="json.Initialize(m)";
_json.Initialize(_m);
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="Dim Job As HttpJob";
_job = new b4j.example.httpjob();
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="Job.Initialize(\"send message\", Me)";
_job._initialize(null,ba,"send message",androidpush.getObject());
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="Job.PostString(\"https://android.googleapis.com/gc";
_job._poststring(null,"https://android.googleapis.com/gcm/send",_json.ToString());
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="Job.GetRequest.SetHeader(\"Authorization\", \"key=\"";
_job._getrequest(null).SetHeader("Authorization","key="+BA.ObjectToString(_main._config.Get((Object)("AndroidApiKey"))));
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="End Sub";
return "";
}
}