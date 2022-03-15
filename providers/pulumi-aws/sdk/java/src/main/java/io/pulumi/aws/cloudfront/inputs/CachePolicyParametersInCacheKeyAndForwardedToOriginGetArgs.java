// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs;
import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs;
import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs();

    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    @Import(name="cookiesConfig", required=true)
      private final Output<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs> cookiesConfig;

    public Output<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs> getCookiesConfig() {
        return this.cookiesConfig;
    }

    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    @Import(name="enableAcceptEncodingBrotli")
      private final @Nullable Output<Boolean> enableAcceptEncodingBrotli;

    public Output<Boolean> getEnableAcceptEncodingBrotli() {
        return this.enableAcceptEncodingBrotli == null ? Output.empty() : this.enableAcceptEncodingBrotli;
    }

    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    @Import(name="enableAcceptEncodingGzip")
      private final @Nullable Output<Boolean> enableAcceptEncodingGzip;

    public Output<Boolean> getEnableAcceptEncodingGzip() {
        return this.enableAcceptEncodingGzip == null ? Output.empty() : this.enableAcceptEncodingGzip;
    }

    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    @Import(name="headersConfig", required=true)
      private final Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs> headersConfig;

    public Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs> getHeadersConfig() {
        return this.headersConfig;
    }

    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    @Import(name="queryStringsConfig", required=true)
      private final Output<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs> queryStringsConfig;

    public Output<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs> getQueryStringsConfig() {
        return this.queryStringsConfig;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs(
        Output<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs> cookiesConfig,
        @Nullable Output<Boolean> enableAcceptEncodingBrotli,
        @Nullable Output<Boolean> enableAcceptEncodingGzip,
        Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs> headersConfig,
        Output<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs> queryStringsConfig) {
        this.cookiesConfig = Objects.requireNonNull(cookiesConfig, "expected parameter 'cookiesConfig' to be non-null");
        this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
        this.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
        this.headersConfig = Objects.requireNonNull(headersConfig, "expected parameter 'headersConfig' to be non-null");
        this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig, "expected parameter 'queryStringsConfig' to be non-null");
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs() {
        this.cookiesConfig = Output.empty();
        this.enableAcceptEncodingBrotli = Output.empty();
        this.enableAcceptEncodingGzip = Output.empty();
        this.headersConfig = Output.empty();
        this.queryStringsConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs> cookiesConfig;
        private @Nullable Output<Boolean> enableAcceptEncodingBrotli;
        private @Nullable Output<Boolean> enableAcceptEncodingGzip;
        private Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs> headersConfig;
        private Output<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs> queryStringsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookiesConfig = defaults.cookiesConfig;
    	      this.enableAcceptEncodingBrotli = defaults.enableAcceptEncodingBrotli;
    	      this.enableAcceptEncodingGzip = defaults.enableAcceptEncodingGzip;
    	      this.headersConfig = defaults.headersConfig;
    	      this.queryStringsConfig = defaults.queryStringsConfig;
        }

        public Builder cookiesConfig(Output<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs> cookiesConfig) {
            this.cookiesConfig = Objects.requireNonNull(cookiesConfig);
            return this;
        }

        public Builder cookiesConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs cookiesConfig) {
            this.cookiesConfig = Output.of(Objects.requireNonNull(cookiesConfig));
            return this;
        }

        public Builder enableAcceptEncodingBrotli(@Nullable Output<Boolean> enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
            return this;
        }

        public Builder enableAcceptEncodingBrotli(@Nullable Boolean enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = Output.ofNullable(enableAcceptEncodingBrotli);
            return this;
        }

        public Builder enableAcceptEncodingGzip(@Nullable Output<Boolean> enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
            return this;
        }

        public Builder enableAcceptEncodingGzip(@Nullable Boolean enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = Output.ofNullable(enableAcceptEncodingGzip);
            return this;
        }

        public Builder headersConfig(Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs> headersConfig) {
            this.headersConfig = Objects.requireNonNull(headersConfig);
            return this;
        }

        public Builder headersConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs headersConfig) {
            this.headersConfig = Output.of(Objects.requireNonNull(headersConfig));
            return this;
        }

        public Builder queryStringsConfig(Output<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs> queryStringsConfig) {
            this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig);
            return this;
        }

        public Builder queryStringsConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs queryStringsConfig) {
            this.queryStringsConfig = Output.of(Objects.requireNonNull(queryStringsConfig));
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs(cookiesConfig, enableAcceptEncodingBrotli, enableAcceptEncodingGzip, headersConfig, queryStringsConfig);
        }
    }
}
