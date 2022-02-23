// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The endpoint details.
 * 
 */
public final class EndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointResponse Empty = new EndpointResponse();

    /**
     * The URL of the endpoint.
     * 
     */
    @InputImport(name="endpointUrl")
        private final @Nullable String endpointUrl;

    public Optional<String> getEndpointUrl() {
        return this.endpointUrl == null ? Optional.empty() : Optional.ofNullable(this.endpointUrl);
    }

    /**
     * The type of the endpoint.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public EndpointResponse(
        @Nullable String endpointUrl,
        String type) {
        this.endpointUrl = endpointUrl;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EndpointResponse() {
        this.endpointUrl = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpointUrl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointUrl = defaults.endpointUrl;
    	      this.type = defaults.type;
        }

        public Builder setEndpointUrl(@Nullable String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public EndpointResponse build() {
            return new EndpointResponse(endpointUrl, type);
        }
    }
}
