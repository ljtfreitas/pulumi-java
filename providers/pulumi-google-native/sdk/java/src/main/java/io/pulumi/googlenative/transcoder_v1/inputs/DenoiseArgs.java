// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Denoise preprocessing configuration.
 * 
 */
public final class DenoiseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DenoiseArgs Empty = new DenoiseArgs();

    /**
     * Set strength of the denoise. Enter a value between 0 and 1. The higher the value, the smoother the image. 0 is no denoising. The default is 0.
     * 
     */
    @InputImport(name="strength")
      private final @Nullable Input<Double> strength;

    public Input<Double> getStrength() {
        return this.strength == null ? Input.empty() : this.strength;
    }

    /**
     * Set the denoiser mode. The default is `standard`. Supported denoiser modes: - `standard` - `grain`
     * 
     */
    @InputImport(name="tune")
      private final @Nullable Input<String> tune;

    public Input<String> getTune() {
        return this.tune == null ? Input.empty() : this.tune;
    }

    public DenoiseArgs(
        @Nullable Input<Double> strength,
        @Nullable Input<String> tune) {
        this.strength = strength;
        this.tune = tune;
    }

    private DenoiseArgs() {
        this.strength = Input.empty();
        this.tune = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DenoiseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> strength;
        private @Nullable Input<String> tune;

        public Builder() {
    	      // Empty
        }

        public Builder(DenoiseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.strength = defaults.strength;
    	      this.tune = defaults.tune;
        }

        public Builder setStrength(@Nullable Input<Double> strength) {
            this.strength = strength;
            return this;
        }

        public Builder setStrength(@Nullable Double strength) {
            this.strength = Input.ofNullable(strength);
            return this;
        }

        public Builder setTune(@Nullable Input<String> tune) {
            this.tune = tune;
            return this;
        }

        public Builder setTune(@Nullable String tune) {
            this.tune = Input.ofNullable(tune);
            return this;
        }
        public DenoiseArgs build() {
            return new DenoiseArgs(strength, tune);
        }
    }
}
