// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.AbsoluteClipTimeResponse;
import io.pulumi.azurenative.media.outputs.FromAllInputFileResponse;
import io.pulumi.azurenative.media.outputs.FromEachInputFileResponse;
import io.pulumi.azurenative.media.outputs.InputFileResponse;
import io.pulumi.azurenative.media.outputs.UtcClipTimeResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobInputAssetResponse {
    /**
     * The name of the input Asset.
     * 
     */
    private final String assetName;
    /**
     * Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     * 
     */
    private final @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end;
    /**
     * List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     * 
     */
    private final @Nullable List<String> files;
    /**
     * Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
     * 
     */
    private final @Nullable List<Object> inputDefinitions;
    /**
     * A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label 'xyz'.
     * 
     */
    private final @Nullable String label;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobInputAsset'.
     * 
     */
    private final String odataType;
    /**
     * Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     * 
     */
    private final @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start;

    @OutputCustomType.Constructor({"assetName","end","files","inputDefinitions","label","odataType","start"})
    private JobInputAssetResponse(
        String assetName,
        @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end,
        @Nullable List<String> files,
        @Nullable List<Object> inputDefinitions,
        @Nullable String label,
        String odataType,
        @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start) {
        this.assetName = Objects.requireNonNull(assetName);
        this.end = end;
        this.files = files;
        this.inputDefinitions = inputDefinitions;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType);
        this.start = start;
    }

    /**
     * The name of the input Asset.
     * 
     */
    public String getAssetName() {
        return this.assetName;
    }
    /**
     * Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     * 
     */
    public Optional<Either<AbsoluteClipTimeResponse,UtcClipTimeResponse>> getEnd() {
        return Optional.ofNullable(this.end);
    }
    /**
     * List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     * 
     */
    public List<String> getFiles() {
        return this.files == null ? List.of() : this.files;
    }
    /**
     * Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
     * 
     */
    public List<Object> getInputDefinitions() {
        return this.inputDefinitions == null ? List.of() : this.inputDefinitions;
    }
    /**
     * A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label 'xyz'.
     * 
     */
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobInputAsset'.
     * 
     */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     * 
     */
    public Optional<Either<AbsoluteClipTimeResponse,UtcClipTimeResponse>> getStart() {
        return Optional.ofNullable(this.start);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobInputAssetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetName;
        private @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end;
        private @Nullable List<String> files;
        private @Nullable List<Object> inputDefinitions;
        private @Nullable String label;
        private String odataType;
        private @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start;

        public Builder() {
    	      // Empty
        }

        public Builder(JobInputAssetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetName = defaults.assetName;
    	      this.end = defaults.end;
    	      this.files = defaults.files;
    	      this.inputDefinitions = defaults.inputDefinitions;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.start = defaults.start;
        }

        public Builder setAssetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder setEnd(@Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end) {
            this.end = end;
            return this;
        }

        public Builder setFiles(@Nullable List<String> files) {
            this.files = files;
            return this;
        }

        public Builder setInputDefinitions(@Nullable List<Object> inputDefinitions) {
            this.inputDefinitions = inputDefinitions;
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

        public Builder setStart(@Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start) {
            this.start = start;
            return this;
        }
        public JobInputAssetResponse build() {
            return new JobInputAssetResponse(assetName, end, files, inputDefinitions, label, odataType, start);
        }
    }
}
