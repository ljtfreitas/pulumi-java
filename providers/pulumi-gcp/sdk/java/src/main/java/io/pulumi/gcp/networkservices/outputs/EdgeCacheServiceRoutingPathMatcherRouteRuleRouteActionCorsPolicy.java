// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy {
    /**
     * In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * This translates to the Access-Control-Allow-Credentials response header.
     * 
     */
    private final @Nullable Boolean allowCredentials;
    /**
     * Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    private final @Nullable List<String> allowHeaders;
    /**
     * Specifies the content for the Access-Control-Allow-Methods response header.
     * 
     */
    private final @Nullable List<String> allowMethods;
    /**
     * Specifies the list of origins that will be allowed to do CORS requests.
     * This translates to the Access-Control-Allow-Origin response header.
     * 
     */
    private final @Nullable List<String> allowOrigins;
    /**
     * If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    private final @Nullable Boolean disabled;
    /**
     * Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    private final @Nullable List<String> exposeHeaders;
    /**
     * Specifies how long results of a preflight request can be cached by a client in seconds. Note that many browser clients enforce a maximum TTL of 600s (10 minutes).
     * - Setting the value to -1 forces a pre-flight check for all requests (not recommended)
     * - A maximum TTL of 86400s can be set, but note that (as above) some clients may force pre-flight checks at a more regular interval.
     * - This translates to the Access-Control-Max-Age header.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final String maxAge;

    @OutputCustomType.Constructor({"allowCredentials","allowHeaders","allowMethods","allowOrigins","disabled","exposeHeaders","maxAge"})
    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy(
        @Nullable Boolean allowCredentials,
        @Nullable List<String> allowHeaders,
        @Nullable List<String> allowMethods,
        @Nullable List<String> allowOrigins,
        @Nullable Boolean disabled,
        @Nullable List<String> exposeHeaders,
        String maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOrigins = allowOrigins;
        this.disabled = disabled;
        this.exposeHeaders = exposeHeaders;
        this.maxAge = Objects.requireNonNull(maxAge);
    }

    /**
     * In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * This translates to the Access-Control-Allow-Credentials response header.
     * 
     */
    public Optional<Boolean> getAllowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    /**
     * Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    public List<String> getAllowHeaders() {
        return this.allowHeaders == null ? List.of() : this.allowHeaders;
    }
    /**
     * Specifies the content for the Access-Control-Allow-Methods response header.
     * 
     */
    public List<String> getAllowMethods() {
        return this.allowMethods == null ? List.of() : this.allowMethods;
    }
    /**
     * Specifies the list of origins that will be allowed to do CORS requests.
     * This translates to the Access-Control-Allow-Origin response header.
     * 
     */
    public List<String> getAllowOrigins() {
        return this.allowOrigins == null ? List.of() : this.allowOrigins;
    }
    /**
     * If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    public Optional<Boolean> getDisabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    public List<String> getExposeHeaders() {
        return this.exposeHeaders == null ? List.of() : this.exposeHeaders;
    }
    /**
     * Specifies how long results of a preflight request can be cached by a client in seconds. Note that many browser clients enforce a maximum TTL of 600s (10 minutes).
     * - Setting the value to -1 forces a pre-flight check for all requests (not recommended)
     * - A maximum TTL of 86400s can be set, but note that (as above) some clients may force pre-flight checks at a more regular interval.
     * - This translates to the Access-Control-Max-Age header.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public String getMaxAge() {
        return this.maxAge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> allowHeaders;
        private @Nullable List<String> allowMethods;
        private @Nullable List<String> allowOrigins;
        private @Nullable Boolean disabled;
        private @Nullable List<String> exposeHeaders;
        private String maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.disabled = defaults.disabled;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder setAllowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        public Builder setAllowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }

        public Builder setAllowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }

        public Builder setAllowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setExposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        public Builder setMaxAge(String maxAge) {
            this.maxAge = Objects.requireNonNull(maxAge);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy(allowCredentials, allowHeaders, allowMethods, allowOrigins, disabled, exposeHeaders, maxAge);
        }
    }
}
