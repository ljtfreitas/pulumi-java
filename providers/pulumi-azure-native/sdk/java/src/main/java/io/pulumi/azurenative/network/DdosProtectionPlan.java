// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.DdosProtectionPlanArgs;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
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
 * A DDoS protection plan in a resource group.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:DdosProtectionPlan test-plan /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/ddosProtectionPlans/test-plan 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:DdosProtectionPlan")
public class DdosProtectionPlan extends io.pulumi.resources.CustomResource {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the DDoS protection plan resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the DDoS protection plan resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the DDoS protection plan resource. It uniquely identifies the resource, even if the user changes its name or migrate the resource across subscriptions or resource groups.
     * 
     */
    @OutputExport(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the DDoS protection plan resource. It uniquely identifies the resource, even if the user changes its name or migrate the resource across subscriptions or resource groups.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The list of virtual networks associated with the DDoS protection plan resource. This list is read-only.
     * 
     */
    @OutputExport(name="virtualNetworks", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> virtualNetworks;

    /**
     * @return The list of virtual networks associated with the DDoS protection plan resource. This list is read-only.
     * 
     */
    public Output<List<SubResourceResponse>> getVirtualNetworks() {
        return this.virtualNetworks;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DdosProtectionPlan(String name, DdosProtectionPlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:DdosProtectionPlan", name, args == null ? DdosProtectionPlanArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DdosProtectionPlan(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:DdosProtectionPlan", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180201:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180401:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180601:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180701:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:DdosProtectionPlan").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:DdosProtectionPlan").build())
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
    public static DdosProtectionPlan get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DdosProtectionPlan(name, id, options);
    }
}
