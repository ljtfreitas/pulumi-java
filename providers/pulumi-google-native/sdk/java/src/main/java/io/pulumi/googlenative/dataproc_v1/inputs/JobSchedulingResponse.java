// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Job scheduling options.
 * 
 */
public final class JobSchedulingResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobSchedulingResponse Empty = new JobSchedulingResponse();

    /**
     * Optional. Maximum number of times per hour a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed.A job may be reported as thrashing if driver exits with non-zero code 4 times within 10 minute window.Maximum value is 10.Note: Currently, this restartable job option is not supported in Dataproc workflow template (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
     * 
     */
    @Import(name="maxFailuresPerHour", required=true)
      private final Integer maxFailuresPerHour;

    public Integer getMaxFailuresPerHour() {
        return this.maxFailuresPerHour;
    }

    /**
     * Optional. Maximum number of times in total a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. Maximum value is 240.Note: Currently, this restartable job option is not supported in Dataproc workflow template (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
     * 
     */
    @Import(name="maxFailuresTotal", required=true)
      private final Integer maxFailuresTotal;

    public Integer getMaxFailuresTotal() {
        return this.maxFailuresTotal;
    }

    public JobSchedulingResponse(
        Integer maxFailuresPerHour,
        Integer maxFailuresTotal) {
        this.maxFailuresPerHour = Objects.requireNonNull(maxFailuresPerHour, "expected parameter 'maxFailuresPerHour' to be non-null");
        this.maxFailuresTotal = Objects.requireNonNull(maxFailuresTotal, "expected parameter 'maxFailuresTotal' to be non-null");
    }

    private JobSchedulingResponse() {
        this.maxFailuresPerHour = null;
        this.maxFailuresTotal = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxFailuresPerHour;
        private Integer maxFailuresTotal;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFailuresPerHour = defaults.maxFailuresPerHour;
    	      this.maxFailuresTotal = defaults.maxFailuresTotal;
        }

        public Builder maxFailuresPerHour(Integer maxFailuresPerHour) {
            this.maxFailuresPerHour = Objects.requireNonNull(maxFailuresPerHour);
            return this;
        }

        public Builder maxFailuresTotal(Integer maxFailuresTotal) {
            this.maxFailuresTotal = Objects.requireNonNull(maxFailuresTotal);
            return this;
        }
        public JobSchedulingResponse build() {
            return new JobSchedulingResponse(maxFailuresPerHour, maxFailuresTotal);
        }
    }
}
