// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountAssignmentState extends io.pulumi.resources.ResourceArgs {

    public static final AccountAssignmentState Empty = new AccountAssignmentState();

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance.
     * 
     */
    @InputImport(name="instanceArn")
    private final @Nullable Input<String> instanceArn;

    public Input<String> getInstanceArn() {
        return this.instanceArn == null ? Input.empty() : this.instanceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Permission Set that the admin wants to grant the principal access to.
     * 
     */
    @InputImport(name="permissionSetArn")
    private final @Nullable Input<String> permissionSetArn;

    public Input<String> getPermissionSetArn() {
        return this.permissionSetArn == null ? Input.empty() : this.permissionSetArn;
    }

    /**
     * An identifier for an object in SSO, such as a user or group. PrincipalIds are GUIDs (For example, `f81d4fae-7dec-11d0-a765-00a0c91e6bf6`).
     * 
     */
    @InputImport(name="principalId")
    private final @Nullable Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId == null ? Input.empty() : this.principalId;
    }

    /**
     * The entity type for which the assignment will be created. Valid values: `USER`, `GROUP`.
     * 
     */
    @InputImport(name="principalType")
    private final @Nullable Input<String> principalType;

    public Input<String> getPrincipalType() {
        return this.principalType == null ? Input.empty() : this.principalType;
    }

    /**
     * An AWS account identifier, typically a 10-12 digit string.
     * 
     */
    @InputImport(name="targetId")
    private final @Nullable Input<String> targetId;

    public Input<String> getTargetId() {
        return this.targetId == null ? Input.empty() : this.targetId;
    }

    /**
     * The entity type for which the assignment will be created. Valid values: `AWS_ACCOUNT`.
     * 
     */
    @InputImport(name="targetType")
    private final @Nullable Input<String> targetType;

    public Input<String> getTargetType() {
        return this.targetType == null ? Input.empty() : this.targetType;
    }

    public AccountAssignmentState(
        @Nullable Input<String> instanceArn,
        @Nullable Input<String> permissionSetArn,
        @Nullable Input<String> principalId,
        @Nullable Input<String> principalType,
        @Nullable Input<String> targetId,
        @Nullable Input<String> targetType) {
        this.instanceArn = instanceArn;
        this.permissionSetArn = permissionSetArn;
        this.principalId = principalId;
        this.principalType = principalType;
        this.targetId = targetId;
        this.targetType = targetType;
    }

    private AccountAssignmentState() {
        this.instanceArn = Input.empty();
        this.permissionSetArn = Input.empty();
        this.principalId = Input.empty();
        this.principalType = Input.empty();
        this.targetId = Input.empty();
        this.targetType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceArn;
        private @Nullable Input<String> permissionSetArn;
        private @Nullable Input<String> principalId;
        private @Nullable Input<String> principalType;
        private @Nullable Input<String> targetId;
        private @Nullable Input<String> targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAssignmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceArn = defaults.instanceArn;
    	      this.permissionSetArn = defaults.permissionSetArn;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.targetId = defaults.targetId;
    	      this.targetType = defaults.targetType;
        }

        public Builder setInstanceArn(@Nullable Input<String> instanceArn) {
            this.instanceArn = instanceArn;
            return this;
        }

        public Builder setInstanceArn(@Nullable String instanceArn) {
            this.instanceArn = Input.ofNullable(instanceArn);
            return this;
        }

        public Builder setPermissionSetArn(@Nullable Input<String> permissionSetArn) {
            this.permissionSetArn = permissionSetArn;
            return this;
        }

        public Builder setPermissionSetArn(@Nullable String permissionSetArn) {
            this.permissionSetArn = Input.ofNullable(permissionSetArn);
            return this;
        }

        public Builder setPrincipalId(@Nullable Input<String> principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = Input.ofNullable(principalId);
            return this;
        }

        public Builder setPrincipalType(@Nullable Input<String> principalType) {
            this.principalType = principalType;
            return this;
        }

        public Builder setPrincipalType(@Nullable String principalType) {
            this.principalType = Input.ofNullable(principalType);
            return this;
        }

        public Builder setTargetId(@Nullable Input<String> targetId) {
            this.targetId = targetId;
            return this;
        }

        public Builder setTargetId(@Nullable String targetId) {
            this.targetId = Input.ofNullable(targetId);
            return this;
        }

        public Builder setTargetType(@Nullable Input<String> targetType) {
            this.targetType = targetType;
            return this;
        }

        public Builder setTargetType(@Nullable String targetType) {
            this.targetType = Input.ofNullable(targetType);
            return this;
        }
        public AccountAssignmentState build() {
            return new AccountAssignmentState(instanceArn, permissionSetArn, principalId, principalType, targetId, targetType);
        }
    }
}