#import "iCore.h"
#import "iHttp.h"
#import "iRandomAccessFile.h"
#import "iStringUtils.h"
#import "iDebug2.h"
@class b4i_httputils2service;
@class b4i_httpjob;
@interface b4i_main : B4IStaticModule
- (NSString*)  _application_background;
- (NSString*)  _application_pushtoken:(BOOL) _success :(B4IArray*) _token;
- (NSString*)  _application_remotenotification:(B4IMap*) _message;
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav;
- (NSString*)  _jobdone:(b4i_httpjob*) _j;
- (NSString*)  _page1_resize:(int) _width :(int) _height;
- (NSString*)  _process_globals;
@property (nonatomic)B4IApplicationWrapper* _app;
@property (nonatomic)B4INavigationControllerWrapper* _navcontrol;
@property (nonatomic)B4IPage* _page1;
@property (nonatomic)NSString* _serverurl;
@property (nonatomic)b4i_httputils2service* _httputils2service;
@end
