// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobRetryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobRetryConfigArgs Empty = new JobRetryConfigArgs();

    /**
     * The maximum amount of time to wait before retrying a job after it fails.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
     */
    @Import(name="maxBackoffDuration")
      private final @Nullable Output<String> maxBackoffDuration;

    public Output<String> getMaxBackoffDuration() {
        return this.maxBackoffDuration == null ? Output.empty() : this.maxBackoffDuration;
    }

    /**
     * The time between retries will double maxDoublings times.
     * A job's retry interval starts at minBackoffDuration,
     * then doubles maxDoublings times, then increases linearly,
     * and finally retries retries at intervals of maxBackoffDuration up to retryCount times.
     * 
     */
    @Import(name="maxDoublings")
      private final @Nullable Output<Integer> maxDoublings;

    public Output<Integer> getMaxDoublings() {
        return this.maxDoublings == null ? Output.empty() : this.maxDoublings;
    }

    /**
     * The time limit for retrying a failed job, measured from time when an execution was first attempted.
     * If specified with retryCount, the job will be retried until both limits are reached.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
     */
    @Import(name="maxRetryDuration")
      private final @Nullable Output<String> maxRetryDuration;

    public Output<String> getMaxRetryDuration() {
        return this.maxRetryDuration == null ? Output.empty() : this.maxRetryDuration;
    }

    /**
     * The minimum amount of time to wait before retrying a job after it fails.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * 
     */
    @Import(name="minBackoffDuration")
      private final @Nullable Output<String> minBackoffDuration;

    public Output<String> getMinBackoffDuration() {
        return this.minBackoffDuration == null ? Output.empty() : this.minBackoffDuration;
    }

    /**
     * The number of attempts that the system will make to run a
     * job using the exponential backoff procedure described by maxDoublings.
     * Values greater than 5 and negative values are not allowed.
     * 
     */
    @Import(name="retryCount")
      private final @Nullable Output<Integer> retryCount;

    public Output<Integer> getRetryCount() {
        return this.retryCount == null ? Output.empty() : this.retryCount;
    }

    public JobRetryConfigArgs(
        @Nullable Output<String> maxBackoffDuration,
        @Nullable Output<Integer> maxDoublings,
        @Nullable Output<String> maxRetryDuration,
        @Nullable Output<String> minBackoffDuration,
        @Nullable Output<Integer> retryCount) {
        this.maxBackoffDuration = maxBackoffDuration;
        this.maxDoublings = maxDoublings;
        this.maxRetryDuration = maxRetryDuration;
        this.minBackoffDuration = minBackoffDuration;
        this.retryCount = retryCount;
    }

    private JobRetryConfigArgs() {
        this.maxBackoffDuration = Output.empty();
        this.maxDoublings = Output.empty();
        this.maxRetryDuration = Output.empty();
        this.minBackoffDuration = Output.empty();
        this.retryCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRetryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> maxBackoffDuration;
        private @Nullable Output<Integer> maxDoublings;
        private @Nullable Output<String> maxRetryDuration;
        private @Nullable Output<String> minBackoffDuration;
        private @Nullable Output<Integer> retryCount;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRetryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBackoffDuration = defaults.maxBackoffDuration;
    	      this.maxDoublings = defaults.maxDoublings;
    	      this.maxRetryDuration = defaults.maxRetryDuration;
    	      this.minBackoffDuration = defaults.minBackoffDuration;
    	      this.retryCount = defaults.retryCount;
        }

        public Builder maxBackoffDuration(@Nullable Output<String> maxBackoffDuration) {
            this.maxBackoffDuration = maxBackoffDuration;
            return this;
        }

        public Builder maxBackoffDuration(@Nullable String maxBackoffDuration) {
            this.maxBackoffDuration = Output.ofNullable(maxBackoffDuration);
            return this;
        }

        public Builder maxDoublings(@Nullable Output<Integer> maxDoublings) {
            this.maxDoublings = maxDoublings;
            return this;
        }

        public Builder maxDoublings(@Nullable Integer maxDoublings) {
            this.maxDoublings = Output.ofNullable(maxDoublings);
            return this;
        }

        public Builder maxRetryDuration(@Nullable Output<String> maxRetryDuration) {
            this.maxRetryDuration = maxRetryDuration;
            return this;
        }

        public Builder maxRetryDuration(@Nullable String maxRetryDuration) {
            this.maxRetryDuration = Output.ofNullable(maxRetryDuration);
            return this;
        }

        public Builder minBackoffDuration(@Nullable Output<String> minBackoffDuration) {
            this.minBackoffDuration = minBackoffDuration;
            return this;
        }

        public Builder minBackoffDuration(@Nullable String minBackoffDuration) {
            this.minBackoffDuration = Output.ofNullable(minBackoffDuration);
            return this;
        }

        public Builder retryCount(@Nullable Output<Integer> retryCount) {
            this.retryCount = retryCount;
            return this;
        }

        public Builder retryCount(@Nullable Integer retryCount) {
            this.retryCount = Output.ofNullable(retryCount);
            return this;
        }
        public JobRetryConfigArgs build() {
            return new JobRetryConfigArgs(maxBackoffDuration, maxDoublings, maxRetryDuration, minBackoffDuration, retryCount);
        }
    }
}
