// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup;

import io.pulumi.awsnative.backup.inputs.BackupSelectionResourceTypeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BackupSelectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupSelectionArgs Empty = new BackupSelectionArgs();

    @Import(name="backupPlanId", required=true)
      private final Output<String> backupPlanId;

    public Output<String> getBackupPlanId() {
        return this.backupPlanId;
    }

    @Import(name="backupSelection", required=true)
      private final Output<BackupSelectionResourceTypeArgs> backupSelection;

    public Output<BackupSelectionResourceTypeArgs> getBackupSelection() {
        return this.backupSelection;
    }

    public BackupSelectionArgs(
        Output<String> backupPlanId,
        Output<BackupSelectionResourceTypeArgs> backupSelection) {
        this.backupPlanId = Objects.requireNonNull(backupPlanId, "expected parameter 'backupPlanId' to be non-null");
        this.backupSelection = Objects.requireNonNull(backupSelection, "expected parameter 'backupSelection' to be non-null");
    }

    private BackupSelectionArgs() {
        this.backupPlanId = Output.empty();
        this.backupSelection = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupSelectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backupPlanId;
        private Output<BackupSelectionResourceTypeArgs> backupSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupSelectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPlanId = defaults.backupPlanId;
    	      this.backupSelection = defaults.backupSelection;
        }

        public Builder backupPlanId(Output<String> backupPlanId) {
            this.backupPlanId = Objects.requireNonNull(backupPlanId);
            return this;
        }

        public Builder backupPlanId(String backupPlanId) {
            this.backupPlanId = Output.of(Objects.requireNonNull(backupPlanId));
            return this;
        }

        public Builder backupSelection(Output<BackupSelectionResourceTypeArgs> backupSelection) {
            this.backupSelection = Objects.requireNonNull(backupSelection);
            return this;
        }

        public Builder backupSelection(BackupSelectionResourceTypeArgs backupSelection) {
            this.backupSelection = Output.of(Objects.requireNonNull(backupSelection));
            return this;
        }
        public BackupSelectionArgs build() {
            return new BackupSelectionArgs(backupPlanId, backupSelection);
        }
    }
}
