// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.BlobAuditingPolicyState;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseBlobAuditingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseBlobAuditingPolicyArgs Empty = new DatabaseBlobAuditingPolicyArgs();

    /**
     * Specifies the Actions-Groups and Actions to audit.
     * 
     * The recommended set of action groups to use is the following combination - this will audit all the queries and stored procedures executed against the database, as well as successful and failed logins:
     * 
     * BATCH_COMPLETED_GROUP,
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
     * FAILED_DATABASE_AUTHENTICATION_GROUP.
     * 
     * This above combination is also the set that is configured by default when enabling auditing from the Azure portal.
     * 
     * The supported action groups to audit are (note: choose only specific groups that cover your auditing needs. Using unnecessary groups could lead to very large quantities of audit records):
     * 
     * APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
     * BACKUP_RESTORE_GROUP
     * DATABASE_LOGOUT_GROUP
     * DATABASE_OBJECT_CHANGE_GROUP
     * DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
     * DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
     * DATABASE_OPERATION_GROUP
     * DATABASE_PERMISSION_CHANGE_GROUP
     * DATABASE_PRINCIPAL_CHANGE_GROUP
     * DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     * DATABASE_ROLE_MEMBER_CHANGE_GROUP
     * FAILED_DATABASE_AUTHENTICATION_GROUP
     * SCHEMA_OBJECT_ACCESS_GROUP
     * SCHEMA_OBJECT_CHANGE_GROUP
     * SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
     * SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
     * USER_CHANGE_PASSWORD_GROUP
     * BATCH_STARTED_GROUP
     * BATCH_COMPLETED_GROUP
     * 
     * These are groups that cover all sql statements and stored procedures executed against the database, and should not be used in combination with other groups as this will result in duplicate audit logs.
     * 
     * For more information, see [Database-Level Audit Action Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     * 
     * For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified for Server auditing policy). The supported actions to audit are:
     * SELECT
     * UPDATE
     * INSERT
     * DELETE
     * EXECUTE
     * RECEIVE
     * REFERENCES
     * 
     * The general form for defining an action to be audited is:
     * {action} ON {object} BY {principal}
     * 
     * Note that <object> in the above format can refer to an object like a table, view, or stored procedure, or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and SCHEMA::{schema_name} are used, respectively.
     * 
     * For example:
     * SELECT on dbo.myTable by public
     * SELECT on DATABASE::myDatabase by public
     * SELECT on SCHEMA::mySchema by public
     * 
     * For more information, see [Database-Level Audit Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions)
     * 
     */
    @InputImport(name="auditActionsAndGroups")
        private final @Nullable Input<List<String>> auditActionsAndGroups;

    public Input<List<String>> getAuditActionsAndGroups() {
        return this.auditActionsAndGroups == null ? Input.empty() : this.auditActionsAndGroups;
    }

    /**
     * The name of the blob auditing policy.
     * 
     */
    @InputImport(name="blobAuditingPolicyName")
        private final @Nullable Input<String> blobAuditingPolicyName;

    public Input<String> getBlobAuditingPolicyName() {
        return this.blobAuditingPolicyName == null ? Input.empty() : this.blobAuditingPolicyName;
    }

    /**
     * The name of the database.
     * 
     */
    @InputImport(name="databaseName", required=true)
        private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Specifies whether audit events are sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify 'State' as 'Enabled' and 'IsAzureMonitorTargetEnabled' as true.
     * 
     * When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents' diagnostic logs category on the database should be also created.
     * Note that for server level audit you should use the 'master' database as {databaseName}.
     * 
     * Diagnostic Settings URI format:
     * PUT https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     * 
     * For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     * or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043)
     * 
     */
    @InputImport(name="isAzureMonitorTargetEnabled")
        private final @Nullable Input<Boolean> isAzureMonitorTargetEnabled;

    public Input<Boolean> getIsAzureMonitorTargetEnabled() {
        return this.isAzureMonitorTargetEnabled == null ? Input.empty() : this.isAzureMonitorTargetEnabled;
    }

    /**
     * Specifies whether storageAccountAccessKey value is the storage's secondary key.
     * 
     */
    @InputImport(name="isStorageSecondaryKeyInUse")
        private final @Nullable Input<Boolean> isStorageSecondaryKeyInUse;

    public Input<Boolean> getIsStorageSecondaryKeyInUse() {
        return this.isStorageSecondaryKeyInUse == null ? Input.empty() : this.isStorageSecondaryKeyInUse;
    }

    /**
     * Specifies the amount of time in milliseconds that can elapse before audit actions are forced to be processed.
     * The default minimum value is 1000 (1 second). The maximum is 2,147,483,647.
     * 
     */
    @InputImport(name="queueDelayMs")
        private final @Nullable Input<Integer> queueDelayMs;

    public Input<Integer> getQueueDelayMs() {
        return this.queueDelayMs == null ? Input.empty() : this.queueDelayMs;
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
     * Specifies the number of days to keep in the audit logs in the storage account.
     * 
     */
    @InputImport(name="retentionDays")
        private final @Nullable Input<Integer> retentionDays;

    public Input<Integer> getRetentionDays() {
        return this.retentionDays == null ? Input.empty() : this.retentionDays;
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
     * Specifies the state of the audit. If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled are required.
     * 
     */
    @InputImport(name="state", required=true)
        private final Input<BlobAuditingPolicyState> state;

    public Input<BlobAuditingPolicyState> getState() {
        return this.state;
    }

    /**
     * Specifies the identifier key of the auditing storage account.
     * If state is Enabled and storageEndpoint is specified, not specifying the storageAccountAccessKey will use SQL server system-assigned managed identity to access the storage.
     * Prerequisites for using managed identity authentication:
     * 1. Assign SQL Server a system-assigned managed identity in Azure Active Directory (AAD).
     * 2. Grant SQL Server identity access to the storage account by adding 'Storage Blob Data Contributor' RBAC role to the server identity.
     *    For more information, see [Auditing to storage using Managed Identity authentication](https://go.microsoft.com/fwlink/?linkid=2114355)
     * 
     */
    @InputImport(name="storageAccountAccessKey")
        private final @Nullable Input<String> storageAccountAccessKey;

    public Input<String> getStorageAccountAccessKey() {
        return this.storageAccountAccessKey == null ? Input.empty() : this.storageAccountAccessKey;
    }

    /**
     * Specifies the blob storage subscription Id.
     * 
     */
    @InputImport(name="storageAccountSubscriptionId")
        private final @Nullable Input<String> storageAccountSubscriptionId;

    public Input<String> getStorageAccountSubscriptionId() {
        return this.storageAccountSubscriptionId == null ? Input.empty() : this.storageAccountSubscriptionId;
    }

    /**
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is required.
     * 
     */
    @InputImport(name="storageEndpoint")
        private final @Nullable Input<String> storageEndpoint;

    public Input<String> getStorageEndpoint() {
        return this.storageEndpoint == null ? Input.empty() : this.storageEndpoint;
    }

    public DatabaseBlobAuditingPolicyArgs(
        @Nullable Input<List<String>> auditActionsAndGroups,
        @Nullable Input<String> blobAuditingPolicyName,
        Input<String> databaseName,
        @Nullable Input<Boolean> isAzureMonitorTargetEnabled,
        @Nullable Input<Boolean> isStorageSecondaryKeyInUse,
        @Nullable Input<Integer> queueDelayMs,
        Input<String> resourceGroupName,
        @Nullable Input<Integer> retentionDays,
        Input<String> serverName,
        Input<BlobAuditingPolicyState> state,
        @Nullable Input<String> storageAccountAccessKey,
        @Nullable Input<String> storageAccountSubscriptionId,
        @Nullable Input<String> storageEndpoint) {
        this.auditActionsAndGroups = auditActionsAndGroups;
        this.blobAuditingPolicyName = blobAuditingPolicyName;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.isAzureMonitorTargetEnabled = isAzureMonitorTargetEnabled;
        this.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
        this.queueDelayMs = queueDelayMs;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.retentionDays = retentionDays;
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.storageAccountAccessKey = storageAccountAccessKey;
        this.storageAccountSubscriptionId = storageAccountSubscriptionId;
        this.storageEndpoint = storageEndpoint;
    }

    private DatabaseBlobAuditingPolicyArgs() {
        this.auditActionsAndGroups = Input.empty();
        this.blobAuditingPolicyName = Input.empty();
        this.databaseName = Input.empty();
        this.isAzureMonitorTargetEnabled = Input.empty();
        this.isStorageSecondaryKeyInUse = Input.empty();
        this.queueDelayMs = Input.empty();
        this.resourceGroupName = Input.empty();
        this.retentionDays = Input.empty();
        this.serverName = Input.empty();
        this.state = Input.empty();
        this.storageAccountAccessKey = Input.empty();
        this.storageAccountSubscriptionId = Input.empty();
        this.storageEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseBlobAuditingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> auditActionsAndGroups;
        private @Nullable Input<String> blobAuditingPolicyName;
        private Input<String> databaseName;
        private @Nullable Input<Boolean> isAzureMonitorTargetEnabled;
        private @Nullable Input<Boolean> isStorageSecondaryKeyInUse;
        private @Nullable Input<Integer> queueDelayMs;
        private Input<String> resourceGroupName;
        private @Nullable Input<Integer> retentionDays;
        private Input<String> serverName;
        private Input<BlobAuditingPolicyState> state;
        private @Nullable Input<String> storageAccountAccessKey;
        private @Nullable Input<String> storageAccountSubscriptionId;
        private @Nullable Input<String> storageEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseBlobAuditingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditActionsAndGroups = defaults.auditActionsAndGroups;
    	      this.blobAuditingPolicyName = defaults.blobAuditingPolicyName;
    	      this.databaseName = defaults.databaseName;
    	      this.isAzureMonitorTargetEnabled = defaults.isAzureMonitorTargetEnabled;
    	      this.isStorageSecondaryKeyInUse = defaults.isStorageSecondaryKeyInUse;
    	      this.queueDelayMs = defaults.queueDelayMs;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retentionDays = defaults.retentionDays;
    	      this.serverName = defaults.serverName;
    	      this.state = defaults.state;
    	      this.storageAccountAccessKey = defaults.storageAccountAccessKey;
    	      this.storageAccountSubscriptionId = defaults.storageAccountSubscriptionId;
    	      this.storageEndpoint = defaults.storageEndpoint;
        }

        public Builder setAuditActionsAndGroups(@Nullable Input<List<String>> auditActionsAndGroups) {
            this.auditActionsAndGroups = auditActionsAndGroups;
            return this;
        }

        public Builder setAuditActionsAndGroups(@Nullable List<String> auditActionsAndGroups) {
            this.auditActionsAndGroups = Input.ofNullable(auditActionsAndGroups);
            return this;
        }

        public Builder setBlobAuditingPolicyName(@Nullable Input<String> blobAuditingPolicyName) {
            this.blobAuditingPolicyName = blobAuditingPolicyName;
            return this;
        }

        public Builder setBlobAuditingPolicyName(@Nullable String blobAuditingPolicyName) {
            this.blobAuditingPolicyName = Input.ofNullable(blobAuditingPolicyName);
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

        public Builder setIsAzureMonitorTargetEnabled(@Nullable Input<Boolean> isAzureMonitorTargetEnabled) {
            this.isAzureMonitorTargetEnabled = isAzureMonitorTargetEnabled;
            return this;
        }

        public Builder setIsAzureMonitorTargetEnabled(@Nullable Boolean isAzureMonitorTargetEnabled) {
            this.isAzureMonitorTargetEnabled = Input.ofNullable(isAzureMonitorTargetEnabled);
            return this;
        }

        public Builder setIsStorageSecondaryKeyInUse(@Nullable Input<Boolean> isStorageSecondaryKeyInUse) {
            this.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
            return this;
        }

        public Builder setIsStorageSecondaryKeyInUse(@Nullable Boolean isStorageSecondaryKeyInUse) {
            this.isStorageSecondaryKeyInUse = Input.ofNullable(isStorageSecondaryKeyInUse);
            return this;
        }

        public Builder setQueueDelayMs(@Nullable Input<Integer> queueDelayMs) {
            this.queueDelayMs = queueDelayMs;
            return this;
        }

        public Builder setQueueDelayMs(@Nullable Integer queueDelayMs) {
            this.queueDelayMs = Input.ofNullable(queueDelayMs);
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

        public Builder setRetentionDays(@Nullable Input<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder setRetentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Input.ofNullable(retentionDays);
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

        public Builder setState(Input<BlobAuditingPolicyState> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setState(BlobAuditingPolicyState state) {
            this.state = Input.of(Objects.requireNonNull(state));
            return this;
        }

        public Builder setStorageAccountAccessKey(@Nullable Input<String> storageAccountAccessKey) {
            this.storageAccountAccessKey = storageAccountAccessKey;
            return this;
        }

        public Builder setStorageAccountAccessKey(@Nullable String storageAccountAccessKey) {
            this.storageAccountAccessKey = Input.ofNullable(storageAccountAccessKey);
            return this;
        }

        public Builder setStorageAccountSubscriptionId(@Nullable Input<String> storageAccountSubscriptionId) {
            this.storageAccountSubscriptionId = storageAccountSubscriptionId;
            return this;
        }

        public Builder setStorageAccountSubscriptionId(@Nullable String storageAccountSubscriptionId) {
            this.storageAccountSubscriptionId = Input.ofNullable(storageAccountSubscriptionId);
            return this;
        }

        public Builder setStorageEndpoint(@Nullable Input<String> storageEndpoint) {
            this.storageEndpoint = storageEndpoint;
            return this;
        }

        public Builder setStorageEndpoint(@Nullable String storageEndpoint) {
            this.storageEndpoint = Input.ofNullable(storageEndpoint);
            return this;
        }
        public DatabaseBlobAuditingPolicyArgs build() {
            return new DatabaseBlobAuditingPolicyArgs(auditActionsAndGroups, blobAuditingPolicyName, databaseName, isAzureMonitorTargetEnabled, isStorageSecondaryKeyInUse, queueDelayMs, resourceGroupName, retentionDays, serverName, state, storageAccountAccessKey, storageAccountSubscriptionId, storageEndpoint);
        }
    }
}
