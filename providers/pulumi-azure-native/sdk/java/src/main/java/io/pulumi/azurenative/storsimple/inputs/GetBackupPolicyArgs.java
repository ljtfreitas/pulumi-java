// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBackupPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackupPolicyArgs Empty = new GetBackupPolicyArgs();

    /**
     * The name of backup policy to be fetched.
     * 
     */
    @InputImport(name="backupPolicyName", required=true)
    private final String backupPolicyName;

    public String getBackupPolicyName() {
        return this.backupPolicyName;
    }

    /**
     * The device name
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * The manager name
     * 
     */
    @InputImport(name="managerName", required=true)
    private final String managerName;

    public String getManagerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetBackupPolicyArgs(
        String backupPolicyName,
        String deviceName,
        String managerName,
        String resourceGroupName) {
        this.backupPolicyName = Objects.requireNonNull(backupPolicyName, "expected parameter 'backupPolicyName' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetBackupPolicyArgs() {
        this.backupPolicyName = null;
        this.deviceName = null;
        this.managerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupPolicyName;
        private String deviceName;
        private String managerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPolicyName = defaults.backupPolicyName;
    	      this.deviceName = defaults.deviceName;
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setBackupPolicyName(String backupPolicyName) {
            this.backupPolicyName = Objects.requireNonNull(backupPolicyName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setManagerName(String managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetBackupPolicyArgs build() {
            return new GetBackupPolicyArgs(backupPolicyName, deviceName, managerName, resourceGroupName);
        }
    }
}
