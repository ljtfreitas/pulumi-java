// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.SubProtectionPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure VM (Mercury) workload-specific backup policy.
 * 
 */
public final class GenericProtectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GenericProtectionPolicyArgs Empty = new GenericProtectionPolicyArgs();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'GenericProtectionPolicy'.
     * 
     */
    @InputImport(name="backupManagementType", required=true)
    private final Input<String> backupManagementType;

    public Input<String> getBackupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Name of this policy's fabric.
     * 
     */
    @InputImport(name="fabricName")
    private final @Nullable Input<String> fabricName;

    public Input<String> getFabricName() {
        return this.fabricName == null ? Input.empty() : this.fabricName;
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @InputImport(name="protectedItemsCount")
    private final @Nullable Input<Integer> protectedItemsCount;

    public Input<Integer> getProtectedItemsCount() {
        return this.protectedItemsCount == null ? Input.empty() : this.protectedItemsCount;
    }

    /**
     * List of sub-protection policies which includes schedule and retention
     * 
     */
    @InputImport(name="subProtectionPolicy")
    private final @Nullable Input<List<SubProtectionPolicyArgs>> subProtectionPolicy;

    public Input<List<SubProtectionPolicyArgs>> getSubProtectionPolicy() {
        return this.subProtectionPolicy == null ? Input.empty() : this.subProtectionPolicy;
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    @InputImport(name="timeZone")
    private final @Nullable Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone == null ? Input.empty() : this.timeZone;
    }

    public GenericProtectionPolicyArgs(
        Input<String> backupManagementType,
        @Nullable Input<String> fabricName,
        @Nullable Input<Integer> protectedItemsCount,
        @Nullable Input<List<SubProtectionPolicyArgs>> subProtectionPolicy,
        @Nullable Input<String> timeZone) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType, "expected parameter 'backupManagementType' to be non-null");
        this.fabricName = fabricName;
        this.protectedItemsCount = protectedItemsCount;
        this.subProtectionPolicy = subProtectionPolicy;
        this.timeZone = timeZone;
    }

    private GenericProtectionPolicyArgs() {
        this.backupManagementType = Input.empty();
        this.fabricName = Input.empty();
        this.protectedItemsCount = Input.empty();
        this.subProtectionPolicy = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backupManagementType;
        private @Nullable Input<String> fabricName;
        private @Nullable Input<Integer> protectedItemsCount;
        private @Nullable Input<List<SubProtectionPolicyArgs>> subProtectionPolicy;
        private @Nullable Input<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericProtectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.fabricName = defaults.fabricName;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.subProtectionPolicy = defaults.subProtectionPolicy;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setBackupManagementType(Input<String> backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }

        public Builder setBackupManagementType(String backupManagementType) {
            this.backupManagementType = Input.of(Objects.requireNonNull(backupManagementType));
            return this;
        }

        public Builder setFabricName(@Nullable Input<String> fabricName) {
            this.fabricName = fabricName;
            return this;
        }

        public Builder setFabricName(@Nullable String fabricName) {
            this.fabricName = Input.ofNullable(fabricName);
            return this;
        }

        public Builder setProtectedItemsCount(@Nullable Input<Integer> protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }

        public Builder setProtectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = Input.ofNullable(protectedItemsCount);
            return this;
        }

        public Builder setSubProtectionPolicy(@Nullable Input<List<SubProtectionPolicyArgs>> subProtectionPolicy) {
            this.subProtectionPolicy = subProtectionPolicy;
            return this;
        }

        public Builder setSubProtectionPolicy(@Nullable List<SubProtectionPolicyArgs> subProtectionPolicy) {
            this.subProtectionPolicy = Input.ofNullable(subProtectionPolicy);
            return this;
        }

        public Builder setTimeZone(@Nullable Input<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = Input.ofNullable(timeZone);
            return this;
        }

        public GenericProtectionPolicyArgs build() {
            return new GenericProtectionPolicyArgs(backupManagementType, fabricName, protectedItemsCount, subProtectionPolicy, timeZone);
        }
    }
}
