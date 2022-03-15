// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecurityConnectorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecurityConnectorArgs Empty = new GetSecurityConnectorArgs();

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The security connector name.
     * 
     */
    @Import(name="securityConnectorName", required=true)
      private final String securityConnectorName;

    public String getSecurityConnectorName() {
        return this.securityConnectorName;
    }

    public GetSecurityConnectorArgs(
        String resourceGroupName,
        String securityConnectorName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securityConnectorName = Objects.requireNonNull(securityConnectorName, "expected parameter 'securityConnectorName' to be non-null");
    }

    private GetSecurityConnectorArgs() {
        this.resourceGroupName = null;
        this.securityConnectorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String securityConnectorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securityConnectorName = defaults.securityConnectorName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder securityConnectorName(String securityConnectorName) {
            this.securityConnectorName = Objects.requireNonNull(securityConnectorName);
            return this;
        }
        public GetSecurityConnectorArgs build() {
            return new GetSecurityConnectorArgs(resourceGroupName, securityConnectorName);
        }
    }
}
