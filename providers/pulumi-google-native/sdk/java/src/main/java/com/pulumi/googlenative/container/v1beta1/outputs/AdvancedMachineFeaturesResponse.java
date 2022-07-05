// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AdvancedMachineFeaturesResponse {
    /**
     * @return The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    private final String threadsPerCore;

    @CustomType.Constructor
    private AdvancedMachineFeaturesResponse(@CustomType.Parameter("threadsPerCore") String threadsPerCore) {
        this.threadsPerCore = threadsPerCore;
    }

    /**
     * @return The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    public String threadsPerCore() {
        return this.threadsPerCore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedMachineFeaturesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedMachineFeaturesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder threadsPerCore(String threadsPerCore) {
            this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
            return this;
        }        public AdvancedMachineFeaturesResponse build() {
            return new AdvancedMachineFeaturesResponse(threadsPerCore);
        }
    }
}
