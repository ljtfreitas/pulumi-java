// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridnetwork.VendorSkusArgs;
import io.pulumi.azurenative.hybridnetwork.outputs.NetworkFunctionTemplateResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Sku sub resource.
 * API Version: 2020-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hybridnetwork:VendorSkus TestSku /subscriptions/subid/providers/Microsoft.HybridNetwork/vendors/TestVendor/vendorskus/TestSku 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybridnetwork:VendorSkus")
public class VendorSkus extends io.pulumi.resources.CustomResource {
    /**
     * The sku deployment mode.
     * 
     */
    @Export(name="deploymentMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> deploymentMode;

    /**
     * @return The sku deployment mode.
     * 
     */
    public Output</* @Nullable */ String> getDeploymentMode() {
        return this.deploymentMode;
    }
    /**
     * The parameters for the managed application to be supplied by the vendor.
     * 
     */
    @Export(name="managedApplicationParameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> managedApplicationParameters;

    /**
     * @return The parameters for the managed application to be supplied by the vendor.
     * 
     */
    public Output</* @Nullable */ Object> getManagedApplicationParameters() {
        return this.managedApplicationParameters;
    }
    /**
     * The template for the managed application deployment.
     * 
     */
    @Export(name="managedApplicationTemplate", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> managedApplicationTemplate;

    /**
     * @return The template for the managed application deployment.
     * 
     */
    public Output</* @Nullable */ Object> getManagedApplicationTemplate() {
        return this.managedApplicationTemplate;
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
     * The template definition of the network function.
     * 
     */
    @Export(name="networkFunctionTemplate", type=NetworkFunctionTemplateResponse.class, parameters={})
    private Output</* @Nullable */ NetworkFunctionTemplateResponse> networkFunctionTemplate;

    /**
     * @return The template definition of the network function.
     * 
     */
    public Output</* @Nullable */ NetworkFunctionTemplateResponse> getNetworkFunctionTemplate() {
        return this.networkFunctionTemplate;
    }
    /**
     * Indicates if the vendor sku is in preview mode.
     * 
     */
    @Export(name="preview", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> preview;

    /**
     * @return Indicates if the vendor sku is in preview mode.
     * 
     */
    public Output</* @Nullable */ Boolean> getPreview() {
        return this.preview;
    }
    /**
     * The provisioning state of the vendor sku sub resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the vendor sku sub resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku type.
     * 
     */
    @Export(name="skuType", type=String.class, parameters={})
    private Output</* @Nullable */ String> skuType;

    /**
     * @return The sku type.
     * 
     */
    public Output</* @Nullable */ String> getSkuType() {
        return this.skuType;
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
        public void apply(VendorSkusArgs.Builder a);
    }
    private static io.pulumi.azurenative.hybridnetwork.VendorSkusArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.hybridnetwork.VendorSkusArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VendorSkus(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VendorSkus(String name) {
        this(name, VendorSkusArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VendorSkus(String name, VendorSkusArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VendorSkus(String name, VendorSkusArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridnetwork:VendorSkus", name, args == null ? VendorSkusArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VendorSkus(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridnetwork:VendorSkus", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:hybridnetwork/v20200101preview:VendorSkus").build()),
                Output.of(Alias.builder().setType("azure-native:hybridnetwork/v20210501:VendorSkus").build())
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
    public static VendorSkus get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VendorSkus(name, id, options);
    }
}
