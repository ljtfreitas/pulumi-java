// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.JobErrorResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents an Asset used as a JobOutput.
 * 
 */
public final class JobOutputAssetResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobOutputAssetResponse Empty = new JobOutputAssetResponse();

    /**
     * The name of the output Asset.
     * 
     */
    @Import(name="assetName", required=true)
      private final String assetName;

    public String getAssetName() {
        return this.assetName;
    }

    /**
     * The UTC date and time at which this Job Output finished processing.
     * 
     */
    @Import(name="endTime", required=true)
      private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * If the JobOutput is in the Error state, it contains the details of the error.
     * 
     */
    @Import(name="error", required=true)
      private final JobErrorResponse error;

    public JobErrorResponse getError() {
        return this.error;
    }

    /**
     * A label that is assigned to a JobOutput in order to help uniquely identify it. This is useful when your Transform has more than one TransformOutput, whereby your Job has more than one JobOutput. In such cases, when you submit the Job, you will add two or more JobOutputs, in the same order as TransformOutputs in the Transform. Subsequently, when you retrieve the Job, either through events or on a GET request, you can use the label to easily identify the JobOutput. If a label is not provided, a default value of '{presetName}_{outputIndex}' will be used, where the preset name is the name of the preset in the corresponding TransformOutput and the output index is the relative index of the this JobOutput within the Job. Note that this index is the same as the relative index of the corresponding TransformOutput within its Transform.
     * 
     */
    @Import(name="label")
      private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobOutputAsset'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * If the JobOutput is in a Processing state, this contains the Job completion percentage. The value is an estimate and not intended to be used to predict Job completion times. To determine if the JobOutput is complete, use the State property.
     * 
     */
    @Import(name="progress", required=true)
      private final Integer progress;

    public Integer getProgress() {
        return this.progress;
    }

    /**
     * The UTC date and time at which this Job Output began processing.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Describes the state of the JobOutput.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    public JobOutputAssetResponse(
        String assetName,
        String endTime,
        JobErrorResponse error,
        @Nullable String label,
        String odataType,
        Integer progress,
        String startTime,
        String state) {
        this.assetName = Objects.requireNonNull(assetName, "expected parameter 'assetName' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.progress = Objects.requireNonNull(progress, "expected parameter 'progress' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private JobOutputAssetResponse() {
        this.assetName = null;
        this.endTime = null;
        this.error = null;
        this.label = null;
        this.odataType = null;
        this.progress = null;
        this.startTime = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutputAssetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetName;
        private String endTime;
        private JobErrorResponse error;
        private @Nullable String label;
        private String odataType;
        private Integer progress;
        private String startTime;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutputAssetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetName = defaults.assetName;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.progress = defaults.progress;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder assetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder error(JobErrorResponse error) {
            this.error = Objects.requireNonNull(error);
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

        public Builder progress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public JobOutputAssetResponse build() {
            return new JobOutputAssetResponse(assetName, endTime, error, label, odataType, progress, startTime, state);
        }
    }
}
