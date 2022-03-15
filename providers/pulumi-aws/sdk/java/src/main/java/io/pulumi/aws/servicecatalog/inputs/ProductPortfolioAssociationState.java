// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProductPortfolioAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final ProductPortfolioAssociationState Empty = new ProductPortfolioAssociationState();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
      private final @Nullable Output<String> acceptLanguage;

    public Output<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Output.empty() : this.acceptLanguage;
    }

    /**
     * Portfolio identifier.
     * 
     */
    @Import(name="portfolioId")
      private final @Nullable Output<String> portfolioId;

    public Output<String> getPortfolioId() {
        return this.portfolioId == null ? Output.empty() : this.portfolioId;
    }

    /**
     * Product identifier.
     * 
     */
    @Import(name="productId")
      private final @Nullable Output<String> productId;

    public Output<String> getProductId() {
        return this.productId == null ? Output.empty() : this.productId;
    }

    /**
     * Identifier of the source portfolio.
     * 
     */
    @Import(name="sourcePortfolioId")
      private final @Nullable Output<String> sourcePortfolioId;

    public Output<String> getSourcePortfolioId() {
        return this.sourcePortfolioId == null ? Output.empty() : this.sourcePortfolioId;
    }

    public ProductPortfolioAssociationState(
        @Nullable Output<String> acceptLanguage,
        @Nullable Output<String> portfolioId,
        @Nullable Output<String> productId,
        @Nullable Output<String> sourcePortfolioId) {
        this.acceptLanguage = acceptLanguage;
        this.portfolioId = portfolioId;
        this.productId = productId;
        this.sourcePortfolioId = sourcePortfolioId;
    }

    private ProductPortfolioAssociationState() {
        this.acceptLanguage = Output.empty();
        this.portfolioId = Output.empty();
        this.productId = Output.empty();
        this.sourcePortfolioId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductPortfolioAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acceptLanguage;
        private @Nullable Output<String> portfolioId;
        private @Nullable Output<String> productId;
        private @Nullable Output<String> sourcePortfolioId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductPortfolioAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.portfolioId = defaults.portfolioId;
    	      this.productId = defaults.productId;
    	      this.sourcePortfolioId = defaults.sourcePortfolioId;
        }

        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Output.ofNullable(acceptLanguage);
            return this;
        }

        public Builder portfolioId(@Nullable Output<String> portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder portfolioId(@Nullable String portfolioId) {
            this.portfolioId = Output.ofNullable(portfolioId);
            return this;
        }

        public Builder productId(@Nullable Output<String> productId) {
            this.productId = productId;
            return this;
        }

        public Builder productId(@Nullable String productId) {
            this.productId = Output.ofNullable(productId);
            return this;
        }

        public Builder sourcePortfolioId(@Nullable Output<String> sourcePortfolioId) {
            this.sourcePortfolioId = sourcePortfolioId;
            return this;
        }

        public Builder sourcePortfolioId(@Nullable String sourcePortfolioId) {
            this.sourcePortfolioId = Output.ofNullable(sourcePortfolioId);
            return this;
        }
        public ProductPortfolioAssociationState build() {
            return new ProductPortfolioAssociationState(acceptLanguage, portfolioId, productId, sourcePortfolioId);
        }
    }
}
