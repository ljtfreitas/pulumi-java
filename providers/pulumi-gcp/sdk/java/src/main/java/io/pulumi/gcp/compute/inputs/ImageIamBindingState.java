// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.ImageIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final ImageIamBindingState Empty = new ImageIamBindingState();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<ImageIamBindingConditionGetArgs> condition;

    public Output<ImageIamBindingConditionGetArgs> condition() {
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

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> image() {
        return this.image == null ? Codegen.empty() : this.image;
    }

    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members == null ? Codegen.empty() : this.members;
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
     * The role that should be applied. Only one
     * `gcp.compute.ImageIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public ImageIamBindingState(
        @Nullable Output<ImageIamBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> image,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> project,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.image = image;
        this.members = members;
        this.project = project;
        this.role = role;
    }

    private ImageIamBindingState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.image = Codegen.empty();
        this.members = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ImageIamBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> image;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.image = defaults.image;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<ImageIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable ImageIamBindingConditionGetArgs condition) {
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
        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = Codegen.ofNullable(image);
            return this;
        }
        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Codegen.ofNullable(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public ImageIamBindingState build() {
            return new ImageIamBindingState(condition, etag, image, members, project, role);
        }
    }
}
