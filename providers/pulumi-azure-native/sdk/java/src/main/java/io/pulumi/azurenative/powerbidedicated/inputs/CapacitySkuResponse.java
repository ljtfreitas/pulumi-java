// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbidedicated.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the SKU name and Azure pricing tier for PowerBI Dedicated capacity resource.
 * 
 */
public final class CapacitySkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final CapacitySkuResponse Empty = new CapacitySkuResponse();

    /**
     * The capacity of the SKU.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Integer capacity;

    public Optional<Integer> getCapacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * Name of the SKU level.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The name of the Azure pricing tier to which the SKU applies.
     * 
     */
    @Import(name="tier")
      private final @Nullable String tier;

    public Optional<String> getTier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public CapacitySkuResponse(
        @Nullable Integer capacity,
        String name,
        @Nullable String tier) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tier = tier;
    }

    private CapacitySkuResponse() {
        this.capacity = null;
        this.name = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacitySkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacitySkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public CapacitySkuResponse build() {
            return new CapacitySkuResponse(capacity, name, tier);
        }
    }
}
