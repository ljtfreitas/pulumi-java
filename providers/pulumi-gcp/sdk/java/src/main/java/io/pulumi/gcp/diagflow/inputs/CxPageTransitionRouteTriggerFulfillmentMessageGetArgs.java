// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentMessageTextGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageTransitionRouteTriggerFulfillmentMessageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageTransitionRouteTriggerFulfillmentMessageGetArgs Empty = new CxPageTransitionRouteTriggerFulfillmentMessageGetArgs();

    @InputImport(name="text")
    private final @Nullable Input<CxPageTransitionRouteTriggerFulfillmentMessageTextGetArgs> text;

    public Input<CxPageTransitionRouteTriggerFulfillmentMessageTextGetArgs> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public CxPageTransitionRouteTriggerFulfillmentMessageGetArgs(@Nullable Input<CxPageTransitionRouteTriggerFulfillmentMessageTextGetArgs> text) {
        this.text = text;
    }

    private CxPageTransitionRouteTriggerFulfillmentMessageGetArgs() {
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageTransitionRouteTriggerFulfillmentMessageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CxPageTransitionRouteTriggerFulfillmentMessageTextGetArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageTransitionRouteTriggerFulfillmentMessageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder setText(@Nullable Input<CxPageTransitionRouteTriggerFulfillmentMessageTextGetArgs> text) {
            this.text = text;
            return this;
        }

        public Builder setText(@Nullable CxPageTransitionRouteTriggerFulfillmentMessageTextGetArgs text) {
            this.text = Input.ofNullable(text);
            return this;
        }

        public CxPageTransitionRouteTriggerFulfillmentMessageGetArgs build() {
            return new CxPageTransitionRouteTriggerFulfillmentMessageGetArgs(text);
        }
    }
}