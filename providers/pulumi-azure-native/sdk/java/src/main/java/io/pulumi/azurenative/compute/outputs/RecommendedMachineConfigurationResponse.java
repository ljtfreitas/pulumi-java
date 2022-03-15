// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.ResourceRangeResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RecommendedMachineConfigurationResponse {
    /**
     * Describes the resource range.
     * 
     */
    private final @Nullable ResourceRangeResponse memory;
    /**
     * Describes the resource range.
     * 
     */
    private final @Nullable ResourceRangeResponse vCPUs;

    @CustomType.Constructor
    private RecommendedMachineConfigurationResponse(
        @CustomType.Parameter("memory") @Nullable ResourceRangeResponse memory,
        @CustomType.Parameter("vCPUs") @Nullable ResourceRangeResponse vCPUs) {
        this.memory = memory;
        this.vCPUs = vCPUs;
    }

    /**
     * Describes the resource range.
     * 
    */
    public Optional<ResourceRangeResponse> getMemory() {
        return Optional.ofNullable(this.memory);
    }
    /**
     * Describes the resource range.
     * 
    */
    public Optional<ResourceRangeResponse> getVCPUs() {
        return Optional.ofNullable(this.vCPUs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendedMachineConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceRangeResponse memory;
        private @Nullable ResourceRangeResponse vCPUs;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendedMachineConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memory = defaults.memory;
    	      this.vCPUs = defaults.vCPUs;
        }

        public Builder memory(@Nullable ResourceRangeResponse memory) {
            this.memory = memory;
            return this;
        }

        public Builder vCPUs(@Nullable ResourceRangeResponse vCPUs) {
            this.vCPUs = vCPUs;
            return this;
        }
        public RecommendedMachineConfigurationResponse build() {
            return new RecommendedMachineConfigurationResponse(memory, vCPUs);
        }
    }
}
