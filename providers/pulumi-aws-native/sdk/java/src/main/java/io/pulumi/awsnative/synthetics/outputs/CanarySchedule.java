// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CanarySchedule {
    private final @Nullable String durationInSeconds;
    private final String expression;

    @OutputCustomType.Constructor({"durationInSeconds","expression"})
    private CanarySchedule(
        @Nullable String durationInSeconds,
        String expression) {
        this.durationInSeconds = durationInSeconds;
        this.expression = Objects.requireNonNull(expression);
    }

    public Optional<String> getDurationInSeconds() {
        return Optional.ofNullable(this.durationInSeconds);
    }
    public String getExpression() {
        return this.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanarySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String durationInSeconds;
        private String expression;

        public Builder() {
    	      // Empty
        }

        public Builder(CanarySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInSeconds = defaults.durationInSeconds;
    	      this.expression = defaults.expression;
        }

        public Builder setDurationInSeconds(@Nullable String durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public CanarySchedule build() {
            return new CanarySchedule(durationInSeconds, expression);
        }
    }
}