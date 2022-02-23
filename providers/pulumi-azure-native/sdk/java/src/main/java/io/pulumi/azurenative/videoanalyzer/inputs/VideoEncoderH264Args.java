// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.VideoScaleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A custom preset for encoding video with the H.264 (AVC) codec.
 * 
 */
public final class VideoEncoderH264Args extends io.pulumi.resources.ResourceArgs {

    public static final VideoEncoderH264Args Empty = new VideoEncoderH264Args();

    /**
     * The maximum bitrate, in kilobits per second or Kbps, at which video should be encoded. If omitted, encoder sets it automatically to try and match the quality of the input video.
     * 
     */
    @InputImport(name="bitrateKbps")
        private final @Nullable Input<String> bitrateKbps;

    public Input<String> getBitrateKbps() {
        return this.bitrateKbps == null ? Input.empty() : this.bitrateKbps;
    }

    /**
     * The frame rate (in frames per second) of the encoded video. The value must be greater than zero, and less than or equal to 300. If omitted, the encoder uses the average frame rate of the input video.
     * 
     */
    @InputImport(name="frameRate")
        private final @Nullable Input<String> frameRate;

    public Input<String> getFrameRate() {
        return this.frameRate == null ? Input.empty() : this.frameRate;
    }

    /**
     * Describes the resolution of the encoded video. If omitted, the encoder uses the resolution of the input video.
     * 
     */
    @InputImport(name="scale")
        private final @Nullable Input<VideoScaleArgs> scale;

    public Input<VideoScaleArgs> getScale() {
        return this.scale == null ? Input.empty() : this.scale;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoEncoderH264'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public VideoEncoderH264Args(
        @Nullable Input<String> bitrateKbps,
        @Nullable Input<String> frameRate,
        @Nullable Input<VideoScaleArgs> scale,
        Input<String> type) {
        this.bitrateKbps = bitrateKbps;
        this.frameRate = frameRate;
        this.scale = scale;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VideoEncoderH264Args() {
        this.bitrateKbps = Input.empty();
        this.frameRate = Input.empty();
        this.scale = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoEncoderH264Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bitrateKbps;
        private @Nullable Input<String> frameRate;
        private @Nullable Input<VideoScaleArgs> scale;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoEncoderH264Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateKbps = defaults.bitrateKbps;
    	      this.frameRate = defaults.frameRate;
    	      this.scale = defaults.scale;
    	      this.type = defaults.type;
        }

        public Builder setBitrateKbps(@Nullable Input<String> bitrateKbps) {
            this.bitrateKbps = bitrateKbps;
            return this;
        }

        public Builder setBitrateKbps(@Nullable String bitrateKbps) {
            this.bitrateKbps = Input.ofNullable(bitrateKbps);
            return this;
        }

        public Builder setFrameRate(@Nullable Input<String> frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        public Builder setFrameRate(@Nullable String frameRate) {
            this.frameRate = Input.ofNullable(frameRate);
            return this;
        }

        public Builder setScale(@Nullable Input<VideoScaleArgs> scale) {
            this.scale = scale;
            return this;
        }

        public Builder setScale(@Nullable VideoScaleArgs scale) {
            this.scale = Input.ofNullable(scale);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public VideoEncoderH264Args build() {
            return new VideoEncoderH264Args(bitrateKbps, frameRate, scale, type);
        }
    }
}
