// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cognitive Services account commitment quota.
 * 
 */
public final class CommitmentQuotaResponse extends io.pulumi.resources.InvokeArgs {

    public static final CommitmentQuotaResponse Empty = new CommitmentQuotaResponse();

    /**
     * Commitment quota quantity.
     * 
     */
    @InputImport(name="quantity")
        private final @Nullable Double quantity;

    public Optional<Double> getQuantity() {
        return this.quantity == null ? Optional.empty() : Optional.ofNullable(this.quantity);
    }

    /**
     * Commitment quota unit.
     * 
     */
    @InputImport(name="unit")
        private final @Nullable String unit;

    public Optional<String> getUnit() {
        return this.unit == null ? Optional.empty() : Optional.ofNullable(this.unit);
    }

    public CommitmentQuotaResponse(
        @Nullable Double quantity,
        @Nullable String unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    private CommitmentQuotaResponse() {
        this.quantity = null;
        this.unit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommitmentQuotaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double quantity;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(CommitmentQuotaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quantity = defaults.quantity;
    	      this.unit = defaults.unit;
        }

        public Builder setQuantity(@Nullable Double quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public CommitmentQuotaResponse build() {
            return new CommitmentQuotaResponse(quantity, unit);
        }
    }
}
