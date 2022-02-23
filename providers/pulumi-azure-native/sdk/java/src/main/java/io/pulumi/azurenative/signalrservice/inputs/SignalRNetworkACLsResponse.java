// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.inputs;

import io.pulumi.azurenative.signalrservice.inputs.NetworkACLResponse;
import io.pulumi.azurenative.signalrservice.inputs.PrivateEndpointACLResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network ACLs for SignalR
 * 
 */
public final class SignalRNetworkACLsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SignalRNetworkACLsResponse Empty = new SignalRNetworkACLsResponse();

    /**
     * Default action when no other rule matches
     * 
     */
    @InputImport(name="defaultAction")
        private final @Nullable String defaultAction;

    public Optional<String> getDefaultAction() {
        return this.defaultAction == null ? Optional.empty() : Optional.ofNullable(this.defaultAction);
    }

    /**
     * ACLs for requests from private endpoints
     * 
     */
    @InputImport(name="privateEndpoints")
        private final @Nullable List<PrivateEndpointACLResponse> privateEndpoints;

    public List<PrivateEndpointACLResponse> getPrivateEndpoints() {
        return this.privateEndpoints == null ? List.of() : this.privateEndpoints;
    }

    /**
     * ACL for requests from public network
     * 
     */
    @InputImport(name="publicNetwork")
        private final @Nullable NetworkACLResponse publicNetwork;

    public Optional<NetworkACLResponse> getPublicNetwork() {
        return this.publicNetwork == null ? Optional.empty() : Optional.ofNullable(this.publicNetwork);
    }

    public SignalRNetworkACLsResponse(
        @Nullable String defaultAction,
        @Nullable List<PrivateEndpointACLResponse> privateEndpoints,
        @Nullable NetworkACLResponse publicNetwork) {
        this.defaultAction = defaultAction == null ? "Deny" : defaultAction;
        this.privateEndpoints = privateEndpoints;
        this.publicNetwork = publicNetwork;
    }

    private SignalRNetworkACLsResponse() {
        this.defaultAction = null;
        this.privateEndpoints = List.of();
        this.publicNetwork = null;
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

        public Builder setDefaultAction(@Nullable String defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder setPrivateEndpoints(@Nullable List<PrivateEndpointACLResponse> privateEndpoints) {
            this.privateEndpoints = privateEndpoints;
            return this;
        }

        public Builder setPublicNetwork(@Nullable NetworkACLResponse publicNetwork) {
            this.publicNetwork = publicNetwork;
            return this;
        }
        public SignalRNetworkACLsResponse build() {
            return new SignalRNetworkACLsResponse(defaultAction, privateEndpoints, publicNetwork);
        }
    }
}
