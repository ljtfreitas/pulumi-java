// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class TimeoutConfigProperties {
    private final Integer inProgressTimeoutInMinutes;

    @OutputCustomType.Constructor({"inProgressTimeoutInMinutes"})
    private TimeoutConfigProperties(Integer inProgressTimeoutInMinutes) {
        this.inProgressTimeoutInMinutes = Objects.requireNonNull(inProgressTimeoutInMinutes);
    }

    public Integer getInProgressTimeoutInMinutes() {
        return this.inProgressTimeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeoutConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer inProgressTimeoutInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeoutConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inProgressTimeoutInMinutes = defaults.inProgressTimeoutInMinutes;
        }

        public Builder setInProgressTimeoutInMinutes(Integer inProgressTimeoutInMinutes) {
            this.inProgressTimeoutInMinutes = Objects.requireNonNull(inProgressTimeoutInMinutes);
            return this;
        }
        public TimeoutConfigProperties build() {
            return new TimeoutConfigProperties(inProgressTimeoutInMinutes);
        }
    }
}
