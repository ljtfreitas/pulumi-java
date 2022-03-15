// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionJobIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionJobIamPolicyArgs Empty = new GetRegionJobIamPolicyArgs();

    @Import(name="jobId", required=true)
      private final String jobId;

    public String getJobId() {
        return this.jobId;
    }

    @Import(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="regionId", required=true)
      private final String regionId;

    public String getRegionId() {
        return this.regionId;
    }

    public GetRegionJobIamPolicyArgs(
        String jobId,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String regionId) {
        this.jobId = Objects.requireNonNull(jobId, "expected parameter 'jobId' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.regionId = Objects.requireNonNull(regionId, "expected parameter 'regionId' to be non-null");
    }

    private GetRegionJobIamPolicyArgs() {
        this.jobId = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.regionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionJobIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobId;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String regionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionJobIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.regionId = defaults.regionId;
        }

        public Builder jobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        public GetRegionJobIamPolicyArgs build() {
            return new GetRegionJobIamPolicyArgs(jobId, optionsRequestedPolicyVersion, project, regionId);
        }
    }
}
