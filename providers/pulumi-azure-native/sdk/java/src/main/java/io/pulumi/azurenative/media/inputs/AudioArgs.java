// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the common properties for all audio codecs.
 * 
 */
public final class AudioArgs extends io.pulumi.resources.ResourceArgs {

    public static final AudioArgs Empty = new AudioArgs();

    /**
     * The bitrate, in bits per second, of the output encoded audio.
     * 
     */
    @Import(name="bitrate")
      private final @Nullable Output<Integer> bitrate;

    public Output<Integer> getBitrate() {
        return this.bitrate == null ? Output.empty() : this.bitrate;
    }

    /**
     * The number of channels in the audio.
     * 
     */
    @Import(name="channels")
      private final @Nullable Output<Integer> channels;

    public Output<Integer> getChannels() {
        return this.channels == null ? Output.empty() : this.channels;
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> getLabel() {
        return this.label == null ? Output.empty() : this.label;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.Audio'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The sampling rate to use for encoding in hertz.
     * 
     */
    @Import(name="samplingRate")
      private final @Nullable Output<Integer> samplingRate;

    public Output<Integer> getSamplingRate() {
        return this.samplingRate == null ? Output.empty() : this.samplingRate;
    }

    public AudioArgs(
        @Nullable Output<Integer> bitrate,
        @Nullable Output<Integer> channels,
        @Nullable Output<String> label,
        Output<String> odataType,
        @Nullable Output<Integer> samplingRate) {
        this.bitrate = bitrate;
        this.channels = channels;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.samplingRate = samplingRate;
    }

    private AudioArgs() {
        this.bitrate = Output.empty();
        this.channels = Output.empty();
        this.label = Output.empty();
        this.odataType = Output.empty();
        this.samplingRate = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> bitrate;
        private @Nullable Output<Integer> channels;
        private @Nullable Output<String> label;
        private Output<String> odataType;
        private @Nullable Output<Integer> samplingRate;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrate = defaults.bitrate;
    	      this.channels = defaults.channels;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.samplingRate = defaults.samplingRate;
        }

        public Builder bitrate(@Nullable Output<Integer> bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        public Builder bitrate(@Nullable Integer bitrate) {
            this.bitrate = Output.ofNullable(bitrate);
            return this;
        }

        public Builder channels(@Nullable Output<Integer> channels) {
            this.channels = channels;
            return this;
        }

        public Builder channels(@Nullable Integer channels) {
            this.channels = Output.ofNullable(channels);
            return this;
        }

        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }

        public Builder label(@Nullable String label) {
            this.label = Output.ofNullable(label);
            return this;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder samplingRate(@Nullable Output<Integer> samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }

        public Builder samplingRate(@Nullable Integer samplingRate) {
            this.samplingRate = Output.ofNullable(samplingRate);
            return this;
        }
        public AudioArgs build() {
            return new AudioArgs(bitrate, channels, label, odataType, samplingRate);
        }
    }
}
