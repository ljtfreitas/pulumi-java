// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.softwareplan;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.softwareplan.HybridUseBenefitArgs;
import io.pulumi.azurenative.softwareplan.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Response on GET of a hybrid use benefit
 * API Version: 2019-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:softwareplan:HybridUseBenefit SQL_{hostGroupName}_{hostName} /subscriptions/{sub-id}/resourceGroups/{rg-name}/providers/Microsoft.Compute/HostGroups/{host-group-name}/hosts/{host-name}/providers/Microsoft.SoftwarePlan/hybridUseBenefits/SQL_{hostGroupName}_{hostName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:softwareplan:HybridUseBenefit")
public class HybridUseBenefit extends io.pulumi.resources.CustomResource {
    /**
     * Created date
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return Created date
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Indicates the revision of the hybrid use benefit
     * 
     */
    @Export(name="etag", type=Integer.class, parameters={})
    private Output<Integer> etag;

    /**
     * @return Indicates the revision of the hybrid use benefit
     * 
     */
    public Output<Integer> getEtag() {
        return this.etag;
    }
    /**
     * Last updated date
     * 
     */
    @Export(name="lastUpdatedDate", type=String.class, parameters={})
    private Output<String> lastUpdatedDate;

    /**
     * @return Last updated date
     * 
     */
    public Output<String> getLastUpdatedDate() {
        return this.lastUpdatedDate;
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
     * Provisioning state
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Hybrid use benefit SKU
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return Hybrid use benefit SKU
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
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
        public void apply(HybridUseBenefitArgs.Builder a);
    }
    private static io.pulumi.azurenative.softwareplan.HybridUseBenefitArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.softwareplan.HybridUseBenefitArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public HybridUseBenefit(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HybridUseBenefit(String name) {
        this(name, HybridUseBenefitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HybridUseBenefit(String name, HybridUseBenefitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HybridUseBenefit(String name, HybridUseBenefitArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:softwareplan:HybridUseBenefit", name, args == null ? HybridUseBenefitArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private HybridUseBenefit(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:softwareplan:HybridUseBenefit", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:softwareplan/v20190601preview:HybridUseBenefit").build()),
                Output.of(Alias.builder().setType("azure-native:softwareplan/v20191201:HybridUseBenefit").build())
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
    public static HybridUseBenefit get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HybridUseBenefit(name, id, options);
    }
}
