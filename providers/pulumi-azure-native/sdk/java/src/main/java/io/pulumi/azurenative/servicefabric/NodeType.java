// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabric.NodeTypeArgs;
import io.pulumi.azurenative.servicefabric.outputs.EndpointRangeDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.VMSSExtensionResponse;
import io.pulumi.azurenative.servicefabric.outputs.VaultSecretGroupResponse;
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
 * Describes a node type in the cluster, each node type represents sub set of nodes in the cluster.
 * API Version: 2020-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabric:NodeType BE /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/resRg/providers/Microsoft.ServiceFabric/managedClusters/myCluster/nodeTypes/BE 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabric:NodeType")
public class NodeType extends io.pulumi.resources.CustomResource {
    /**
     * The range of ports from which cluster assigned port to Service Fabric applications.
     * 
     */
    @OutputExport(name="applicationPorts", type=EndpointRangeDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ EndpointRangeDescriptionResponse> applicationPorts;

    /**
     * @return The range of ports from which cluster assigned port to Service Fabric applications.
     * 
     */
    public Output</* @Nullable */ EndpointRangeDescriptionResponse> getApplicationPorts() {
        return this.applicationPorts;
    }
    /**
     * The capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
     * 
     */
    @OutputExport(name="capacities", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> capacities;

    /**
     * @return The capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getCapacities() {
        return this.capacities;
    }
    /**
     * Disk size for each vm in the node type in GBs.
     * 
     */
    @OutputExport(name="dataDiskSizeGB", type=Integer.class, parameters={})
    private Output<Integer> dataDiskSizeGB;

    /**
     * @return Disk size for each vm in the node type in GBs.
     * 
     */
    public Output<Integer> getDataDiskSizeGB() {
        return this.dataDiskSizeGB;
    }
    /**
     * The range of ephemeral ports that nodes in this node type should be configured with.
     * 
     */
    @OutputExport(name="ephemeralPorts", type=EndpointRangeDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ EndpointRangeDescriptionResponse> ephemeralPorts;

    /**
     * @return The range of ephemeral ports that nodes in this node type should be configured with.
     * 
     */
    public Output</* @Nullable */ EndpointRangeDescriptionResponse> getEphemeralPorts() {
        return this.ephemeralPorts;
    }
    /**
     * The node type on which system services will run. Only one node type should be marked as primary. Primary node type cannot be deleted or changed for existing clusters.
     * 
     */
    @OutputExport(name="isPrimary", type=Boolean.class, parameters={})
    private Output<Boolean> isPrimary;

    /**
     * @return The node type on which system services will run. Only one node type should be marked as primary. Primary node type cannot be deleted or changed for existing clusters.
     * 
     */
    public Output<Boolean> getIsPrimary() {
        return this.isPrimary;
    }
    /**
     * Azure resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
     * 
     */
    @OutputExport(name="placementProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> placementProperties;

    /**
     * @return The placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getPlacementProperties() {
        return this.placementProperties;
    }
    /**
     * The provisioning state of the managed cluster resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the managed cluster resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Azure resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Azure resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Set of extensions that should be installed onto the virtual machines.
     * 
     */
    @OutputExport(name="vmExtensions", type=List.class, parameters={VMSSExtensionResponse.class})
    private Output</* @Nullable */ List<VMSSExtensionResponse>> vmExtensions;

    /**
     * @return Set of extensions that should be installed onto the virtual machines.
     * 
     */
    public Output</* @Nullable */ List<VMSSExtensionResponse>> getVmExtensions() {
        return this.vmExtensions;
    }
    /**
     * The offer type of the Azure Virtual Machines Marketplace image. For example, UbuntuServer or WindowsServer.
     * 
     */
    @OutputExport(name="vmImageOffer", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmImageOffer;

    /**
     * @return The offer type of the Azure Virtual Machines Marketplace image. For example, UbuntuServer or WindowsServer.
     * 
     */
    public Output</* @Nullable */ String> getVmImageOffer() {
        return this.vmImageOffer;
    }
    /**
     * The publisher of the Azure Virtual Machines Marketplace image. For example, Canonical or MicrosoftWindowsServer.
     * 
     */
    @OutputExport(name="vmImagePublisher", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmImagePublisher;

    /**
     * @return The publisher of the Azure Virtual Machines Marketplace image. For example, Canonical or MicrosoftWindowsServer.
     * 
     */
    public Output</* @Nullable */ String> getVmImagePublisher() {
        return this.vmImagePublisher;
    }
    /**
     * The SKU of the Azure Virtual Machines Marketplace image. For example, 14.04.0-LTS or 2012-R2-Datacenter.
     * 
     */
    @OutputExport(name="vmImageSku", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmImageSku;

    /**
     * @return The SKU of the Azure Virtual Machines Marketplace image. For example, 14.04.0-LTS or 2012-R2-Datacenter.
     * 
     */
    public Output</* @Nullable */ String> getVmImageSku() {
        return this.vmImageSku;
    }
    /**
     * The version of the Azure Virtual Machines Marketplace image. A value of 'latest' can be specified to select the latest version of an image. If omitted, the default is 'latest'.
     * 
     */
    @OutputExport(name="vmImageVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmImageVersion;

    /**
     * @return The version of the Azure Virtual Machines Marketplace image. A value of 'latest' can be specified to select the latest version of an image. If omitted, the default is 'latest'.
     * 
     */
    public Output</* @Nullable */ String> getVmImageVersion() {
        return this.vmImageVersion;
    }
    /**
     * The number of nodes in the node type.
     * 
     */
    @OutputExport(name="vmInstanceCount", type=Integer.class, parameters={})
    private Output<Integer> vmInstanceCount;

    /**
     * @return The number of nodes in the node type.
     * 
     */
    public Output<Integer> getVmInstanceCount() {
        return this.vmInstanceCount;
    }
    /**
     * The secrets to install in the virtual machines.
     * 
     */
    @OutputExport(name="vmSecrets", type=List.class, parameters={VaultSecretGroupResponse.class})
    private Output</* @Nullable */ List<VaultSecretGroupResponse>> vmSecrets;

    /**
     * @return The secrets to install in the virtual machines.
     * 
     */
    public Output</* @Nullable */ List<VaultSecretGroupResponse>> getVmSecrets() {
        return this.vmSecrets;
    }
    /**
     * The size of virtual machines in the pool. All virtual machines in a pool are the same size. For example, Standard_D3.
     * 
     */
    @OutputExport(name="vmSize", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmSize;

    /**
     * @return The size of virtual machines in the pool. All virtual machines in a pool are the same size. For example, Standard_D3.
     * 
     */
    public Output</* @Nullable */ String> getVmSize() {
        return this.vmSize;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodeType(String name, NodeTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:NodeType", name, args == null ? NodeTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NodeType(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:NodeType", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20200101preview:NodeType").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20210101preview:NodeType").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20210501:NodeType").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20210701preview:NodeType").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20210901privatepreview:NodeType").build()),
                Input.of(Alias.builder().setType("azure-native:servicefabric/v20211101preview:NodeType").build())
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
    public static NodeType get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NodeType(name, id, options);
    }
}
