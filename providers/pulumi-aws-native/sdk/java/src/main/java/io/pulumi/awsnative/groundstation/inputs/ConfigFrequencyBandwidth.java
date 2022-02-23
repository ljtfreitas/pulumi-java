// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.enums.ConfigBandwidthUnits;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigFrequencyBandwidth extends io.pulumi.resources.InvokeArgs {

    public static final ConfigFrequencyBandwidth Empty = new ConfigFrequencyBandwidth();

    @InputImport(name="units")
        private final @Nullable ConfigBandwidthUnits units;

    public Optional<ConfigBandwidthUnits> getUnits() {
        return this.units == null ? Optional.empty() : Optional.ofNullable(this.units);
    }

    @InputImport(name="value")
        private final @Nullable Double value;

    public Optional<Double> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public ConfigFrequencyBandwidth(
        @Nullable ConfigBandwidthUnits units,
        @Nullable Double value) {
        this.units = units;
        this.value = value;
    }

    private ConfigFrequencyBandwidth() {
        this.units = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigFrequencyBandwidth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigBandwidthUnits units;
        private @Nullable Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigFrequencyBandwidth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.units = defaults.units;
    	      this.value = defaults.value;
        }

        public Builder setUnits(@Nullable ConfigBandwidthUnits units) {
            this.units = units;
            return this;
        }

        public Builder setValue(@Nullable Double value) {
            this.value = value;
            return this;
        }
        public ConfigFrequencyBandwidth build() {
            return new ConfigFrequencyBandwidth(units, value);
        }
    }
}
