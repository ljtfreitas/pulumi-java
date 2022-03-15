// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzurePlanResponse {
    /**
     * The sku description.
     * 
     */
    private final String skuDescription;
    /**
     * The sku id.
     * 
     */
    private final @Nullable String skuId;

    @CustomType.Constructor
    private AzurePlanResponse(
        @CustomType.Parameter("skuDescription") String skuDescription,
        @CustomType.Parameter("skuId") @Nullable String skuId) {
        this.skuDescription = skuDescription;
        this.skuId = skuId;
    }

    /**
     * The sku description.
     * 
    */
    public String getSkuDescription() {
        return this.skuDescription;
    }
    /**
     * The sku id.
     * 
    */
    public Optional<String> getSkuId() {
        return Optional.ofNullable(this.skuId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzurePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String skuDescription;
        private @Nullable String skuId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzurePlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skuDescription = defaults.skuDescription;
    	      this.skuId = defaults.skuId;
        }

        public Builder skuDescription(String skuDescription) {
            this.skuDescription = Objects.requireNonNull(skuDescription);
            return this;
        }

        public Builder skuId(@Nullable String skuId) {
            this.skuId = skuId;
            return this;
        }
        public AzurePlanResponse build() {
            return new AzurePlanResponse(skuDescription, skuId);
        }
    }
}
