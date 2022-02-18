// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.azurenative.search.inputs.PrivateEndpointConnectionPropertiesResponsePrivateEndpoint;
import io.pulumi.azurenative.search.inputs.PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of an existing Private Endpoint connection to the Azure Cognitive Search service.
 * 
 */
public final class PrivateEndpointConnectionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionPropertiesResponse Empty = new PrivateEndpointConnectionPropertiesResponse();

    /**
     * The private endpoint resource from Microsoft.Network provider.
     * 
     */
    @InputImport(name="privateEndpoint")
    private final @Nullable PrivateEndpointConnectionPropertiesResponsePrivateEndpoint privateEndpoint;

    public Optional<PrivateEndpointConnectionPropertiesResponsePrivateEndpoint> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Optional.empty() : Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Describes the current state of an existing Private Link Service connection to the Azure Private Endpoint.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
    private final @Nullable PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    public Optional<PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    public PrivateEndpointConnectionPropertiesResponse(
        @Nullable PrivateEndpointConnectionPropertiesResponsePrivateEndpoint privateEndpoint,
        @Nullable PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
    }

    private PrivateEndpointConnectionPropertiesResponse() {
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PrivateEndpointConnectionPropertiesResponsePrivateEndpoint privateEndpoint;
        private @Nullable PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointConnectionPropertiesResponsePrivateEndpoint privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public PrivateEndpointConnectionPropertiesResponse build() {
            return new PrivateEndpointConnectionPropertiesResponse(privateEndpoint, privateLinkServiceConnectionState);
        }
    }
}
