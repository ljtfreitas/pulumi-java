// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorMappingAvailabilityResponse {
    /**
     * The frequency to update.
     * 
     */
    private final @Nullable String frequency;
    /**
     * The interval of the given frequency to use.
     * 
     */
    private final Integer interval;

    @OutputCustomType.Constructor({"frequency","interval"})
    private ConnectorMappingAvailabilityResponse(
        @Nullable String frequency,
        Integer interval) {
        this.frequency = frequency;
        this.interval = Objects.requireNonNull(interval);
    }

    /**
     * The frequency to update.
     * 
     */
    public Optional<String> getFrequency() {
        return Optional.ofNullable(this.frequency);
    }
    /**
     * The interval of the given frequency to use.
     * 
     */
    public Integer getInterval() {
        return this.interval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingAvailabilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String frequency;
        private Integer interval;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingAvailabilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
        }

        public Builder setFrequency(@Nullable String frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder setInterval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public ConnectorMappingAvailabilityResponse build() {
            return new ConnectorMappingAvailabilityResponse(frequency, interval);
        }
    }
}
