// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyGroupPlacementPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyGroupPlacementPolicyArgs Empty = new ResourcePolicyGroupPlacementPolicyArgs();

    /**
     * The number of availability domains instances will be spread across. If two instances are in different
     * availability domain, they will not be put in the same low latency network
     * 
     */
    @InputImport(name="availabilityDomainCount")
        private final @Nullable Input<Integer> availabilityDomainCount;

    public Input<Integer> getAvailabilityDomainCount() {
        return this.availabilityDomainCount == null ? Input.empty() : this.availabilityDomainCount;
    }

    /**
     * Collocation specifies whether to place VMs inside the same availability domain on the same low-latency network.
     * Specify `COLLOCATED` to enable collocation. Can only be specified with `vm_count`. If compute instances are created
     * with a COLLOCATED policy, then exactly `vm_count` instances must be created at the same time with the resource policy
     * attached.
     * Possible values are `COLLOCATED`.
     * 
     */
    @InputImport(name="collocation")
        private final @Nullable Input<String> collocation;

    public Input<String> getCollocation() {
        return this.collocation == null ? Input.empty() : this.collocation;
    }

    /**
     * Number of vms in this placement group.
     * 
     */
    @InputImport(name="vmCount")
        private final @Nullable Input<Integer> vmCount;

    public Input<Integer> getVmCount() {
        return this.vmCount == null ? Input.empty() : this.vmCount;
    }

    public ResourcePolicyGroupPlacementPolicyArgs(
        @Nullable Input<Integer> availabilityDomainCount,
        @Nullable Input<String> collocation,
        @Nullable Input<Integer> vmCount) {
        this.availabilityDomainCount = availabilityDomainCount;
        this.collocation = collocation;
        this.vmCount = vmCount;
    }

    private ResourcePolicyGroupPlacementPolicyArgs() {
        this.availabilityDomainCount = Input.empty();
        this.collocation = Input.empty();
        this.vmCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyGroupPlacementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> availabilityDomainCount;
        private @Nullable Input<String> collocation;
        private @Nullable Input<Integer> vmCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyGroupPlacementPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomainCount = defaults.availabilityDomainCount;
    	      this.collocation = defaults.collocation;
    	      this.vmCount = defaults.vmCount;
        }

        public Builder setAvailabilityDomainCount(@Nullable Input<Integer> availabilityDomainCount) {
            this.availabilityDomainCount = availabilityDomainCount;
            return this;
        }

        public Builder setAvailabilityDomainCount(@Nullable Integer availabilityDomainCount) {
            this.availabilityDomainCount = Input.ofNullable(availabilityDomainCount);
            return this;
        }

        public Builder setCollocation(@Nullable Input<String> collocation) {
            this.collocation = collocation;
            return this;
        }

        public Builder setCollocation(@Nullable String collocation) {
            this.collocation = Input.ofNullable(collocation);
            return this;
        }

        public Builder setVmCount(@Nullable Input<Integer> vmCount) {
            this.vmCount = vmCount;
            return this;
        }

        public Builder setVmCount(@Nullable Integer vmCount) {
            this.vmCount = Input.ofNullable(vmCount);
            return this;
        }
        public ResourcePolicyGroupPlacementPolicyArgs build() {
            return new ResourcePolicyGroupPlacementPolicyArgs(availabilityDomainCount, collocation, vmCount);
        }
    }
}
