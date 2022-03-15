// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyOsConstraintArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelConditionDevicePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelConditionDevicePolicyArgs Empty = new AccessLevelConditionDevicePolicyArgs();

    /**
     * A list of allowed device management levels.
     * An empty list allows all management levels.
     * Each value may be one of `MANAGEMENT_UNSPECIFIED`, `NONE`, `BASIC`, and `COMPLETE`.
     * 
     */
    @Import(name="allowedDeviceManagementLevels")
      private final @Nullable Output<List<String>> allowedDeviceManagementLevels;

    public Output<List<String>> getAllowedDeviceManagementLevels() {
        return this.allowedDeviceManagementLevels == null ? Output.empty() : this.allowedDeviceManagementLevels;
    }

    /**
     * A list of allowed encryptions statuses.
     * An empty list allows all statuses.
     * Each value may be one of `ENCRYPTION_UNSPECIFIED`, `ENCRYPTION_UNSUPPORTED`, `UNENCRYPTED`, and `ENCRYPTED`.
     * 
     */
    @Import(name="allowedEncryptionStatuses")
      private final @Nullable Output<List<String>> allowedEncryptionStatuses;

    public Output<List<String>> getAllowedEncryptionStatuses() {
        return this.allowedEncryptionStatuses == null ? Output.empty() : this.allowedEncryptionStatuses;
    }

    /**
     * A list of allowed OS versions.
     * An empty list allows all types and all versions.
     * Structure is documented below.
     * 
     */
    @Import(name="osConstraints")
      private final @Nullable Output<List<AccessLevelConditionDevicePolicyOsConstraintArgs>> osConstraints;

    public Output<List<AccessLevelConditionDevicePolicyOsConstraintArgs>> getOsConstraints() {
        return this.osConstraints == null ? Output.empty() : this.osConstraints;
    }

    /**
     * Whether the device needs to be approved by the customer admin.
     * 
     */
    @Import(name="requireAdminApproval")
      private final @Nullable Output<Boolean> requireAdminApproval;

    public Output<Boolean> getRequireAdminApproval() {
        return this.requireAdminApproval == null ? Output.empty() : this.requireAdminApproval;
    }

    /**
     * Whether the device needs to be corp owned.
     * 
     */
    @Import(name="requireCorpOwned")
      private final @Nullable Output<Boolean> requireCorpOwned;

    public Output<Boolean> getRequireCorpOwned() {
        return this.requireCorpOwned == null ? Output.empty() : this.requireCorpOwned;
    }

    /**
     * Whether or not screenlock is required for the DevicePolicy
     * to be true. Defaults to false.
     * 
     */
    @Import(name="requireScreenLock")
      private final @Nullable Output<Boolean> requireScreenLock;

    public Output<Boolean> getRequireScreenLock() {
        return this.requireScreenLock == null ? Output.empty() : this.requireScreenLock;
    }

    public AccessLevelConditionDevicePolicyArgs(
        @Nullable Output<List<String>> allowedDeviceManagementLevels,
        @Nullable Output<List<String>> allowedEncryptionStatuses,
        @Nullable Output<List<AccessLevelConditionDevicePolicyOsConstraintArgs>> osConstraints,
        @Nullable Output<Boolean> requireAdminApproval,
        @Nullable Output<Boolean> requireCorpOwned,
        @Nullable Output<Boolean> requireScreenLock) {
        this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
        this.allowedEncryptionStatuses = allowedEncryptionStatuses;
        this.osConstraints = osConstraints;
        this.requireAdminApproval = requireAdminApproval;
        this.requireCorpOwned = requireCorpOwned;
        this.requireScreenLock = requireScreenLock;
    }

    private AccessLevelConditionDevicePolicyArgs() {
        this.allowedDeviceManagementLevels = Output.empty();
        this.allowedEncryptionStatuses = Output.empty();
        this.osConstraints = Output.empty();
        this.requireAdminApproval = Output.empty();
        this.requireCorpOwned = Output.empty();
        this.requireScreenLock = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelConditionDevicePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedDeviceManagementLevels;
        private @Nullable Output<List<String>> allowedEncryptionStatuses;
        private @Nullable Output<List<AccessLevelConditionDevicePolicyOsConstraintArgs>> osConstraints;
        private @Nullable Output<Boolean> requireAdminApproval;
        private @Nullable Output<Boolean> requireCorpOwned;
        private @Nullable Output<Boolean> requireScreenLock;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelConditionDevicePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedDeviceManagementLevels = defaults.allowedDeviceManagementLevels;
    	      this.allowedEncryptionStatuses = defaults.allowedEncryptionStatuses;
    	      this.osConstraints = defaults.osConstraints;
    	      this.requireAdminApproval = defaults.requireAdminApproval;
    	      this.requireCorpOwned = defaults.requireCorpOwned;
    	      this.requireScreenLock = defaults.requireScreenLock;
        }

        public Builder allowedDeviceManagementLevels(@Nullable Output<List<String>> allowedDeviceManagementLevels) {
            this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
            return this;
        }

        public Builder allowedDeviceManagementLevels(@Nullable List<String> allowedDeviceManagementLevels) {
            this.allowedDeviceManagementLevels = Output.ofNullable(allowedDeviceManagementLevels);
            return this;
        }

        public Builder allowedEncryptionStatuses(@Nullable Output<List<String>> allowedEncryptionStatuses) {
            this.allowedEncryptionStatuses = allowedEncryptionStatuses;
            return this;
        }

        public Builder allowedEncryptionStatuses(@Nullable List<String> allowedEncryptionStatuses) {
            this.allowedEncryptionStatuses = Output.ofNullable(allowedEncryptionStatuses);
            return this;
        }

        public Builder osConstraints(@Nullable Output<List<AccessLevelConditionDevicePolicyOsConstraintArgs>> osConstraints) {
            this.osConstraints = osConstraints;
            return this;
        }

        public Builder osConstraints(@Nullable List<AccessLevelConditionDevicePolicyOsConstraintArgs> osConstraints) {
            this.osConstraints = Output.ofNullable(osConstraints);
            return this;
        }

        public Builder requireAdminApproval(@Nullable Output<Boolean> requireAdminApproval) {
            this.requireAdminApproval = requireAdminApproval;
            return this;
        }

        public Builder requireAdminApproval(@Nullable Boolean requireAdminApproval) {
            this.requireAdminApproval = Output.ofNullable(requireAdminApproval);
            return this;
        }

        public Builder requireCorpOwned(@Nullable Output<Boolean> requireCorpOwned) {
            this.requireCorpOwned = requireCorpOwned;
            return this;
        }

        public Builder requireCorpOwned(@Nullable Boolean requireCorpOwned) {
            this.requireCorpOwned = Output.ofNullable(requireCorpOwned);
            return this;
        }

        public Builder requireScreenLock(@Nullable Output<Boolean> requireScreenLock) {
            this.requireScreenLock = requireScreenLock;
            return this;
        }

        public Builder requireScreenLock(@Nullable Boolean requireScreenLock) {
            this.requireScreenLock = Output.ofNullable(requireScreenLock);
            return this;
        }
        public AccessLevelConditionDevicePolicyArgs build() {
            return new AccessLevelConditionDevicePolicyArgs(allowedDeviceManagementLevels, allowedEncryptionStatuses, osConstraints, requireAdminApproval, requireCorpOwned, requireScreenLock);
        }
    }
}
