// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse {
    /**
     * The number of seconds to wait for a readiness signal during initialization before timing out.
     * 
     */
    private final Integer timeoutSec;

    @CustomType.Constructor
    private InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse(@CustomType.Parameter("timeoutSec") Integer timeoutSec) {
        this.timeoutSec = timeoutSec;
    }

    /**
     * The number of seconds to wait for a readiness signal during initialization before timing out.
     * 
    */
    public Integer getTimeoutSec() {
        return this.timeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer timeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeoutSec = defaults.timeoutSec;
        }

        public Builder timeoutSec(Integer timeoutSec) {
            this.timeoutSec = Objects.requireNonNull(timeoutSec);
            return this;
        }
        public InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse build() {
            return new InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse(timeoutSec);
        }
    }
}
