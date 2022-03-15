// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionConstraintsResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Baseline configuration used to validate that the data conforms to the specified constraints and statistics.
 * 
 */
public final class ModelQualityJobDefinitionModelQualityBaselineConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionModelQualityBaselineConfigArgs Empty = new ModelQualityJobDefinitionModelQualityBaselineConfigArgs();

    @Import(name="baseliningJobName")
      private final @Nullable Output<String> baseliningJobName;

    public Output<String> getBaseliningJobName() {
        return this.baseliningJobName == null ? Output.empty() : this.baseliningJobName;
    }

    @Import(name="constraintsResource")
      private final @Nullable Output<ModelQualityJobDefinitionConstraintsResourceArgs> constraintsResource;

    public Output<ModelQualityJobDefinitionConstraintsResourceArgs> getConstraintsResource() {
        return this.constraintsResource == null ? Output.empty() : this.constraintsResource;
    }

    public ModelQualityJobDefinitionModelQualityBaselineConfigArgs(
        @Nullable Output<String> baseliningJobName,
        @Nullable Output<ModelQualityJobDefinitionConstraintsResourceArgs> constraintsResource) {
        this.baseliningJobName = baseliningJobName;
        this.constraintsResource = constraintsResource;
    }

    private ModelQualityJobDefinitionModelQualityBaselineConfigArgs() {
        this.baseliningJobName = Output.empty();
        this.constraintsResource = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionModelQualityBaselineConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> baseliningJobName;
        private @Nullable Output<ModelQualityJobDefinitionConstraintsResourceArgs> constraintsResource;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionModelQualityBaselineConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseliningJobName = defaults.baseliningJobName;
    	      this.constraintsResource = defaults.constraintsResource;
        }

        public Builder baseliningJobName(@Nullable Output<String> baseliningJobName) {
            this.baseliningJobName = baseliningJobName;
            return this;
        }

        public Builder baseliningJobName(@Nullable String baseliningJobName) {
            this.baseliningJobName = Output.ofNullable(baseliningJobName);
            return this;
        }

        public Builder constraintsResource(@Nullable Output<ModelQualityJobDefinitionConstraintsResourceArgs> constraintsResource) {
            this.constraintsResource = constraintsResource;
            return this;
        }

        public Builder constraintsResource(@Nullable ModelQualityJobDefinitionConstraintsResourceArgs constraintsResource) {
            this.constraintsResource = Output.ofNullable(constraintsResource);
            return this;
        }
        public ModelQualityJobDefinitionModelQualityBaselineConfigArgs build() {
            return new ModelQualityJobDefinitionModelQualityBaselineConfigArgs(baseliningJobName, constraintsResource);
        }
    }
}
