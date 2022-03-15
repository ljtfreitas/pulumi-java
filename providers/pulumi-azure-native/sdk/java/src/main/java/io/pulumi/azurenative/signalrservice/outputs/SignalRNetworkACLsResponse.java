// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.outputs;

import io.pulumi.azurenative.signalrservice.outputs.NetworkACLResponse;
import io.pulumi.azurenative.signalrservice.outputs.PrivateEndpointACLResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SignalRNetworkACLsResponse {
    /**
     * Default action when no other rule matches
     * 
     */
    private final @Nullable String defaultAction;
    /**
     * ACLs for requests from private endpoints
     * 
     */
    private final @Nullable List<PrivateEndpointACLResponse> privateEndpoints;
    /**
     * ACL for requests from public network
     * 
     */
    private final @Nullable NetworkACLResponse publicNetwork;

    @CustomType.Constructor
    private SignalRNetworkACLsResponse(
        @CustomType.Parameter("defaultAction") @Nullable String defaultAction,
        @CustomType.Parameter("privateEndpoints") @Nullable List<PrivateEndpointACLResponse> privateEndpoints,
        @CustomType.Parameter("publicNetwork") @Nullable NetworkACLResponse publicNetwork) {
        this.defaultAction = defaultAction;
        this.privateEndpoints = privateEndpoints;
        this.publicNetwork = publicNetwork;
    }

    /**
     * Default action when no other rule matches
     * 
    */
    public Optional<String> getDefaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }
    /**
     * ACLs for requests from private endpoints
     * 
    */
    public List<PrivateEndpointACLResponse> getPrivateEndpoints() {
        return this.privateEndpoints == null ? List.of() : this.privateEndpoints;
    }
    /**
     * ACL for requests from public network
     * 
    */
    public Optional<NetworkACLResponse> getPublicNetwork() {
        return Optional.ofNullable(this.publicNetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignalRNetworkACLsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultAction;
        private @Nullable List<PrivateEndpointACLResponse> privateEndpoints;
        private @Nullable NetworkACLResponse publicNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(SignalRNetworkACLsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.privateEndpoints = defaults.privateEndpoints;
    	      this.publicNetwork = defaults.publicNetwork;
        }

        public Builder defaultAction(@Nullable String defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder privateEndpoints(@Nullable List<PrivateEndpointACLResponse> privateEndpoints) {
            this.privateEndpoints = privateEndpoints;
            return this;
        }

        public Builder publicNetwork(@Nullable NetworkACLResponse publicNetwork) {
            this.publicNetwork = publicNetwork;
            return this;
        }
        public SignalRNetworkACLsResponse build() {
            return new SignalRNetworkACLsResponse(defaultAction, privateEndpoints, publicNetwork);
        }
    }
}
