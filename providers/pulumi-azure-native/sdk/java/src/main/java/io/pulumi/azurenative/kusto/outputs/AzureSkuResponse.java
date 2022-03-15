// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureSkuResponse {
    /**
     * The number of instances of the cluster.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * SKU name.
     * 
     */
    private final String name;
    /**
     * SKU tier.
     * 
     */
    private final String tier;

    @CustomType.Constructor
    private AzureSkuResponse(
        @CustomType.Parameter("capacity") @Nullable Integer capacity,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tier") String tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    /**
     * The number of instances of the cluster.
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * SKU name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * SKU tier.
     * 
    */
    public String getTier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSkuResponse defaults) {
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

        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public AzureSkuResponse build() {
            return new AzureSkuResponse(capacity, name, tier);
        }
    }
}
