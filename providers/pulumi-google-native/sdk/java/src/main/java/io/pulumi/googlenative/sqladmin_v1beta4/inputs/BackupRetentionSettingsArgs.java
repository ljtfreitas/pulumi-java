// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.BackupRetentionSettingsRetentionUnit;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * We currently only support backup retention by specifying the number of backups we will retain.
 * 
 */
public final class BackupRetentionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupRetentionSettingsArgs Empty = new BackupRetentionSettingsArgs();

    /**
     * Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit is 'COUNT', we will retain this many backups.
     * 
     */
    @Import(name="retainedBackups")
      private final @Nullable Output<Integer> retainedBackups;

    public Output<Integer> getRetainedBackups() {
        return this.retainedBackups == null ? Output.empty() : this.retainedBackups;
    }

    /**
     * The unit that 'retained_backups' represents.
     * 
     */
    @Import(name="retentionUnit")
      private final @Nullable Output<BackupRetentionSettingsRetentionUnit> retentionUnit;

    public Output<BackupRetentionSettingsRetentionUnit> getRetentionUnit() {
        return this.retentionUnit == null ? Output.empty() : this.retentionUnit;
    }

    public BackupRetentionSettingsArgs(
        @Nullable Output<Integer> retainedBackups,
        @Nullable Output<BackupRetentionSettingsRetentionUnit> retentionUnit) {
        this.retainedBackups = retainedBackups;
        this.retentionUnit = retentionUnit;
    }

    private BackupRetentionSettingsArgs() {
        this.retainedBackups = Output.empty();
        this.retentionUnit = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupRetentionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> retainedBackups;
        private @Nullable Output<BackupRetentionSettingsRetentionUnit> retentionUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupRetentionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retainedBackups = defaults.retainedBackups;
    	      this.retentionUnit = defaults.retentionUnit;
        }

        public Builder retainedBackups(@Nullable Output<Integer> retainedBackups) {
            this.retainedBackups = retainedBackups;
            return this;
        }

        public Builder retainedBackups(@Nullable Integer retainedBackups) {
            this.retainedBackups = Output.ofNullable(retainedBackups);
            return this;
        }

        public Builder retentionUnit(@Nullable Output<BackupRetentionSettingsRetentionUnit> retentionUnit) {
            this.retentionUnit = retentionUnit;
            return this;
        }

        public Builder retentionUnit(@Nullable BackupRetentionSettingsRetentionUnit retentionUnit) {
            this.retentionUnit = Output.ofNullable(retentionUnit);
            return this;
        }
        public BackupRetentionSettingsArgs build() {
            return new BackupRetentionSettingsArgs(retainedBackups, retentionUnit);
        }
    }
}
