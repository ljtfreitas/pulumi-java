// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sku of the resource
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * Name of the sku
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Tier of the sku like Basic or Enterprise
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    public SkuArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> tier) {
        this.name = name;
        this.tier = tier;
    }

    private SkuArgs() {
        this.name = Output.empty();
        this.tier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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
            return new SkuArgs(name, tier);
        }
    }
}
