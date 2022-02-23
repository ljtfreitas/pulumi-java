// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplateJobScheduling {
    /**
     * Optional. Maximum number of times per hour a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. A job may be reported as thrashing if driver exits with non-zero code 4 times within 10 minute window. Maximum value is 10.
     * 
     */
    private final @Nullable Integer maxFailuresPerHour;
    /**
     * Optional. Maximum number of times in total a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. Maximum value is 240
     * 
     */
    private final @Nullable Integer maxFailuresTotal;

    @OutputCustomType.Constructor({"maxFailuresPerHour","maxFailuresTotal"})
    private WorkflowTemplateJobScheduling(
        @Nullable Integer maxFailuresPerHour,
        @Nullable Integer maxFailuresTotal) {
        this.maxFailuresPerHour = maxFailuresPerHour;
        this.maxFailuresTotal = maxFailuresTotal;
    }

    /**
     * Optional. Maximum number of times per hour a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. A job may be reported as thrashing if driver exits with non-zero code 4 times within 10 minute window. Maximum value is 10.
     * 
     */
    public Optional<Integer> getMaxFailuresPerHour() {
        return Optional.ofNullable(this.maxFailuresPerHour);
    }
    /**
     * Optional. Maximum number of times in total a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. Maximum value is 240
     * 
     */
    public Optional<Integer> getMaxFailuresTotal() {
        return Optional.ofNullable(this.maxFailuresTotal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobScheduling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxFailuresPerHour;
        private @Nullable Integer maxFailuresTotal;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobScheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFailuresPerHour = defaults.maxFailuresPerHour;
    	      this.maxFailuresTotal = defaults.maxFailuresTotal;
        }

        public Builder setMaxFailuresPerHour(@Nullable Integer maxFailuresPerHour) {
            this.maxFailuresPerHour = maxFailuresPerHour;
            return this;
        }

        public Builder setMaxFailuresTotal(@Nullable Integer maxFailuresTotal) {
            this.maxFailuresTotal = maxFailuresTotal;
            return this;
        }
        public WorkflowTemplateJobScheduling build() {
            return new WorkflowTemplateJobScheduling(maxFailuresPerHour, maxFailuresTotal);
        }
    }
}
