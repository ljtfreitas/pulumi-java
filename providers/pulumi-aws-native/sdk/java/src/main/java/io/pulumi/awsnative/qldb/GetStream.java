// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.qldb;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.qldb.inputs.GetStreamArgs;
import io.pulumi.awsnative.qldb.outputs.GetStreamResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStream {
    public static CompletableFuture<GetStreamResult> invokeAsync(GetStreamArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:qldb:getStream", TypeShape.of(GetStreamResult.class), args == null ? GetStreamArgs.Empty : args, Utilities.withVersion(options));
    }
}