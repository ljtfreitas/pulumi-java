// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetASCDataConnectorArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetASCDataConnectorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetASCDataConnector {
/**
 * Represents ASC (Azure Security Center) data connector.
 * API Version: 2020-01-01.
 * 
 *
 * Represents ASC (Azure Security Center) data connector.
 * 
 */
    public static CompletableFuture<GetASCDataConnectorResult> invokeAsync(GetASCDataConnectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getASCDataConnector", TypeShape.of(GetASCDataConnectorResult.class), args == null ? GetASCDataConnectorArgs.Empty : args, Utilities.withVersion(options));
    }
}
