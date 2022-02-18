// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The execution options of a job step.
 * 
 */
public final class JobStepExecutionOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobStepExecutionOptionsResponse Empty = new JobStepExecutionOptionsResponse();

    /**
     * Initial delay between retries for job step execution.
     * 
     */
    @InputImport(name="initialRetryIntervalSeconds")
    private final @Nullable Integer initialRetryIntervalSeconds;

    public Optional<Integer> getInitialRetryIntervalSeconds() {
        return this.initialRetryIntervalSeconds == null ? Optional.empty() : Optional.ofNullable(this.initialRetryIntervalSeconds);
    }

    /**
     * The maximum amount of time to wait between retries for job step execution.
     * 
     */
    @InputImport(name="maximumRetryIntervalSeconds")
    private final @Nullable Integer maximumRetryIntervalSeconds;

    public Optional<Integer> getMaximumRetryIntervalSeconds() {
        return this.maximumRetryIntervalSeconds == null ? Optional.empty() : Optional.ofNullable(this.maximumRetryIntervalSeconds);
    }

    /**
     * Maximum number of times the job step will be reattempted if the first attempt fails.
     * 
     */
    @InputImport(name="retryAttempts")
    private final @Nullable Integer retryAttempts;

    public Optional<Integer> getRetryAttempts() {
        return this.retryAttempts == null ? Optional.empty() : Optional.ofNullable(this.retryAttempts);
    }

    /**
     * The backoff multiplier for the time between retries.
     * 
     */
    @InputImport(name="retryIntervalBackoffMultiplier")
    private final @Nullable Double retryIntervalBackoffMultiplier;

    public Optional<Double> getRetryIntervalBackoffMultiplier() {
        return this.retryIntervalBackoffMultiplier == null ? Optional.empty() : Optional.ofNullable(this.retryIntervalBackoffMultiplier);
    }

    /**
     * Execution timeout for the job step.
     * 
     */
    @InputImport(name="timeoutSeconds")
    private final @Nullable Integer timeoutSeconds;

    public Optional<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Optional.empty() : Optional.ofNullable(this.timeoutSeconds);
    }

    public JobStepExecutionOptionsResponse(
        @Nullable Integer initialRetryIntervalSeconds,
        @Nullable Integer maximumRetryIntervalSeconds,
        @Nullable Integer retryAttempts,
        @Nullable Double retryIntervalBackoffMultiplier,
        @Nullable Integer timeoutSeconds) {
        this.initialRetryIntervalSeconds = initialRetryIntervalSeconds == null ? 1 : initialRetryIntervalSeconds;
        this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds == null ? 120 : maximumRetryIntervalSeconds;
        this.retryAttempts = retryAttempts == null ? 10 : retryAttempts;
        this.retryIntervalBackoffMultiplier = retryIntervalBackoffMultiplier == null ? 2e+00 : retryIntervalBackoffMultiplier;
        this.timeoutSeconds = timeoutSeconds == null ? 43200 : timeoutSeconds;
    }

    private JobStepExecutionOptionsResponse() {
        this.initialRetryIntervalSeconds = null;
        this.maximumRetryIntervalSeconds = null;
        this.retryAttempts = null;
        this.retryIntervalBackoffMultiplier = null;
        this.timeoutSeconds = null;
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
