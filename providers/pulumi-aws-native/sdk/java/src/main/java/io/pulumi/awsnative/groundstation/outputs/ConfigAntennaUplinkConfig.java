// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.awsnative.groundstation.outputs.ConfigEirp;
import io.pulumi.awsnative.groundstation.outputs.ConfigUplinkSpectrumConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigAntennaUplinkConfig {
    private final @Nullable ConfigUplinkSpectrumConfig spectrumConfig;
    private final @Nullable ConfigEirp targetEirp;
    private final @Nullable Boolean transmitDisabled;

    @OutputCustomType.Constructor({"spectrumConfig","targetEirp","transmitDisabled"})
    private ConfigAntennaUplinkConfig(
        @Nullable ConfigUplinkSpectrumConfig spectrumConfig,
        @Nullable ConfigEirp targetEirp,
        @Nullable Boolean transmitDisabled) {
        this.spectrumConfig = spectrumConfig;
        this.targetEirp = targetEirp;
        this.transmitDisabled = transmitDisabled;
    }

    public Optional<ConfigUplinkSpectrumConfig> getSpectrumConfig() {
        return Optional.ofNullable(this.spectrumConfig);
    }
    public Optional<ConfigEirp> getTargetEirp() {
        return Optional.ofNullable(this.targetEirp);
    }
    public Optional<Boolean> getTransmitDisabled() {
        return Optional.ofNullable(this.transmitDisabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigAntennaUplinkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigUplinkSpectrumConfig spectrumConfig;
        private @Nullable ConfigEirp targetEirp;
        private @Nullable Boolean transmitDisabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigAntennaUplinkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spectrumConfig = defaults.spectrumConfig;
    	      this.targetEirp = defaults.targetEirp;
    	      this.transmitDisabled = defaults.transmitDisabled;
        }

        public Builder setSpectrumConfig(@Nullable ConfigUplinkSpectrumConfig spectrumConfig) {
            this.spectrumConfig = spectrumConfig;
            return this;
        }

        public Builder setTargetEirp(@Nullable ConfigEirp targetEirp) {
            this.targetEirp = targetEirp;
            return this;
        }

        public Builder setTransmitDisabled(@Nullable Boolean transmitDisabled) {
            this.transmitDisabled = transmitDisabled;
            return this;
        }
        public ConfigAntennaUplinkConfig build() {
            return new ConfigAntennaUplinkConfig(spectrumConfig, targetEirp, transmitDisabled);
        }
    }
}
