// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.AudioTrackDescriptorResponse;
import io.pulumi.azurenative.media.outputs.SelectAudioTrackByAttributeResponse;
import io.pulumi.azurenative.media.outputs.SelectAudioTrackByIdResponse;
import io.pulumi.azurenative.media.outputs.SelectVideoTrackByAttributeResponse;
import io.pulumi.azurenative.media.outputs.SelectVideoTrackByIdResponse;
import io.pulumi.azurenative.media.outputs.VideoTrackDescriptorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FromAllInputFileResponse {
    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    private final @Nullable List<Object> includedTracks;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.FromAllInputFile'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor({"includedTracks","odataType"})
    private FromAllInputFileResponse(
        @Nullable List<Object> includedTracks,
        String odataType) {
        this.includedTracks = includedTracks;
        this.odataType = Objects.requireNonNull(odataType);
    }

    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    public List<Object> getIncludedTracks() {
        return this.includedTracks == null ? List.of() : this.includedTracks;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.FromAllInputFile'.
     * 
     */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FromAllInputFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> includedTracks;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FromAllInputFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedTracks = defaults.includedTracks;
    	      this.odataType = defaults.odataType;
        }

        public Builder setIncludedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public FromAllInputFileResponse build() {
            return new FromAllInputFileResponse(includedTracks, odataType);
        }
    }
}
