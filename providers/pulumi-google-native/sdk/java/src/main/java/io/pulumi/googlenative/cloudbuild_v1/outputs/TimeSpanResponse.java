// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TimeSpanResponse {
    /**
     * End of time span.
     * 
     */
    private final String endTime;
    /**
     * Start of time span.
     * 
     */
    private final String startTime;

    @OutputCustomType.Constructor({"endTime","startTime"})
    private TimeSpanResponse(
        String endTime,
        String startTime) {
        this.endTime = Objects.requireNonNull(endTime);
        this.startTime = Objects.requireNonNull(startTime);
    }

    /**
     * End of time span.
     * 
     */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Start of time span.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSpanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSpanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public TimeSpanResponse build() {
            return new TimeSpanResponse(endTime, startTime);
        }
    }
}
