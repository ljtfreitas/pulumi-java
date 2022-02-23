// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.iap.inputs.WebBackendServiceIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebBackendServiceIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebBackendServiceIamBindingArgs Empty = new WebBackendServiceIamBindingArgs();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
        private final @Nullable Input<WebBackendServiceIamBindingConditionArgs> condition;

    public Input<WebBackendServiceIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="members", required=true)
        private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
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
     * `gcp.iap.WebBackendServiceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
        private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="webBackendService", required=true)
        private final Input<String> webBackendService;

    public Input<String> getWebBackendService() {
        return this.webBackendService;
    }

    public WebBackendServiceIamBindingArgs(
        @Nullable Input<WebBackendServiceIamBindingConditionArgs> condition,
        Input<List<String>> members,
        @Nullable Input<String> project,
        Input<String> role,
        Input<String> webBackendService) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.webBackendService = Objects.requireNonNull(webBackendService, "expected parameter 'webBackendService' to be non-null");
    }

    private WebBackendServiceIamBindingArgs() {
        this.condition = Input.empty();
        this.members = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
        this.webBackendService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebBackendServiceIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebBackendServiceIamBindingConditionArgs> condition;
        private Input<List<String>> members;
        private @Nullable Input<String> project;
        private Input<String> role;
        private Input<String> webBackendService;

        public Builder() {
    	      // Empty
        }

        public Builder(WebBackendServiceIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.webBackendService = defaults.webBackendService;
        }

        public Builder setCondition(@Nullable Input<WebBackendServiceIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable WebBackendServiceIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
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

        public Builder setWebBackendService(Input<String> webBackendService) {
            this.webBackendService = Objects.requireNonNull(webBackendService);
            return this;
        }

        public Builder setWebBackendService(String webBackendService) {
            this.webBackendService = Input.of(Objects.requireNonNull(webBackendService));
            return this;
        }
        public WebBackendServiceIamBindingArgs build() {
            return new WebBackendServiceIamBindingArgs(condition, members, project, role, webBackendService);
        }
    }
}
