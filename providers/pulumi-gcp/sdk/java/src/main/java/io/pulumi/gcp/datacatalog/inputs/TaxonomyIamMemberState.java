// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaxonomyIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final TaxonomyIamMemberState Empty = new TaxonomyIamMemberState();

    @Import(name="condition")
      private final @Nullable Output<TaxonomyIamMemberConditionGetArgs> condition;

    public Output<TaxonomyIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> getMember() {
        return this.member == null ? Output.empty() : this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.TaxonomyIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="taxonomy")
      private final @Nullable Output<String> taxonomy;

    public Output<String> getTaxonomy() {
        return this.taxonomy == null ? Output.empty() : this.taxonomy;
    }

    public TaxonomyIamMemberState(
        @Nullable Output<TaxonomyIamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> role,
        @Nullable Output<String> taxonomy) {
        this.condition = condition;
        this.etag = etag;
        this.member = member;
        this.project = project;
        this.region = region;
        this.role = role;
        this.taxonomy = taxonomy;
    }

    private TaxonomyIamMemberState() {
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.member = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.role = Output.empty();
        this.taxonomy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaxonomyIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TaxonomyIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> role;
        private @Nullable Output<String> taxonomy;

        public Builder() {
    	      // Empty
        }

        public Builder(TaxonomyIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
    	      this.taxonomy = defaults.taxonomy;
        }

        public Builder condition(@Nullable Output<TaxonomyIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable TaxonomyIamMemberConditionGetArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }

        public Builder member(@Nullable String member) {
            this.member = Output.ofNullable(member);
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

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }

        public Builder taxonomy(@Nullable Output<String> taxonomy) {
            this.taxonomy = taxonomy;
            return this;
        }

        public Builder taxonomy(@Nullable String taxonomy) {
            this.taxonomy = Output.ofNullable(taxonomy);
            return this;
        }
        public TaxonomyIamMemberState build() {
            return new TaxonomyIamMemberState(condition, etag, member, project, region, role, taxonomy);
        }
    }
}
