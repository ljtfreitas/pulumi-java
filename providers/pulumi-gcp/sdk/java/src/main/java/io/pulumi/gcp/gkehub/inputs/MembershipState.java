// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.gkehub.inputs.MembershipAuthorityGetArgs;
import io.pulumi.gcp.gkehub.inputs.MembershipEndpointGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MembershipState extends io.pulumi.resources.ResourceArgs {

    public static final MembershipState Empty = new MembershipState();

    /**
     * Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * 
     */
    @Import(name="authority")
      private final @Nullable Output<MembershipAuthorityGetArgs> authority;

    public Output<MembershipAuthorityGetArgs> getAuthority() {
        return this.authority == null ? Output.empty() : this.authority;
    }

    /**
     * The name of this entity type to be displayed on the console. This field is unavailable in v1 of the API.
     * 
     * @Deprecated
     * This field is unavailable in the GA provider and will be removed from the beta provider in a future release.
     * 
     */
    @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
    @Import(name="description")
      private final @Nullable Output<String> description;

    @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<MembershipEndpointGetArgs> endpoint;

    public Output<MembershipEndpointGetArgs> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * Labels to apply to this membership.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The client-provided identifier of the membership.
     * 
     */
    @Import(name="membershipId")
      private final @Nullable Output<String> membershipId;

    public Output<String> getMembershipId() {
        return this.membershipId == null ? Output.empty() : this.membershipId;
    }

    /**
     * The unique identifier of the membership.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public MembershipState(
        @Nullable Output<MembershipAuthorityGetArgs> authority,
        @Nullable Output<String> description,
        @Nullable Output<MembershipEndpointGetArgs> endpoint,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> membershipId,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.authority = authority;
        this.description = description;
        this.endpoint = endpoint;
        this.labels = labels;
        this.membershipId = membershipId;
        this.name = name;
        this.project = project;
    }

    private MembershipState() {
        this.authority = Output.empty();
        this.description = Output.empty();
        this.endpoint = Output.empty();
        this.labels = Output.empty();
        this.membershipId = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MembershipAuthorityGetArgs> authority;
        private @Nullable Output<String> description;
        private @Nullable Output<MembershipEndpointGetArgs> endpoint;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> membershipId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.labels = defaults.labels;
    	      this.membershipId = defaults.membershipId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder authority(@Nullable Output<MembershipAuthorityGetArgs> authority) {
            this.authority = authority;
            return this;
        }

        public Builder authority(@Nullable MembershipAuthorityGetArgs authority) {
            this.authority = Output.ofNullable(authority);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder endpoint(@Nullable Output<MembershipEndpointGetArgs> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(@Nullable MembershipEndpointGetArgs endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder membershipId(@Nullable Output<String> membershipId) {
            this.membershipId = membershipId;
            return this;
        }

        public Builder membershipId(@Nullable String membershipId) {
            this.membershipId = Output.ofNullable(membershipId);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public MembershipState build() {
            return new MembershipState(authority, description, endpoint, labels, membershipId, name, project);
        }
    }
}
