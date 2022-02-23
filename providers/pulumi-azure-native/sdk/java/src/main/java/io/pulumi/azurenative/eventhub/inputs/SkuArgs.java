// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.inputs;

import io.pulumi.azurenative.eventhub.enums.SkuName;
import io.pulumi.azurenative.eventhub.enums.SkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU parameters supplied to the create namespace operation
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The Event Hubs throughput units, value should be 0 to 20 throughput units.
     * 
     */
    @InputImport(name="capacity")
        private final @Nullable Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * Name of this SKU.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<Either<String,SkuName>> name;

    public Input<Either<String,SkuName>> getName() {
        return this.name;
    }

    /**
     * The billing tier of this particular SKU.
     * 
     */
    @InputImport(name="tier")
        private final @Nullable Input<Either<String,SkuTier>> tier;

    public Input<Either<String,SkuTier>> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public SkuArgs(
        @Nullable Input<Integer> capacity,
        Input<Either<String,SkuName>> name,
        @Nullable Input<Either<String,SkuTier>> tier) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tier = tier;
    }

    private SkuArgs() {
        this.capacity = Input.empty();
        this.name = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> capacity;
        private Input<Either<String,SkuName>> name;
        private @Nullable Input<Either<String,SkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Input<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = Input.ofNullable(capacity);
            return this;
        }

        public Builder setName(Input<Either<String,SkuName>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(Either<String,SkuName> name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setTier(@Nullable Input<Either<String,SkuTier>> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable Either<String,SkuTier> tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }
        public SkuArgs build() {
            return new SkuArgs(capacity, name, tier);
        }
    }
}
