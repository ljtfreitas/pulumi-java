// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.runtimeconfig;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigIamMemberArgs Empty = new ConfigIamMemberArgs();

    @InputImport(name="condition")
        private final @Nullable Input<ConfigIamMemberConditionArgs> condition;

    public Input<ConfigIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="config", required=true)
        private final Input<String> config;

    public Input<String> getConfig() {
        return this.config;
    }

    @InputImport(name="member", required=true)
        private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.runtimeconfig.ConfigIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
        private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public ConfigIamMemberArgs(
        @Nullable Input<ConfigIamMemberConditionArgs> condition,
        Input<String> config,
        Input<String> member,
        @Nullable Input<String> project,
        Input<String> role) {
        this.condition = condition;
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private ConfigIamMemberArgs() {
        this.condition = Input.empty();
        this.config = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigIamMemberConditionArgs> condition;
        private Input<String> config;
        private Input<String> member;
        private @Nullable Input<String> project;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.config = defaults.config;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<ConfigIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable ConfigIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setConfig(Input<String> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setConfig(String config) {
            this.config = Input.of(Objects.requireNonNull(config));
            return this;
        }

        public Builder setMember(Input<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder setMember(String member) {
            this.member = Input.of(Objects.requireNonNull(member));
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

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }
        public ConfigIamMemberArgs build() {
            return new ConfigIamMemberArgs(condition, config, member, project, role);
        }
    }
}
