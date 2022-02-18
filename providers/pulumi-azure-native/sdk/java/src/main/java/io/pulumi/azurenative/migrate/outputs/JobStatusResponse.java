// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JobStatusResponse {
    /**
     * Defines the job name.
     * 
     */
    private final String jobName;
    /**
     * Gets or sets the monitoring job percentage.
     * 
     */
    private final String jobProgress;

    @OutputCustomType.Constructor({"jobName","jobProgress"})
    private JobStatusResponse(
        String jobName,
        String jobProgress) {
        this.jobName = Objects.requireNonNull(jobName);
        this.jobProgress = Objects.requireNonNull(jobProgress);
    }

    /**
     * Defines the job name.
     * 
     */
    public String getJobName() {
        return this.jobName;
    }
    /**
     * Gets or sets the monitoring job percentage.
     * 
     */
    public String getJobProgress() {
        return this.jobProgress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobName;
        private String jobProgress;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobName = defaults.jobName;
    	      this.jobProgress = defaults.jobProgress;
        }

        public Builder setJobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setJobProgress(String jobProgress) {
            this.jobProgress = Objects.requireNonNull(jobProgress);
            return this;
        }

        public JobStatusResponse build() {
            return new JobStatusResponse(jobName, jobProgress);
        }
    }
}
