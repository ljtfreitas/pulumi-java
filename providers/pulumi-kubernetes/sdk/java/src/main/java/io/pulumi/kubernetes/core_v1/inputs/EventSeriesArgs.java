// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 * 
 */
public final class EventSeriesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSeriesArgs Empty = new EventSeriesArgs();

    /**
     * Number of occurrences in this series up to the last heartbeat time
     * 
     */
    @InputImport(name="count")
        private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * Time of the last occurrence observed
     * 
     */
    @InputImport(name="lastObservedTime")
        private final @Nullable Input<String> lastObservedTime;

    public Input<String> getLastObservedTime() {
        return this.lastObservedTime == null ? Input.empty() : this.lastObservedTime;
    }

    /**
     * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
     * 
     */
    @InputImport(name="state")
        private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public EventSeriesArgs(
        @Nullable Input<Integer> count,
        @Nullable Input<String> lastObservedTime,
        @Nullable Input<String> state) {
        this.count = count;
        this.lastObservedTime = lastObservedTime;
        this.state = state;
    }

    private EventSeriesArgs() {
        this.count = Input.empty();
        this.lastObservedTime = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;
        private @Nullable Input<String> lastObservedTime;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSeriesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.lastObservedTime = defaults.lastObservedTime;
    	      this.state = defaults.state;
        }

        public Builder setCount(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setLastObservedTime(@Nullable Input<String> lastObservedTime) {
            this.lastObservedTime = lastObservedTime;
            return this;
        }

        public Builder setLastObservedTime(@Nullable String lastObservedTime) {
            this.lastObservedTime = Input.ofNullable(lastObservedTime);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public EventSeriesArgs build() {
            return new EventSeriesArgs(count, lastObservedTime, state);
        }
    }
}
