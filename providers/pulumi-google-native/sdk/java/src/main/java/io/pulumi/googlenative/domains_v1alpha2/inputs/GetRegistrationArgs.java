// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1alpha2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistrationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegistrationArgs Empty = new GetRegistrationArgs();

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

    @InputImport(name="registrationId", required=true)
      private final String registrationId;

    public String getRegistrationId() {
        return this.registrationId;
    }

    public GetRegistrationArgs(
        String location,
        @Nullable String project,
        String registrationId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.registrationId = Objects.requireNonNull(registrationId, "expected parameter 'registrationId' to be non-null");
    }

    private GetRegistrationArgs() {
        this.location = null;
        this.project = null;
        this.registrationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String registrationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.registrationId = defaults.registrationId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegistrationId(String registrationId) {
            this.registrationId = Objects.requireNonNull(registrationId);
            return this;
        }
        public GetRegistrationArgs build() {
            return new GetRegistrationArgs(location, project, registrationId);
        }
    }
}
