// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionIamMemberArgs Empty = new FunctionIamMemberArgs();

    @InputImport(name="cloudFunction", required=true)
    private final Input<String> cloudFunction;

    public Input<String> getCloudFunction() {
        return this.cloudFunction;
    }

    @InputImport(name="condition")
    private final @Nullable Input<FunctionIamMemberConditionArgs> condition;

    public Input<FunctionIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="member", required=true)
    private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public FunctionIamMemberArgs(
        Input<String> cloudFunction,
        @Nullable Input<FunctionIamMemberConditionArgs> condition,
        Input<String> member,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> role) {
        this.cloudFunction = Objects.requireNonNull(cloudFunction, "expected parameter 'cloudFunction' to be non-null");
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private FunctionIamMemberArgs() {
        this.cloudFunction = Input.empty();
        this.condition = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cloudFunction;
        private @Nullable Input<FunctionIamMemberConditionArgs> condition;
        private Input<String> member;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
        }

        public Builder setCloudFunction(Input<String> cloudFunction) {
            this.cloudFunction = Objects.requireNonNull(cloudFunction);
            return this;
        }

        public Builder setCloudFunction(String cloudFunction) {
            this.cloudFunction = Input.of(Objects.requireNonNull(cloudFunction));
            return this;
        }

        public Builder setCondition(@Nullable Input<FunctionIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable FunctionIamMemberConditionArgs condition) {
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
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

        public FunctionIamMemberArgs build() {
            return new FunctionIamMemberArgs(cloudFunction, condition, member, project, region, role);
        }
    }
}