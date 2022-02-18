// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.m365securityandcompliance.PrivateEndpointConnectionsForMIPPolicySyncArgs;
import io.pulumi.azurenative.m365securityandcompliance.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.m365securityandcompliance.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.azurenative.m365securityandcompliance.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Private Endpoint Connection resource.
 * API Version: 2021-03-25-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:m365securityandcompliance:PrivateEndpointConnectionsForMIPPolicySync myConnection /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.M365SecurityAndCompliance/privateLinkServicesForMIPPolicySync/service1/privateEndpointConnections/myConnection 
 * ```
 * 
 */
@ResourceType(type="azure-native:m365securityandcompliance:PrivateEndpointConnectionsForMIPPolicySync")
public class PrivateEndpointConnectionsForMIPPolicySync extends io.pulumi.resources.CustomResource {
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource of private end point.
     * 
     */
    @OutputExport(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output</* @Nullable */ PrivateEndpointResponse> privateEndpoint;

    /**
     * @return The resource of private end point.
     * 
     */
    public Output</* @Nullable */ PrivateEndpointResponse> getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @OutputExport(name="privateLinkServiceConnectionState", type=PrivateLinkServiceConnectionStateResponse.class, parameters={})
    private Output<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public Output<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * The provisioning state of the private endpoint connection resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the private endpoint connection resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Required property for system data
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Required property for system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnectionsForMIPPolicySync(String name, PrivateEndpointConnectionsForMIPPolicySyncArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:m365securityandcompliance:PrivateEndpointConnectionsForMIPPolicySync", name, args == null ? PrivateEndpointConnectionsForMIPPolicySyncArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateEndpointConnectionsForMIPPolicySync(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:m365securityandcompliance:PrivateEndpointConnectionsForMIPPolicySync", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:m365securityandcompliance/v20210325preview:PrivateEndpointConnectionsForMIPPolicySync").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PrivateEndpointConnectionsForMIPPolicySync get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnectionsForMIPPolicySync(name, id, options);
    }
}
