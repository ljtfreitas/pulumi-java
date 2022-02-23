// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CanarySchedule extends io.pulumi.resources.InvokeArgs {

    public static final CanarySchedule Empty = new CanarySchedule();

    @InputImport(name="durationInSeconds")
        private final @Nullable String durationInSeconds;

    public Optional<String> getDurationInSeconds() {
        return this.durationInSeconds == null ? Optional.empty() : Optional.ofNullable(this.durationInSeconds);
    }

    @InputImport(name="expression", required=true)
        private final String expression;

    public String getExpression() {
        return this.expression;
    }

    public CanarySchedule(
        @Nullable String durationInSeconds,
        String expression) {
        this.durationInSeconds = durationInSeconds;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
    }

    private CanarySchedule() {
        this.durationInSeconds = null;
        this.expression = null;
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
