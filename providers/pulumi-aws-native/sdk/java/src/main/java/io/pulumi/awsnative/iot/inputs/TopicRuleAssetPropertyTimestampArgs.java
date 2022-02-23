// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleAssetPropertyTimestampArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleAssetPropertyTimestampArgs Empty = new TopicRuleAssetPropertyTimestampArgs();

    @InputImport(name="offsetInNanos")
        private final @Nullable Input<String> offsetInNanos;

    public Input<String> getOffsetInNanos() {
        return this.offsetInNanos == null ? Input.empty() : this.offsetInNanos;
    }

    @InputImport(name="timeInSeconds", required=true)
        private final Input<String> timeInSeconds;

    public Input<String> getTimeInSeconds() {
        return this.timeInSeconds;
    }

    public TopicRuleAssetPropertyTimestampArgs(
        @Nullable Input<String> offsetInNanos,
        Input<String> timeInSeconds) {
        this.offsetInNanos = offsetInNanos;
        this.timeInSeconds = Objects.requireNonNull(timeInSeconds, "expected parameter 'timeInSeconds' to be non-null");
    }

    private TopicRuleAssetPropertyTimestampArgs() {
        this.offsetInNanos = Input.empty();
        this.timeInSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleAssetPropertyTimestampArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> offsetInNanos;
        private Input<String> timeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleAssetPropertyTimestampArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offsetInNanos = defaults.offsetInNanos;
    	      this.timeInSeconds = defaults.timeInSeconds;
        }

        public Builder setOffsetInNanos(@Nullable Input<String> offsetInNanos) {
            this.offsetInNanos = offsetInNanos;
            return this;
        }

        public Builder setOffsetInNanos(@Nullable String offsetInNanos) {
            this.offsetInNanos = Input.ofNullable(offsetInNanos);
            return this;
        }

        public Builder setTimeInSeconds(Input<String> timeInSeconds) {
            this.timeInSeconds = Objects.requireNonNull(timeInSeconds);
            return this;
        }

        public Builder setTimeInSeconds(String timeInSeconds) {
            this.timeInSeconds = Input.of(Objects.requireNonNull(timeInSeconds));
            return this;
        }
        public TopicRuleAssetPropertyTimestampArgs build() {
            return new TopicRuleAssetPropertyTimestampArgs(offsetInNanos, timeInSeconds);
        }
    }
}
