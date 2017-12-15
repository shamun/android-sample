package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class httputils2service_subs_0 {


public static RemoteObject  _completejob(RemoteObject _taskid,RemoteObject _success,RemoteObject _errormessage) throws Exception{
try {
		Debug.PushSubsStack("CompleteJob (httputils2service) ","httputils2service",4,httputils2service.ba,httputils2service.mostCurrent,49);
if (RapidSub.canDelegate("completejob")) return b4j.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","completejob", _taskid, _success, _errormessage);
RemoteObject _job = RemoteObject.declareNull("b4j.example.httpjob");
Debug.locals.put("TaskId", _taskid);
Debug.locals.put("success", _success);
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 49;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
Debug.ShouldStop(131072);
_job = (httputils2service._taskidtojob.runMethod(false,"Get",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 51;BA.debugLine="TaskIdToJob.Remove(TaskId)";
Debug.ShouldStop(262144);
httputils2service._taskidtojob.runVoidMethod ("Remove",(Object)((_taskid)));
 BA.debugLineNum = 52;BA.debugLine="job.success = success";
Debug.ShouldStop(524288);
_job.setField ("_success",_success);
 BA.debugLineNum = 53;BA.debugLine="job.errorMessage = errorMessage";
Debug.ShouldStop(1048576);
_job.setField ("_errormessage",_errormessage);
 BA.debugLineNum = 54;BA.debugLine="job.Complete(TaskId)";
Debug.ShouldStop(2097152);
_job.runClassMethod (b4j.example.httpjob.class, "_complete",(Object)(_taskid));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responseerror(RemoteObject _response,RemoteObject _reason,RemoteObject _statuscode,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseError (httputils2service) ","httputils2service",4,httputils2service.ba,httputils2service.mostCurrent,41);
if (RapidSub.canDelegate("hc_responseerror")) return b4j.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responseerror", _response, _reason, _statuscode, _taskid);
Debug.locals.put("Response", _response);
Debug.locals.put("Reason", _reason);
Debug.locals.put("StatusCode", _statuscode);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 41;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="If Response <> Null Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("N",_response)) { 
 BA.debugLineNum = 43;BA.debugLine="Log(Response.ErrorResponse)";
Debug.ShouldStop(1024);
httputils2service.__c.runVoidMethod ("Log",(Object)(_response.runMethod(true,"getErrorResponse")));
 BA.debugLineNum = 44;BA.debugLine="Response.Release";
Debug.ShouldStop(2048);
_response.runVoidMethod ("Release");
 };
 BA.debugLineNum = 46;BA.debugLine="CompleteJob(TaskId, False, Reason)";
Debug.ShouldStop(8192);
_completejob(_taskid,httputils2service.__c.getField(true,"False"),_reason);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responsesuccess(RemoteObject _response,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseSuccess (httputils2service) ","httputils2service",4,httputils2service.ba,httputils2service.mostCurrent,28);
if (RapidSub.canDelegate("hc_responsesuccess")) return b4j.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responsesuccess", _response, _taskid);
Debug.locals.put("Response", _response);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 28;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Response.GetAsynchronously(\"response\", File.OpenO";
Debug.ShouldStop(268435456);
_response.runVoidMethod ("GetAsynchronously",httputils2service.ba,(Object)(BA.ObjectToString("response")),(Object)((httputils2service.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(httputils2service._tempfolder),(Object)(BA.NumberToString(_taskid)),(Object)(httputils2service.__c.getField(true,"False"))).getObject())),(Object)(httputils2service.__c.getField(true,"True")),(Object)(_taskid));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize() throws Exception{
try {
		Debug.PushSubsStack("Initialize (httputils2service) ","httputils2service",4,httputils2service.ba,httputils2service.mostCurrent,9);
if (RapidSub.canDelegate("initialize")) return b4j.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","initialize");
 BA.debugLineNum = 9;BA.debugLine="Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="If hc.IsInitialized = False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",httputils2service._hc.runMethod(true,"IsInitialized"),httputils2service.__c.getField(true,"False"))) { 
 BA.debugLineNum = 11;BA.debugLine="TempFolder = File.DirTemp";
Debug.ShouldStop(1024);
httputils2service._tempfolder = httputils2service.__c.getField(false,"File").runMethod(true,"getDirTemp");
 BA.debugLineNum = 12;BA.debugLine="hc.Initialize(\"hc\")";
Debug.ShouldStop(2048);
httputils2service._hc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("hc")));
 BA.debugLineNum = 13;BA.debugLine="TaskIdToJob.Initialize";
Debug.ShouldStop(4096);
httputils2service._taskidtojob.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
 //BA.debugLineNum = 3;BA.debugLine="Private hc As OkHttpClient";
httputils2service._hc = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
 //BA.debugLineNum = 4;BA.debugLine="Private TaskIdToJob As Map";
httputils2service._taskidtojob = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 5;BA.debugLine="Public TempFolder As String";
httputils2service._tempfolder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 6;BA.debugLine="Private taskCounter As Int";
httputils2service._taskcounter = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _response_streamfinish(RemoteObject _success,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("Response_StreamFinish (httputils2service) ","httputils2service",4,httputils2service.ba,httputils2service.mostCurrent,33);
if (RapidSub.canDelegate("response_streamfinish")) return b4j.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","response_streamfinish", _success, _taskid);
Debug.locals.put("Success", _success);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 33;BA.debugLine="Sub Response_StreamFinish (Success As Boolean, Tas";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="If Success Then";
Debug.ShouldStop(2);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 35;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
Debug.ShouldStop(4);
_completejob(_taskid,_success,RemoteObject.createImmutable(""));
 }else {
 BA.debugLineNum = 37;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
Debug.ShouldStop(16);
_completejob(_taskid,_success,httputils2service.__c.runMethod(false,"LastException",httputils2service.ba).runMethod(true,"getMessage"));
 };
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _submitjob(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("SubmitJob (httputils2service) ","httputils2service",4,httputils2service.ba,httputils2service.mostCurrent,17);
if (RapidSub.canDelegate("submitjob")) return b4j.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","submitjob", _job);
Debug.locals.put("job", _job);
 BA.debugLineNum = 17;BA.debugLine="Public Sub SubmitJob(job As HttpJob) As Int";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="taskCounter = taskCounter + 1";
Debug.ShouldStop(131072);
httputils2service._taskcounter = RemoteObject.solve(new RemoteObject[] {httputils2service._taskcounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 19;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
Debug.ShouldStop(262144);
httputils2service._taskidtojob.runVoidMethod ("Put",(Object)((httputils2service._taskcounter)),(Object)((_job)));
 BA.debugLineNum = 20;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_job.getField(true,"_username"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_job.getField(true,"_password"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 21;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
Debug.ShouldStop(1048576);
httputils2service._hc.runVoidMethod ("ExecuteCredentials",httputils2service.ba,(Object)(_job.runClassMethod (b4j.example.httpjob.class, "_getrequest")),(Object)(httputils2service._taskcounter),(Object)(_job.getField(true,"_username")),(Object)(_job.getField(true,"_password")));
 }else {
 BA.debugLineNum = 23;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
Debug.ShouldStop(4194304);
httputils2service._hc.runVoidMethod ("Execute",httputils2service.ba,(Object)(_job.runClassMethod (b4j.example.httpjob.class, "_getrequest")),(Object)(httputils2service._taskcounter));
 };
 BA.debugLineNum = 25;BA.debugLine="Return taskCounter";
Debug.ShouldStop(16777216);
if (true) return httputils2service._taskcounter;
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}