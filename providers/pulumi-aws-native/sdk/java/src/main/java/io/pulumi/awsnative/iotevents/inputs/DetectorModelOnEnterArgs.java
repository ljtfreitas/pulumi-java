// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelEventArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * When entering this state, perform these `actions` if the `condition` is `TRUE`.
 * 
 */
public final class DetectorModelOnEnterArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelOnEnterArgs Empty = new DetectorModelOnEnterArgs();

    /**
     * Specifies the `actions` that are performed when the state is entered and the `condition` is `TRUE`.
     * 
     */
    @InputImport(name="events")
        private final @Nullable Input<List<DetectorModelEventArgs>> events;

    public Input<List<DetectorModelEventArgs>> getEvents() {
        return this.events == null ? Input.empty() : this.events;
    }

    public DetectorModelOnEnterArgs(@Nullable Input<List<DetectorModelEventArgs>> events) {
        this.events = events;
    }

    private DetectorModelOnEnterArgs() {
        this.events = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelOnEnterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DetectorModelEventArgs>> events;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelOnEnterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
        }

        public Builder setEvents(@Nullable Input<List<DetectorModelEventArgs>> events) {
            this.events = events;
            return this;
        }

        public Builder setEvents(@Nullable List<DetectorModelEventArgs> events) {
            this.events = Input.ofNullable(events);
            return this;
        }
        public DetectorModelOnEnterArgs build() {
            return new DetectorModelOnEnterArgs(events);
        }
    }
}
