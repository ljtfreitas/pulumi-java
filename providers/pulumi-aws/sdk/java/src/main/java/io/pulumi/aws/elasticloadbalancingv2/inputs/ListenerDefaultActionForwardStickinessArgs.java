// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionForwardStickinessArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionForwardStickinessArgs Empty = new ListenerDefaultActionForwardStickinessArgs();

    /**
     * Time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
     * 
     */
    @Import(name="duration", required=true)
      private final Output<Integer> duration;

    public Output<Integer> getDuration() {
        return this.duration;
    }

    /**
     * Whether target group stickiness is enabled. Default is `false`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    public ListenerDefaultActionForwardStickinessArgs(
        Output<Integer> duration,
        @Nullable Output<Boolean> enabled) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.enabled = enabled;
    }

    private ListenerDefaultActionForwardStickinessArgs() {
        this.duration = Output.empty();
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionForwardStickinessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> duration;
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionForwardStickinessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.enabled = defaults.enabled;
        }

        public Builder duration(Output<Integer> duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder duration(Integer duration) {
            this.duration = Output.of(Objects.requireNonNull(duration));
            return this;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public ListenerDefaultActionForwardStickinessArgs build() {
            return new ListenerDefaultActionForwardStickinessArgs(duration, enabled);
        }
    }
}
