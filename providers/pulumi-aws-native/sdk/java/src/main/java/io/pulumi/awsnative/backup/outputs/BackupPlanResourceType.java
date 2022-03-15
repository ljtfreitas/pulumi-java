// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.awsnative.backup.outputs.BackupPlanAdvancedBackupSettingResourceType;
import io.pulumi.awsnative.backup.outputs.BackupPlanBackupRuleResourceType;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BackupPlanResourceType {
    private final @Nullable List<BackupPlanAdvancedBackupSettingResourceType> advancedBackupSettings;
    private final String backupPlanName;
    private final List<BackupPlanBackupRuleResourceType> backupPlanRule;

    @CustomType.Constructor
    private BackupPlanResourceType(
        @CustomType.Parameter("advancedBackupSettings") @Nullable List<BackupPlanAdvancedBackupSettingResourceType> advancedBackupSettings,
        @CustomType.Parameter("backupPlanName") String backupPlanName,
        @CustomType.Parameter("backupPlanRule") List<BackupPlanBackupRuleResourceType> backupPlanRule) {
        this.advancedBackupSettings = advancedBackupSettings;
        this.backupPlanName = backupPlanName;
        this.backupPlanRule = backupPlanRule;
    }

    public List<BackupPlanAdvancedBackupSettingResourceType> getAdvancedBackupSettings() {
        return this.advancedBackupSettings == null ? List.of() : this.advancedBackupSettings;
    }
    public String getBackupPlanName() {
        return this.backupPlanName;
    }
    public List<BackupPlanBackupRuleResourceType> getBackupPlanRule() {
        return this.backupPlanRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanResourceType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BackupPlanAdvancedBackupSettingResourceType> advancedBackupSettings;
        private String backupPlanName;
        private List<BackupPlanBackupRuleResourceType> backupPlanRule;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPlanResourceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedBackupSettings = defaults.advancedBackupSettings;
    	      this.backupPlanName = defaults.backupPlanName;
    	      this.backupPlanRule = defaults.backupPlanRule;
        }

        public Builder advancedBackupSettings(@Nullable List<BackupPlanAdvancedBackupSettingResourceType> advancedBackupSettings) {
            this.advancedBackupSettings = advancedBackupSettings;
            return this;
        }

        public Builder backupPlanName(String backupPlanName) {
            this.backupPlanName = Objects.requireNonNull(backupPlanName);
            return this;
        }

        public Builder backupPlanRule(List<BackupPlanBackupRuleResourceType> backupPlanRule) {
            this.backupPlanRule = Objects.requireNonNull(backupPlanRule);
            return this;
        }
        public BackupPlanResourceType build() {
            return new BackupPlanResourceType(advancedBackupSettings, backupPlanName, backupPlanRule);
        }
    }
}
