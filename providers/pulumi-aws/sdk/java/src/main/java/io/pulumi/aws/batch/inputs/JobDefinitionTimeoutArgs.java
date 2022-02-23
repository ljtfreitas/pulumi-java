// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobDefinitionTimeoutArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobDefinitionTimeoutArgs Empty = new JobDefinitionTimeoutArgs();

    /**
     * The time duration in seconds after which AWS Batch terminates your jobs if they have not finished. The minimum value for the timeout is `60` seconds.
     * 
     */
    @InputImport(name="attemptDurationSeconds")
    private final @Nullable Input<Integer> attemptDurationSeconds;

    public Input<Integer> getAttemptDurationSeconds() {
        return this.attemptDurationSeconds == null ? Input.empty() : this.attemptDurationSeconds;
    }

    public JobDefinitionTimeoutArgs(@Nullable Input<Integer> attemptDurationSeconds) {
        this.attemptDurationSeconds = attemptDurationSeconds;
    }

    private JobDefinitionTimeoutArgs() {
        this.attemptDurationSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDefinitionTimeoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> attemptDurationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDefinitionTimeoutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attemptDurationSeconds = defaults.attemptDurationSeconds;
        }

        public Builder setAttemptDurationSeconds(@Nullable Input<Integer> attemptDurationSeconds) {
            this.attemptDurationSeconds = attemptDurationSeconds;
            return this;
        }

        public Builder setAttemptDurationSeconds(@Nullable Integer attemptDurationSeconds) {
            this.attemptDurationSeconds = Input.ofNullable(attemptDurationSeconds);
            return this;
        }
        public JobDefinitionTimeoutArgs build() {
            return new JobDefinitionTimeoutArgs(attemptDurationSeconds);
        }
    }
}
