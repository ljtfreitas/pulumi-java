// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackupVaultArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackupVaultArgs Empty = new GetBackupVaultArgs();

    @Import(name="backupVaultName", required=true)
      private final String backupVaultName;

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    public GetBackupVaultArgs(String backupVaultName) {
        this.backupVaultName = Objects.requireNonNull(backupVaultName, "expected parameter 'backupVaultName' to be non-null");
    }

    private GetBackupVaultArgs() {
        this.backupVaultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupVaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupVaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupVaultName = defaults.backupVaultName;
        }

        public Builder backupVaultName(String backupVaultName) {
            this.backupVaultName = Objects.requireNonNull(backupVaultName);
            return this;
        }
        public GetBackupVaultArgs build() {
            return new GetBackupVaultArgs(backupVaultName);
        }
    }
}
