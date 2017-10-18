
#import "b4i_main.h"
#import "b4i_httpjob.h"
#import "b4i_httputils2service.h"


@implementation b4i_main 


+ (instancetype)new {
    static b4i_main* shared = nil;
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


- (NSString*)  _application_background{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_background"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"application_background" :nil]);
[B4IRDebugUtils shared].currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub Application_Background";
[B4IRDebugUtils shared].currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_pushtoken:(BOOL) _success :(B4IArray*) _token{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_pushtoken"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"application_pushtoken::" :@[@(_success),[B4I nilToNSNull:_token]]]);
B4IByteConverter* _bc = nil;
b4i_httpjob* _j = nil;
[B4IRDebugUtils shared].currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Private Sub Application_PushToken (Success As Bool";
[B4IRDebugUtils shared].currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="If Success Then";
if (_success) { 
[B4IRDebugUtils shared].currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Dim bc As ByteConverter";
_bc = [B4IByteConverter new];
[B4IRDebugUtils shared].currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Dim j As HttpJob";
_j = [b4i_httpjob new];
[B4IRDebugUtils shared].currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="j.Initialize(\"j\", Me)";
[_j _initialize:nil :self.bi :@"j" :self];
[B4IRDebugUtils shared].currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="j.PostString(ServerUrl & \"/devicetoken\", \"token=";
[_j _poststring:nil :[@[self._serverurl,@"/devicetoken"] componentsJoinedByString:@""] :[@[@"token=",[_bc HexFromBytes:_token],@"&type=1"] componentsJoinedByString:@""]];
 }else {
[B4IRDebugUtils shared].currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="Log(\"Error getting token: \" & LastException)";
[self.__c Log:[@[@"Error getting token: ",[self.bi ObjectToString:[self.__c LastException]]] componentsJoinedByString:@""]];
 };
[B4IRDebugUtils shared].currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_remotenotification:(B4IMap*) _message{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_remotenotification"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"application_remotenotification:" :@[[B4I nilToNSNull:_message]]]);
B4IMap* _m = nil;
[B4IRDebugUtils shared].currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub Application_RemoteNotification (Messag";
[B4IRDebugUtils shared].currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Log(\"Remote notification: \" & Message)";
[self.__c Log:[@[@"Remote notification: ",[self.bi ObjectToString:_message]] componentsJoinedByString:@""]];
[B4IRDebugUtils shared].currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Dim m As Map = Message.Get(\"aps\")";
_m = (B4IMap*)([_message Get:(NSObject*)(@"aps")]);
[B4IRDebugUtils shared].currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Log(m)";
[self.__c Log:[self.bi ObjectToString:_m]];
[B4IRDebugUtils shared].currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Log(m.Get(\"alert\"))";
[self.__c Log:[self.bi ObjectToString:[_m Get:(NSObject*)(@"alert")]]];
[B4IRDebugUtils shared].currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_start"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"application_start:" :@[[B4I nilToNSNull:_nav]]]);
[B4IRDebugUtils shared].currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
[B4IRDebugUtils shared].currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="NavControl = Nav";
self._navcontrol = _nav;
[B4IRDebugUtils shared].currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="Page1.Initialize(\"Page1\")";
[self._page1 Initialize:self.bi :@"Page1"];
[B4IRDebugUtils shared].currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="Page1.Title = \"Page 1\"";
[self._page1 setTitle:@"Page 1"];
[B4IRDebugUtils shared].currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="Page1.RootPanel.Color = Colors.White";
[[self._page1 RootPanel] setColor:[[self.__c Colors] White]];
[B4IRDebugUtils shared].currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="NavControl.ShowPage(Page1)";
[self._navcontrol ShowPage:(UIViewController*)((self._page1).object)];
[B4IRDebugUtils shared].currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="App.RegisterUserNotifications(True, True, True)";
[self._app RegisterUserNotifications:[self.__c True] :[self.__c True] :[self.__c True]];
[B4IRDebugUtils shared].currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="App.RegisterForRemoteNotifications";
[self._app RegisterForRemoteNotifications];
[B4IRDebugUtils shared].currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jobdone:(b4i_httpjob*) _j{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"jobdone"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_j]]]);
[B4IRDebugUtils shared].currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub JobDone(j As HttpJob)";
[B4IRDebugUtils shared].currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="If j.Success Then";
if (_j._success) { 
[B4IRDebugUtils shared].currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Log(\"Token uploaded successfully.\")";
[self.__c Log:@"Token uploaded successfully."];
 }else {
[B4IRDebugUtils shared].currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Log(\"Error uploading token\")";
[self.__c Log:@"Error uploading token"];
 };
[B4IRDebugUtils shared].currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="j.Release";
[_j _release:nil];
[B4IRDebugUtils shared].currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_resize:(int) _width :(int) _height{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"page1_resize"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"page1_resize::" :@[@(_width),@(_height)]]);
[B4IRDebugUtils shared].currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
[B4IRDebugUtils shared].currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return @"";
}

- (void)initializeStaticModules {
    [[b4i_main new]initializeModule];
[[b4i_httputils2service new]initializeModule];

}
- (NSString*)  _process_globals{
self._httputils2service=[b4i_httputils2service new];
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"process_globals"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);
[B4IRDebugUtils shared].currentLine=0;
 //BA.debugLineNum = 0;BA.debugLine="Sub Process_Globals";
[B4IRDebugUtils shared].currentLine=3;
 //BA.debugLineNum = 3;BA.debugLine="Public App As Application";
self._app = [B4IApplicationWrapper new];
[B4IRDebugUtils shared].currentLine=4;
 //BA.debugLineNum = 4;BA.debugLine="Public NavControl As NavigationController";
self._navcontrol = [B4INavigationControllerWrapper new];
[B4IRDebugUtils shared].currentLine=5;
 //BA.debugLineNum = 5;BA.debugLine="Private Page1 As Page";
self._page1 = [B4IPage new];
[B4IRDebugUtils shared].currentLine=6;
 //BA.debugLineNum = 6;BA.debugLine="Private Const ServerUrl As String = \"http://192.1";
self._serverurl = @"http://192.168.1.32:51044";
[B4IRDebugUtils shared].currentLine=7;
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return @"";
}
@end