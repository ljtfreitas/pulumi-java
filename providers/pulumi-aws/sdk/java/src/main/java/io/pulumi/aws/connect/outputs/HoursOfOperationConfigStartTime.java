// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class HoursOfOperationConfigStartTime {
    /**
     * Specifies the hour of opening.
     * 
     */
    private final Integer hours;
    /**
     * Specifies the minute of opening.
     * 
     */
    private final Integer minutes;

    @OutputCustomType.Constructor({"hours","minutes"})
    private HoursOfOperationConfigStartTime(
        Integer hours,
        Integer minutes) {
        this.hours = Objects.requireNonNull(hours);
        this.minutes = Objects.requireNonNull(minutes);
    }

    /**
     * Specifies the hour of opening.
     * 
     */
    public Integer getHours() {
        return this.hours;
    }
    /**
     * Specifies the minute of opening.
     * 
     */
    public Integer getMinutes() {
        return this.minutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationConfigStartTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hours;
        private Integer minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(HoursOfOperationConfigStartTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
        }

        public Builder setHours(Integer hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }

        public Builder setMinutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public HoursOfOperationConfigStartTime build() {
            return new HoursOfOperationConfigStartTime(hours, minutes);
        }
    }
}
