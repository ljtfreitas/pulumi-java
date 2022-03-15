// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectJobConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RiskAnalysisJobConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DlpJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final DlpJobArgs Empty = new DlpJobArgs();

    /**
     * An inspection job scans a storage repository for InfoTypes.
     * 
     */
    @Import(name="inspectJob")
      private final @Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob;

    public Output<GooglePrivacyDlpV2InspectJobConfigArgs> getInspectJob() {
        return this.inspectJob == null ? Output.empty() : this.inspectJob;
    }

    /**
     * The job id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    @Import(name="jobId")
      private final @Nullable Output<String> jobId;

    public Output<String> getJobId() {
        return this.jobId == null ? Output.empty() : this.jobId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * A risk analysis job calculates re-identification risk metrics for a BigQuery table.
     * 
     */
    @Import(name="riskJob")
      private final @Nullable Output<GooglePrivacyDlpV2RiskAnalysisJobConfigArgs> riskJob;

    public Output<GooglePrivacyDlpV2RiskAnalysisJobConfigArgs> getRiskJob() {
        return this.riskJob == null ? Output.empty() : this.riskJob;
    }

    public DlpJobArgs(
        @Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob,
        @Nullable Output<String> jobId,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<GooglePrivacyDlpV2RiskAnalysisJobConfigArgs> riskJob) {
        this.inspectJob = inspectJob;
        this.jobId = jobId;
        this.location = location;
        this.project = project;
        this.riskJob = riskJob;
    }

    private DlpJobArgs() {
        this.inspectJob = Output.empty();
        this.jobId = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
        this.riskJob = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DlpJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob;
        private @Nullable Output<String> jobId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<GooglePrivacyDlpV2RiskAnalysisJobConfigArgs> riskJob;

        public Builder() {
    	      // Empty
        }

        public Builder(DlpJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inspectJob = defaults.inspectJob;
    	      this.jobId = defaults.jobId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.riskJob = defaults.riskJob;
        }

        public Builder inspectJob(@Nullable Output<GooglePrivacyDlpV2InspectJobConfigArgs> inspectJob) {
            this.inspectJob = inspectJob;
            return this;
        }

        public Builder inspectJob(@Nullable GooglePrivacyDlpV2InspectJobConfigArgs inspectJob) {
            this.inspectJob = Output.ofNullable(inspectJob);
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

        public Builder riskJob(@Nullable Output<GooglePrivacyDlpV2RiskAnalysisJobConfigArgs> riskJob) {
            this.riskJob = riskJob;
            return this;
        }

        public Builder riskJob(@Nullable GooglePrivacyDlpV2RiskAnalysisJobConfigArgs riskJob) {
            this.riskJob = Output.ofNullable(riskJob);
            return this;
        }
        public DlpJobArgs build() {
            return new DlpJobArgs(inspectJob, jobId, location, project, riskJob);
        }
    }
}
