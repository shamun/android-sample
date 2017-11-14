package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class androidpush extends Object{
public static androidpush mostCurrent = new androidpush();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.StandardBA("b4j.example", "b4j.example.androidpush", null);
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
 //BA.debugLineNum = 25;BA.debugLine="Private Sub JobDone(j As HttpJob)";
 //BA.debugLineNum = 26;BA.debugLine="If j.Success Then";
if (_j._success) { 
 //BA.debugLineNum = 27;BA.debugLine="Log(\"Message was sent successfully\")";
anywheresoftware.b4a.keywords.Common.Log("Message was sent successfully");
 }else {
 //BA.debugLineNum = 29;BA.debugLine="Log(\"Error sending Android message: \" & j.ErrorM";
anywheresoftware.b4a.keywords.Common.Log("Error sending Android message: "+_j._errormessage);
 };
 //BA.debugLineNum = 31;BA.debugLine="j.Release";
_j._release();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public static String  _sendmessageto(anywheresoftware.b4a.objects.collections.List _devices,b4j.example.iospush._message _msg) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
b4j.example.httpjob _job = null;
 //BA.debugLineNum = 6;BA.debugLine="Public Sub SendMessageTo(Devices As List, msg As M";
 //BA.debugLineNum = 8;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 9;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 11;BA.debugLine="m.Put(\"registration_ids\", Devices)";
_m.Put((Object)("registration_ids"),(Object)(_devices.getObject()));
 //BA.debugLineNum = 12;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="data.Put(\"data\", msg.Text)";
_data.Put((Object)("data"),(Object)(_msg.Text));
 //BA.debugLineNum = 16;BA.debugLine="m.Put(\"data\", data)";
_m.Put((Object)("data"),(Object)(_data.getObject()));
 //BA.debugLineNum = 17;BA.debugLine="json.Initialize(m)";
_json.Initialize(_m);
 //BA.debugLineNum = 18;BA.debugLine="Dim Job As HttpJob";
_job = new b4j.example.httpjob();
 //BA.debugLineNum = 19;BA.debugLine="Job.Initialize(\"send message\", Me)";
_job._initialize(ba,"send message",androidpush.getObject());
 //BA.debugLineNum = 20;BA.debugLine="Job.PostString(\"https://android.googleapis.com/gc";
_job._poststring("https://android.googleapis.com/gcm/send",_json.ToString());
 //BA.debugLineNum = 21;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest().SetContentType("application/json");
 //BA.debugLineNum = 22;BA.debugLine="Job.GetRequest.SetHeader(\"Authorization\", \"key=\"";
_job._getrequest().SetHeader("Authorization","key="+BA.ObjectToString(_main._config.Get((Object)("AndroidApiKey"))));
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
}
