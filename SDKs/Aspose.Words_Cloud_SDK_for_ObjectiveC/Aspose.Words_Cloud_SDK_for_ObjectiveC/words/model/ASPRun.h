#import <Foundation/Foundation.h>
#import "ASPObject.h"

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

#import "ASPLink.h"


@protocol ASPRun
@end

@interface ASPRun : ASPObject


@property(nonatomic) NSString* text;

@property(nonatomic) NSString* nodeId;

@property(nonatomic) ASPLink* link;

@end