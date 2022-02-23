// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AudioTrackDescriptorResponse;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByAttributeResponse;
import io.pulumi.azurenative.media.inputs.SelectAudioTrackByIdResponse;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByAttributeResponse;
import io.pulumi.azurenative.media.inputs.SelectVideoTrackByIdResponse;
import io.pulumi.azurenative.media.inputs.VideoTrackDescriptorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An InputDefinition for a single file.  TrackSelections are scoped to the file specified.
 * 
 */
public final class InputFileResponse extends io.pulumi.resources.InvokeArgs {

    public static final InputFileResponse Empty = new InputFileResponse();

    /**
     * Name of the file that this input definition applies to.
     * 
     */
    @InputImport(name="filename")
        private final @Nullable String filename;

    public Optional<String> getFilename() {
        return this.filename == null ? Optional.empty() : Optional.ofNullable(this.filename);
    }

    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    @InputImport(name="includedTracks")
        private final @Nullable List<Object> includedTracks;

    public List<Object> getIncludedTracks() {
        return this.includedTracks == null ? List.of() : this.includedTracks;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.InputFile'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public InputFileResponse(
        @Nullable String filename,
        @Nullable List<Object> includedTracks,
        String odataType) {
        this.filename = filename;
        this.includedTracks = includedTracks;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private InputFileResponse() {
        this.filename = null;
        this.includedTracks = List.of();
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filename;
        private @Nullable List<Object> includedTracks;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(InputFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filename = defaults.filename;
    	      this.includedTracks = defaults.includedTracks;
    	      this.odataType = defaults.odataType;
        }

        public Builder setFilename(@Nullable String filename) {
            this.filename = filename;
            return this;
        }

        public Builder setIncludedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public InputFileResponse build() {
            return new InputFileResponse(filename, includedTracks, odataType);
        }
    }
}
