// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.ChannelMapping;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Select audio tracks from the input by specifying a track identifier.
 * 
 */
public final class SelectAudioTrackByIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelectAudioTrackByIdArgs Empty = new SelectAudioTrackByIdArgs();

    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
     */
    @Import(name="channelMapping")
      private final @Nullable Output<Either<String,ChannelMapping>> channelMapping;

    public Output<Either<String,ChannelMapping>> getChannelMapping() {
        return this.channelMapping == null ? Output.empty() : this.channelMapping;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectAudioTrackById'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Track identifier to select
     * 
     */
    @Import(name="trackId", required=true)
      private final Output<Double> trackId;

    public Output<Double> getTrackId() {
        return this.trackId;
    }

    public SelectAudioTrackByIdArgs(
        @Nullable Output<Either<String,ChannelMapping>> channelMapping,
        Output<String> odataType,
        Output<Double> trackId) {
        this.channelMapping = channelMapping;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.trackId = Objects.requireNonNull(trackId, "expected parameter 'trackId' to be non-null");
    }

    private SelectAudioTrackByIdArgs() {
        this.channelMapping = Output.empty();
        this.odataType = Output.empty();
        this.trackId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectAudioTrackByIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ChannelMapping>> channelMapping;
        private Output<String> odataType;
        private Output<Double> trackId;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectAudioTrackByIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelMapping = defaults.channelMapping;
    	      this.odataType = defaults.odataType;
    	      this.trackId = defaults.trackId;
        }

        public Builder channelMapping(@Nullable Output<Either<String,ChannelMapping>> channelMapping) {
            this.channelMapping = channelMapping;
            return this;
        }

        public Builder channelMapping(@Nullable Either<String,ChannelMapping> channelMapping) {
            this.channelMapping = Output.ofNullable(channelMapping);
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

        public Builder trackId(Output<Double> trackId) {
            this.trackId = Objects.requireNonNull(trackId);
            return this;
        }

        public Builder trackId(Double trackId) {
            this.trackId = Output.of(Objects.requireNonNull(trackId));
            return this;
        }
        public SelectAudioTrackByIdArgs build() {
            return new SelectAudioTrackByIdArgs(channelMapping, odataType, trackId);
        }
    }
}
