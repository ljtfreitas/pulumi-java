// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs();

    /**
     * In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * This translates to the Access-Control-Allow-Credentials response header.
     * 
     */
    @InputImport(name="allowCredentials")
        private final @Nullable Input<Boolean> allowCredentials;

    public Input<Boolean> getAllowCredentials() {
        return this.allowCredentials == null ? Input.empty() : this.allowCredentials;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    @InputImport(name="allowHeaders")
        private final @Nullable Input<List<String>> allowHeaders;

    public Input<List<String>> getAllowHeaders() {
        return this.allowHeaders == null ? Input.empty() : this.allowHeaders;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Methods response header.
     * 
     */
    @InputImport(name="allowMethods")
        private final @Nullable Input<List<String>> allowMethods;

    public Input<List<String>> getAllowMethods() {
        return this.allowMethods == null ? Input.empty() : this.allowMethods;
    }

    /**
     * Specifies the list of origins that will be allowed to do CORS requests.
     * This translates to the Access-Control-Allow-Origin response header.
     * 
     */
    @InputImport(name="allowOrigins")
        private final @Nullable Input<List<String>> allowOrigins;

    public Input<List<String>> getAllowOrigins() {
        return this.allowOrigins == null ? Input.empty() : this.allowOrigins;
    }

    /**
     * If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    @InputImport(name="disabled")
        private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    @InputImport(name="exposeHeaders")
        private final @Nullable Input<List<String>> exposeHeaders;

    public Input<List<String>> getExposeHeaders() {
        return this.exposeHeaders == null ? Input.empty() : this.exposeHeaders;
    }

    /**
     * Specifies how long results of a preflight request can be cached by a client in seconds. Note that many browser clients enforce a maximum TTL of 600s (10 minutes).
     * - Setting the value to -1 forces a pre-flight check for all requests (not recommended)
     * - A maximum TTL of 86400s can be set, but note that (as above) some clients may force pre-flight checks at a more regular interval.
     * - This translates to the Access-Control-Max-Age header.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="maxAge", required=true)
        private final Input<String> maxAge;

    public Input<String> getMaxAge() {
        return this.maxAge;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs(
        @Nullable Input<Boolean> allowCredentials,
        @Nullable Input<List<String>> allowHeaders,
        @Nullable Input<List<String>> allowMethods,
        @Nullable Input<List<String>> allowOrigins,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<List<String>> exposeHeaders,
        Input<String> maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOrigins = allowOrigins;
        this.disabled = disabled;
        this.exposeHeaders = exposeHeaders;
        this.maxAge = Objects.requireNonNull(maxAge, "expected parameter 'maxAge' to be non-null");
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs() {
        this.allowCredentials = Input.empty();
        this.allowHeaders = Input.empty();
        this.allowMethods = Input.empty();
        this.allowOrigins = Input.empty();
        this.disabled = Input.empty();
        this.exposeHeaders = Input.empty();
        this.maxAge = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowCredentials;
        private @Nullable Input<List<String>> allowHeaders;
        private @Nullable Input<List<String>> allowMethods;
        private @Nullable Input<List<String>> allowOrigins;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<List<String>> exposeHeaders;
        private Input<String> maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.disabled = defaults.disabled;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder setAllowCredentials(@Nullable Input<Boolean> allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        public Builder setAllowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = Input.ofNullable(allowCredentials);
            return this;
        }

        public Builder setAllowHeaders(@Nullable Input<List<String>> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }

        public Builder setAllowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = Input.ofNullable(allowHeaders);
            return this;
        }

        public Builder setAllowMethods(@Nullable Input<List<String>> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }

        public Builder setAllowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = Input.ofNullable(allowMethods);
            return this;
        }

        public Builder setAllowOrigins(@Nullable Input<List<String>> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }

        public Builder setAllowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = Input.ofNullable(allowOrigins);
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setExposeHeaders(@Nullable Input<List<String>> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        public Builder setExposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = Input.ofNullable(exposeHeaders);
            return this;
        }

        public Builder setMaxAge(Input<String> maxAge) {
            this.maxAge = Objects.requireNonNull(maxAge);
            return this;
        }

        public Builder setMaxAge(String maxAge) {
            this.maxAge = Input.of(Objects.requireNonNull(maxAge));
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs(allowCredentials, allowHeaders, allowMethods, allowOrigins, disabled, exposeHeaders, maxAge);
        }
    }
}
