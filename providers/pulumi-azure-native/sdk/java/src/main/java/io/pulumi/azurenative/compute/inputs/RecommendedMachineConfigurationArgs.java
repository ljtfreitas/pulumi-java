// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ResourceRangeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties describe the recommended machine configuration for this Image Definition. These properties are updatable.
 * 
 */
public final class RecommendedMachineConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecommendedMachineConfigurationArgs Empty = new RecommendedMachineConfigurationArgs();

    /**
     * Describes the resource range.
     * 
     */
    @Import(name="memory")
      private final @Nullable Output<ResourceRangeArgs> memory;

    public Output<ResourceRangeArgs> getMemory() {
        return this.memory == null ? Output.empty() : this.memory;
    }

    /**
     * Describes the resource range.
     * 
     */
    @Import(name="vCPUs")
      private final @Nullable Output<ResourceRangeArgs> vCPUs;

    public Output<ResourceRangeArgs> getVCPUs() {
        return this.vCPUs == null ? Output.empty() : this.vCPUs;
    }

    public RecommendedMachineConfigurationArgs(
        @Nullable Output<ResourceRangeArgs> memory,
        @Nullable Output<ResourceRangeArgs> vCPUs) {
        this.memory = memory;
        this.vCPUs = vCPUs;
    }

    private RecommendedMachineConfigurationArgs() {
        this.memory = Output.empty();
        this.vCPUs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendedMachineConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceRangeArgs> memory;
        private @Nullable Output<ResourceRangeArgs> vCPUs;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendedMachineConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memory = defaults.memory;
    	      this.vCPUs = defaults.vCPUs;
        }

        public Builder memory(@Nullable Output<ResourceRangeArgs> memory) {
            this.memory = memory;
            return this;
        }

        public Builder memory(@Nullable ResourceRangeArgs memory) {
            this.memory = Output.ofNullable(memory);
            return this;
        }

        public Builder vCPUs(@Nullable Output<ResourceRangeArgs> vCPUs) {
            this.vCPUs = vCPUs;
            return this;
        }

        public Builder vCPUs(@Nullable ResourceRangeArgs vCPUs) {
            this.vCPUs = Output.ofNullable(vCPUs);
            return this;
        }
        public RecommendedMachineConfigurationArgs build() {
            return new RecommendedMachineConfigurationArgs(memory, vCPUs);
        }
    }
}
