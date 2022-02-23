// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.diagflow.outputs.CxFlowTransitionRouteTriggerFulfillmentMessageText;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CxFlowTransitionRouteTriggerFulfillmentMessage {
    /**
     * A collection of text responses.
     * 
     */
    private final @Nullable CxFlowTransitionRouteTriggerFulfillmentMessageText text;

    @OutputCustomType.Constructor({"text"})
    private CxFlowTransitionRouteTriggerFulfillmentMessage(@Nullable CxFlowTransitionRouteTriggerFulfillmentMessageText text) {
        this.text = text;
    }

    /**
     * A collection of text responses.
     * 
     */
    public Optional<CxFlowTransitionRouteTriggerFulfillmentMessageText> getText() {
        return Optional.ofNullable(this.text);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowTransitionRouteTriggerFulfillmentMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CxFlowTransitionRouteTriggerFulfillmentMessageText text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowTransitionRouteTriggerFulfillmentMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder setText(@Nullable CxFlowTransitionRouteTriggerFulfillmentMessageText text) {
            this.text = text;
            return this;
        }
        public CxFlowTransitionRouteTriggerFulfillmentMessage build() {
            return new CxFlowTransitionRouteTriggerFulfillmentMessage(text);
        }
    }
}
