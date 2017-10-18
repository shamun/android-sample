package org.tpt.push;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_httpjob_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public JobName As String";
b4i_httpjob._jobname = RemoteObject.createImmutable("");__ref.setField("_jobname",b4i_httpjob._jobname);
 //BA.debugLineNum = 5;BA.debugLine="Public Success As Boolean";
b4i_httpjob._success = RemoteObject.createImmutable(false);__ref.setField("_success",b4i_httpjob._success);
 //BA.debugLineNum = 6;BA.debugLine="Public Username, Password As String";
b4i_httpjob._username = RemoteObject.createImmutable("");__ref.setField("_username",b4i_httpjob._username);
b4i_httpjob._password = RemoteObject.createImmutable("");__ref.setField("_password",b4i_httpjob._password);
 //BA.debugLineNum = 7;BA.debugLine="Public ErrorMessage As String";
b4i_httpjob._errormessage = RemoteObject.createImmutable("");__ref.setField("_errormessage",b4i_httpjob._errormessage);
 //BA.debugLineNum = 8;BA.debugLine="Private target As Object";
b4i_httpjob._target = RemoteObject.createNew ("NSObject");__ref.setField("_target",b4i_httpjob._target);
 //BA.debugLineNum = 9;BA.debugLine="Private req As HttpRequest";
b4i_httpjob._req = RemoteObject.createNew ("B4IHttpRequest");__ref.setField("_req",b4i_httpjob._req);
 //BA.debugLineNum = 10;BA.debugLine="Public Tag As Object";
b4i_httpjob._tag = RemoteObject.createNew ("NSObject");__ref.setField("_tag",b4i_httpjob._tag);
 //BA.debugLineNum = 11;BA.debugLine="Private res As HttpResponse";
