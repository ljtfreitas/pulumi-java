// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.inputs.SkuArgs;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AvailabilitySetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AvailabilitySetArgs Empty = new AvailabilitySetArgs();

    /**
     * The name of the availability set.
     * 
     */
    @Import(name="availabilitySetName")
      private final @Nullable Output<String> availabilitySetName;

    public Output<String> getAvailabilitySetName() {
        return this.availabilitySetName == null ? Output.empty() : this.availabilitySetName;
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
     * Fault Domain count.
     * 
     */
    @Import(name="platformFaultDomainCount")
      private final @Nullable Output<Integer> platformFaultDomainCount;

    public Output<Integer> getPlatformFaultDomainCount() {
        return this.platformFaultDomainCount == null ? Output.empty() : this.platformFaultDomainCount;
    }

    /**
     * Update Domain count.
     * 
     */
    @Import(name="platformUpdateDomainCount")
      private final @Nullable Output<Integer> platformUpdateDomainCount;

    public Output<Integer> getPlatformUpdateDomainCount() {
        return this.platformUpdateDomainCount == null ? Output.empty() : this.platformUpdateDomainCount;
    }

    /**
     * Specifies information about the proximity placement group that the availability set should be assigned to. <br><br>Minimum api-version: 2018-04-01.
     * 
     */
    @Import(name="proximityPlacementGroup")
      private final @Nullable Output<SubResourceArgs> proximityPlacementGroup;

    public Output<SubResourceArgs> getProximityPlacementGroup() {
        return this.proximityPlacementGroup == null ? Output.empty() : this.proximityPlacementGroup;
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
     * Sku of the availability set, only name is required to be set. See AvailabilitySetSkuTypes for possible set of values. Use 'Aligned' for virtual machines with managed disks and 'Classic' for virtual machines with unmanaged disks. Default value is 'Classic'.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
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
     * A list of references to all virtual machines in the availability set.
     * 
     */
    @Import(name="virtualMachines")
      private final @Nullable Output<List<SubResourceArgs>> virtualMachines;

    public Output<List<SubResourceArgs>> getVirtualMachines() {
        return this.virtualMachines == null ? Output.empty() : this.virtualMachines;
    }

    public AvailabilitySetArgs(
        @Nullable Output<String> availabilitySetName,
        @Nullable Output<String> location,
        @Nullable Output<Integer> platformFaultDomainCount,
        @Nullable Output<Integer> platformUpdateDomainCount,
        @Nullable Output<SubResourceArgs> proximityPlacementGroup,
        Output<String> resourceGroupName,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<SubResourceArgs>> virtualMachines) {
        this.availabilitySetName = availabilitySetName;
        this.location = location;
        this.platformFaultDomainCount = platformFaultDomainCount;
        this.platformUpdateDomainCount = platformUpdateDomainCount;
        this.proximityPlacementGroup = proximityPlacementGroup;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.virtualMachines = virtualMachines;
    }

    private AvailabilitySetArgs() {
        this.availabilitySetName = Output.empty();
        this.location = Output.empty();
        this.platformFaultDomainCount = Output.empty();
        this.platformUpdateDomainCount = Output.empty();
        this.proximityPlacementGroup = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
        this.virtualMachines = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailabilitySetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> availabilitySetName;
        private @Nullable Output<String> location;
        private @Nullable Output<Integer> platformFaultDomainCount;
        private @Nullable Output<Integer> platformUpdateDomainCount;
        private @Nullable Output<SubResourceArgs> proximityPlacementGroup;
        private Output<String> resourceGroupName;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<SubResourceArgs>> virtualMachines;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailabilitySetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilitySetName = defaults.availabilitySetName;
    	      this.location = defaults.location;
    	      this.platformFaultDomainCount = defaults.platformFaultDomainCount;
    	      this.platformUpdateDomainCount = defaults.platformUpdateDomainCount;
    	      this.proximityPlacementGroup = defaults.proximityPlacementGroup;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.virtualMachines = defaults.virtualMachines;
        }

        public Builder availabilitySetName(@Nullable Output<String> availabilitySetName) {
            this.availabilitySetName = availabilitySetName;
            return this;
        }

        public Builder availabilitySetName(@Nullable String availabilitySetName) {
            this.availabilitySetName = Output.ofNullable(availabilitySetName);
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

        public Builder platformFaultDomainCount(@Nullable Output<Integer> platformFaultDomainCount) {
            this.platformFaultDomainCount = platformFaultDomainCount;
            return this;
        }

        public Builder platformFaultDomainCount(@Nullable Integer platformFaultDomainCount) {
            this.platformFaultDomainCount = Output.ofNullable(platformFaultDomainCount);
            return this;
        }

        public Builder platformUpdateDomainCount(@Nullable Output<Integer> platformUpdateDomainCount) {
            this.platformUpdateDomainCount = platformUpdateDomainCount;
            return this;
        }

        public Builder platformUpdateDomainCount(@Nullable Integer platformUpdateDomainCount) {
            this.platformUpdateDomainCount = Output.ofNullable(platformUpdateDomainCount);
            return this;
        }

        public Builder proximityPlacementGroup(@Nullable Output<SubResourceArgs> proximityPlacementGroup) {
            this.proximityPlacementGroup = proximityPlacementGroup;
            return this;
        }

        public Builder proximityPlacementGroup(@Nullable SubResourceArgs proximityPlacementGroup) {
            this.proximityPlacementGroup = Output.ofNullable(proximityPlacementGroup);
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

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Output.ofNullable(sku);
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

        public Builder virtualMachines(@Nullable Output<List<SubResourceArgs>> virtualMachines) {
            this.virtualMachines = virtualMachines;
            return this;
        }

        public Builder virtualMachines(@Nullable List<SubResourceArgs> virtualMachines) {
            this.virtualMachines = Output.ofNullable(virtualMachines);
            return this;
        }
        public AvailabilitySetArgs build() {
            return new AvailabilitySetArgs(availabilitySetName, location, platformFaultDomainCount, platformUpdateDomainCount, proximityPlacementGroup, resourceGroupName, sku, tags, virtualMachines);
        }
    }
}
