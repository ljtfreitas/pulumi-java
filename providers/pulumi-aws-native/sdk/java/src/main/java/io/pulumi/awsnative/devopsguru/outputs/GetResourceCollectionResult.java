// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru.outputs;

import io.pulumi.awsnative.devopsguru.enums.ResourceCollectionType;
import io.pulumi.awsnative.devopsguru.outputs.ResourceCollectionFilter;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResourceCollectionResult {
    private final @Nullable ResourceCollectionFilter resourceCollectionFilter;
    /**
     * The type of ResourceCollection
     * 
     */
    private final @Nullable ResourceCollectionType resourceCollectionType;

    @CustomType.Constructor
    private GetResourceCollectionResult(
        @CustomType.Parameter("resourceCollectionFilter") @Nullable ResourceCollectionFilter resourceCollectionFilter,
        @CustomType.Parameter("resourceCollectionType") @Nullable ResourceCollectionType resourceCollectionType) {
        this.resourceCollectionFilter = resourceCollectionFilter;
        this.resourceCollectionType = resourceCollectionType;
    }

    public Optional<ResourceCollectionFilter> getResourceCollectionFilter() {
        return Optional.ofNullable(this.resourceCollectionFilter);
    }
    /**
     * The type of ResourceCollection
     * 
    */
    public Optional<ResourceCollectionType> getResourceCollectionType() {
        return Optional.ofNullable(this.resourceCollectionType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceCollectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceCollectionFilter resourceCollectionFilter;
        private @Nullable ResourceCollectionType resourceCollectionType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceCollectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceCollectionFilter = defaults.resourceCollectionFilter;
    	      this.resourceCollectionType = defaults.resourceCollectionType;
        }

        public Builder resourceCollectionFilter(@Nullable ResourceCollectionFilter resourceCollectionFilter) {
            this.resourceCollectionFilter = resourceCollectionFilter;
            return this;
        }

        public Builder resourceCollectionType(@Nullable ResourceCollectionType resourceCollectionType) {
            this.resourceCollectionType = resourceCollectionType;
            return this;
        }
        public GetResourceCollectionResult build() {
            return new GetResourceCollectionResult(resourceCollectionFilter, resourceCollectionType);
        }
    }
}
