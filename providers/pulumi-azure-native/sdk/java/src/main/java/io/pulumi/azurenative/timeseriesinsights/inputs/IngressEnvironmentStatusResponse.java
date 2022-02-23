// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.azurenative.timeseriesinsights.inputs.EnvironmentStateDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that represents the status of ingress on an environment.
 * 
 */
public final class IngressEnvironmentStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final IngressEnvironmentStatusResponse Empty = new IngressEnvironmentStatusResponse();

    /**
     * This string represents the state of ingress operations on an environment. It can be "Disabled", "Ready", "Running", "Paused" or "Unknown"
     * 
     */
    @InputImport(name="state")
        private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * An object that contains the details about an environment's state.
     * 
     */
    @InputImport(name="stateDetails", required=true)
        private final EnvironmentStateDetailsResponse stateDetails;

    public EnvironmentStateDetailsResponse getStateDetails() {
        return this.stateDetails;
    }

    public IngressEnvironmentStatusResponse(
        @Nullable String state,
        EnvironmentStateDetailsResponse stateDetails) {
        this.state = state;
        this.stateDetails = Objects.requireNonNull(stateDetails, "expected parameter 'stateDetails' to be non-null");
    }

    private IngressEnvironmentStatusResponse() {
        this.state = null;
        this.stateDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressEnvironmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String state;
        private EnvironmentStateDetailsResponse stateDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressEnvironmentStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
    	      this.stateDetails = defaults.stateDetails;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setStateDetails(EnvironmentStateDetailsResponse stateDetails) {
            this.stateDetails = Objects.requireNonNull(stateDetails);
            return this;
        }
        public IngressEnvironmentStatusResponse build() {
            return new IngressEnvironmentStatusResponse(state, stateDetails);
        }
    }
}
