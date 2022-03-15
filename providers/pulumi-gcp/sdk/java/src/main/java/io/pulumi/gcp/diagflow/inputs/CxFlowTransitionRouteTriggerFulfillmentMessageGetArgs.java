// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs Empty = new CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs();

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="text")
      private final @Nullable Output<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> text;

    public Output<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> getText() {
        return this.text == null ? Output.empty() : this.text;
    }

    public CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs(@Nullable Output<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> text) {
        this.text = text;
    }

    private CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs() {
        this.text = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(@Nullable Output<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> text) {
            this.text = text;
            return this;
        }

        public Builder text(@Nullable CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs text) {
            this.text = Output.ofNullable(text);
            return this;
        }
        public CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs build() {
            return new CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs(text);
        }
    }
}
