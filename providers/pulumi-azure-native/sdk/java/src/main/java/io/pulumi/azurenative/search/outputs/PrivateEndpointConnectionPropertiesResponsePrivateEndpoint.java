// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateEndpointConnectionPropertiesResponsePrivateEndpoint {
    /**
     * The resource id of the private endpoint resource from Microsoft.Network provider.
     * 
     */
    private final @Nullable String id;

    @CustomType.Constructor
    private PrivateEndpointConnectionPropertiesResponsePrivateEndpoint(@CustomType.Parameter("id") @Nullable String id) {
        this.id = id;
    }

    /**
     * The resource id of the private endpoint resource from Microsoft.Network provider.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesResponsePrivateEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionPropertiesResponsePrivateEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public PrivateEndpointConnectionPropertiesResponsePrivateEndpoint build() {
            return new PrivateEndpointConnectionPropertiesResponsePrivateEndpoint(id);
        }
    }
}
