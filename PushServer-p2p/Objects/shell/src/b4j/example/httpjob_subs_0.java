package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class httpjob_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public JobName As String";
httpjob._jobname = RemoteObject.createImmutable("");__ref.setField("_jobname",httpjob._jobname);
 //BA.debugLineNum = 6;BA.debugLine="Public Success As Boolean";
httpjob._success = RemoteObject.createImmutable(false);__ref.setField("_success",httpjob._success);
 //BA.debugLineNum = 7;BA.debugLine="Public Username, Password As String";
httpjob._username = RemoteObject.createImmutable("");__ref.setField("_username",httpjob._username);
httpjob._password = RemoteObject.createImmutable("");__ref.setField("_password",httpjob._password);
 //BA.debugLineNum = 8;BA.debugLine="Public ErrorMessage As String";
httpjob._errormessage = RemoteObject.createImmutable("");__ref.setField("_errormessage",httpjob._errormessage);
 //BA.debugLineNum = 9;BA.debugLine="Private target As Object";
httpjob._target = RemoteObject.createNew ("Object");__ref.setField("_target",httpjob._target);
 //BA.debugLineNum = 10;BA.debugLine="Private taskId As String";
httpjob._taskid = RemoteObject.createImmutable("");__ref.setField("_taskid",httpjob._taskid);
 //BA.debugLineNum = 11;BA.debugLine="Private req As OkHttpRequest";
httpjob._req = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest");__ref.setField("_req",httpjob._req);
 //BA.debugLineNum = 12;BA.debugLine="Public Tag As Object";
httpjob._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",httpjob._tag);
 //BA.debugLineNum = 13;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _complete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Complete (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("complete")) return __ref.runUserSub(false, "httpjob","complete", __ref, _id);
Debug.locals.put("id", _id);
 BA.debugLineNum = 166;BA.debugLine="Public Sub Complete (id As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="taskId = id";
Debug.ShouldStop(64);
__ref.setField ("_taskid",BA.NumberToString(_id));
 BA.debugLineNum = 168;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
Debug.ShouldStop(128);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target")),(Object)(BA.ObjectToString("JobDone")),(Object)(__ref));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("Delete (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("delete")) return __ref.runUserSub(false, "httpjob","delete", __ref, _link);
Debug.locals.put("Link", _link);
 BA.debugLineNum = 150;BA.debugLine="Public Sub Delete(Link As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="req.InitializeDelete(Link)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_req").runVoidMethod ("InitializeDelete",(Object)(_link));
 BA.debugLineNum = 152;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(8388608);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete2(RemoteObject __ref,RemoteObject _link,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("Delete2 (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("delete2")) return __ref.runUserSub(false, "httpjob","delete2", __ref, _link, _parameters);
Debug.locals.put("Link", _link);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 155;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_req").runVoidMethod ("InitializeDelete",(Object)(__ref.runClassMethod (b4j.example.httpjob.class, "_escapelink",(Object)(_link),(Object)(_parameters))));
 BA.debugLineNum = 157;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(268435456);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Download (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("download")) return __ref.runUserSub(false, "httpjob","download", __ref, _link);
Debug.locals.put("Link", _link);
 BA.debugLineNum = 123;BA.debugLine="Public Sub Download(Link As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="req.InitializeGet(Link)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_req").runVoidMethod ("InitializeGet",(Object)(_link));
 BA.debugLineNum = 125;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(268435456);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Download2 (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("download2")) return __ref.runUserSub(false, "httpjob","download2", __ref, _link, _parameters);
Debug.locals.put("Link", _link);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 132;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
Debug.ShouldStop(16);
__ref.getField(false,"_req").runVoidMethod ("InitializeGet",(Object)(__ref.runClassMethod (b4j.example.httpjob.class, "_escapelink",(Object)(_link),(Object)(_parameters))));
 BA.debugLineNum = 134;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(32);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _escapelink(RemoteObject __ref,RemoteObject _link,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("escapeLink (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("escapelink")) return __ref.runUserSub(false, "httpjob","escapelink", __ref, _link, _parameters);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
int _i = 0;
Debug.locals.put("Link", _link);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 136;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(256);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 138;BA.debugLine="sb.Initialize";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 139;BA.debugLine="sb.Append(Link)";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(_link));
 BA.debugLineNum = 140;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_parameters.getField(true,"length"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));};
 BA.debugLineNum = 141;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(4096);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 142;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
Debug.ShouldStop(8192);
{
final int step6 = 2;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_parameters.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 143;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("&")));};
 BA.debugLineNum = 144;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
