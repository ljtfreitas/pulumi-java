// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.azurenative.cache.enums.SkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU parameters supplied to the create RedisEnterprise operation.
 * 
 */
public final class EnterpriseSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseSkuArgs Empty = new EnterpriseSkuArgs();

    /**
     * The size of the RedisEnterprise cluster. Defaults to 2 or 3 depending on SKU. Valid values are (2, 4, 6, ...) for Enterprise SKUs and (3, 9, 15, ...) for Flash SKUs.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity == null ? Output.empty() : this.capacity;
    }

    /**
     * The type of RedisEnterprise cluster to deploy. Possible values: (Enterprise_E10, EnterpriseFlash_F300 etc.)
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,SkuName>> name;

    public Output<Either<String,SkuName>> getName() {
        return this.name;
    }

    public EnterpriseSkuArgs(
        @Nullable Output<Integer> capacity,
        Output<Either<String,SkuName>> name) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private EnterpriseSkuArgs() {
        this.capacity = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> capacity;
        private Output<Either<String,SkuName>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Output.ofNullable(capacity);
            return this;
        }

        public Builder name(Output<Either<String,SkuName>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(Either<String,SkuName> name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public EnterpriseSkuArgs build() {
            return new EnterpriseSkuArgs(capacity, name);
        }
    }
}
