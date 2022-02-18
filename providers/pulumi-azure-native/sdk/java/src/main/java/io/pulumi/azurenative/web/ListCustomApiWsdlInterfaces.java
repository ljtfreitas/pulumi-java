// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListCustomApiWsdlInterfacesArgs;
import io.pulumi.azurenative.web.outputs.ListCustomApiWsdlInterfacesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListCustomApiWsdlInterfaces {
/**
 * A list of custom API WSDL interfaces
 * API Version: 2016-06-01.
 * 
 *
 * A list of custom API WSDL interfaces
 * 
 */
    public static CompletableFuture<ListCustomApiWsdlInterfacesResult> invokeAsync(ListCustomApiWsdlInterfacesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listCustomApiWsdlInterfaces", TypeShape.of(ListCustomApiWsdlInterfacesResult.class), args == null ? ListCustomApiWsdlInterfacesArgs.Empty : args, Utilities.withVersion(options));
    }
}
