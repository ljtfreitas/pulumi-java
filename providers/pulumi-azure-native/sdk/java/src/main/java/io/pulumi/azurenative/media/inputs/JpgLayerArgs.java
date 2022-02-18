// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the settings to produce a JPEG image from the input video.
 * 
 */
public final class JpgLayerArgs extends io.pulumi.resources.ResourceArgs {

    public static final JpgLayerArgs Empty = new JpgLayerArgs();

    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
     */
    @InputImport(name="height")
    private final @Nullable Input<String> height;

    public Input<String> getHeight() {
        return this.height == null ? Input.empty() : this.height;
    }

    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    @InputImport(name="label")
    private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JpgLayer'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     * 
     */
    @InputImport(name="quality")
    private final @Nullable Input<Integer> quality;

    public Input<Integer> getQuality() {
        return this.quality == null ? Input.empty() : this.quality;
    }

    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
     */
    @InputImport(name="width")
    private final @Nullable Input<String> width;

    public Input<String> getWidth() {
        return this.width == null ? Input.empty() : this.width;
    }

    public JpgLayerArgs(
        @Nullable Input<String> height,
        @Nullable Input<String> label,
        Input<String> odataType,
        @Nullable Input<Integer> quality,
        @Nullable Input<String> width) {
        this.height = height;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.quality = quality;
        this.width = width;
    }

    private JpgLayerArgs() {
        this.height = Input.empty();
        this.label = Input.empty();
        this.odataType = Input.empty();
        this.quality = Input.empty();
        this.width = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JpgLayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> height;
        private @Nullable Input<String> label;
        private Input<String> odataType;
        private @Nullable Input<Integer> quality;
        private @Nullable Input<String> width;

        public Builder() {
    	      // Empty
        }

        public Builder(JpgLayerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.quality = defaults.quality;
    	      this.width = defaults.width;
        }

        public Builder setHeight(@Nullable Input<String> height) {
            this.height = height;
            return this;
        }

        public Builder setHeight(@Nullable String height) {
            this.height = Input.ofNullable(height);
            return this;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setQuality(@Nullable Input<Integer> quality) {
            this.quality = quality;
            return this;
        }

        public Builder setQuality(@Nullable Integer quality) {
            this.quality = Input.ofNullable(quality);
            return this;
        }

        public Builder setWidth(@Nullable Input<String> width) {
            this.width = width;
            return this;
        }

        public Builder setWidth(@Nullable String width) {
            this.width = Input.ofNullable(width);
            return this;
        }

        public JpgLayerArgs build() {
            return new JpgLayerArgs(height, label, odataType, quality, width);
        }
    }
}
