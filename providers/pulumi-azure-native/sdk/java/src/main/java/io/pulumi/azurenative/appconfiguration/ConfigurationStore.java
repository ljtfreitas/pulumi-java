// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appconfiguration.ConfigurationStoreArgs;
import io.pulumi.azurenative.appconfiguration.outputs.EncryptionPropertiesResponse;
import io.pulumi.azurenative.appconfiguration.outputs.PrivateEndpointConnectionReferenceResponse;
import io.pulumi.azurenative.appconfiguration.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.appconfiguration.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The configuration store along with all resource properties. The Configuration Store will have all information to begin utilizing it.
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:appconfiguration:ConfigurationStore contoso /subscriptions/c80fb759-c965-4c6a-9110-9b2b2d038882/resourceGroups/myResourceGroup/providers/Microsoft.AppConfiguration/configurationStores/contoso 
 * ```
 * 
 */
@ResourceType(type="azure-native:appconfiguration:ConfigurationStore")
public class ConfigurationStore extends io.pulumi.resources.CustomResource {
    /**
     * The creation date of configuration store.
     * 
     */
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The creation date of configuration store.
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * The encryption settings of the configuration store.
     * 
     */
    @OutputExport(name="encryption", type=EncryptionPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionPropertiesResponse> encryption;

    /**
     * @return The encryption settings of the configuration store.
     * 
     */
    public Output</* @Nullable */ EncryptionPropertiesResponse> getEncryption() {
        return this.encryption;
    }
    /**
     * The DNS endpoint where the configuration store API will be available.
     * 
     */
    @OutputExport(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The DNS endpoint where the configuration store API will be available.
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * The managed identity information, if configured.
     * 
     */
    @OutputExport(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return The managed identity information, if configured.
     * 
     */
    public Output</* @Nullable */ ResourceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The list of private endpoint connections that are set up for this resource.
     * 
     */
    @OutputExport(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionReferenceResponse.class})
    private Output<List<PrivateEndpointConnectionReferenceResponse>> privateEndpointConnections;

    /**
     * @return The list of private endpoint connections that are set up for this resource.
     * 
     */
    public Output<List<PrivateEndpointConnectionReferenceResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * The provisioning state of the configuration store.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the configuration store.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    @OutputExport(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    public Output</* @Nullable */ String> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * The sku of the configuration store.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The sku of the configuration store.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The tags of the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
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
    public ConfigurationStore(String name, ConfigurationStoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appconfiguration:ConfigurationStore", name, args == null ? ConfigurationStoreArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConfigurationStore(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appconfiguration:ConfigurationStore", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:appconfiguration/v20190201preview:ConfigurationStore").build()),
                Input.of(Alias.builder().setType("azure-native:appconfiguration/v20191001:ConfigurationStore").build()),
                Input.of(Alias.builder().setType("azure-native:appconfiguration/v20191101preview:ConfigurationStore").build()),
                Input.of(Alias.builder().setType("azure-native:appconfiguration/v20200601:ConfigurationStore").build()),
                Input.of(Alias.builder().setType("azure-native:appconfiguration/v20200701preview:ConfigurationStore").build()),
                Input.of(Alias.builder().setType("azure-native:appconfiguration/v20210301preview:ConfigurationStore").build()),
                Input.of(Alias.builder().setType("azure-native:appconfiguration/v20211001preview:ConfigurationStore").build())
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
    public static ConfigurationStore get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationStore(name, id, options);
    }
}
