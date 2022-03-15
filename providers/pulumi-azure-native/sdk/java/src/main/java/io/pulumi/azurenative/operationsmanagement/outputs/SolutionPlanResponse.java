// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SolutionPlanResponse {
    /**
     * name of the solution to be created. For Microsoft published solution it should be in the format of solutionType(workspaceName). SolutionType part is case sensitive. For third party solution, it can be anything.
     * 
     */
    private final @Nullable String name;
    /**
     * name of the solution to enabled/add. For Microsoft published gallery solution it should be in the format of OMSGallery/<solutionType>. This is case sensitive
     * 
     */
    private final @Nullable String product;
    /**
     * promotionCode, Not really used now, can you left as empty
     * 
     */
    private final @Nullable String promotionCode;
    /**
     * Publisher name. For gallery solution, it is Microsoft.
     * 
     */
    private final @Nullable String publisher;

    @CustomType.Constructor
    private SolutionPlanResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("product") @Nullable String product,
        @CustomType.Parameter("promotionCode") @Nullable String promotionCode,
        @CustomType.Parameter("publisher") @Nullable String publisher) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
    }

    /**
     * name of the solution to be created. For Microsoft published solution it should be in the format of solutionType(workspaceName). SolutionType part is case sensitive. For third party solution, it can be anything.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * name of the solution to enabled/add. For Microsoft published gallery solution it should be in the format of OMSGallery/<solutionType>. This is case sensitive
     * 
    */
    public Optional<String> getProduct() {
        return Optional.ofNullable(this.product);
    }
    /**
     * promotionCode, Not really used now, can you left as empty
     * 
    */
    public Optional<String> getPromotionCode() {
        return Optional.ofNullable(this.promotionCode);
    }
    /**
     * Publisher name. For gallery solution, it is Microsoft.
     * 
    */
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionPlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String product;
        private @Nullable String promotionCode;
        private @Nullable String publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionPlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
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

        public Builder promotionCode(@Nullable String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }
        public SolutionPlanResponse build() {
            return new SolutionPlanResponse(name, product, promotionCode, publisher);
        }
    }
}
