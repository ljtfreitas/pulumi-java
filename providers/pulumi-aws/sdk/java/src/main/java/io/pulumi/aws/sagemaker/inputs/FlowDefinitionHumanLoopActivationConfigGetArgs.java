// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowDefinitionHumanLoopActivationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionHumanLoopActivationConfigGetArgs Empty = new FlowDefinitionHumanLoopActivationConfigGetArgs();

    /**
     * defines under what conditions SageMaker creates a human loop. See Human Loop Activation Conditions Config details below.
     * 
     */
    @InputImport(name="humanLoopActivationConditionsConfig")
    private final @Nullable Input<FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigGetArgs> humanLoopActivationConditionsConfig;

    public Input<FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigGetArgs> getHumanLoopActivationConditionsConfig() {
        return this.humanLoopActivationConditionsConfig == null ? Input.empty() : this.humanLoopActivationConditionsConfig;
    }

    public FlowDefinitionHumanLoopActivationConfigGetArgs(@Nullable Input<FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigGetArgs> humanLoopActivationConditionsConfig) {
        this.humanLoopActivationConditionsConfig = humanLoopActivationConditionsConfig;
    }

    private FlowDefinitionHumanLoopActivationConfigGetArgs() {
        this.humanLoopActivationConditionsConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopActivationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigGetArgs> humanLoopActivationConditionsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopActivationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanLoopActivationConditionsConfig = defaults.humanLoopActivationConditionsConfig;
        }

        public Builder setHumanLoopActivationConditionsConfig(@Nullable Input<FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigGetArgs> humanLoopActivationConditionsConfig) {
            this.humanLoopActivationConditionsConfig = humanLoopActivationConditionsConfig;
            return this;
        }

        public Builder setHumanLoopActivationConditionsConfig(@Nullable FlowDefinitionHumanLoopActivationConfigHumanLoopActivationConditionsConfigGetArgs humanLoopActivationConditionsConfig) {
            this.humanLoopActivationConditionsConfig = Input.ofNullable(humanLoopActivationConditionsConfig);
            return this;
        }
        public FlowDefinitionHumanLoopActivationConfigGetArgs build() {
            return new FlowDefinitionHumanLoopActivationConfigGetArgs(humanLoopActivationConditionsConfig);
        }
    }
}
