// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleTargetGroupStickinessConfig {
    private final @Nullable Integer durationSeconds;
    private final @Nullable Boolean enabled;

    @CustomType.Constructor
    private ListenerRuleTargetGroupStickinessConfig(
        @CustomType.Parameter("durationSeconds") @Nullable Integer durationSeconds,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled) {
        this.durationSeconds = durationSeconds;
        this.enabled = enabled;
    }

    public Optional<Integer> getDurationSeconds() {
        return Optional.ofNullable(this.durationSeconds);
    }
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleTargetGroupStickinessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer durationSeconds;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleTargetGroupStickinessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.enabled = defaults.enabled;
        }

        public Builder durationSeconds(@Nullable Integer durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public ListenerRuleTargetGroupStickinessConfig build() {
            return new ListenerRuleTargetGroupStickinessConfig(durationSeconds, enabled);
        }
    }
}
