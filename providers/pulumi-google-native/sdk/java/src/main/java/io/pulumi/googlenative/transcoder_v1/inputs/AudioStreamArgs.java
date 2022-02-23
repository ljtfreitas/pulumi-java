// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.AudioMappingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Audio stream resource.
 * 
 */
public final class AudioStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final AudioStreamArgs Empty = new AudioStreamArgs();

    /**
     * Audio bitrate in bits per second. Must be between 1 and 10,000,000.
     * 
     */
    @InputImport(name="bitrateBps", required=true)
      private final Input<Integer> bitrateBps;

    public Input<Integer> getBitrateBps() {
        return this.bitrateBps;
    }

    /**
     * Number of audio channels. Must be between 1 and 6. The default is 2.
     * 
     */
    @InputImport(name="channelCount")
      private final @Nullable Input<Integer> channelCount;

    public Input<Integer> getChannelCount() {
        return this.channelCount == null ? Input.empty() : this.channelCount;
    }

    /**
     * A list of channel names specifying layout of the audio channels. This only affects the metadata embedded in the container headers, if supported by the specified format. The default is `["fl", "fr"]`. Supported channel names: - `fl` - Front left channel - `fr` - Front right channel - `sl` - Side left channel - `sr` - Side right channel - `fc` - Front center channel - `lfe` - Low frequency
     * 
     */
    @InputImport(name="channelLayout")
      private final @Nullable Input<List<String>> channelLayout;

    public Input<List<String>> getChannelLayout() {
        return this.channelLayout == null ? Input.empty() : this.channelLayout;
    }

    /**
     * The codec for this audio stream. The default is `aac`. Supported audio codecs: - `aac` - `aac-he` - `aac-he-v2` - `mp3` - `ac3` - `eac3`
     * 
     */
    @InputImport(name="codec")
      private final @Nullable Input<String> codec;

    public Input<String> getCodec() {
        return this.codec == null ? Input.empty() : this.codec;
    }

    /**
     * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
     * 
     */
    @InputImport(name="mapping")
      private final @Nullable Input<List<AudioMappingArgs>> mapping;

    public Input<List<AudioMappingArgs>> getMapping() {
        return this.mapping == null ? Input.empty() : this.mapping;
    }

    /**
     * The audio sample rate in Hertz. The default is 48000 Hertz.
     * 
     */
    @InputImport(name="sampleRateHertz")
      private final @Nullable Input<Integer> sampleRateHertz;

    public Input<Integer> getSampleRateHertz() {
        return this.sampleRateHertz == null ? Input.empty() : this.sampleRateHertz;
    }

    public AudioStreamArgs(
        Input<Integer> bitrateBps,
        @Nullable Input<Integer> channelCount,
        @Nullable Input<List<String>> channelLayout,
        @Nullable Input<String> codec,
        @Nullable Input<List<AudioMappingArgs>> mapping,
        @Nullable Input<Integer> sampleRateHertz) {
        this.bitrateBps = Objects.requireNonNull(bitrateBps, "expected parameter 'bitrateBps' to be non-null");
        this.channelCount = channelCount;
        this.channelLayout = channelLayout;
        this.codec = codec;
        this.mapping = mapping;
        this.sampleRateHertz = sampleRateHertz;
    }

    private AudioStreamArgs() {
        this.bitrateBps = Input.empty();
        this.channelCount = Input.empty();
        this.channelLayout = Input.empty();
        this.codec = Input.empty();
        this.mapping = Input.empty();
        this.sampleRateHertz = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> bitrateBps;
        private @Nullable Input<Integer> channelCount;
        private @Nullable Input<List<String>> channelLayout;
        private @Nullable Input<String> codec;
        private @Nullable Input<List<AudioMappingArgs>> mapping;
        private @Nullable Input<Integer> sampleRateHertz;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateBps = defaults.bitrateBps;
    	      this.channelCount = defaults.channelCount;
    	      this.channelLayout = defaults.channelLayout;
    	      this.codec = defaults.codec;
    	      this.mapping = defaults.mapping;
    	      this.sampleRateHertz = defaults.sampleRateHertz;
        }

        public Builder setBitrateBps(Input<Integer> bitrateBps) {
            this.bitrateBps = Objects.requireNonNull(bitrateBps);
            return this;
        }

        public Builder setBitrateBps(Integer bitrateBps) {
            this.bitrateBps = Input.of(Objects.requireNonNull(bitrateBps));
            return this;
        }

        public Builder setChannelCount(@Nullable Input<Integer> channelCount) {
            this.channelCount = channelCount;
            return this;
        }

        public Builder setChannelCount(@Nullable Integer channelCount) {
            this.channelCount = Input.ofNullable(channelCount);
            return this;
        }

        public Builder setChannelLayout(@Nullable Input<List<String>> channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }

        public Builder setChannelLayout(@Nullable List<String> channelLayout) {
            this.channelLayout = Input.ofNullable(channelLayout);
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

        public Builder setMapping(@Nullable Input<List<AudioMappingArgs>> mapping) {
            this.mapping = mapping;
            return this;
        }

        public Builder setMapping(@Nullable List<AudioMappingArgs> mapping) {
            this.mapping = Input.ofNullable(mapping);
            return this;
        }

        public Builder setSampleRateHertz(@Nullable Input<Integer> sampleRateHertz) {
            this.sampleRateHertz = sampleRateHertz;
            return this;
        }

        public Builder setSampleRateHertz(@Nullable Integer sampleRateHertz) {
            this.sampleRateHertz = Input.ofNullable(sampleRateHertz);
            return this;
        }
        public AudioStreamArgs build() {
            return new AudioStreamArgs(bitrateBps, channelCount, channelLayout, codec, mapping, sampleRateHertz);
        }
    }
}
