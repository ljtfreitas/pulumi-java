// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.changeanalysis;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.changeanalysis.ConfigurationProfileArgs;
import io.pulumi.azurenative.changeanalysis.outputs.ConfigurationProfileResourcePropertiesResponse;
import io.pulumi.azurenative.changeanalysis.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.changeanalysis.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A profile object that contains change analysis configuration, such as notification settings, for this subscription
 * API Version: 2020-04-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:changeanalysis:ConfigurationProfile default /subscriptions/c80fb759-c965-4c6a-9110-9b2b2d038882/providers/Microsoft.ChangeAnalysis/profile/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:changeanalysis:ConfigurationProfile")
public class ConfigurationProfile extends io.pulumi.resources.CustomResource {
    /**
     * The identity block returned by ARM resource that supports managed identity.
     * 
     */
    @Export(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return The identity block returned by ARM resource that supports managed identity.
     * 
     */
    public Output</* @Nullable */ ResourceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The location where the resource is to be deployed.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location where the resource is to be deployed.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The properties of a configuration profile.
     * 
     */
    @Export(name="properties", type=ConfigurationProfileResourcePropertiesResponse.class, parameters={})
    private Output<ConfigurationProfileResourcePropertiesResponse> properties;

    /**
     * @return The properties of a configuration profile.
     * 
     */
    public Output<ConfigurationProfileResourcePropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output</* @Nullable */ SystemDataResponse> systemData;

    /**
     * @return Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    public Output</* @Nullable */ SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ConfigurationProfileArgs.Builder a);
    }
    private static io.pulumi.azurenative.changeanalysis.ConfigurationProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.changeanalysis.ConfigurationProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ConfigurationProfile(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationProfile(String name) {
        this(name, ConfigurationProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationProfile(String name, @Nullable ConfigurationProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationProfile(String name, @Nullable ConfigurationProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:changeanalysis:ConfigurationProfile", name, args == null ? ConfigurationProfileArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ConfigurationProfile(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:changeanalysis:ConfigurationProfile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:changeanalysis/v20200401preview:ConfigurationProfile").build())
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
    public static ConfigurationProfile get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationProfile(name, id, options);
    }
}
