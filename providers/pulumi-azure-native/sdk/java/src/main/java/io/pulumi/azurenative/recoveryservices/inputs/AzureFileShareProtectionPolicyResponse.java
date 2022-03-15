// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.LogSchedulePolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermSchedulePolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleSchedulePolicyResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AzureStorage backup policy.
 * 
 */
public final class AzureFileShareProtectionPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFileShareProtectionPolicyResponse Empty = new AzureFileShareProtectionPolicyResponse();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'AzureStorage'.
     * 
     */
    @Import(name="backupManagementType", required=true)
      private final String backupManagementType;

    public String getBackupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @Import(name="protectedItemsCount")
      private final @Nullable Integer protectedItemsCount;

    public Optional<Integer> getProtectedItemsCount() {
        return this.protectedItemsCount == null ? Optional.empty() : Optional.ofNullable(this.protectedItemsCount);
    }

    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    @Import(name="retentionPolicy")
      private final @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;

    public Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> getRetentionPolicy() {
        return this.retentionPolicy == null ? null : this.retentionPolicy;
    }

    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    @Import(name="schedulePolicy")
      private final @Nullable Object schedulePolicy;

    public Object getSchedulePolicy() {
        return this.schedulePolicy == null ? null : this.schedulePolicy;
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    @Import(name="timeZone")
      private final @Nullable String timeZone;

    public Optional<String> getTimeZone() {
        return this.timeZone == null ? Optional.empty() : Optional.ofNullable(this.timeZone);
    }

    /**
     * Type of workload for the backup management
     * 
     */
    @Import(name="workLoadType")
      private final @Nullable String workLoadType;

    public Optional<String> getWorkLoadType() {
        return this.workLoadType == null ? Optional.empty() : Optional.ofNullable(this.workLoadType);
    }

    public AzureFileShareProtectionPolicyResponse(
        String backupManagementType,
        @Nullable Integer protectedItemsCount,
        @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy,
        @Nullable Object schedulePolicy,
        @Nullable String timeZone,
        @Nullable String workLoadType) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType, "expected parameter 'backupManagementType' to be non-null");
        this.protectedItemsCount = protectedItemsCount;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
        this.timeZone = timeZone;
        this.workLoadType = workLoadType;
    }

    private AzureFileShareProtectionPolicyResponse() {
        this.backupManagementType = null;
        this.protectedItemsCount = null;
        this.retentionPolicy = null;
        this.schedulePolicy = null;
        this.timeZone = null;
        this.workLoadType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileShareProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupManagementType;
        private @Nullable Integer protectedItemsCount;
        private @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;
        private @Nullable Object schedulePolicy;
        private @Nullable String timeZone;
        private @Nullable String workLoadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileShareProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
    	      this.timeZone = defaults.timeZone;
    	      this.workLoadType = defaults.workLoadType;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }

        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }

        public Builder retentionPolicy(@Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder schedulePolicy(@Nullable Object schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }

        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder workLoadType(@Nullable String workLoadType) {
            this.workLoadType = workLoadType;
            return this;
        }
        public AzureFileShareProtectionPolicyResponse build() {
            return new AzureFileShareProtectionPolicyResponse(backupManagementType, protectedItemsCount, retentionPolicy, schedulePolicy, timeZone, workLoadType);
        }
    }
}
