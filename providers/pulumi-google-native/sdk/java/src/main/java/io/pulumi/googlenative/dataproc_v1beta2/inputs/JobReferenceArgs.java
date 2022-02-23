// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encapsulates the full scoping used to reference a job.
 * 
 */
public final class JobReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobReferenceArgs Empty = new JobReferenceArgs();

    /**
     * Optional. The job ID, which must be unique within the project. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or hyphens (-). The maximum length is 100 characters.If not specified by the caller, the job ID will be provided by the server.
     * 
     */
    @InputImport(name="jobId")
      private final @Nullable Input<String> jobId;

    public Input<String> getJobId() {
        return this.jobId == null ? Input.empty() : this.jobId;
    }

    /**
     * Optional. The ID of the Google Cloud Platform project that the job belongs to. If specified, must match the request project ID.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public JobReferenceArgs(
        @Nullable Input<String> jobId,
        @Nullable Input<String> project) {
        this.jobId = jobId;
        this.project = project;
    }

    private JobReferenceArgs() {
        this.jobId = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> jobId;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(JobReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.project = defaults.project;
        }

        public Builder setJobId(@Nullable Input<String> jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder setJobId(@Nullable String jobId) {
            this.jobId = Input.ofNullable(jobId);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public JobReferenceArgs build() {
            return new JobReferenceArgs(jobId, project);
        }
    }
}
