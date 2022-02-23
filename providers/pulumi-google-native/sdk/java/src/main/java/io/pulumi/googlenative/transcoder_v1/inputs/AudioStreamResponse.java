// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.AudioMappingResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Audio stream resource.
 * 
 */
public final class AudioStreamResponse extends io.pulumi.resources.InvokeArgs {

    public static final AudioStreamResponse Empty = new AudioStreamResponse();

    /**
     * Audio bitrate in bits per second. Must be between 1 and 10,000,000.
     * 
     */
    @InputImport(name="bitrateBps", required=true)
      private final Integer bitrateBps;

    public Integer getBitrateBps() {
        return this.bitrateBps;
    }

    /**
     * Number of audio channels. Must be between 1 and 6. The default is 2.
     * 
     */
    @InputImport(name="channelCount", required=true)
      private final Integer channelCount;

    public Integer getChannelCount() {
        return this.channelCount;
    }

    /**
     * A list of channel names specifying layout of the audio channels. This only affects the metadata embedded in the container headers, if supported by the specified format. The default is `["fl", "fr"]`. Supported channel names: - `fl` - Front left channel - `fr` - Front right channel - `sl` - Side left channel - `sr` - Side right channel - `fc` - Front center channel - `lfe` - Low frequency
     * 
     */
    @InputImport(name="channelLayout", required=true)
      private final List<String> channelLayout;

    public List<String> getChannelLayout() {
        return this.channelLayout;
    }

    /**
     * The codec for this audio stream. The default is `aac`. Supported audio codecs: - `aac` - `aac-he` - `aac-he-v2` - `mp3` - `ac3` - `eac3`
     * 
     */
    @InputImport(name="codec", required=true)
      private final String codec;

    public String getCodec() {
        return this.codec;
    }

    /**
     * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
     * 
     */
    @InputImport(name="mapping", required=true)
      private final List<AudioMappingResponse> mapping;

    public List<AudioMappingResponse> getMapping() {
        return this.mapping;
    }

    /**
     * The audio sample rate in Hertz. The default is 48000 Hertz.
     * 
     */
    @InputImport(name="sampleRateHertz", required=true)
      private final Integer sampleRateHertz;

    public Integer getSampleRateHertz() {
        return this.sampleRateHertz;
    }

    public AudioStreamResponse(
        Integer bitrateBps,
        Integer channelCount,
        List<String> channelLayout,
        String codec,
        List<AudioMappingResponse> mapping,
        Integer sampleRateHertz) {
        this.bitrateBps = Objects.requireNonNull(bitrateBps, "expected parameter 'bitrateBps' to be non-null");
        this.channelCount = Objects.requireNonNull(channelCount, "expected parameter 'channelCount' to be non-null");
        this.channelLayout = Objects.requireNonNull(channelLayout, "expected parameter 'channelLayout' to be non-null");
        this.codec = Objects.requireNonNull(codec, "expected parameter 'codec' to be non-null");
        this.mapping = Objects.requireNonNull(mapping, "expected parameter 'mapping' to be non-null");
        this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz, "expected parameter 'sampleRateHertz' to be non-null");
    }

    private AudioStreamResponse() {
        this.bitrateBps = null;
        this.channelCount = null;
        this.channelLayout = List.of();
        this.codec = null;
        this.mapping = List.of();
        this.sampleRateHertz = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioStreamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bitrateBps;
        private Integer channelCount;
        private List<String> channelLayout;
        private String codec;
        private List<AudioMappingResponse> mapping;
        private Integer sampleRateHertz;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioStreamResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateBps = defaults.bitrateBps;
    	      this.channelCount = defaults.channelCount;
    	      this.channelLayout = defaults.channelLayout;
    	      this.codec = defaults.codec;
    	      this.mapping = defaults.mapping;
    	      this.sampleRateHertz = defaults.sampleRateHertz;
        }

        public Builder setBitrateBps(Integer bitrateBps) {
            this.bitrateBps = Objects.requireNonNull(bitrateBps);
            return this;
        }

        public Builder setChannelCount(Integer channelCount) {
            this.channelCount = Objects.requireNonNull(channelCount);
            return this;
        }

        public Builder setChannelLayout(List<String> channelLayout) {
            this.channelLayout = Objects.requireNonNull(channelLayout);
            return this;
        }

        public Builder setCodec(String codec) {
            this.codec = Objects.requireNonNull(codec);
            return this;
        }

        public Builder setMapping(List<AudioMappingResponse> mapping) {
            this.mapping = Objects.requireNonNull(mapping);
            return this;
        }

        public Builder setSampleRateHertz(Integer sampleRateHertz) {
            this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz);
            return this;
        }
        public AudioStreamResponse build() {
            return new AudioStreamResponse(bitrateBps, channelCount, channelLayout, codec, mapping, sampleRateHertz);
        }
    }
}
