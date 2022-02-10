// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityConnectorPropertiesResponseOrganizationalData extends io.pulumi.resources.InvokeArgs {

    public static final SecurityConnectorPropertiesResponseOrganizationalData Empty = new SecurityConnectorPropertiesResponseOrganizationalData();

    @InputImport(name="excludedAccountIds")
    private final @Nullable List<String> excludedAccountIds;

    public List<String> getExcludedAccountIds() {
        return this.excludedAccountIds == null ? List.of() : this.excludedAccountIds;
    }

    @InputImport(name="organizationMembershipType")
    private final @Nullable String organizationMembershipType;

    public Optional<String> getOrganizationMembershipType() {
        return this.organizationMembershipType == null ? Optional.empty() : Optional.ofNullable(this.organizationMembershipType);
    }

    @InputImport(name="parentHierarchyId")
    private final @Nullable String parentHierarchyId;

    public Optional<String> getParentHierarchyId() {
        return this.parentHierarchyId == null ? Optional.empty() : Optional.ofNullable(this.parentHierarchyId);
    }

    @InputImport(name="stacksetName")
    private final @Nullable String stacksetName;

    public Optional<String> getStacksetName() {
        return this.stacksetName == null ? Optional.empty() : Optional.ofNullable(this.stacksetName);
    }

    public SecurityConnectorPropertiesResponseOrganizationalData(
        @Nullable List<String> excludedAccountIds,
        @Nullable String organizationMembershipType,
        @Nullable String parentHierarchyId,
        @Nullable String stacksetName) {
        this.excludedAccountIds = excludedAccountIds;
        this.organizationMembershipType = organizationMembershipType;
        this.parentHierarchyId = parentHierarchyId;
        this.stacksetName = stacksetName;
    }

    private SecurityConnectorPropertiesResponseOrganizationalData() {
        this.excludedAccountIds = List.of();
        this.organizationMembershipType = null;
        this.parentHierarchyId = null;
        this.stacksetName = null;
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