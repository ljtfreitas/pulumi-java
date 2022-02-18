// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTransparentDataEncryptionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTransparentDataEncryptionArgs Empty = new GetTransparentDataEncryptionArgs();

    /**
     * The name of the database for which the transparent data encryption applies.
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
    private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    /**
     * The name of the transparent data encryption configuration.
     * 
     */
    @InputImport(name="transparentDataEncryptionName", required=true)
    private final String transparentDataEncryptionName;

    public String getTransparentDataEncryptionName() {
        return this.transparentDataEncryptionName;
    }

    public GetTransparentDataEncryptionArgs(
        String databaseName,
        String resourceGroupName,
        String serverName,
        String transparentDataEncryptionName) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.transparentDataEncryptionName = Objects.requireNonNull(transparentDataEncryptionName, "expected parameter 'transparentDataEncryptionName' to be non-null");
    }

    private GetTransparentDataEncryptionArgs() {
        this.databaseName = null;
        this.resourceGroupName = null;
        this.serverName = null;
        this.transparentDataEncryptionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransparentDataEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private String resourceGroupName;
        private String serverName;
        private String transparentDataEncryptionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransparentDataEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.transparentDataEncryptionName = defaults.transparentDataEncryptionName;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setTransparentDataEncryptionName(String transparentDataEncryptionName) {
            this.transparentDataEncryptionName = Objects.requireNonNull(transparentDataEncryptionName);
            return this;
        }

        public GetTransparentDataEncryptionArgs build() {
            return new GetTransparentDataEncryptionArgs(databaseName, resourceGroupName, serverName, transparentDataEncryptionName);
        }
    }
}
