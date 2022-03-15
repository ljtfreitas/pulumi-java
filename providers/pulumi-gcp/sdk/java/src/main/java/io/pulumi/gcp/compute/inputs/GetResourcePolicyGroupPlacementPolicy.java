// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePolicyGroupPlacementPolicy extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicyGroupPlacementPolicy Empty = new GetResourcePolicyGroupPlacementPolicy();

    @Import(name="availabilityDomainCount", required=true)
      private final Integer availabilityDomainCount;

    public Integer getAvailabilityDomainCount() {
        return this.availabilityDomainCount;
    }

    @Import(name="collocation", required=true)
      private final String collocation;

    public String getCollocation() {
        return this.collocation;
    }

    @Import(name="vmCount", required=true)
      private final Integer vmCount;

    public Integer getVmCount() {
        return this.vmCount;
    }

    public GetResourcePolicyGroupPlacementPolicy(
        Integer availabilityDomainCount,
        String collocation,
        Integer vmCount) {
        this.availabilityDomainCount = Objects.requireNonNull(availabilityDomainCount, "expected parameter 'availabilityDomainCount' to be non-null");
        this.collocation = Objects.requireNonNull(collocation, "expected parameter 'collocation' to be non-null");
        this.vmCount = Objects.requireNonNull(vmCount, "expected parameter 'vmCount' to be non-null");
    }

    private GetResourcePolicyGroupPlacementPolicy() {
        this.availabilityDomainCount = null;
        this.collocation = null;
        this.vmCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyGroupPlacementPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer availabilityDomainCount;
        private String collocation;
        private Integer vmCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicyGroupPlacementPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomainCount = defaults.availabilityDomainCount;
    	      this.collocation = defaults.collocation;
    	      this.vmCount = defaults.vmCount;
        }

        public Builder availabilityDomainCount(Integer availabilityDomainCount) {
            this.availabilityDomainCount = Objects.requireNonNull(availabilityDomainCount);
            return this;
        }

        public Builder collocation(String collocation) {
            this.collocation = Objects.requireNonNull(collocation);
            return this;
        }

        public Builder vmCount(Integer vmCount) {
            this.vmCount = Objects.requireNonNull(vmCount);
            return this;
        }
        public GetResourcePolicyGroupPlacementPolicy build() {
            return new GetResourcePolicyGroupPlacementPolicy(availabilityDomainCount, collocation, vmCount);
        }
    }
}
