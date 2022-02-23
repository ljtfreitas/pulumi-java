// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PresetAudioGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PresetAudioGetArgs Empty = new PresetAudioGetArgs();

    /**
     * The method of organizing audio channels and tracks. Use Audio:Channels to specify the number of channels in your output, and Audio:AudioPackingMode to specify the number of tracks and their relation to the channels. If you do not specify an Audio:AudioPackingMode, Elastic Transcoder uses SingleTrack.
     * 
     */
    @InputImport(name="audioPackingMode")
    private final @Nullable Input<String> audioPackingMode;

    public Input<String> getAudioPackingMode() {
        return this.audioPackingMode == null ? Input.empty() : this.audioPackingMode;
    }

    /**
     * The bit rate of the audio stream in the output file, in kilobits/second. Enter an integer between 64 and 320, inclusive.
     * 
     */
    @InputImport(name="bitRate")
    private final @Nullable Input<String> bitRate;

    public Input<String> getBitRate() {
        return this.bitRate == null ? Input.empty() : this.bitRate;
    }

    /**
     * The number of audio channels in the output file
     * 
     */
    @InputImport(name="channels")
    private final @Nullable Input<String> channels;

    public Input<String> getChannels() {
        return this.channels == null ? Input.empty() : this.channels;
    }

    /**
     * The audio codec for the output file. Valid values are `AAC`, `flac`, `mp2`, `mp3`, `pcm`, and `vorbis`.
     * 
     */
    @InputImport(name="codec")
    private final @Nullable Input<String> codec;

    public Input<String> getCodec() {
        return this.codec == null ? Input.empty() : this.codec;
    }

    /**
     * The sample rate of the audio stream in the output file, in hertz. Valid values are: `auto`, `22050`, `32000`, `44100`, `48000`, `96000`
     * 
     */
    @InputImport(name="sampleRate")
    private final @Nullable Input<String> sampleRate;

    public Input<String> getSampleRate() {
        return this.sampleRate == null ? Input.empty() : this.sampleRate;
    }

    public PresetAudioGetArgs(
        @Nullable Input<String> audioPackingMode,
        @Nullable Input<String> bitRate,
        @Nullable Input<String> channels,
        @Nullable Input<String> codec,
        @Nullable Input<String> sampleRate) {
        this.audioPackingMode = audioPackingMode;
        this.bitRate = bitRate;
        this.channels = channels;
        this.codec = codec;
        this.sampleRate = sampleRate;
    }

    private PresetAudioGetArgs() {
        this.audioPackingMode = Input.empty();
        this.bitRate = Input.empty();
        this.channels = Input.empty();
        this.codec = Input.empty();
        this.sampleRate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresetAudioGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> audioPackingMode;
        private @Nullable Input<String> bitRate;
        private @Nullable Input<String> channels;
        private @Nullable Input<String> codec;
        private @Nullable Input<String> sampleRate;

        public Builder() {
    	      // Empty
        }

        public Builder(PresetAudioGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioPackingMode = defaults.audioPackingMode;
    	      this.bitRate = defaults.bitRate;
    	      this.channels = defaults.channels;
    	      this.codec = defaults.codec;
    	      this.sampleRate = defaults.sampleRate;
        }

        public Builder setAudioPackingMode(@Nullable Input<String> audioPackingMode) {
            this.audioPackingMode = audioPackingMode;
            return this;
        }

        public Builder setAudioPackingMode(@Nullable String audioPackingMode) {
            this.audioPackingMode = Input.ofNullable(audioPackingMode);
            return this;
        }

        public Builder setBitRate(@Nullable Input<String> bitRate) {
            this.bitRate = bitRate;
            return this;
        }

        public Builder setBitRate(@Nullable String bitRate) {
            this.bitRate = Input.ofNullable(bitRate);
            return this;
        }

        public Builder setChannels(@Nullable Input<String> channels) {
            this.channels = channels;
            return this;
        }

        public Builder setChannels(@Nullable String channels) {
            this.channels = Input.ofNullable(channels);
            return this;
        }

        public Builder setCodec(@Nullable Input<String> codec) {
            this.codec = codec;
            return this;
        }

        public Builder setCodec(@Nullable String codec) {
            this.codec = Input.ofNullable(codec);
            return this;
        }

        public Builder setSampleRate(@Nullable Input<String> sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        public Builder setSampleRate(@Nullable String sampleRate) {
            this.sampleRate = Input.ofNullable(sampleRate);
            return this;
        }
        public PresetAudioGetArgs build() {
            return new PresetAudioGetArgs(audioPackingMode, bitRate, channels, codec, sampleRate);
        }
    }
}
