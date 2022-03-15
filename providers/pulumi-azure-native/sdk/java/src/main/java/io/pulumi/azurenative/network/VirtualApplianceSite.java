// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualApplianceSiteArgs;
import io.pulumi.azurenative.network.outputs.Office365PolicyPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Virtual Appliance Site resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VirtualApplianceSite site1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkVirtualAppliances/nva/virtualApplianceSites/site1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualApplianceSite")
public class VirtualApplianceSite extends io.pulumi.resources.CustomResource {
    /**
     * Address Prefix.
     * 
     */
    @Export(name="addressPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> addressPrefix;

    /**
     * @return Address Prefix.
     * 
     */
    public Output</* @Nullable */ String> getAddressPrefix() {
        return this.addressPrefix;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Name of the virtual appliance site.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the virtual appliance site.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Office 365 Policy.
     * 
     */
    @Export(name="o365Policy", type=Office365PolicyPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ Office365PolicyPropertiesResponse> o365Policy;

    /**
     * @return Office 365 Policy.
     * 
     */
    public Output</* @Nullable */ Office365PolicyPropertiesResponse> getO365Policy() {
        return this.o365Policy;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Site type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Site type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(VirtualApplianceSiteArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.VirtualApplianceSiteArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.VirtualApplianceSiteArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualApplianceSite(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualApplianceSite(String name) {
        this(name, VirtualApplianceSiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualApplianceSite(String name, VirtualApplianceSiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualApplianceSite(String name, VirtualApplianceSiteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualApplianceSite", name, args == null ? VirtualApplianceSiteArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VirtualApplianceSite(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualApplianceSite", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:network/v20200501:VirtualApplianceSite").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200601:VirtualApplianceSite").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200701:VirtualApplianceSite").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200801:VirtualApplianceSite").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20201101:VirtualApplianceSite").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210201:VirtualApplianceSite").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210301:VirtualApplianceSite").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210501:VirtualApplianceSite").build())
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
    public static VirtualApplianceSite get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualApplianceSite(name, id, options);
    }
}
