// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.azurenative.cache.enums.SkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="capacity")
        private final @Nullable Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * The type of RedisEnterprise cluster to deploy. Possible values: (Enterprise_E10, EnterpriseFlash_F300 etc.)
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<Either<String,SkuName>> name;

    public Input<Either<String,SkuName>> getName() {
        return this.name;
    }

    public EnterpriseSkuArgs(
        @Nullable Input<Integer> capacity,
        Input<Either<String,SkuName>> name) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private EnterpriseSkuArgs() {
        this.capacity = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> capacity;
        private Input<Either<String,SkuName>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
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
        public EnterpriseSkuArgs build() {
            return new EnterpriseSkuArgs(capacity, name);
        }
    }
}
