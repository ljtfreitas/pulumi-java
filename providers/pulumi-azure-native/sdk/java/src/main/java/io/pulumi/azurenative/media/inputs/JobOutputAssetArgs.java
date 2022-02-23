// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an Asset used as a JobOutput.
 * 
 */
public final class JobOutputAssetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobOutputAssetArgs Empty = new JobOutputAssetArgs();

    /**
     * The name of the output Asset.
     * 
     */
    @InputImport(name="assetName", required=true)
        private final Input<String> assetName;

    public Input<String> getAssetName() {
        return this.assetName;
    }

    /**
     * A label that is assigned to a JobOutput in order to help uniquely identify it. This is useful when your Transform has more than one TransformOutput, whereby your Job has more than one JobOutput. In such cases, when you submit the Job, you will add two or more JobOutputs, in the same order as TransformOutputs in the Transform. Subsequently, when you retrieve the Job, either through events or on a GET request, you can use the label to easily identify the JobOutput. If a label is not provided, a default value of '{presetName}_{outputIndex}' will be used, where the preset name is the name of the preset in the corresponding TransformOutput and the output index is the relative index of the this JobOutput within the Job. Note that this index is the same as the relative index of the corresponding TransformOutput within its Transform.
     * 
     */
    @InputImport(name="label")
        private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobOutputAsset'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public JobOutputAssetArgs(
        Input<String> assetName,
        @Nullable Input<String> label,
        Input<String> odataType) {
        this.assetName = Objects.requireNonNull(assetName, "expected parameter 'assetName' to be non-null");
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private JobOutputAssetArgs() {
        this.assetName = Input.empty();
        this.label = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutputAssetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> assetName;
        private @Nullable Input<String> label;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutputAssetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetName = defaults.assetName;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAssetName(Input<String> assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder setAssetName(String assetName) {
            this.assetName = Input.of(Objects.requireNonNull(assetName));
            return this;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
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
        public JobOutputAssetArgs build() {
            return new JobOutputAssetArgs(assetName, label, odataType);
        }
    }
}
