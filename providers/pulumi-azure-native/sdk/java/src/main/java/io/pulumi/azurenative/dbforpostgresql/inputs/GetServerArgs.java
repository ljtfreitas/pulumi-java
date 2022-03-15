// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServerArgs Empty = new GetServerArgs();

    /**
     * The name of the resource group. The name is case insensitive.
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

    public GetServerArgs(
        String resourceGroupName,
        String serverName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetServerArgs() {
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public GetServerArgs build() {
            return new GetServerArgs(resourceGroupName, serverName);
        }
    }
}
