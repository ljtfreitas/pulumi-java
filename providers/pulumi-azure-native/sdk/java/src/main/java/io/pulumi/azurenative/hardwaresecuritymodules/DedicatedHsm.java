// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hardwaresecuritymodules;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hardwaresecuritymodules.DedicatedHsmArgs;
import io.pulumi.azurenative.hardwaresecuritymodules.outputs.NetworkProfileResponse;
import io.pulumi.azurenative.hardwaresecuritymodules.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Resource information with extended details.
 * API Version: 2018-10-31-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hardwaresecuritymodules:DedicatedHsm hsm1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/hsm-group/providers/Microsoft.HardwareSecurityModules/dedicatedHSMs/hsm1 
 * ```
 * 
 */
@ResourceType(type="azure-native:hardwaresecuritymodules:DedicatedHsm")
public class DedicatedHsm extends io.pulumi.resources.CustomResource {
    /**
     * The supported Azure location where the dedicated HSM should be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The supported Azure location where the dedicated HSM should be created.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the dedicated HSM.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the dedicated HSM.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the network interfaces of the dedicated hsm.
     * 
     */
    @Export(name="networkProfile", type=NetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ NetworkProfileResponse> networkProfile;

    /**
     * @return Specifies the network interfaces of the dedicated hsm.
     * 
     */
    public Output</* @Nullable */ NetworkProfileResponse> getNetworkProfile() {
        return this.networkProfile;
    }
    /**
     * Provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * SKU details
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return SKU details
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * This field will be used when RP does not support Availability zones.
     * 
     */
    @Export(name="stampId", type=String.class, parameters={})
    private Output</* @Nullable */ String> stampId;

    /**
     * @return This field will be used when RP does not support Availability zones.
     * 
     */
    public Output</* @Nullable */ String> getStampId() {
        return this.stampId;
    }
    /**
     * Resource Status Message.
     * 
     */
    @Export(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return Resource Status Message.
     * 
     */
    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The resource type of the dedicated HSM.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type of the dedicated HSM.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The Dedicated Hsm zones.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return The Dedicated Hsm zones.
     * 
     */
    public Output</* @Nullable */ List<String>> getZones() {
        return this.zones;
    }

    public interface BuilderApplicator {
        public void apply(DedicatedHsmArgs.Builder a);
    }
    private static io.pulumi.azurenative.hardwaresecuritymodules.DedicatedHsmArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.hardwaresecuritymodules.DedicatedHsmArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DedicatedHsm(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DedicatedHsm(String name) {
        this(name, DedicatedHsmArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedHsm(String name, DedicatedHsmArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedHsm(String name, DedicatedHsmArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hardwaresecuritymodules:DedicatedHsm", name, args == null ? DedicatedHsmArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DedicatedHsm(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hardwaresecuritymodules:DedicatedHsm", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:hardwaresecuritymodules/v20181031preview:DedicatedHsm").build()),
                Output.of(Alias.builder().setType("azure-native:hardwaresecuritymodules/v20211130:DedicatedHsm").build())
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
    public static DedicatedHsm get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedHsm(name, id, options);
    }
}
