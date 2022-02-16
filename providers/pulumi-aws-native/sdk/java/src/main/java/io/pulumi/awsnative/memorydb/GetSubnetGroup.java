// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.memorydb.inputs.GetSubnetGroupArgs;
import io.pulumi.awsnative.memorydb.outputs.GetSubnetGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSubnetGroup {
    public static CompletableFuture<GetSubnetGroupResult> invokeAsync(GetSubnetGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:memorydb:getSubnetGroup", TypeShape.of(GetSubnetGroupResult.class), args == null ? GetSubnetGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}