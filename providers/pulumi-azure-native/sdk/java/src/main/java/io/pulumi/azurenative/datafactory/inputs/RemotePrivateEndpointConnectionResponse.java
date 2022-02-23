// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ArmIdWrapperResponse;
import io.pulumi.azurenative.datafactory.inputs.PrivateLinkConnectionStateResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A remote private endpoint connection
 * 
 */
public final class RemotePrivateEndpointConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final RemotePrivateEndpointConnectionResponse Empty = new RemotePrivateEndpointConnectionResponse();

    /**
     * PrivateEndpoint of a remote private endpoint connection
     * 
     */
    @InputImport(name="privateEndpoint")
        private final @Nullable ArmIdWrapperResponse privateEndpoint;

    public Optional<ArmIdWrapperResponse> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Optional.empty() : Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * The state of a private link connection
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
        private final @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;

    public Optional<PrivateLinkConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    @InputImport(name="provisioningState", required=true)
        private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public RemotePrivateEndpointConnectionResponse(
        @Nullable ArmIdWrapperResponse privateEndpoint,
        @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private RemotePrivateEndpointConnectionResponse() {
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemotePrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ArmIdWrapperResponse privateEndpoint;
        private @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(RemotePrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setPrivateEndpoint(@Nullable ArmIdWrapperResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public RemotePrivateEndpointConnectionResponse build() {
            return new RemotePrivateEndpointConnectionResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
