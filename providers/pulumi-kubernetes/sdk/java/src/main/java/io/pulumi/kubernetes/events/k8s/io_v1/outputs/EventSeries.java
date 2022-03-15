// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.events.k8s.io_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventSeries {
    /**
     * count is the number of occurrences in this series up to the last heartbeat time.
     * 
     */
    private final Integer count;
    /**
     * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
     * 
     */
    private final String lastObservedTime;

    @CustomType.Constructor
    private EventSeries(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("lastObservedTime") String lastObservedTime) {
        this.count = count;
        this.lastObservedTime = lastObservedTime;
    }

    /**
     * count is the number of occurrences in this series up to the last heartbeat time.
     * 
    */
    public Integer getCount() {
        return this.count;
    }
    /**
     * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
     * 
    */
    public String getLastObservedTime() {
        return this.lastObservedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSeries defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String lastObservedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSeries defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.lastObservedTime = defaults.lastObservedTime;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder lastObservedTime(String lastObservedTime) {
            this.lastObservedTime = Objects.requireNonNull(lastObservedTime);
            return this;
        }
        public EventSeries build() {
            return new EventSeries(count, lastObservedTime);
        }
    }
}