Debug.ShouldStop(32768);
_sb.runMethod(false,"Append",(Object)(_su.runMethod(true,"EncodeUrl",(Object)(_parameters.getArrayElement(true,BA.numberCast(int.class, _i))),(Object)(RemoteObject.createImmutable("UTF8"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("=")));
 BA.debugLineNum = 145;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(_su.runMethod(true,"EncodeUrl",(Object)(_parameters.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(RemoteObject.createImmutable("UTF8")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 147;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(262144);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getinputstream(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetInputStream (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("getinputstream")) return __ref.runUserSub(false, "httpjob","getinputstream", __ref);
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
 BA.debugLineNum = 199;BA.debugLine="Public Sub GetInputStream As InputStream";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="Dim In As InputStream";
Debug.ShouldStop(128);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 201;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
Debug.ShouldStop(256);
_in = httpjob.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(httpjob._httputils2service._tempfolder),(Object)(__ref.getField(true,"_taskid")));Debug.locals.put("In", _in);
 BA.debugLineNum = 202;BA.debugLine="Return In";
Debug.ShouldStop(512);
if (true) return _in;
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("GetRequest (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("getrequest")) return __ref.runUserSub(false, "httpjob","getrequest", __ref);
 BA.debugLineNum = 161;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="Return req";
Debug.ShouldStop(2);
if (true) return __ref.getField(false,"_req");
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("GetString (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("getstring")) return __ref.runUserSub(false, "httpjob","getstring", __ref);
 BA.debugLineNum = 177;BA.debugLine="Public Sub GetString As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Return GetString2(\"UTF8\")";
Debug.ShouldStop(131072);
if (true) return __ref.runClassMethod (b4j.example.httpjob.class, "_getstring2",(Object)(RemoteObject.createImmutable("UTF8")));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("GetString2 (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("getstring2")) return __ref.runUserSub(false, "httpjob","getstring2", __ref, _encoding);
RemoteObject _tr = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("Encoding", _encoding);
 BA.debugLineNum = 182;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="Dim tr As TextReader";
Debug.ShouldStop(4194304);
_tr = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");Debug.locals.put("tr", _tr);
 BA.debugLineNum = 184;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
Debug.ShouldStop(8388608);
_tr.runVoidMethod ("Initialize2",(Object)((httpjob.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(httpjob._httputils2service._tempfolder),(Object)(__ref.getField(true,"_taskid"))).getObject())),(Object)(_encoding));
 BA.debugLineNum = 185;BA.debugLine="Dim res As String";
Debug.ShouldStop(16777216);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 186;BA.debugLine="res = tr.ReadAll";
Debug.ShouldStop(33554432);
_res = _tr.runMethod(true,"ReadAll");Debug.locals.put("res", _res);
 BA.debugLineNum = 187;BA.debugLine="tr.Close";
Debug.ShouldStop(67108864);
_tr.runVoidMethod ("Close");
 BA.debugLineNum = 188;BA.debugLine="Return res";
Debug.ShouldStop(134217728);
if (true) return _res;
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Initialize (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "httpjob","initialize", __ref, _ba, _name, _targetmodule);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Name", _name);
Debug.locals.put("TargetModule", _targetmodule);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="HttpUtils2Service.Initialize";
Debug.ShouldStop(8388608);
httpjob._httputils2service.runVoidMethod ("_initialize");
 BA.debugLineNum = 25;BA.debugLine="JobName = Name";
Debug.ShouldStop(16777216);
__ref.setField ("_jobname",_name);
 BA.debugLineNum = 26;BA.debugLine="target = TargetModule";
Debug.ShouldStop(33554432);
__ref.setField ("_target",_targetmodule);
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
public static RemoteObject  _postbytes(RemoteObject __ref,RemoteObject _link,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("PostBytes (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("postbytes")) return __ref.runUserSub(false, "httpjob","postbytes", __ref, _link, _data);
Debug.locals.put("Link", _link);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 34;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="req.InitializePost2(Link, Data)";
Debug.ShouldStop(4);
__ref.getField(false,"_req").runVoidMethod ("InitializePost2",(Object)(_link),(Object)(_data));
 BA.debugLineNum = 36;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(8);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("PostFile (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("postfile")) return __ref.runUserSub(false, "httpjob","postfile", __ref, _link, _dir, _filename);
RemoteObject _length = RemoteObject.createImmutable(0);
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Link", _link);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 100;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Dim length As Int";
Debug.ShouldStop(16);
_length = RemoteObject.createImmutable(0);Debug.locals.put("length", _length);
 BA.debugLineNum = 102;BA.debugLine="If Dir = File.DirAssets Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_dir,httpjob.__c.getField(false,"File").runMethod(true,"getDirAssets"))) { 
 BA.debugLineNum = 103;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
Debug.ShouldStop(64);
httpjob.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Cannot send files from the assets folder.")));
 BA.debugLineNum = 104;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 106;BA.debugLine="length = File.Size(Dir, FileName)";
Debug.ShouldStop(512);
_length = BA.numberCast(int.class, httpjob.__c.getField(false,"File").runMethod(true,"Size",(Object)(_dir),(Object)(_filename)));Debug.locals.put("length", _length);
 BA.debugLineNum = 107;BA.debugLine="Dim In As InputStream";
Debug.ShouldStop(1024);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 108;BA.debugLine="In = File.OpenInput(Dir, FileName)";
Debug.ShouldStop(2048);
_in = httpjob.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename));Debug.locals.put("In", _in);
 BA.debugLineNum = 109;BA.debugLine="If length < 1000000 Then '1mb";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",_length,BA.numberCast(double.class, 1000000))) { 
 BA.debugLineNum = 112;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(32768);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 113;BA.debugLine="out.InitializeToBytesArray(length)";
Debug.ShouldStop(65536);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(_length));
 BA.debugLineNum = 114;BA.debugLine="File.Copy2(In, out)";
Debug.ShouldStop(131072);
httpjob.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_in.getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 115;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.httpjob.class, "_postbytes",(Object)(_link),(Object)(_out.runMethod(false,"ToBytesArray")));
 }else {
 BA.debugLineNum = 117;BA.debugLine="req.InitializePost(Link, In, length)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_req").runVoidMethod ("InitializePost",(Object)(_link),(Object)((_in.getObject())),(Object)(_length));
 BA.debugLineNum = 118;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
Debug.ShouldStop(2097152);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 };
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _postmultipart(RemoteObject __ref,RemoteObject _link,RemoteObject _namevalues,RemoteObject _files) throws Exception{
try {
		Debug.PushSubsStack("PostMultipart (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("postmultipart")) return __ref.runUserSub(false, "httpjob","postmultipart", __ref, _link, _namevalues, _files);
RemoteObject _boundary = RemoteObject.createImmutable("");
RemoteObject _stream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _b = null;
RemoteObject _eol = RemoteObject.createImmutable("");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _fd = RemoteObject.declareNull("b4j.example.httpjob._multipartfiledata");
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
Debug.locals.put("Link", _link);
Debug.locals.put("NameValues", _namevalues);
Debug.locals.put("Files", _files);
 BA.debugLineNum = 53;BA.debugLine="public Sub PostMultipart(Link As String, NameValue";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Dim boundary As String = \"-----------------------";
Debug.ShouldStop(2097152);
_boundary = BA.ObjectToString("---------------------------1461124740692");Debug.locals.put("boundary", _boundary);Debug.locals.put("boundary", _boundary);
 BA.debugLineNum = 55;BA.debugLine="Dim stream As OutputStream";
Debug.ShouldStop(4194304);
_stream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("stream", _stream);
 BA.debugLineNum = 56;BA.debugLine="stream.InitializeToBytesArray(0)";
Debug.ShouldStop(8388608);
_stream.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 57;BA.debugLine="Dim b() As Byte";
Debug.ShouldStop(16777216);
_b = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("b", _b);
 BA.debugLineNum = 58;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
Debug.ShouldStop(33554432);
_eol = RemoteObject.concat(httpjob.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 13))),httpjob.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("eol", _eol);Debug.locals.put("eol", _eol);
 BA.debugLineNum = 59;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("N",_namevalues) && RemoteObject.solveBoolean(".",_namevalues.runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 60;BA.debugLine="For Each key As String In NameValues.Keys";
Debug.ShouldStop(134217728);
{
final RemoteObject group7 = _namevalues.runMethod(false,"Keys");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 61;BA.debugLine="Dim value As String = NameValues.Get(key)";
Debug.ShouldStop(268435456);
_value = BA.ObjectToString(_namevalues.runMethod(false,"Get",(Object)((_key))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 62;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
Debug.ShouldStop(536870912);
_s = (RemoteObject.concat(RemoteObject.createImmutable("--"),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_boundary))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Content-Disposition: form-data; name=\""),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key))),RemoteObject.createImmutable("\"\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable(""),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 68;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
Debug.ShouldStop(8);
_b = _s.runMethod(true,"replace",(Object)(httpjob.__c.getField(true,"CRLF")),(Object)(_eol)).runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("b", _b);
 BA.debugLineNum = 69;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
Debug.ShouldStop(16);
_stream.runVoidMethod ("WriteBytes",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"length")));
 }
}Debug.locals.put("key", _key);
;
 };
 BA.debugLineNum = 72;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("N",_files) && RemoteObject.solveBoolean(".",_files.runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 73;BA.debugLine="For Each fd As MultipartFileData In Files";
Debug.ShouldStop(256);
{
final RemoteObject group15 = _files;
final int groupLen15 = group15.runMethod(true,"getSize").<Integer>get()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_fd = (group15.runMethod(false,"Get",index15));Debug.locals.put("fd", _fd);
Debug.locals.put("fd", _fd);
 BA.debugLineNum = 74;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
Debug.ShouldStop(512);
_s = (RemoteObject.concat(RemoteObject.createImmutable("--"),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_boundary))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Content-Disposition: form-data; name=\""),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fd.getField(true,"KeyName")))),RemoteObject.createImmutable("\"; filename=\""),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fd.getField(true,"FileName")))),RemoteObject.createImmutable("\"\n"),RemoteObject.createImmutable("Content-Type: "),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fd.getField(true,"ContentType")))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 80;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
Debug.ShouldStop(32768);
_b = _s.runMethod(true,"replace",(Object)(httpjob.__c.getField(true,"CRLF")),(Object)(_eol)).runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("b", _b);
 BA.debugLineNum = 81;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
