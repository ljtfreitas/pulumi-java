// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2;

import io.pulumi.core.AssetOrArchive;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.JobReferenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * [Required] Describes the job configuration.
     * 
     */
    @InputImport(name="configuration")
      private final @Nullable Input<JobConfigurationArgs> configuration;

    public Input<JobConfigurationArgs> getConfiguration() {
        return this.configuration == null ? Input.empty() : this.configuration;
    }

    /**
     * [Optional] Reference describing the unique-per-user name of the job.
     * 
     */
    @InputImport(name="jobReference")
      private final @Nullable Input<JobReferenceArgs> jobReference;

    public Input<JobReferenceArgs> getJobReference() {
        return this.jobReference == null ? Input.empty() : this.jobReference;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="source")
      private final @Nullable Input<AssetOrArchive> source;

    public Input<AssetOrArchive> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    public JobArgs(
        @Nullable Input<JobConfigurationArgs> configuration,
        @Nullable Input<JobReferenceArgs> jobReference,
        @Nullable Input<String> project,
        @Nullable Input<AssetOrArchive> source) {
        this.configuration = configuration;
        this.jobReference = jobReference;
        this.project = project;
        this.source = source;
    }

    private JobArgs() {
        this.configuration = Input.empty();
        this.jobReference = Input.empty();
        this.project = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobConfigurationArgs> configuration;
        private @Nullable Input<JobReferenceArgs> jobReference;
        private @Nullable Input<String> project;
        private @Nullable Input<AssetOrArchive> source;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.jobReference = defaults.jobReference;
    	      this.project = defaults.project;
    	      this.source = defaults.source;
        }

        public Builder setConfiguration(@Nullable Input<JobConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setConfiguration(@Nullable JobConfigurationArgs configuration) {
            this.configuration = Input.ofNullable(configuration);
            return this;
        }

        public Builder setJobReference(@Nullable Input<JobReferenceArgs> jobReference) {
            this.jobReference = jobReference;
            return this;
        }

        public Builder setJobReference(@Nullable JobReferenceArgs jobReference) {
            this.jobReference = Input.ofNullable(jobReference);
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

        public Builder setSource(@Nullable Input<AssetOrArchive> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable AssetOrArchive source) {
            this.source = Input.ofNullable(source);
            return this;
        }
        public JobArgs build() {
            return new JobArgs(configuration, jobReference, project, source);
        }
    }
}
