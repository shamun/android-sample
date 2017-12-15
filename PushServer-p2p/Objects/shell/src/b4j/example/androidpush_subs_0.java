package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class androidpush_subs_0 {


public static RemoteObject  _jobdone(RemoteObject _j) throws Exception{
try {
		Debug.PushSubsStack("JobDone (androidpush) ","androidpush",9,androidpush.ba,androidpush.mostCurrent,25);
if (RapidSub.canDelegate("jobdone")) return b4j.example.androidpush.remoteMe.runUserSub(false, "androidpush","jobdone", _j);
Debug.locals.put("j", _j);
 BA.debugLineNum = 25;BA.debugLine="Private Sub JobDone(j As HttpJob)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="If j.Success Then";
Debug.ShouldStop(33554432);
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 27;BA.debugLine="Log(\"Message was sent successfully\")";
Debug.ShouldStop(67108864);
androidpush.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Message was sent successfully")));
 }else {
 BA.debugLineNum = 29;BA.debugLine="Log(\"Error sending Android message: \" & j.ErrorM";
Debug.ShouldStop(268435456);
androidpush.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error sending Android message: "),_j.getField(true,"_errormessage"))));
 };
 BA.debugLineNum = 31;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runClassMethod (b4j.example.httpjob.class, "_release");
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sendmessageto(RemoteObject _devices,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("SendMessageTo (androidpush) ","androidpush",9,androidpush.ba,androidpush.mostCurrent,6);
if (RapidSub.canDelegate("sendmessageto")) return b4j.example.androidpush.remoteMe.runUserSub(false, "androidpush","sendmessageto", _devices, _msg);
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _job = RemoteObject.declareNull("b4j.example.httpjob");
Debug.locals.put("Devices", _devices);
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 6;BA.debugLine="Public Sub SendMessageTo(Devices As List, msg As M";
Debug.ShouldStop(32);
 BA.debugLineNum = 8;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(128);
_json = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 9;BA.debugLine="Dim m As Map";
Debug.ShouldStop(256);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 10;BA.debugLine="m.Initialize";
Debug.ShouldStop(512);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 11;BA.debugLine="m.Put(\"registration_ids\", Devices)";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("registration_ids"))),(Object)((_devices.getObject())));
 BA.debugLineNum = 12;BA.debugLine="Dim data As Map";
Debug.ShouldStop(2048);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 13;BA.debugLine="data.Initialize";
Debug.ShouldStop(4096);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 14;BA.debugLine="data.Put(\"data\", msg.Text)";
Debug.ShouldStop(8192);
_data.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_msg.getField(true,"Text"))));
 BA.debugLineNum = 16;BA.debugLine="m.Put(\"data\", data)";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_data.getObject())));
 BA.debugLineNum = 17;BA.debugLine="json.Initialize(m)";
Debug.ShouldStop(65536);
_json.runVoidMethod ("Initialize",(Object)(_m));
 BA.debugLineNum = 18;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(131072);
_job = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 19;BA.debugLine="Job.Initialize(\"send message\", Me)";
Debug.ShouldStop(262144);
_job.runClassMethod (b4j.example.httpjob.class, "_initialize",androidpush.ba,(Object)(BA.ObjectToString("send message")),(Object)(androidpush.getObject()));
 BA.debugLineNum = 20;BA.debugLine="Job.PostString(\"https://android.googleapis.com/gc";
Debug.ShouldStop(524288);
_job.runClassMethod (b4j.example.httpjob.class, "_poststring",(Object)(BA.ObjectToString("https://android.googleapis.com/gcm/send")),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 21;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4j.example.httpjob.class, "_getrequest").runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 22;BA.debugLine="Job.GetRequest.SetHeader(\"Authorization\", \"key=\"";
Debug.ShouldStop(2097152);
_job.runClassMethod (b4j.example.httpjob.class, "_getrequest").runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("key="),androidpush._main._config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AndroidApiKey")))))));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}