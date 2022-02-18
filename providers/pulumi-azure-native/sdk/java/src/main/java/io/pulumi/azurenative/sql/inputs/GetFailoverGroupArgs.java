// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFailoverGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFailoverGroupArgs Empty = new GetFailoverGroupArgs();

    /**
     * The name of the failover group.
     * 
     */
    @InputImport(name="failoverGroupName", required=true)
    private final String failoverGroupName;

    public String getFailoverGroupName() {
        return this.failoverGroupName;
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
     * The name of the server containing the failover group.
     * 
     */
    @InputImport(name="serverName", required=true)
    private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    public GetFailoverGroupArgs(
        String failoverGroupName,
        String resourceGroupName,
        String serverName) {
        this.failoverGroupName = Objects.requireNonNull(failoverGroupName, "expected parameter 'failoverGroupName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetFailoverGroupArgs() {
        this.failoverGroupName = null;
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFailoverGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String failoverGroupName;
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFailoverGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverGroupName = defaults.failoverGroupName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder setFailoverGroupName(String failoverGroupName) {
            this.failoverGroupName = Objects.requireNonNull(failoverGroupName);
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

        public GetFailoverGroupArgs build() {
            return new GetFailoverGroupArgs(failoverGroupName, resourceGroupName, serverName);
        }
    }
}
