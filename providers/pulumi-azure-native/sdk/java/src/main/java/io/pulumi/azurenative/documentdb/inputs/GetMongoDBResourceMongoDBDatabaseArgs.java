// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMongoDBResourceMongoDBDatabaseArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMongoDBResourceMongoDBDatabaseArgs Empty = new GetMongoDBResourceMongoDBDatabaseArgs();

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

    public GetMongoDBResourceMongoDBDatabaseArgs(
        String accountName,
        String databaseName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetMongoDBResourceMongoDBDatabaseArgs() {
        this.accountName = null;
        this.databaseName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMongoDBResourceMongoDBDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String databaseName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMongoDBResourceMongoDBDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
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

        public GetMongoDBResourceMongoDBDatabaseArgs build() {
            return new GetMongoDBResourceMongoDBDatabaseArgs(accountName, databaseName, resourceGroupName);
        }
    }
}
