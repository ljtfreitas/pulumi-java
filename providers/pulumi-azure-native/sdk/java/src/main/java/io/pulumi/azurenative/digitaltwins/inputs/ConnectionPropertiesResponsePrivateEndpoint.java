// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ConnectionPropertiesResponsePrivateEndpoint extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionPropertiesResponsePrivateEndpoint Empty = new ConnectionPropertiesResponsePrivateEndpoint();

    /**
     * The resource identifier.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    public ConnectionPropertiesResponsePrivateEndpoint(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private ConnectionPropertiesResponsePrivateEndpoint() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionPropertiesResponsePrivateEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionPropertiesResponsePrivateEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public ConnectionPropertiesResponsePrivateEndpoint build() {
            return new ConnectionPropertiesResponsePrivateEndpoint(id);
        }
    }
}
