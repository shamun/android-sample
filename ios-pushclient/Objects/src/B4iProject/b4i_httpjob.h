#import "iCore.h"
#import "iHttp.h"
#import "iRandomAccessFile.h"
#import "iStringUtils.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_httputils2service;
@interface b4i_httpjob : B4IClass
- (NSString*)  _class_globals:(b4i_httpjob*) __ref;
@property (nonatomic)NSString* _jobname;
@property (nonatomic)BOOL _success;
@property (nonatomic)NSString* _username;
@property (nonatomic)NSString* _password;
@property (nonatomic)NSString* _errormessage;
@property (nonatomic)NSObject* _target;
@property (nonatomic)B4IHttpRequest* _req;
@property (nonatomic)NSObject* _tag;
@property (nonatomic)B4IHttpResponse* _res;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _complete:(b4i_httpjob*) __ref :(B4IHttpResponse*) _res1;
- (NSString*)  _download:(b4i_httpjob*) __ref :(NSString*) _link;
- (NSString*)  _download2:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _parameters;
- (B4IBitmap*)  _getbitmap:(b4i_httpjob*) __ref;
- (B4IInputStream*)  _getinputstream:(b4i_httpjob*) __ref;
- (B4IHttpRequest*)  _getrequest:(b4i_httpjob*) __ref;
- (NSString*)  _getstring:(b4i_httpjob*) __ref;
- (NSString*)  _getstring2:(b4i_httpjob*) __ref :(NSString*) _encoding;
- (NSString*)  _initialize:(b4i_httpjob*) __ref :(B4I*) _ba :(NSString*) _name :(NSObject*) _targetmodule;
- (NSString*)  _postbytes:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _data;
- (NSString*)  _postfile:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _dir :(NSString*) _filename;
- (NSString*)  _poststring:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _text;
- (NSString*)  _release:(b4i_httpjob*) __ref;
@end
