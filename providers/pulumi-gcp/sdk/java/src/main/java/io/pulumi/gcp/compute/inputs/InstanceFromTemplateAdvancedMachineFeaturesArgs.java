// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromTemplateAdvancedMachineFeaturesArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateAdvancedMachineFeaturesArgs Empty = new InstanceFromTemplateAdvancedMachineFeaturesArgs();

    @Import(name="enableNestedVirtualization")
      private final @Nullable Output<Boolean> enableNestedVirtualization;

    public Output<Boolean> getEnableNestedVirtualization() {
        return this.enableNestedVirtualization == null ? Output.empty() : this.enableNestedVirtualization;
    }

    @Import(name="threadsPerCore")
      private final @Nullable Output<Integer> threadsPerCore;

    public Output<Integer> getThreadsPerCore() {
        return this.threadsPerCore == null ? Output.empty() : this.threadsPerCore;
    }

    public InstanceFromTemplateAdvancedMachineFeaturesArgs(
        @Nullable Output<Boolean> enableNestedVirtualization,
        @Nullable Output<Integer> threadsPerCore) {
        this.enableNestedVirtualization = enableNestedVirtualization;
        this.threadsPerCore = threadsPerCore;
    }

    private InstanceFromTemplateAdvancedMachineFeaturesArgs() {
        this.enableNestedVirtualization = Output.empty();
        this.threadsPerCore = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateAdvancedMachineFeaturesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableNestedVirtualization;
        private @Nullable Output<Integer> threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateAdvancedMachineFeaturesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder enableNestedVirtualization(@Nullable Output<Boolean> enableNestedVirtualization) {
            this.enableNestedVirtualization = enableNestedVirtualization;
            return this;
        }

        public Builder enableNestedVirtualization(@Nullable Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = Output.ofNullable(enableNestedVirtualization);
            return this;
        }

        public Builder threadsPerCore(@Nullable Output<Integer> threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }

        public Builder threadsPerCore(@Nullable Integer threadsPerCore) {
            this.threadsPerCore = Output.ofNullable(threadsPerCore);
            return this;
        }
        public InstanceFromTemplateAdvancedMachineFeaturesArgs build() {
            return new InstanceFromTemplateAdvancedMachineFeaturesArgs(enableNestedVirtualization, threadsPerCore);
        }
    }
}
