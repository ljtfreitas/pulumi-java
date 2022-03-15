// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Represents period in days/months/years.
 * 
 */
public final class GoogleCloudChannelV1PeriodResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudChannelV1PeriodResponse Empty = new GoogleCloudChannelV1PeriodResponse();

    /**
     * Total duration of Period Type defined.
     * 
     */
    @Import(name="duration", required=true)
      private final Integer duration;

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * Period Type.
     * 
     */
    @Import(name="periodType", required=true)
      private final String periodType;

    public String getPeriodType() {
        return this.periodType;
    }

    public GoogleCloudChannelV1PeriodResponse(
        Integer duration,
        String periodType) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.periodType = Objects.requireNonNull(periodType, "expected parameter 'periodType' to be non-null");
    }

    private GoogleCloudChannelV1PeriodResponse() {
        this.duration = null;
        this.periodType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1PeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer duration;
        private String periodType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1PeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.periodType = defaults.periodType;
        }

        public Builder duration(Integer duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder periodType(String periodType) {
            this.periodType = Objects.requireNonNull(periodType);
            return this;
        }
        public GoogleCloudChannelV1PeriodResponse build() {
            return new GoogleCloudChannelV1PeriodResponse(duration, periodType);
        }
    }
}
