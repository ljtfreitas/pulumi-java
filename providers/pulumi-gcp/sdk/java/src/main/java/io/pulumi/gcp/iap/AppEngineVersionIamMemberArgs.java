// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.iap.inputs.AppEngineVersionIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppEngineVersionIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppEngineVersionIamMemberArgs Empty = new AppEngineVersionIamMemberArgs();

    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="appId", required=true)
        private final Input<String> appId;

    public Input<String> getAppId() {
        return this.appId;
    }

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
        private final @Nullable Input<AppEngineVersionIamMemberConditionArgs> condition;

    public Input<AppEngineVersionIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
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
     * `gcp.iap.AppEngineVersionIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
        private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    /**
     * Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="service", required=true)
        private final Input<String> service;

    public Input<String> getService() {
        return this.service;
    }

    /**
     * Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="versionId", required=true)
        private final Input<String> versionId;

    public Input<String> getVersionId() {
        return this.versionId;
    }

    public AppEngineVersionIamMemberArgs(
        Input<String> appId,
        @Nullable Input<AppEngineVersionIamMemberConditionArgs> condition,
        Input<String> member,
        @Nullable Input<String> project,
        Input<String> role,
        Input<String> service,
        Input<String> versionId) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.versionId = Objects.requireNonNull(versionId, "expected parameter 'versionId' to be non-null");
    }

    private AppEngineVersionIamMemberArgs() {
        this.appId = Input.empty();
        this.condition = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
        this.service = Input.empty();
        this.versionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineVersionIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appId;
        private @Nullable Input<AppEngineVersionIamMemberConditionArgs> condition;
        private Input<String> member;
        private @Nullable Input<String> project;
        private Input<String> role;
        private Input<String> service;
        private Input<String> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineVersionIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.service = defaults.service;
    	      this.versionId = defaults.versionId;
        }

        public Builder setAppId(Input<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppId(String appId) {
            this.appId = Input.of(Objects.requireNonNull(appId));
            return this;
        }

        public Builder setCondition(@Nullable Input<AppEngineVersionIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable AppEngineVersionIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
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

        public Builder setService(Input<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setService(String service) {
            this.service = Input.of(Objects.requireNonNull(service));
            return this;
        }

        public Builder setVersionId(Input<String> versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }

        public Builder setVersionId(String versionId) {
            this.versionId = Input.of(Objects.requireNonNull(versionId));
            return this;
        }
        public AppEngineVersionIamMemberArgs build() {
            return new AppEngineVersionIamMemberArgs(appId, condition, member, project, role, service, versionId);
        }
    }
}
