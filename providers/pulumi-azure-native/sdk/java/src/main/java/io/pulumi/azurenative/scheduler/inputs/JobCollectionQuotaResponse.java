// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.inputs.JobMaxRecurrenceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobCollectionQuotaResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobCollectionQuotaResponse Empty = new JobCollectionQuotaResponse();

    /**
     * Gets or set the maximum job count.
     * 
     */
    @Import(name="maxJobCount")
      private final @Nullable Integer maxJobCount;

    public Optional<Integer> getMaxJobCount() {
        return this.maxJobCount == null ? Optional.empty() : Optional.ofNullable(this.maxJobCount);
    }

    /**
     * Gets or sets the maximum job occurrence.
     * 
     */
    @Import(name="maxJobOccurrence")
      private final @Nullable Integer maxJobOccurrence;

    public Optional<Integer> getMaxJobOccurrence() {
        return this.maxJobOccurrence == null ? Optional.empty() : Optional.ofNullable(this.maxJobOccurrence);
    }

    /**
     * Gets or set the maximum recurrence.
     * 
     */
    @Import(name="maxRecurrence")
      private final @Nullable JobMaxRecurrenceResponse maxRecurrence;

    public Optional<JobMaxRecurrenceResponse> getMaxRecurrence() {
        return this.maxRecurrence == null ? Optional.empty() : Optional.ofNullable(this.maxRecurrence);
    }

    public JobCollectionQuotaResponse(
        @Nullable Integer maxJobCount,
        @Nullable Integer maxJobOccurrence,
        @Nullable JobMaxRecurrenceResponse maxRecurrence) {
        this.maxJobCount = maxJobCount;
        this.maxJobOccurrence = maxJobOccurrence;
        this.maxRecurrence = maxRecurrence;
    }

    private JobCollectionQuotaResponse() {
        this.maxJobCount = null;
        this.maxJobOccurrence = null;
        this.maxRecurrence = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCollectionQuotaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxJobCount;
        private @Nullable Integer maxJobOccurrence;
        private @Nullable JobMaxRecurrenceResponse maxRecurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCollectionQuotaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxJobCount = defaults.maxJobCount;
    	      this.maxJobOccurrence = defaults.maxJobOccurrence;
    	      this.maxRecurrence = defaults.maxRecurrence;
        }

        public Builder maxJobCount(@Nullable Integer maxJobCount) {
            this.maxJobCount = maxJobCount;
            return this;
        }

        public Builder maxJobOccurrence(@Nullable Integer maxJobOccurrence) {
            this.maxJobOccurrence = maxJobOccurrence;
            return this;
        }

        public Builder maxRecurrence(@Nullable JobMaxRecurrenceResponse maxRecurrence) {
            this.maxRecurrence = maxRecurrence;
            return this;
        }
        public JobCollectionQuotaResponse build() {
            return new JobCollectionQuotaResponse(maxJobCount, maxJobOccurrence, maxRecurrence);
        }
    }
}
