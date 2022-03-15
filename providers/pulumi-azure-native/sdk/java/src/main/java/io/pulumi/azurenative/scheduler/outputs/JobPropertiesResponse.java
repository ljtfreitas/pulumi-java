// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.azurenative.scheduler.outputs.JobActionResponse;
import io.pulumi.azurenative.scheduler.outputs.JobRecurrenceResponse;
import io.pulumi.azurenative.scheduler.outputs.JobStatusResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobPropertiesResponse {
    /**
     * Gets or sets the job action.
     * 
     */
    private final @Nullable JobActionResponse action;
    /**
     * Gets or sets the job recurrence.
     * 
     */
    private final @Nullable JobRecurrenceResponse recurrence;
    /**
     * Gets or sets the job start time.
     * 
     */
    private final @Nullable String startTime;
    /**
     * Gets or set the job state.
     * 
     */
    private final @Nullable String state;
    /**
     * Gets the job status.
     * 
     */
    private final JobStatusResponse status;

    @CustomType.Constructor
    private JobPropertiesResponse(
        @CustomType.Parameter("action") @Nullable JobActionResponse action,
        @CustomType.Parameter("recurrence") @Nullable JobRecurrenceResponse recurrence,
        @CustomType.Parameter("startTime") @Nullable String startTime,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("status") JobStatusResponse status) {
        this.action = action;
        this.recurrence = recurrence;
        this.startTime = startTime;
        this.state = state;
        this.status = status;
    }

    /**
     * Gets or sets the job action.
     * 
    */
    public Optional<JobActionResponse> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * Gets or sets the job recurrence.
     * 
    */
    public Optional<JobRecurrenceResponse> getRecurrence() {
        return Optional.ofNullable(this.recurrence);
    }
    /**
     * Gets or sets the job start time.
     * 
    */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * Gets or set the job state.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * Gets the job status.
     * 
    */
    public JobStatusResponse getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobActionResponse action;
        private @Nullable JobRecurrenceResponse recurrence;
        private @Nullable String startTime;
        private @Nullable String state;
        private JobStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
        }

        public Builder action(@Nullable JobActionResponse action) {
            this.action = action;
            return this;
        }

        public Builder recurrence(@Nullable JobRecurrenceResponse recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder status(JobStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public JobPropertiesResponse build() {
            return new JobPropertiesResponse(action, recurrence, startTime, state, status);
        }
    }
}
