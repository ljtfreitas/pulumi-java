// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerTargetGroupStickinessConfig extends io.pulumi.resources.InvokeArgs {

    public static final ListenerTargetGroupStickinessConfig Empty = new ListenerTargetGroupStickinessConfig();

    @Import(name="durationSeconds")
      private final @Nullable Integer durationSeconds;

    public Optional<Integer> getDurationSeconds() {
        return this.durationSeconds == null ? Optional.empty() : Optional.ofNullable(this.durationSeconds);
    }

    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    public ListenerTargetGroupStickinessConfig(
        @Nullable Integer durationSeconds,
        @Nullable Boolean enabled) {
        this.durationSeconds = durationSeconds;
        this.enabled = enabled;
    }

    private ListenerTargetGroupStickinessConfig() {
        this.durationSeconds = null;
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerTargetGroupStickinessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer durationSeconds;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerTargetGroupStickinessConfig defaults) {
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
        public ListenerTargetGroupStickinessConfig build() {
            return new ListenerTargetGroupStickinessConfig(durationSeconds, enabled);
        }
    }
}
