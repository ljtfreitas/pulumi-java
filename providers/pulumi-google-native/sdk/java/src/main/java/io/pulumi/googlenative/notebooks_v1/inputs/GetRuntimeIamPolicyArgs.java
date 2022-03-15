// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRuntimeIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRuntimeIamPolicyArgs Empty = new GetRuntimeIamPolicyArgs();

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
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

    @Import(name="runtimeId", required=true)
      private final String runtimeId;

    public String getRuntimeId() {
        return this.runtimeId;
    }

    public GetRuntimeIamPolicyArgs(
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String runtimeId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.runtimeId = Objects.requireNonNull(runtimeId, "expected parameter 'runtimeId' to be non-null");
    }

    private GetRuntimeIamPolicyArgs() {
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.runtimeId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuntimeIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String runtimeId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuntimeIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.runtimeId = defaults.runtimeId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
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

        public Builder runtimeId(String runtimeId) {
            this.runtimeId = Objects.requireNonNull(runtimeId);
            return this;
        }
        public GetRuntimeIamPolicyArgs build() {
            return new GetRuntimeIamPolicyArgs(location, optionsRequestedPolicyVersion, project, runtimeId);
        }
    }
}
