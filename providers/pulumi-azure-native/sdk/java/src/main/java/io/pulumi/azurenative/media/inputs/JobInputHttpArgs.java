// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AbsoluteClipTimeArgs;
import io.pulumi.azurenative.media.inputs.FromAllInputFileArgs;
import io.pulumi.azurenative.media.inputs.FromEachInputFileArgs;
import io.pulumi.azurenative.media.inputs.InputFileArgs;
import io.pulumi.azurenative.media.inputs.UtcClipTimeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents HTTPS job input.
 * 
 */
public final class JobInputHttpArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobInputHttpArgs Empty = new JobInputHttpArgs();

    /**
     * Base URI for HTTPS job input. It will be concatenated with provided file names. If no base uri is given, then the provided file list is assumed to be fully qualified uris. Maximum length of 4000 characters.
     * 
     */
    @Import(name="baseUri")
      private final @Nullable Output<String> baseUri;

    public Output<String> getBaseUri() {
        return this.baseUri == null ? Output.empty() : this.baseUri;
    }

    /**
     * Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     * 
     */
    @Import(name="end")
      private final @Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> end;

    public Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> getEnd() {
        return this.end == null ? Output.empty() : this.end;
    }

    /**
     * List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     * 
     */
    @Import(name="files")
      private final @Nullable Output<List<String>> files;

    public Output<List<String>> getFiles() {
        return this.files == null ? Output.empty() : this.files;
    }

    /**
     * Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
     * 
     */
    @Import(name="inputDefinitions")
      private final @Nullable Output<List<Object>> inputDefinitions;

    public Output<List<Object>> getInputDefinitions() {
        return this.inputDefinitions == null ? Output.empty() : this.inputDefinitions;
    }

    /**
     * A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label 'xyz'.
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> getLabel() {
        return this.label == null ? Output.empty() : this.label;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobInputHttp'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     * 
     */
    @Import(name="start")
      private final @Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> start;

    public Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> getStart() {
        return this.start == null ? Output.empty() : this.start;
    }

    public JobInputHttpArgs(
        @Nullable Output<String> baseUri,
        @Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> end,
        @Nullable Output<List<String>> files,
        @Nullable Output<List<Object>> inputDefinitions,
        @Nullable Output<String> label,
        Output<String> odataType,
        @Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> start) {
        this.baseUri = baseUri;
        this.end = end;
        this.files = files;
        this.inputDefinitions = inputDefinitions;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.start = start;
    }

    private JobInputHttpArgs() {
        this.baseUri = Output.empty();
        this.end = Output.empty();
        this.files = Output.empty();
        this.inputDefinitions = Output.empty();
        this.label = Output.empty();
        this.odataType = Output.empty();
        this.start = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobInputHttpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> baseUri;
        private @Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> end;
        private @Nullable Output<List<String>> files;
        private @Nullable Output<List<Object>> inputDefinitions;
        private @Nullable Output<String> label;
        private Output<String> odataType;
        private @Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> start;

        public Builder() {
    	      // Empty
        }

        public Builder(JobInputHttpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUri = defaults.baseUri;
    	      this.end = defaults.end;
    	      this.files = defaults.files;
    	      this.inputDefinitions = defaults.inputDefinitions;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.start = defaults.start;
        }

        public Builder baseUri(@Nullable Output<String> baseUri) {
            this.baseUri = baseUri;
            return this;
        }

        public Builder baseUri(@Nullable String baseUri) {
            this.baseUri = Output.ofNullable(baseUri);
            return this;
        }

        public Builder end(@Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> end) {
            this.end = end;
            return this;
        }

        public Builder end(@Nullable Either<AbsoluteClipTimeArgs,UtcClipTimeArgs> end) {
            this.end = Output.ofNullable(end);
            return this;
        }

        public Builder files(@Nullable Output<List<String>> files) {
            this.files = files;
            return this;
        }

        public Builder files(@Nullable List<String> files) {
            this.files = Output.ofNullable(files);
            return this;
        }

        public Builder inputDefinitions(@Nullable Output<List<Object>> inputDefinitions) {
            this.inputDefinitions = inputDefinitions;
            return this;
        }

        public Builder inputDefinitions(@Nullable List<Object> inputDefinitions) {
            this.inputDefinitions = Output.ofNullable(inputDefinitions);
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

        public Builder start(@Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> start) {
            this.start = start;
            return this;
        }

        public Builder start(@Nullable Either<AbsoluteClipTimeArgs,UtcClipTimeArgs> start) {
            this.start = Output.ofNullable(start);
            return this;
        }
        public JobInputHttpArgs build() {
            return new JobInputHttpArgs(baseUri, end, files, inputDefinitions, label, odataType, start);
        }
    }
}
