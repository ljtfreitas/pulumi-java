// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HttpRedirectActionResponse {
    /**
     * The host that is used in the redirect response instead of the one that was supplied in the request. The value must be from 1 to 255 characters.
     * 
     */
    private final String hostRedirect;
    /**
     * If set to true, the URL scheme in the redirected request is set to HTTPS. If set to false, the URL scheme of the redirected request remains the same as that of the request. This must only be set for URL maps used in TargetHttpProxys. Setting this true for TargetHttpsProxy is not permitted. The default is set to false.
     * 
     */
    private final Boolean httpsRedirect;
    /**
     * The path that is used in the redirect response instead of the one that was supplied in the request. pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
     * 
     */
    private final String pathRedirect;
    /**
     * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch, retaining the remaining portion of the URL before redirecting the request. prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
     * 
     */
    private final String prefixRedirect;
    /**
     * The HTTP Status code to use for this RedirectAction. Supported values are: - MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301. - FOUND, which corresponds to 302. - SEE_OTHER which corresponds to 303. - TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method is retained. - PERMANENT_REDIRECT, which corresponds to 308. In this case, the request method is retained.
     * 
     */
    private final String redirectResponseCode;
    /**
     * If set to true, any accompanying query portion of the original URL is removed before redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
     * 
     */
    private final Boolean stripQuery;

    @OutputCustomType.Constructor({"hostRedirect","httpsRedirect","pathRedirect","prefixRedirect","redirectResponseCode","stripQuery"})
    private HttpRedirectActionResponse(
        String hostRedirect,
        Boolean httpsRedirect,
        String pathRedirect,
        String prefixRedirect,
        String redirectResponseCode,
        Boolean stripQuery) {
        this.hostRedirect = Objects.requireNonNull(hostRedirect);
        this.httpsRedirect = Objects.requireNonNull(httpsRedirect);
        this.pathRedirect = Objects.requireNonNull(pathRedirect);
        this.prefixRedirect = Objects.requireNonNull(prefixRedirect);
        this.redirectResponseCode = Objects.requireNonNull(redirectResponseCode);
        this.stripQuery = Objects.requireNonNull(stripQuery);
    }

    /**
     * The host that is used in the redirect response instead of the one that was supplied in the request. The value must be from 1 to 255 characters.
     * 
     */
    public String getHostRedirect() {
        return this.hostRedirect;
    }
    /**
     * If set to true, the URL scheme in the redirected request is set to HTTPS. If set to false, the URL scheme of the redirected request remains the same as that of the request. This must only be set for URL maps used in TargetHttpProxys. Setting this true for TargetHttpsProxy is not permitted. The default is set to false.
     * 
     */
    public Boolean getHttpsRedirect() {
        return this.httpsRedirect;
    }
    /**
     * The path that is used in the redirect response instead of the one that was supplied in the request. pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
     * 
     */
    public String getPathRedirect() {
        return this.pathRedirect;
    }
    /**
     * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch, retaining the remaining portion of the URL before redirecting the request. prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
     * 
     */
    public String getPrefixRedirect() {
        return this.prefixRedirect;
    }
    /**
     * The HTTP Status code to use for this RedirectAction. Supported values are: - MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301. - FOUND, which corresponds to 302. - SEE_OTHER which corresponds to 303. - TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method is retained. - PERMANENT_REDIRECT, which corresponds to 308. In this case, the request method is retained.
     * 
     */
    public String getRedirectResponseCode() {
        return this.redirectResponseCode;
    }
    /**
     * If set to true, any accompanying query portion of the original URL is removed before redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
     * 
     */
    public Boolean getStripQuery() {
        return this.stripQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRedirectActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostRedirect;
        private Boolean httpsRedirect;
        private String pathRedirect;
        private String prefixRedirect;
        private String redirectResponseCode;
        private Boolean stripQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRedirectActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRedirect = defaults.hostRedirect;
    	      this.httpsRedirect = defaults.httpsRedirect;
    	      this.pathRedirect = defaults.pathRedirect;
    	      this.prefixRedirect = defaults.prefixRedirect;
    	      this.redirectResponseCode = defaults.redirectResponseCode;
    	      this.stripQuery = defaults.stripQuery;
        }

        public Builder setHostRedirect(String hostRedirect) {
            this.hostRedirect = Objects.requireNonNull(hostRedirect);
            return this;
        }

        public Builder setHttpsRedirect(Boolean httpsRedirect) {
            this.httpsRedirect = Objects.requireNonNull(httpsRedirect);
            return this;
        }

        public Builder setPathRedirect(String pathRedirect) {
            this.pathRedirect = Objects.requireNonNull(pathRedirect);
            return this;
        }

        public Builder setPrefixRedirect(String prefixRedirect) {
            this.prefixRedirect = Objects.requireNonNull(prefixRedirect);
            return this;
        }

        public Builder setRedirectResponseCode(String redirectResponseCode) {
            this.redirectResponseCode = Objects.requireNonNull(redirectResponseCode);
            return this;
        }

        public Builder setStripQuery(Boolean stripQuery) {
            this.stripQuery = Objects.requireNonNull(stripQuery);
            return this;
        }
        public HttpRedirectActionResponse build() {
            return new HttpRedirectActionResponse(hostRedirect, httpsRedirect, pathRedirect, prefixRedirect, redirectResponseCode, stripQuery);
        }
    }
}
