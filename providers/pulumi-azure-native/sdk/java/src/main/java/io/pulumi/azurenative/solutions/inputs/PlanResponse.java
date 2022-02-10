// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlanResponse extends io.pulumi.resources.InvokeArgs {

    public static final PlanResponse Empty = new PlanResponse();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="product", required=true)
    private final String product;

    public String getProduct() {
        return this.product;
    }

    @InputImport(name="promotionCode")
    private final @Nullable String promotionCode;

    public Optional<String> getPromotionCode() {
        return this.promotionCode == null ? Optional.empty() : Optional.ofNullable(this.promotionCode);
    }

    @InputImport(name="publisher", required=true)
    private final String publisher;

    public String getPublisher() {
        return this.publisher;
    }

    @InputImport(name="version", required=true)
    private final String version;

    public String getVersion() {
        return this.version;
    }

    public PlanResponse(
        String name,
        String product,
        @Nullable String promotionCode,
        String publisher,
        String version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.product = Objects.requireNonNull(product, "expected parameter 'product' to be non-null");
        this.promotionCode = promotionCode;
        this.publisher = Objects.requireNonNull(publisher, "expected parameter 'publisher' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private PlanResponse() {
        this.name = null;
        this.product = null;
        this.promotionCode = null;
        this.publisher = null;
        this.version = null;
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProduct(String product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }

        public Builder setPromotionCode(@Nullable String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public PlanResponse build() {
            return new PlanResponse(name, product, promotionCode, publisher, version);
        }
    }
}