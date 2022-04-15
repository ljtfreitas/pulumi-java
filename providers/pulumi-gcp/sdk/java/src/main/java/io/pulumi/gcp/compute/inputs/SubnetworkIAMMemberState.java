// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.SubnetworkIAMMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkIAMMemberState extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkIAMMemberState Empty = new SubnetworkIAMMemberState();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<SubnetworkIAMMemberConditionGetArgs> condition;

    public Output<SubnetworkIAMMemberConditionGetArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> member() {
        return this.member == null ? Codegen.empty() : this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The GCP region for this subnetwork.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.compute.SubnetworkIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> subnetwork() {
        return this.subnetwork == null ? Codegen.empty() : this.subnetwork;
    }

    public SubnetworkIAMMemberState(
        @Nullable Output<SubnetworkIAMMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> role,
        @Nullable Output<String> subnetwork) {
        this.condition = condition;
        this.etag = etag;
        this.member = member;
        this.project = project;
        this.region = region;
        this.role = role;
        this.subnetwork = subnetwork;
    }

    private SubnetworkIAMMemberState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.member = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.role = Codegen.empty();
        this.subnetwork = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkIAMMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SubnetworkIAMMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> role;
        private @Nullable Output<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkIAMMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder condition(@Nullable Output<SubnetworkIAMMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable SubnetworkIAMMemberConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }
        public Builder member(@Nullable String member) {
            this.member = Codegen.ofNullable(member);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Codegen.ofNullable(subnetwork);
            return this;
        }        public SubnetworkIAMMemberState build() {
            return new SubnetworkIAMMemberState(condition, etag, member, project, region, role, subnetwork);
        }
    }
}
