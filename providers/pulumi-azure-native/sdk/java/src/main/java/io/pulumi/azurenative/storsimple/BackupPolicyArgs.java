// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.storsimple.enums.Kind;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupPolicyArgs Empty = new BackupPolicyArgs();

    /**
     * The name of the backup policy to be created/updated.
     * 
     */
    @InputImport(name="backupPolicyName")
        private final @Nullable Input<String> backupPolicyName;

    public Input<String> getBackupPolicyName() {
        return this.backupPolicyName == null ? Input.empty() : this.backupPolicyName;
    }

    /**
     * The device name
     * 
     */
    @InputImport(name="deviceName", required=true)
        private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<Kind> kind;

    public Input<Kind> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The manager name
     * 
     */
    @InputImport(name="managerName", required=true)
        private final Input<String> managerName;

    public Input<String> getManagerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The path IDs of the volumes which are part of the backup policy.
     * 
     */
    @InputImport(name="volumeIds", required=true)
        private final Input<List<String>> volumeIds;

    public Input<List<String>> getVolumeIds() {
        return this.volumeIds;
    }

    public BackupPolicyArgs(
        @Nullable Input<String> backupPolicyName,
        Input<String> deviceName,
        @Nullable Input<Kind> kind,
        Input<String> managerName,
        Input<String> resourceGroupName,
        Input<List<String>> volumeIds) {
        this.backupPolicyName = backupPolicyName;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.kind = kind;
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.volumeIds = Objects.requireNonNull(volumeIds, "expected parameter 'volumeIds' to be non-null");
    }

    private BackupPolicyArgs() {
        this.backupPolicyName = Input.empty();
        this.deviceName = Input.empty();
        this.kind = Input.empty();
        this.managerName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.volumeIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backupPolicyName;
        private Input<String> deviceName;
        private @Nullable Input<Kind> kind;
        private Input<String> managerName;
        private Input<String> resourceGroupName;
        private Input<List<String>> volumeIds;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPolicyName = defaults.backupPolicyName;
    	      this.deviceName = defaults.deviceName;
    	      this.kind = defaults.kind;
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.volumeIds = defaults.volumeIds;
        }

        public Builder setBackupPolicyName(@Nullable Input<String> backupPolicyName) {
            this.backupPolicyName = backupPolicyName;
            return this;
        }

        public Builder setBackupPolicyName(@Nullable String backupPolicyName) {
            this.backupPolicyName = Input.ofNullable(backupPolicyName);
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setKind(@Nullable Input<Kind> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable Kind kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setManagerName(Input<String> managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }

        public Builder setManagerName(String managerName) {
            this.managerName = Input.of(Objects.requireNonNull(managerName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setVolumeIds(Input<List<String>> volumeIds) {
            this.volumeIds = Objects.requireNonNull(volumeIds);
            return this;
        }

        public Builder setVolumeIds(List<String> volumeIds) {
            this.volumeIds = Input.of(Objects.requireNonNull(volumeIds));
            return this;
        }
        public BackupPolicyArgs build() {
            return new BackupPolicyArgs(backupPolicyName, deviceName, kind, managerName, resourceGroupName, volumeIds);
        }
    }
}
