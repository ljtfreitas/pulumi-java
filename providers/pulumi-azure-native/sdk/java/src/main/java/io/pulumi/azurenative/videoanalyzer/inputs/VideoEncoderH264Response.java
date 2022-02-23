// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.VideoScaleResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A custom preset for encoding video with the H.264 (AVC) codec.
 * 
 */
public final class VideoEncoderH264Response extends io.pulumi.resources.InvokeArgs {

    public static final VideoEncoderH264Response Empty = new VideoEncoderH264Response();

    /**
     * The maximum bitrate, in kilobits per second or Kbps, at which video should be encoded. If omitted, encoder sets it automatically to try and match the quality of the input video.
     * 
     */
    @InputImport(name="bitrateKbps")
        private final @Nullable String bitrateKbps;

    public Optional<String> getBitrateKbps() {
        return this.bitrateKbps == null ? Optional.empty() : Optional.ofNullable(this.bitrateKbps);
    }

    /**
     * The frame rate (in frames per second) of the encoded video. The value must be greater than zero, and less than or equal to 300. If omitted, the encoder uses the average frame rate of the input video.
     * 
     */
    @InputImport(name="frameRate")
        private final @Nullable String frameRate;

    public Optional<String> getFrameRate() {
        return this.frameRate == null ? Optional.empty() : Optional.ofNullable(this.frameRate);
    }

    /**
     * Describes the resolution of the encoded video. If omitted, the encoder uses the resolution of the input video.
     * 
     */
    @InputImport(name="scale")
        private final @Nullable VideoScaleResponse scale;

    public Optional<VideoScaleResponse> getScale() {
        return this.scale == null ? Optional.empty() : Optional.ofNullable(this.scale);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoEncoderH264'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public VideoEncoderH264Response(
        @Nullable String bitrateKbps,
        @Nullable String frameRate,
        @Nullable VideoScaleResponse scale,
        String type) {
        this.bitrateKbps = bitrateKbps;
        this.frameRate = frameRate;
        this.scale = scale;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VideoEncoderH264Response() {
        this.bitrateKbps = null;
        this.frameRate = null;
        this.scale = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoEncoderH264Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bitrateKbps;
        private @Nullable String frameRate;
        private @Nullable VideoScaleResponse scale;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoEncoderH264Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateKbps = defaults.bitrateKbps;
    	      this.frameRate = defaults.frameRate;
    	      this.scale = defaults.scale;
    	      this.type = defaults.type;
        }

        public Builder setBitrateKbps(@Nullable String bitrateKbps) {
            this.bitrateKbps = bitrateKbps;
            return this;
        }

        public Builder setFrameRate(@Nullable String frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        public Builder setScale(@Nullable VideoScaleResponse scale) {
            this.scale = scale;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public VideoEncoderH264Response build() {
            return new VideoEncoderH264Response(bitrateKbps, frameRate, scale, type);
        }
    }
}