b4i_httpjob._res = RemoteObject.createNew ("B4IHttpResponse");__ref.setField("_res",b4i_httpjob._res);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _complete(RemoteObject __ref,RemoteObject _res1) throws Exception{
try {
		Debug.PushSubsStack("Complete (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,69);
if (RapidSub.canDelegate("complete")) return __ref.runUserSub(false, "httpjob","complete", __ref, _res1);
Debug.locals.put("res1", _res1);
 BA.debugLineNum = 69;BA.debugLine="Public Sub Complete (res1 As HttpResponse)";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="res = res1";
Debug.ShouldStop(32);
__ref.setField ("_res",_res1);
 BA.debugLineNum = 71;BA.debugLine="CallSub2(target, \"JobDone\", Me)";
Debug.ShouldStop(64);
b4i_main.__c.runMethodAndSync(false,"CallSub2::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_target")),(Object)(BA.ObjectToString("JobDone")),(Object)(__ref));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download(RemoteObject __ref,RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("Download (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,39);
if (RapidSub.canDelegate("download")) return __ref.runUserSub(false, "httpjob","download", __ref, _link);
Debug.locals.put("Link", _link);
 BA.debugLineNum = 39;BA.debugLine="Public Sub Download(Link As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="req.InitializeGet(Link)";
Debug.ShouldStop(128);
__ref.getField(false,"_req").runVoidMethod ("InitializeGet:",(Object)(_link));
 BA.debugLineNum = 41;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(256);
b4i_main.__c.runVoidMethod ("CallSubDelayed2::::",__ref.getField(false, "bi"),(Object)(((b4i_httpjob._httputils2service).getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download2(RemoteObject __ref,RemoteObject _link,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("Download2 (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,48);
if (RapidSub.canDelegate("download2")) return __ref.runUserSub(false, "httpjob","download2", __ref, _link, _parameters);
RemoteObject _sb = RemoteObject.declareNull("B4IStringBuilder");
RemoteObject _su = RemoteObject.declareNull("iStringUtils");
int _i = 0;
Debug.locals.put("Link", _link);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 48;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(65536);
_sb = RemoteObject.createNew ("B4IStringBuilder");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 50;BA.debugLine="sb.Initialize";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="sb.Append(Link)";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append:",(Object)(_link));
 BA.debugLineNum = 52;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_parameters.getField(true,"Length"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append:",(Object)(RemoteObject.createImmutable("?")));};
 BA.debugLineNum = 53;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(1048576);
_su = RemoteObject.createNew ("iStringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 54;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
Debug.ShouldStop(2097152);
{
final int step6 = 2;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_parameters.getField(true,"Length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 55;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append:",(Object)(RemoteObject.createImmutable("&")));};
 BA.debugLineNum = 56;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
Debug.ShouldStop(8388608);
_sb.runMethod(false,"Append:",(Object)(_su.runMethod(true,"EncodeUrl::",(Object)(_parameters.runMethod(true,"getObjectFast:", BA.numberCast(int.class, _i))),(Object)(RemoteObject.createImmutable("UTF8"))))).runVoidMethod ("Append:",(Object)(RemoteObject.createImmutable("=")));
 BA.debugLineNum = 57;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append:",(Object)(_su.runMethod(true,"EncodeUrl::",(Object)(_parameters.runMethod(true,"getObjectFast:", RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(RemoteObject.createImmutable("UTF8")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 59;BA.debugLine="req.InitializeGet(sb.ToString)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_req").runVoidMethod ("InitializeGet:",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 60;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(134217728);
b4i_main.__c.runVoidMethod ("CallSubDelayed2::::",__ref.getField(false, "bi"),(Object)(((b4i_httpjob._httputils2service).getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbitmap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBitmap (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,90);
if (RapidSub.canDelegate("getbitmap")) return __ref.runUserSub(false, "httpjob","getbitmap", __ref);
RemoteObject _b = RemoteObject.declareNull("B4IBitmap");
 BA.debugLineNum = 90;BA.debugLine="Public Sub GetBitmap As Bitmap";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(67108864);
_b = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("b", _b);
 BA.debugLineNum = 92;BA.debugLine="b.Initialize2(res.GetInputStream)";
Debug.ShouldStop(134217728);
_b.runVoidMethod ("Initialize2:",(Object)(__ref.getField(false,"_res").runMethod(false,"GetInputStream")));
 BA.debugLineNum = 93;BA.debugLine="Return b";
Debug.ShouldStop(268435456);
if (true) return _b;
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getinputstream(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetInputStream (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,96);
if (RapidSub.canDelegate("getinputstream")) return __ref.runUserSub(false, "httpjob","getinputstream", __ref);
 BA.debugLineNum = 96;BA.debugLine="Public Sub GetInputStream As InputStream";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Return res.GetInputStream";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_res").runMethod(false,"GetInputStream");
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrequest(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetRequest (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,64);
if (RapidSub.canDelegate("getrequest")) return __ref.runUserSub(false, "httpjob","getrequest", __ref);
 BA.debugLineNum = 64;BA.debugLine="Public Sub GetRequest As HttpRequest";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Return req";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_req");
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetString (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,80);
if (RapidSub.canDelegate("getstring")) return __ref.runUserSub(false, "httpjob","getstring", __ref);
 BA.debugLineNum = 80;BA.debugLine="Public Sub GetString As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Return GetString2(\"UTF8\")";
Debug.ShouldStop(65536);
if (true) return __ref.runClassMethod (b4i_httpjob.class, "_getstring2:",(Object)(RemoteObject.createImmutable("UTF8")));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstring2(RemoteObject __ref,RemoteObject _encoding) throws Exception{
try {
		Debug.PushSubsStack("GetString2 (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,85);
if (RapidSub.canDelegate("getstring2")) return __ref.runUserSub(false, "httpjob","getstring2", __ref, _encoding);
Debug.locals.put("Encoding", _encoding);
 BA.debugLineNum = 85;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Return res.GetString2(Encoding)";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(false,"_res").runMethod(true,"GetString2:",(Object)(_encoding));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _name,RemoteObject _targetmodule) throws Exception{
try {
		Debug.PushSubsStack("Initialize (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,17);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "httpjob","initialize", __ref, _ba, _name, _targetmodule);
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
Debug.locals.put("Name", _name);
Debug.locals.put("TargetModule", _targetmodule);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="JobName = Name";
Debug.ShouldStop(131072);
__ref.setField ("_jobname",_name);
 BA.debugLineNum = 19;BA.debugLine="target = TargetModule";
Debug.ShouldStop(262144);
__ref.setField ("_target",_targetmodule);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _postbytes(RemoteObject __ref,RemoteObject _link,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("PostBytes (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,27);
if (RapidSub.canDelegate("postbytes")) return __ref.runUserSub(false, "httpjob","postbytes", __ref, _link, _data);
Debug.locals.put("Link", _link);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 27;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="req.InitializePost2(Link, Data)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_req").runVoidMethod ("InitializePost2::",(Object)(_link),(Object)(_data));
 BA.debugLineNum = 29;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(268435456);
b4i_main.__c.runVoidMethod ("CallSubDelayed2::::",__ref.getField(false, "bi"),(Object)(((b4i_httpjob._httputils2service).getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _postfile(RemoteObject __ref,RemoteObject _link,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("PostFile (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,33);
if (RapidSub.canDelegate("postfile")) return __ref.runUserSub(false, "httpjob","postfile", __ref, _link, _dir, _filename);
Debug.locals.put("Link", _link);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 33;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="req.InitializePost(Link, Dir, FileName)";
Debug.ShouldStop(2);
__ref.getField(false,"_req").runVoidMethod ("InitializePost:::",(Object)(_link),(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 35;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(4);
b4i_main.__c.runVoidMethod ("CallSubDelayed2::::",__ref.getField(false, "bi"),(Object)(((b4i_httpjob._httputils2service).getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _poststring(RemoteObject __ref,RemoteObject _link,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("PostString (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,22);
if (RapidSub.canDelegate("poststring")) return __ref.runUserSub(false, "httpjob","poststring", __ref, _link, _text);
Debug.locals.put("Link", _link);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 22;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4i_httpjob.class, "_postbytes::",(Object)(_link),(Object)(_text.runMethod(false,"GetBytes:",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _release(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Release (httpjob) ","httpjob",1,__ref.getField(false, "bi"),__ref,75);
if (RapidSub.canDelegate("release")) return __ref.runUserSub(false, "httpjob","release", __ref);
 BA.debugLineNum = 75;BA.debugLine="Public Sub Release";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}