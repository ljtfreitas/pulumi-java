// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.AddonArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An addon resource
 * API Version: 2020-07-17-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:avs:Addon srm /subscriptions/{subscription-id}/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/cloud1/addons/srm 
 * ```
 * 
 */
@ResourceType(type="azure-native:avs:Addon")
public class Addon extends io.pulumi.resources.CustomResource {
    /**
     * The type of private cloud addon
     * 
     */
    @Export(name="addonType", type=String.class, parameters={})
    private Output</* @Nullable */ String> addonType;

    /**
     * @return The type of private cloud addon
     * 
     */
    public Output</* @Nullable */ String> getAddonType() {
        return this.addonType;
    }
    /**
     * The SRM license
     * 
     */
    @Export(name="licenseKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseKey;

    /**
     * @return The SRM license
     * 
     */
    public Output</* @Nullable */ String> getLicenseKey() {
        return this.licenseKey;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The state of the addon provisioning
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The state of the addon provisioning
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(AddonArgs.Builder a);
    }
    private static io.pulumi.azurenative.avs.AddonArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.avs.AddonArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Addon(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Addon(String name) {
        this(name, AddonArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Addon(String name, AddonArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Addon(String name, AddonArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:Addon", name, args == null ? AddonArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Addon(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:Addon", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:avs/v20200717preview:Addon").build()),
                Output.of(Alias.builder().setType("azure-native:avs/v20210101preview:Addon").build()),
                Output.of(Alias.builder().setType("azure-native:avs/v20210601:Addon").build()),
                Output.of(Alias.builder().setType("azure-native:avs/v20211201:Addon").build())
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
    public static Addon get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Addon(name, id, options);
    }
}
