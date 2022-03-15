// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExtendedServerBlobAuditingPolicyResult {
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
    private final @Nullable List<String> auditActionsAndGroups;
    /**
     * Resource ID.
     * 
     */
    private final String id;
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
    private final @Nullable Boolean isAzureMonitorTargetEnabled;
    /**
     * Specifies the state of devops audit. If state is Enabled, devops logs will be sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify 'State' as 'Enabled', 'IsAzureMonitorTargetEnabled' as true and 'IsDevopsAuditEnabled' as true
     * 
     * When using REST API to configure auditing, Diagnostic Settings with 'DevOpsOperationsAudit' diagnostic logs category on the master database should also be created.
     * 
     * Diagnostic Settings URI format:
     * PUT https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/master/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     * 
     * For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     * or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043)
     * 
     */
    private final @Nullable Boolean isDevopsAuditEnabled;
    /**
     * Specifies whether storageAccountAccessKey value is the storage's secondary key.
     * 
     */
    private final @Nullable Boolean isStorageSecondaryKeyInUse;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Specifies condition of where clause when creating an audit.
     * 
     */
    private final @Nullable String predicateExpression;
    /**
     * Specifies the amount of time in milliseconds that can elapse before audit actions are forced to be processed.
     * The default minimum value is 1000 (1 second). The maximum is 2,147,483,647.
     * 
     */
    private final @Nullable Integer queueDelayMs;
    /**
     * Specifies the number of days to keep in the audit logs in the storage account.
     * 
     */
    private final @Nullable Integer retentionDays;
    /**
     * Specifies the state of the audit. If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled are required.
     * 
     */
    private final String state;
    /**
     * Specifies the blob storage subscription Id.
     * 
     */
    private final @Nullable String storageAccountSubscriptionId;
    /**
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is required.
     * 
     */
    private final @Nullable String storageEndpoint;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetExtendedServerBlobAuditingPolicyResult(
        @CustomType.Parameter("auditActionsAndGroups") @Nullable List<String> auditActionsAndGroups,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isAzureMonitorTargetEnabled") @Nullable Boolean isAzureMonitorTargetEnabled,
        @CustomType.Parameter("isDevopsAuditEnabled") @Nullable Boolean isDevopsAuditEnabled,
        @CustomType.Parameter("isStorageSecondaryKeyInUse") @Nullable Boolean isStorageSecondaryKeyInUse,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("predicateExpression") @Nullable String predicateExpression,
        @CustomType.Parameter("queueDelayMs") @Nullable Integer queueDelayMs,
        @CustomType.Parameter("retentionDays") @Nullable Integer retentionDays,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("storageAccountSubscriptionId") @Nullable String storageAccountSubscriptionId,
        @CustomType.Parameter("storageEndpoint") @Nullable String storageEndpoint,
        @CustomType.Parameter("type") String type) {
        this.auditActionsAndGroups = auditActionsAndGroups;
        this.id = id;
        this.isAzureMonitorTargetEnabled = isAzureMonitorTargetEnabled;
        this.isDevopsAuditEnabled = isDevopsAuditEnabled;
        this.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
        this.name = name;
        this.predicateExpression = predicateExpression;
        this.queueDelayMs = queueDelayMs;
        this.retentionDays = retentionDays;
        this.state = state;
        this.storageAccountSubscriptionId = storageAccountSubscriptionId;
        this.storageEndpoint = storageEndpoint;
        this.type = type;
    }

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
    public List<String> getAuditActionsAndGroups() {
        return this.auditActionsAndGroups == null ? List.of() : this.auditActionsAndGroups;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
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
    public Optional<Boolean> getIsAzureMonitorTargetEnabled() {
        return Optional.ofNullable(this.isAzureMonitorTargetEnabled);
    }
    /**
     * Specifies the state of devops audit. If state is Enabled, devops logs will be sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify 'State' as 'Enabled', 'IsAzureMonitorTargetEnabled' as true and 'IsDevopsAuditEnabled' as true
     * 
     * When using REST API to configure auditing, Diagnostic Settings with 'DevOpsOperationsAudit' diagnostic logs category on the master database should also be created.
     * 
     * Diagnostic Settings URI format:
     * PUT https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/master/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     * 
     * For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     * or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043)
     * 
    */
    public Optional<Boolean> getIsDevopsAuditEnabled() {
        return Optional.ofNullable(this.isDevopsAuditEnabled);
    }
    /**
     * Specifies whether storageAccountAccessKey value is the storage's secondary key.
     * 
    */
    public Optional<Boolean> getIsStorageSecondaryKeyInUse() {
        return Optional.ofNullable(this.isStorageSecondaryKeyInUse);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies condition of where clause when creating an audit.
     * 
    */
    public Optional<String> getPredicateExpression() {
        return Optional.ofNullable(this.predicateExpression);
    }
    /**
     * Specifies the amount of time in milliseconds that can elapse before audit actions are forced to be processed.
     * The default minimum value is 1000 (1 second). The maximum is 2,147,483,647.
     * 
    */
    public Optional<Integer> getQueueDelayMs() {
        return Optional.ofNullable(this.queueDelayMs);
    }
    /**
     * Specifies the number of days to keep in the audit logs in the storage account.
     * 
    */
    public Optional<Integer> getRetentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }
    /**
     * Specifies the state of the audit. If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled are required.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Specifies the blob storage subscription Id.
     * 
    */
    public Optional<String> getStorageAccountSubscriptionId() {
        return Optional.ofNullable(this.storageAccountSubscriptionId);
    }
    /**
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is required.
     * 
    */
    public Optional<String> getStorageEndpoint() {
        return Optional.ofNullable(this.storageEndpoint);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtendedServerBlobAuditingPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> auditActionsAndGroups;
        private String id;
        private @Nullable Boolean isAzureMonitorTargetEnabled;
        private @Nullable Boolean isDevopsAuditEnabled;
        private @Nullable Boolean isStorageSecondaryKeyInUse;
        private String name;
        private @Nullable String predicateExpression;
        private @Nullable Integer queueDelayMs;
        private @Nullable Integer retentionDays;
        private String state;
        private @Nullable String storageAccountSubscriptionId;
        private @Nullable String storageEndpoint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExtendedServerBlobAuditingPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditActionsAndGroups = defaults.auditActionsAndGroups;
    	      this.id = defaults.id;
    	      this.isAzureMonitorTargetEnabled = defaults.isAzureMonitorTargetEnabled;
    	      this.isDevopsAuditEnabled = defaults.isDevopsAuditEnabled;
    	      this.isStorageSecondaryKeyInUse = defaults.isStorageSecondaryKeyInUse;
    	      this.name = defaults.name;
    	      this.predicateExpression = defaults.predicateExpression;
    	      this.queueDelayMs = defaults.queueDelayMs;
    	      this.retentionDays = defaults.retentionDays;
    	      this.state = defaults.state;
    	      this.storageAccountSubscriptionId = defaults.storageAccountSubscriptionId;
    	      this.storageEndpoint = defaults.storageEndpoint;
    	      this.type = defaults.type;
        }

        public Builder auditActionsAndGroups(@Nullable List<String> auditActionsAndGroups) {
            this.auditActionsAndGroups = auditActionsAndGroups;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isAzureMonitorTargetEnabled(@Nullable Boolean isAzureMonitorTargetEnabled) {
            this.isAzureMonitorTargetEnabled = isAzureMonitorTargetEnabled;
            return this;
        }

        public Builder isDevopsAuditEnabled(@Nullable Boolean isDevopsAuditEnabled) {
            this.isDevopsAuditEnabled = isDevopsAuditEnabled;
            return this;
        }

        public Builder isStorageSecondaryKeyInUse(@Nullable Boolean isStorageSecondaryKeyInUse) {
            this.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder predicateExpression(@Nullable String predicateExpression) {
            this.predicateExpression = predicateExpression;
            return this;
        }

        public Builder queueDelayMs(@Nullable Integer queueDelayMs) {
            this.queueDelayMs = queueDelayMs;
            return this;
        }

        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder storageAccountSubscriptionId(@Nullable String storageAccountSubscriptionId) {
            this.storageAccountSubscriptionId = storageAccountSubscriptionId;
            return this;
        }

        public Builder storageEndpoint(@Nullable String storageEndpoint) {
            this.storageEndpoint = storageEndpoint;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetExtendedServerBlobAuditingPolicyResult build() {
            return new GetExtendedServerBlobAuditingPolicyResult(auditActionsAndGroups, id, isAzureMonitorTargetEnabled, isDevopsAuditEnabled, isStorageSecondaryKeyInUse, name, predicateExpression, queueDelayMs, retentionDays, state, storageAccountSubscriptionId, storageEndpoint, type);
        }
    }
}
