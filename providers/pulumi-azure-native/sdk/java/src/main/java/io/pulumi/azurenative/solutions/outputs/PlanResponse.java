// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PlanResponse {
    /**
     * The plan name.
     * 
     */
    private final String name;
    /**
     * The product code.
     * 
     */
    private final String product;
    /**
     * The promotion code.
     * 
     */
    private final @Nullable String promotionCode;
    /**
     * The publisher ID.
     * 
     */
    private final String publisher;
    /**
     * The plan's version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private PlanResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("product") String product,
        @CustomType.Parameter("promotionCode") @Nullable String promotionCode,
        @CustomType.Parameter("publisher") String publisher,
        @CustomType.Parameter("version") String version) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
        this.version = version;
    }

    /**
     * The plan name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The product code.
     * 
    */
    public String getProduct() {
        return this.product;
    }
    /**
     * The promotion code.
     * 
    */
    public Optional<String> getPromotionCode() {
        return Optional.ofNullable(this.promotionCode);
    }
    /**
     * The publisher ID.
     * 
    */
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * The plan's version.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String product;
        private @Nullable String promotionCode;
        private String publisher;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
    	      this.version = defaults.version;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder product(String product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }

        public Builder promotionCode(@Nullable String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public PlanResponse build() {
            return new PlanResponse(name, product, promotionCode, publisher, version);
        }
    }
}
