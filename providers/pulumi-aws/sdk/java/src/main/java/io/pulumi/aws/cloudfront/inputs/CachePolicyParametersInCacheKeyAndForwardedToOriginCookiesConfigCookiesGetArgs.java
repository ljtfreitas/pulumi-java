// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs();

    /**
     * A list of item names (cookies, headers, or query strings).
     * 
     */
    @InputImport(name="items")
    private final @Nullable Input<List<String>> items;

    public Input<List<String>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs(@Nullable Input<List<String>> items) {
        this.items = items;
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs() {
        this.items = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(@Nullable Input<List<String>> items) {
            this.items = items;
            return this;
        }

        public Builder setItems(@Nullable List<String> items) {
            this.items = Input.ofNullable(items);
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs(items);
        }
    }
}
