#import "iCore.h"
#import "iHttp.h"
#import "iHttpUtils2.h"
#import "iJSON.h"
#import "iPhone.h"
#import "iHUD.h"
#import "istringutils.h"
#import "iDebug2.h"
@interface b4i_main : B4IStaticModule
- (NSString*)  _application_background;
- (NSString*)  _application_receivelocalnotification:(B4INotificationWrapper*) _ln;
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav;
- (NSString*)  _btnnotification_click;
- (NSString*)  _page1_resize:(int) _width :(int) _height;
- (NSString*)  _process_globals;
@property (nonatomic)B4IApplicationWrapper* _app;
@property (nonatomic)B4INavigationControllerWrapper* _navcontrol;
@property (nonatomic)B4IPage* _page1;
@property (nonatomic)iHUD* _hd;
@property (nonatomic)b4i_httputils2service* _httputils2service;
@end
