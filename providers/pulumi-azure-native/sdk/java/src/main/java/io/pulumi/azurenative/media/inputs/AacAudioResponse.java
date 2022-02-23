// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes Advanced Audio Codec (AAC) audio encoding settings.
 * 
 */
public final class AacAudioResponse extends io.pulumi.resources.InvokeArgs {

    public static final AacAudioResponse Empty = new AacAudioResponse();

    /**
     * The bitrate, in bits per second, of the output encoded audio.
     * 
     */
    @InputImport(name="bitrate")
        private final @Nullable Integer bitrate;

    public Optional<Integer> getBitrate() {
        return this.bitrate == null ? Optional.empty() : Optional.ofNullable(this.bitrate);
    }

    /**
     * The number of channels in the audio.
     * 
     */
    @InputImport(name="channels")
        private final @Nullable Integer channels;

    public Optional<Integer> getChannels() {
        return this.channels == null ? Optional.empty() : Optional.ofNullable(this.channels);
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @InputImport(name="label")
        private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AacAudio'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * The encoding profile to be used when encoding audio with AAC.
     * 
     */
    @InputImport(name="profile")
        private final @Nullable String profile;

    public Optional<String> getProfile() {
        return this.profile == null ? Optional.empty() : Optional.ofNullable(this.profile);
    }

    /**
     * The sampling rate to use for encoding in hertz.
     * 
     */
    @InputImport(name="samplingRate")
        private final @Nullable Integer samplingRate;

    public Optional<Integer> getSamplingRate() {
        return this.samplingRate == null ? Optional.empty() : Optional.ofNullable(this.samplingRate);
    }

    public AacAudioResponse(
        @Nullable Integer bitrate,
        @Nullable Integer channels,
        @Nullable String label,
        String odataType,
        @Nullable String profile,
        @Nullable Integer samplingRate) {
        this.bitrate = bitrate;
        this.channels = channels;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.profile = profile;
        this.samplingRate = samplingRate;
    }

    private AacAudioResponse() {
        this.bitrate = null;
        this.channels = null;
        this.label = null;
        this.odataType = null;
        this.profile = null;
        this.samplingRate = null;
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

        public Builder setBitrate(@Nullable Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        public Builder setChannels(@Nullable Integer channels) {
            this.channels = channels;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
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

        public Builder setSamplingRate(@Nullable Integer samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public AacAudioResponse build() {
            return new AacAudioResponse(bitrate, channels, label, odataType, profile, samplingRate);
        }
    }
}
