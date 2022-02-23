// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.enums.ConfigPolarization;
import io.pulumi.awsnative.groundstation.inputs.ConfigFrequencyArgs;
import io.pulumi.awsnative.groundstation.inputs.ConfigFrequencyBandwidthArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigSpectrumConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigSpectrumConfigArgs Empty = new ConfigSpectrumConfigArgs();

    @InputImport(name="bandwidth")
        private final @Nullable Input<ConfigFrequencyBandwidthArgs> bandwidth;

    public Input<ConfigFrequencyBandwidthArgs> getBandwidth() {
        return this.bandwidth == null ? Input.empty() : this.bandwidth;
    }

    @InputImport(name="centerFrequency")
        private final @Nullable Input<ConfigFrequencyArgs> centerFrequency;

    public Input<ConfigFrequencyArgs> getCenterFrequency() {
        return this.centerFrequency == null ? Input.empty() : this.centerFrequency;
    }

    @InputImport(name="polarization")
        private final @Nullable Input<ConfigPolarization> polarization;

    public Input<ConfigPolarization> getPolarization() {
        return this.polarization == null ? Input.empty() : this.polarization;
    }

    public ConfigSpectrumConfigArgs(
        @Nullable Input<ConfigFrequencyBandwidthArgs> bandwidth,
        @Nullable Input<ConfigFrequencyArgs> centerFrequency,
        @Nullable Input<ConfigPolarization> polarization) {
        this.bandwidth = bandwidth;
        this.centerFrequency = centerFrequency;
        this.polarization = polarization;
    }

    private ConfigSpectrumConfigArgs() {
        this.bandwidth = Input.empty();
        this.centerFrequency = Input.empty();
        this.polarization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigSpectrumConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigFrequencyBandwidthArgs> bandwidth;
        private @Nullable Input<ConfigFrequencyArgs> centerFrequency;
        private @Nullable Input<ConfigPolarization> polarization;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigSpectrumConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.centerFrequency = defaults.centerFrequency;
    	      this.polarization = defaults.polarization;
        }

        public Builder setBandwidth(@Nullable Input<ConfigFrequencyBandwidthArgs> bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        public Builder setBandwidth(@Nullable ConfigFrequencyBandwidthArgs bandwidth) {
            this.bandwidth = Input.ofNullable(bandwidth);
            return this;
        }

        public Builder setCenterFrequency(@Nullable Input<ConfigFrequencyArgs> centerFrequency) {
            this.centerFrequency = centerFrequency;
            return this;
        }

        public Builder setCenterFrequency(@Nullable ConfigFrequencyArgs centerFrequency) {
            this.centerFrequency = Input.ofNullable(centerFrequency);
            return this;
        }

        public Builder setPolarization(@Nullable Input<ConfigPolarization> polarization) {
            this.polarization = polarization;
            return this;
        }

        public Builder setPolarization(@Nullable ConfigPolarization polarization) {
            this.polarization = Input.ofNullable(polarization);
            return this;
        }
        public ConfigSpectrumConfigArgs build() {
            return new ConfigSpectrumConfigArgs(bandwidth, centerFrequency, polarization);
        }
    }
}
