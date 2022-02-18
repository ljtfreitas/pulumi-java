// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Defines how often to run the search and the time interval.
 * 
 */
public final class ScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScheduleResponse Empty = new ScheduleResponse();

    /**
     * frequency (in minutes) at which rule condition should be evaluated.
     * 
     */
    @InputImport(name="frequencyInMinutes", required=true)
    private final Integer frequencyInMinutes;

    public Integer getFrequencyInMinutes() {
        return this.frequencyInMinutes;
    }

    /**
     * Time window for which data needs to be fetched for query (should be greater than or equal to frequencyInMinutes).
     * 
     */
    @InputImport(name="timeWindowInMinutes", required=true)
    private final Integer timeWindowInMinutes;

    public Integer getTimeWindowInMinutes() {
        return this.timeWindowInMinutes;
    }

    public ScheduleResponse(
        Integer frequencyInMinutes,
        Integer timeWindowInMinutes) {
        this.frequencyInMinutes = Objects.requireNonNull(frequencyInMinutes, "expected parameter 'frequencyInMinutes' to be non-null");
        this.timeWindowInMinutes = Objects.requireNonNull(timeWindowInMinutes, "expected parameter 'timeWindowInMinutes' to be non-null");
    }

    private ScheduleResponse() {
        this.frequencyInMinutes = null;
        this.timeWindowInMinutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer frequencyInMinutes;
        private Integer timeWindowInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequencyInMinutes = defaults.frequencyInMinutes;
    	      this.timeWindowInMinutes = defaults.timeWindowInMinutes;
        }

        public Builder setFrequencyInMinutes(Integer frequencyInMinutes) {
            this.frequencyInMinutes = Objects.requireNonNull(frequencyInMinutes);
            return this;
        }

        public Builder setTimeWindowInMinutes(Integer timeWindowInMinutes) {
            this.timeWindowInMinutes = Objects.requireNonNull(timeWindowInMinutes);
            return this;
        }

        public ScheduleResponse build() {
            return new ScheduleResponse(frequencyInMinutes, timeWindowInMinutes);
        }
    }
}
