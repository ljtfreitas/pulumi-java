// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.MachineImageIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineImageIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final MachineImageIamMemberState Empty = new MachineImageIamMemberState();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<MachineImageIamMemberConditionGetArgs> condition;

    public Output<MachineImageIamMemberConditionGetArgs> getCondition() {
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

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="machineImage")
      private final @Nullable Output<String> machineImage;

    public Output<String> getMachineImage() {
        return this.machineImage == null ? Output.empty() : this.machineImage;
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

    /**
     * The role that should be applied. Only one
     * `gcp.compute.MachineImageIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public MachineImageIamMemberState(
        @Nullable Output<MachineImageIamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> machineImage,
        @Nullable Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.machineImage = machineImage;
        this.member = member;
        this.project = project;
        this.role = role;
    }

    private MachineImageIamMemberState() {
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.machineImage = Output.empty();
        this.member = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineImageIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MachineImageIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> machineImage;
        private @Nullable Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineImageIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.machineImage = defaults.machineImage;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<MachineImageIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable MachineImageIamMemberConditionGetArgs condition) {
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

        public Builder machineImage(@Nullable Output<String> machineImage) {
            this.machineImage = machineImage;
            return this;
        }

        public Builder machineImage(@Nullable String machineImage) {
            this.machineImage = Output.ofNullable(machineImage);
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

        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }
        public MachineImageIamMemberState build() {
            return new MachineImageIamMemberState(condition, etag, machineImage, member, project, role);
        }
    }
}
