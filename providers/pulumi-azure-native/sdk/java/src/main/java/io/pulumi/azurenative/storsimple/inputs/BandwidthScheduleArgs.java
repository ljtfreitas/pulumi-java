// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.azurenative.storsimple.enums.DayOfWeek;
import io.pulumi.azurenative.storsimple.inputs.TimeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * The schedule for bandwidth setting.
 * 
 */
public final class BandwidthScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BandwidthScheduleArgs Empty = new BandwidthScheduleArgs();

    /**
     * The days of the week when this schedule is applicable.
     * 
     */
    @InputImport(name="days", required=true)
        private final Input<List<DayOfWeek>> days;

    public Input<List<DayOfWeek>> getDays() {
        return this.days;
    }

    /**
     * The rate in Mbps.
     * 
     */
    @InputImport(name="rateInMbps", required=true)
        private final Input<Integer> rateInMbps;

    public Input<Integer> getRateInMbps() {
        return this.rateInMbps;
    }

    /**
     * The start time of the schedule.
     * 
     */
    @InputImport(name="start", required=true)
        private final Input<TimeArgs> start;

    public Input<TimeArgs> getStart() {
        return this.start;
    }

    /**
     * The stop time of the schedule.
     * 
     */
    @InputImport(name="stop", required=true)
        private final Input<TimeArgs> stop;

    public Input<TimeArgs> getStop() {
        return this.stop;
    }

    public BandwidthScheduleArgs(
        Input<List<DayOfWeek>> days,
        Input<Integer> rateInMbps,
        Input<TimeArgs> start,
        Input<TimeArgs> stop) {
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
        this.rateInMbps = Objects.requireNonNull(rateInMbps, "expected parameter 'rateInMbps' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
        this.stop = Objects.requireNonNull(stop, "expected parameter 'stop' to be non-null");
    }

    private BandwidthScheduleArgs() {
        this.days = Input.empty();
        this.rateInMbps = Input.empty();
        this.start = Input.empty();
        this.stop = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BandwidthScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<DayOfWeek>> days;
        private Input<Integer> rateInMbps;
        private Input<TimeArgs> start;
        private Input<TimeArgs> stop;

        public Builder() {
    	      // Empty
        }

        public Builder(BandwidthScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.rateInMbps = defaults.rateInMbps;
    	      this.start = defaults.start;
    	      this.stop = defaults.stop;
        }

        public Builder setDays(Input<List<DayOfWeek>> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setDays(List<DayOfWeek> days) {
            this.days = Input.of(Objects.requireNonNull(days));
            return this;
        }

        public Builder setRateInMbps(Input<Integer> rateInMbps) {
            this.rateInMbps = Objects.requireNonNull(rateInMbps);
            return this;
        }

        public Builder setRateInMbps(Integer rateInMbps) {
            this.rateInMbps = Input.of(Objects.requireNonNull(rateInMbps));
            return this;
        }

        public Builder setStart(Input<TimeArgs> start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public Builder setStart(TimeArgs start) {
            this.start = Input.of(Objects.requireNonNull(start));
            return this;
        }

        public Builder setStop(Input<TimeArgs> stop) {
            this.stop = Objects.requireNonNull(stop);
            return this;
        }

        public Builder setStop(TimeArgs stop) {
            this.stop = Input.of(Objects.requireNonNull(stop));
            return this;
        }
        public BandwidthScheduleArgs build() {
            return new BandwidthScheduleArgs(days, rateInMbps, start, stop);
        }
    }
}
