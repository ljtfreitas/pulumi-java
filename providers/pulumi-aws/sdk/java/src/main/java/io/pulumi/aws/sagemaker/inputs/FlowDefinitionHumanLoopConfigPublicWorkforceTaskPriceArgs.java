// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs Empty = new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs();

    /**
     * Defines the amount of money paid to an Amazon Mechanical Turk worker in United States dollars. See Amount In Usd details below.
     * 
     */
    @Import(name="amountInUsd")
      private final @Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs> amountInUsd;

    public Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs> getAmountInUsd() {
        return this.amountInUsd == null ? Output.empty() : this.amountInUsd;
    }

    public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs(@Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs> amountInUsd) {
        this.amountInUsd = amountInUsd;
    }

    private FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs() {
        this.amountInUsd = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs> amountInUsd;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amountInUsd = defaults.amountInUsd;
        }

        public Builder amountInUsd(@Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs> amountInUsd) {
            this.amountInUsd = amountInUsd;
            return this;
        }

        public Builder amountInUsd(@Nullable FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs amountInUsd) {
            this.amountInUsd = Output.ofNullable(amountInUsd);
            return this;
        }
        public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs build() {
            return new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceArgs(amountInUsd);
        }
    }
}
