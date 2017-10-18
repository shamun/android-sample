package org.tpt.push;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_httputils2service_subs_0 {


public static RemoteObject  _completejob(RemoteObject _taskid,RemoteObject _success,RemoteObject _errormessage,RemoteObject _res) throws Exception{
try {
		Debug.PushSubsStack("CompleteJob (httputils2service) ","httputils2service",2,b4i_httputils2service.ba,b4i_httputils2service.mostCurrent,33);
if (RapidSub.canDelegate("completejob")) return b4i_httputils2service.remoteMe.runUserSub(false, "httputils2service","completejob", _taskid, _success, _errormessage, _res);
RemoteObject _job = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("TaskId", _taskid);
Debug.locals.put("success", _success);
Debug.locals.put("errorMessage", _errormessage);
Debug.locals.put("res", _res);
 BA.debugLineNum = 33;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
Debug.ShouldStop(2);
_job = (b4i_httputils2service._taskidtojob.runMethod(false,"Get:",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 35;BA.debugLine="TaskIdToJob.Remove(TaskId)";
Debug.ShouldStop(4);
b4i_httputils2service._taskidtojob.runVoidMethod ("Remove:",(Object)((_taskid)));
 BA.debugLineNum = 36;BA.debugLine="job.success = success";
Debug.ShouldStop(8);
_job.setField ("_success",_success);
 BA.debugLineNum = 37;BA.debugLine="job.errorMessage = errorMessage";
Debug.ShouldStop(16);
_job.setField ("_errormessage",_errormessage);
 BA.debugLineNum = 38;BA.debugLine="job.Complete(res)";
Debug.ShouldStop(32);
_job.runClassMethod (b4i_httpjob.class, "_complete:",(Object)(_res));
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
public static RemoteObject  _hc_responseerror(RemoteObject _response,RemoteObject _reason,RemoteObject _statuscode,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseError (httputils2service) ","httputils2service",2,b4i_httputils2service.ba,b4i_httputils2service.mostCurrent,24);
if (RapidSub.canDelegate("hc_responseerror")) return b4i_httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responseerror", _response, _reason, _statuscode, _taskid);
Debug.locals.put("Response", _response);
Debug.locals.put("Reason", _reason);
Debug.locals.put("StatusCode", _statuscode);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 24;BA.debugLine="Sub hc_ResponseError (Response As HttpResponse, Re";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Log(\"Error response: \" & Response.GetString & \",";
Debug.ShouldStop(16777216);
b4i_main.__c.runVoidMethod ("Log:",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error response: "),_response.runMethod(true,"GetString"),RemoteObject.createImmutable(", status code: "),_statuscode)));
 BA.debugLineNum = 26;BA.debugLine="CompleteJob(TaskId, False, Reason, Null)";
Debug.ShouldStop(33554432);
_completejob(_taskid,b4i_main.__c.runMethod(true,"False"),_reason,(b4i_main.__c.runMethod(false,"Null")));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("hc_ResponseSuccess (httputils2service) ","httputils2service",2,b4i_httputils2service.ba,b4i_httputils2service.mostCurrent,29);
if (RapidSub.canDelegate("hc_responsesuccess")) return b4i_httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responsesuccess", _response, _taskid);
Debug.locals.put("Response", _response);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 29;BA.debugLine="Sub hc_ResponseSuccess (Response As HttpResponse,";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="CompleteJob(TaskId, True, \"\", Response)";
Debug.ShouldStop(536870912);
_completejob(_taskid,b4i_main.__c.runMethod(true,"True"),BA.ObjectToString(""),_response);
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
		Debug.PushSubsStack("initialize (httputils2service) ","httputils2service",2,b4i_httputils2service.ba,b4i_httputils2service.mostCurrent,9);
if (RapidSub.canDelegate("initialize")) return b4i_httputils2service.remoteMe.runUserSub(false, "httputils2service","initialize");
 BA.debugLineNum = 9;BA.debugLine="Private Sub initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="hc.initialize(\"hc\")";
Debug.ShouldStop(512);
b4i_httputils2service._hc.runVoidMethod ("Initialize::",b4i_httputils2service.ba,(Object)(RemoteObject.createImmutable("hc")));
 BA.debugLineNum = 11;BA.debugLine="TaskIdToJob.initialize";
Debug.ShouldStop(1024);
b4i_httputils2service._taskidtojob.runVoidMethod ("Initialize");
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 3;BA.debugLine="Private hc As HttpClient";
b4i_httputils2service._hc = RemoteObject.createNew ("B4IHttp");
 //BA.debugLineNum = 4;BA.debugLine="Private TaskIdToJob As Map";
b4i_httputils2service._taskidtojob = RemoteObject.createNew ("B4IMap");
 //BA.debugLineNum = 5;BA.debugLine="Public TempFolder As String";
b4i_httputils2service._tempfolder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 6;BA.debugLine="Private taskCounter As Int";
b4i_httputils2service._taskcounter = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _submitjob(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("SubmitJob (httputils2service) ","httputils2service",2,b4i_httputils2service.ba,b4i_httputils2service.mostCurrent,13);
if (RapidSub.canDelegate("submitjob")) return b4i_httputils2service.remoteMe.runUserSub(false, "httputils2service","submitjob", _job);
Debug.locals.put("job", _job);
 BA.debugLineNum = 13;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="If hc.IsInitialized = False Then initialize";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",b4i_httputils2service._hc.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
_initialize();};
 BA.debugLineNum = 15;BA.debugLine="taskCounter = taskCounter + 1";
Debug.ShouldStop(16384);
b4i_httputils2service._taskcounter = RemoteObject.solve(new RemoteObject[] {b4i_httputils2service._taskcounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 16;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
Debug.ShouldStop(32768);
b4i_httputils2service._taskidtojob.runVoidMethod ("Put::",(Object)((b4i_httputils2service._taskcounter)),(Object)((_job)));
 BA.debugLineNum = 17;BA.debugLine="If job.Username <> \"\" AND job.Password <> \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",_job.getField(true,"_username"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_job.getField(true,"_password"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 18;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
Debug.ShouldStop(131072);
b4i_httputils2service._hc.runVoidMethod ("ExecuteCredentials::::",(Object)(_job.runClassMethod (b4i_httpjob.class, "_getrequest")),(Object)(b4i_httputils2service._taskcounter),(Object)(_job.getField(true,"_username")),(Object)(_job.getField(true,"_password")));
 }else {
 BA.debugLineNum = 20;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
Debug.ShouldStop(524288);
b4i_httputils2service._hc.runVoidMethod ("Execute::",(Object)(_job.runClassMethod (b4i_httpjob.class, "_getrequest")),(Object)(b4i_httputils2service._taskcounter));
 };
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}