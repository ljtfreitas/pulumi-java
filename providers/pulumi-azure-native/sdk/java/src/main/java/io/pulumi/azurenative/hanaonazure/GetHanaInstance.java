// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hanaonazure.inputs.GetHanaInstanceArgs;
import io.pulumi.azurenative.hanaonazure.outputs.GetHanaInstanceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHanaInstance {
/**
 * HANA instance info on Azure (ARM properties and HANA properties)
 * API Version: 2017-11-03-preview.
 * 
 *
 * HANA instance info on Azure (ARM properties and HANA properties)
 * 
 */
    public static CompletableFuture<GetHanaInstanceResult> invokeAsync(GetHanaInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hanaonazure:getHanaInstance", TypeShape.of(GetHanaInstanceResult.class), args == null ? GetHanaInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}
