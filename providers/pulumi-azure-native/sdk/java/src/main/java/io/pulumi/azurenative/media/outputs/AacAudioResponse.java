// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AacAudioResponse {
    /**
     * The bitrate, in bits per second, of the output encoded audio.
     * 
     */
    private final @Nullable Integer bitrate;
    /**
     * The number of channels in the audio.
     * 
     */
    private final @Nullable Integer channels;
    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    private final @Nullable String label;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AacAudio'.
     * 
     */
    private final String odataType;
    /**
     * The encoding profile to be used when encoding audio with AAC.
     * 
     */
    private final @Nullable String profile;
    /**
     * The sampling rate to use for encoding in hertz.
     * 
     */
    private final @Nullable Integer samplingRate;

    @CustomType.Constructor
    private AacAudioResponse(
        @CustomType.Parameter("bitrate") @Nullable Integer bitrate,
        @CustomType.Parameter("channels") @Nullable Integer channels,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("profile") @Nullable String profile,
        @CustomType.Parameter("samplingRate") @Nullable Integer samplingRate) {
        this.bitrate = bitrate;
        this.channels = channels;
        this.label = label;
        this.odataType = odataType;
        this.profile = profile;
        this.samplingRate = samplingRate;
    }

    /**
     * The bitrate, in bits per second, of the output encoded audio.
     * 
    */
    public Optional<Integer> getBitrate() {
        return Optional.ofNullable(this.bitrate);
    }
    /**
     * The number of channels in the audio.
     * 
    */
    public Optional<Integer> getChannels() {
        return Optional.ofNullable(this.channels);
    }
    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
    */
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AacAudio'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * The encoding profile to be used when encoding audio with AAC.
     * 
    */
    public Optional<String> getProfile() {
        return Optional.ofNullable(this.profile);
    }
    /**
     * The sampling rate to use for encoding in hertz.
     * 
    */
    public Optional<Integer> getSamplingRate() {
        return Optional.ofNullable(this.samplingRate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AacAudioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bitrate;
        private @Nullable Integer channels;
        private @Nullable String label;
        private String odataType;
        private @Nullable String profile;
        private @Nullable Integer samplingRate;

        public Builder() {
    	      // Empty
        }

        public Builder(AacAudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrate = defaults.bitrate;
    	      this.channels = defaults.channels;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.profile = defaults.profile;
    	      this.samplingRate = defaults.samplingRate;
        }

        public Builder bitrate(@Nullable Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        public Builder channels(@Nullable Integer channels) {
            this.channels = channels;
            return this;
        }

        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder profile(@Nullable String profile) {
            this.profile = profile;
            return this;
        }

        public Builder samplingRate(@Nullable Integer samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public AacAudioResponse build() {
            return new AacAudioResponse(bitrate, channels, label, odataType, profile, samplingRate);
        }
    }
}
