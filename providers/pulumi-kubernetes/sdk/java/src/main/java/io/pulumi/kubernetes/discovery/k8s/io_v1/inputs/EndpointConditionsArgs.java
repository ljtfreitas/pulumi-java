// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EndpointConditions represents the current condition of an endpoint.
 * 
 */
public final class EndpointConditionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConditionsArgs Empty = new EndpointConditionsArgs();

    /**
     * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be "true" for terminating endpoints.
     * 
     */
    @Import(name="ready")
      private final @Nullable Output<Boolean> ready;

    public Output<Boolean> getReady() {
        return this.ready == null ? Output.empty() : this.ready;
    }

    /**
     * serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
     * 
     */
    @Import(name="serving")
      private final @Nullable Output<Boolean> serving;

    public Output<Boolean> getServing() {
        return this.serving == null ? Output.empty() : this.serving;
    }

    /**
     * terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
     * 
     */
    @Import(name="terminating")
      private final @Nullable Output<Boolean> terminating;

    public Output<Boolean> getTerminating() {
        return this.terminating == null ? Output.empty() : this.terminating;
    }

    public EndpointConditionsArgs(
        @Nullable Output<Boolean> ready,
        @Nullable Output<Boolean> serving,
        @Nullable Output<Boolean> terminating) {
        this.ready = ready;
        this.serving = serving;
        this.terminating = terminating;
    }

    private EndpointConditionsArgs() {
        this.ready = Output.empty();
        this.serving = Output.empty();
        this.terminating = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> ready;
        private @Nullable Output<Boolean> serving;
        private @Nullable Output<Boolean> terminating;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConditionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ready = defaults.ready;
    	      this.serving = defaults.serving;
    	      this.terminating = defaults.terminating;
        }

        public Builder ready(@Nullable Output<Boolean> ready) {
            this.ready = ready;
            return this;
        }

        public Builder ready(@Nullable Boolean ready) {
            this.ready = Output.ofNullable(ready);
            return this;
        }

        public Builder serving(@Nullable Output<Boolean> serving) {
            this.serving = serving;
            return this;
        }

        public Builder serving(@Nullable Boolean serving) {
            this.serving = Output.ofNullable(serving);
            return this;
        }

        public Builder terminating(@Nullable Output<Boolean> terminating) {
            this.terminating = terminating;
            return this;
        }

        public Builder terminating(@Nullable Boolean terminating) {
            this.terminating = Output.ofNullable(terminating);
            return this;
        }
        public EndpointConditionsArgs build() {
            return new EndpointConditionsArgs(ready, serving, terminating);
        }
    }
}