Debug.ShouldStop(65536);
_stream.runVoidMethod ("WriteBytes",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"length")));
 BA.debugLineNum = 82;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
Debug.ShouldStop(131072);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
_in = httpjob.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_fd.getField(true,"Dir")),(Object)(_fd.getField(true,"FileName")));Debug.locals.put("in", _in);Debug.locals.put("in", _in);
 BA.debugLineNum = 83;BA.debugLine="File.Copy2(in, stream)";
Debug.ShouldStop(262144);
httpjob.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_in.getObject())),(Object)((_stream.getObject())));
 BA.debugLineNum = 84;BA.debugLine="stream.WriteBytes(eol.GetBytes(\"utf8\"), 0, 2)";
Debug.ShouldStop(524288);
_stream.runVoidMethod ("WriteBytes",(Object)(_eol.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("utf8")))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));
 }
}Debug.locals.put("fd", _fd);
;
 };
 BA.debugLineNum = 87;BA.debugLine="s = _ $\" --${boundary}-- \"$";
Debug.ShouldStop(4194304);
_s = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("--"),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_boundary))),RemoteObject.createImmutable("--\n"),RemoteObject.createImmutable("")));Debug.locals.put("s", _s);
 BA.debugLineNum = 91;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
Debug.ShouldStop(67108864);
_b = _s.runMethod(true,"replace",(Object)(httpjob.__c.getField(true,"CRLF")),(Object)(_eol)).runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("b", _b);
 BA.debugLineNum = 92;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
