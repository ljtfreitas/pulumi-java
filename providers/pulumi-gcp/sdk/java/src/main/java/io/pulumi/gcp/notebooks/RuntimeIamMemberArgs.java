// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.notebooks.inputs.RuntimeIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeIamMemberArgs Empty = new RuntimeIamMemberArgs();

    @Import(name="condition")
      private final @Nullable Output<RuntimeIamMemberConditionArgs> condition;

    public Output<RuntimeIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
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
     * `gcp.notebooks.RuntimeIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="runtimeName", required=true)
      private final Output<String> runtimeName;

    public Output<String> getRuntimeName() {
        return this.runtimeName;
    }

    public RuntimeIamMemberArgs(
        @Nullable Output<RuntimeIamMemberConditionArgs> condition,
        @Nullable Output<String> location,
        Output<String> member,
        @Nullable Output<String> project,
        Output<String> role,
        Output<String> runtimeName) {
        this.condition = condition;
        this.location = location;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.runtimeName = Objects.requireNonNull(runtimeName, "expected parameter 'runtimeName' to be non-null");
    }

    private RuntimeIamMemberArgs() {
        this.condition = Output.empty();
        this.location = Output.empty();
        this.member = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
        this.runtimeName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuntimeIamMemberConditionArgs> condition;
        private @Nullable Output<String> location;
        private Output<String> member;
        private @Nullable Output<String> project;
        private Output<String> role;
        private Output<String> runtimeName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.location = defaults.location;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.runtimeName = defaults.runtimeName;
        }

        public Builder condition(@Nullable Output<RuntimeIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable RuntimeIamMemberConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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

        public Builder runtimeName(Output<String> runtimeName) {
            this.runtimeName = Objects.requireNonNull(runtimeName);
            return this;
        }

        public Builder runtimeName(String runtimeName) {
            this.runtimeName = Output.of(Objects.requireNonNull(runtimeName));
            return this;
        }
        public RuntimeIamMemberArgs build() {
            return new RuntimeIamMemberArgs(condition, location, member, project, role, runtimeName);
        }
    }
}
