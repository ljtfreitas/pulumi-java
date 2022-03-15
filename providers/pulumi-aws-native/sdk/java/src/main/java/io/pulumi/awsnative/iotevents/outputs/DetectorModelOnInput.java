// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelEvent;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelTransitionEvent;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DetectorModelOnInput {
    /**
     * Specifies the `actions` performed when the `condition` evaluates to `TRUE`.
     * 
     */
    private final @Nullable List<DetectorModelEvent> events;
    /**
     * Specifies the `actions` performed, and the next `state` entered, when a `condition` evaluates to `TRUE`.
     * 
     */
    private final @Nullable List<DetectorModelTransitionEvent> transitionEvents;

    @CustomType.Constructor
    private DetectorModelOnInput(
        @CustomType.Parameter("events") @Nullable List<DetectorModelEvent> events,
        @CustomType.Parameter("transitionEvents") @Nullable List<DetectorModelTransitionEvent> transitionEvents) {
        this.events = events;
        this.transitionEvents = transitionEvents;
    }

    /**
     * Specifies the `actions` performed when the `condition` evaluates to `TRUE`.
     * 
    */
    public List<DetectorModelEvent> getEvents() {
        return this.events == null ? List.of() : this.events;
    }
    /**
     * Specifies the `actions` performed, and the next `state` entered, when a `condition` evaluates to `TRUE`.
     * 
    */
    public List<DetectorModelTransitionEvent> getTransitionEvents() {
        return this.transitionEvents == null ? List.of() : this.transitionEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelOnInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DetectorModelEvent> events;
        private @Nullable List<DetectorModelTransitionEvent> transitionEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelOnInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.transitionEvents = defaults.transitionEvents;
        }

        public Builder events(@Nullable List<DetectorModelEvent> events) {
            this.events = events;
            return this;
        }

        public Builder transitionEvents(@Nullable List<DetectorModelTransitionEvent> transitionEvents) {
            this.transitionEvents = transitionEvents;
            return this;
        }
        public DetectorModelOnInput build() {
            return new DetectorModelOnInput(events, transitionEvents);
        }
    }
}
