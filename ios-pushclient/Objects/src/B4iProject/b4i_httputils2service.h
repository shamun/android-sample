#import "iCore.h"
#import "iHttp.h"
#import "iRandomAccessFile.h"
#import "iStringUtils.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_httpjob;
@interface b4i_httputils2service : B4IStaticModule
- (NSString*)  _completejob:(int) _taskid :(BOOL) _success :(NSString*) _errormessage :(B4IHttpResponse*) _res;
- (NSString*)  _hc_responseerror:(B4IHttpResponse*) _response :(NSString*) _reason :(int) _statuscode :(int) _taskid;
- (NSString*)  _hc_responsesuccess:(B4IHttpResponse*) _response :(int) _taskid;
- (NSString*)  _initialize;
- (NSString*)  _process_globals;
@property (nonatomic)B4IHttp* _hc;
@property (nonatomic)B4IMap* _taskidtojob;
@property (nonatomic)NSString* _tempfolder;
@property (nonatomic)int _taskcounter;
@property (nonatomic)b4i_main* _main;
- (NSString*)  _submitjob:(b4i_httpjob*) _job;
@end
