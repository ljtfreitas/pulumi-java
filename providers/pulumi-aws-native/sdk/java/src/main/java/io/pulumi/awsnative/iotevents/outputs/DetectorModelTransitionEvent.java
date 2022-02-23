// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelAction;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelTransitionEvent {
    /**
     * The actions to be performed.
     * 
     */
    private final @Nullable List<DetectorModelAction> actions;
    /**
     * A Boolean expression that when `TRUE` causes the `actions` to be performed and the `nextState` to be entered.
     * 
     */
    private final String condition;
    /**
     * The name of the event.
     * 
     */
    private final String eventName;
    /**
     * The next state to enter.
     * 
     */
    private final String nextState;

    @OutputCustomType.Constructor({"actions","condition","eventName","nextState"})
    private DetectorModelTransitionEvent(
        @Nullable List<DetectorModelAction> actions,
        String condition,
        String eventName,
        String nextState) {
        this.actions = actions;
        this.condition = Objects.requireNonNull(condition);
        this.eventName = Objects.requireNonNull(eventName);
        this.nextState = Objects.requireNonNull(nextState);
    }

    /**
     * The actions to be performed.
     * 
     */
    public List<DetectorModelAction> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * A Boolean expression that when `TRUE` causes the `actions` to be performed and the `nextState` to be entered.
     * 
     */
    public String getCondition() {
        return this.condition;
    }
    /**
     * The name of the event.
     * 
     */
    public String getEventName() {
        return this.eventName;
    }
    /**
     * The next state to enter.
     * 
     */
    public String getNextState() {
        return this.nextState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelTransitionEvent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DetectorModelAction> actions;
        private String condition;
        private String eventName;
        private String nextState;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelTransitionEvent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.condition = defaults.condition;
    	      this.eventName = defaults.eventName;
    	      this.nextState = defaults.nextState;
        }

        public Builder setActions(@Nullable List<DetectorModelAction> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setCondition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setEventName(String eventName) {
            this.eventName = Objects.requireNonNull(eventName);
            return this;
        }

        public Builder setNextState(String nextState) {
            this.nextState = Objects.requireNonNull(nextState);
            return this;
        }
        public DetectorModelTransitionEvent build() {
            return new DetectorModelTransitionEvent(actions, condition, eventName, nextState);
        }
    }
}
