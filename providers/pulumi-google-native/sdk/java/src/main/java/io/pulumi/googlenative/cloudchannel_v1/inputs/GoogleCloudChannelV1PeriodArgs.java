// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudchannel_v1.enums.GoogleCloudChannelV1PeriodPeriodType;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents period in days/months/years.
 * 
 */
public final class GoogleCloudChannelV1PeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudChannelV1PeriodArgs Empty = new GoogleCloudChannelV1PeriodArgs();

    /**
     * Total duration of Period Type defined.
     * 
     */
    @InputImport(name="duration")
      private final @Nullable Input<Integer> duration;

    public Input<Integer> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    /**
     * Period Type.
     * 
     */
    @InputImport(name="periodType")
      private final @Nullable Input<GoogleCloudChannelV1PeriodPeriodType> periodType;

    public Input<GoogleCloudChannelV1PeriodPeriodType> getPeriodType() {
        return this.periodType == null ? Input.empty() : this.periodType;
    }

    public GoogleCloudChannelV1PeriodArgs(
        @Nullable Input<Integer> duration,
        @Nullable Input<GoogleCloudChannelV1PeriodPeriodType> periodType) {
        this.duration = duration;
        this.periodType = periodType;
    }

    private GoogleCloudChannelV1PeriodArgs() {
        this.duration = Input.empty();
        this.periodType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1PeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> duration;
        private @Nullable Input<GoogleCloudChannelV1PeriodPeriodType> periodType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1PeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.periodType = defaults.periodType;
        }

        public Builder setDuration(@Nullable Input<Integer> duration) {
            this.duration = duration;
            return this;
        }

        public Builder setDuration(@Nullable Integer duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder setPeriodType(@Nullable Input<GoogleCloudChannelV1PeriodPeriodType> periodType) {
            this.periodType = periodType;
            return this;
        }

        public Builder setPeriodType(@Nullable GoogleCloudChannelV1PeriodPeriodType periodType) {
            this.periodType = Input.ofNullable(periodType);
            return this;
        }
        public GoogleCloudChannelV1PeriodArgs build() {
            return new GoogleCloudChannelV1PeriodArgs(duration, periodType);
        }
    }
}
