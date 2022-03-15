// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message containing what to include in the cache key for a request for Cloud CDN.
 * 
 */
public final class CacheKeyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheKeyPolicyArgs Empty = new CacheKeyPolicyArgs();

    /**
     * If true, requests to different hosts will be cached separately.
     * 
     */
    @Import(name="includeHost")
      private final @Nullable Output<Boolean> includeHost;

    public Output<Boolean> getIncludeHost() {
        return this.includeHost == null ? Output.empty() : this.includeHost;
    }

    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    @Import(name="includeHttpHeaders")
      private final @Nullable Output<List<String>> includeHttpHeaders;

    public Output<List<String>> getIncludeHttpHeaders() {
        return this.includeHttpHeaders == null ? Output.empty() : this.includeHttpHeaders;
    }

    /**
     * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
     * 
     */
    @Import(name="includeNamedCookies")
      private final @Nullable Output<List<String>> includeNamedCookies;

    public Output<List<String>> getIncludeNamedCookies() {
        return this.includeNamedCookies == null ? Output.empty() : this.includeNamedCookies;
    }

    /**
     * If true, http and https requests will be cached separately.
     * 
     */
    @Import(name="includeProtocol")
      private final @Nullable Output<Boolean> includeProtocol;

    public Output<Boolean> getIncludeProtocol() {
        return this.includeProtocol == null ? Output.empty() : this.includeProtocol;
    }

    /**
     * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be included. If false, the query string will be excluded from the cache key entirely.
     * 
     */
    @Import(name="includeQueryString")
      private final @Nullable Output<Boolean> includeQueryString;

    public Output<Boolean> getIncludeQueryString() {
        return this.includeQueryString == null ? Output.empty() : this.includeQueryString;
    }

    /**
     * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    @Import(name="queryStringBlacklist")
      private final @Nullable Output<List<String>> queryStringBlacklist;

    public Output<List<String>> getQueryStringBlacklist() {
        return this.queryStringBlacklist == null ? Output.empty() : this.queryStringBlacklist;
    }

    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    @Import(name="queryStringWhitelist")
      private final @Nullable Output<List<String>> queryStringWhitelist;

    public Output<List<String>> getQueryStringWhitelist() {
        return this.queryStringWhitelist == null ? Output.empty() : this.queryStringWhitelist;
    }

    public CacheKeyPolicyArgs(
        @Nullable Output<Boolean> includeHost,
        @Nullable Output<List<String>> includeHttpHeaders,
        @Nullable Output<List<String>> includeNamedCookies,
        @Nullable Output<Boolean> includeProtocol,
        @Nullable Output<Boolean> includeQueryString,
        @Nullable Output<List<String>> queryStringBlacklist,
        @Nullable Output<List<String>> queryStringWhitelist) {
        this.includeHost = includeHost;
        this.includeHttpHeaders = includeHttpHeaders;
        this.includeNamedCookies = includeNamedCookies;
        this.includeProtocol = includeProtocol;
        this.includeQueryString = includeQueryString;
        this.queryStringBlacklist = queryStringBlacklist;
        this.queryStringWhitelist = queryStringWhitelist;
    }

    private CacheKeyPolicyArgs() {
        this.includeHost = Output.empty();
        this.includeHttpHeaders = Output.empty();
        this.includeNamedCookies = Output.empty();
        this.includeProtocol = Output.empty();
        this.includeQueryString = Output.empty();
        this.queryStringBlacklist = Output.empty();
        this.queryStringWhitelist = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheKeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> includeHost;
        private @Nullable Output<List<String>> includeHttpHeaders;
        private @Nullable Output<List<String>> includeNamedCookies;
        private @Nullable Output<Boolean> includeProtocol;
        private @Nullable Output<Boolean> includeQueryString;
        private @Nullable Output<List<String>> queryStringBlacklist;
        private @Nullable Output<List<String>> queryStringWhitelist;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheKeyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHost = defaults.includeHost;
    	      this.includeHttpHeaders = defaults.includeHttpHeaders;
    	      this.includeNamedCookies = defaults.includeNamedCookies;
    	      this.includeProtocol = defaults.includeProtocol;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.queryStringBlacklist = defaults.queryStringBlacklist;
    	      this.queryStringWhitelist = defaults.queryStringWhitelist;
        }

        public Builder includeHost(@Nullable Output<Boolean> includeHost) {
            this.includeHost = includeHost;
            return this;
        }

        public Builder includeHost(@Nullable Boolean includeHost) {
            this.includeHost = Output.ofNullable(includeHost);
            return this;
        }

        public Builder includeHttpHeaders(@Nullable Output<List<String>> includeHttpHeaders) {
            this.includeHttpHeaders = includeHttpHeaders;
            return this;
        }

        public Builder includeHttpHeaders(@Nullable List<String> includeHttpHeaders) {
            this.includeHttpHeaders = Output.ofNullable(includeHttpHeaders);
            return this;
        }

        public Builder includeNamedCookies(@Nullable Output<List<String>> includeNamedCookies) {
            this.includeNamedCookies = includeNamedCookies;
            return this;
        }

        public Builder includeNamedCookies(@Nullable List<String> includeNamedCookies) {
            this.includeNamedCookies = Output.ofNullable(includeNamedCookies);
            return this;
        }

        public Builder includeProtocol(@Nullable Output<Boolean> includeProtocol) {
            this.includeProtocol = includeProtocol;
            return this;
        }

        public Builder includeProtocol(@Nullable Boolean includeProtocol) {
            this.includeProtocol = Output.ofNullable(includeProtocol);
            return this;
        }

        public Builder includeQueryString(@Nullable Output<Boolean> includeQueryString) {
            this.includeQueryString = includeQueryString;
            return this;
        }

        public Builder includeQueryString(@Nullable Boolean includeQueryString) {
            this.includeQueryString = Output.ofNullable(includeQueryString);
            return this;
        }

        public Builder queryStringBlacklist(@Nullable Output<List<String>> queryStringBlacklist) {
            this.queryStringBlacklist = queryStringBlacklist;
            return this;
        }

        public Builder queryStringBlacklist(@Nullable List<String> queryStringBlacklist) {
            this.queryStringBlacklist = Output.ofNullable(queryStringBlacklist);
            return this;
        }

        public Builder queryStringWhitelist(@Nullable Output<List<String>> queryStringWhitelist) {
            this.queryStringWhitelist = queryStringWhitelist;
            return this;
        }

        public Builder queryStringWhitelist(@Nullable List<String> queryStringWhitelist) {
            this.queryStringWhitelist = Output.ofNullable(queryStringWhitelist);
            return this;
        }
        public CacheKeyPolicyArgs build() {
            return new CacheKeyPolicyArgs(includeHost, includeHttpHeaders, includeNamedCookies, includeProtocol, includeQueryString, queryStringBlacklist, queryStringWhitelist);
        }
    }
}
