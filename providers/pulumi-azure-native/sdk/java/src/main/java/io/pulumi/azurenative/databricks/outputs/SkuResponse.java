// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkuResponse {
    /**
     * The SKU name.
     * 
     */
    private final String name;
    /**
     * The SKU tier.
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private SkuResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.name = name;
        this.tier = tier;
    }

    /**
     * The SKU name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The SKU tier.
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
        private String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public SkuResponse build() {
            return new SkuResponse(name, tier);
        }
    }
}
