// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackupPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackupPolicyArgs Empty = new GetBackupPolicyArgs();

    @Import(name="backupPolicyName", required=true)
      private final String backupPolicyName;

    public String getBackupPolicyName() {
        return this.backupPolicyName;
    }

    /**
     * The name of the resource group where the backup vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the backup vault.
     * 
     */
    @Import(name="vaultName", required=true)
      private final String vaultName;

    public String getVaultName() {
        return this.vaultName;
    }

    public GetBackupPolicyArgs(
        String backupPolicyName,
        String resourceGroupName,
        String vaultName) {
        this.backupPolicyName = Objects.requireNonNull(backupPolicyName, "expected parameter 'backupPolicyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private GetBackupPolicyArgs() {
        this.backupPolicyName = null;
        this.resourceGroupName = null;
        this.vaultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupPolicyName;
        private String resourceGroupName;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPolicyName = defaults.backupPolicyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder backupPolicyName(String backupPolicyName) {
            this.backupPolicyName = Objects.requireNonNull(backupPolicyName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder vaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public GetBackupPolicyArgs build() {
            return new GetBackupPolicyArgs(backupPolicyName, resourceGroupName, vaultName);
        }
    }
}
