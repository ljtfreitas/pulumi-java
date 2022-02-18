// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.LogSchedulePolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermSchedulePolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleSchedulePolicyResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sub-protection policy which includes schedule and retention
 * 
 */
public final class SubProtectionPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubProtectionPolicyResponse Empty = new SubProtectionPolicyResponse();

    /**
     * Type of backup policy type
     * 
     */
    @InputImport(name="policyType")
    private final @Nullable String policyType;

    public Optional<String> getPolicyType() {
        return this.policyType == null ? Optional.empty() : Optional.ofNullable(this.policyType);
    }

    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    @InputImport(name="retentionPolicy")
    private final @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;

    public Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> getRetentionPolicy() {
        return this.retentionPolicy == null ? null : this.retentionPolicy;
    }

    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    @InputImport(name="schedulePolicy")
    private final @Nullable Object schedulePolicy;

    public Object getSchedulePolicy() {
        return this.schedulePolicy == null ? null : this.schedulePolicy;
    }

    public SubProtectionPolicyResponse(
        @Nullable String policyType,
        @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy,
        @Nullable Object schedulePolicy) {
        this.policyType = policyType;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
    }

    private SubProtectionPolicyResponse() {
        this.policyType = null;
        this.retentionPolicy = null;
        this.schedulePolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String policyType;
        private @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;
        private @Nullable Object schedulePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(SubProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyType = defaults.policyType;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
        }

        public Builder setPolicyType(@Nullable String policyType) {
            this.policyType = policyType;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setSchedulePolicy(@Nullable Object schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }

        public SubProtectionPolicyResponse build() {
            return new SubProtectionPolicyResponse(policyType, retentionPolicy, schedulePolicy);
        }
    }
}
