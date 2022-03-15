// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HybridComputePrivateLinkScopePropertiesResponse {
    /**
     * The Guid id of the private link scope.
     * 
     */
    private final String privateLinkScopeId;
    /**
     * Current state of this PrivateLinkScope: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Provisioning ,Succeeded, Canceled and Failed.
     * 
     */
    private final String provisioningState;
    /**
     * Indicates whether machines associated with the private link scope can also use public Azure Arc service endpoints.
     * 
     */
    private final @Nullable String publicNetworkAccess;

    @CustomType.Constructor
    private HybridComputePrivateLinkScopePropertiesResponse(
        @CustomType.Parameter("privateLinkScopeId") String privateLinkScopeId,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess) {
        this.privateLinkScopeId = privateLinkScopeId;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
    }

    /**
     * The Guid id of the private link scope.
     * 
    */
    public String getPrivateLinkScopeId() {
        return this.privateLinkScopeId;
    }
    /**
     * Current state of this PrivateLinkScope: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Provisioning ,Succeeded, Canceled and Failed.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Indicates whether machines associated with the private link scope can also use public Azure Arc service endpoints.
     * 
    */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridComputePrivateLinkScopePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateLinkScopeId;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridComputePrivateLinkScopePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLinkScopeId = defaults.privateLinkScopeId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
        }

        public Builder privateLinkScopeId(String privateLinkScopeId) {
            this.privateLinkScopeId = Objects.requireNonNull(privateLinkScopeId);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public HybridComputePrivateLinkScopePropertiesResponse build() {
            return new HybridComputePrivateLinkScopePropertiesResponse(privateLinkScopeId, provisioningState, publicNetworkAccess);
        }
    }
}
