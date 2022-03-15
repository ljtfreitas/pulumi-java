// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
 * 
 */
public final class PurchasePlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final PurchasePlanArgs Empty = new PurchasePlanArgs();

    /**
     * The plan ID.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     * 
     */
    @Import(name="product", required=true)
      private final Output<String> product;

    public Output<String> getProduct() {
        return this.product;
    }

    /**
     * The Offer Promotion Code.
     * 
     */
    @Import(name="promotionCode")
      private final @Nullable Output<String> promotionCode;

    public Output<String> getPromotionCode() {
        return this.promotionCode == null ? Output.empty() : this.promotionCode;
    }

    /**
     * The publisher ID.
     * 
     */
    @Import(name="publisher", required=true)
      private final Output<String> publisher;

    public Output<String> getPublisher() {
        return this.publisher;
    }

    public PurchasePlanArgs(
        Output<String> name,
        Output<String> product,
        @Nullable Output<String> promotionCode,
        Output<String> publisher) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.product = Objects.requireNonNull(product, "expected parameter 'product' to be non-null");
        this.promotionCode = promotionCode;
        this.publisher = Objects.requireNonNull(publisher, "expected parameter 'publisher' to be non-null");
    }

    private PurchasePlanArgs() {
        this.name = Output.empty();
        this.product = Output.empty();
        this.promotionCode = Output.empty();
        this.publisher = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PurchasePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> product;
        private @Nullable Output<String> promotionCode;
        private Output<String> publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(PurchasePlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder product(Output<String> product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }

        public Builder product(String product) {
            this.product = Output.of(Objects.requireNonNull(product));
            return this;
        }

        public Builder promotionCode(@Nullable Output<String> promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        public Builder promotionCode(@Nullable String promotionCode) {
            this.promotionCode = Output.ofNullable(promotionCode);
            return this;
        }

        public Builder publisher(Output<String> publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = Output.of(Objects.requireNonNull(publisher));
            return this;
        }
        public PurchasePlanArgs build() {
            return new PurchasePlanArgs(name, product, promotionCode, publisher);
        }
    }
}
