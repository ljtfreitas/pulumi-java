// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSqlResourceSqlTriggerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSqlResourceSqlTriggerArgs Empty = new GetSqlResourceSqlTriggerArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB container name.
     * 
     */
    @InputImport(name="containerName", required=true)
    private final String containerName;

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Cosmos DB database name.
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Cosmos DB trigger name.
     * 
     */
    @InputImport(name="triggerName", required=true)
    private final String triggerName;

    public String getTriggerName() {
        return this.triggerName;
    }

    public GetSqlResourceSqlTriggerArgs(
        String accountName,
        String containerName,
        String databaseName,
        String resourceGroupName,
        String triggerName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.triggerName = Objects.requireNonNull(triggerName, "expected parameter 'triggerName' to be non-null");
    }

    private GetSqlResourceSqlTriggerArgs() {
        this.accountName = null;
        this.containerName = null;
        this.databaseName = null;
        this.resourceGroupName = null;
        this.triggerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlResourceSqlTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String containerName;
        private String databaseName;
        private String resourceGroupName;
        private String triggerName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlResourceSqlTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.containerName = defaults.containerName;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.triggerName = defaults.triggerName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTriggerName(String triggerName) {
            this.triggerName = Objects.requireNonNull(triggerName);
            return this;
        }

        public GetSqlResourceSqlTriggerArgs build() {
            return new GetSqlResourceSqlTriggerArgs(accountName, containerName, databaseName, resourceGroupName, triggerName);
        }
    }
}