Debug.ShouldStop(134217728);
_stream.runVoidMethod ("WriteBytes",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"length")));
 BA.debugLineNum = 93;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.httpjob.class, "_postbytes",(Object)(_link),(Object)(_stream.runMethod(false,"ToBytesArray")));
 BA.debugLineNum = 94;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
Debug.ShouldStop(536870912);
__ref.getField(false,"_req").runVoidMethod ("SetContentType",(Object)(RemoteObject.concat(RemoteObject.createImmutable("multipart/form-data; boundary="),_boundary)));
 BA.debugLineNum = 95;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_req").runVoidMethod ("SetContentEncoding",(Object)(RemoteObject.createImmutable("UTF8")));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("PostString (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("poststring")) return __ref.runUserSub(false, "httpjob","poststring", __ref, _link, _text);
Debug.locals.put("Link", _link);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 29;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.httpjob.class, "_postbytes",(Object)(_link),(Object)(_text.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
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
public static RemoteObject  _putbytes(RemoteObject __ref,RemoteObject _link,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("PutBytes (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("putbytes")) return __ref.runUserSub(false, "httpjob","putbytes", __ref, _link, _data);
Debug.locals.put("Link", _link);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 45;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="req.InitializePut2(Link, Data)";
Debug.ShouldStop(8192);
__ref.getField(false,"_req").runVoidMethod ("InitializePut2",(Object)(_link),(Object)(_data));
 BA.debugLineNum = 47;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(16384);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putstring(RemoteObject __ref,RemoteObject _link,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("PutString (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("putstring")) return __ref.runUserSub(false, "httpjob","putstring", __ref, _link, _text);
Debug.locals.put("Link", _link);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 40;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.httpjob.class, "_putbytes",(Object)(_link),(Object)(_text.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
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
public static RemoteObject  _release(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Release (httpjob) ","httpjob",6,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("release")) return __ref.runUserSub(false, "httpjob","release", __ref);
 BA.debugLineNum = 172;BA.debugLine="Public Sub Release";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
Debug.ShouldStop(4096);
httpjob.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(httpjob._httputils2service._tempfolder),(Object)(__ref.getField(true,"_taskid")));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}