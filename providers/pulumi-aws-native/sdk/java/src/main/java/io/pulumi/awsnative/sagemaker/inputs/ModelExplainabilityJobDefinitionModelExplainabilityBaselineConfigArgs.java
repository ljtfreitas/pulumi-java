// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelExplainabilityJobDefinitionConstraintsResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Baseline configuration used to validate that the data conforms to the specified constraints and statistics.
 * 
 */
public final class ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs Empty = new ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs();

    @InputImport(name="baseliningJobName")
        private final @Nullable Input<String> baseliningJobName;

    public Input<String> getBaseliningJobName() {
        return this.baseliningJobName == null ? Input.empty() : this.baseliningJobName;
    }

    @InputImport(name="constraintsResource")
        private final @Nullable Input<ModelExplainabilityJobDefinitionConstraintsResourceArgs> constraintsResource;

    public Input<ModelExplainabilityJobDefinitionConstraintsResourceArgs> getConstraintsResource() {
        return this.constraintsResource == null ? Input.empty() : this.constraintsResource;
    }

    public ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs(
        @Nullable Input<String> baseliningJobName,
        @Nullable Input<ModelExplainabilityJobDefinitionConstraintsResourceArgs> constraintsResource) {
        this.baseliningJobName = baseliningJobName;
        this.constraintsResource = constraintsResource;
    }

    private ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs() {
        this.baseliningJobName = Input.empty();
        this.constraintsResource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> baseliningJobName;
        private @Nullable Input<ModelExplainabilityJobDefinitionConstraintsResourceArgs> constraintsResource;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseliningJobName = defaults.baseliningJobName;
    	      this.constraintsResource = defaults.constraintsResource;
        }

        public Builder setBaseliningJobName(@Nullable Input<String> baseliningJobName) {
            this.baseliningJobName = baseliningJobName;
            return this;
        }

        public Builder setBaseliningJobName(@Nullable String baseliningJobName) {
            this.baseliningJobName = Input.ofNullable(baseliningJobName);
            return this;
        }

        public Builder setConstraintsResource(@Nullable Input<ModelExplainabilityJobDefinitionConstraintsResourceArgs> constraintsResource) {
            this.constraintsResource = constraintsResource;
            return this;
        }

        public Builder setConstraintsResource(@Nullable ModelExplainabilityJobDefinitionConstraintsResourceArgs constraintsResource) {
            this.constraintsResource = Input.ofNullable(constraintsResource);
            return this;
        }
        public ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs build() {
            return new ModelExplainabilityJobDefinitionModelExplainabilityBaselineConfigArgs(baseliningJobName, constraintsResource);
        }
    }
}
