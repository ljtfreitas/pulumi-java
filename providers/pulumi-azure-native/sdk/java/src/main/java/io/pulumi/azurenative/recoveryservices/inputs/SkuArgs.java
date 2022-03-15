// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.SkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identifies the unique system identifier for each Azure resource.
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The Sku name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,SkuName>> name;

    public Output<Either<String,SkuName>> getName() {
        return this.name;
    }

    /**
     * The Sku tier.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    public SkuArgs(
        Output<Either<String,SkuName>> name,
        @Nullable Output<String> tier) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
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
        private Output<Either<String,SkuName>> name;
        private @Nullable Output<String> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(Output<Either<String,SkuName>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(Either<String,SkuName> name) {
            this.name = Output.of(Objects.requireNonNull(name));
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
