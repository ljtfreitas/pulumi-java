// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.bigquery.inputs.JobCopyGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobExtractGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobLoadGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobQueryGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobStatusGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobState extends io.pulumi.resources.ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * Copies a table.
     * Structure is documented below.
     * 
     */
    @Import(name="copy")
      private final @Nullable Output<JobCopyGetArgs> copy;

    public Output<JobCopyGetArgs> getCopy() {
        return this.copy == null ? Output.empty() : this.copy;
    }

    /**
     * Configures an extract job.
     * Structure is documented below.
     * 
     */
    @Import(name="extract")
      private final @Nullable Output<JobExtractGetArgs> extract;

    public Output<JobExtractGetArgs> getExtract() {
        return this.extract == null ? Output.empty() : this.extract;
    }

    /**
     * The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
     * 
     */
    @Import(name="jobId")
      private final @Nullable Output<String> jobId;

    public Output<String> getJobId() {
        return this.jobId == null ? Output.empty() : this.jobId;
    }

    /**
     * Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
     * 
     */
    @Import(name="jobTimeoutMs")
      private final @Nullable Output<String> jobTimeoutMs;

    public Output<String> getJobTimeoutMs() {
        return this.jobTimeoutMs == null ? Output.empty() : this.jobTimeoutMs;
    }

    /**
     * The type of the job.
     * 
     */
    @Import(name="jobType")
      private final @Nullable Output<String> jobType;

    public Output<String> getJobType() {
        return this.jobType == null ? Output.empty() : this.jobType;
    }

    /**
     * The labels associated with this job. You can use these to organize and group your jobs.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Configures a load job.
     * Structure is documented below.
     * 
     */
    @Import(name="load")
      private final @Nullable Output<JobLoadGetArgs> load;

    public Output<JobLoadGetArgs> getLoad() {
        return this.load == null ? Output.empty() : this.load;
    }

    /**
     * The geographic location of the job. The default value is US.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Configures a query job.
     * Structure is documented below.
     * 
     */
    @Import(name="query")
      private final @Nullable Output<JobQueryGetArgs> query;

    public Output<JobQueryGetArgs> getQuery() {
        return this.query == null ? Output.empty() : this.query;
    }

    /**
     * The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
     * 
     */
    @Import(name="statuses")
      private final @Nullable Output<List<JobStatusGetArgs>> statuses;

    public Output<List<JobStatusGetArgs>> getStatuses() {
        return this.statuses == null ? Output.empty() : this.statuses;
    }

    /**
     * Email address of the user who ran the job.
     * 
     */
    @Import(name="userEmail")
      private final @Nullable Output<String> userEmail;

    public Output<String> getUserEmail() {
        return this.userEmail == null ? Output.empty() : this.userEmail;
    }

    public JobState(
        @Nullable Output<JobCopyGetArgs> copy,
        @Nullable Output<JobExtractGetArgs> extract,
        @Nullable Output<String> jobId,
        @Nullable Output<String> jobTimeoutMs,
        @Nullable Output<String> jobType,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<JobLoadGetArgs> load,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<JobQueryGetArgs> query,
        @Nullable Output<List<JobStatusGetArgs>> statuses,
        @Nullable Output<String> userEmail) {
        this.copy = copy;
        this.extract = extract;
        this.jobId = jobId;
        this.jobTimeoutMs = jobTimeoutMs;
        this.jobType = jobType;
        this.labels = labels;
        this.load = load;
        this.location = location;
        this.project = project;
        this.query = query;
        this.statuses = statuses;
        this.userEmail = userEmail;
    }

    private JobState() {
        this.copy = Output.empty();
        this.extract = Output.empty();
        this.jobId = Output.empty();
        this.jobTimeoutMs = Output.empty();
        this.jobType = Output.empty();
        this.labels = Output.empty();
        this.load = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
        this.query = Output.empty();
        this.statuses = Output.empty();
        this.userEmail = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobCopyGetArgs> copy;
        private @Nullable Output<JobExtractGetArgs> extract;
        private @Nullable Output<String> jobId;
        private @Nullable Output<String> jobTimeoutMs;
        private @Nullable Output<String> jobType;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<JobLoadGetArgs> load;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<JobQueryGetArgs> query;
        private @Nullable Output<List<JobStatusGetArgs>> statuses;
        private @Nullable Output<String> userEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(JobState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copy = defaults.copy;
    	      this.extract = defaults.extract;
    	      this.jobId = defaults.jobId;
    	      this.jobTimeoutMs = defaults.jobTimeoutMs;
    	      this.jobType = defaults.jobType;
    	      this.labels = defaults.labels;
    	      this.load = defaults.load;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.query = defaults.query;
    	      this.statuses = defaults.statuses;
    	      this.userEmail = defaults.userEmail;
        }

        public Builder copy(@Nullable Output<JobCopyGetArgs> copy) {
            this.copy = copy;
            return this;
        }

        public Builder copy(@Nullable JobCopyGetArgs copy) {
            this.copy = Output.ofNullable(copy);
            return this;
        }

        public Builder extract(@Nullable Output<JobExtractGetArgs> extract) {
            this.extract = extract;
            return this;
        }

        public Builder extract(@Nullable JobExtractGetArgs extract) {
            this.extract = Output.ofNullable(extract);
            return this;
        }

        public Builder jobId(@Nullable Output<String> jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder jobId(@Nullable String jobId) {
            this.jobId = Output.ofNullable(jobId);
            return this;
        }

        public Builder jobTimeoutMs(@Nullable Output<String> jobTimeoutMs) {
            this.jobTimeoutMs = jobTimeoutMs;
            return this;
        }

        public Builder jobTimeoutMs(@Nullable String jobTimeoutMs) {
            this.jobTimeoutMs = Output.ofNullable(jobTimeoutMs);
            return this;
        }

        public Builder jobType(@Nullable Output<String> jobType) {
            this.jobType = jobType;
            return this;
        }

        public Builder jobType(@Nullable String jobType) {
            this.jobType = Output.ofNullable(jobType);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder load(@Nullable Output<JobLoadGetArgs> load) {
            this.load = load;
            return this;
        }

        public Builder load(@Nullable JobLoadGetArgs load) {
            this.load = Output.ofNullable(load);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder query(@Nullable Output<JobQueryGetArgs> query) {
            this.query = query;
            return this;
        }

        public Builder query(@Nullable JobQueryGetArgs query) {
            this.query = Output.ofNullable(query);
            return this;
        }

        public Builder statuses(@Nullable Output<List<JobStatusGetArgs>> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder statuses(@Nullable List<JobStatusGetArgs> statuses) {
            this.statuses = Output.ofNullable(statuses);
            return this;
        }

        public Builder userEmail(@Nullable Output<String> userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public Builder userEmail(@Nullable String userEmail) {
            this.userEmail = Output.ofNullable(userEmail);
            return this;
        }
        public JobState build() {
            return new JobState(copy, extract, jobId, jobTimeoutMs, jobType, labels, load, location, project, query, statuses, userEmail);
        }
    }
}
