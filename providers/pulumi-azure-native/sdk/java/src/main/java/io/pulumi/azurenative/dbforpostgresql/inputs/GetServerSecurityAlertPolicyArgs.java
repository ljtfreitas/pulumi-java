// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServerSecurityAlertPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServerSecurityAlertPolicyArgs Empty = new GetServerSecurityAlertPolicyArgs();

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
     * The name of the security alert policy.
     * 
     */
    @InputImport(name="securityAlertPolicyName", required=true)
        private final String securityAlertPolicyName;

    public String getSecurityAlertPolicyName() {
        return this.securityAlertPolicyName;
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

    public GetServerSecurityAlertPolicyArgs(
        String resourceGroupName,
        String securityAlertPolicyName,
        String serverName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securityAlertPolicyName = Objects.requireNonNull(securityAlertPolicyName, "expected parameter 'securityAlertPolicyName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetServerSecurityAlertPolicyArgs() {
        this.resourceGroupName = null;
        this.securityAlertPolicyName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerSecurityAlertPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String securityAlertPolicyName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerSecurityAlertPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securityAlertPolicyName = defaults.securityAlertPolicyName;
    	      this.serverName = defaults.serverName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSecurityAlertPolicyName(String securityAlertPolicyName) {
            this.securityAlertPolicyName = Objects.requireNonNull(securityAlertPolicyName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public GetServerSecurityAlertPolicyArgs build() {
            return new GetServerSecurityAlertPolicyArgs(resourceGroupName, securityAlertPolicyName, serverName);
        }
    }
}
