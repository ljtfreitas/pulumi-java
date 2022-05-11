// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.DiskPoolIscsiTargetLunArgs;
import com.pulumi.azure.compute.inputs.DiskPoolIscsiTargetLunState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an iSCSI Target lun.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import com.pulumi.codegen.internal.KeyedValue;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .virtualNetworkName(exampleVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.0.0.0/24&#34;)
 *             .delegations(SubnetDelegation.builder()
 *                 .name(&#34;diskspool&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegation.builder()
 *                     .actions(&#34;Microsoft.Network/virtualNetworks/read&#34;)
 *                     .name(&#34;Microsoft.StoragePool/diskPools&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleDiskPool = new DiskPool(&#34;exampleDiskPool&#34;, DiskPoolArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .subnetId(exampleSubnet.getId())
 *             .zones(&#34;1&#34;)
 *             .skuName(&#34;Basic_B1&#34;)
 *             .build());
 * 
 *         var exampleManagedDisk = new ManagedDisk(&#34;exampleManagedDisk&#34;, ManagedDiskArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .createOption(&#34;Empty&#34;)
 *             .storageAccountType(&#34;Premium_LRS&#34;)
 *             .diskSizeGb(4)
 *             .maxShares(2)
 *             .zones(&#34;1&#34;)
 *             .build());
 * 
 *         final var exampleServicePrincipal = Output.of(AzureadFunctions.getServicePrincipal(GetServicePrincipalArgs.builder()
 *             .displayName(&#34;StoragePool Resource Provider&#34;)
 *             .build()));
 * 
 *         final var roles =         
 *             &#34;Disk Pool Operator&#34;,
 *             &#34;Virtual Machine Contributor&#34;;
 * 
 *         for (var i = 0; i &lt; roles.length(); i++) {
 *             new Assignment(&#34;exampleAssignment-&#34; + i, AssignmentArgs.builder()            
 *                 .principalId(exampleServicePrincipal.apply(getServicePrincipalResult -&gt; getServicePrincipalResult.getId()))
 *                 .roleDefinitionName(roles[range.getValue()])
 *                 .scope(exampleManagedDisk.getId())
 *                 .build());
 * 
 *         
 * }
 *         var exampleDiskPoolManagedDiskAttachment = new DiskPoolManagedDiskAttachment(&#34;exampleDiskPoolManagedDiskAttachment&#34;, DiskPoolManagedDiskAttachmentArgs.builder()        
 *             .diskPoolId(exampleDiskPool.getId())
 *             .managedDiskId(exampleManagedDisk.getId())
 *             .build());
 * 
 *         var exampleDiskPoolIscsiTarget = new DiskPoolIscsiTarget(&#34;exampleDiskPoolIscsiTarget&#34;, DiskPoolIscsiTargetArgs.builder()        
 *             .aclMode(&#34;Dynamic&#34;)
 *             .disksPoolId(exampleDiskPool.getId())
 *             .targetIqn(&#34;iqn.2021-11.com.microsoft:test&#34;)
 *             .build());
 * 
 *         var exampleDiskPoolIscsiTargetLun = new DiskPoolIscsiTargetLun(&#34;exampleDiskPoolIscsiTargetLun&#34;, DiskPoolIscsiTargetLunArgs.builder()        
 *             .iscsiTargetId(exampleDiskPoolIscsiTarget.getId())
 *             .diskPoolManagedDiskAttachmentId(exampleDiskPoolManagedDiskAttachment.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * iSCSI Target Luns can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/diskPoolIscsiTargetLun:DiskPoolIscsiTargetLun example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/example-resource-group/providers/Microsoft.StoragePool/diskPools/diskPoolValue/iscsiTargets/iscsiTargetValue/lun|/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Compute/disks/disk1
 * ```
 * 
 */
@ResourceType(type="azure:compute/diskPoolIscsiTargetLun:DiskPoolIscsiTargetLun")
public class DiskPoolIscsiTargetLun extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the `azure.compute.DiskPoolManagedDiskAttachment`. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    @Export(name="diskPoolManagedDiskAttachmentId", type=String.class, parameters={})
    private Output<String> diskPoolManagedDiskAttachmentId;

    /**
     * @return The ID of the `azure.compute.DiskPoolManagedDiskAttachment`. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    public Output<String> diskPoolManagedDiskAttachmentId() {
        return this.diskPoolManagedDiskAttachmentId;
    }
    /**
     * The ID of the iSCSI Target. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    @Export(name="iscsiTargetId", type=String.class, parameters={})
    private Output<String> iscsiTargetId;

    /**
     * @return The ID of the iSCSI Target. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    public Output<String> iscsiTargetId() {
        return this.iscsiTargetId;
    }
    /**
     * The Logical Unit Number of the iSCSI Target LUN.
     * 
     */
    @Export(name="lun", type=Integer.class, parameters={})
    private Output<Integer> lun;

    /**
     * @return The Logical Unit Number of the iSCSI Target LUN.
     * 
     */
    public Output<Integer> lun() {
        return this.lun;
    }
    /**
     * User defined name for iSCSI LUN. Supported characters include uppercase letters, lowercase letters, numbers, periods, underscores or hyphens. Name should end with an alphanumeric character. The length must be between `1` and `90`. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User defined name for iSCSI LUN. Supported characters include uppercase letters, lowercase letters, numbers, periods, underscores or hyphens. Name should end with an alphanumeric character. The length must be between `1` and `90`. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskPoolIscsiTargetLun(String name) {
        this(name, DiskPoolIscsiTargetLunArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskPoolIscsiTargetLun(String name, DiskPoolIscsiTargetLunArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskPoolIscsiTargetLun(String name, DiskPoolIscsiTargetLunArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/diskPoolIscsiTargetLun:DiskPoolIscsiTargetLun", name, args == null ? DiskPoolIscsiTargetLunArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiskPoolIscsiTargetLun(String name, Output<String> id, @Nullable DiskPoolIscsiTargetLunState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/diskPoolIscsiTargetLun:DiskPoolIscsiTargetLun", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DiskPoolIscsiTargetLun get(String name, Output<String> id, @Nullable DiskPoolIscsiTargetLunState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiskPoolIscsiTargetLun(name, id, state, options);
    }
}
