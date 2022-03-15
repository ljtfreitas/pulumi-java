// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.inputs.SkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="capacityReservationGroupName", required=true)
      private final Output<String> capacityReservationGroupName;

    public Output<String> getCapacityReservationGroupName() {
        return this.capacityReservationGroupName;
    }

    /**
     * The name of the capacity reservation.
     * 
     */
    @Import(name="capacityReservationName")
      private final @Nullable Output<String> capacityReservationName;

    public Output<String> getCapacityReservationName() {
        return this.capacityReservationName == null ? Output.empty() : this.capacityReservationName;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * SKU of the resource for which capacity needs be reserved. The SKU name and capacity is required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are supported. Refer to List Microsoft.Compute SKUs in a region (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Availability Zone to use for this capacity reservation. The zone has to be single value and also should be part for the list of zones specified during the capacity reservation group creation. The zone can be assigned only during creation. If not provided, the reservation supports only non-zonal deployments. If provided, enforces VM/VMSS using this capacity reservation to be in same zone.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> getZones() {
        return this.zones == null ? Output.empty() : this.zones;
    }

    public CapacityReservationArgs(
        Output<String> capacityReservationGroupName,
        @Nullable Output<String> capacityReservationName,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<String>> zones) {
        this.capacityReservationGroupName = Objects.requireNonNull(capacityReservationGroupName, "expected parameter 'capacityReservationGroupName' to be non-null");
        this.capacityReservationName = capacityReservationName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
        this.zones = zones;
    }

    private CapacityReservationArgs() {
        this.capacityReservationGroupName = Output.empty();
        this.capacityReservationName = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
        this.zones = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> capacityReservationGroupName;
        private @Nullable Output<String> capacityReservationName;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<String>> zones;

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

        public Builder capacityReservationGroupName(Output<String> capacityReservationGroupName) {
            this.capacityReservationGroupName = Objects.requireNonNull(capacityReservationGroupName);
            return this;
        }

        public Builder capacityReservationGroupName(String capacityReservationGroupName) {
            this.capacityReservationGroupName = Output.of(Objects.requireNonNull(capacityReservationGroupName));
            return this;
        }

        public Builder capacityReservationName(@Nullable Output<String> capacityReservationName) {
            this.capacityReservationName = capacityReservationName;
            return this;
        }

        public Builder capacityReservationName(@Nullable String capacityReservationName) {
            this.capacityReservationName = Output.ofNullable(capacityReservationName);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sku(Output<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder sku(SkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder zones(@Nullable List<String> zones) {
            this.zones = Output.ofNullable(zones);
            return this;
        }
        public CapacityReservationArgs build() {
            return new CapacityReservationArgs(capacityReservationGroupName, capacityReservationName, location, resourceGroupName, sku, tags, zones);
        }
    }
}
