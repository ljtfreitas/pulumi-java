// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs();

    /**
     * Determines whether any URL query strings in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    @Import(name="queryStringBehavior", required=true)
      private final Output<String> queryStringBehavior;

    public Output<String> getQueryStringBehavior() {
        return this.queryStringBehavior;
    }

    /**
     * Object that contains a list of query string names. See Items for more information.
     * 
     */
    @Import(name="queryStrings")
      private final @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs> queryStrings;

    public Output<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs> getQueryStrings() {
        return this.queryStrings == null ? Output.empty() : this.queryStrings;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs(
        Output<String> queryStringBehavior,
        @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs> queryStrings) {
        this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior, "expected parameter 'queryStringBehavior' to be non-null");
        this.queryStrings = queryStrings;
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs() {
        this.queryStringBehavior = Output.empty();
        this.queryStrings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> queryStringBehavior;
        private @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder queryStringBehavior(Output<String> queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public Builder queryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Output.of(Objects.requireNonNull(queryStringBehavior));
            return this;
        }

        public Builder queryStrings(@Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }

        public Builder queryStrings(@Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs queryStrings) {
            this.queryStrings = Output.ofNullable(queryStrings);
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs(queryStringBehavior, queryStrings);
        }
    }
}
