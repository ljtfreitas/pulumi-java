// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie extends io.pulumi.resources.InvokeArgs {

    public static final GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie Empty = new GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie();

    /**
     * A list of item names (`cookies`, `headers`, or `query_strings`).
     * 
     */
    @Import(name="items", required=true)
      private final List<String> items;

    public List<String> getItems() {
        return this.items;
    }

    public GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie(List<String> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie() {
        this.items = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie build() {
            return new GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie(items);
        }
    }
}
