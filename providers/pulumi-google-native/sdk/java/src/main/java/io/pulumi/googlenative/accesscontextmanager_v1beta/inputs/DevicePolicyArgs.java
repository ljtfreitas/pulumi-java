// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1beta.enums.DevicePolicyAllowedDeviceManagementLevelsItem;
import io.pulumi.googlenative.accesscontextmanager_v1beta.enums.DevicePolicyAllowedEncryptionStatusesItem;
import io.pulumi.googlenative.accesscontextmanager_v1beta.inputs.OsConstraintArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * `DevicePolicy` specifies device specific restrictions necessary to acquire a given access level. A `DevicePolicy` specifies requirements for requests from devices to be granted access levels, it does not do any enforcement on the device. `DevicePolicy` acts as an AND over all specified fields, and each repeated field is an OR over its elements. Any unset fields are ignored. For example, if the proto is { os_type : DESKTOP_WINDOWS, os_type : DESKTOP_LINUX, encryption_status: ENCRYPTED}, then the DevicePolicy will be true for requests originating from encrypted Linux desktops and encrypted Windows desktops.
 * 
 */
public final class DevicePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DevicePolicyArgs Empty = new DevicePolicyArgs();

    /**
     * Allowed device management levels, an empty list allows all management levels.
     * 
     */
    @InputImport(name="allowedDeviceManagementLevels")
      private final @Nullable Input<List<DevicePolicyAllowedDeviceManagementLevelsItem>> allowedDeviceManagementLevels;

    public Input<List<DevicePolicyAllowedDeviceManagementLevelsItem>> getAllowedDeviceManagementLevels() {
        return this.allowedDeviceManagementLevels == null ? Input.empty() : this.allowedDeviceManagementLevels;
    }

    /**
     * Allowed encryptions statuses, an empty list allows all statuses.
     * 
     */
    @InputImport(name="allowedEncryptionStatuses")
      private final @Nullable Input<List<DevicePolicyAllowedEncryptionStatusesItem>> allowedEncryptionStatuses;

    public Input<List<DevicePolicyAllowedEncryptionStatusesItem>> getAllowedEncryptionStatuses() {
        return this.allowedEncryptionStatuses == null ? Input.empty() : this.allowedEncryptionStatuses;
    }

    /**
     * Allowed OS versions, an empty list allows all types and all versions.
     * 
     */
    @InputImport(name="osConstraints")
      private final @Nullable Input<List<OsConstraintArgs>> osConstraints;

    public Input<List<OsConstraintArgs>> getOsConstraints() {
        return this.osConstraints == null ? Input.empty() : this.osConstraints;
    }

    /**
     * Whether the device needs to be approved by the customer admin.
     * 
     */
    @InputImport(name="requireAdminApproval")
      private final @Nullable Input<Boolean> requireAdminApproval;

    public Input<Boolean> getRequireAdminApproval() {
        return this.requireAdminApproval == null ? Input.empty() : this.requireAdminApproval;
    }

    /**
     * Whether the device needs to be corp owned.
     * 
     */
    @InputImport(name="requireCorpOwned")
      private final @Nullable Input<Boolean> requireCorpOwned;

    public Input<Boolean> getRequireCorpOwned() {
        return this.requireCorpOwned == null ? Input.empty() : this.requireCorpOwned;
    }

    /**
     * Whether or not screenlock is required for the DevicePolicy to be true. Defaults to `false`.
     * 
     */
    @InputImport(name="requireScreenlock")
      private final @Nullable Input<Boolean> requireScreenlock;

    public Input<Boolean> getRequireScreenlock() {
        return this.requireScreenlock == null ? Input.empty() : this.requireScreenlock;
    }

    public DevicePolicyArgs(
        @Nullable Input<List<DevicePolicyAllowedDeviceManagementLevelsItem>> allowedDeviceManagementLevels,
        @Nullable Input<List<DevicePolicyAllowedEncryptionStatusesItem>> allowedEncryptionStatuses,
        @Nullable Input<List<OsConstraintArgs>> osConstraints,
        @Nullable Input<Boolean> requireAdminApproval,
        @Nullable Input<Boolean> requireCorpOwned,
        @Nullable Input<Boolean> requireScreenlock) {
        this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
        this.allowedEncryptionStatuses = allowedEncryptionStatuses;
        this.osConstraints = osConstraints;
        this.requireAdminApproval = requireAdminApproval;
        this.requireCorpOwned = requireCorpOwned;
        this.requireScreenlock = requireScreenlock;
    }

    private DevicePolicyArgs() {
        this.allowedDeviceManagementLevels = Input.empty();
        this.allowedEncryptionStatuses = Input.empty();
        this.osConstraints = Input.empty();
        this.requireAdminApproval = Input.empty();
        this.requireCorpOwned = Input.empty();
        this.requireScreenlock = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DevicePolicyAllowedDeviceManagementLevelsItem>> allowedDeviceManagementLevels;
        private @Nullable Input<List<DevicePolicyAllowedEncryptionStatusesItem>> allowedEncryptionStatuses;
        private @Nullable Input<List<OsConstraintArgs>> osConstraints;
        private @Nullable Input<Boolean> requireAdminApproval;
        private @Nullable Input<Boolean> requireCorpOwned;
        private @Nullable Input<Boolean> requireScreenlock;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedDeviceManagementLevels = defaults.allowedDeviceManagementLevels;
    	      this.allowedEncryptionStatuses = defaults.allowedEncryptionStatuses;
    	      this.osConstraints = defaults.osConstraints;
    	      this.requireAdminApproval = defaults.requireAdminApproval;
    	      this.requireCorpOwned = defaults.requireCorpOwned;
    	      this.requireScreenlock = defaults.requireScreenlock;
        }

        public Builder setAllowedDeviceManagementLevels(@Nullable Input<List<DevicePolicyAllowedDeviceManagementLevelsItem>> allowedDeviceManagementLevels) {
            this.allowedDeviceManagementLevels = allowedDeviceManagementLevels;
            return this;
        }

        public Builder setAllowedDeviceManagementLevels(@Nullable List<DevicePolicyAllowedDeviceManagementLevelsItem> allowedDeviceManagementLevels) {
            this.allowedDeviceManagementLevels = Input.ofNullable(allowedDeviceManagementLevels);
            return this;
        }

        public Builder setAllowedEncryptionStatuses(@Nullable Input<List<DevicePolicyAllowedEncryptionStatusesItem>> allowedEncryptionStatuses) {
            this.allowedEncryptionStatuses = allowedEncryptionStatuses;
            return this;
        }

        public Builder setAllowedEncryptionStatuses(@Nullable List<DevicePolicyAllowedEncryptionStatusesItem> allowedEncryptionStatuses) {
            this.allowedEncryptionStatuses = Input.ofNullable(allowedEncryptionStatuses);
            return this;
        }

        public Builder setOsConstraints(@Nullable Input<List<OsConstraintArgs>> osConstraints) {
            this.osConstraints = osConstraints;
            return this;
        }

        public Builder setOsConstraints(@Nullable List<OsConstraintArgs> osConstraints) {
            this.osConstraints = Input.ofNullable(osConstraints);
            return this;
        }

        public Builder setRequireAdminApproval(@Nullable Input<Boolean> requireAdminApproval) {
            this.requireAdminApproval = requireAdminApproval;
            return this;
        }

        public Builder setRequireAdminApproval(@Nullable Boolean requireAdminApproval) {
            this.requireAdminApproval = Input.ofNullable(requireAdminApproval);
            return this;
        }

        public Builder setRequireCorpOwned(@Nullable Input<Boolean> requireCorpOwned) {
            this.requireCorpOwned = requireCorpOwned;
            return this;
        }

        public Builder setRequireCorpOwned(@Nullable Boolean requireCorpOwned) {
            this.requireCorpOwned = Input.ofNullable(requireCorpOwned);
            return this;
        }

        public Builder setRequireScreenlock(@Nullable Input<Boolean> requireScreenlock) {
            this.requireScreenlock = requireScreenlock;
            return this;
        }

        public Builder setRequireScreenlock(@Nullable Boolean requireScreenlock) {
            this.requireScreenlock = Input.ofNullable(requireScreenlock);
            return this;
        }
        public DevicePolicyArgs build() {
            return new DevicePolicyArgs(allowedDeviceManagementLevels, allowedEncryptionStatuses, osConstraints, requireAdminApproval, requireCorpOwned, requireScreenlock);
        }
    }
}
