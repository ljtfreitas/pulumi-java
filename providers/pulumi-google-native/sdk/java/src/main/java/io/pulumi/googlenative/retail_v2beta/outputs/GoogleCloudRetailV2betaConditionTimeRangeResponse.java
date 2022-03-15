// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaConditionTimeRangeResponse {
    /**
     * End of time range. Range is inclusive.
     * 
     */
    private final String endTime;
    /**
     * Start of time range. Range is inclusive.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaConditionTimeRangeResponse(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("startTime") String startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }

    /**
     * End of time range. Range is inclusive.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Start of time range. Range is inclusive.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaConditionTimeRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaConditionTimeRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public GoogleCloudRetailV2betaConditionTimeRangeResponse build() {
            return new GoogleCloudRetailV2betaConditionTimeRangeResponse(endTime, startTime);
        }
    }
}
