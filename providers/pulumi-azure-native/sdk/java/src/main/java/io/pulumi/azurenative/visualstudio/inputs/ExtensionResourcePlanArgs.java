// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.visualstudio.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Product name.
     * 
     */
    @Import(name="product")
      private final @Nullable Output<String> product;

    public Output<String> getProduct() {
        return this.product == null ? Output.empty() : this.product;
    }

    /**
     * Optional: the promotion code associated with the plan.
     * 
     */
    @Import(name="promotionCode")
      private final @Nullable Output<String> promotionCode;

    public Output<String> getPromotionCode() {
        return this.promotionCode == null ? Output.empty() : this.promotionCode;
    }

    /**
     * Name of the extension publisher.
     * 
     */
    @Import(name="publisher")
      private final @Nullable Output<String> publisher;

    public Output<String> getPublisher() {
        return this.publisher == null ? Output.empty() : this.publisher;
    }

    /**
     * A string that uniquely identifies the plan version.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ExtensionResourcePlanArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> product,
        @Nullable Output<String> promotionCode,
        @Nullable Output<String> publisher,
        @Nullable Output<String> version) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
        this.version = version;
    }

    private ExtensionResourcePlanArgs() {
        this.name = Output.empty();
        this.product = Output.empty();
        this.promotionCode = Output.empty();
        this.publisher = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionResourcePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> product;
        private @Nullable Output<String> promotionCode;
        private @Nullable Output<String> publisher;
        private @Nullable Output<String> version;

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

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder product(@Nullable Output<String> product) {
            this.product = product;
            return this;
        }

        public Builder product(@Nullable String product) {
            this.product = Output.ofNullable(product);
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

        public Builder publisher(@Nullable Output<String> publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder publisher(@Nullable String publisher) {
            this.publisher = Output.ofNullable(publisher);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public ExtensionResourcePlanArgs build() {
            return new ExtensionResourcePlanArgs(name, product, promotionCode, publisher, version);
        }
    }
}
