// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * Color preprocessing configuration.
 * 
 */
public final class ColorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ColorResponse Empty = new ColorResponse();

    /**
     * Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness and 1 is maximum brightness. 0 is no change. The default is 0.
     * 
     */
    @Import(name="brightness", required=true)
      private final Double brightness;

    public Double getBrightness() {
        return this.brightness;
    }

    /**
     * Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
     * 
     */
    @Import(name="contrast", required=true)
      private final Double contrast;

    public Double getContrast() {
        return this.contrast;
    }

    /**
     * Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
     * 
     */
    @Import(name="saturation", required=true)
      private final Double saturation;

    public Double getSaturation() {
        return this.saturation;
    }

    public ColorResponse(
        Double brightness,
        Double contrast,
        Double saturation) {
        this.brightness = Objects.requireNonNull(brightness, "expected parameter 'brightness' to be non-null");
        this.contrast = Objects.requireNonNull(contrast, "expected parameter 'contrast' to be non-null");
        this.saturation = Objects.requireNonNull(saturation, "expected parameter 'saturation' to be non-null");
    }

    private ColorResponse() {
        this.brightness = null;
        this.contrast = null;
        this.saturation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double brightness;
        private Double contrast;
        private Double saturation;

        public Builder() {
    	      // Empty
        }

        public Builder(ColorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brightness = defaults.brightness;
    	      this.contrast = defaults.contrast;
    	      this.saturation = defaults.saturation;
        }

        public Builder brightness(Double brightness) {
            this.brightness = Objects.requireNonNull(brightness);
            return this;
        }

        public Builder contrast(Double contrast) {
            this.contrast = Objects.requireNonNull(contrast);
            return this;
        }

        public Builder saturation(Double saturation) {
            this.saturation = Objects.requireNonNull(saturation);
            return this;
        }
        public ColorResponse build() {
            return new ColorResponse(brightness, contrast, saturation);
        }
    }
}
