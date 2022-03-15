// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationExtractArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationLoadArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationQueryArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationTableCopyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobConfigurationArgs Empty = new JobConfigurationArgs();

    /**
     * [Pick one] Copies a table.
     * 
     */
    @Import(name="copy")
      private final @Nullable Output<JobConfigurationTableCopyArgs> copy;

    public Output<JobConfigurationTableCopyArgs> getCopy() {
        return this.copy == null ? Output.empty() : this.copy;
    }

    /**
     * [Optional] If set, don't actually run this job. A valid query will return a mostly empty response with some processing statistics, while an invalid query will return the same error it would if it wasn't a dry run. Behavior of non-query jobs is undefined.
     * 
     */
    @Import(name="dryRun")
      private final @Nullable Output<Boolean> dryRun;

    public Output<Boolean> getDryRun() {
        return this.dryRun == null ? Output.empty() : this.dryRun;
    }

    /**
     * [Pick one] Configures an extract job.
     * 
     */
    @Import(name="extract")
      private final @Nullable Output<JobConfigurationExtractArgs> extract;

    public Output<JobConfigurationExtractArgs> getExtract() {
        return this.extract == null ? Output.empty() : this.extract;
    }

    /**
     * [Optional] Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
     * 
     */
    @Import(name="jobTimeoutMs")
      private final @Nullable Output<String> jobTimeoutMs;

    public Output<String> getJobTimeoutMs() {
        return this.jobTimeoutMs == null ? Output.empty() : this.jobTimeoutMs;
    }

    /**
     * The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * [Pick one] Configures a load job.
     * 
     */
    @Import(name="load")
      private final @Nullable Output<JobConfigurationLoadArgs> load;

    public Output<JobConfigurationLoadArgs> getLoad() {
        return this.load == null ? Output.empty() : this.load;
    }

    /**
     * [Pick one] Configures a query job.
     * 
     */
    @Import(name="query")
      private final @Nullable Output<JobConfigurationQueryArgs> query;

    public Output<JobConfigurationQueryArgs> getQuery() {
        return this.query == null ? Output.empty() : this.query;
    }

    public JobConfigurationArgs(
        @Nullable Output<JobConfigurationTableCopyArgs> copy,
        @Nullable Output<Boolean> dryRun,
        @Nullable Output<JobConfigurationExtractArgs> extract,
        @Nullable Output<String> jobTimeoutMs,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<JobConfigurationLoadArgs> load,
        @Nullable Output<JobConfigurationQueryArgs> query) {
        this.copy = copy;
        this.dryRun = dryRun;
        this.extract = extract;
        this.jobTimeoutMs = jobTimeoutMs;
        this.labels = labels;
        this.load = load;
        this.query = query;
    }

    private JobConfigurationArgs() {
        this.copy = Output.empty();
        this.dryRun = Output.empty();
        this.extract = Output.empty();
        this.jobTimeoutMs = Output.empty();
        this.labels = Output.empty();
        this.load = Output.empty();
        this.query = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobConfigurationTableCopyArgs> copy;
        private @Nullable Output<Boolean> dryRun;
        private @Nullable Output<JobConfigurationExtractArgs> extract;
        private @Nullable Output<String> jobTimeoutMs;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<JobConfigurationLoadArgs> load;
        private @Nullable Output<JobConfigurationQueryArgs> query;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copy = defaults.copy;
    	      this.dryRun = defaults.dryRun;
    	      this.extract = defaults.extract;
    	      this.jobTimeoutMs = defaults.jobTimeoutMs;
    	      this.labels = defaults.labels;
    	      this.load = defaults.load;
    	      this.query = defaults.query;
        }

        public Builder copy(@Nullable Output<JobConfigurationTableCopyArgs> copy) {
            this.copy = copy;
            return this;
        }

        public Builder copy(@Nullable JobConfigurationTableCopyArgs copy) {
            this.copy = Output.ofNullable(copy);
            return this;
        }

        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        public Builder dryRun(@Nullable Boolean dryRun) {
            this.dryRun = Output.ofNullable(dryRun);
            return this;
        }

        public Builder extract(@Nullable Output<JobConfigurationExtractArgs> extract) {
            this.extract = extract;
            return this;
        }

        public Builder extract(@Nullable JobConfigurationExtractArgs extract) {
            this.extract = Output.ofNullable(extract);
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

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder load(@Nullable Output<JobConfigurationLoadArgs> load) {
            this.load = load;
            return this;
        }

        public Builder load(@Nullable JobConfigurationLoadArgs load) {
            this.load = Output.ofNullable(load);
            return this;
        }

        public Builder query(@Nullable Output<JobConfigurationQueryArgs> query) {
            this.query = query;
            return this;
        }

        public Builder query(@Nullable JobConfigurationQueryArgs query) {
            this.query = Output.ofNullable(query);
            return this;
        }
        public JobConfigurationArgs build() {
            return new JobConfigurationArgs(copy, dryRun, extract, jobTimeoutMs, labels, load, query);
        }
    }
}
