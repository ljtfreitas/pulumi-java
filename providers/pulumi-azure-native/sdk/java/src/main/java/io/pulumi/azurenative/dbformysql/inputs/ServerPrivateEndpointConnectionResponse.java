// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.inputs;

import io.pulumi.azurenative.dbformysql.inputs.ServerPrivateEndpointConnectionPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A private endpoint connection under a server
 * 
 */
public final class ServerPrivateEndpointConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServerPrivateEndpointConnectionResponse Empty = new ServerPrivateEndpointConnectionResponse();

    /**
     * Resource Id of the private endpoint connection.
     * 
     */
    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Private endpoint connection properties
     * 
     */
    @InputImport(name="properties", required=true)
        private final ServerPrivateEndpointConnectionPropertiesResponse properties;

    public ServerPrivateEndpointConnectionPropertiesResponse getProperties() {
        return this.properties;
    }

    public ServerPrivateEndpointConnectionResponse(
        String id,
        ServerPrivateEndpointConnectionPropertiesResponse properties) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private ServerPrivateEndpointConnectionResponse() {
        this.id = null;
        this.properties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private ServerPrivateEndpointConnectionPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setProperties(ServerPrivateEndpointConnectionPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public ServerPrivateEndpointConnectionResponse build() {
            return new ServerPrivateEndpointConnectionResponse(id, properties);
        }
    }
}
