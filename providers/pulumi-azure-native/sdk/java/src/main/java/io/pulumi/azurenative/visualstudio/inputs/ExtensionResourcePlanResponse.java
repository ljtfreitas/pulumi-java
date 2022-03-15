// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.visualstudio.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Plan data for an extension resource.
 * 
 */
public final class ExtensionResourcePlanResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExtensionResourcePlanResponse Empty = new ExtensionResourcePlanResponse();

    /**
     * Name of the plan.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Product name.
     * 
     */
    @Import(name="product")
      private final @Nullable String product;

    public Optional<String> getProduct() {
        return this.product == null ? Optional.empty() : Optional.ofNullable(this.product);
    }

    /**
     * Optional: the promotion code associated with the plan.
     * 
     */
    @Import(name="promotionCode")
      private final @Nullable String promotionCode;

    public Optional<String> getPromotionCode() {
        return this.promotionCode == null ? Optional.empty() : Optional.ofNullable(this.promotionCode);
    }

    /**
     * Name of the extension publisher.
     * 
     */
    @Import(name="publisher")
      private final @Nullable String publisher;

    public Optional<String> getPublisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    /**
     * A string that uniquely identifies the plan version.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ExtensionResourcePlanResponse(
        @Nullable String name,
        @Nullable String product,
        @Nullable String promotionCode,
        @Nullable String publisher,
        @Nullable String version) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
        this.version = version;
    }

    private ExtensionResourcePlanResponse() {
        this.name = null;
        this.product = null;
        this.promotionCode = null;
        this.publisher = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionResourcePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String product;
        private @Nullable String promotionCode;
        private @Nullable String publisher;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionResourcePlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
    	      this.version = defaults.version;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder product(@Nullable String product) {
            this.product = product;
            return this;
        }

        public Builder promotionCode(@Nullable String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public ExtensionResourcePlanResponse build() {
            return new ExtensionResourcePlanResponse(name, product, promotionCode, publisher, version);
        }
    }
}
