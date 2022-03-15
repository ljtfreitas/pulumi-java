// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.apigateway.inputs.ApiIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiIamBindingArgs Empty = new ApiIamBindingArgs();

    @Import(name="api", required=true)
      private final Output<String> api;

    public Output<String> getApi() {
        return this.api;
    }

    @Import(name="condition")
      private final @Nullable Output<ApiIamBindingConditionArgs> condition;

    public Output<ApiIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
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
     * `gcp.apigateway.ApiIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public ApiIamBindingArgs(
        Output<String> api,
        @Nullable Output<ApiIamBindingConditionArgs> condition,
        Output<List<String>> members,
        @Nullable Output<String> project,
        Output<String> role) {
        this.api = Objects.requireNonNull(api, "expected parameter 'api' to be non-null");
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private ApiIamBindingArgs() {
        this.api = Output.empty();
        this.condition = Output.empty();
        this.members = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> api;
        private @Nullable Output<ApiIamBindingConditionArgs> condition;
        private Output<List<String>> members;
        private @Nullable Output<String> project;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder api(Output<String> api) {
            this.api = Objects.requireNonNull(api);
            return this;
        }

        public Builder api(String api) {
            this.api = Output.of(Objects.requireNonNull(api));
            return this;
        }

        public Builder condition(@Nullable Output<ApiIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable ApiIamBindingConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder members(Output<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder members(List<String> members) {
            this.members = Output.of(Objects.requireNonNull(members));
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
        public ApiIamBindingArgs build() {
            return new ApiIamBindingArgs(api, condition, members, project, role);
        }
    }
}
