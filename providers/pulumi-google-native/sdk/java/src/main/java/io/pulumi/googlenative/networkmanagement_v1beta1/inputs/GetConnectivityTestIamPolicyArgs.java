// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectivityTestIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectivityTestIamPolicyArgs Empty = new GetConnectivityTestIamPolicyArgs();

    @InputImport(name="connectivityTestId", required=true)
      private final String connectivityTestId;

    public String getConnectivityTestId() {
        return this.connectivityTestId;
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

    public GetConnectivityTestIamPolicyArgs(
        String connectivityTestId,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.connectivityTestId = Objects.requireNonNull(connectivityTestId, "expected parameter 'connectivityTestId' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetConnectivityTestIamPolicyArgs() {
        this.connectivityTestId = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectivityTestIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectivityTestId;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectivityTestIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivityTestId = defaults.connectivityTestId;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder setConnectivityTestId(String connectivityTestId) {
            this.connectivityTestId = Objects.requireNonNull(connectivityTestId);
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
        public GetConnectivityTestIamPolicyArgs build() {
            return new GetConnectivityTestIamPolicyArgs(connectivityTestId, optionsRequestedPolicyVersion, project);
        }
    }
}
