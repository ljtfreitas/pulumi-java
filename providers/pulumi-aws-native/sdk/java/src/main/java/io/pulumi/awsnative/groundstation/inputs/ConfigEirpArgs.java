// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.enums.ConfigEirpUnits;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigEirpArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigEirpArgs Empty = new ConfigEirpArgs();

    @InputImport(name="units")
        private final @Nullable Input<ConfigEirpUnits> units;

    public Input<ConfigEirpUnits> getUnits() {
        return this.units == null ? Input.empty() : this.units;
    }

    @InputImport(name="value")
        private final @Nullable Input<Double> value;

    public Input<Double> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ConfigEirpArgs(
        @Nullable Input<ConfigEirpUnits> units,
        @Nullable Input<Double> value) {
        this.units = units;
        this.value = value;
    }

    private ConfigEirpArgs() {
        this.units = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigEirpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigEirpUnits> units;
        private @Nullable Input<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigEirpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.units = defaults.units;
    	      this.value = defaults.value;
        }

        public Builder setUnits(@Nullable Input<ConfigEirpUnits> units) {
            this.units = units;
            return this;
        }

        public Builder setUnits(@Nullable ConfigEirpUnits units) {
            this.units = Input.ofNullable(units);
            return this;
        }

        public Builder setValue(@Nullable Input<Double> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Double value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public ConfigEirpArgs build() {
            return new ConfigEirpArgs(units, value);
        }
    }
}
