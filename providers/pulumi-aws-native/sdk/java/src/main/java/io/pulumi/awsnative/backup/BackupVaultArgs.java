// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup;

import io.pulumi.awsnative.backup.inputs.BackupVaultLockConfigurationTypeArgs;
import io.pulumi.awsnative.backup.inputs.BackupVaultNotificationObjectTypeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupVaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupVaultArgs Empty = new BackupVaultArgs();

    @Import(name="accessPolicy")
      private final @Nullable Output<Object> accessPolicy;

    public Output<Object> getAccessPolicy() {
        return this.accessPolicy == null ? Output.empty() : this.accessPolicy;
    }

    @Import(name="backupVaultName")
      private final @Nullable Output<String> backupVaultName;

    public Output<String> getBackupVaultName() {
        return this.backupVaultName == null ? Output.empty() : this.backupVaultName;
    }

    @Import(name="backupVaultTags")
      private final @Nullable Output<Object> backupVaultTags;

    public Output<Object> getBackupVaultTags() {
        return this.backupVaultTags == null ? Output.empty() : this.backupVaultTags;
    }

    @Import(name="encryptionKeyArn")
      private final @Nullable Output<String> encryptionKeyArn;

    public Output<String> getEncryptionKeyArn() {
        return this.encryptionKeyArn == null ? Output.empty() : this.encryptionKeyArn;
    }

    @Import(name="lockConfiguration")
      private final @Nullable Output<BackupVaultLockConfigurationTypeArgs> lockConfiguration;

    public Output<BackupVaultLockConfigurationTypeArgs> getLockConfiguration() {
        return this.lockConfiguration == null ? Output.empty() : this.lockConfiguration;
    }

    @Import(name="notifications")
      private final @Nullable Output<BackupVaultNotificationObjectTypeArgs> notifications;

    public Output<BackupVaultNotificationObjectTypeArgs> getNotifications() {
        return this.notifications == null ? Output.empty() : this.notifications;
    }

    public BackupVaultArgs(
        @Nullable Output<Object> accessPolicy,
        @Nullable Output<String> backupVaultName,
        @Nullable Output<Object> backupVaultTags,
        @Nullable Output<String> encryptionKeyArn,
        @Nullable Output<BackupVaultLockConfigurationTypeArgs> lockConfiguration,
        @Nullable Output<BackupVaultNotificationObjectTypeArgs> notifications) {
        this.accessPolicy = accessPolicy;
        this.backupVaultName = backupVaultName;
        this.backupVaultTags = backupVaultTags;
        this.encryptionKeyArn = encryptionKeyArn;
        this.lockConfiguration = lockConfiguration;
        this.notifications = notifications;
    }

    private BackupVaultArgs() {
        this.accessPolicy = Output.empty();
        this.backupVaultName = Output.empty();
        this.backupVaultTags = Output.empty();
        this.encryptionKeyArn = Output.empty();
        this.lockConfiguration = Output.empty();
        this.notifications = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> accessPolicy;
        private @Nullable Output<String> backupVaultName;
        private @Nullable Output<Object> backupVaultTags;
        private @Nullable Output<String> encryptionKeyArn;
        private @Nullable Output<BackupVaultLockConfigurationTypeArgs> lockConfiguration;
        private @Nullable Output<BackupVaultNotificationObjectTypeArgs> notifications;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicy = defaults.accessPolicy;
    	      this.backupVaultName = defaults.backupVaultName;
    	      this.backupVaultTags = defaults.backupVaultTags;
    	      this.encryptionKeyArn = defaults.encryptionKeyArn;
    	      this.lockConfiguration = defaults.lockConfiguration;
    	      this.notifications = defaults.notifications;
        }

        public Builder accessPolicy(@Nullable Output<Object> accessPolicy) {
            this.accessPolicy = accessPolicy;
            return this;
        }

        public Builder accessPolicy(@Nullable Object accessPolicy) {
            this.accessPolicy = Output.ofNullable(accessPolicy);
            return this;
        }

        public Builder backupVaultName(@Nullable Output<String> backupVaultName) {
            this.backupVaultName = backupVaultName;
            return this;
        }

        public Builder backupVaultName(@Nullable String backupVaultName) {
            this.backupVaultName = Output.ofNullable(backupVaultName);
            return this;
        }

        public Builder backupVaultTags(@Nullable Output<Object> backupVaultTags) {
            this.backupVaultTags = backupVaultTags;
            return this;
        }

        public Builder backupVaultTags(@Nullable Object backupVaultTags) {
            this.backupVaultTags = Output.ofNullable(backupVaultTags);
            return this;
        }

        public Builder encryptionKeyArn(@Nullable Output<String> encryptionKeyArn) {
            this.encryptionKeyArn = encryptionKeyArn;
            return this;
        }

        public Builder encryptionKeyArn(@Nullable String encryptionKeyArn) {
            this.encryptionKeyArn = Output.ofNullable(encryptionKeyArn);
            return this;
        }

        public Builder lockConfiguration(@Nullable Output<BackupVaultLockConfigurationTypeArgs> lockConfiguration) {
            this.lockConfiguration = lockConfiguration;
            return this;
        }

        public Builder lockConfiguration(@Nullable BackupVaultLockConfigurationTypeArgs lockConfiguration) {
            this.lockConfiguration = Output.ofNullable(lockConfiguration);
            return this;
        }

        public Builder notifications(@Nullable Output<BackupVaultNotificationObjectTypeArgs> notifications) {
            this.notifications = notifications;
            return this;
        }

        public Builder notifications(@Nullable BackupVaultNotificationObjectTypeArgs notifications) {
            this.notifications = Output.ofNullable(notifications);
            return this;
        }
        public BackupVaultArgs build() {
            return new BackupVaultArgs(accessPolicy, backupVaultName, backupVaultTags, encryptionKeyArn, lockConfiguration, notifications);
        }
    }
}
