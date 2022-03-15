// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.policyinsights.enums.ResourceDiscoveryMode;
import io.pulumi.azurenative.policyinsights.inputs.RemediationFiltersArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemediationAtManagementGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemediationAtManagementGroupArgs Empty = new RemediationAtManagementGroupArgs();

    /**
     * The filters that will be applied to determine which resources to remediate.
     * 
     */
    @Import(name="filters")
      private final @Nullable Output<RemediationFiltersArgs> filters;

    public Output<RemediationFiltersArgs> getFilters() {
        return this.filters == null ? Output.empty() : this.filters;
    }

    /**
     * Management group ID.
     * 
     */
    @Import(name="managementGroupId", required=true)
      private final Output<String> managementGroupId;

    public Output<String> getManagementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The namespace for Microsoft Management RP; only "Microsoft.Management" is allowed.
     * 
     */
    @Import(name="managementGroupsNamespace", required=true)
      private final Output<String> managementGroupsNamespace;

    public Output<String> getManagementGroupsNamespace() {
        return this.managementGroupsNamespace;
    }

    /**
     * The resource ID of the policy assignment that should be remediated.
     * 
     */
    @Import(name="policyAssignmentId")
      private final @Nullable Output<String> policyAssignmentId;

    public Output<String> getPolicyAssignmentId() {
        return this.policyAssignmentId == null ? Output.empty() : this.policyAssignmentId;
    }

    /**
     * The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    @Import(name="policyDefinitionReferenceId")
      private final @Nullable Output<String> policyDefinitionReferenceId;

    public Output<String> getPolicyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId == null ? Output.empty() : this.policyDefinitionReferenceId;
    }

    /**
     * The name of the remediation.
     * 
     */
    @Import(name="remediationName")
      private final @Nullable Output<String> remediationName;

    public Output<String> getRemediationName() {
        return this.remediationName == null ? Output.empty() : this.remediationName;
    }

    /**
     * The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
     */
    @Import(name="resourceDiscoveryMode")
      private final @Nullable Output<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode;

    public Output<Either<String,ResourceDiscoveryMode>> getResourceDiscoveryMode() {
        return this.resourceDiscoveryMode == null ? Output.empty() : this.resourceDiscoveryMode;
    }

    public RemediationAtManagementGroupArgs(
        @Nullable Output<RemediationFiltersArgs> filters,
        Output<String> managementGroupId,
        Output<String> managementGroupsNamespace,
        @Nullable Output<String> policyAssignmentId,
        @Nullable Output<String> policyDefinitionReferenceId,
        @Nullable Output<String> remediationName,
        @Nullable Output<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode) {
        this.filters = filters;
        this.managementGroupId = Objects.requireNonNull(managementGroupId, "expected parameter 'managementGroupId' to be non-null");
        this.managementGroupsNamespace = Objects.requireNonNull(managementGroupsNamespace, "expected parameter 'managementGroupsNamespace' to be non-null");
        this.policyAssignmentId = policyAssignmentId;
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        this.remediationName = remediationName;
        this.resourceDiscoveryMode = resourceDiscoveryMode;
    }

    private RemediationAtManagementGroupArgs() {
        this.filters = Output.empty();
        this.managementGroupId = Output.empty();
        this.managementGroupsNamespace = Output.empty();
        this.policyAssignmentId = Output.empty();
        this.policyDefinitionReferenceId = Output.empty();
        this.remediationName = Output.empty();
        this.resourceDiscoveryMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationAtManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RemediationFiltersArgs> filters;
        private Output<String> managementGroupId;
        private Output<String> managementGroupsNamespace;
        private @Nullable Output<String> policyAssignmentId;
        private @Nullable Output<String> policyDefinitionReferenceId;
        private @Nullable Output<String> remediationName;
        private @Nullable Output<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationAtManagementGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.managementGroupId = defaults.managementGroupId;
    	      this.managementGroupsNamespace = defaults.managementGroupsNamespace;
    	      this.policyAssignmentId = defaults.policyAssignmentId;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
    	      this.remediationName = defaults.remediationName;
    	      this.resourceDiscoveryMode = defaults.resourceDiscoveryMode;
        }

        public Builder filters(@Nullable Output<RemediationFiltersArgs> filters) {
            this.filters = filters;
            return this;
        }

        public Builder filters(@Nullable RemediationFiltersArgs filters) {
            this.filters = Output.ofNullable(filters);
            return this;
        }

        public Builder managementGroupId(Output<String> managementGroupId) {
            this.managementGroupId = Objects.requireNonNull(managementGroupId);
            return this;
        }

        public Builder managementGroupId(String managementGroupId) {
            this.managementGroupId = Output.of(Objects.requireNonNull(managementGroupId));
            return this;
        }

        public Builder managementGroupsNamespace(Output<String> managementGroupsNamespace) {
            this.managementGroupsNamespace = Objects.requireNonNull(managementGroupsNamespace);
            return this;
        }

        public Builder managementGroupsNamespace(String managementGroupsNamespace) {
            this.managementGroupsNamespace = Output.of(Objects.requireNonNull(managementGroupsNamespace));
            return this;
        }

        public Builder policyAssignmentId(@Nullable Output<String> policyAssignmentId) {
            this.policyAssignmentId = policyAssignmentId;
            return this;
        }

        public Builder policyAssignmentId(@Nullable String policyAssignmentId) {
            this.policyAssignmentId = Output.ofNullable(policyAssignmentId);
            return this;
        }

        public Builder policyDefinitionReferenceId(@Nullable Output<String> policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }

        public Builder policyDefinitionReferenceId(@Nullable String policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = Output.ofNullable(policyDefinitionReferenceId);
            return this;
        }

        public Builder remediationName(@Nullable Output<String> remediationName) {
            this.remediationName = remediationName;
            return this;
        }

        public Builder remediationName(@Nullable String remediationName) {
            this.remediationName = Output.ofNullable(remediationName);
            return this;
        }

        public Builder resourceDiscoveryMode(@Nullable Output<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode) {
            this.resourceDiscoveryMode = resourceDiscoveryMode;
            return this;
        }

        public Builder resourceDiscoveryMode(@Nullable Either<String,ResourceDiscoveryMode> resourceDiscoveryMode) {
            this.resourceDiscoveryMode = Output.ofNullable(resourceDiscoveryMode);
            return this;
        }
        public RemediationAtManagementGroupArgs build() {
            return new RemediationAtManagementGroupArgs(filters, managementGroupId, managementGroupsNamespace, policyAssignmentId, policyDefinitionReferenceId, remediationName, resourceDiscoveryMode);
        }
    }
}
