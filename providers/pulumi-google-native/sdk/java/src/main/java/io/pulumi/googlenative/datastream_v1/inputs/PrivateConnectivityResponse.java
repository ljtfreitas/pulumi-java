// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Private Connectivity
 * 
 */
public final class PrivateConnectivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateConnectivityResponse Empty = new PrivateConnectivityResponse();

    /**
     * A reference to a private connection resource. Format: `projects/{project}/locations/{location}/privateConnections/{name}`
     * 
     */
    @Import(name="privateConnection", required=true)
      private final String privateConnection;

    public String getPrivateConnection() {
        return this.privateConnection;
    }

    public PrivateConnectivityResponse(String privateConnection) {
        this.privateConnection = Objects.requireNonNull(privateConnection, "expected parameter 'privateConnection' to be non-null");
    }

    private PrivateConnectivityResponse() {
        this.privateConnection = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateConnectivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateConnection;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateConnection = defaults.privateConnection;
        }

        public Builder privateConnection(String privateConnection) {
            this.privateConnection = Objects.requireNonNull(privateConnection);
            return this;
        }
        public PrivateConnectivityResponse build() {
            return new PrivateConnectivityResponse(privateConnection);
        }
    }
}
