// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.inputs.ConfigSpectrumConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigAntennaDownlinkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigAntennaDownlinkConfigArgs Empty = new ConfigAntennaDownlinkConfigArgs();

    @InputImport(name="spectrumConfig")
        private final @Nullable Input<ConfigSpectrumConfigArgs> spectrumConfig;

    public Input<ConfigSpectrumConfigArgs> getSpectrumConfig() {
        return this.spectrumConfig == null ? Input.empty() : this.spectrumConfig;
    }

    public ConfigAntennaDownlinkConfigArgs(@Nullable Input<ConfigSpectrumConfigArgs> spectrumConfig) {
        this.spectrumConfig = spectrumConfig;
    }

    private ConfigAntennaDownlinkConfigArgs() {
        this.spectrumConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigAntennaDownlinkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigSpectrumConfigArgs> spectrumConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigAntennaDownlinkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spectrumConfig = defaults.spectrumConfig;
        }

        public Builder setSpectrumConfig(@Nullable Input<ConfigSpectrumConfigArgs> spectrumConfig) {
            this.spectrumConfig = spectrumConfig;
            return this;
        }

        public Builder setSpectrumConfig(@Nullable ConfigSpectrumConfigArgs spectrumConfig) {
            this.spectrumConfig = Input.ofNullable(spectrumConfig);
            return this;
        }
        public ConfigAntennaDownlinkConfigArgs build() {
            return new ConfigAntennaDownlinkConfigArgs(spectrumConfig);
        }
    }
}
