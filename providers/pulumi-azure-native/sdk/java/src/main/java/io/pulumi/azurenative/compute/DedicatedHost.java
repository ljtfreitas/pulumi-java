// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.DedicatedHostArgs;
import io.pulumi.azurenative.compute.outputs.DedicatedHostInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.SkuResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceReadOnlyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Specifies information about the Dedicated host.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:DedicatedHost myDedicatedHost /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/HostGroups/myDedicatedHostGroup/hosts/myDedicatedHost 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:DedicatedHost")
public class DedicatedHost extends io.pulumi.resources.CustomResource {
    /**
     * Specifies whether the dedicated host should be replaced automatically in case of a failure. The value is defaulted to 'true' when not provided.
     * 
     */
    @OutputExport(name="autoReplaceOnFailure", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoReplaceOnFailure;

    /**
     * @return Specifies whether the dedicated host should be replaced automatically in case of a failure. The value is defaulted to 'true' when not provided.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoReplaceOnFailure() {
        return this.autoReplaceOnFailure;
    }
    /**
     * A unique id generated and assigned to the dedicated host by the platform. <br><br> Does not change throughout the lifetime of the host.
     * 
     */
    @OutputExport(name="hostId", type=String.class, parameters={})
    private Output<String> hostId;

    /**
     * @return A unique id generated and assigned to the dedicated host by the platform. <br><br> Does not change throughout the lifetime of the host.
     * 
     */
    public Output<String> getHostId() {
        return this.hostId;
    }
    /**
     * The dedicated host instance view.
     * 
     */
    @OutputExport(name="instanceView", type=DedicatedHostInstanceViewResponse.class, parameters={})
    private Output<DedicatedHostInstanceViewResponse> instanceView;

    /**
     * @return The dedicated host instance view.
     * 
     */
    public Output<DedicatedHostInstanceViewResponse> getInstanceView() {
        return this.instanceView;
    }
    /**
     * Specifies the software license type that will be applied to the VMs deployed on the dedicated host. <br><br> Possible values are: <br><br> **None** <br><br> **Windows_Server_Hybrid** <br><br> **Windows_Server_Perpetual** <br><br> Default: **None**
     * 
     */
    @OutputExport(name="licenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseType;

    /**
     * @return Specifies the software license type that will be applied to the VMs deployed on the dedicated host. <br><br> Possible values are: <br><br> **None** <br><br> **Windows_Server_Hybrid** <br><br> **Windows_Server_Perpetual** <br><br> Default: **None**
     * 
     */
    public Output</* @Nullable */ String> getLicenseType() {
        return this.licenseType;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Fault domain of the dedicated host within a dedicated host group.
     * 
     */
    @OutputExport(name="platformFaultDomain", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> platformFaultDomain;

    /**
     * @return Fault domain of the dedicated host within a dedicated host group.
     * 
     */
    public Output</* @Nullable */ Integer> getPlatformFaultDomain() {
        return this.platformFaultDomain;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The date when the host was first provisioned.
     * 
     */
    @OutputExport(name="provisioningTime", type=String.class, parameters={})
    private Output<String> provisioningTime;

    /**
     * @return The date when the host was first provisioned.
     * 
     */
    public Output<String> getProvisioningTime() {
        return this.provisioningTime;
    }
    /**
     * SKU of the dedicated host for Hardware Generation and VM family. Only name is required to be set. List Microsoft.Compute SKUs for a list of possible values.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return SKU of the dedicated host for Hardware Generation and VM family. Only name is required to be set. List Microsoft.Compute SKUs for a list of possible values.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * A list of references to all virtual machines in the Dedicated Host.
     * 
     */
    @OutputExport(name="virtualMachines", type=List.class, parameters={SubResourceReadOnlyResponse.class})
    private Output<List<SubResourceReadOnlyResponse>> virtualMachines;

    /**
     * @return A list of references to all virtual machines in the Dedicated Host.
     * 
     */
    public Output<List<SubResourceReadOnlyResponse>> getVirtualMachines() {
        return this.virtualMachines;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedHost(String name, DedicatedHostArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:DedicatedHost", name, args == null ? DedicatedHostArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DedicatedHost(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:DedicatedHost", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:compute/v20190301:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20190701:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20191201:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20200601:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20201201:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210301:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210401:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210701:DedicatedHost").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20211101:DedicatedHost").build())
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
    public static DedicatedHost get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedHost(name, id, options);
    }
}
