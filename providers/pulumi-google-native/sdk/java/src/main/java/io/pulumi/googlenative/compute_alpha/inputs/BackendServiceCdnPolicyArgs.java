// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.BackendServiceCdnPolicyCacheMode;
import io.pulumi.googlenative.compute_alpha.inputs.BackendServiceCdnPolicyBypassCacheOnRequestHeaderArgs;
import io.pulumi.googlenative.compute_alpha.inputs.BackendServiceCdnPolicyNegativeCachingPolicyArgs;
import io.pulumi.googlenative.compute_alpha.inputs.CacheKeyPolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message containing Cloud CDN configuration for a backend service.
 * 
 */
public final class BackendServiceCdnPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceCdnPolicyArgs Empty = new BackendServiceCdnPolicyArgs();

    /**
     * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode settings.
     * 
     */
    @Import(name="bypassCacheOnRequestHeaders")
      private final @Nullable Output<List<BackendServiceCdnPolicyBypassCacheOnRequestHeaderArgs>> bypassCacheOnRequestHeaders;

    public Output<List<BackendServiceCdnPolicyBypassCacheOnRequestHeaderArgs>> getBypassCacheOnRequestHeaders() {
        return this.bypassCacheOnRequestHeaders == null ? Output.empty() : this.bypassCacheOnRequestHeaders;
    }

    /**
     * The CacheKeyPolicy for this CdnPolicy.
     * 
     */
    @Import(name="cacheKeyPolicy")
      private final @Nullable Output<CacheKeyPolicyArgs> cacheKeyPolicy;

    public Output<CacheKeyPolicyArgs> getCacheKeyPolicy() {
        return this.cacheKeyPolicy == null ? Output.empty() : this.cacheKeyPolicy;
    }

    /**
     * Specifies the cache setting for all responses from this backend. The possible values are: USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses without these headers will not be cached at Google's edge, and will require a full trip to the origin on every request, potentially impacting performance and increasing load on the origin server. FORCE_CACHE_ALL Cache all content, ignoring any "private", "no-store" or "no-cache" directives in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-user (user identifiable) content. CACHE_ALL_STATIC Automatically cache static content, including common image formats, media (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked as uncacheable, as well as dynamic content (including HTML), will not be cached.
     * 
     */
    @Import(name="cacheMode")
      private final @Nullable Output<BackendServiceCdnPolicyCacheMode> cacheMode;

    public Output<BackendServiceCdnPolicyCacheMode> getCacheMode() {
        return this.cacheMode == null ? Output.empty() : this.cacheMode;
    }

    /**
     * Specifies a separate client (e.g. browser client) maximum TTL. This is used to clamp the max-age (or Expires) value sent to the client. With FORCE_CACHE_ALL, the lesser of client_ttl and default_ttl is used for the response max-age directive, along with a "public" directive. For cacheable content in CACHE_ALL_STATIC mode, client_ttl clamps the max-age from the origin (if specified), or else sets the response max-age directive to the lesser of the client_ttl and default_ttl, and also ensures a "public" cache-control directive is present. If a client TTL is not specified, a default value (1 hour) will be used. The maximum allowed value is 31,622,400s (1 year).
     * 
     */
    @Import(name="clientTtl")
      private final @Nullable Output<Integer> clientTtl;

    public Output<Integer> getClientTtl() {
        return this.clientTtl == null ? Output.empty() : this.clientTtl;
    }

    /**
     * Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age). Setting a TTL of "0" means "always revalidate". The value of defaultTTL cannot be set to a value greater than that of maxTTL, but can be equal. When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses. The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @Import(name="defaultTtl")
      private final @Nullable Output<Integer> defaultTtl;

    public Output<Integer> getDefaultTtl() {
        return this.defaultTtl == null ? Output.empty() : this.defaultTtl;
    }

    /**
     * Specifies the maximum allowed TTL for cached content served by this origin. Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTTL seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive. Headers sent to the client will not be modified. Setting a TTL of "0" means "always revalidate". The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @Import(name="maxTtl")
      private final @Nullable Output<Integer> maxTtl;

    public Output<Integer> getMaxTtl() {
        return this.maxTtl == null ? Output.empty() : this.maxTtl;
    }

    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency. When the cache mode is set to CACHE_ALL_STATIC or USE_ORIGIN_HEADERS, negative caching applies to responses with the specified response code that lack any Cache-Control, Expires, or Pragma: no-cache directives. When the cache mode is set to FORCE_CACHE_ALL, negative caching applies to all responses with the specified response code, and override any caching headers. By default, Cloud CDN will apply the following default TTLs to these status codes: HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s HTTP 405 (Method Not Found), 421 (Misdirected Request), 501 (Not Implemented): 60s. These defaults can be overridden in negative_caching_policy.
     * 
     */
    @Import(name="negativeCaching")
      private final @Nullable Output<Boolean> negativeCaching;

    public Output<Boolean> getNegativeCaching() {
        return this.negativeCaching == null ? Output.empty() : this.negativeCaching;
    }

    /**
     * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled will use Cloud CDN's default cache TTLs. Note that when specifying an explicit negative_caching_policy, you should take care to specify a cache TTL for all response codes that you wish to cache. Cloud CDN will not apply any default negative caching when a policy exists.
     * 
     */
    @Import(name="negativeCachingPolicy")
      private final @Nullable Output<List<BackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicy;

    public Output<List<BackendServiceCdnPolicyNegativeCachingPolicyArgs>> getNegativeCachingPolicy() {
        return this.negativeCachingPolicy == null ? Output.empty() : this.negativeCachingPolicy;
    }

    /**
     * If true then Cloud CDN will combine multiple concurrent cache fill requests into a small number of requests to the origin.
     * 
     */
    @Import(name="requestCoalescing")
      private final @Nullable Output<Boolean> requestCoalescing;

    public Output<Boolean> getRequestCoalescing() {
        return this.requestCoalescing == null ? Output.empty() : this.requestCoalescing;
    }

    /**
     * Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache. This setting defines the default "max-stale" duration for any cached responses that do not specify a max-stale directive. Stale responses that exceed the TTL configured here will not be served. The default limit (max-stale) is 86400s (1 day), which will allow stale content to be served up to this limit beyond the max-age (or s-max-age) of a cached response. The maximum allowed value is 604800 (1 week). Set this to zero (0) to disable serve-while-stale.
     * 
     */
    @Import(name="serveWhileStale")
      private final @Nullable Output<Integer> serveWhileStale;

    public Output<Integer> getServeWhileStale() {
        return this.serveWhileStale == null ? Output.empty() : this.serveWhileStale;
    }

    /**
     * Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a "Cache-Control: public, max-age=[TTL]" header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
     * 
     */
    @Import(name="signedUrlCacheMaxAgeSec")
      private final @Nullable Output<String> signedUrlCacheMaxAgeSec;

    public Output<String> getSignedUrlCacheMaxAgeSec() {
        return this.signedUrlCacheMaxAgeSec == null ? Output.empty() : this.signedUrlCacheMaxAgeSec;
    }

    public BackendServiceCdnPolicyArgs(
        @Nullable Output<List<BackendServiceCdnPolicyBypassCacheOnRequestHeaderArgs>> bypassCacheOnRequestHeaders,
        @Nullable Output<CacheKeyPolicyArgs> cacheKeyPolicy,
        @Nullable Output<BackendServiceCdnPolicyCacheMode> cacheMode,
        @Nullable Output<Integer> clientTtl,
        @Nullable Output<Integer> defaultTtl,
        @Nullable Output<Integer> maxTtl,
        @Nullable Output<Boolean> negativeCaching,
        @Nullable Output<List<BackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicy,
        @Nullable Output<Boolean> requestCoalescing,
        @Nullable Output<Integer> serveWhileStale,
        @Nullable Output<String> signedUrlCacheMaxAgeSec) {
        this.bypassCacheOnRequestHeaders = bypassCacheOnRequestHeaders;
        this.cacheKeyPolicy = cacheKeyPolicy;
        this.cacheMode = cacheMode;
        this.clientTtl = clientTtl;
        this.defaultTtl = defaultTtl;
        this.maxTtl = maxTtl;
        this.negativeCaching = negativeCaching;
        this.negativeCachingPolicy = negativeCachingPolicy;
        this.requestCoalescing = requestCoalescing;
        this.serveWhileStale = serveWhileStale;
        this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
    }

    private BackendServiceCdnPolicyArgs() {
        this.bypassCacheOnRequestHeaders = Output.empty();
        this.cacheKeyPolicy = Output.empty();
        this.cacheMode = Output.empty();
        this.clientTtl = Output.empty();
        this.defaultTtl = Output.empty();
        this.maxTtl = Output.empty();
        this.negativeCaching = Output.empty();
        this.negativeCachingPolicy = Output.empty();
        this.requestCoalescing = Output.empty();
        this.serveWhileStale = Output.empty();
        this.signedUrlCacheMaxAgeSec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceCdnPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<BackendServiceCdnPolicyBypassCacheOnRequestHeaderArgs>> bypassCacheOnRequestHeaders;
        private @Nullable Output<CacheKeyPolicyArgs> cacheKeyPolicy;
        private @Nullable Output<BackendServiceCdnPolicyCacheMode> cacheMode;
        private @Nullable Output<Integer> clientTtl;
        private @Nullable Output<Integer> defaultTtl;
        private @Nullable Output<Integer> maxTtl;
        private @Nullable Output<Boolean> negativeCaching;
        private @Nullable Output<List<BackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicy;
        private @Nullable Output<Boolean> requestCoalescing;
        private @Nullable Output<Integer> serveWhileStale;
        private @Nullable Output<String> signedUrlCacheMaxAgeSec;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceCdnPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypassCacheOnRequestHeaders = defaults.bypassCacheOnRequestHeaders;
    	      this.cacheKeyPolicy = defaults.cacheKeyPolicy;
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicy = defaults.negativeCachingPolicy;
    	      this.requestCoalescing = defaults.requestCoalescing;
    	      this.serveWhileStale = defaults.serveWhileStale;
    	      this.signedUrlCacheMaxAgeSec = defaults.signedUrlCacheMaxAgeSec;
        }

        public Builder bypassCacheOnRequestHeaders(@Nullable Output<List<BackendServiceCdnPolicyBypassCacheOnRequestHeaderArgs>> bypassCacheOnRequestHeaders) {
            this.bypassCacheOnRequestHeaders = bypassCacheOnRequestHeaders;
            return this;
        }

        public Builder bypassCacheOnRequestHeaders(@Nullable List<BackendServiceCdnPolicyBypassCacheOnRequestHeaderArgs> bypassCacheOnRequestHeaders) {
            this.bypassCacheOnRequestHeaders = Output.ofNullable(bypassCacheOnRequestHeaders);
            return this;
        }

        public Builder cacheKeyPolicy(@Nullable Output<CacheKeyPolicyArgs> cacheKeyPolicy) {
            this.cacheKeyPolicy = cacheKeyPolicy;
            return this;
        }

        public Builder cacheKeyPolicy(@Nullable CacheKeyPolicyArgs cacheKeyPolicy) {
            this.cacheKeyPolicy = Output.ofNullable(cacheKeyPolicy);
            return this;
        }

        public Builder cacheMode(@Nullable Output<BackendServiceCdnPolicyCacheMode> cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }

        public Builder cacheMode(@Nullable BackendServiceCdnPolicyCacheMode cacheMode) {
            this.cacheMode = Output.ofNullable(cacheMode);
            return this;
        }

        public Builder clientTtl(@Nullable Output<Integer> clientTtl) {
            this.clientTtl = clientTtl;
            return this;
        }

        public Builder clientTtl(@Nullable Integer clientTtl) {
            this.clientTtl = Output.ofNullable(clientTtl);
            return this;
        }

        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = Output.ofNullable(defaultTtl);
            return this;
        }

        public Builder maxTtl(@Nullable Output<Integer> maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }

        public Builder maxTtl(@Nullable Integer maxTtl) {
            this.maxTtl = Output.ofNullable(maxTtl);
            return this;
        }

        public Builder negativeCaching(@Nullable Output<Boolean> negativeCaching) {
            this.negativeCaching = negativeCaching;
            return this;
        }

        public Builder negativeCaching(@Nullable Boolean negativeCaching) {
            this.negativeCaching = Output.ofNullable(negativeCaching);
            return this;
        }

        public Builder negativeCachingPolicy(@Nullable Output<List<BackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicy) {
            this.negativeCachingPolicy = negativeCachingPolicy;
            return this;
        }

        public Builder negativeCachingPolicy(@Nullable List<BackendServiceCdnPolicyNegativeCachingPolicyArgs> negativeCachingPolicy) {
            this.negativeCachingPolicy = Output.ofNullable(negativeCachingPolicy);
            return this;
        }

        public Builder requestCoalescing(@Nullable Output<Boolean> requestCoalescing) {
            this.requestCoalescing = requestCoalescing;
            return this;
        }

        public Builder requestCoalescing(@Nullable Boolean requestCoalescing) {
            this.requestCoalescing = Output.ofNullable(requestCoalescing);
            return this;
        }

        public Builder serveWhileStale(@Nullable Output<Integer> serveWhileStale) {
            this.serveWhileStale = serveWhileStale;
            return this;
        }

        public Builder serveWhileStale(@Nullable Integer serveWhileStale) {
            this.serveWhileStale = Output.ofNullable(serveWhileStale);
            return this;
        }

        public Builder signedUrlCacheMaxAgeSec(@Nullable Output<String> signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
            return this;
        }

        public Builder signedUrlCacheMaxAgeSec(@Nullable String signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = Output.ofNullable(signedUrlCacheMaxAgeSec);
            return this;
        }
        public BackendServiceCdnPolicyArgs build() {
            return new BackendServiceCdnPolicyArgs(bypassCacheOnRequestHeaders, cacheKeyPolicy, cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicy, requestCoalescing, serveWhileStale, signedUrlCacheMaxAgeSec);
        }
    }
}
