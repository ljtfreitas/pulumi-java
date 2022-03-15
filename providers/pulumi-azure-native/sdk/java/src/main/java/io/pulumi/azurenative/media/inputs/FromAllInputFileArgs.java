// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AudioTrackDescriptorArgs;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByAttributeArgs;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByIdArgs;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByAttributeArgs;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByIdArgs;
import io.pulumi.azurenative.media.inputs.VideoTrackDescriptorArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An InputDefinition that looks across all of the files provided to select tracks specified by the IncludedTracks property. Generally used with the AudioTrackByAttribute and VideoTrackByAttribute to allow selection of a single track across a set of input files.
 * 
 */
public final class FromAllInputFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final FromAllInputFileArgs Empty = new FromAllInputFileArgs();

    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    @Import(name="includedTracks")
      private final @Nullable Output<List<Object>> includedTracks;

    public Output<List<Object>> getIncludedTracks() {
        return this.includedTracks == null ? Output.empty() : this.includedTracks;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.FromAllInputFile'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    public FromAllInputFileArgs(
        @Nullable Output<List<Object>> includedTracks,
        Output<String> odataType) {
        this.includedTracks = includedTracks;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private FromAllInputFileArgs() {
        this.includedTracks = Output.empty();
        this.odataType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FromAllInputFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> includedTracks;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FromAllInputFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedTracks = defaults.includedTracks;
    	      this.odataType = defaults.odataType;
        }

        public Builder includedTracks(@Nullable Output<List<Object>> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }

        public Builder includedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = Output.ofNullable(includedTracks);
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
        public FromAllInputFileArgs build() {
            return new FromAllInputFileArgs(includedTracks, odataType);
        }
    }
}
