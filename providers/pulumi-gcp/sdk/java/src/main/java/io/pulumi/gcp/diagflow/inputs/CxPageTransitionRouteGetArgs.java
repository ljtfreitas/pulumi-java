// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageTransitionRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageTransitionRouteGetArgs Empty = new CxPageTransitionRouteGetArgs();

    /**
     * The condition to evaluate against form parameters or session parameters.
     * At least one of intent or condition must be specified. When both intent and condition are specified, the transition can only happen when both are fulfilled.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<String> condition;

    public Output<String> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * The unique identifier of an Intent.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/intents/<Intent ID>. Indicates that the transition can only happen when the given intent is matched. At least one of intent or condition must be specified. When both intent and condition are specified, the transition can only happen when both are fulfilled.
     * 
     */
    @Import(name="intent")
      private final @Nullable Output<String> intent;

    public Output<String> getIntent() {
        return this.intent == null ? Output.empty() : this.intent;
    }

    /**
     * - 
     * The unique identifier of this event handler.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The target flow to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
     */
    @Import(name="targetFlow")
      private final @Nullable Output<String> targetFlow;

    public Output<String> getTargetFlow() {
        return this.targetFlow == null ? Output.empty() : this.targetFlow;
    }

    /**
     * The target page to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/pages/<Page ID>.
     * 
     */
    @Import(name="targetPage")
      private final @Nullable Output<String> targetPage;

    public Output<String> getTargetPage() {
        return this.targetPage == null ? Output.empty() : this.targetPage;
    }

    /**
     * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * Structure is documented below.
     * 
     */
    @Import(name="triggerFulfillment")
      private final @Nullable Output<CxPageTransitionRouteTriggerFulfillmentGetArgs> triggerFulfillment;

    public Output<CxPageTransitionRouteTriggerFulfillmentGetArgs> getTriggerFulfillment() {
        return this.triggerFulfillment == null ? Output.empty() : this.triggerFulfillment;
    }

    public CxPageTransitionRouteGetArgs(
        @Nullable Output<String> condition,
        @Nullable Output<String> intent,
        @Nullable Output<String> name,
        @Nullable Output<String> targetFlow,
        @Nullable Output<String> targetPage,
        @Nullable Output<CxPageTransitionRouteTriggerFulfillmentGetArgs> triggerFulfillment) {
        this.condition = condition;
        this.intent = intent;
        this.name = name;
        this.targetFlow = targetFlow;
        this.targetPage = targetPage;
        this.triggerFulfillment = triggerFulfillment;
    }

    private CxPageTransitionRouteGetArgs() {
        this.condition = Output.empty();
        this.intent = Output.empty();
        this.name = Output.empty();
        this.targetFlow = Output.empty();
        this.targetPage = Output.empty();
        this.triggerFulfillment = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageTransitionRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> condition;
        private @Nullable Output<String> intent;
        private @Nullable Output<String> name;
        private @Nullable Output<String> targetFlow;
        private @Nullable Output<String> targetPage;
        private @Nullable Output<CxPageTransitionRouteTriggerFulfillmentGetArgs> triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageTransitionRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.intent = defaults.intent;
    	      this.name = defaults.name;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder condition(@Nullable Output<String> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable String condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder intent(@Nullable Output<String> intent) {
            this.intent = intent;
            return this;
        }

        public Builder intent(@Nullable String intent) {
            this.intent = Output.ofNullable(intent);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder targetFlow(@Nullable Output<String> targetFlow) {
            this.targetFlow = targetFlow;
            return this;
        }

        public Builder targetFlow(@Nullable String targetFlow) {
            this.targetFlow = Output.ofNullable(targetFlow);
            return this;
        }

        public Builder targetPage(@Nullable Output<String> targetPage) {
            this.targetPage = targetPage;
            return this;
        }

        public Builder targetPage(@Nullable String targetPage) {
            this.targetPage = Output.ofNullable(targetPage);
            return this;
        }

        public Builder triggerFulfillment(@Nullable Output<CxPageTransitionRouteTriggerFulfillmentGetArgs> triggerFulfillment) {
            this.triggerFulfillment = triggerFulfillment;
            return this;
        }

        public Builder triggerFulfillment(@Nullable CxPageTransitionRouteTriggerFulfillmentGetArgs triggerFulfillment) {
            this.triggerFulfillment = Output.ofNullable(triggerFulfillment);
            return this;
        }
        public CxPageTransitionRouteGetArgs build() {
            return new CxPageTransitionRouteGetArgs(condition, intent, name, targetFlow, targetPage, triggerFulfillment);
        }
    }
}
