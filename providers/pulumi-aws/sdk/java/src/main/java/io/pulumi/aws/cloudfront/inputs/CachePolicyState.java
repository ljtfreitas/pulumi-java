// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyState extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyState Empty = new CachePolicyState();

    /**
     * A comment to describe the cache policy.
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Output.empty() : this.comment;
    }

    /**
     * The default amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     * 
     */
    @Import(name="defaultTtl")
      private final @Nullable Output<Integer> defaultTtl;

    public Output<Integer> getDefaultTtl() {
        return this.defaultTtl == null ? Output.empty() : this.defaultTtl;
    }

    /**
     * The current version of the cache policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     * 
     */
    @Import(name="maxTtl")
      private final @Nullable Output<Integer> maxTtl;

    public Output<Integer> getMaxTtl() {
        return this.maxTtl == null ? Output.empty() : this.maxTtl;
    }

    /**
     * The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     * 
     */
    @Import(name="minTtl")
      private final @Nullable Output<Integer> minTtl;

    public Output<Integer> getMinTtl() {
        return this.minTtl == null ? Output.empty() : this.minTtl;
    }

    /**
     * A unique name to identify the cache policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The HTTP headers, cookies, and URL query strings to include in the cache key. See Parameters In Cache Key And Forwarded To Origin for more information.
     * 
     */
    @Import(name="parametersInCacheKeyAndForwardedToOrigin")
      private final @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs> parametersInCacheKeyAndForwardedToOrigin;

    public Output<CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs> getParametersInCacheKeyAndForwardedToOrigin() {
        return this.parametersInCacheKeyAndForwardedToOrigin == null ? Output.empty() : this.parametersInCacheKeyAndForwardedToOrigin;
    }

    public CachePolicyState(
        @Nullable Output<String> comment,
        @Nullable Output<Integer> defaultTtl,
        @Nullable Output<String> etag,
        @Nullable Output<Integer> maxTtl,
        @Nullable Output<Integer> minTtl,
        @Nullable Output<String> name,
        @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs> parametersInCacheKeyAndForwardedToOrigin) {
        this.comment = comment;
        this.defaultTtl = defaultTtl;
        this.etag = etag;
        this.maxTtl = maxTtl;
        this.minTtl = minTtl;
        this.name = name;
        this.parametersInCacheKeyAndForwardedToOrigin = parametersInCacheKeyAndForwardedToOrigin;
    }

    private CachePolicyState() {
        this.comment = Output.empty();
        this.defaultTtl = Output.empty();
        this.etag = Output.empty();
        this.maxTtl = Output.empty();
        this.minTtl = Output.empty();
        this.name = Output.empty();
        this.parametersInCacheKeyAndForwardedToOrigin = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;
        private @Nullable Output<Integer> defaultTtl;
        private @Nullable Output<String> etag;
        private @Nullable Output<Integer> maxTtl;
        private @Nullable Output<Integer> minTtl;
        private @Nullable Output<String> name;
        private @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs> parametersInCacheKeyAndForwardedToOrigin;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.etag = defaults.etag;
    	      this.maxTtl = defaults.maxTtl;
    	      this.minTtl = defaults.minTtl;
    	      this.name = defaults.name;
    	      this.parametersInCacheKeyAndForwardedToOrigin = defaults.parametersInCacheKeyAndForwardedToOrigin;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = Output.ofNullable(comment);
            return this;
        }

        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = Output.ofNullable(defaultTtl);
            return this;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder maxTtl(@Nullable Output<Integer> maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }

        public Builder maxTtl(@Nullable Integer maxTtl) {
            this.maxTtl = Output.ofNullable(maxTtl);
            return this;
        }

        public Builder minTtl(@Nullable Output<Integer> minTtl) {
            this.minTtl = minTtl;
            return this;
        }

        public Builder minTtl(@Nullable Integer minTtl) {
            this.minTtl = Output.ofNullable(minTtl);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder parametersInCacheKeyAndForwardedToOrigin(@Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs> parametersInCacheKeyAndForwardedToOrigin) {
            this.parametersInCacheKeyAndForwardedToOrigin = parametersInCacheKeyAndForwardedToOrigin;
            return this;
        }

        public Builder parametersInCacheKeyAndForwardedToOrigin(@Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs parametersInCacheKeyAndForwardedToOrigin) {
            this.parametersInCacheKeyAndForwardedToOrigin = Output.ofNullable(parametersInCacheKeyAndForwardedToOrigin);
            return this;
        }
        public CachePolicyState build() {
            return new CachePolicyState(comment, defaultTtl, etag, maxTtl, minTtl, name, parametersInCacheKeyAndForwardedToOrigin);
        }
    }
}
