// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectArgs();

    /**
     * The host that will be used in the redirect response instead of the one that was supplied in the request.
     * 
     */
    @Import(name="hostRedirect")
      private final @Nullable Output<String> hostRedirect;

    public Output<String> getHostRedirect() {
        return this.hostRedirect == null ? Output.empty() : this.hostRedirect;
    }

    /**
     * If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request.
     * This can only be set if there is at least one (1) edgeSslCertificate set on the service.
     * 
     */
    @Import(name="httpsRedirect")
      private final @Nullable Output<Boolean> httpsRedirect;

    public Output<Boolean> getHttpsRedirect() {
        return this.httpsRedirect == null ? Output.empty() : this.httpsRedirect;
    }

    /**
     * The path that will be used in the redirect response instead of the one that was supplied in the request.
     * pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * The path value must be between 1 and 1024 characters.
     * 
     */
    @Import(name="pathRedirect")
      private final @Nullable Output<String> pathRedirect;

    public Output<String> getPathRedirect() {
        return this.pathRedirect == null ? Output.empty() : this.pathRedirect;
    }

    /**
     * The prefix that replaces the prefixMatch specified in the routeRule, retaining the remaining portion of the URL before redirecting the request.
     * prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * 
     */
    @Import(name="prefixRedirect")
      private final @Nullable Output<String> prefixRedirect;

    public Output<String> getPrefixRedirect() {
        return this.prefixRedirect == null ? Output.empty() : this.prefixRedirect;
    }

    /**
     * The HTTP Status code to use for this RedirectAction.
     * The supported values are:
     * - `MOVED_PERMANENTLY_DEFAULT`, which is the default value and corresponds to 301.
     * - `FOUND`, which corresponds to 302.
     * 
     */
    @Import(name="redirectResponseCode")
      private final @Nullable Output<String> redirectResponseCode;

    public Output<String> getRedirectResponseCode() {
        return this.redirectResponseCode == null ? Output.empty() : this.redirectResponseCode;
    }

    /**
     * If set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained.
     * 
     */
    @Import(name="stripQuery")
      private final @Nullable Output<Boolean> stripQuery;

    public Output<Boolean> getStripQuery() {
        return this.stripQuery == null ? Output.empty() : this.stripQuery;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectArgs(
        @Nullable Output<String> hostRedirect,
        @Nullable Output<Boolean> httpsRedirect,
        @Nullable Output<String> pathRedirect,
        @Nullable Output<String> prefixRedirect,
        @Nullable Output<String> redirectResponseCode,
        @Nullable Output<Boolean> stripQuery) {
        this.hostRedirect = hostRedirect;
        this.httpsRedirect = httpsRedirect;
        this.pathRedirect = pathRedirect;
        this.prefixRedirect = prefixRedirect;
        this.redirectResponseCode = redirectResponseCode;
        this.stripQuery = stripQuery;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectArgs() {
        this.hostRedirect = Output.empty();
        this.httpsRedirect = Output.empty();
        this.pathRedirect = Output.empty();
        this.prefixRedirect = Output.empty();
        this.redirectResponseCode = Output.empty();
        this.stripQuery = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostRedirect;
        private @Nullable Output<Boolean> httpsRedirect;
        private @Nullable Output<String> pathRedirect;
        private @Nullable Output<String> prefixRedirect;
        private @Nullable Output<String> redirectResponseCode;
        private @Nullable Output<Boolean> stripQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRedirect = defaults.hostRedirect;
    	      this.httpsRedirect = defaults.httpsRedirect;
    	      this.pathRedirect = defaults.pathRedirect;
    	      this.prefixRedirect = defaults.prefixRedirect;
    	      this.redirectResponseCode = defaults.redirectResponseCode;
    	      this.stripQuery = defaults.stripQuery;
        }

        public Builder hostRedirect(@Nullable Output<String> hostRedirect) {
            this.hostRedirect = hostRedirect;
            return this;
        }

        public Builder hostRedirect(@Nullable String hostRedirect) {
            this.hostRedirect = Output.ofNullable(hostRedirect);
            return this;
        }

        public Builder httpsRedirect(@Nullable Output<Boolean> httpsRedirect) {
            this.httpsRedirect = httpsRedirect;
            return this;
        }

        public Builder httpsRedirect(@Nullable Boolean httpsRedirect) {
            this.httpsRedirect = Output.ofNullable(httpsRedirect);
            return this;
        }

        public Builder pathRedirect(@Nullable Output<String> pathRedirect) {
            this.pathRedirect = pathRedirect;
            return this;
        }

        public Builder pathRedirect(@Nullable String pathRedirect) {
            this.pathRedirect = Output.ofNullable(pathRedirect);
            return this;
        }

        public Builder prefixRedirect(@Nullable Output<String> prefixRedirect) {
            this.prefixRedirect = prefixRedirect;
            return this;
        }

        public Builder prefixRedirect(@Nullable String prefixRedirect) {
            this.prefixRedirect = Output.ofNullable(prefixRedirect);
            return this;
        }

        public Builder redirectResponseCode(@Nullable Output<String> redirectResponseCode) {
            this.redirectResponseCode = redirectResponseCode;
            return this;
        }

        public Builder redirectResponseCode(@Nullable String redirectResponseCode) {
            this.redirectResponseCode = Output.ofNullable(redirectResponseCode);
            return this;
        }

        public Builder stripQuery(@Nullable Output<Boolean> stripQuery) {
            this.stripQuery = stripQuery;
            return this;
        }

        public Builder stripQuery(@Nullable Boolean stripQuery) {
            this.stripQuery = Output.ofNullable(stripQuery);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectArgs(hostRedirect, httpsRedirect, pathRedirect, prefixRedirect, redirectResponseCode, stripQuery);
        }
    }
}
