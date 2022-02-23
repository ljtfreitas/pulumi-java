// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerDefaultActionForwardStickiness {
    /**
     * Time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
     * 
     */
    private final Integer duration;
    /**
     * Whether target group stickiness is enabled. Default is `false`.
     * 
     */
    private final @Nullable Boolean enabled;

    @OutputCustomType.Constructor({"duration","enabled"})
    private ListenerDefaultActionForwardStickiness(
        Integer duration,
        @Nullable Boolean enabled) {
        this.duration = Objects.requireNonNull(duration);
        this.enabled = enabled;
    }

    /**
     * Time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
     * 
     */
    public Integer getDuration() {
        return this.duration;
    }
    /**
     * Whether target group stickiness is enabled. Default is `false`.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionForwardStickiness defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer duration;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionForwardStickiness defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDuration(Integer duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public ListenerDefaultActionForwardStickiness build() {
            return new ListenerDefaultActionForwardStickiness(duration, enabled);
        }
    }
}
