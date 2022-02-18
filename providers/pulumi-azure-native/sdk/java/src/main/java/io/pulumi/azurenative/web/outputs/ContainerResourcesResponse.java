// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerResourcesResponse {
    /**
     * Required CPU in cores, e.g. 0.5
     * 
     */
    private final @Nullable Double cpu;
    /**
     * Required memory, e.g. "250Mb"
     * 
     */
    private final @Nullable String memory;

    @OutputCustomType.Constructor({"cpu","memory"})
    private ContainerResourcesResponse(
        @Nullable Double cpu,
        @Nullable String memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    /**
     * Required CPU in cores, e.g. 0.5
     * 
     */
    public Optional<Double> getCpu() {
        return Optional.ofNullable(this.cpu);
    }
    /**
     * Required memory, e.g. "250Mb"
     * 
     */
    public Optional<String> getMemory() {
        return Optional.ofNullable(this.memory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourcesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double cpu;
        private @Nullable String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourcesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memory = defaults.memory;
        }

        public Builder setCpu(@Nullable Double cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setMemory(@Nullable String memory) {
            this.memory = memory;
            return this;
        }

        public ContainerResourcesResponse build() {
            return new ContainerResourcesResponse(cpu, memory);
        }
    }
}
