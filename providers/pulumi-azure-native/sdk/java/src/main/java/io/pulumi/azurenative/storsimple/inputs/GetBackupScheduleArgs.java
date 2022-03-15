// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackupScheduleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackupScheduleArgs Empty = new GetBackupScheduleArgs();

    /**
     * The backup policy name.
     * 
     */
    @Import(name="backupPolicyName", required=true)
      private final String backupPolicyName;

    public String getBackupPolicyName() {
        return this.backupPolicyName;
    }

    /**
     * The name of the backup schedule to be fetched
     * 
     */
    @Import(name="backupScheduleName", required=true)
      private final String backupScheduleName;

    public String getBackupScheduleName() {
        return this.backupScheduleName;
    }

    /**
     * The device name
     * 
     */
    @Import(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
      private final String managerName;

    public String getManagerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetBackupScheduleArgs(
        String backupPolicyName,
        String backupScheduleName,
        String deviceName,
        String managerName,
        String resourceGroupName) {
        this.backupPolicyName = Objects.requireNonNull(backupPolicyName, "expected parameter 'backupPolicyName' to be non-null");
        this.backupScheduleName = Objects.requireNonNull(backupScheduleName, "expected parameter 'backupScheduleName' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetBackupScheduleArgs() {
        this.backupPolicyName = null;
        this.backupScheduleName = null;
        this.deviceName = null;
        this.managerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupPolicyName;
        private String backupScheduleName;
        private String deviceName;
        private String managerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPolicyName = defaults.backupPolicyName;
    	      this.backupScheduleName = defaults.backupScheduleName;
    	      this.deviceName = defaults.deviceName;
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder backupPolicyName(String backupPolicyName) {
            this.backupPolicyName = Objects.requireNonNull(backupPolicyName);
            return this;
        }

        public Builder backupScheduleName(String backupScheduleName) {
            this.backupScheduleName = Objects.requireNonNull(backupScheduleName);
            return this;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder managerName(String managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetBackupScheduleArgs build() {
            return new GetBackupScheduleArgs(backupPolicyName, backupScheduleName, deviceName, managerName, resourceGroupName);
        }
    }
}
