// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The SKU that defines the tier and kind of the peering.
 * 
 */
public final class PeeringSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final PeeringSkuResponse Empty = new PeeringSkuResponse();

    /**
     * The family of the peering SKU.
     * 
     */
    @InputImport(name="family")
        private final @Nullable String family;

    public Optional<String> getFamily() {
        return this.family == null ? Optional.empty() : Optional.ofNullable(this.family);
    }

    /**
     * The name of the peering SKU.
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The size of the peering SKU.
     * 
     */
    @InputImport(name="size")
        private final @Nullable String size;

    public Optional<String> getSize() {
        return this.size == null ? Optional.empty() : Optional.ofNullable(this.size);
    }

    /**
     * The tier of the peering SKU.
     * 
     */
    @InputImport(name="tier")
        private final @Nullable String tier;

    public Optional<String> getTier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public PeeringSkuResponse(
        @Nullable String family,
        @Nullable String name,
        @Nullable String size,
        @Nullable String tier) {
        this.family = family;
        this.name = name;
        this.size = size;
        this.tier = tier;
    }

    private PeeringSkuResponse() {
        this.family = null;
        this.name = null;
        this.size = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String family;
        private @Nullable String name;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder setFamily(@Nullable String family) {
            this.family = family;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = size;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public PeeringSkuResponse build() {
            return new PeeringSkuResponse(family, name, size, tier);
        }
    }
}
