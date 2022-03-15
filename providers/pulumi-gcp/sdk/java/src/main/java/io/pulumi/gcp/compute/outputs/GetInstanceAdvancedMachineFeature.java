// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetInstanceAdvancedMachineFeature {
    private final Boolean enableNestedVirtualization;
    private final Integer threadsPerCore;

    @CustomType.Constructor
    private GetInstanceAdvancedMachineFeature(
        @CustomType.Parameter("enableNestedVirtualization") Boolean enableNestedVirtualization,
        @CustomType.Parameter("threadsPerCore") Integer threadsPerCore) {
        this.enableNestedVirtualization = enableNestedVirtualization;
        this.threadsPerCore = threadsPerCore;
    }

    public Boolean getEnableNestedVirtualization() {
        return this.enableNestedVirtualization;
    }
    public Integer getThreadsPerCore() {
        return this.threadsPerCore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceAdvancedMachineFeature defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableNestedVirtualization;
        private Integer threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceAdvancedMachineFeature defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder enableNestedVirtualization(Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization);
            return this;
        }

        public Builder threadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
            return this;
        }
        public GetInstanceAdvancedMachineFeature build() {
            return new GetInstanceAdvancedMachineFeature(enableNestedVirtualization, threadsPerCore);
        }
    }
}
