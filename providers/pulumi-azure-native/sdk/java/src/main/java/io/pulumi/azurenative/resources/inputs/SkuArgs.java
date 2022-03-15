// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU for the resource.
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The SKU capacity.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity == null ? Output.empty() : this.capacity;
    }

    /**
     * The SKU family.
     * 
     */
    @Import(name="family")
      private final @Nullable Output<String> family;

    public Output<String> getFamily() {
        return this.family == null ? Output.empty() : this.family;
    }

    /**
     * The SKU model.
     * 
     */
    @Import(name="model")
      private final @Nullable Output<String> model;

    public Output<String> getModel() {
        return this.model == null ? Output.empty() : this.model;
    }

    /**
     * The SKU name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The SKU size.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<String> size;

    public Output<String> getSize() {
        return this.size == null ? Output.empty() : this.size;
    }

    /**
     * The SKU tier.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    public SkuArgs(
        @Nullable Output<Integer> capacity,
        @Nullable Output<String> family,
        @Nullable Output<String> model,
        @Nullable Output<String> name,
        @Nullable Output<String> size,
        @Nullable Output<String> tier) {
        this.capacity = capacity;
        this.family = family;
        this.model = model;
        this.name = name;
        this.size = size;
        this.tier = tier;
    }

    private SkuArgs() {
        this.capacity = Output.empty();
        this.family = Output.empty();
        this.model = Output.empty();
        this.name = Output.empty();
        this.size = Output.empty();
        this.tier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> capacity;
        private @Nullable Output<String> family;
        private @Nullable Output<String> model;
        private @Nullable Output<String> name;
        private @Nullable Output<String> size;
        private @Nullable Output<String> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.model = defaults.model;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Output.ofNullable(capacity);
            return this;
        }

        public Builder family(@Nullable Output<String> family) {
            this.family = family;
            return this;
        }

        public Builder family(@Nullable String family) {
            this.family = Output.ofNullable(family);
            return this;
        }

        public Builder model(@Nullable Output<String> model) {
            this.model = model;
            return this;
        }

        public Builder model(@Nullable String model) {
            this.model = Output.ofNullable(model);
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

        public Builder size(@Nullable Output<String> size) {
            this.size = size;
            return this;
        }

        public Builder size(@Nullable String size) {
            this.size = Output.ofNullable(size);
            return this;
        }

        public Builder tier(@Nullable Output<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = Output.ofNullable(tier);
            return this;
        }
        public SkuArgs build() {
            return new SkuArgs(capacity, family, model, name, size, tier);
        }
    }
}
