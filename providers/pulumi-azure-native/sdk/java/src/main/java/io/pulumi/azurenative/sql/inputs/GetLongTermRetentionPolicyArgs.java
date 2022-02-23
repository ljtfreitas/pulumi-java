// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLongTermRetentionPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLongTermRetentionPolicyArgs Empty = new GetLongTermRetentionPolicyArgs();

    /**
     * The name of the database.
     * 
     */
    @InputImport(name="databaseName", required=true)
        private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The policy name. Should always be Default.
     * 
     */
    @InputImport(name="policyName", required=true)
        private final String policyName;

    public String getPolicyName() {
        return this.policyName;
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

    public GetLongTermRetentionPolicyArgs(
        String databaseName,
        String policyName,
        String resourceGroupName,
        String serverName) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetLongTermRetentionPolicyArgs() {
        this.databaseName = null;
        this.policyName = null;
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLongTermRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private String policyName;
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLongTermRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.policyName = defaults.policyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setPolicyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
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
        public GetLongTermRetentionPolicyArgs build() {
            return new GetLongTermRetentionPolicyArgs(databaseName, policyName, resourceGroupName, serverName);
        }
    }
}
