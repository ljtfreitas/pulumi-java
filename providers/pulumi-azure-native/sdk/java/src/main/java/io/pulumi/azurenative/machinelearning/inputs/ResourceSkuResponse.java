// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The SKU of a resource.
 * 
 */
public final class ResourceSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceSkuResponse Empty = new ResourceSkuResponse();

    /**
     * The scale-out capacity of the resource. 1 is 1x, 2 is 2x, etc. This impacts the quantities and cost of any commitment plan resource.
     * 
     */
    @InputImport(name="capacity")
        private final @Nullable Integer capacity;

    public Optional<Integer> getCapacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * The SKU name. Along with tier, uniquely identifies the SKU.
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The SKU tier. Along with name, uniquely identifies the SKU.
     * 
     */
    @InputImport(name="tier")
        private final @Nullable String tier;

    public Optional<String> getTier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public ResourceSkuResponse(
        @Nullable Integer capacity,
        @Nullable String name,
        @Nullable String tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    private ResourceSkuResponse() {
        this.capacity = null;
        this.name = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public ResourceSkuResponse build() {
            return new ResourceSkuResponse(capacity, name, tier);
        }
    }
}
