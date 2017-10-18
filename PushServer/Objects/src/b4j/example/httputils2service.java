package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class httputils2service extends Object{
public static httputils2service mostCurrent = new httputils2service();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.httputils2service", null);
		ba.loadHtSubs(httputils2service.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.httputils2service", ba);
		}
	}
    public static Class<?> getObject() {
		return httputils2service.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public static anywheresoftware.b4a.objects.collections.Map _taskidtojob = null;
public static String _tempfolder = "";
public static int _taskcounter = 0;
public static b4j.example.main _main = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.androidpush _androidpush = null;
public static b4j.example.dbutils _dbutils = null;
public static String  _initialize() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", null);
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub Initialize";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If hc.IsInitialized = False Then";
if (_hc.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="TempFolder = File.DirTemp";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirTemp();
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="TaskIdToJob.Initialize";
_taskidtojob.Initialize();
 };
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="End Sub";
return "";
}
public static String  _completejob(int _taskid,boolean _success,String _errormessage) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "completejob"))
	return (String) Debug.delegate(ba, "completejob", new Object[] {_taskid,_success,_errormessage});
b4j.example.httpjob _job = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_taskidtojob.Remove((Object)(_taskid));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="job.success = success";
_job._success = _success;
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage = _errormessage;
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="job.Complete(TaskId)";
_job._complete(null,_taskid);
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "hc_responseerror"))
	return (String) Debug.delegate(ba, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid});
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="If Response <> Null Then";
if (_response!= null) { 
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Log(Response.ErrorResponse)";
anywheresoftware.b4a.keywords.Common.Log(_response.getErrorResponse());
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Response.Release";
_response.Release();
 };
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "hc_responsesuccess"))
	return (String) Debug.delegate(ba, "hc_responsesuccess", new Object[] {_response,_taskid});
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Response.GetAsynchronously(\"response\", File.OpenO";
_response.GetAsynchronously(ba,"response",(java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(_tempfolder,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False).getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "response_streamfinish"))
	return (String) Debug.delegate(ba, "response_streamfinish", new Object[] {_success,_taskid});
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Response_StreamFinish (Success As Boolean, Tas";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_completejob(_taskid,_success,"");
 }else {
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_completejob(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="End Sub";
return "";
}
public static int  _submitjob(b4j.example.httpjob _job) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "submitjob"))
	return (Integer) Debug.delegate(ba, "submitjob", new Object[] {_job});
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub SubmitJob(job As HttpJob) As Int";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="taskCounter = taskCounter + 1";
_taskcounter = (int) (_taskcounter+1);
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
_taskidtojob.Put((Object)(_taskcounter),(Object)(_job));
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._username).equals("") == false && (_job._password).equals("") == false) { 
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
_hc.ExecuteCredentials(ba,_job._getrequest(null),_taskcounter,_job._username,_job._password);
 }else {
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
_hc.Execute(ba,_job._getrequest(null),_taskcounter);
 };
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Return taskCounter";
if (true) return _taskcounter;
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="End Sub";
return 0;
}
}