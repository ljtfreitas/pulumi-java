// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOsPolicyAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOsPolicyAssignmentArgs Empty = new GetOsPolicyAssignmentArgs();

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="osPolicyAssignmentId", required=true)
      private final String osPolicyAssignmentId;

    public String getOsPolicyAssignmentId() {
        return this.osPolicyAssignmentId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetOsPolicyAssignmentArgs(
        String location,
        String osPolicyAssignmentId,
        @Nullable String project) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.osPolicyAssignmentId = Objects.requireNonNull(osPolicyAssignmentId, "expected parameter 'osPolicyAssignmentId' to be non-null");
        this.project = project;
    }

    private GetOsPolicyAssignmentArgs() {
        this.location = null;
        this.osPolicyAssignmentId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOsPolicyAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String osPolicyAssignmentId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOsPolicyAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.osPolicyAssignmentId = defaults.osPolicyAssignmentId;
    	      this.project = defaults.project;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder osPolicyAssignmentId(String osPolicyAssignmentId) {
            this.osPolicyAssignmentId = Objects.requireNonNull(osPolicyAssignmentId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetOsPolicyAssignmentArgs build() {
            return new GetOsPolicyAssignmentArgs(location, osPolicyAssignmentId, project);
        }
    }
}
