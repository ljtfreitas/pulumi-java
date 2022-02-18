// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.CapacityReservationGroupArgs;
import io.pulumi.azurenative.compute.outputs.CapacityReservationGroupInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceReadOnlyResponse;
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
 * Specifies information about the capacity reservation group that the capacity reservations should be assigned to. <br><br> Currently, a capacity reservation can only be added to a capacity reservation group at creation time. An existing capacity reservation cannot be added or moved to another capacity reservation group.
 * API Version: 2021-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:CapacityReservationGroup myCapacityReservationGroup /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/CapacityReservationGroups/myCapacityReservationGroup 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:CapacityReservationGroup")
public class CapacityReservationGroup extends io.pulumi.resources.CustomResource {
    /**
     * A list of all capacity reservation resource ids that belong to capacity reservation group.
     * 
     */
    @OutputExport(name="capacityReservations", type=List.class, parameters={SubResourceReadOnlyResponse.class})
    private Output<List<SubResourceReadOnlyResponse>> capacityReservations;

    /**
     * @return A list of all capacity reservation resource ids that belong to capacity reservation group.
     * 
     */
    public Output<List<SubResourceReadOnlyResponse>> getCapacityReservations() {
        return this.capacityReservations;
    }
    /**
     * The capacity reservation group instance view which has the list of instance views for all the capacity reservations that belong to the capacity reservation group.
     * 
     */
    @OutputExport(name="instanceView", type=CapacityReservationGroupInstanceViewResponse.class, parameters={})
    private Output<CapacityReservationGroupInstanceViewResponse> instanceView;

    /**
     * @return The capacity reservation group instance view which has the list of instance views for all the capacity reservations that belong to the capacity reservation group.
     * 
     */
    public Output<CapacityReservationGroupInstanceViewResponse> getInstanceView() {
        return this.instanceView;
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
     * A list of references to all virtual machines associated to the capacity reservation group.
     * 
     */
    @OutputExport(name="virtualMachinesAssociated", type=List.class, parameters={SubResourceReadOnlyResponse.class})
    private Output<List<SubResourceReadOnlyResponse>> virtualMachinesAssociated;

    /**
     * @return A list of references to all virtual machines associated to the capacity reservation group.
     * 
     */
    public Output<List<SubResourceReadOnlyResponse>> getVirtualMachinesAssociated() {
        return this.virtualMachinesAssociated;
    }
    /**
     * Availability Zones to use for this capacity reservation group. The zones can be assigned only during creation. If not provided, the group supports only regional resources in the region. If provided, enforces each capacity reservation in the group to be in one of the zones.
     * 
     */
    @OutputExport(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return Availability Zones to use for this capacity reservation group. The zones can be assigned only during creation. If not provided, the group supports only regional resources in the region. If provided, enforces each capacity reservation in the group to be in one of the zones.
     * 
     */
    public Output</* @Nullable */ List<String>> getZones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CapacityReservationGroup(String name, CapacityReservationGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:CapacityReservationGroup", name, args == null ? CapacityReservationGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CapacityReservationGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:CapacityReservationGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:compute/v20210401:CapacityReservationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210701:CapacityReservationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20211101:CapacityReservationGroup").build())
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
    public static CapacityReservationGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CapacityReservationGroup(name, id, options);
    }
}
