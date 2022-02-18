// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetNetworkExperimentProfileArgs;
import io.pulumi.azurenative.network.outputs.GetNetworkExperimentProfileResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNetworkExperimentProfile {
/**
 * Defines an Network Experiment Profile and lists of Experiments
 * API Version: 2019-11-01.
 * 
 *
 * Defines an Network Experiment Profile and lists of Experiments
 * 
 */
    public static CompletableFuture<GetNetworkExperimentProfileResult> invokeAsync(GetNetworkExperimentProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getNetworkExperimentProfile", TypeShape.of(GetNetworkExperimentProfileResult.class), args == null ? GetNetworkExperimentProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}
