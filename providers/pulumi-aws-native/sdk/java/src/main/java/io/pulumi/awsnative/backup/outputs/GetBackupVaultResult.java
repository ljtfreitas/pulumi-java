// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.awsnative.backup.outputs.BackupVaultLockConfigurationType;
import io.pulumi.awsnative.backup.outputs.BackupVaultNotificationObjectType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBackupVaultResult {
    private final @Nullable Object accessPolicy;
    private final @Nullable String backupVaultArn;
    private final @Nullable Object backupVaultTags;
    private final @Nullable BackupVaultLockConfigurationType lockConfiguration;
    private final @Nullable BackupVaultNotificationObjectType notifications;

    @OutputCustomType.Constructor
    private GetBackupVaultResult(
        @OutputCustomType.Parameter("accessPolicy") @Nullable Object accessPolicy,
        @OutputCustomType.Parameter("backupVaultArn") @Nullable String backupVaultArn,
        @OutputCustomType.Parameter("backupVaultTags") @Nullable Object backupVaultTags,
        @OutputCustomType.Parameter("lockConfiguration") @Nullable BackupVaultLockConfigurationType lockConfiguration,
        @OutputCustomType.Parameter("notifications") @Nullable BackupVaultNotificationObjectType notifications) {
        this.accessPolicy = accessPolicy;
        this.backupVaultArn = backupVaultArn;
        this.backupVaultTags = backupVaultTags;
        this.lockConfiguration = lockConfiguration;
        this.notifications = notifications;
    }

    public Optional<Object> getAccessPolicy() {
        return Optional.ofNullable(this.accessPolicy);
    }
    public Optional<String> getBackupVaultArn() {
        return Optional.ofNullable(this.backupVaultArn);
    }
    public Optional<Object> getBackupVaultTags() {
        return Optional.ofNullable(this.backupVaultTags);
    }
    public Optional<BackupVaultLockConfigurationType> getLockConfiguration() {
        return Optional.ofNullable(this.lockConfiguration);
    }
    public Optional<BackupVaultNotificationObjectType> getNotifications() {
        return Optional.ofNullable(this.notifications);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupVaultResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accessPolicy;
        private @Nullable String backupVaultArn;
        private @Nullable Object backupVaultTags;
        private @Nullable BackupVaultLockConfigurationType lockConfiguration;
        private @Nullable BackupVaultNotificationObjectType notifications;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupVaultResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicy = defaults.accessPolicy;
    	      this.backupVaultArn = defaults.backupVaultArn;
    	      this.backupVaultTags = defaults.backupVaultTags;
    	      this.lockConfiguration = defaults.lockConfiguration;
    	      this.notifications = defaults.notifications;
        }

        public Builder setAccessPolicy(@Nullable Object accessPolicy) {
            this.accessPolicy = accessPolicy;
            return this;
        }

        public Builder setBackupVaultArn(@Nullable String backupVaultArn) {
            this.backupVaultArn = backupVaultArn;
            return this;
        }

        public Builder setBackupVaultTags(@Nullable Object backupVaultTags) {
            this.backupVaultTags = backupVaultTags;
            return this;
        }

        public Builder setLockConfiguration(@Nullable BackupVaultLockConfigurationType lockConfiguration) {
            this.lockConfiguration = lockConfiguration;
            return this;
        }

        public Builder setNotifications(@Nullable BackupVaultNotificationObjectType notifications) {
            this.notifications = notifications;
            return this;
        }
        public GetBackupVaultResult build() {
            return new GetBackupVaultResult(accessPolicy, backupVaultArn, backupVaultTags, lockConfiguration, notifications);
        }
    }
}
