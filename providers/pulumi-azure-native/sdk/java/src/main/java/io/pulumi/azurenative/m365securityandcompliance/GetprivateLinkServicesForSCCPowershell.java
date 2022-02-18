// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.m365securityandcompliance.inputs.GetprivateLinkServicesForSCCPowershellArgs;
import io.pulumi.azurenative.m365securityandcompliance.outputs.GetprivateLinkServicesForSCCPowershellResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetprivateLinkServicesForSCCPowershell {
/**
 * The description of the service.
 * API Version: 2021-03-25-preview.
 * 
 *
 * The description of the service.
 * 
 */
    public static CompletableFuture<GetprivateLinkServicesForSCCPowershellResult> invokeAsync(GetprivateLinkServicesForSCCPowershellArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:m365securityandcompliance:getprivateLinkServicesForSCCPowershell", TypeShape.of(GetprivateLinkServicesForSCCPowershellResult.class), args == null ? GetprivateLinkServicesForSCCPowershellArgs.Empty : args, Utilities.withVersion(options));
    }
}
