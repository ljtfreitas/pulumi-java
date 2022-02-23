// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProviderArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProviderArgs Empty = new GetProviderArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="providerId", required=true)
      private final String providerId;

    public String getProviderId() {
        return this.providerId;
    }

    @InputImport(name="workloadIdentityPoolId", required=true)
      private final String workloadIdentityPoolId;

    public String getWorkloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    public GetProviderArgs(
        String location,
        @Nullable String project,
        String providerId,
        String workloadIdentityPoolId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.providerId = Objects.requireNonNull(providerId, "expected parameter 'providerId' to be non-null");
        this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId, "expected parameter 'workloadIdentityPoolId' to be non-null");
    }

    private GetProviderArgs() {
        this.location = null;
        this.project = null;
        this.providerId = null;
        this.workloadIdentityPoolId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String providerId;
        private String workloadIdentityPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.providerId = defaults.providerId;
    	      this.workloadIdentityPoolId = defaults.workloadIdentityPoolId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setProviderId(String providerId) {
            this.providerId = Objects.requireNonNull(providerId);
            return this;
        }

        public Builder setWorkloadIdentityPoolId(String workloadIdentityPoolId) {
            this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId);
            return this;
        }
        public GetProviderArgs build() {
            return new GetProviderArgs(location, project, providerId, workloadIdentityPoolId);
        }
    }
}
