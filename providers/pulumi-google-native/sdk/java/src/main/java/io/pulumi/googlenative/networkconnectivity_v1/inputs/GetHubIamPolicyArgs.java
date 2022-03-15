// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHubIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHubIamPolicyArgs Empty = new GetHubIamPolicyArgs();

    @Import(name="hubId", required=true)
      private final String hubId;

    public String getHubId() {
        return this.hubId;
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

    public GetHubIamPolicyArgs(
        String hubId,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.hubId = Objects.requireNonNull(hubId, "expected parameter 'hubId' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetHubIamPolicyArgs() {
        this.hubId = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHubIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hubId;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHubIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubId = defaults.hubId;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder hubId(String hubId) {
            this.hubId = Objects.requireNonNull(hubId);
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
        public GetHubIamPolicyArgs build() {
            return new GetHubIamPolicyArgs(hubId, optionsRequestedPolicyVersion, project);
        }
    }
}
