// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.inputs.GetAvailabilityZonesArgs;
import io.pulumi.aws.outputs.GetAvailabilityZonesResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAvailabilityZones {
/**
 * The Availability Zones data source allows access to the list of AWS
 * Availability Zones which can be accessed by an AWS account within the region
 * configured in the provider.
 * 
 * This is different from the `aws.getAvailabilityZone` (singular) data source,
 * which provides some details about a specific availability zone.
 * 
 * > When [Local Zones](https://aws.amazon.com/about-aws/global-infrastructure/localzones/) are enabled in a region, by default the API and this data source include both Local Zones and Availability Zones. To return only Availability Zones, see the example section below.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getAvailabilityZones.
 * 
 *
 * A collection of values returned by getAvailabilityZones.
 * 
 */
    public static CompletableFuture<GetAvailabilityZonesResult> invokeAsync(@Nullable GetAvailabilityZonesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getAvailabilityZones:getAvailabilityZones", TypeShape.of(GetAvailabilityZonesResult.class), args == null ? GetAvailabilityZonesArgs.Empty : args, Utilities.withVersion(options));
    }
}
