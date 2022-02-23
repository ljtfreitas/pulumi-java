// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.diagflow.outputs.CxPageEventHandlerTriggerFulfillment;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CxPageEventHandler {
    /**
     * The name of the event to handle.
     * 
     */
    private final @Nullable String event;
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
    private final @Nullable CxPageEventHandlerTriggerFulfillment triggerFulfillment;

    @OutputCustomType.Constructor({"event","name","targetFlow","targetPage","triggerFulfillment"})
    private CxPageEventHandler(
        @Nullable String event,
        @Nullable String name,
        @Nullable String targetFlow,
        @Nullable String targetPage,
        @Nullable CxPageEventHandlerTriggerFulfillment triggerFulfillment) {
        this.event = event;
        this.name = name;
        this.targetFlow = targetFlow;
        this.targetPage = targetPage;
        this.triggerFulfillment = triggerFulfillment;
    }

    /**
     * The name of the event to handle.
     * 
     */
    public Optional<String> getEvent() {
        return Optional.ofNullable(this.event);
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
    public Optional<CxPageEventHandlerTriggerFulfillment> getTriggerFulfillment() {
        return Optional.ofNullable(this.triggerFulfillment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageEventHandler defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String event;
        private @Nullable String name;
        private @Nullable String targetFlow;
        private @Nullable String targetPage;
        private @Nullable CxPageEventHandlerTriggerFulfillment triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageEventHandler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.name = defaults.name;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder setEvent(@Nullable String event) {
            this.event = event;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTargetFlow(@Nullable String targetFlow) {
            this.targetFlow = targetFlow;
            return this;
        }

        public Builder setTargetPage(@Nullable String targetPage) {
            this.targetPage = targetPage;
            return this;
        }

        public Builder setTriggerFulfillment(@Nullable CxPageEventHandlerTriggerFulfillment triggerFulfillment) {
            this.triggerFulfillment = triggerFulfillment;
            return this;
        }
        public CxPageEventHandler build() {
            return new CxPageEventHandler(event, name, targetFlow, targetPage, triggerFulfillment);
        }
    }
}
