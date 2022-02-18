// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityReservationArgs Empty = new CapacityReservationArgs();

    /**
     * The name of the capacity reservation group.
     * 
     */
    @InputImport(name="capacityReservationGroupName", required=true)
    private final Input<String> capacityReservationGroupName;

    public Input<String> getCapacityReservationGroupName() {
        return this.capacityReservationGroupName;
    }

    /**
     * The name of the capacity reservation.
     * 
     */
    @InputImport(name="capacityReservationName")
    private final @Nullable Input<String> capacityReservationName;

    public Input<String> getCapacityReservationName() {
        return this.capacityReservationName == null ? Input.empty() : this.capacityReservationName;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * SKU of the resource for which capacity needs be reserved. The SKU name and capacity is required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are supported. Refer to List Microsoft.Compute SKUs in a region (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     * 
     */
    @InputImport(name="sku", required=true)
    private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Availability Zone to use for this capacity reservation. The zone has to be single value and also should be part for the list of zones specified during the capacity reservation group creation. The zone can be assigned only during creation. If not provided, the reservation supports only non-zonal deployments. If provided, enforces VM/VMSS using this capacity reservation to be in same zone.
     * 
     */
    @InputImport(name="zones")
    private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public CapacityReservationArgs(
        Input<String> capacityReservationGroupName,
        @Nullable Input<String> capacityReservationName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<String>> zones) {
        this.capacityReservationGroupName = Objects.requireNonNull(capacityReservationGroupName, "expected parameter 'capacityReservationGroupName' to be non-null");
        this.capacityReservationName = capacityReservationName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
        this.zones = zones;
    }

    private CapacityReservationArgs() {
        this.capacityReservationGroupName = Input.empty();
        this.capacityReservationName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> capacityReservationGroupName;
        private @Nullable Input<String> capacityReservationName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationGroupName = defaults.capacityReservationGroupName;
    	      this.capacityReservationName = defaults.capacityReservationName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.zones = defaults.zones;
        }

        public Builder setCapacityReservationGroupName(Input<String> capacityReservationGroupName) {
            this.capacityReservationGroupName = Objects.requireNonNull(capacityReservationGroupName);
            return this;
        }

        public Builder setCapacityReservationGroupName(String capacityReservationGroupName) {
            this.capacityReservationGroupName = Input.of(Objects.requireNonNull(capacityReservationGroupName));
            return this;
        }

        public Builder setCapacityReservationName(@Nullable Input<String> capacityReservationName) {
            this.capacityReservationName = capacityReservationName;
            return this;
        }

        public Builder setCapacityReservationName(@Nullable String capacityReservationName) {
            this.capacityReservationName = Input.ofNullable(capacityReservationName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setZones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }

        public CapacityReservationArgs build() {
            return new CapacityReservationArgs(capacityReservationGroupName, capacityReservationName, location, resourceGroupName, sku, tags, zones);
        }
    }
}
