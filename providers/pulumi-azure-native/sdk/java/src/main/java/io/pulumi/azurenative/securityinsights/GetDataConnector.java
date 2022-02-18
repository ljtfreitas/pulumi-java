// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetDataConnectorArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetDataConnectorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* Please use one of the variants: AADDataConnector, AATPDataConnector, ASCDataConnector, AwsCloudTrailDataConnector, MCASDataConnector, MDATPDataConnector, OfficeDataConnector, TIDataConnector. */
public class GetDataConnector {
/**
 * Data connector.
 * API Version: 2020-01-01.
 * 
 *
 * Data connector.
 * 
 * @deprecated
 * Please use one of the variants: AADDataConnector, AATPDataConnector, ASCDataConnector, AwsCloudTrailDataConnector, MCASDataConnector, MDATPDataConnector, OfficeDataConnector, TIDataConnector.
 * 
 */
    @Deprecated /* Please use one of the variants: AADDataConnector, AATPDataConnector, ASCDataConnector, AwsCloudTrailDataConnector, MCASDataConnector, MDATPDataConnector, OfficeDataConnector, TIDataConnector. */
    public static CompletableFuture<GetDataConnectorResult> invokeAsync(GetDataConnectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getDataConnector", TypeShape.of(GetDataConnectorResult.class), args == null ? GetDataConnectorArgs.Empty : args, Utilities.withVersion(options));
    }
}
