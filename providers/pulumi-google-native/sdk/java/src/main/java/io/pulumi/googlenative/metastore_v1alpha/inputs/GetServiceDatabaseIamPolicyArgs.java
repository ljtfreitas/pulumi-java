// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceDatabaseIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceDatabaseIamPolicyArgs Empty = new GetServiceDatabaseIamPolicyArgs();

    @Import(name="databaseId", required=true)
      private final String databaseId;

    public String getDatabaseId() {
        return this.databaseId;
    }

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

    @Import(name="serviceId", required=true)
      private final String serviceId;

    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceDatabaseIamPolicyArgs(
        String databaseId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String serviceId) {
        this.databaseId = Objects.requireNonNull(databaseId, "expected parameter 'databaseId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private GetServiceDatabaseIamPolicyArgs() {
        this.databaseId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.serviceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceDatabaseIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceDatabaseIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseId = defaults.databaseId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder databaseId(String databaseId) {
            this.databaseId = Objects.requireNonNull(databaseId);
            return this;
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

        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public GetServiceDatabaseIamPolicyArgs build() {
            return new GetServiceDatabaseIamPolicyArgs(databaseId, location, optionsRequestedPolicyVersion, project, serviceId);
        }
    }
}
