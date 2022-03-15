// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.diagflow.outputs.CxFlowTransitionRouteTriggerFulfillment;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxFlowTransitionRoute {
    /**
     * The condition to evaluate against form parameters or session parameters.
     * At least one of intent or condition must be specified. When both intent and condition are specified, the transition can only happen when both are fulfilled.
     * 
     */
    private final @Nullable String condition;
    /**
     * The unique identifier of an Intent.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/intents/<Intent ID>. Indicates that the transition can only happen when the given intent is matched. At least one of intent or condition must be specified. When both intent and condition are specified, the transition can only happen when both are fulfilled.
     * 
     */
    private final @Nullable String intent;
    /**
     * - 
     * The unique identifier of this event handler.
     * 
     */
    private final @Nullable String name;
    /**
     * The target flow to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
     */
    private final @Nullable String targetFlow;
    /**
     * The target page to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/pages/<Page ID>.
     * 
     */
    private final @Nullable String targetPage;
    /**
     * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * Structure is documented below.
     * 
     */
    private final @Nullable CxFlowTransitionRouteTriggerFulfillment triggerFulfillment;

    @CustomType.Constructor
    private CxFlowTransitionRoute(
        @CustomType.Parameter("condition") @Nullable String condition,
        @CustomType.Parameter("intent") @Nullable String intent,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("targetFlow") @Nullable String targetFlow,
        @CustomType.Parameter("targetPage") @Nullable String targetPage,
        @CustomType.Parameter("triggerFulfillment") @Nullable CxFlowTransitionRouteTriggerFulfillment triggerFulfillment) {
        this.condition = condition;
        this.intent = intent;
        this.name = name;
        this.targetFlow = targetFlow;
        this.targetPage = targetPage;
        this.triggerFulfillment = triggerFulfillment;
    }

    /**
     * The condition to evaluate against form parameters or session parameters.
     * At least one of intent or condition must be specified. When both intent and condition are specified, the transition can only happen when both are fulfilled.
     * 
    */
    public Optional<String> getCondition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * The unique identifier of an Intent.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/intents/<Intent ID>. Indicates that the transition can only happen when the given intent is matched. At least one of intent or condition must be specified. When both intent and condition are specified, the transition can only happen when both are fulfilled.
     * 
    */
    public Optional<String> getIntent() {
        return Optional.ofNullable(this.intent);
    }
    /**
     * - 
     * The unique identifier of this event handler.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The target flow to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
    */
    public Optional<String> getTargetFlow() {
        return Optional.ofNullable(this.targetFlow);
    }
    /**
     * The target page to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/pages/<Page ID>.
     * 
    */
    public Optional<String> getTargetPage() {
        return Optional.ofNullable(this.targetPage);
    }
    /**
     * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * Structure is documented below.
     * 
    */
    public Optional<CxFlowTransitionRouteTriggerFulfillment> getTriggerFulfillment() {
        return Optional.ofNullable(this.triggerFulfillment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowTransitionRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private @Nullable String intent;
        private @Nullable String name;
        private @Nullable String targetFlow;
        private @Nullable String targetPage;
        private @Nullable CxFlowTransitionRouteTriggerFulfillment triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(CxFlowTransitionRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.intent = defaults.intent;
    	      this.name = defaults.name;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }

        public Builder intent(@Nullable String intent) {
            this.intent = intent;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder targetFlow(@Nullable String targetFlow) {
            this.targetFlow = targetFlow;
            return this;
        }

        public Builder targetPage(@Nullable String targetPage) {
            this.targetPage = targetPage;
            return this;
        }

        public Builder triggerFulfillment(@Nullable CxFlowTransitionRouteTriggerFulfillment triggerFulfillment) {
            this.triggerFulfillment = triggerFulfillment;
            return this;
        }
        public CxFlowTransitionRoute build() {
            return new CxFlowTransitionRoute(condition, intent, name, targetFlow, targetPage, triggerFulfillment);
        }
    }
}
