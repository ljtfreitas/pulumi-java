// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.enums.FrequencyTypes;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connector mapping property availability.
 * 
 */
public final class ConnectorMappingAvailabilityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorMappingAvailabilityArgs Empty = new ConnectorMappingAvailabilityArgs();

    /**
     * The frequency to update.
     * 
     */
    @Import(name="frequency")
      private final @Nullable Output<FrequencyTypes> frequency;

    public Output<FrequencyTypes> getFrequency() {
        return this.frequency == null ? Output.empty() : this.frequency;
    }

    /**
     * The interval of the given frequency to use.
     * 
     */
    @Import(name="interval", required=true)
      private final Output<Integer> interval;

    public Output<Integer> getInterval() {
        return this.interval;
    }

    public ConnectorMappingAvailabilityArgs(
        @Nullable Output<FrequencyTypes> frequency,
        Output<Integer> interval) {
        this.frequency = frequency;
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
    }

    private ConnectorMappingAvailabilityArgs() {
        this.frequency = Output.empty();
        this.interval = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingAvailabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FrequencyTypes> frequency;
        private Output<Integer> interval;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingAvailabilityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
        }

        public Builder frequency(@Nullable Output<FrequencyTypes> frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder frequency(@Nullable FrequencyTypes frequency) {
            this.frequency = Output.ofNullable(frequency);
            return this;
        }

        public Builder interval(Output<Integer> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder interval(Integer interval) {
            this.interval = Output.of(Objects.requireNonNull(interval));
            return this;
        }
        public ConnectorMappingAvailabilityArgs build() {
            return new ConnectorMappingAvailabilityArgs(frequency, interval);
        }
    }
}
