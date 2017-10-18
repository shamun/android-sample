
#import "b4i_httpjob.h"
#import "b4i_main.h"
#import "b4i_httputils2service.h"


@implementation b4i_httpjob 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_httpjob) instance released.");
}

- (NSString*)  _initialize:(b4i_httpjob*) __ref :(B4I*) _ba :(NSString*) _name :(NSObject*) _targetmodule{
__ref = self;
[self initializeClassModule];
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"initialize"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_name],[B4I nilToNSNull:_targetmodule]]]);
[B4IRDebugUtils shared].currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
[B4IRDebugUtils shared].currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="JobName = Name";
__ref._jobname = _name;
[B4IRDebugUtils shared].currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="target = TargetModule";
__ref._target = _targetmodule;
[B4IRDebugUtils shared].currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _poststring:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _text{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"poststring"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"poststring::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_text]]]);
[B4IRDebugUtils shared].currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
[B4IRDebugUtils shared].currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
[__ref _postbytes:nil :_link :[_text GetBytes:@"UTF8"]];
[B4IRDebugUtils shared].currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _release:(b4i_httpjob*) __ref{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"release"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"release" :nil]);
[B4IRDebugUtils shared].currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Release";
[B4IRDebugUtils shared].currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_httpjob*) __ref{
__ref = self;
self._main=[b4i_main new];
self._httputils2service=[b4i_httputils2service new];
[B4IRDebugUtils shared].currentModule=@"httpjob";
[B4IRDebugUtils shared].currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Class_Globals";
[B4IRDebugUtils shared].currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Public JobName As String";
self._jobname = @"";
[B4IRDebugUtils shared].currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Public Success As Boolean";
self._success = false;
[B4IRDebugUtils shared].currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Public Username, Password As String";
self._username = @"";
self._password = @"";
[B4IRDebugUtils shared].currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Public ErrorMessage As String";
self._errormessage = @"";
[B4IRDebugUtils shared].currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private target As Object";
self._target = [NSObject new];
[B4IRDebugUtils shared].currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private req As HttpRequest";
self._req = [B4IHttpRequest new];
[B4IRDebugUtils shared].currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Public Tag As Object";
self._tag = [NSObject new];
[B4IRDebugUtils shared].currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private res As HttpResponse";
self._res = [B4IHttpResponse new];
[B4IRDebugUtils shared].currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _complete:(b4i_httpjob*) __ref :(B4IHttpResponse*) _res1{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"complete"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"complete:" :@[[B4I nilToNSNull:_res1]]]);
[B4IRDebugUtils shared].currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Complete (res1 As HttpResponse)";
[B4IRDebugUtils shared].currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="res = res1";
__ref._res = _res1;
[B4IRDebugUtils shared].currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="CallSub2(target, \"JobDone\", Me)";
[self.__c CallSubDebug2:self.bi :__ref._target :@"JobDone" :self];
[B4IRDebugUtils shared].currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _download:(b4i_httpjob*) __ref :(NSString*) _link{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"download"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"download:" :@[[B4I nilToNSNull:_link]]]);
[B4IRDebugUtils shared].currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Download(Link As String)";
[B4IRDebugUtils shared].currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="req.InitializeGet(Link)";
[__ref._req InitializeGet:_link];
[B4IRDebugUtils shared].currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self.__c CallSubDelayed2:self.bi :(NSObject*)((self._httputils2service).object) :@"SubmitJob" :self];
[B4IRDebugUtils shared].currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _download2:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _parameters{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"download2"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"download2::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_parameters]]]);
B4IStringBuilder* _sb = nil;
iStringUtils* _su = nil;
int _i = 0;
[B4IRDebugUtils shared].currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
[B4IRDebugUtils shared].currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Dim sb As StringBuilder";
_sb = [B4IStringBuilder new];
[B4IRDebugUtils shared].currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="sb.Initialize";
[_sb Initialize];
[B4IRDebugUtils shared].currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="sb.Append(Link)";
[_sb Append:_link];
[B4IRDebugUtils shared].currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.Length>0) { 
[_sb Append:@"?"];};
[B4IRDebugUtils shared].currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
[B4IRDebugUtils shared].currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
const int step6 = (int) (2);
const int limit6 = (int) (_parameters.Length-1);
_i = (int) (0) ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
[B4IRDebugUtils shared].currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
[_sb Append:@"&"];};
[B4IRDebugUtils shared].currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
[[_sb Append:[_su EncodeUrl:((NSString*)[_parameters getObjectFast:_i]) :@"UTF8"]] Append:@"="];
[B4IRDebugUtils shared].currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
[_sb Append:[_su EncodeUrl:((NSString*)[_parameters getObjectFast:(int) (_i+1)]) :@"UTF8"]];
 }
};
[B4IRDebugUtils shared].currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="req.InitializeGet(sb.ToString)";
[__ref._req InitializeGet:[_sb ToString]];
[B4IRDebugUtils shared].currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self.__c CallSubDelayed2:self.bi :(NSObject*)((self._httputils2service).object) :@"SubmitJob" :self];
[B4IRDebugUtils shared].currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="End Sub";
return @"";
}
- (B4IBitmap*)  _getbitmap:(b4i_httpjob*) __ref{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getbitmap"])
	return ((B4IBitmap*) [B4IDebug delegate:self.bi :@"getbitmap" :nil]);
B4IBitmap* _b = nil;
[B4IRDebugUtils shared].currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub GetBitmap As Bitmap";
[B4IRDebugUtils shared].currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim b As Bitmap";
_b = [B4IBitmap new];
[B4IRDebugUtils shared].currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="b.Initialize2(res.GetInputStream)";
[_b Initialize2:[__ref._res GetInputStream]];
[B4IRDebugUtils shared].currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Return b";
if (true) return _b;
[B4IRDebugUtils shared].currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="End Sub";
return nil;
}
- (B4IInputStream*)  _getinputstream:(b4i_httpjob*) __ref{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getinputstream"])
	return ((B4IInputStream*) [B4IDebug delegate:self.bi :@"getinputstream" :nil]);
[B4IRDebugUtils shared].currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub GetInputStream As InputStream";
[B4IRDebugUtils shared].currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Return res.GetInputStream";
if (true) return [__ref._res GetInputStream];
[B4IRDebugUtils shared].currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return nil;
}
- (B4IHttpRequest*)  _getrequest:(b4i_httpjob*) __ref{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getrequest"])
	return ((B4IHttpRequest*) [B4IDebug delegate:self.bi :@"getrequest" :nil]);
[B4IRDebugUtils shared].currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub GetRequest As HttpRequest";
[B4IRDebugUtils shared].currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return req";
if (true) return __ref._req;
[B4IRDebugUtils shared].currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _getstring:(b4i_httpjob*) __ref{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getstring"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"getstring" :nil]);
[B4IRDebugUtils shared].currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub GetString As String";
[B4IRDebugUtils shared].currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return [__ref _getstring2:nil :@"UTF8"];
[B4IRDebugUtils shared].currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _getstring2:(b4i_httpjob*) __ref :(NSString*) _encoding{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getstring2"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"getstring2:" :@[[B4I nilToNSNull:_encoding]]]);
[B4IRDebugUtils shared].currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
[B4IRDebugUtils shared].currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Return res.GetString2(Encoding)";
if (true) return [__ref._res GetString2:_encoding];
[B4IRDebugUtils shared].currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _postbytes:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _data{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"postbytes"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"postbytes::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_data]]]);
[B4IRDebugUtils shared].currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
[B4IRDebugUtils shared].currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="req.InitializePost2(Link, Data)";
[__ref._req InitializePost2:_link :_data];
[B4IRDebugUtils shared].currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self.__c CallSubDelayed2:self.bi :(NSObject*)((self._httputils2service).object) :@"SubmitJob" :self];
[B4IRDebugUtils shared].currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _postfile:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _dir :(NSString*) _filename{
__ref = self;
[B4IRDebugUtils shared].currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"postfile"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"postfile:::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_dir],[B4I nilToNSNull:_filename]]]);
[B4IRDebugUtils shared].currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
[B4IRDebugUtils shared].currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="req.InitializePost(Link, Dir, FileName)";
[__ref._req InitializePost:_link :_dir :_filename];
[B4IRDebugUtils shared].currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self.__c CallSubDelayed2:self.bi :(NSObject*)((self._httputils2service).object) :@"SubmitJob" :self];
[B4IRDebugUtils shared].currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return @"";
}
@end