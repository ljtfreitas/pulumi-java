// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.PrivateEndpointPropertyResponse;
import io.pulumi.azurenative.automation.inputs.PrivateLinkServiceConnectionStatePropertyResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A private endpoint connection
 * 
 */
public final class PrivateEndpointConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionResponse Empty = new PrivateEndpointConnectionResponse();

    /**
     * Fully qualified resource Id for the resource
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The name of the resource
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Private endpoint which the connection belongs to.
     * 
     */
    @Import(name="privateEndpoint")
      private final @Nullable PrivateEndpointPropertyResponse privateEndpoint;

    public Optional<PrivateEndpointPropertyResponse> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Optional.empty() : Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Connection State of the Private Endpoint Connection.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
      private final @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;

    public Optional<PrivateLinkServiceConnectionStatePropertyResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * The type of the resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public PrivateEndpointConnectionResponse(
        String id,
        String name,
        @Nullable PrivateEndpointPropertyResponse privateEndpoint,
        @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PrivateEndpointConnectionResponse() {
        this.id = null;
        this.name = null;
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable PrivateEndpointPropertyResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder privateEndpoint(@Nullable PrivateEndpointPropertyResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PrivateEndpointConnectionResponse build() {
            return new PrivateEndpointConnectionResponse(id, name, privateEndpoint, privateLinkServiceConnectionState, type);
        }
    }
}
