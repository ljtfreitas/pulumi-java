// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.SubProtectionPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GenericProtectionPolicyResponse {
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'GenericProtectionPolicy'.
     * 
     */
    private final String backupManagementType;
    /**
     * Name of this policy's fabric.
     * 
     */
    private final @Nullable String fabricName;
    /**
     * Number of items associated with this policy.
     * 
     */
    private final @Nullable Integer protectedItemsCount;
    /**
     * List of sub-protection policies which includes schedule and retention
     * 
     */
    private final @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy;
    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    private final @Nullable String timeZone;

    @OutputCustomType.Constructor({"backupManagementType","fabricName","protectedItemsCount","subProtectionPolicy","timeZone"})
    private GenericProtectionPolicyResponse(
        String backupManagementType,
        @Nullable String fabricName,
        @Nullable Integer protectedItemsCount,
        @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy,
        @Nullable String timeZone) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType);
        this.fabricName = fabricName;
        this.protectedItemsCount = protectedItemsCount;
        this.subProtectionPolicy = subProtectionPolicy;
        this.timeZone = timeZone;
    }

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'GenericProtectionPolicy'.
     * 
     */
    public String getBackupManagementType() {
        return this.backupManagementType;
    }
    /**
     * Name of this policy's fabric.
     * 
     */
    public Optional<String> getFabricName() {
        return Optional.ofNullable(this.fabricName);
    }
    /**
     * Number of items associated with this policy.
     * 
     */
    public Optional<Integer> getProtectedItemsCount() {
        return Optional.ofNullable(this.protectedItemsCount);
    }
    /**
     * List of sub-protection policies which includes schedule and retention
     * 
     */
    public List<SubProtectionPolicyResponse> getSubProtectionPolicy() {
        return this.subProtectionPolicy == null ? List.of() : this.subProtectionPolicy;
    }
    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupManagementType;
        private @Nullable String fabricName;
        private @Nullable Integer protectedItemsCount;
        private @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.fabricName = defaults.fabricName;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.subProtectionPolicy = defaults.subProtectionPolicy;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setBackupManagementType(String backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }

        public Builder setFabricName(@Nullable String fabricName) {
            this.fabricName = fabricName;
            return this;
        }

        public Builder setProtectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }

        public Builder setSubProtectionPolicy(@Nullable List<SubProtectionPolicyResponse> subProtectionPolicy) {
            this.subProtectionPolicy = subProtectionPolicy;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public GenericProtectionPolicyResponse build() {
            return new GenericProtectionPolicyResponse(backupManagementType, fabricName, protectedItemsCount, subProtectionPolicy, timeZone);
        }
    }
}
