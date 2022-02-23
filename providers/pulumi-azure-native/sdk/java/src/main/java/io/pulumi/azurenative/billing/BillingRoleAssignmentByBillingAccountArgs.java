// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BillingRoleAssignmentByBillingAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final BillingRoleAssignmentByBillingAccountArgs Empty = new BillingRoleAssignmentByBillingAccountArgs();

    /**
     * The ID that uniquely identifies a billing account.
     * 
     */
    @InputImport(name="billingAccountName", required=true)
        private final Input<String> billingAccountName;

    public Input<String> getBillingAccountName() {
        return this.billingAccountName;
    }

    /**
     * The ID that uniquely identifies a role assignment.
     * 
     */
    @InputImport(name="billingRoleAssignmentName")
        private final @Nullable Input<String> billingRoleAssignmentName;

    public Input<String> getBillingRoleAssignmentName() {
        return this.billingRoleAssignmentName == null ? Input.empty() : this.billingRoleAssignmentName;
    }

    /**
     * The principal id of the user to whom the role was assigned.
     * 
     */
    @InputImport(name="principalId")
        private final @Nullable Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId == null ? Input.empty() : this.principalId;
    }

    /**
     * The principal tenant id of the user to whom the role was assigned.
     * 
     */
    @InputImport(name="principalTenantId")
        private final @Nullable Input<String> principalTenantId;

    public Input<String> getPrincipalTenantId() {
        return this.principalTenantId == null ? Input.empty() : this.principalTenantId;
    }

    /**
     * The ID of the role definition.
     * 
     */
    @InputImport(name="roleDefinitionId")
        private final @Nullable Input<String> roleDefinitionId;

    public Input<String> getRoleDefinitionId() {
        return this.roleDefinitionId == null ? Input.empty() : this.roleDefinitionId;
    }

    /**
     * The authentication type of the user, whether Organization or MSA, of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @InputImport(name="userAuthenticationType")
        private final @Nullable Input<String> userAuthenticationType;

    public Input<String> getUserAuthenticationType() {
        return this.userAuthenticationType == null ? Input.empty() : this.userAuthenticationType;
    }

    /**
     * The email address of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @InputImport(name="userEmailAddress")
        private final @Nullable Input<String> userEmailAddress;

    public Input<String> getUserEmailAddress() {
        return this.userEmailAddress == null ? Input.empty() : this.userEmailAddress;
    }

    public BillingRoleAssignmentByBillingAccountArgs(
        Input<String> billingAccountName,
        @Nullable Input<String> billingRoleAssignmentName,
        @Nullable Input<String> principalId,
        @Nullable Input<String> principalTenantId,
        @Nullable Input<String> roleDefinitionId,
        @Nullable Input<String> userAuthenticationType,
        @Nullable Input<String> userEmailAddress) {
        this.billingAccountName = Objects.requireNonNull(billingAccountName, "expected parameter 'billingAccountName' to be non-null");
        this.billingRoleAssignmentName = billingRoleAssignmentName;
        this.principalId = principalId;
        this.principalTenantId = principalTenantId;
        this.roleDefinitionId = roleDefinitionId;
        this.userAuthenticationType = userAuthenticationType;
        this.userEmailAddress = userEmailAddress;
    }

    private BillingRoleAssignmentByBillingAccountArgs() {
        this.billingAccountName = Input.empty();
        this.billingRoleAssignmentName = Input.empty();
        this.principalId = Input.empty();
        this.principalTenantId = Input.empty();
        this.roleDefinitionId = Input.empty();
        this.userAuthenticationType = Input.empty();
        this.userEmailAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingRoleAssignmentByBillingAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> billingAccountName;
        private @Nullable Input<String> billingRoleAssignmentName;
        private @Nullable Input<String> principalId;
        private @Nullable Input<String> principalTenantId;
        private @Nullable Input<String> roleDefinitionId;
        private @Nullable Input<String> userAuthenticationType;
        private @Nullable Input<String> userEmailAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingRoleAssignmentByBillingAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountName = defaults.billingAccountName;
    	      this.billingRoleAssignmentName = defaults.billingRoleAssignmentName;
    	      this.principalId = defaults.principalId;
    	      this.principalTenantId = defaults.principalTenantId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.userAuthenticationType = defaults.userAuthenticationType;
    	      this.userEmailAddress = defaults.userEmailAddress;
        }

        public Builder setBillingAccountName(Input<String> billingAccountName) {
            this.billingAccountName = Objects.requireNonNull(billingAccountName);
            return this;
        }

        public Builder setBillingAccountName(String billingAccountName) {
            this.billingAccountName = Input.of(Objects.requireNonNull(billingAccountName));
            return this;
        }

        public Builder setBillingRoleAssignmentName(@Nullable Input<String> billingRoleAssignmentName) {
            this.billingRoleAssignmentName = billingRoleAssignmentName;
            return this;
        }

        public Builder setBillingRoleAssignmentName(@Nullable String billingRoleAssignmentName) {
            this.billingRoleAssignmentName = Input.ofNullable(billingRoleAssignmentName);
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

        public Builder setPrincipalTenantId(@Nullable Input<String> principalTenantId) {
            this.principalTenantId = principalTenantId;
            return this;
        }

        public Builder setPrincipalTenantId(@Nullable String principalTenantId) {
            this.principalTenantId = Input.ofNullable(principalTenantId);
            return this;
        }

        public Builder setRoleDefinitionId(@Nullable Input<String> roleDefinitionId) {
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }

        public Builder setRoleDefinitionId(@Nullable String roleDefinitionId) {
            this.roleDefinitionId = Input.ofNullable(roleDefinitionId);
            return this;
        }

        public Builder setUserAuthenticationType(@Nullable Input<String> userAuthenticationType) {
            this.userAuthenticationType = userAuthenticationType;
            return this;
        }

        public Builder setUserAuthenticationType(@Nullable String userAuthenticationType) {
            this.userAuthenticationType = Input.ofNullable(userAuthenticationType);
            return this;
        }

        public Builder setUserEmailAddress(@Nullable Input<String> userEmailAddress) {
            this.userEmailAddress = userEmailAddress;
            return this;
        }

        public Builder setUserEmailAddress(@Nullable String userEmailAddress) {
            this.userEmailAddress = Input.ofNullable(userEmailAddress);
            return this;
        }
        public BillingRoleAssignmentByBillingAccountArgs build() {
            return new BillingRoleAssignmentByBillingAccountArgs(billingAccountName, billingRoleAssignmentName, principalId, principalTenantId, roleDefinitionId, userAuthenticationType, userEmailAddress);
        }
    }
}
