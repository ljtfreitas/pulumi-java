// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.LogSchedulePolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.LongTermRetentionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.LongTermSchedulePolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.SimpleRetentionPolicyResponse;
import io.pulumi.azurenative.recoveryservices.outputs.SimpleSchedulePolicyResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SubProtectionPolicyResponse {
    /**
     * Type of backup policy type
     * 
     */
    private final @Nullable String policyType;
    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    private final @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;
    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    private final @Nullable Object schedulePolicy;

    @OutputCustomType.Constructor({"policyType","retentionPolicy","schedulePolicy"})
    private SubProtectionPolicyResponse(
        @Nullable String policyType,
        @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy,
        @Nullable Object schedulePolicy) {
        this.policyType = policyType;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
    }

    /**
     * Type of backup policy type
     * 
     */
    public Optional<String> getPolicyType() {
        return Optional.ofNullable(this.policyType);
    }
    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    public Optional<Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse>> getRetentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }
    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    public Optional<Object> getSchedulePolicy() {
        return Optional.ofNullable(this.schedulePolicy);
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
