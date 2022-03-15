// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Message containing what to include in the cache key for a request for Cloud CDN.
 * 
 */
public final class CacheKeyPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final CacheKeyPolicyResponse Empty = new CacheKeyPolicyResponse();

    /**
     * If true, requests to different hosts will be cached separately.
     * 
     */
    @Import(name="includeHost", required=true)
      private final Boolean includeHost;

    public Boolean getIncludeHost() {
        return this.includeHost;
    }

    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    @Import(name="includeHttpHeaders", required=true)
      private final List<String> includeHttpHeaders;

    public List<String> getIncludeHttpHeaders() {
        return this.includeHttpHeaders;
    }

    /**
     * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
     * 
     */
    @Import(name="includeNamedCookies", required=true)
      private final List<String> includeNamedCookies;

    public List<String> getIncludeNamedCookies() {
        return this.includeNamedCookies;
    }

    /**
     * If true, http and https requests will be cached separately.
     * 
     */
    @Import(name="includeProtocol", required=true)
      private final Boolean includeProtocol;

    public Boolean getIncludeProtocol() {
        return this.includeProtocol;
    }

    /**
     * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be included. If false, the query string will be excluded from the cache key entirely.
     * 
     */
    @Import(name="includeQueryString", required=true)
      private final Boolean includeQueryString;

    public Boolean getIncludeQueryString() {
        return this.includeQueryString;
    }

    /**
     * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    @Import(name="queryStringBlacklist", required=true)
      private final List<String> queryStringBlacklist;

    public List<String> getQueryStringBlacklist() {
        return this.queryStringBlacklist;
    }

    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    @Import(name="queryStringWhitelist", required=true)
      private final List<String> queryStringWhitelist;

    public List<String> getQueryStringWhitelist() {
        return this.queryStringWhitelist;
    }

    public CacheKeyPolicyResponse(
        Boolean includeHost,
        List<String> includeHttpHeaders,
        List<String> includeNamedCookies,
        Boolean includeProtocol,
        Boolean includeQueryString,
        List<String> queryStringBlacklist,
        List<String> queryStringWhitelist) {
        this.includeHost = Objects.requireNonNull(includeHost, "expected parameter 'includeHost' to be non-null");
        this.includeHttpHeaders = Objects.requireNonNull(includeHttpHeaders, "expected parameter 'includeHttpHeaders' to be non-null");
        this.includeNamedCookies = Objects.requireNonNull(includeNamedCookies, "expected parameter 'includeNamedCookies' to be non-null");
        this.includeProtocol = Objects.requireNonNull(includeProtocol, "expected parameter 'includeProtocol' to be non-null");
        this.includeQueryString = Objects.requireNonNull(includeQueryString, "expected parameter 'includeQueryString' to be non-null");
        this.queryStringBlacklist = Objects.requireNonNull(queryStringBlacklist, "expected parameter 'queryStringBlacklist' to be non-null");
        this.queryStringWhitelist = Objects.requireNonNull(queryStringWhitelist, "expected parameter 'queryStringWhitelist' to be non-null");
    }

    private CacheKeyPolicyResponse() {
        this.includeHost = null;
        this.includeHttpHeaders = List.of();
        this.includeNamedCookies = List.of();
        this.includeProtocol = null;
        this.includeQueryString = null;
        this.queryStringBlacklist = List.of();
        this.queryStringWhitelist = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheKeyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean includeHost;
        private List<String> includeHttpHeaders;
        private List<String> includeNamedCookies;
        private Boolean includeProtocol;
        private Boolean includeQueryString;
        private List<String> queryStringBlacklist;
        private List<String> queryStringWhitelist;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheKeyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHost = defaults.includeHost;
    	      this.includeHttpHeaders = defaults.includeHttpHeaders;
    	      this.includeNamedCookies = defaults.includeNamedCookies;
    	      this.includeProtocol = defaults.includeProtocol;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.queryStringBlacklist = defaults.queryStringBlacklist;
    	      this.queryStringWhitelist = defaults.queryStringWhitelist;
        }

        public Builder includeHost(Boolean includeHost) {
            this.includeHost = Objects.requireNonNull(includeHost);
            return this;
        }

        public Builder includeHttpHeaders(List<String> includeHttpHeaders) {
            this.includeHttpHeaders = Objects.requireNonNull(includeHttpHeaders);
            return this;
        }

        public Builder includeNamedCookies(List<String> includeNamedCookies) {
            this.includeNamedCookies = Objects.requireNonNull(includeNamedCookies);
            return this;
        }

        public Builder includeProtocol(Boolean includeProtocol) {
            this.includeProtocol = Objects.requireNonNull(includeProtocol);
            return this;
        }

        public Builder includeQueryString(Boolean includeQueryString) {
            this.includeQueryString = Objects.requireNonNull(includeQueryString);
            return this;
        }

        public Builder queryStringBlacklist(List<String> queryStringBlacklist) {
            this.queryStringBlacklist = Objects.requireNonNull(queryStringBlacklist);
            return this;
        }

        public Builder queryStringWhitelist(List<String> queryStringWhitelist) {
            this.queryStringWhitelist = Objects.requireNonNull(queryStringWhitelist);
            return this;
        }
        public CacheKeyPolicyResponse build() {
            return new CacheKeyPolicyResponse(includeHost, includeHttpHeaders, includeNamedCookies, includeProtocol, includeQueryString, queryStringBlacklist, queryStringWhitelist);
        }
    }
}
