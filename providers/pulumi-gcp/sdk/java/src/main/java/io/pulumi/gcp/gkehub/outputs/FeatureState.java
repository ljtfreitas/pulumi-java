// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.gkehub.outputs.FeatureStateState;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FeatureState {
    private final @Nullable List<FeatureStateState> states;

    @CustomType.Constructor
    private FeatureState(@CustomType.Parameter("states") @Nullable List<FeatureStateState> states) {
        this.states = states;
    }

    public List<FeatureStateState> getStates() {
        return this.states == null ? List.of() : this.states;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FeatureStateState> states;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.states = defaults.states;
        }

        public Builder states(@Nullable List<FeatureStateState> states) {
            this.states = states;
            return this;
        }
        public FeatureState build() {
            return new FeatureState(states);
        }
    }
}
