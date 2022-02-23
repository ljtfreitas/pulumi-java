// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.SyncDirection;
import io.pulumi.azurenative.sql.enums.SyncMemberDbType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SyncMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final SyncMemberArgs Empty = new SyncMemberArgs();

    /**
     * Database name of the member database in the sync member.
     * 
     */
    @InputImport(name="databaseName", required=true)
        private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Database type of the sync member.
     * 
     */
    @InputImport(name="databaseType")
        private final @Nullable Input<Either<String,SyncMemberDbType>> databaseType;

    public Input<Either<String,SyncMemberDbType>> getDatabaseType() {
        return this.databaseType == null ? Input.empty() : this.databaseType;
    }

    /**
     * Password of the member database in the sync member.
     * 
     */
    @InputImport(name="password")
        private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
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
     * Server name of the member database in the sync member
     * 
     */
    @InputImport(name="serverName", required=true)
        private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    /**
     * SQL Server database id of the sync member.
     * 
     */
    @InputImport(name="sqlServerDatabaseId")
        private final @Nullable Input<String> sqlServerDatabaseId;

    public Input<String> getSqlServerDatabaseId() {
        return this.sqlServerDatabaseId == null ? Input.empty() : this.sqlServerDatabaseId;
    }

    /**
     * ARM resource id of the sync agent in the sync member.
     * 
     */
    @InputImport(name="syncAgentId")
        private final @Nullable Input<String> syncAgentId;

    public Input<String> getSyncAgentId() {
        return this.syncAgentId == null ? Input.empty() : this.syncAgentId;
    }

    /**
     * Sync direction of the sync member.
     * 
     */
    @InputImport(name="syncDirection")
        private final @Nullable Input<Either<String,SyncDirection>> syncDirection;

    public Input<Either<String,SyncDirection>> getSyncDirection() {
        return this.syncDirection == null ? Input.empty() : this.syncDirection;
    }

    /**
     * The name of the sync group on which the sync member is hosted.
     * 
     */
    @InputImport(name="syncGroupName", required=true)
        private final Input<String> syncGroupName;

    public Input<String> getSyncGroupName() {
        return this.syncGroupName;
    }

    /**
     * ARM resource id of the sync member logical database, for sync members in Azure.
     * 
     */
    @InputImport(name="syncMemberAzureDatabaseResourceId")
        private final @Nullable Input<String> syncMemberAzureDatabaseResourceId;

    public Input<String> getSyncMemberAzureDatabaseResourceId() {
        return this.syncMemberAzureDatabaseResourceId == null ? Input.empty() : this.syncMemberAzureDatabaseResourceId;
    }

    /**
     * The name of the sync member.
     * 
     */
    @InputImport(name="syncMemberName")
        private final @Nullable Input<String> syncMemberName;

    public Input<String> getSyncMemberName() {
        return this.syncMemberName == null ? Input.empty() : this.syncMemberName;
    }

    /**
     * Whether to use private link connection.
     * 
     */
    @InputImport(name="usePrivateLinkConnection")
        private final @Nullable Input<Boolean> usePrivateLinkConnection;

    public Input<Boolean> getUsePrivateLinkConnection() {
        return this.usePrivateLinkConnection == null ? Input.empty() : this.usePrivateLinkConnection;
    }

    /**
     * User name of the member database in the sync member.
     * 
     */
    @InputImport(name="userName")
        private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public SyncMemberArgs(
        Input<String> databaseName,
        @Nullable Input<Either<String,SyncMemberDbType>> databaseType,
        @Nullable Input<String> password,
        Input<String> resourceGroupName,
        Input<String> serverName,
        @Nullable Input<String> sqlServerDatabaseId,
        @Nullable Input<String> syncAgentId,
        @Nullable Input<Either<String,SyncDirection>> syncDirection,
        Input<String> syncGroupName,
        @Nullable Input<String> syncMemberAzureDatabaseResourceId,
        @Nullable Input<String> syncMemberName,
        @Nullable Input<Boolean> usePrivateLinkConnection,
        @Nullable Input<String> userName) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.databaseType = databaseType;
        this.password = password;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.sqlServerDatabaseId = sqlServerDatabaseId;
        this.syncAgentId = syncAgentId;
        this.syncDirection = syncDirection;
        this.syncGroupName = Objects.requireNonNull(syncGroupName, "expected parameter 'syncGroupName' to be non-null");
        this.syncMemberAzureDatabaseResourceId = syncMemberAzureDatabaseResourceId;
        this.syncMemberName = syncMemberName;
        this.usePrivateLinkConnection = usePrivateLinkConnection;
        this.userName = userName;
    }

    private SyncMemberArgs() {
        this.databaseName = Input.empty();
        this.databaseType = Input.empty();
        this.password = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
        this.sqlServerDatabaseId = Input.empty();
        this.syncAgentId = Input.empty();
        this.syncDirection = Input.empty();
        this.syncGroupName = Input.empty();
        this.syncMemberAzureDatabaseResourceId = Input.empty();
        this.syncMemberName = Input.empty();
        this.usePrivateLinkConnection = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> databaseName;
        private @Nullable Input<Either<String,SyncMemberDbType>> databaseType;
        private @Nullable Input<String> password;
        private Input<String> resourceGroupName;
        private Input<String> serverName;
        private @Nullable Input<String> sqlServerDatabaseId;
        private @Nullable Input<String> syncAgentId;
        private @Nullable Input<Either<String,SyncDirection>> syncDirection;
        private Input<String> syncGroupName;
        private @Nullable Input<String> syncMemberAzureDatabaseResourceId;
        private @Nullable Input<String> syncMemberName;
        private @Nullable Input<Boolean> usePrivateLinkConnection;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.databaseType = defaults.databaseType;
    	      this.password = defaults.password;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.sqlServerDatabaseId = defaults.sqlServerDatabaseId;
    	      this.syncAgentId = defaults.syncAgentId;
    	      this.syncDirection = defaults.syncDirection;
    	      this.syncGroupName = defaults.syncGroupName;
    	      this.syncMemberAzureDatabaseResourceId = defaults.syncMemberAzureDatabaseResourceId;
    	      this.syncMemberName = defaults.syncMemberName;
    	      this.usePrivateLinkConnection = defaults.usePrivateLinkConnection;
    	      this.userName = defaults.userName;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setDatabaseType(@Nullable Input<Either<String,SyncMemberDbType>> databaseType) {
            this.databaseType = databaseType;
            return this;
        }

        public Builder setDatabaseType(@Nullable Either<String,SyncMemberDbType> databaseType) {
            this.databaseType = Input.ofNullable(databaseType);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
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

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setSqlServerDatabaseId(@Nullable Input<String> sqlServerDatabaseId) {
            this.sqlServerDatabaseId = sqlServerDatabaseId;
            return this;
        }

        public Builder setSqlServerDatabaseId(@Nullable String sqlServerDatabaseId) {
            this.sqlServerDatabaseId = Input.ofNullable(sqlServerDatabaseId);
            return this;
        }

        public Builder setSyncAgentId(@Nullable Input<String> syncAgentId) {
            this.syncAgentId = syncAgentId;
            return this;
        }

        public Builder setSyncAgentId(@Nullable String syncAgentId) {
            this.syncAgentId = Input.ofNullable(syncAgentId);
            return this;
        }

        public Builder setSyncDirection(@Nullable Input<Either<String,SyncDirection>> syncDirection) {
            this.syncDirection = syncDirection;
            return this;
        }

        public Builder setSyncDirection(@Nullable Either<String,SyncDirection> syncDirection) {
            this.syncDirection = Input.ofNullable(syncDirection);
            return this;
        }

        public Builder setSyncGroupName(Input<String> syncGroupName) {
            this.syncGroupName = Objects.requireNonNull(syncGroupName);
            return this;
        }

        public Builder setSyncGroupName(String syncGroupName) {
            this.syncGroupName = Input.of(Objects.requireNonNull(syncGroupName));
            return this;
        }

        public Builder setSyncMemberAzureDatabaseResourceId(@Nullable Input<String> syncMemberAzureDatabaseResourceId) {
            this.syncMemberAzureDatabaseResourceId = syncMemberAzureDatabaseResourceId;
            return this;
        }

        public Builder setSyncMemberAzureDatabaseResourceId(@Nullable String syncMemberAzureDatabaseResourceId) {
            this.syncMemberAzureDatabaseResourceId = Input.ofNullable(syncMemberAzureDatabaseResourceId);
            return this;
        }

        public Builder setSyncMemberName(@Nullable Input<String> syncMemberName) {
            this.syncMemberName = syncMemberName;
            return this;
        }

        public Builder setSyncMemberName(@Nullable String syncMemberName) {
            this.syncMemberName = Input.ofNullable(syncMemberName);
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

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public SyncMemberArgs build() {
            return new SyncMemberArgs(databaseName, databaseType, password, resourceGroupName, serverName, sqlServerDatabaseId, syncAgentId, syncDirection, syncGroupName, syncMemberAzureDatabaseResourceId, syncMemberName, usePrivateLinkConnection, userName);
        }
    }
}
