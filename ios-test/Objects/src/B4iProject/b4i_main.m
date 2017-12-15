
#import "b4i_main.h"


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
    return 42;
}


- (NSString*)  _application_background{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_background"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"application_background" :nil]);
[B4IRDebugUtils shared].currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub Application_Background";
[B4IRDebugUtils shared].currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_receivelocalnotification:(B4INotificationWrapper*) _ln{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_receivelocalnotification"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"application_receivelocalnotification:" :@[[B4I nilToNSNull:_ln]]]);
[B4IRDebugUtils shared].currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Application_ReceiveLocalNotification (LN As No";
[B4IRDebugUtils shared].currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="hd.ToastMessageShow(\"Notification arrived: \" & LN";
[self._hd ToastMessageShow:[@[@"Notification arrived: ",[_ln AlertBody]] componentsJoinedByString:@""] :[self.__c True]];
[B4IRDebugUtils shared].currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_start"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"application_start:" :@[[B4I nilToNSNull:_nav]]]);
B4INotificationWrapper* _ln = nil;
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
 //BA.debugLineNum = 65541;BA.debugLine="Page1.RootPanel.LoadLayout(\"1\")";
[[self._page1 RootPanel] LoadLayout:@"1" :self.bi];
[B4IRDebugUtils shared].currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="NavControl.ShowPage(Page1)";
[self._navcontrol ShowPage:(UIViewController*)((self._page1).object)];
[B4IRDebugUtils shared].currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="App.RegisterUserNotifications(True, True, True) '";
[self._app RegisterUserNotifications:[self.__c True] :[self.__c True] :[self.__c True]];
[B4IRDebugUtils shared].currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="App.ApplicationIconBadgeNumber = 0";
[self._app setApplicationIconBadgeNumber:(int) (0)];
[B4IRDebugUtils shared].currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="If App.LaunchOptions.IsInitialized Then";
if ([[self._app LaunchOptions] IsInitialized]) { 
[B4IRDebugUtils shared].currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="Dim ln As Notification = App.LaunchOptions.Get(\"";
_ln = [B4INotificationWrapper new];
_ln.object = (UILocalNotification*)([[self._app LaunchOptions] Get:(NSObject*)(@"UIApplicationLaunchOptionsLocalNotificationKey")]);
[B4IRDebugUtils shared].currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="If ln.IsInitialized Then";
if ([_ln IsInitialized]) { 
[B4IRDebugUtils shared].currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="hd.ToastMessageShow(\"Application was started fr";
[self._hd ToastMessageShow:[@[@"Application was started from a notification: ",[_ln AlertBody]] componentsJoinedByString:@""] :[self.__c True]];
 };
 };
[B4IRDebugUtils shared].currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnnotification_click{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnnotification_click"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"btnnotification_click" :nil]);
B4INotificationWrapper* _ln = nil;
[B4IRDebugUtils shared].currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub btnNotification_Click";
[B4IRDebugUtils shared].currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Dim ln As Notification";
_ln = [B4INotificationWrapper new];
[B4IRDebugUtils shared].currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="ln.Initialize(DateTime.Now + 6 * DateTime.TicksPe";
[_ln Initialize:(long long) ([[self.__c DateTime] Now]+6*[[self.__c DateTime] TicksPerSecond])];
[B4IRDebugUtils shared].currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="ln.IconBadgeNumber = 1";
[_ln setIconBadgeNumber:(int) (1)];
[B4IRDebugUtils shared].currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="ln.AlertBody = \"Moo is hungry\"";
[_ln setAlertBody:@"Moo is hungry"];
[B4IRDebugUtils shared].currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="ln.PlaySound = True";
[_ln setPlaySound:[self.__c True]];
[B4IRDebugUtils shared].currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="ln.Register";
[_ln Register];
[B4IRDebugUtils shared].currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="hd.ToastMessageShow(\"Notification will fire in 6";
[self._hd ToastMessageShow:@"Notification will fire in 6 seconds." :[self.__c False]];
[B4IRDebugUtils shared].currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_resize:(int) _width :(int) _height{
[B4IRDebugUtils shared].currentModule=@"main";
if ([B4IDebug shouldDelegate: @"page1_resize"])
	return ((NSString*) [B4IDebug delegate:self.bi :@"page1_resize::" :@[@(_width),@(_height)]]);
[B4IRDebugUtils shared].currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
[B4IRDebugUtils shared].currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 6;BA.debugLine="Private hd As HUD";
self._hd = [iHUD new];
[B4IRDebugUtils shared].currentLine=7;
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return @"";
}
@end