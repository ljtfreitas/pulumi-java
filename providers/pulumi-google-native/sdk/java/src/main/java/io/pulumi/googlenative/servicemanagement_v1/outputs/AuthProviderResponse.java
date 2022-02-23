// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.JwtLocationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AuthProviderResponse {
    /**
     * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, JWTs with audiences: - "https://[service.name]/[google.protobuf.Api.name]" - "https://[service.name]/" will be accepted. For example, if no audiences are in the setting, LibraryService API will accept JWTs with the following audiences: - https://library-example.googleapis.com/google.example.library.v1.LibraryService - https://library-example.googleapis.com/ Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    private final String audiences;
    /**
     * Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl of securityDefinitions in OpenAPI spec.
     * 
     */
    private final String authorizationUrl;
    /**
     * Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1 Usually a URL or an email address. Example: https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
     * 
     */
    private final String issuer;
    /**
     * URL of the provider's public key set to validate signature of the JWT. See [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata). Optional if the key set document: - can be retrieved from [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html) of the issuer. - can be inferred from the email domain of the issuer (e.g. a Google service account). Example: https://www.googleapis.com/oauth2/v1/certs
     * 
     */
    private final String jwksUri;
    /**
     * Defines the locations to extract the JWT. JWT locations can be either from HTTP headers or URL query parameters. The rule is that the first match wins. The checking order is: checking all headers first, then URL query parameters. If not specified, default to use following 3 locations: 1) Authorization: Bearer 2) x-goog-iap-jwt-assertion 3) access_token query parameter Default locations can be specified as followings: jwt_locations: - header: Authorization value_prefix: "Bearer " - header: x-goog-iap-jwt-assertion - query: access_token
     * 
     */
    private final List<JwtLocationResponse> jwtLocations;

    @OutputCustomType.Constructor({"audiences","authorizationUrl","issuer","jwksUri","jwtLocations"})
    private AuthProviderResponse(
        String audiences,
        String authorizationUrl,
        String issuer,
        String jwksUri,
        List<JwtLocationResponse> jwtLocations) {
        this.audiences = Objects.requireNonNull(audiences);
        this.authorizationUrl = Objects.requireNonNull(authorizationUrl);
        this.issuer = Objects.requireNonNull(issuer);
        this.jwksUri = Objects.requireNonNull(jwksUri);
        this.jwtLocations = Objects.requireNonNull(jwtLocations);
    }

    /**
     * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, JWTs with audiences: - "https://[service.name]/[google.protobuf.Api.name]" - "https://[service.name]/" will be accepted. For example, if no audiences are in the setting, LibraryService API will accept JWTs with the following audiences: - https://library-example.googleapis.com/google.example.library.v1.LibraryService - https://library-example.googleapis.com/ Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    public String getAudiences() {
        return this.audiences;
    }
    /**
     * Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl of securityDefinitions in OpenAPI spec.
     * 
     */
    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }
    /**
     * Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1 Usually a URL or an email address. Example: https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
     * 
     */
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * URL of the provider's public key set to validate signature of the JWT. See [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata). Optional if the key set document: - can be retrieved from [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html) of the issuer. - can be inferred from the email domain of the issuer (e.g. a Google service account). Example: https://www.googleapis.com/oauth2/v1/certs
     * 
     */
    public String getJwksUri() {
        return this.jwksUri;
    }
    /**
     * Defines the locations to extract the JWT. JWT locations can be either from HTTP headers or URL query parameters. The rule is that the first match wins. The checking order is: checking all headers first, then URL query parameters. If not specified, default to use following 3 locations: 1) Authorization: Bearer 2) x-goog-iap-jwt-assertion 3) access_token query parameter Default locations can be specified as followings: jwt_locations: - header: Authorization value_prefix: "Bearer " - header: x-goog-iap-jwt-assertion - query: access_token
     * 
     */
    public List<JwtLocationResponse> getJwtLocations() {
        return this.jwtLocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audiences;
        private String authorizationUrl;
        private String issuer;
        private String jwksUri;
        private List<JwtLocationResponse> jwtLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.authorizationUrl = defaults.authorizationUrl;
    	      this.issuer = defaults.issuer;
    	      this.jwksUri = defaults.jwksUri;
    	      this.jwtLocations = defaults.jwtLocations;
        }

        public Builder setAudiences(String audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }

        public Builder setAuthorizationUrl(String authorizationUrl) {
            this.authorizationUrl = Objects.requireNonNull(authorizationUrl);
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setJwksUri(String jwksUri) {
            this.jwksUri = Objects.requireNonNull(jwksUri);
            return this;
        }

        public Builder setJwtLocations(List<JwtLocationResponse> jwtLocations) {
            this.jwtLocations = Objects.requireNonNull(jwtLocations);
            return this;
        }
        public AuthProviderResponse build() {
            return new AuthProviderResponse(audiences, authorizationUrl, issuer, jwksUri, jwtLocations);
        }
    }
}
