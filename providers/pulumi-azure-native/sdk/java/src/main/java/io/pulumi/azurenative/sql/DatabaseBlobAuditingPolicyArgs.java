// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.BlobAuditingPolicyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="auditActionsAndGroups")
      private final @Nullable Output<List<String>> auditActionsAndGroups;

    public Output<List<String>> getAuditActionsAndGroups() {
        return this.auditActionsAndGroups == null ? Output.empty() : this.auditActionsAndGroups;
    }

    /**
     * The name of the blob auditing policy.
     * 
     */
    @Import(name="blobAuditingPolicyName")
      private final @Nullable Output<String> blobAuditingPolicyName;

    public Output<String> getBlobAuditingPolicyName() {
        return this.blobAuditingPolicyName == null ? Output.empty() : this.blobAuditingPolicyName;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
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
    @Import(name="isAzureMonitorTargetEnabled")
      private final @Nullable Output<Boolean> isAzureMonitorTargetEnabled;

    public Output<Boolean> getIsAzureMonitorTargetEnabled() {
        return this.isAzureMonitorTargetEnabled == null ? Output.empty() : this.isAzureMonitorTargetEnabled;
    }

    /**
     * Specifies whether storageAccountAccessKey value is the storage's secondary key.
     * 
     */
    @Import(name="isStorageSecondaryKeyInUse")
      private final @Nullable Output<Boolean> isStorageSecondaryKeyInUse;

    public Output<Boolean> getIsStorageSecondaryKeyInUse() {
        return this.isStorageSecondaryKeyInUse == null ? Output.empty() : this.isStorageSecondaryKeyInUse;
    }

    /**
     * Specifies the amount of time in milliseconds that can elapse before audit actions are forced to be processed.
     * The default minimum value is 1000 (1 second). The maximum is 2,147,483,647.
     * 
     */
    @Import(name="queueDelayMs")
      private final @Nullable Output<Integer> queueDelayMs;

    public Output<Integer> getQueueDelayMs() {
        return this.queueDelayMs == null ? Output.empty() : this.queueDelayMs;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the number of days to keep in the audit logs in the storage account.
     * 
     */
    @Import(name="retentionDays")
      private final @Nullable Output<Integer> retentionDays;

    public Output<Integer> getRetentionDays() {
        return this.retentionDays == null ? Output.empty() : this.retentionDays;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    /**
     * Specifies the state of the audit. If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled are required.
     * 
     */
    @Import(name="state", required=true)
      private final Output<BlobAuditingPolicyState> state;

    public Output<BlobAuditingPolicyState> getState() {
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
    @Import(name="storageAccountAccessKey")
      private final @Nullable Output<String> storageAccountAccessKey;

    public Output<String> getStorageAccountAccessKey() {
        return this.storageAccountAccessKey == null ? Output.empty() : this.storageAccountAccessKey;
    }

    /**
     * Specifies the blob storage subscription Id.
     * 
     */
    @Import(name="storageAccountSubscriptionId")
      private final @Nullable Output<String> storageAccountSubscriptionId;

    public Output<String> getStorageAccountSubscriptionId() {
        return this.storageAccountSubscriptionId == null ? Output.empty() : this.storageAccountSubscriptionId;
    }

    /**
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is required.
     * 
     */
    @Import(name="storageEndpoint")
      private final @Nullable Output<String> storageEndpoint;

    public Output<String> getStorageEndpoint() {
        return this.storageEndpoint == null ? Output.empty() : this.storageEndpoint;
    }

    public DatabaseBlobAuditingPolicyArgs(
        @Nullable Output<List<String>> auditActionsAndGroups,
        @Nullable Output<String> blobAuditingPolicyName,
        Output<String> databaseName,
        @Nullable Output<Boolean> isAzureMonitorTargetEnabled,
        @Nullable Output<Boolean> isStorageSecondaryKeyInUse,
        @Nullable Output<Integer> queueDelayMs,
        Output<String> resourceGroupName,
        @Nullable Output<Integer> retentionDays,
        Output<String> serverName,
        Output<BlobAuditingPolicyState> state,
        @Nullable Output<String> storageAccountAccessKey,
        @Nullable Output<String> storageAccountSubscriptionId,
        @Nullable Output<String> storageEndpoint) {
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
        this.auditActionsAndGroups = Output.empty();
        this.blobAuditingPolicyName = Output.empty();
        this.databaseName = Output.empty();
        this.isAzureMonitorTargetEnabled = Output.empty();
        this.isStorageSecondaryKeyInUse = Output.empty();
        this.queueDelayMs = Output.empty();
        this.resourceGroupName = Output.empty();
        this.retentionDays = Output.empty();
        this.serverName = Output.empty();
        this.state = Output.empty();
        this.storageAccountAccessKey = Output.empty();
        this.storageAccountSubscriptionId = Output.empty();
        this.storageEndpoint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseBlobAuditingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> auditActionsAndGroups;
        private @Nullable Output<String> blobAuditingPolicyName;
        private Output<String> databaseName;
        private @Nullable Output<Boolean> isAzureMonitorTargetEnabled;
        private @Nullable Output<Boolean> isStorageSecondaryKeyInUse;
        private @Nullable Output<Integer> queueDelayMs;
        private Output<String> resourceGroupName;
        private @Nullable Output<Integer> retentionDays;
        private Output<String> serverName;
        private Output<BlobAuditingPolicyState> state;
        private @Nullable Output<String> storageAccountAccessKey;
        private @Nullable Output<String> storageAccountSubscriptionId;
        private @Nullable Output<String> storageEndpoint;

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

        public Builder auditActionsAndGroups(@Nullable Output<List<String>> auditActionsAndGroups) {
            this.auditActionsAndGroups = auditActionsAndGroups;
            return this;
        }

        public Builder auditActionsAndGroups(@Nullable List<String> auditActionsAndGroups) {
            this.auditActionsAndGroups = Output.ofNullable(auditActionsAndGroups);
            return this;
        }

        public Builder blobAuditingPolicyName(@Nullable Output<String> blobAuditingPolicyName) {
            this.blobAuditingPolicyName = blobAuditingPolicyName;
            return this;
        }

        public Builder blobAuditingPolicyName(@Nullable String blobAuditingPolicyName) {
            this.blobAuditingPolicyName = Output.ofNullable(blobAuditingPolicyName);
            return this;
        }

        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder isAzureMonitorTargetEnabled(@Nullable Output<Boolean> isAzureMonitorTargetEnabled) {
            this.isAzureMonitorTargetEnabled = isAzureMonitorTargetEnabled;
            return this;
        }

        public Builder isAzureMonitorTargetEnabled(@Nullable Boolean isAzureMonitorTargetEnabled) {
            this.isAzureMonitorTargetEnabled = Output.ofNullable(isAzureMonitorTargetEnabled);
            return this;
        }

        public Builder isStorageSecondaryKeyInUse(@Nullable Output<Boolean> isStorageSecondaryKeyInUse) {
            this.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
            return this;
        }

        public Builder isStorageSecondaryKeyInUse(@Nullable Boolean isStorageSecondaryKeyInUse) {
            this.isStorageSecondaryKeyInUse = Output.ofNullable(isStorageSecondaryKeyInUse);
            return this;
        }

        public Builder queueDelayMs(@Nullable Output<Integer> queueDelayMs) {
            this.queueDelayMs = queueDelayMs;
            return this;
        }

        public Builder queueDelayMs(@Nullable Integer queueDelayMs) {
            this.queueDelayMs = Output.ofNullable(queueDelayMs);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Output.ofNullable(retentionDays);
            return this;
        }

        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder state(Output<BlobAuditingPolicyState> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder state(BlobAuditingPolicyState state) {
            this.state = Output.of(Objects.requireNonNull(state));
            return this;
        }

        public Builder storageAccountAccessKey(@Nullable Output<String> storageAccountAccessKey) {
            this.storageAccountAccessKey = storageAccountAccessKey;
            return this;
        }

        public Builder storageAccountAccessKey(@Nullable String storageAccountAccessKey) {
            this.storageAccountAccessKey = Output.ofNullable(storageAccountAccessKey);
            return this;
        }

        public Builder storageAccountSubscriptionId(@Nullable Output<String> storageAccountSubscriptionId) {
            this.storageAccountSubscriptionId = storageAccountSubscriptionId;
            return this;
        }

        public Builder storageAccountSubscriptionId(@Nullable String storageAccountSubscriptionId) {
            this.storageAccountSubscriptionId = Output.ofNullable(storageAccountSubscriptionId);
            return this;
        }

        public Builder storageEndpoint(@Nullable Output<String> storageEndpoint) {
            this.storageEndpoint = storageEndpoint;
            return this;
        }

        public Builder storageEndpoint(@Nullable String storageEndpoint) {
            this.storageEndpoint = Output.ofNullable(storageEndpoint);
            return this;
        }
        public DatabaseBlobAuditingPolicyArgs build() {
            return new DatabaseBlobAuditingPolicyArgs(auditActionsAndGroups, blobAuditingPolicyName, databaseName, isAzureMonitorTargetEnabled, isStorageSecondaryKeyInUse, queueDelayMs, resourceGroupName, retentionDays, serverName, state, storageAccountAccessKey, storageAccountSubscriptionId, storageEndpoint);
        }
    }
}
