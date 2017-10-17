
#import "iCore.h"
@interface LS_1:NSObject
@end

@implementation LS_1

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[1/General script]
[B4ILayoutBuilder scaleAll:views :width :height];

}
@end