// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.MachineImageIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineImageIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineImageIamMemberArgs Empty = new MachineImageIamMemberArgs();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<MachineImageIamMemberConditionArgs> condition;

    public Output<MachineImageIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="machineImage", required=true)
      private final Output<String> machineImage;

    public Output<String> getMachineImage() {
        return this.machineImage;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> getMember() {
        return this.member;
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
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public MachineImageIamMemberArgs(
        @Nullable Output<MachineImageIamMemberConditionArgs> condition,
        Output<String> machineImage,
        Output<String> member,
        @Nullable Output<String> project,
        Output<String> role) {
        this.condition = condition;
        this.machineImage = Objects.requireNonNull(machineImage, "expected parameter 'machineImage' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private MachineImageIamMemberArgs() {
        this.condition = Output.empty();
        this.machineImage = Output.empty();
        this.member = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineImageIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MachineImageIamMemberConditionArgs> condition;
        private Output<String> machineImage;
        private Output<String> member;
        private @Nullable Output<String> project;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineImageIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.machineImage = defaults.machineImage;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<MachineImageIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable MachineImageIamMemberConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder machineImage(Output<String> machineImage) {
            this.machineImage = Objects.requireNonNull(machineImage);
            return this;
        }

        public Builder machineImage(String machineImage) {
            this.machineImage = Output.of(Objects.requireNonNull(machineImage));
            return this;
        }

        public Builder member(Output<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder member(String member) {
            this.member = Output.of(Objects.requireNonNull(member));
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

        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public MachineImageIamMemberArgs build() {
            return new MachineImageIamMemberArgs(condition, machineImage, member, project, role);
        }
    }
}
