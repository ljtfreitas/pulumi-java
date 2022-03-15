// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.WorkloadType;
import io.pulumi.azurenative.recoveryservices.inputs.SettingsArgs;
import io.pulumi.azurenative.recoveryservices.inputs.SubProtectionPolicyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure VM (Mercury) workload-specific backup policy.
 * 
 */
public final class AzureVmWorkloadProtectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureVmWorkloadProtectionPolicyArgs Empty = new AzureVmWorkloadProtectionPolicyArgs();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'AzureWorkload'.
     * 
     */
    @Import(name="backupManagementType", required=true)
      private final Output<String> backupManagementType;

    public Output<String> getBackupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Fix the policy inconsistency
     * 
     */
    @Import(name="makePolicyConsistent")
      private final @Nullable Output<Boolean> makePolicyConsistent;

    public Output<Boolean> getMakePolicyConsistent() {
        return this.makePolicyConsistent == null ? Output.empty() : this.makePolicyConsistent;
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @Import(name="protectedItemsCount")
      private final @Nullable Output<Integer> protectedItemsCount;

    public Output<Integer> getProtectedItemsCount() {
        return this.protectedItemsCount == null ? Output.empty() : this.protectedItemsCount;
    }

    /**
     * Common settings for the backup management
     * 
     */
    @Import(name="settings")
      private final @Nullable Output<SettingsArgs> settings;

    public Output<SettingsArgs> getSettings() {
        return this.settings == null ? Output.empty() : this.settings;
    }

    /**
     * List of sub-protection policies which includes schedule and retention
     * 
     */
    @Import(name="subProtectionPolicy")
      private final @Nullable Output<List<SubProtectionPolicyArgs>> subProtectionPolicy;

    public Output<List<SubProtectionPolicyArgs>> getSubProtectionPolicy() {
        return this.subProtectionPolicy == null ? Output.empty() : this.subProtectionPolicy;
    }

    /**
     * Type of workload for the backup management
     * 
     */
    @Import(name="workLoadType")
      private final @Nullable Output<Either<String,WorkloadType>> workLoadType;

    public Output<Either<String,WorkloadType>> getWorkLoadType() {
        return this.workLoadType == null ? Output.empty() : this.workLoadType;
    }

    public AzureVmWorkloadProtectionPolicyArgs(
        Output<String> backupManagementType,
        @Nullable Output<Boolean> makePolicyConsistent,
        @Nullable Output<Integer> protectedItemsCount,
        @Nullable Output<SettingsArgs> settings,
        @Nullable Output<List<SubProtectionPolicyArgs>> subProtectionPolicy,
        @Nullable Output<Either<String,WorkloadType>> workLoadType) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType, "expected parameter 'backupManagementType' to be non-null");
        this.makePolicyConsistent = makePolicyConsistent;
        this.protectedItemsCount = protectedItemsCount;
        this.settings = settings;
        this.subProtectionPolicy = subProtectionPolicy;
        this.workLoadType = workLoadType;
    }

    private AzureVmWorkloadProtectionPolicyArgs() {
        this.backupManagementType = Output.empty();
        this.makePolicyConsistent = Output.empty();
        this.protectedItemsCount = Output.empty();
        this.settings = Output.empty();
        this.subProtectionPolicy = Output.empty();
        this.workLoadType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVmWorkloadProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backupManagementType;
        private @Nullable Output<Boolean> makePolicyConsistent;
        private @Nullable Output<Integer> protectedItemsCount;
        private @Nullable Output<SettingsArgs> settings;
        private @Nullable Output<List<SubProtectionPolicyArgs>> subProtectionPolicy;
        private @Nullable Output<Either<String,WorkloadType>> workLoadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVmWorkloadProtectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.makePolicyConsistent = defaults.makePolicyConsistent;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.settings = defaults.settings;
    	      this.subProtectionPolicy = defaults.subProtectionPolicy;
    	      this.workLoadType = defaults.workLoadType;
        }

        public Builder backupManagementType(Output<String> backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Output.of(Objects.requireNonNull(backupManagementType));
            return this;
        }

        public Builder makePolicyConsistent(@Nullable Output<Boolean> makePolicyConsistent) {
            this.makePolicyConsistent = makePolicyConsistent;
            return this;
        }

        public Builder makePolicyConsistent(@Nullable Boolean makePolicyConsistent) {
            this.makePolicyConsistent = Output.ofNullable(makePolicyConsistent);
            return this;
        }

        public Builder protectedItemsCount(@Nullable Output<Integer> protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }

        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = Output.ofNullable(protectedItemsCount);
            return this;
        }

        public Builder settings(@Nullable Output<SettingsArgs> settings) {
            this.settings = settings;
            return this;
        }

        public Builder settings(@Nullable SettingsArgs settings) {
            this.settings = Output.ofNullable(settings);
            return this;
        }

        public Builder subProtectionPolicy(@Nullable Output<List<SubProtectionPolicyArgs>> subProtectionPolicy) {
            this.subProtectionPolicy = subProtectionPolicy;
            return this;
        }

        public Builder subProtectionPolicy(@Nullable List<SubProtectionPolicyArgs> subProtectionPolicy) {
            this.subProtectionPolicy = Output.ofNullable(subProtectionPolicy);
            return this;
        }

        public Builder workLoadType(@Nullable Output<Either<String,WorkloadType>> workLoadType) {
            this.workLoadType = workLoadType;
            return this;
        }

        public Builder workLoadType(@Nullable Either<String,WorkloadType> workLoadType) {
            this.workLoadType = Output.ofNullable(workLoadType);
            return this;
        }
        public AzureVmWorkloadProtectionPolicyArgs build() {
            return new AzureVmWorkloadProtectionPolicyArgs(backupManagementType, makePolicyConsistent, protectedItemsCount, settings, subProtectionPolicy, workLoadType);
        }
    }
}
