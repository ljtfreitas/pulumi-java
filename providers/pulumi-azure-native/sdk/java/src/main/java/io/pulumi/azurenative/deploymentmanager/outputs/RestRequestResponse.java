// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.azurenative.deploymentmanager.outputs.ApiKeyAuthenticationResponse;
import io.pulumi.azurenative.deploymentmanager.outputs.RolloutIdentityAuthenticationResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RestRequestResponse {
    /**
     * The authentication information required in the request to the health provider.
     * 
     */
    private final Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> authentication;
    /**
     * The HTTP method to use for the request.
     * 
     */
    private final String method;
    /**
     * The HTTP URI to use for the request.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"authentication","method","uri"})
    private RestRequestResponse(
        Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> authentication,
        String method,
        String uri) {
        this.authentication = Objects.requireNonNull(authentication);
        this.method = Objects.requireNonNull(method);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * The authentication information required in the request to the health provider.
     * 
     */
    public Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> getAuthentication() {
        return this.authentication;
    }
    /**
     * The HTTP method to use for the request.
     * 
     */
    public String getMethod() {
        return this.method;
    }
    /**
     * The HTTP URI to use for the request.
     * 
     */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> authentication;
        private String method;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RestRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.method = defaults.method;
    	      this.uri = defaults.uri;
        }

        public Builder setAuthentication(Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }

        public Builder setMethod(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public RestRequestResponse build() {
            return new RestRequestResponse(authentication, method, uri);
        }
    }
}
