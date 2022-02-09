// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicyWeeklyCycleDayOfWeekResponse {
    private final String day;
    private final String duration;
    private final String startTime;

    @OutputCustomType.Constructor({"day","duration","startTime"})
    private ResourcePolicyWeeklyCycleDayOfWeekResponse(
        String day,
        String duration,
        String startTime) {
        this.day = Objects.requireNonNull(day);
        this.duration = Objects.requireNonNull(duration);
        this.startTime = Objects.requireNonNull(startTime);
    }

    public String getDay() {
        return this.day;
    }
    public String getDuration() {
        return this.duration;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyWeeklyCycleDayOfWeekResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String duration;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyWeeklyCycleDayOfWeekResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDay(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public ResourcePolicyWeeklyCycleDayOfWeekResponse build() {
            return new ResourcePolicyWeeklyCycleDayOfWeekResponse(day, duration, startTime);
        }
    }
}