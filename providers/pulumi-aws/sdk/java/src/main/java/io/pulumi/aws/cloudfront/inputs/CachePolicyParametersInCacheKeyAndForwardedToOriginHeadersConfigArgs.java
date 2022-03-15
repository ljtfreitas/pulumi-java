// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs();

    /**
     * Determines whether any HTTP headers are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`.
     * 
     */
    @Import(name="headerBehavior")
      private final @Nullable Output<String> headerBehavior;

    public Output<String> getHeaderBehavior() {
        return this.headerBehavior == null ? Output.empty() : this.headerBehavior;
    }

    /**
     * Object that contains a list of header names. See Items for more information.
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs> headers;

    public Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs> getHeaders() {
        return this.headers == null ? Output.empty() : this.headers;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs(
        @Nullable Output<String> headerBehavior,
        @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs> headers) {
        this.headerBehavior = headerBehavior;
        this.headers = headers;
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs() {
        this.headerBehavior = Output.empty();
        this.headers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> headerBehavior;
        private @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs> headers;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerBehavior = defaults.headerBehavior;
    	      this.headers = defaults.headers;
        }

        public Builder headerBehavior(@Nullable Output<String> headerBehavior) {
            this.headerBehavior = headerBehavior;
            return this;
        }

        public Builder headerBehavior(@Nullable String headerBehavior) {
            this.headerBehavior = Output.ofNullable(headerBehavior);
            return this;
        }

        public Builder headers(@Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs> headers) {
            this.headers = headers;
            return this;
        }

        public Builder headers(@Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs headers) {
            this.headers = Output.ofNullable(headers);
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs(headerBehavior, headers);
        }
    }
}
