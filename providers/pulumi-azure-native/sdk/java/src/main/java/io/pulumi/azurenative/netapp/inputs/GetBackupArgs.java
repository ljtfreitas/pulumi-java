// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBackupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackupArgs Empty = new GetBackupArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @InputImport(name="accountName", required=true)
        private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the backup
     * 
     */
    @InputImport(name="backupName", required=true)
        private final String backupName;

    public String getBackupName() {
        return this.backupName;
    }

    /**
     * The name of the capacity pool
     * 
     */
    @InputImport(name="poolName", required=true)
        private final String poolName;

    public String getPoolName() {
        return this.poolName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the volume
     * 
     */
    @InputImport(name="volumeName", required=true)
        private final String volumeName;

    public String getVolumeName() {
        return this.volumeName;
    }

    public GetBackupArgs(
        String accountName,
        String backupName,
        String poolName,
        String resourceGroupName,
        String volumeName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.backupName = Objects.requireNonNull(backupName, "expected parameter 'backupName' to be non-null");
        this.poolName = Objects.requireNonNull(poolName, "expected parameter 'poolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.volumeName = Objects.requireNonNull(volumeName, "expected parameter 'volumeName' to be non-null");
    }

    private GetBackupArgs() {
        this.accountName = null;
        this.backupName = null;
        this.poolName = null;
        this.resourceGroupName = null;
        this.volumeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String backupName;
        private String poolName;
        private String resourceGroupName;
        private String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.backupName = defaults.backupName;
    	      this.poolName = defaults.poolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setBackupName(String backupName) {
            this.backupName = Objects.requireNonNull(backupName);
            return this;
        }

        public Builder setPoolName(String poolName) {
            this.poolName = Objects.requireNonNull(poolName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVolumeName(String volumeName) {
            this.volumeName = Objects.requireNonNull(volumeName);
            return this;
        }
        public GetBackupArgs build() {
            return new GetBackupArgs(accountName, backupName, poolName, resourceGroupName, volumeName);
        }
    }
}
