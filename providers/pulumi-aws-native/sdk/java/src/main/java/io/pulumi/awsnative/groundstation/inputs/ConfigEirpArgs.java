// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.enums.ConfigEirpUnits;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigEirpArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigEirpArgs Empty = new ConfigEirpArgs();

    @Import(name="units")
      private final @Nullable Output<ConfigEirpUnits> units;

    public Output<ConfigEirpUnits> getUnits() {
        return this.units == null ? Output.empty() : this.units;
    }

    @Import(name="value")
      private final @Nullable Output<Double> value;

    public Output<Double> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public ConfigEirpArgs(
        @Nullable Output<ConfigEirpUnits> units,
        @Nullable Output<Double> value) {
        this.units = units;
        this.value = value;
    }

    private ConfigEirpArgs() {
        this.units = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigEirpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigEirpUnits> units;
        private @Nullable Output<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigEirpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.units = defaults.units;
    	      this.value = defaults.value;
        }

        public Builder units(@Nullable Output<ConfigEirpUnits> units) {
            this.units = units;
            return this;
        }

        public Builder units(@Nullable ConfigEirpUnits units) {
            this.units = Output.ofNullable(units);
            return this;
        }

        public Builder value(@Nullable Output<Double> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable Double value) {
            this.value = Output.ofNullable(value);
            return this;
        }
        public ConfigEirpArgs build() {
            return new ConfigEirpArgs(units, value);
        }
    }
}
