// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobReferenceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobReferenceGetArgs Empty = new JobReferenceGetArgs();

    @InputImport(name="jobId")
        private final @Nullable Input<String> jobId;

    public Input<String> getJobId() {
        return this.jobId == null ? Input.empty() : this.jobId;
    }

    public JobReferenceGetArgs(@Nullable Input<String> jobId) {
        this.jobId = jobId;
    }

    private JobReferenceGetArgs() {
        this.jobId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobReferenceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> jobId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobReferenceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
        }

        public Builder setJobId(@Nullable Input<String> jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder setJobId(@Nullable String jobId) {
            this.jobId = Input.ofNullable(jobId);
            return this;
        }
        public JobReferenceGetArgs build() {
            return new JobReferenceGetArgs(jobId);
        }
    }
}
