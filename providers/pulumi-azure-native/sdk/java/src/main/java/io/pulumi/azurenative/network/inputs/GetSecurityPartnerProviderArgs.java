// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSecurityPartnerProviderArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecurityPartnerProviderArgs Empty = new GetSecurityPartnerProviderArgs();

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Security Partner Provider.
     * 
     */
    @InputImport(name="securityPartnerProviderName", required=true)
        private final String securityPartnerProviderName;

    public String getSecurityPartnerProviderName() {
        return this.securityPartnerProviderName;
    }

    public GetSecurityPartnerProviderArgs(
        String resourceGroupName,
        String securityPartnerProviderName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securityPartnerProviderName = Objects.requireNonNull(securityPartnerProviderName, "expected parameter 'securityPartnerProviderName' to be non-null");
    }

    private GetSecurityPartnerProviderArgs() {
        this.resourceGroupName = null;
        this.securityPartnerProviderName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityPartnerProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String securityPartnerProviderName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityPartnerProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securityPartnerProviderName = defaults.securityPartnerProviderName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSecurityPartnerProviderName(String securityPartnerProviderName) {
            this.securityPartnerProviderName = Objects.requireNonNull(securityPartnerProviderName);
            return this;
        }
        public GetSecurityPartnerProviderArgs build() {
            return new GetSecurityPartnerProviderArgs(resourceGroupName, securityPartnerProviderName);
        }
    }
}
