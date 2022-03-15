// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Plan for solution object supported by the OperationsManagement resource provider.
 * 
 */
public final class SolutionPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final SolutionPlanArgs Empty = new SolutionPlanArgs();

    /**
     * name of the solution to be created. For Microsoft published solution it should be in the format of solutionType(workspaceName). SolutionType part is case sensitive. For third party solution, it can be anything.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * name of the solution to enabled/add. For Microsoft published gallery solution it should be in the format of OMSGallery/<solutionType>. This is case sensitive
     * 
     */
    @Import(name="product")
      private final @Nullable Output<String> product;

    public Output<String> getProduct() {
        return this.product == null ? Output.empty() : this.product;
    }

    /**
     * promotionCode, Not really used now, can you left as empty
     * 
     */
    @Import(name="promotionCode")
      private final @Nullable Output<String> promotionCode;

    public Output<String> getPromotionCode() {
        return this.promotionCode == null ? Output.empty() : this.promotionCode;
    }

    /**
     * Publisher name. For gallery solution, it is Microsoft.
     * 
     */
    @Import(name="publisher")
      private final @Nullable Output<String> publisher;

    public Output<String> getPublisher() {
        return this.publisher == null ? Output.empty() : this.publisher;
    }

    public SolutionPlanArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> product,
        @Nullable Output<String> promotionCode,
        @Nullable Output<String> publisher) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
    }

    private SolutionPlanArgs() {
        this.name = Output.empty();
        this.product = Output.empty();
        this.promotionCode = Output.empty();
        this.publisher = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> product;
        private @Nullable Output<String> promotionCode;
        private @Nullable Output<String> publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
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
        public SolutionPlanArgs build() {
            return new SolutionPlanArgs(name, product, promotionCode, publisher);
        }
    }
}
