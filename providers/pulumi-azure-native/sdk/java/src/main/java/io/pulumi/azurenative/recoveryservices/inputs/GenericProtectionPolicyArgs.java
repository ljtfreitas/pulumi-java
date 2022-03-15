// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.SubProtectionPolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="backupManagementType", required=true)
      private final Output<String> backupManagementType;

    public Output<String> getBackupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Name of this policy's fabric.
     * 
     */
    @Import(name="fabricName")
      private final @Nullable Output<String> fabricName;

    public Output<String> getFabricName() {
        return this.fabricName == null ? Output.empty() : this.fabricName;
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
     * List of sub-protection policies which includes schedule and retention
     * 
     */
    @Import(name="subProtectionPolicy")
      private final @Nullable Output<List<SubProtectionPolicyArgs>> subProtectionPolicy;

    public Output<List<SubProtectionPolicyArgs>> getSubProtectionPolicy() {
        return this.subProtectionPolicy == null ? Output.empty() : this.subProtectionPolicy;
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Output.empty() : this.timeZone;
    }

    public GenericProtectionPolicyArgs(
        Output<String> backupManagementType,
        @Nullable Output<String> fabricName,
        @Nullable Output<Integer> protectedItemsCount,
        @Nullable Output<List<SubProtectionPolicyArgs>> subProtectionPolicy,
        @Nullable Output<String> timeZone) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType, "expected parameter 'backupManagementType' to be non-null");
        this.fabricName = fabricName;
        this.protectedItemsCount = protectedItemsCount;
        this.subProtectionPolicy = subProtectionPolicy;
        this.timeZone = timeZone;
    }

    private GenericProtectionPolicyArgs() {
        this.backupManagementType = Output.empty();
        this.fabricName = Output.empty();
        this.protectedItemsCount = Output.empty();
        this.subProtectionPolicy = Output.empty();
        this.timeZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backupManagementType;
        private @Nullable Output<String> fabricName;
        private @Nullable Output<Integer> protectedItemsCount;
        private @Nullable Output<List<SubProtectionPolicyArgs>> subProtectionPolicy;
        private @Nullable Output<String> timeZone;

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

        public Builder backupManagementType(Output<String> backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Output.of(Objects.requireNonNull(backupManagementType));
            return this;
        }

        public Builder fabricName(@Nullable Output<String> fabricName) {
            this.fabricName = fabricName;
            return this;
        }

        public Builder fabricName(@Nullable String fabricName) {
            this.fabricName = Output.ofNullable(fabricName);
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

        public Builder subProtectionPolicy(@Nullable Output<List<SubProtectionPolicyArgs>> subProtectionPolicy) {
            this.subProtectionPolicy = subProtectionPolicy;
            return this;
        }

        public Builder subProtectionPolicy(@Nullable List<SubProtectionPolicyArgs> subProtectionPolicy) {
            this.subProtectionPolicy = Output.ofNullable(subProtectionPolicy);
            return this;
        }

        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Output.ofNullable(timeZone);
            return this;
        }
        public GenericProtectionPolicyArgs build() {
            return new GenericProtectionPolicyArgs(backupManagementType, fabricName, protectedItemsCount, subProtectionPolicy, timeZone);
        }
    }
}
