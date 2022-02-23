// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BackupRetentionSettingsResponse {
    /**
     * Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit is 'COUNT', we will retain this many backups.
     * 
     */
    private final Integer retainedBackups;
    /**
     * The unit that 'retained_backups' represents.
     * 
     */
    private final String retentionUnit;

    @OutputCustomType.Constructor({"retainedBackups","retentionUnit"})
    private BackupRetentionSettingsResponse(
        Integer retainedBackups,
        String retentionUnit) {
        this.retainedBackups = Objects.requireNonNull(retainedBackups);
        this.retentionUnit = Objects.requireNonNull(retentionUnit);
    }

    /**
     * Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit is 'COUNT', we will retain this many backups.
     * 
     */
    public Integer getRetainedBackups() {
        return this.retainedBackups;
    }
    /**
     * The unit that 'retained_backups' represents.
     * 
     */
    public String getRetentionUnit() {
        return this.retentionUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupRetentionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer retainedBackups;
        private String retentionUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupRetentionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retainedBackups = defaults.retainedBackups;
    	      this.retentionUnit = defaults.retentionUnit;
        }

        public Builder setRetainedBackups(Integer retainedBackups) {
            this.retainedBackups = Objects.requireNonNull(retainedBackups);
            return this;
        }

        public Builder setRetentionUnit(String retentionUnit) {
            this.retentionUnit = Objects.requireNonNull(retentionUnit);
            return this;
        }
        public BackupRetentionSettingsResponse build() {
            return new BackupRetentionSettingsResponse(retainedBackups, retentionUnit);
        }
    }
}
