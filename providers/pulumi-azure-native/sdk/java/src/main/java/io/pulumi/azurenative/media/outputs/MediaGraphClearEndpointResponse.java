// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.MediaGraphUsernamePasswordCredentialsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MediaGraphClearEndpointResponse {
    /**
     * Polymorphic credentials to present to the endpoint.
     * 
     */
    private final @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphClearEndpoint'.
     * 
     */
    private final String odataType;
    /**
     * Url for the endpoint.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"credentials","odataType","url"})
    private MediaGraphClearEndpointResponse(
        @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials,
        String odataType,
        String url) {
        this.credentials = credentials;
        this.odataType = Objects.requireNonNull(odataType);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * Polymorphic credentials to present to the endpoint.
     * 
     */
    public Optional<MediaGraphUsernamePasswordCredentialsResponse> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphClearEndpoint'.
     * 
     */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Url for the endpoint.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphClearEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials;
        private String odataType;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphClearEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.odataType = defaults.odataType;
    	      this.url = defaults.url;
        }

        public Builder setCredentials(@Nullable MediaGraphUsernamePasswordCredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public MediaGraphClearEndpointResponse build() {
            return new MediaGraphClearEndpointResponse(credentials, odataType, url);
        }
    }
}
