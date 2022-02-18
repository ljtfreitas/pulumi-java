// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobStepExecutionOptionsResponse {
    /**
     * Initial delay between retries for job step execution.
     * 
     */
    private final @Nullable Integer initialRetryIntervalSeconds;
    /**
     * The maximum amount of time to wait between retries for job step execution.
     * 
     */
    private final @Nullable Integer maximumRetryIntervalSeconds;
    /**
     * Maximum number of times the job step will be reattempted if the first attempt fails.
     * 
     */
    private final @Nullable Integer retryAttempts;
    /**
     * The backoff multiplier for the time between retries.
     * 
     */
    private final @Nullable Double retryIntervalBackoffMultiplier;
    /**
     * Execution timeout for the job step.
     * 
     */
    private final @Nullable Integer timeoutSeconds;

    @OutputCustomType.Constructor({"initialRetryIntervalSeconds","maximumRetryIntervalSeconds","retryAttempts","retryIntervalBackoffMultiplier","timeoutSeconds"})
    private JobStepExecutionOptionsResponse(
        @Nullable Integer initialRetryIntervalSeconds,
        @Nullable Integer maximumRetryIntervalSeconds,
        @Nullable Integer retryAttempts,
        @Nullable Double retryIntervalBackoffMultiplier,
        @Nullable Integer timeoutSeconds) {
        this.initialRetryIntervalSeconds = initialRetryIntervalSeconds;
        this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds;
        this.retryAttempts = retryAttempts;
        this.retryIntervalBackoffMultiplier = retryIntervalBackoffMultiplier;
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * Initial delay between retries for job step execution.
     * 
     */
    public Optional<Integer> getInitialRetryIntervalSeconds() {
        return Optional.ofNullable(this.initialRetryIntervalSeconds);
    }
    /**
     * The maximum amount of time to wait between retries for job step execution.
     * 
     */
    public Optional<Integer> getMaximumRetryIntervalSeconds() {
        return Optional.ofNullable(this.maximumRetryIntervalSeconds);
    }
    /**
     * Maximum number of times the job step will be reattempted if the first attempt fails.
     * 
     */
    public Optional<Integer> getRetryAttempts() {
        return Optional.ofNullable(this.retryAttempts);
    }
    /**
     * The backoff multiplier for the time between retries.
     * 
     */
    public Optional<Double> getRetryIntervalBackoffMultiplier() {
        return Optional.ofNullable(this.retryIntervalBackoffMultiplier);
    }
    /**
     * Execution timeout for the job step.
     * 
     */
    public Optional<Integer> getTimeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStepExecutionOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer initialRetryIntervalSeconds;
        private @Nullable Integer maximumRetryIntervalSeconds;
        private @Nullable Integer retryAttempts;
        private @Nullable Double retryIntervalBackoffMultiplier;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStepExecutionOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialRetryIntervalSeconds = defaults.initialRetryIntervalSeconds;
    	      this.maximumRetryIntervalSeconds = defaults.maximumRetryIntervalSeconds;
    	      this.retryAttempts = defaults.retryAttempts;
    	      this.retryIntervalBackoffMultiplier = defaults.retryIntervalBackoffMultiplier;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setInitialRetryIntervalSeconds(@Nullable Integer initialRetryIntervalSeconds) {
            this.initialRetryIntervalSeconds = initialRetryIntervalSeconds;
            return this;
        }

        public Builder setMaximumRetryIntervalSeconds(@Nullable Integer maximumRetryIntervalSeconds) {
            this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds;
            return this;
        }

        public Builder setRetryAttempts(@Nullable Integer retryAttempts) {
            this.retryAttempts = retryAttempts;
            return this;
        }

        public Builder setRetryIntervalBackoffMultiplier(@Nullable Double retryIntervalBackoffMultiplier) {
            this.retryIntervalBackoffMultiplier = retryIntervalBackoffMultiplier;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public JobStepExecutionOptionsResponse build() {
            return new JobStepExecutionOptionsResponse(initialRetryIntervalSeconds, maximumRetryIntervalSeconds, retryAttempts, retryIntervalBackoffMultiplier, timeoutSeconds);
        }
    }
}
