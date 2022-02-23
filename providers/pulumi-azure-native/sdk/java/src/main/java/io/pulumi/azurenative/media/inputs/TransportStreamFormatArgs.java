// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.OutputFileArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the properties for generating an MPEG-2 Transport Stream (ISO/IEC 13818-1) output video file(s).
 * 
 */
public final class TransportStreamFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransportStreamFormatArgs Empty = new TransportStreamFormatArgs();

    /**
     * The pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
     * 
     */
    @InputImport(name="filenamePattern", required=true)
        private final Input<String> filenamePattern;

    public Input<String> getFilenamePattern() {
        return this.filenamePattern;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.TransportStreamFormat'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The list of output files to produce.  Each entry in the list is a set of audio and video layer labels to be muxed together .
     * 
     */
    @InputImport(name="outputFiles")
        private final @Nullable Input<List<OutputFileArgs>> outputFiles;

    public Input<List<OutputFileArgs>> getOutputFiles() {
        return this.outputFiles == null ? Input.empty() : this.outputFiles;
    }

    public TransportStreamFormatArgs(
        Input<String> filenamePattern,
        Input<String> odataType,
        @Nullable Input<List<OutputFileArgs>> outputFiles) {
        this.filenamePattern = Objects.requireNonNull(filenamePattern, "expected parameter 'filenamePattern' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.outputFiles = outputFiles;
    }

    private TransportStreamFormatArgs() {
        this.filenamePattern = Input.empty();
        this.odataType = Input.empty();
        this.outputFiles = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransportStreamFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> filenamePattern;
        private Input<String> odataType;
        private @Nullable Input<List<OutputFileArgs>> outputFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(TransportStreamFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filenamePattern = defaults.filenamePattern;
    	      this.odataType = defaults.odataType;
    	      this.outputFiles = defaults.outputFiles;
        }

        public Builder setFilenamePattern(Input<String> filenamePattern) {
            this.filenamePattern = Objects.requireNonNull(filenamePattern);
            return this;
        }

        public Builder setFilenamePattern(String filenamePattern) {
            this.filenamePattern = Input.of(Objects.requireNonNull(filenamePattern));
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setOutputFiles(@Nullable Input<List<OutputFileArgs>> outputFiles) {
            this.outputFiles = outputFiles;
            return this;
        }

        public Builder setOutputFiles(@Nullable List<OutputFileArgs> outputFiles) {
            this.outputFiles = Input.ofNullable(outputFiles);
            return this;
        }
        public TransportStreamFormatArgs build() {
            return new TransportStreamFormatArgs(filenamePattern, odataType, outputFiles);
        }
    }
}
