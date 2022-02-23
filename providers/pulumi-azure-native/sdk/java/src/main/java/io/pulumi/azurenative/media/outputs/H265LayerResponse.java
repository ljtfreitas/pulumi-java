// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class H265LayerResponse {
    /**
     * Specifies whether or not adaptive B-frames are to be used when encoding this layer. If not specified, the encoder will turn it on whenever the video profile permits its use.
     * 
     */
    private final @Nullable Boolean adaptiveBFrame;
    /**
     * The number of B-frames to be used when encoding this layer.  If not specified, the encoder chooses an appropriate number based on the video profile and level.
     * 
     */
    private final @Nullable Integer bFrames;
    /**
     * The average bitrate in bits per second at which to encode the input video when generating this layer. For example: a target bitrate of 3000Kbps or 3Mbps means this value should be 3000000 This is a required field.
     * 
     */
    private final Integer bitrate;
    /**
     * The VBV buffer window length. The value should be in ISO 8601 format. The value should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     * 
     */
    private final @Nullable String bufferWindow;
    /**
     * The frame rate (in frames per second) at which to encode this layer. The value can be in the form of M/N where M and N are integers (For example, 30000/1001), or in the form of a number (For example, 30, or 29.97). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is not specified, the encoder will use the same frame rate as the input video.
     * 
     */
    private final @Nullable String frameRate;
    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
     */
    private final @Nullable String height;
    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    private final @Nullable String label;
    /**
     * We currently support Level up to 6.2. The value can be Auto, or a number that matches the H.265 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate for this layer.
     * 
     */
    private final @Nullable String level;
    /**
     * The maximum bitrate (in bits per second), at which the VBV buffer should be assumed to refill. If not specified, defaults to the same value as bitrate.
     * 
     */
    private final @Nullable Integer maxBitrate;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.H265Layer'.
     * 
     */
    private final String odataType;
    /**
     * We currently support Main. Default is Auto.
     * 
     */
    private final @Nullable String profile;
    /**
     * The number of reference frames to be used when encoding this layer. If not specified, the encoder determines an appropriate number based on the encoder complexity setting.
     * 
     */
    private final @Nullable Integer referenceFrames;
    /**
     * The number of slices to be used when encoding this layer. If not specified, default is zero, which means that encoder will use a single slice for each frame.
     * 
     */
    private final @Nullable Integer slices;
    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
     */
    private final @Nullable String width;

    @OutputCustomType.Constructor({"adaptiveBFrame","bFrames","bitrate","bufferWindow","frameRate","height","label","level","maxBitrate","odataType","profile","referenceFrames","slices","width"})
    private H265LayerResponse(
        @Nullable Boolean adaptiveBFrame,
        @Nullable Integer bFrames,
        Integer bitrate,
        @Nullable String bufferWindow,
        @Nullable String frameRate,
        @Nullable String height,
        @Nullable String label,
        @Nullable String level,
        @Nullable Integer maxBitrate,
        String odataType,
        @Nullable String profile,
        @Nullable Integer referenceFrames,
        @Nullable Integer slices,
        @Nullable String width) {
        this.adaptiveBFrame = adaptiveBFrame;
        this.bFrames = bFrames;
        this.bitrate = Objects.requireNonNull(bitrate);
        this.bufferWindow = bufferWindow;
        this.frameRate = frameRate;
        this.height = height;
        this.label = label;
        this.level = level;
        this.maxBitrate = maxBitrate;
        this.odataType = Objects.requireNonNull(odataType);
        this.profile = profile;
        this.referenceFrames = referenceFrames;
        this.slices = slices;
        this.width = width;
    }

    /**
     * Specifies whether or not adaptive B-frames are to be used when encoding this layer. If not specified, the encoder will turn it on whenever the video profile permits its use.
     * 
     */
    public Optional<Boolean> getAdaptiveBFrame() {
        return Optional.ofNullable(this.adaptiveBFrame);
    }
    /**
     * The number of B-frames to be used when encoding this layer.  If not specified, the encoder chooses an appropriate number based on the video profile and level.
     * 
     */
    public Optional<Integer> getBFrames() {
        return Optional.ofNullable(this.bFrames);
    }
    /**
     * The average bitrate in bits per second at which to encode the input video when generating this layer. For example: a target bitrate of 3000Kbps or 3Mbps means this value should be 3000000 This is a required field.
     * 
     */
    public Integer getBitrate() {
        return this.bitrate;
    }
    /**
     * The VBV buffer window length. The value should be in ISO 8601 format. The value should be in the range [0.1-100] seconds. The default is 5 seconds (for example, PT5S).
     * 
     */
    public Optional<String> getBufferWindow() {
        return Optional.ofNullable(this.bufferWindow);
    }
    /**
     * The frame rate (in frames per second) at which to encode this layer. The value can be in the form of M/N where M and N are integers (For example, 30000/1001), or in the form of a number (For example, 30, or 29.97). The encoder enforces constraints on allowed frame rates based on the profile and level. If it is not specified, the encoder will use the same frame rate as the input video.
     * 
     */
    public Optional<String> getFrameRate() {
        return Optional.ofNullable(this.frameRate);
    }
    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
     */
    public Optional<String> getHeight() {
        return Optional.ofNullable(this.height);
    }
    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    /**
     * We currently support Level up to 6.2. The value can be Auto, or a number that matches the H.265 profile. If not specified, the default is Auto, which lets the encoder choose the Level that is appropriate for this layer.
     * 
     */
    public Optional<String> getLevel() {
        return Optional.ofNullable(this.level);
    }
    /**
     * The maximum bitrate (in bits per second), at which the VBV buffer should be assumed to refill. If not specified, defaults to the same value as bitrate.
     * 
     */
    public Optional<Integer> getMaxBitrate() {
        return Optional.ofNullable(this.maxBitrate);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.H265Layer'.
     * 
     */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * We currently support Main. Default is Auto.
     * 
     */
    public Optional<String> getProfile() {
        return Optional.ofNullable(this.profile);
    }
    /**
     * The number of reference frames to be used when encoding this layer. If not specified, the encoder determines an appropriate number based on the encoder complexity setting.
     * 
     */
    public Optional<Integer> getReferenceFrames() {
        return Optional.ofNullable(this.referenceFrames);
    }
    /**
     * The number of slices to be used when encoding this layer. If not specified, default is zero, which means that encoder will use a single slice for each frame.
     * 
     */
    public Optional<Integer> getSlices() {
        return Optional.ofNullable(this.slices);
    }
    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
     */
    public Optional<String> getWidth() {
        return Optional.ofNullable(this.width);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(H265LayerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean adaptiveBFrame;
        private @Nullable Integer bFrames;
        private Integer bitrate;
        private @Nullable String bufferWindow;
        private @Nullable String frameRate;
        private @Nullable String height;
        private @Nullable String label;
        private @Nullable String level;
        private @Nullable Integer maxBitrate;
        private String odataType;
        private @Nullable String profile;
        private @Nullable Integer referenceFrames;
        private @Nullable Integer slices;
        private @Nullable String width;

        public Builder() {
    	      // Empty
        }

        public Builder(H265LayerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveBFrame = defaults.adaptiveBFrame;
    	      this.bFrames = defaults.bFrames;
    	      this.bitrate = defaults.bitrate;
    	      this.bufferWindow = defaults.bufferWindow;
    	      this.frameRate = defaults.frameRate;
    	      this.height = defaults.height;
    	      this.label = defaults.label;
    	      this.level = defaults.level;
    	      this.maxBitrate = defaults.maxBitrate;
    	      this.odataType = defaults.odataType;
    	      this.profile = defaults.profile;
    	      this.referenceFrames = defaults.referenceFrames;
    	      this.slices = defaults.slices;
    	      this.width = defaults.width;
        }

        public Builder setAdaptiveBFrame(@Nullable Boolean adaptiveBFrame) {
            this.adaptiveBFrame = adaptiveBFrame;
            return this;
        }

        public Builder setBFrames(@Nullable Integer bFrames) {
            this.bFrames = bFrames;
            return this;
        }

        public Builder setBitrate(Integer bitrate) {
            this.bitrate = Objects.requireNonNull(bitrate);
            return this;
        }

        public Builder setBufferWindow(@Nullable String bufferWindow) {
            this.bufferWindow = bufferWindow;
            return this;
        }

        public Builder setFrameRate(@Nullable String frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        public Builder setHeight(@Nullable String height) {
            this.height = height;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setLevel(@Nullable String level) {
            this.level = level;
            return this;
        }

        public Builder setMaxBitrate(@Nullable Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setProfile(@Nullable String profile) {
            this.profile = profile;
            return this;
        }

        public Builder setReferenceFrames(@Nullable Integer referenceFrames) {
            this.referenceFrames = referenceFrames;
            return this;
        }

        public Builder setSlices(@Nullable Integer slices) {
            this.slices = slices;
            return this;
        }

        public Builder setWidth(@Nullable String width) {
            this.width = width;
            return this;
        }
        public H265LayerResponse build() {
            return new H265LayerResponse(adaptiveBFrame, bFrames, bitrate, bufferWindow, frameRate, height, label, level, maxBitrate, odataType, profile, referenceFrames, slices, width);
        }
    }
}
