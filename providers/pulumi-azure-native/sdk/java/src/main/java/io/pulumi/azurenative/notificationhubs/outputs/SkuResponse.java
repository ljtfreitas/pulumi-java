// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkuResponse {
    /**
     * The capacity of the resource
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * The Sku Family
     * 
     */
    private final @Nullable String family;
    /**
     * Name of the notification hub sku
     * 
     */
    private final String name;
    /**
     * The Sku size
     * 
     */
    private final @Nullable String size;
    /**
     * The tier of particular sku
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private SkuResponse(
        @CustomType.Parameter("capacity") @Nullable Integer capacity,
        @CustomType.Parameter("family") @Nullable String family,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("size") @Nullable String size,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.family = family;
        this.name = name;
        this.size = size;
        this.tier = tier;
    }

    /**
     * The capacity of the resource
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * The Sku Family
     * 
    */
    public Optional<String> getFamily() {
        return Optional.ofNullable(this.family);
    }
    /**
     * Name of the notification hub sku
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The Sku size
     * 
    */
    public Optional<String> getSize() {
        return Optional.ofNullable(this.size);
    }
    /**
     * The tier of particular sku
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String family;
        private String name;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder family(@Nullable String family) {
            this.family = family;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public SkuResponse build() {
            return new SkuResponse(capacity, family, name, size, tier);
        }
    }
}
