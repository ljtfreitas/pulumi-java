// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A transition route specifies a intent that can be matched and/or a data condition that can be evaluated during a session. When a specified transition is matched, the following actions are taken in order: * If there is a `trigger_fulfillment` associated with the transition, it will be called. * If there is a `target_page` associated with the transition, the session will transition into the specified page. * If there is a `target_flow` associated with the transition, the session will transition into the specified flow.
 * 
 */
public final class GoogleCloudDialogflowCxV3TransitionRouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3TransitionRouteArgs Empty = new GoogleCloudDialogflowCxV3TransitionRouteArgs();

    /**
     * The condition to evaluate against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    @InputImport(name="condition")
      private final @Nullable Input<String> condition;

    public Input<String> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates that the transition can only happen when the given intent is matched. At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    @InputImport(name="intent")
      private final @Nullable Input<String> intent;

    public Input<String> getIntent() {
        return this.intent == null ? Input.empty() : this.intent;
    }

    /**
     * The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
     */
    @InputImport(name="targetFlow")
      private final @Nullable Input<String> targetFlow;

    public Input<String> getTargetFlow() {
        return this.targetFlow == null ? Input.empty() : this.targetFlow;
    }

    /**
     * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    @InputImport(name="targetPage")
      private final @Nullable Input<String> targetPage;

    public Input<String> getTargetPage() {
        return this.targetPage == null ? Input.empty() : this.targetPage;
    }

    /**
     * The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment` and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
     * 
     */
    @InputImport(name="triggerFulfillment")
      private final @Nullable Input<GoogleCloudDialogflowCxV3FulfillmentArgs> triggerFulfillment;

    public Input<GoogleCloudDialogflowCxV3FulfillmentArgs> getTriggerFulfillment() {
        return this.triggerFulfillment == null ? Input.empty() : this.triggerFulfillment;
    }

    public GoogleCloudDialogflowCxV3TransitionRouteArgs(
        @Nullable Input<String> condition,
        @Nullable Input<String> intent,
        @Nullable Input<String> targetFlow,
        @Nullable Input<String> targetPage,
        @Nullable Input<GoogleCloudDialogflowCxV3FulfillmentArgs> triggerFulfillment) {
        this.condition = condition;
        this.intent = intent;
        this.targetFlow = targetFlow;
        this.targetPage = targetPage;
        this.triggerFulfillment = triggerFulfillment;
    }

    private GoogleCloudDialogflowCxV3TransitionRouteArgs() {
        this.condition = Input.empty();
        this.intent = Input.empty();
        this.targetFlow = Input.empty();
        this.targetPage = Input.empty();
        this.triggerFulfillment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3TransitionRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> condition;
        private @Nullable Input<String> intent;
        private @Nullable Input<String> targetFlow;
        private @Nullable Input<String> targetPage;
        private @Nullable Input<GoogleCloudDialogflowCxV3FulfillmentArgs> triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3TransitionRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.intent = defaults.intent;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder setCondition(@Nullable Input<String> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setIntent(@Nullable Input<String> intent) {
            this.intent = intent;
            return this;
        }

        public Builder setIntent(@Nullable String intent) {
            this.intent = Input.ofNullable(intent);
            return this;
        }

        public Builder setTargetFlow(@Nullable Input<String> targetFlow) {
            this.targetFlow = targetFlow;
            return this;
        }

        public Builder setTargetFlow(@Nullable String targetFlow) {
            this.targetFlow = Input.ofNullable(targetFlow);
            return this;
        }

        public Builder setTargetPage(@Nullable Input<String> targetPage) {
            this.targetPage = targetPage;
            return this;
        }

        public Builder setTargetPage(@Nullable String targetPage) {
            this.targetPage = Input.ofNullable(targetPage);
            return this;
        }

        public Builder setTriggerFulfillment(@Nullable Input<GoogleCloudDialogflowCxV3FulfillmentArgs> triggerFulfillment) {
            this.triggerFulfillment = triggerFulfillment;
            return this;
        }

        public Builder setTriggerFulfillment(@Nullable GoogleCloudDialogflowCxV3FulfillmentArgs triggerFulfillment) {
            this.triggerFulfillment = Input.ofNullable(triggerFulfillment);
            return this;
        }
        public GoogleCloudDialogflowCxV3TransitionRouteArgs build() {
            return new GoogleCloudDialogflowCxV3TransitionRouteArgs(condition, intent, targetFlow, targetPage, triggerFulfillment);
        }
    }
}
