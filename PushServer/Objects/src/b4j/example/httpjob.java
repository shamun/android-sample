package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class httpjob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.httpjob", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.httpjob.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _multipartfiledata{
public boolean IsInitialized;
public String Dir;
public String FileName;
public String KeyName;
public String ContentType;
public void Initialize() {
IsInitialized = true;
Dir = "";
FileName = "";
KeyName = "";
ContentType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _jobname = "";
public boolean _success = false;
public String _username = "";
public String _password = "";
public String _errormessage = "";
public Object _target = null;
public String _taskid = "";
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
public Object _tag = null;
public b4j.example.main _main = null;
public b4j.example.iosfeedback _iosfeedback = null;
public b4j.example.iospush _iospush = null;
public b4j.example.httputils2service _httputils2service = null;
public b4j.example.webutils _webutils = null;
public b4j.example.androidpush _androidpush = null;
public b4j.example.dbutils _dbutils = null;
public String  _class_globals(b4j.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Public JobName As String";
_jobname = "";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Public Success As Boolean";
_success = false;
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Private taskId As String";
_taskid = "";
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="End Sub";
return "";
}
public String  _complete(b4j.example.httpjob __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "complete"))
	return (String) Debug.delegate(ba, "complete", new Object[] {_id});
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub Complete (id As Int)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="taskId = id";
__ref._taskid = BA.NumberToString(_id);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,__ref._target,"JobDone",this);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4j.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete"))
	return (String) Debug.delegate(ba, "delete", new Object[] {_link});
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Delete(Link As String)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="req.InitializeDelete(Link)";
__ref._req.InitializeDelete(_link);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="End Sub";
return "";
}
public String  _delete2(b4j.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete2"))
	return (String) Debug.delegate(ba, "delete2", new Object[] {_link,_parameters});
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters)";
__ref._req.InitializeDelete(__ref._escapelink(null,_link,_parameters));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="End Sub";
return "";
}
public String  _escapelink(b4j.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "escapelink"))
	return (String) Debug.delegate(ba, "escapelink", new Object[] {_link,_parameters});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _i = 0;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = (int) (2);
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="End Sub";
return "";
}
public String  _download(b4j.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download"))
	return (String) Debug.delegate(ba, "download", new Object[] {_link});
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub Download(Link As String)";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="req.InitializeGet(Link)";
__ref._req.InitializeGet(_link);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="End Sub";
return "";
}
public String  _download2(b4j.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download2"))
	return (String) Debug.delegate(ba, "download2", new Object[] {_link,_parameters});
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
__ref._req.InitializeGet(__ref._escapelink(null,_link,_parameters));
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(b4j.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getinputstream"))
	return (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", null);
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub GetInputStream As InputStream";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder,__ref._taskid);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest(b4j.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getrequest"))
	return (anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(ba, "getrequest", null);
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Return req";
if (true) return __ref._req;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return null;
}
public String  _getstring(b4j.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring"))
	return (String) Debug.delegate(ba, "getstring", null);
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return __ref._getstring2(null,"UTF8");
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public String  _getstring2(b4j.example.httpjob __ref,String _encoding) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring2"))
	return (String) Debug.delegate(ba, "getstring2", new Object[] {_encoding});
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder,__ref._taskid).getObject()),_encoding);
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="res = tr.ReadAll";
_res = _tr.ReadAll();
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="tr.Close";
_tr.Close();
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.httpjob __ref,anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_name,_targetmodule});
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="HttpUtils2Service.Initialize";
_httputils2service._initialize();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="JobName = Name";
__ref._jobname = _name;
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="target = TargetModule";
__ref._target = _targetmodule;
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="End Sub";
return "";
}
public String  _postbytes(b4j.example.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postbytes"))
	return (String) Debug.delegate(ba, "postbytes", new Object[] {_link,_data});
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="req.InitializePost2(Link, Data)";
__ref._req.InitializePost2(_link,_data);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return "";
}
public String  _postfile(b4j.example.httpjob __ref,String _link,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postfile"))
	return (String) Debug.delegate(ba, "postfile", new Object[] {_link,_dir,_filename});
int _length = 0;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.Log("Cannot send files from the assets folder.");
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
__ref._postbytes(null,_link,_out.ToBytesArray());
 }else {
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="req.InitializePost(Link, In, length)";
__ref._req.InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="End Sub";
return "";
}
public String  _postmultipart(b4j.example.httpjob __ref,String _link,anywheresoftware.b4a.objects.collections.Map _namevalues,anywheresoftware.b4a.objects.collections.List _files) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postmultipart"))
	return (String) Debug.delegate(ba, "postmultipart", new Object[] {_link,_namevalues,_files});
String _boundary = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream = null;
byte[] _b = null;
String _eol = "";
String _key = "";
String _value = "";
String _s = "";
b4j.example.httpjob._multipartfiledata _fd = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="public Sub PostMultipart(Link As String, NameValue";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _namevalues.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"\n"+"");
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=1900563;
 //BA.debugLineNum = 1900563;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group15 = _files;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_fd = (b4j.example.httpjob._multipartfiledata)(group15.Get(index15));
RDebugUtils.currentLine=1900565;
 //BA.debugLineNum = 1900565;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType))+"\n"+"\n"+"");
RDebugUtils.currentLine=1900571;
 //BA.debugLineNum = 1900571;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=1900572;
 //BA.debugLineNum = 1900572;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=1900573;
 //BA.debugLineNum = 1900573;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir,_fd.FileName);
RDebugUtils.currentLine=1900574;
 //BA.debugLineNum = 1900574;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
RDebugUtils.currentLine=1900575;
 //BA.debugLineNum = 1900575;BA.debugLine="stream.WriteBytes(eol.GetBytes(\"utf8\"), 0, 2)";
_stream.WriteBytes(_eol.getBytes("utf8"),(int) (0),(int) (2));
 }
};
 };
RDebugUtils.currentLine=1900578;
 //BA.debugLineNum = 1900578;BA.debugLine="s = _ $\" --${boundary}-- \"$";
_s = ("\n"+"--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
RDebugUtils.currentLine=1900582;
 //BA.debugLineNum = 1900582;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=1900583;
 //BA.debugLineNum = 1900583;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=1900584;
 //BA.debugLineNum = 1900584;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
__ref._postbytes(null,_link,_stream.ToBytesArray());
RDebugUtils.currentLine=1900585;
 //BA.debugLineNum = 1900585;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
__ref._req.SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=1900586;
 //BA.debugLineNum = 1900586;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
__ref._req.SetContentEncoding("UTF8");
RDebugUtils.currentLine=1900587;
 //BA.debugLineNum = 1900587;BA.debugLine="End Sub";
return "";
}
public String  _poststring(b4j.example.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "poststring"))
	return (String) Debug.delegate(ba, "poststring", new Object[] {_link,_text});
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._postbytes(null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(b4j.example.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putbytes"))
	return (String) Debug.delegate(ba, "putbytes", new Object[] {_link,_data});
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="req.InitializePut2(Link, Data)";
__ref._req.InitializePut2(_link,_data);
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="End Sub";
return "";
}
public String  _putstring(b4j.example.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putstring"))
	return (String) Debug.delegate(ba, "putstring", new Object[] {_link,_text});
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._putbytes(null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public String  _release(b4j.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "release"))
	return (String) Debug.delegate(ba, "release", null);
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder,__ref._taskid);
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
}