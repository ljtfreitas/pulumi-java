// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.visualstudio.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Plan data for an extension resource.
 * 
 */
public final class ExtensionResourcePlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtensionResourcePlanArgs Empty = new ExtensionResourcePlanArgs();

    /**
     * Name of the plan.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Product name.
     * 
     */
    @InputImport(name="product")
    private final @Nullable Input<String> product;

    public Input<String> getProduct() {
        return this.product == null ? Input.empty() : this.product;
    }

    /**
     * Optional: the promotion code associated with the plan.
     * 
     */
    @InputImport(name="promotionCode")
    private final @Nullable Input<String> promotionCode;

    public Input<String> getPromotionCode() {
        return this.promotionCode == null ? Input.empty() : this.promotionCode;
    }

    /**
     * Name of the extension publisher.
     * 
     */
    @InputImport(name="publisher")
    private final @Nullable Input<String> publisher;

    public Input<String> getPublisher() {
        return this.publisher == null ? Input.empty() : this.publisher;
    }

    /**
     * A string that uniquely identifies the plan version.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ExtensionResourcePlanArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> product,
        @Nullable Input<String> promotionCode,
        @Nullable Input<String> publisher,
        @Nullable Input<String> version) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
        this.version = version;
    }

    private ExtensionResourcePlanArgs() {
        this.name = Input.empty();
        this.product = Input.empty();
        this.promotionCode = Input.empty();
        this.publisher = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionResourcePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> product;
        private @Nullable Input<String> promotionCode;
        private @Nullable Input<String> publisher;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionResourcePlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
    	      this.version = defaults.version;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProduct(@Nullable Input<String> product) {
            this.product = product;
            return this;
        }

        public Builder setProduct(@Nullable String product) {
            this.product = Input.ofNullable(product);
            return this;
        }

        public Builder setPromotionCode(@Nullable Input<String> promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        public Builder setPromotionCode(@Nullable String promotionCode) {
            this.promotionCode = Input.ofNullable(promotionCode);
            return this;
        }

        public Builder setPublisher(@Nullable Input<String> publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = Input.ofNullable(publisher);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public ExtensionResourcePlanArgs build() {
            return new ExtensionResourcePlanArgs(name, product, promotionCode, publisher, version);
        }
    }
}
