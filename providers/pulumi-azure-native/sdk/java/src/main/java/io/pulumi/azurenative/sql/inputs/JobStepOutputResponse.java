// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The output configuration of a job step.
 * 
 */
public final class JobStepOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobStepOutputResponse Empty = new JobStepOutputResponse();

    /**
     * The resource ID of the credential to use to connect to the output destination.
     * 
     */
    @InputImport(name="credential", required=true)
    private final String credential;

    public String getCredential() {
        return this.credential;
    }

    /**
     * The output destination database.
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The output destination resource group.
     * 
     */
    @InputImport(name="resourceGroupName")
    private final @Nullable String resourceGroupName;

    public Optional<String> getResourceGroupName() {
        return this.resourceGroupName == null ? Optional.empty() : Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The output destination schema.
     * 
     */
    @InputImport(name="schemaName")
    private final @Nullable String schemaName;

    public Optional<String> getSchemaName() {
        return this.schemaName == null ? Optional.empty() : Optional.ofNullable(this.schemaName);
    }

    /**
     * The output destination server name.
     * 
     */
    @InputImport(name="serverName", required=true)
    private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    /**
     * The output destination subscription id.
     * 
     */
    @InputImport(name="subscriptionId")
    private final @Nullable String subscriptionId;

    public Optional<String> getSubscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The output destination table.
     * 
     */
    @InputImport(name="tableName", required=true)
    private final String tableName;

    public String getTableName() {
        return this.tableName;
    }

    /**
     * The output destination type.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public JobStepOutputResponse(
        String credential,
        String databaseName,
        @Nullable String resourceGroupName,
        @Nullable String schemaName,
        String serverName,
        @Nullable String subscriptionId,
        String tableName,
        @Nullable String type) {
        this.credential = Objects.requireNonNull(credential, "expected parameter 'credential' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = resourceGroupName;
        this.schemaName = schemaName == null ? "dbo" : schemaName;
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.subscriptionId = subscriptionId;
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.type = type == null ? "SqlDatabase" : type;
    }

    private JobStepOutputResponse() {
        this.credential = null;
        this.databaseName = null;
        this.resourceGroupName = null;
        this.schemaName = null;
        this.serverName = null;
        this.subscriptionId = null;
        this.tableName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStepOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String credential;
        private String databaseName;
        private @Nullable String resourceGroupName;
        private @Nullable String schemaName;
        private String serverName;
        private @Nullable String subscriptionId;
        private String tableName;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStepOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaName = defaults.schemaName;
    	      this.serverName = defaults.serverName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder setCredential(String credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setResourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder setSchemaName(@Nullable String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public JobStepOutputResponse build() {
            return new JobStepOutputResponse(credential, databaseName, resourceGroupName, schemaName, serverName, subscriptionId, tableName, type);
        }
    }
}
