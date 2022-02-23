// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityConnectorPropertiesResponseOrganizationalData {
    /**
     * If the multi cloud account is of membership type organization, list of accounts excluded from offering
     * 
     */
    private final @Nullable List<String> excludedAccountIds;
    /**
     * The multi cloud account's membership type in the organization
     * 
     */
    private final @Nullable String organizationMembershipType;
    /**
     * If the multi cloud account is not of membership type organization, this will be the ID of the account's parent
     * 
     */
    private final @Nullable String parentHierarchyId;
    /**
     * If the multi cloud account is of membership type organization, this will be the name of the onboarding stackset
     * 
     */
    private final @Nullable String stacksetName;

    @OutputCustomType.Constructor({"excludedAccountIds","organizationMembershipType","parentHierarchyId","stacksetName"})
    private SecurityConnectorPropertiesResponseOrganizationalData(
        @Nullable List<String> excludedAccountIds,
        @Nullable String organizationMembershipType,
        @Nullable String parentHierarchyId,
        @Nullable String stacksetName) {
        this.excludedAccountIds = excludedAccountIds;
        this.organizationMembershipType = organizationMembershipType;
        this.parentHierarchyId = parentHierarchyId;
        this.stacksetName = stacksetName;
    }

    /**
     * If the multi cloud account is of membership type organization, list of accounts excluded from offering
     * 
     */
    public List<String> getExcludedAccountIds() {
        return this.excludedAccountIds == null ? List.of() : this.excludedAccountIds;
    }
    /**
     * The multi cloud account's membership type in the organization
     * 
     */
    public Optional<String> getOrganizationMembershipType() {
        return Optional.ofNullable(this.organizationMembershipType);
    }
    /**
     * If the multi cloud account is not of membership type organization, this will be the ID of the account's parent
     * 
     */
    public Optional<String> getParentHierarchyId() {
        return Optional.ofNullable(this.parentHierarchyId);
    }
    /**
     * If the multi cloud account is of membership type organization, this will be the name of the onboarding stackset
     * 
     */
    public Optional<String> getStacksetName() {
        return Optional.ofNullable(this.stacksetName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConnectorPropertiesResponseOrganizationalData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedAccountIds;
        private @Nullable String organizationMembershipType;
        private @Nullable String parentHierarchyId;
        private @Nullable String stacksetName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConnectorPropertiesResponseOrganizationalData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedAccountIds = defaults.excludedAccountIds;
    	      this.organizationMembershipType = defaults.organizationMembershipType;
    	      this.parentHierarchyId = defaults.parentHierarchyId;
    	      this.stacksetName = defaults.stacksetName;
        }

        public Builder setExcludedAccountIds(@Nullable List<String> excludedAccountIds) {
            this.excludedAccountIds = excludedAccountIds;
            return this;
        }

        public Builder setOrganizationMembershipType(@Nullable String organizationMembershipType) {
            this.organizationMembershipType = organizationMembershipType;
            return this;
        }

        public Builder setParentHierarchyId(@Nullable String parentHierarchyId) {
            this.parentHierarchyId = parentHierarchyId;
            return this;
        }

        public Builder setStacksetName(@Nullable String stacksetName) {
            this.stacksetName = stacksetName;
            return this;
        }
        public SecurityConnectorPropertiesResponseOrganizationalData build() {
            return new SecurityConnectorPropertiesResponseOrganizationalData(excludedAccountIds, organizationMembershipType, parentHierarchyId, stacksetName);
        }
    }
}
