// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AgentPropertiesResponse {
    /**
     * The CPU configuration in terms of number of cores required for the run.
     * 
     */
    private final @Nullable Integer cpu;

    @OutputCustomType.Constructor({"cpu"})
    private AgentPropertiesResponse(@Nullable Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * The CPU configuration in terms of number of cores required for the run.
     * 
     */
    public Optional<Integer> getCpu() {
        return Optional.ofNullable(this.cpu);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer cpu;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
        }

        public Builder setCpu(@Nullable Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        public AgentPropertiesResponse build() {
            return new AgentPropertiesResponse(cpu);
        }
    }
}
