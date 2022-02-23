// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs();

    /**
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    @InputImport(name="cookieBehavior", required=true)
    private final Input<String> cookieBehavior;

    public Input<String> getCookieBehavior() {
        return this.cookieBehavior;
    }

    /**
     * Object that contains a list of cookie names. See Items for more information.
     * 
     */
    @InputImport(name="cookies")
    private final @Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs> cookies;

    public Input<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs> getCookies() {
        return this.cookies == null ? Input.empty() : this.cookies;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs(
        Input<String> cookieBehavior,
        @Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs> cookies) {
        this.cookieBehavior = Objects.requireNonNull(cookieBehavior, "expected parameter 'cookieBehavior' to be non-null");
        this.cookies = cookies;
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs() {
        this.cookieBehavior = Input.empty();
        this.cookies = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cookieBehavior;
        private @Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs> cookies;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        public Builder setCookieBehavior(Input<String> cookieBehavior) {
            this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
            return this;
        }

        public Builder setCookieBehavior(String cookieBehavior) {
            this.cookieBehavior = Input.of(Objects.requireNonNull(cookieBehavior));
            return this;
        }

        public Builder setCookies(@Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs> cookies) {
            this.cookies = cookies;
            return this;
        }

        public Builder setCookies(@Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs cookies) {
            this.cookies = Input.ofNullable(cookies);
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs(cookieBehavior, cookies);
        }
    }
}
