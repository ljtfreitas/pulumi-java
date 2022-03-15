// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.ProxyServerPropertiesResponse;
import io.pulumi.azurenative.security.outputs.ServicePrincipalPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HybridComputeSettingsPropertiesResponse {
    /**
     * Whether or not to automatically install Azure Arc (hybrid compute) agents on machines
     * 
     */
    private final String autoProvision;
    /**
     * State of the service principal and its secret
     * 
     */
    private final String hybridComputeProvisioningState;
    /**
     * For a non-Azure machine that is not connected directly to the internet, specify a proxy server that the non-Azure machine can use.
     * 
     */
    private final @Nullable ProxyServerPropertiesResponse proxyServer;
    /**
     * The location where the metadata of machines will be stored
     * 
     */
    private final @Nullable String region;
    /**
     * The name of the resource group where Arc (Hybrid Compute) connectors are connected.
     * 
     */
    private final @Nullable String resourceGroupName;
    /**
     * An object to access resources that are secured by an Azure AD tenant.
     * 
     */
    private final @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

    @CustomType.Constructor
    private HybridComputeSettingsPropertiesResponse(
        @CustomType.Parameter("autoProvision") String autoProvision,
        @CustomType.Parameter("hybridComputeProvisioningState") String hybridComputeProvisioningState,
        @CustomType.Parameter("proxyServer") @Nullable ProxyServerPropertiesResponse proxyServer,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("resourceGroupName") @Nullable String resourceGroupName,
        @CustomType.Parameter("servicePrincipal") @Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
        this.autoProvision = autoProvision;
        this.hybridComputeProvisioningState = hybridComputeProvisioningState;
        this.proxyServer = proxyServer;
        this.region = region;
        this.resourceGroupName = resourceGroupName;
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * Whether or not to automatically install Azure Arc (hybrid compute) agents on machines
     * 
    */
    public String getAutoProvision() {
        return this.autoProvision;
    }
    /**
     * State of the service principal and its secret
     * 
    */
    public String getHybridComputeProvisioningState() {
        return this.hybridComputeProvisioningState;
    }
    /**
     * For a non-Azure machine that is not connected directly to the internet, specify a proxy server that the non-Azure machine can use.
     * 
    */
    public Optional<ProxyServerPropertiesResponse> getProxyServer() {
        return Optional.ofNullable(this.proxyServer);
    }
    /**
     * The location where the metadata of machines will be stored
     * 
    */
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    /**
     * The name of the resource group where Arc (Hybrid Compute) connectors are connected.
     * 
    */
    public Optional<String> getResourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * An object to access resources that are secured by an Azure AD tenant.
     * 
    */
    public Optional<ServicePrincipalPropertiesResponse> getServicePrincipal() {
        return Optional.ofNullable(this.servicePrincipal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridComputeSettingsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoProvision;
        private String hybridComputeProvisioningState;
        private @Nullable ProxyServerPropertiesResponse proxyServer;
        private @Nullable String region;
        private @Nullable String resourceGroupName;
        private @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridComputeSettingsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoProvision = defaults.autoProvision;
    	      this.hybridComputeProvisioningState = defaults.hybridComputeProvisioningState;
    	      this.proxyServer = defaults.proxyServer;
    	      this.region = defaults.region;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.servicePrincipal = defaults.servicePrincipal;
        }

        public Builder autoProvision(String autoProvision) {
            this.autoProvision = Objects.requireNonNull(autoProvision);
            return this;
        }

        public Builder hybridComputeProvisioningState(String hybridComputeProvisioningState) {
            this.hybridComputeProvisioningState = Objects.requireNonNull(hybridComputeProvisioningState);
            return this;
        }

        public Builder proxyServer(@Nullable ProxyServerPropertiesResponse proxyServer) {
            this.proxyServer = proxyServer;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder servicePrincipal(@Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }
        public HybridComputeSettingsPropertiesResponse build() {
            return new HybridComputeSettingsPropertiesResponse(autoProvision, hybridComputeProvisioningState, proxyServer, region, resourceGroupName, servicePrincipal);
        }
    }
}
