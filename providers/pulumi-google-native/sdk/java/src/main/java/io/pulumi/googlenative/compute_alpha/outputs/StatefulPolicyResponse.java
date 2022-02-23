// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.StatefulPolicyPreservedStateResponse;
import java.util.Objects;

@OutputCustomType
public final class StatefulPolicyResponse {
    private final StatefulPolicyPreservedStateResponse preservedState;

    @OutputCustomType.Constructor({"preservedState"})
    private StatefulPolicyResponse(StatefulPolicyPreservedStateResponse preservedState) {
        this.preservedState = Objects.requireNonNull(preservedState);
    }

    public StatefulPolicyPreservedStateResponse getPreservedState() {
        return this.preservedState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulPolicyPreservedStateResponse preservedState;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preservedState = defaults.preservedState;
        }

        public Builder setPreservedState(StatefulPolicyPreservedStateResponse preservedState) {
            this.preservedState = Objects.requireNonNull(preservedState);
            return this;
        }
        public StatefulPolicyResponse build() {
            return new StatefulPolicyResponse(preservedState);
        }
    }
}
