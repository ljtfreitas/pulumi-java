// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.PolicyType;
import io.pulumi.azurenative.recoveryservices.inputs.LogSchedulePolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermSchedulePolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleSchedulePolicyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sub-protection policy which includes schedule and retention
 * 
 */
public final class SubProtectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubProtectionPolicyArgs Empty = new SubProtectionPolicyArgs();

    /**
     * Type of backup policy type
     * 
     */
    @Import(name="policyType")
      private final @Nullable Output<Either<String,PolicyType>> policyType;

    public Output<Either<String,PolicyType>> getPolicyType() {
        return this.policyType == null ? Output.empty() : this.policyType;
    }

    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    @Import(name="retentionPolicy")
      private final @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;

    public Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> getRetentionPolicy() {
        return this.retentionPolicy == null ? Output.empty() : this.retentionPolicy;
    }

    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    @Import(name="schedulePolicy")
      private final @Nullable Output<Object> schedulePolicy;

    public Output<Object> getSchedulePolicy() {
        return this.schedulePolicy == null ? Output.empty() : this.schedulePolicy;
    }

    public SubProtectionPolicyArgs(
        @Nullable Output<Either<String,PolicyType>> policyType,
        @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy,
        @Nullable Output<Object> schedulePolicy) {
        this.policyType = policyType;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
    }

    private SubProtectionPolicyArgs() {
        this.policyType = Output.empty();
        this.retentionPolicy = Output.empty();
        this.schedulePolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,PolicyType>> policyType;
        private @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;
        private @Nullable Output<Object> schedulePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(SubProtectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyType = defaults.policyType;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
        }

        public Builder policyType(@Nullable Output<Either<String,PolicyType>> policyType) {
            this.policyType = policyType;
            return this;
        }

        public Builder policyType(@Nullable Either<String,PolicyType> policyType) {
            this.policyType = Output.ofNullable(policyType);
            return this;
        }

        public Builder retentionPolicy(@Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder retentionPolicy(@Nullable Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = Output.ofNullable(retentionPolicy);
            return this;
        }

        public Builder schedulePolicy(@Nullable Output<Object> schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }

        public Builder schedulePolicy(@Nullable Object schedulePolicy) {
            this.schedulePolicy = Output.ofNullable(schedulePolicy);
            return this;
        }
        public SubProtectionPolicyArgs build() {
            return new SubProtectionPolicyArgs(policyType, retentionPolicy, schedulePolicy);
        }
    }
}
