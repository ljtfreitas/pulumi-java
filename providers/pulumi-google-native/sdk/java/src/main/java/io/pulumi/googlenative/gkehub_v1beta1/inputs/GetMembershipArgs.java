// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMembershipArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMembershipArgs Empty = new GetMembershipArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="membershipId", required=true)
      private final String membershipId;

    public String getMembershipId() {
        return this.membershipId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetMembershipArgs(
        String location,
        String membershipId,
        @Nullable String project) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.membershipId = Objects.requireNonNull(membershipId, "expected parameter 'membershipId' to be non-null");
        this.project = project;
    }

    private GetMembershipArgs() {
        this.location = null;
        this.membershipId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String membershipId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.membershipId = defaults.membershipId;
    	      this.project = defaults.project;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMembershipId(String membershipId) {
            this.membershipId = Objects.requireNonNull(membershipId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetMembershipArgs build() {
            return new GetMembershipArgs(location, membershipId, project);
        }
    }
}
