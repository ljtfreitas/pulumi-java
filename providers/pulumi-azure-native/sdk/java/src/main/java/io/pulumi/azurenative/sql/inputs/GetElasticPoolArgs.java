// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetElasticPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetElasticPoolArgs Empty = new GetElasticPoolArgs();

    /**
     * The name of the elastic pool.
     * 
     */
    @Import(name="elasticPoolName", required=true)
      private final String elasticPoolName;

    public String getElasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    public GetElasticPoolArgs(
        String elasticPoolName,
        String resourceGroupName,
        String serverName) {
        this.elasticPoolName = Objects.requireNonNull(elasticPoolName, "expected parameter 'elasticPoolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetElasticPoolArgs() {
        this.elasticPoolName = null;
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String elasticPoolName;
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetElasticPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elasticPoolName = defaults.elasticPoolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder elasticPoolName(String elasticPoolName) {
            this.elasticPoolName = Objects.requireNonNull(elasticPoolName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public GetElasticPoolArgs build() {
            return new GetElasticPoolArgs(elasticPoolName, resourceGroupName, serverName);
        }
    }
}
