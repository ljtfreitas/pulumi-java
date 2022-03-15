// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.PrivateEndpointResponse;
import io.pulumi.azurenative.network.inputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PrivateEndpointConnection resource.
 * 
 */
public final class PrivateEndpointConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionResponse Empty = new PrivateEndpointConnectionResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The consumer link id.
     * 
     */
    @Import(name="linkIdentifier", required=true)
      private final String linkIdentifier;

    public String getLinkIdentifier() {
        return this.linkIdentifier;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The resource of private end point.
     * 
     */
    @Import(name="privateEndpoint", required=true)
      private final PrivateEndpointResponse privateEndpoint;

    public PrivateEndpointResponse getPrivateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
      private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    public Optional<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * The provisioning state of the private endpoint connection resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public PrivateEndpointConnectionResponse(
        String etag,
        @Nullable String id,
        String linkIdentifier,
        @Nullable String name,
        PrivateEndpointResponse privateEndpoint,
        @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState,
        String type) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.linkIdentifier = Objects.requireNonNull(linkIdentifier, "expected parameter 'linkIdentifier' to be non-null");
        this.name = name;
        this.privateEndpoint = Objects.requireNonNull(privateEndpoint, "expected parameter 'privateEndpoint' to be non-null");
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PrivateEndpointConnectionResponse() {
        this.etag = null;
        this.id = null;
        this.linkIdentifier = null;
        this.name = null;
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private String linkIdentifier;
        private @Nullable String name;
        private PrivateEndpointResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.linkIdentifier = defaults.linkIdentifier;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder linkIdentifier(String linkIdentifier) {
            this.linkIdentifier = Objects.requireNonNull(linkIdentifier);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder privateEndpoint(PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
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

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PrivateEndpointConnectionResponse build() {
            return new PrivateEndpointConnectionResponse(etag, id, linkIdentifier, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, type);
        }
    }
}
