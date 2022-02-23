// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReusableConfigIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReusableConfigIamPolicyArgs Empty = new GetReusableConfigIamPolicyArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="reusableConfigId", required=true)
      private final String reusableConfigId;

    public String getReusableConfigId() {
        return this.reusableConfigId;
    }

    public GetReusableConfigIamPolicyArgs(
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String reusableConfigId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.reusableConfigId = Objects.requireNonNull(reusableConfigId, "expected parameter 'reusableConfigId' to be non-null");
    }

    private GetReusableConfigIamPolicyArgs() {
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.reusableConfigId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReusableConfigIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String reusableConfigId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReusableConfigIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.reusableConfigId = defaults.reusableConfigId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setOptionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setReusableConfigId(String reusableConfigId) {
            this.reusableConfigId = Objects.requireNonNull(reusableConfigId);
            return this;
        }
        public GetReusableConfigIamPolicyArgs build() {
            return new GetReusableConfigIamPolicyArgs(location, optionsRequestedPolicyVersion, project, reusableConfigId);
        }
    }
}
