// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobActionSaveFindingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobActionSaveFindingsArgs Empty = new PreventionJobTriggerInspectJobActionSaveFindingsArgs();

    /**
     * Information on where to store output
     * Structure is documented below.
     * 
     */
    @Import(name="outputConfig", required=true)
      private final Output<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs> outputConfig;

    public Output<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs> getOutputConfig() {
        return this.outputConfig;
    }

    public PreventionJobTriggerInspectJobActionSaveFindingsArgs(Output<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs> outputConfig) {
        this.outputConfig = Objects.requireNonNull(outputConfig, "expected parameter 'outputConfig' to be non-null");
    }

    private PreventionJobTriggerInspectJobActionSaveFindingsArgs() {
        this.outputConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobActionSaveFindingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs> outputConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobActionSaveFindingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputConfig = defaults.outputConfig;
        }

        public Builder outputConfig(Output<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs> outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }

        public Builder outputConfig(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs outputConfig) {
            this.outputConfig = Output.of(Objects.requireNonNull(outputConfig));
            return this;
        }
        public PreventionJobTriggerInspectJobActionSaveFindingsArgs build() {
            return new PreventionJobTriggerInspectJobActionSaveFindingsArgs(outputConfig);
        }
    }
}
