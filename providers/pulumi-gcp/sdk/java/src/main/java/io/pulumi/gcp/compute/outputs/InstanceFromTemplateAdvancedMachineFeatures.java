// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceFromTemplateAdvancedMachineFeatures {
    private final @Nullable Boolean enableNestedVirtualization;
    private final @Nullable Integer threadsPerCore;

    @OutputCustomType.Constructor({"enableNestedVirtualization","threadsPerCore"})
    private InstanceFromTemplateAdvancedMachineFeatures(
        @Nullable Boolean enableNestedVirtualization,
        @Nullable Integer threadsPerCore) {
        this.enableNestedVirtualization = enableNestedVirtualization;
        this.threadsPerCore = threadsPerCore;
    }

    public Optional<Boolean> getEnableNestedVirtualization() {
        return Optional.ofNullable(this.enableNestedVirtualization);
    }
    public Optional<Integer> getThreadsPerCore() {
        return Optional.ofNullable(this.threadsPerCore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateAdvancedMachineFeatures defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableNestedVirtualization;
        private @Nullable Integer threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateAdvancedMachineFeatures defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder setEnableNestedVirtualization(@Nullable Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = enableNestedVirtualization;
            return this;
        }

        public Builder setThreadsPerCore(@Nullable Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public InstanceFromTemplateAdvancedMachineFeatures build() {
            return new InstanceFromTemplateAdvancedMachineFeatures(enableNestedVirtualization, threadsPerCore);
        }
    }
}
