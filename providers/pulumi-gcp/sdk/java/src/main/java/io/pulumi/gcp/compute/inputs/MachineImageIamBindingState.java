// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.MachineImageIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineImageIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final MachineImageIamBindingState Empty = new MachineImageIamBindingState();

    @InputImport(name="condition")
    private final @Nullable Input<MachineImageIamBindingConditionGetArgs> condition;

    public Input<MachineImageIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="machineImage")
    private final @Nullable Input<String> machineImage;

    public Input<String> getMachineImage() {
        return this.machineImage == null ? Input.empty() : this.machineImage;
    }

    @InputImport(name="members")
    private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public MachineImageIamBindingState(
        @Nullable Input<MachineImageIamBindingConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> machineImage,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> project,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.machineImage = machineImage;
        this.members = members;
        this.project = project;
        this.role = role;
    }

    private MachineImageIamBindingState() {
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.machineImage = Input.empty();
        this.members = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineImageIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MachineImageIamBindingConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> machineImage;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> project;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineImageIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.machineImage = defaults.machineImage;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<MachineImageIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable MachineImageIamBindingConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setMachineImage(@Nullable Input<String> machineImage) {
            this.machineImage = machineImage;
            return this;
        }

        public Builder setMachineImage(@Nullable String machineImage) {
            this.machineImage = Input.ofNullable(machineImage);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public MachineImageIamBindingState build() {
            return new MachineImageIamBindingState(condition, etag, machineImage, members, project, role);
        }
    }
}