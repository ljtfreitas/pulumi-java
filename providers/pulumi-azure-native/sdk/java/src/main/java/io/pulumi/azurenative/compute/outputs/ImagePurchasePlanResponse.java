// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImagePurchasePlanResponse {
    /**
     * The plan ID.
     * 
     */
    private final @Nullable String name;
    /**
     * The product ID.
     * 
     */
    private final @Nullable String product;
    /**
     * The publisher ID.
     * 
     */
    private final @Nullable String publisher;

    @CustomType.Constructor
    private ImagePurchasePlanResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("product") @Nullable String product,
        @CustomType.Parameter("publisher") @Nullable String publisher) {
        this.name = name;
        this.product = product;
        this.publisher = publisher;
    }

    /**
     * The plan ID.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The product ID.
     * 
    */
    public Optional<String> getProduct() {
        return Optional.ofNullable(this.product);
    }
    /**
     * The publisher ID.
     * 
    */
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePurchasePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String product;
        private @Nullable String publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePurchasePlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.publisher = defaults.publisher;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder product(@Nullable String product) {
            this.product = product;
            return this;
        }

        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }
        public ImagePurchasePlanResponse build() {
            return new ImagePurchasePlanResponse(name, product, publisher);
        }
    }
}
