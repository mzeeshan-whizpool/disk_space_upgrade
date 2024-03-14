#import "DiskSpacePlugin.h"
#import <disk_space_upgrade/disk_space_upgrade-Swift.h>

@implementation DiskSpacePlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftDiskSpacePlugin registerWithRegistrar:registrar];
}
@end
