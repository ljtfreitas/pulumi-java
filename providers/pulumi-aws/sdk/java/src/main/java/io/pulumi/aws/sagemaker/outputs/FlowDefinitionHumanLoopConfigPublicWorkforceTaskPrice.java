// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowDefinitionHumanLoopConfigPublicWorkforceTaskPrice {
    /**
     * Defines the amount of money paid to an Amazon Mechanical Turk worker in United States dollars. See Amount In Usd details below.
     * 
     */
    private final @Nullable FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd amountInUsd;

    @CustomType.Constructor
    private FlowDefinitionHumanLoopConfigPublicWorkforceTaskPrice(@CustomType.Parameter("amountInUsd") @Nullable FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd amountInUsd) {
        this.amountInUsd = amountInUsd;
    }

    /**
     * Defines the amount of money paid to an Amazon Mechanical Turk worker in United States dollars. See Amount In Usd details below.
     * 
    */
    public Optional<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd> getAmountInUsd() {
        return Optional.ofNullable(this.amountInUsd);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPrice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd amountInUsd;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPrice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amountInUsd = defaults.amountInUsd;
        }

        public Builder amountInUsd(@Nullable FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsd amountInUsd) {
            this.amountInUsd = amountInUsd;
            return this;
        }
        public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPrice build() {
            return new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPrice(amountInUsd);
        }
    }
}
