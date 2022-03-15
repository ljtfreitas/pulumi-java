// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of an audio overlay.
 * 
 */
public final class AudioOverlayResponse extends io.pulumi.resources.InvokeArgs {

    public static final AudioOverlayResponse Empty = new AudioOverlayResponse();

    /**
     * The gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
     * 
     */
    @Import(name="audioGainLevel")
      private final @Nullable Double audioGainLevel;

    public Optional<Double> getAudioGainLevel() {
        return this.audioGainLevel == null ? Optional.empty() : Optional.ofNullable(this.audioGainLevel);
    }

    /**
     * The end position, with reference to the input video, at which the overlay ends. The value should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not specified or the value is greater than the input video duration, the overlay will be applied until the end of the input video if the overlay media duration is greater than the input video duration, else the overlay will last as long as the overlay media duration.
     * 
     */
    @Import(name="end")
      private final @Nullable String end;

    public Optional<String> getEnd() {
        return this.end == null ? Optional.empty() : Optional.ofNullable(this.end);
    }

    /**
     * The duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
     * 
     */
    @Import(name="fadeInDuration")
      private final @Nullable String fadeInDuration;

    public Optional<String> getFadeInDuration() {
        return this.fadeInDuration == null ? Optional.empty() : Optional.ofNullable(this.fadeInDuration);
    }

    /**
     * The duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
     * 
     */
    @Import(name="fadeOutDuration")
      private final @Nullable String fadeOutDuration;

    public Optional<String> getFadeOutDuration() {
        return this.fadeOutDuration == null ? Optional.empty() : Optional.ofNullable(this.fadeOutDuration);
    }

    /**
     * The label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG, PNG, GIF or BMP format, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
     * 
     */
    @Import(name="inputLabel", required=true)
      private final String inputLabel;

    public String getInputLabel() {
        return this.inputLabel;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AudioOverlay'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * The start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If not specified the overlay starts from the beginning of the input video.
     * 
     */
    @Import(name="start")
      private final @Nullable String start;

    public Optional<String> getStart() {
        return this.start == null ? Optional.empty() : Optional.ofNullable(this.start);
    }

    public AudioOverlayResponse(
        @Nullable Double audioGainLevel,
        @Nullable String end,
        @Nullable String fadeInDuration,
        @Nullable String fadeOutDuration,
        String inputLabel,
        String odataType,
        @Nullable String start) {
        this.audioGainLevel = audioGainLevel;
        this.end = end;
        this.fadeInDuration = fadeInDuration;
        this.fadeOutDuration = fadeOutDuration;
        this.inputLabel = Objects.requireNonNull(inputLabel, "expected parameter 'inputLabel' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.start = start;
    }

    private AudioOverlayResponse() {
        this.audioGainLevel = null;
        this.end = null;
        this.fadeInDuration = null;
        this.fadeOutDuration = null;
        this.inputLabel = null;
        this.odataType = null;
        this.start = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioOverlayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double audioGainLevel;
        private @Nullable String end;
        private @Nullable String fadeInDuration;
        private @Nullable String fadeOutDuration;
        private String inputLabel;
        private String odataType;
        private @Nullable String start;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioOverlayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioGainLevel = defaults.audioGainLevel;
    	      this.end = defaults.end;
    	      this.fadeInDuration = defaults.fadeInDuration;
    	      this.fadeOutDuration = defaults.fadeOutDuration;
    	      this.inputLabel = defaults.inputLabel;
    	      this.odataType = defaults.odataType;
    	      this.start = defaults.start;
        }

        public Builder audioGainLevel(@Nullable Double audioGainLevel) {
            this.audioGainLevel = audioGainLevel;
            return this;
        }

        public Builder end(@Nullable String end) {
            this.end = end;
            return this;
        }

        public Builder fadeInDuration(@Nullable String fadeInDuration) {
            this.fadeInDuration = fadeInDuration;
            return this;
        }

        public Builder fadeOutDuration(@Nullable String fadeOutDuration) {
            this.fadeOutDuration = fadeOutDuration;
            return this;
        }

        public Builder inputLabel(String inputLabel) {
            this.inputLabel = Objects.requireNonNull(inputLabel);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder start(@Nullable String start) {
            this.start = start;
            return this;
        }
        public AudioOverlayResponse build() {
            return new AudioOverlayResponse(audioGainLevel, end, fadeInDuration, fadeOutDuration, inputLabel, odataType, start);
        }
    }
}
