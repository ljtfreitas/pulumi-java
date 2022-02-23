// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig {
    /**
     * Count of cores of this accelerator.
     * 
     */
    private final @Nullable Integer coreCount;
    /**
     * Accelerator model. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#AcceleratorType`
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"coreCount","type"})
    private RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig(
        @Nullable Integer coreCount,
        @Nullable String type) {
        this.coreCount = coreCount;
        this.type = type;
    }

    /**
     * Count of cores of this accelerator.
     * 
     */
    public Optional<Integer> getCoreCount() {
        return Optional.ofNullable(this.coreCount);
    }
    /**
     * Accelerator model. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#AcceleratorType`
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer coreCount;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.type = defaults.type;
        }

        public Builder setCoreCount(@Nullable Integer coreCount) {
            this.coreCount = coreCount;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig build() {
            return new RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig(coreCount, type);
        }
    }
}
