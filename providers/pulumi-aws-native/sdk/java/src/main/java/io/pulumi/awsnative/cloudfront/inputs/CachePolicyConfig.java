// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOrigin;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CachePolicyConfig extends io.pulumi.resources.InvokeArgs {

    public static final CachePolicyConfig Empty = new CachePolicyConfig();

    @InputImport(name="comment")
        private final @Nullable String comment;

    public Optional<String> getComment() {
        return this.comment == null ? Optional.empty() : Optional.ofNullable(this.comment);
    }

    @InputImport(name="defaultTTL", required=true)
        private final Double defaultTTL;

    public Double getDefaultTTL() {
        return this.defaultTTL;
    }

    @InputImport(name="maxTTL", required=true)
        private final Double maxTTL;

    public Double getMaxTTL() {
        return this.maxTTL;
    }

    @InputImport(name="minTTL", required=true)
        private final Double minTTL;

    public Double getMinTTL() {
        return this.minTTL;
    }

    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="parametersInCacheKeyAndForwardedToOrigin", required=true)
        private final CachePolicyParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin;

    public CachePolicyParametersInCacheKeyAndForwardedToOrigin getParametersInCacheKeyAndForwardedToOrigin() {
        return this.parametersInCacheKeyAndForwardedToOrigin;
    }

    public CachePolicyConfig(
        @Nullable String comment,
        Double defaultTTL,
        Double maxTTL,
        Double minTTL,
        String name,
        CachePolicyParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin) {
        this.comment = comment;
        this.defaultTTL = Objects.requireNonNull(defaultTTL, "expected parameter 'defaultTTL' to be non-null");
        this.maxTTL = Objects.requireNonNull(maxTTL, "expected parameter 'maxTTL' to be non-null");
        this.minTTL = Objects.requireNonNull(minTTL, "expected parameter 'minTTL' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parametersInCacheKeyAndForwardedToOrigin = Objects.requireNonNull(parametersInCacheKeyAndForwardedToOrigin, "expected parameter 'parametersInCacheKeyAndForwardedToOrigin' to be non-null");
    }

    private CachePolicyConfig() {
        this.comment = null;
        this.defaultTTL = null;
        this.maxTTL = null;
        this.minTTL = null;
        this.name = null;
        this.parametersInCacheKeyAndForwardedToOrigin = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private Double defaultTTL;
        private Double maxTTL;
        private Double minTTL;
        private String name;
        private CachePolicyParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.defaultTTL = defaults.defaultTTL;
    	      this.maxTTL = defaults.maxTTL;
    	      this.minTTL = defaults.minTTL;
    	      this.name = defaults.name;
    	      this.parametersInCacheKeyAndForwardedToOrigin = defaults.parametersInCacheKeyAndForwardedToOrigin;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setDefaultTTL(Double defaultTTL) {
            this.defaultTTL = Objects.requireNonNull(defaultTTL);
            return this;
        }

        public Builder setMaxTTL(Double maxTTL) {
            this.maxTTL = Objects.requireNonNull(maxTTL);
            return this;
        }

        public Builder setMinTTL(Double minTTL) {
            this.minTTL = Objects.requireNonNull(minTTL);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParametersInCacheKeyAndForwardedToOrigin(CachePolicyParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin) {
            this.parametersInCacheKeyAndForwardedToOrigin = Objects.requireNonNull(parametersInCacheKeyAndForwardedToOrigin);
            return this;
        }
        public CachePolicyConfig build() {
            return new CachePolicyConfig(comment, defaultTTL, maxTTL, minTTL, name, parametersInCacheKeyAndForwardedToOrigin);
        }
    }
}
