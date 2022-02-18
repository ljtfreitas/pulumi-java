// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.SyncConflictResolutionPolicy;
import io.pulumi.azurenative.sql.inputs.SkuArgs;
import io.pulumi.azurenative.sql.inputs.SyncGroupSchemaArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SyncGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final SyncGroupArgs Empty = new SyncGroupArgs();

    /**
     * Conflict logging retention period.
     * 
     */
    @InputImport(name="conflictLoggingRetentionInDays")
    private final @Nullable Input<Integer> conflictLoggingRetentionInDays;

    public Input<Integer> getConflictLoggingRetentionInDays() {
        return this.conflictLoggingRetentionInDays == null ? Input.empty() : this.conflictLoggingRetentionInDays;
    }

    /**
     * Conflict resolution policy of the sync group.
     * 
     */
    @InputImport(name="conflictResolutionPolicy")
    private final @Nullable Input<Either<String,SyncConflictResolutionPolicy>> conflictResolutionPolicy;

    public Input<Either<String,SyncConflictResolutionPolicy>> getConflictResolutionPolicy() {
        return this.conflictResolutionPolicy == null ? Input.empty() : this.conflictResolutionPolicy;
    }

    /**
     * The name of the database on which the sync group is hosted.
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * If conflict logging is enabled.
     * 
     */
    @InputImport(name="enableConflictLogging")
    private final @Nullable Input<Boolean> enableConflictLogging;

    public Input<Boolean> getEnableConflictLogging() {
        return this.enableConflictLogging == null ? Input.empty() : this.enableConflictLogging;
    }

    /**
     * Password for the sync group hub database credential.
     * 
     */
    @InputImport(name="hubDatabasePassword")
    private final @Nullable Input<String> hubDatabasePassword;

    public Input<String> getHubDatabasePassword() {
        return this.hubDatabasePassword == null ? Input.empty() : this.hubDatabasePassword;
    }

    /**
     * User name for the sync group hub database credential.
     * 
     */
    @InputImport(name="hubDatabaseUserName")
    private final @Nullable Input<String> hubDatabaseUserName;

    public Input<String> getHubDatabaseUserName() {
        return this.hubDatabaseUserName == null ? Input.empty() : this.hubDatabaseUserName;
    }

    /**
     * Sync interval of the sync group.
     * 
     */
    @InputImport(name="interval")
    private final @Nullable Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sync schema of the sync group.
     * 
     */
    @InputImport(name="schema")
    private final @Nullable Input<SyncGroupSchemaArgs> schema;

    public Input<SyncGroupSchemaArgs> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
    private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    /**
     * The name and capacity of the SKU.
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * ARM resource id of the sync database in the sync group.
     * 
     */
    @InputImport(name="syncDatabaseId")
    private final @Nullable Input<String> syncDatabaseId;

    public Input<String> getSyncDatabaseId() {
        return this.syncDatabaseId == null ? Input.empty() : this.syncDatabaseId;
    }

    /**
     * The name of the sync group.
     * 
     */
    @InputImport(name="syncGroupName")
    private final @Nullable Input<String> syncGroupName;

    public Input<String> getSyncGroupName() {
        return this.syncGroupName == null ? Input.empty() : this.syncGroupName;
    }

    /**
     * If use private link connection is enabled.
     * 
     */
    @InputImport(name="usePrivateLinkConnection")
    private final @Nullable Input<Boolean> usePrivateLinkConnection;

    public Input<Boolean> getUsePrivateLinkConnection() {
        return this.usePrivateLinkConnection == null ? Input.empty() : this.usePrivateLinkConnection;
    }

    public SyncGroupArgs(
        @Nullable Input<Integer> conflictLoggingRetentionInDays,
        @Nullable Input<Either<String,SyncConflictResolutionPolicy>> conflictResolutionPolicy,
        Input<String> databaseName,
        @Nullable Input<Boolean> enableConflictLogging,
        @Nullable Input<String> hubDatabasePassword,
        @Nullable Input<String> hubDatabaseUserName,
        @Nullable Input<Integer> interval,
        Input<String> resourceGroupName,
        @Nullable Input<SyncGroupSchemaArgs> schema,
        Input<String> serverName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<String> syncDatabaseId,
        @Nullable Input<String> syncGroupName,
        @Nullable Input<Boolean> usePrivateLinkConnection) {
        this.conflictLoggingRetentionInDays = conflictLoggingRetentionInDays;
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.enableConflictLogging = enableConflictLogging;
        this.hubDatabasePassword = hubDatabasePassword;
        this.hubDatabaseUserName = hubDatabaseUserName;
        this.interval = interval;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schema = schema;
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.sku = sku;
        this.syncDatabaseId = syncDatabaseId;
        this.syncGroupName = syncGroupName;
        this.usePrivateLinkConnection = usePrivateLinkConnection;
    }

    private SyncGroupArgs() {
        this.conflictLoggingRetentionInDays = Input.empty();
        this.conflictResolutionPolicy = Input.empty();
        this.databaseName = Input.empty();
        this.enableConflictLogging = Input.empty();
        this.hubDatabasePassword = Input.empty();
        this.hubDatabaseUserName = Input.empty();
        this.interval = Input.empty();
        this.resourceGroupName = Input.empty();
        this.schema = Input.empty();
        this.serverName = Input.empty();
        this.sku = Input.empty();
        this.syncDatabaseId = Input.empty();
        this.syncGroupName = Input.empty();
        this.usePrivateLinkConnection = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> conflictLoggingRetentionInDays;
        private @Nullable Input<Either<String,SyncConflictResolutionPolicy>> conflictResolutionPolicy;
        private Input<String> databaseName;
        private @Nullable Input<Boolean> enableConflictLogging;
        private @Nullable Input<String> hubDatabasePassword;
        private @Nullable Input<String> hubDatabaseUserName;
        private @Nullable Input<Integer> interval;
        private Input<String> resourceGroupName;
        private @Nullable Input<SyncGroupSchemaArgs> schema;
        private Input<String> serverName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<String> syncDatabaseId;
        private @Nullable Input<String> syncGroupName;
        private @Nullable Input<Boolean> usePrivateLinkConnection;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictLoggingRetentionInDays = defaults.conflictLoggingRetentionInDays;
    	      this.conflictResolutionPolicy = defaults.conflictResolutionPolicy;
    	      this.databaseName = defaults.databaseName;
    	      this.enableConflictLogging = defaults.enableConflictLogging;
    	      this.hubDatabasePassword = defaults.hubDatabasePassword;
    	      this.hubDatabaseUserName = defaults.hubDatabaseUserName;
    	      this.interval = defaults.interval;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schema = defaults.schema;
    	      this.serverName = defaults.serverName;
    	      this.sku = defaults.sku;
    	      this.syncDatabaseId = defaults.syncDatabaseId;
    	      this.syncGroupName = defaults.syncGroupName;
    	      this.usePrivateLinkConnection = defaults.usePrivateLinkConnection;
        }

        public Builder setConflictLoggingRetentionInDays(@Nullable Input<Integer> conflictLoggingRetentionInDays) {
            this.conflictLoggingRetentionInDays = conflictLoggingRetentionInDays;
            return this;
        }

        public Builder setConflictLoggingRetentionInDays(@Nullable Integer conflictLoggingRetentionInDays) {
            this.conflictLoggingRetentionInDays = Input.ofNullable(conflictLoggingRetentionInDays);
            return this;
        }

        public Builder setConflictResolutionPolicy(@Nullable Input<Either<String,SyncConflictResolutionPolicy>> conflictResolutionPolicy) {
            this.conflictResolutionPolicy = conflictResolutionPolicy;
            return this;
        }

        public Builder setConflictResolutionPolicy(@Nullable Either<String,SyncConflictResolutionPolicy> conflictResolutionPolicy) {
            this.conflictResolutionPolicy = Input.ofNullable(conflictResolutionPolicy);
            return this;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setEnableConflictLogging(@Nullable Input<Boolean> enableConflictLogging) {
            this.enableConflictLogging = enableConflictLogging;
            return this;
        }

        public Builder setEnableConflictLogging(@Nullable Boolean enableConflictLogging) {
            this.enableConflictLogging = Input.ofNullable(enableConflictLogging);
            return this;
        }

        public Builder setHubDatabasePassword(@Nullable Input<String> hubDatabasePassword) {
            this.hubDatabasePassword = hubDatabasePassword;
            return this;
        }

        public Builder setHubDatabasePassword(@Nullable String hubDatabasePassword) {
            this.hubDatabasePassword = Input.ofNullable(hubDatabasePassword);
            return this;
        }

        public Builder setHubDatabaseUserName(@Nullable Input<String> hubDatabaseUserName) {
            this.hubDatabaseUserName = hubDatabaseUserName;
            return this;
        }

        public Builder setHubDatabaseUserName(@Nullable String hubDatabaseUserName) {
            this.hubDatabaseUserName = Input.ofNullable(hubDatabaseUserName);
            return this;
        }

        public Builder setInterval(@Nullable Input<Integer> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSchema(@Nullable Input<SyncGroupSchemaArgs> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable SyncGroupSchemaArgs schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setSyncDatabaseId(@Nullable Input<String> syncDatabaseId) {
            this.syncDatabaseId = syncDatabaseId;
            return this;
        }

        public Builder setSyncDatabaseId(@Nullable String syncDatabaseId) {
            this.syncDatabaseId = Input.ofNullable(syncDatabaseId);
            return this;
        }

        public Builder setSyncGroupName(@Nullable Input<String> syncGroupName) {
            this.syncGroupName = syncGroupName;
            return this;
        }

        public Builder setSyncGroupName(@Nullable String syncGroupName) {
            this.syncGroupName = Input.ofNullable(syncGroupName);
            return this;
        }

        public Builder setUsePrivateLinkConnection(@Nullable Input<Boolean> usePrivateLinkConnection) {
            this.usePrivateLinkConnection = usePrivateLinkConnection;
            return this;
        }

        public Builder setUsePrivateLinkConnection(@Nullable Boolean usePrivateLinkConnection) {
            this.usePrivateLinkConnection = Input.ofNullable(usePrivateLinkConnection);
            return this;
        }

        public SyncGroupArgs build() {
            return new SyncGroupArgs(conflictLoggingRetentionInDays, conflictResolutionPolicy, databaseName, enableConflictLogging, hubDatabasePassword, hubDatabaseUserName, interval, resourceGroupName, schema, serverName, sku, syncDatabaseId, syncGroupName, usePrivateLinkConnection);
        }
    }
}
