// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.AudioEncoderAacResponse;
import io.pulumi.azurenative.videoanalyzer.inputs.VideoEncoderH264Response;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a custom preset for encoding the input content using the encoder processor.
 * 
 */
public final class EncoderCustomPresetResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncoderCustomPresetResponse Empty = new EncoderCustomPresetResponse();

    /**
     * Describes a custom preset for encoding audio.
     * 
     */
    @InputImport(name="audioEncoder")
    private final @Nullable AudioEncoderAacResponse audioEncoder;

    public Optional<AudioEncoderAacResponse> getAudioEncoder() {
        return this.audioEncoder == null ? Optional.empty() : Optional.ofNullable(this.audioEncoder);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EncoderCustomPreset'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Describes a custom preset for encoding video.
     * 
     */
    @InputImport(name="videoEncoder")
    private final @Nullable VideoEncoderH264Response videoEncoder;

    public Optional<VideoEncoderH264Response> getVideoEncoder() {
        return this.videoEncoder == null ? Optional.empty() : Optional.ofNullable(this.videoEncoder);
    }

    public EncoderCustomPresetResponse(
        @Nullable AudioEncoderAacResponse audioEncoder,
        String type,
        @Nullable VideoEncoderH264Response videoEncoder) {
        this.audioEncoder = audioEncoder;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.videoEncoder = videoEncoder;
    }

    private EncoderCustomPresetResponse() {
        this.audioEncoder = null;
        this.type = null;
        this.videoEncoder = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncoderCustomPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AudioEncoderAacResponse audioEncoder;
        private String type;
        private @Nullable VideoEncoderH264Response videoEncoder;

        public Builder() {
    	      // Empty
        }

        public Builder(EncoderCustomPresetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioEncoder = defaults.audioEncoder;
    	      this.type = defaults.type;
    	      this.videoEncoder = defaults.videoEncoder;
        }

        public Builder setAudioEncoder(@Nullable AudioEncoderAacResponse audioEncoder) {
            this.audioEncoder = audioEncoder;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVideoEncoder(@Nullable VideoEncoderH264Response videoEncoder) {
            this.videoEncoder = videoEncoder;
            return this;
        }

        public EncoderCustomPresetResponse build() {
            return new EncoderCustomPresetResponse(audioEncoder, type, videoEncoder);
        }
    }
}
