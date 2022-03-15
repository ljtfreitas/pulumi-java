// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.inputs.PrivateEndpointResponse;
import io.pulumi.azurenative.keyvault.inputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private endpoint connection item.
 * 
 */
public final class PrivateEndpointConnectionItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionItemResponse Empty = new PrivateEndpointConnectionItemResponse();

    /**
     * Modified whenever there is a change in the state of private endpoint connection.
     * 
     */
    @Import(name="etag")
      private final @Nullable String etag;

    public Optional<String> getEtag() {
        return this.etag == null ? Optional.empty() : Optional.ofNullable(this.etag);
    }

    /**
     * Id of private endpoint connection.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Properties of the private endpoint object.
     * 
     */
    @Import(name="privateEndpoint")
      private final @Nullable PrivateEndpointResponse privateEndpoint;

    public Optional<PrivateEndpointResponse> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Optional.empty() : Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Approval state of the private link connection.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
      private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    public Optional<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public PrivateEndpointConnectionItemResponse(
        @Nullable String etag,
        @Nullable String id,
        @Nullable PrivateEndpointResponse privateEndpoint,
        @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState) {
        this.etag = etag;
        this.id = id;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private PrivateEndpointConnectionItemResponse() {
        this.etag = null;
        this.id = null;
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private @Nullable String id;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public PrivateEndpointConnectionItemResponse build() {
            return new PrivateEndpointConnectionItemResponse(etag, id, privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
