
#import "b4i_httputils2service.h"
#import "b4i_main.h"
#import "b4i_httpjob.h"


@implementation b4i_httputils2service 


+ (instancetype)new {
    static b4i_httputils2service* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4IShellBI alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}
- (int)debugAppId {
    return 5;
}


- (NSString*)  _completejob:(int) _taskid :(BOOL) _success :(NSString*) _errormessage :(B4IHttpResponse*) _res{
[B4IRDebugUtils shared].currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"completejob"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"completejob::::" :@[@(_taskid),@(_success),[B4I nilToNSNull:_errormessage],[B4I nilToNSNull:_res]]]);
b4i_httpjob* _job = nil;
[B4IRDebugUtils shared].currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
[B4IRDebugUtils shared].currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4i_httpjob*)([self._taskidtojob Get:(NSObject*)(@(_taskid))]);
[B4IRDebugUtils shared].currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="TaskIdToJob.Remove(TaskId)";
[self._taskidtojob Remove:(NSObject*)(@(_taskid))];
[B4IRDebugUtils shared].currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="job.success = success";
_job._success = _success;
[B4IRDebugUtils shared].currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage = _errormessage;
[B4IRDebugUtils shared].currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="job.Complete(res)";
[_job _complete:nil :_res];
[B4IRDebugUtils shared].currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _hc_responseerror:(B4IHttpResponse*) _response :(NSString*) _reason :(int) _statuscode :(int) _taskid{
[B4IRDebugUtils shared].currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"hc_responseerror"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"hc_responseerror::::" :@[[B4I nilToNSNull:_response],[B4I nilToNSNull:_reason],@(_statuscode),@(_taskid)]]);
[B4IRDebugUtils shared].currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub hc_ResponseError (Response As HttpResponse, Re";
[B4IRDebugUtils shared].currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Log(\"Error response: \" & Response.GetString & \",";
[self.__c Log:[@[@"Error response: ",[_response GetString],@", status code: ",[self.bi NumberToString:@(_statuscode)]] componentsJoinedByString:@""]];
[B4IRDebugUtils shared].currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="CompleteJob(TaskId, False, Reason, Null)";
[self _completejob:_taskid :[self.__c False] :_reason :(B4IHttpResponse*)([self.__c Null])];
[B4IRDebugUtils shared].currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _hc_responsesuccess:(B4IHttpResponse*) _response :(int) _taskid{
[B4IRDebugUtils shared].currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"hc_responsesuccess"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"hc_responsesuccess::" :@[[B4I nilToNSNull:_response],@(_taskid)]]);
[B4IRDebugUtils shared].currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub hc_ResponseSuccess (Response As HttpResponse,";
[B4IRDebugUtils shared].currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="CompleteJob(TaskId, True, \"\", Response)";
[self _completejob:_taskid :[self.__c True] :@"" :_response];
[B4IRDebugUtils shared].currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize{
[B4IRDebugUtils shared].currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"initialize"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"initialize" :nil]);
[B4IRDebugUtils shared].currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub initialize";
[B4IRDebugUtils shared].currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="hc.initialize(\"hc\")";
[self._hc Initialize:self.bi :@"hc"];
[B4IRDebugUtils shared].currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="TaskIdToJob.initialize";
[self._taskidtojob Initialize];
[B4IRDebugUtils shared].currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self._main=[b4i_main new];
[B4IRDebugUtils shared].currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"process_globals"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);
[B4IRDebugUtils shared].currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Process_Globals";
[B4IRDebugUtils shared].currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Private hc As HttpClient";
self._hc = [B4IHttp new];
[B4IRDebugUtils shared].currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Private TaskIdToJob As Map";
self._taskidtojob = [B4IMap new];
[B4IRDebugUtils shared].currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Public TempFolder As String";
self._tempfolder = @"";
[B4IRDebugUtils shared].currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Private taskCounter As Int";
self._taskcounter = 0;
[B4IRDebugUtils shared].currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _submitjob:(b4i_httpjob*) _job{
[B4IRDebugUtils shared].currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"submitjob"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"submitjob:" :@[[B4I nilToNSNull:_job]]]);
[B4IRDebugUtils shared].currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
[B4IRDebugUtils shared].currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If hc.IsInitialized = False Then initialize";
if ([self._hc IsInitialized]==[self.__c False]) { 
[self _initialize];};
[B4IRDebugUtils shared].currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="taskCounter = taskCounter + 1";
self._taskcounter = (int) (self._taskcounter+1);
[B4IRDebugUtils shared].currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
[self._taskidtojob Put:(NSObject*)(@(self._taskcounter)) :(NSObject*)(_job)];
[B4IRDebugUtils shared].currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="If job.Username <> \"\" AND job.Password <> \"\" Then";
if ([_job._username isEqual:@""] == false && [_job._password isEqual:@""] == false) { 
[B4IRDebugUtils shared].currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
[self._hc ExecuteCredentials:[_job _getrequest:nil] :self._taskcounter :_job._username :_job._password];
 }else {
[B4IRDebugUtils shared].currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
[self._hc Execute:[_job _getrequest:nil] :self._taskcounter];
 };
[B4IRDebugUtils shared].currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="End Sub";
return @"";
}
@end