// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig {
    /**
     * Determines whether any URL query strings in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    private final String queryStringBehavior;
    /**
     * Object that contains a list of query string names. See Items for more information.
     * 
     */
    private final List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings;

    @CustomType.Constructor
    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig(
        @CustomType.Parameter("queryStringBehavior") String queryStringBehavior,
        @CustomType.Parameter("queryStrings") List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings) {
        this.queryStringBehavior = queryStringBehavior;
        this.queryStrings = queryStrings;
    }

    /**
     * Determines whether any URL query strings in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
    */
    public String getQueryStringBehavior() {
        return this.queryStringBehavior;
    }
    /**
     * Object that contains a list of query string names. See Items for more information.
     * 
    */
    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> getQueryStrings() {
        return this.queryStrings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queryStringBehavior;
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder queryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public Builder queryStrings(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings) {
            this.queryStrings = Objects.requireNonNull(queryStrings);
            return this;
        }
        public GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig build() {
            return new GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig(queryStringBehavior, queryStrings);
        }
    }
}
