// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionCorsPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionCorsPolicyGetArgs Empty = new URLMapDefaultRouteActionCorsPolicyGetArgs();

    /**
     * In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * This translates to the Access-Control-Allow-Credentials header.
     * 
     */
    @Import(name="allowCredentials")
      private final @Nullable Output<Boolean> allowCredentials;

    public Output<Boolean> getAllowCredentials() {
        return this.allowCredentials == null ? Output.empty() : this.allowCredentials;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Headers header.
     * 
     */
    @Import(name="allowHeaders")
      private final @Nullable Output<List<String>> allowHeaders;

    public Output<List<String>> getAllowHeaders() {
        return this.allowHeaders == null ? Output.empty() : this.allowHeaders;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Methods header.
     * 
     */
    @Import(name="allowMethods")
      private final @Nullable Output<List<String>> allowMethods;

    public Output<List<String>> getAllowMethods() {
        return this.allowMethods == null ? Output.empty() : this.allowMethods;
    }

    /**
     * Specifies the regular expression patterns that match allowed origins. For regular expression grammar
     * please see en.cppreference.com/w/cpp/regex/ecmascript
     * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    @Import(name="allowOriginRegexes")
      private final @Nullable Output<List<String>> allowOriginRegexes;

    public Output<List<String>> getAllowOriginRegexes() {
        return this.allowOriginRegexes == null ? Output.empty() : this.allowOriginRegexes;
    }

    /**
     * Specifies the list of origins that will be allowed to do CORS requests.
     * An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    @Import(name="allowOrigins")
      private final @Nullable Output<List<String>> allowOrigins;

    public Output<List<String>> getAllowOrigins() {
        return this.allowOrigins == null ? Output.empty() : this.allowOrigins;
    }

    /**
     * If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Output.empty() : this.disabled;
    }

    /**
     * Specifies the content for the Access-Control-Expose-Headers header.
     * 
     */
    @Import(name="exposeHeaders")
      private final @Nullable Output<List<String>> exposeHeaders;

    public Output<List<String>> getExposeHeaders() {
        return this.exposeHeaders == null ? Output.empty() : this.exposeHeaders;
    }

    /**
     * Specifies how long results of a preflight request can be cached in seconds.
     * This translates to the Access-Control-Max-Age header.
     * 
     */
    @Import(name="maxAge")
      private final @Nullable Output<Integer> maxAge;

    public Output<Integer> getMaxAge() {
        return this.maxAge == null ? Output.empty() : this.maxAge;
    }

    public URLMapDefaultRouteActionCorsPolicyGetArgs(
        @Nullable Output<Boolean> allowCredentials,
        @Nullable Output<List<String>> allowHeaders,
        @Nullable Output<List<String>> allowMethods,
        @Nullable Output<List<String>> allowOriginRegexes,
        @Nullable Output<List<String>> allowOrigins,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<List<String>> exposeHeaders,
        @Nullable Output<Integer> maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOriginRegexes = allowOriginRegexes;
        this.allowOrigins = allowOrigins;
        this.disabled = disabled;
        this.exposeHeaders = exposeHeaders;
        this.maxAge = maxAge;
    }

    private URLMapDefaultRouteActionCorsPolicyGetArgs() {
        this.allowCredentials = Output.empty();
        this.allowHeaders = Output.empty();
        this.allowMethods = Output.empty();
        this.allowOriginRegexes = Output.empty();
        this.allowOrigins = Output.empty();
        this.disabled = Output.empty();
        this.exposeHeaders = Output.empty();
        this.maxAge = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionCorsPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowCredentials;
        private @Nullable Output<List<String>> allowHeaders;
        private @Nullable Output<List<String>> allowMethods;
        private @Nullable Output<List<String>> allowOriginRegexes;
        private @Nullable Output<List<String>> allowOrigins;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<List<String>> exposeHeaders;
        private @Nullable Output<Integer> maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionCorsPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOriginRegexes = defaults.allowOriginRegexes;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.disabled = defaults.disabled;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder allowCredentials(@Nullable Output<Boolean> allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = Output.ofNullable(allowCredentials);
            return this;
        }

        public Builder allowHeaders(@Nullable Output<List<String>> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }

        public Builder allowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = Output.ofNullable(allowHeaders);
            return this;
        }

        public Builder allowMethods(@Nullable Output<List<String>> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }

        public Builder allowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = Output.ofNullable(allowMethods);
            return this;
        }

        public Builder allowOriginRegexes(@Nullable Output<List<String>> allowOriginRegexes) {
            this.allowOriginRegexes = allowOriginRegexes;
            return this;
        }

        public Builder allowOriginRegexes(@Nullable List<String> allowOriginRegexes) {
            this.allowOriginRegexes = Output.ofNullable(allowOriginRegexes);
            return this;
        }

        public Builder allowOrigins(@Nullable Output<List<String>> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }

        public Builder allowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = Output.ofNullable(allowOrigins);
            return this;
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Output.ofNullable(disabled);
            return this;
        }

        public Builder exposeHeaders(@Nullable Output<List<String>> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        public Builder exposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = Output.ofNullable(exposeHeaders);
            return this;
        }

        public Builder maxAge(@Nullable Output<Integer> maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = Output.ofNullable(maxAge);
            return this;
        }
        public URLMapDefaultRouteActionCorsPolicyGetArgs build() {
            return new URLMapDefaultRouteActionCorsPolicyGetArgs(allowCredentials, allowHeaders, allowMethods, allowOriginRegexes, allowOrigins, disabled, exposeHeaders, maxAge);
        }
    }
}
