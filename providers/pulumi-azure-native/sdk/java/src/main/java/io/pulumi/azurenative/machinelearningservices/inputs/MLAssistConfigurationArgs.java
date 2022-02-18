// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ComputeBindingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents configuration for machine learning assisted features in a labeling job.
 * 
 */
public final class MLAssistConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MLAssistConfigurationArgs Empty = new MLAssistConfigurationArgs();

    /**
     * The compute designated for inferencing.
     * 
     */
    @InputImport(name="inferencingComputeBinding", required=true)
    private final Input<ComputeBindingArgs> inferencingComputeBinding;

    public Input<ComputeBindingArgs> getInferencingComputeBinding() {
        return this.inferencingComputeBinding;
    }

    /**
     * Indicates whether MLAssist feature is enabled.
     * 
     */
    @InputImport(name="mlAssistEnabled")
    private final @Nullable Input<Boolean> mlAssistEnabled;

    public Input<Boolean> getMlAssistEnabled() {
        return this.mlAssistEnabled == null ? Input.empty() : this.mlAssistEnabled;
    }

    /**
     * Name prefix to use for machine learning model. For each iteration modelName will be appended with iteration e.g.{modelName}_{i}.
     * 
     */
    @InputImport(name="modelNamePrefix", required=true)
    private final Input<String> modelNamePrefix;

    public Input<String> getModelNamePrefix() {
        return this.modelNamePrefix;
    }

    /**
     * Prelabel accuracy threshold used in MLAssist feature.
     * 
     */
    @InputImport(name="prelabelAccuracyThreshold")
    private final @Nullable Input<Double> prelabelAccuracyThreshold;

    public Input<Double> getPrelabelAccuracyThreshold() {
        return this.prelabelAccuracyThreshold == null ? Input.empty() : this.prelabelAccuracyThreshold;
    }

    /**
     * The compute designated for training.
     * 
     */
    @InputImport(name="trainingComputeBinding", required=true)
    private final Input<ComputeBindingArgs> trainingComputeBinding;

    public Input<ComputeBindingArgs> getTrainingComputeBinding() {
        return this.trainingComputeBinding;
    }

    public MLAssistConfigurationArgs(
        Input<ComputeBindingArgs> inferencingComputeBinding,
        @Nullable Input<Boolean> mlAssistEnabled,
        Input<String> modelNamePrefix,
        @Nullable Input<Double> prelabelAccuracyThreshold,
        Input<ComputeBindingArgs> trainingComputeBinding) {
        this.inferencingComputeBinding = Objects.requireNonNull(inferencingComputeBinding, "expected parameter 'inferencingComputeBinding' to be non-null");
        this.mlAssistEnabled = mlAssistEnabled;
        this.modelNamePrefix = Objects.requireNonNull(modelNamePrefix, "expected parameter 'modelNamePrefix' to be non-null");
        this.prelabelAccuracyThreshold = prelabelAccuracyThreshold;
        this.trainingComputeBinding = Objects.requireNonNull(trainingComputeBinding, "expected parameter 'trainingComputeBinding' to be non-null");
    }

    private MLAssistConfigurationArgs() {
        this.inferencingComputeBinding = Input.empty();
        this.mlAssistEnabled = Input.empty();
        this.modelNamePrefix = Input.empty();
        this.prelabelAccuracyThreshold = Input.empty();
        this.trainingComputeBinding = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLAssistConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ComputeBindingArgs> inferencingComputeBinding;
        private @Nullable Input<Boolean> mlAssistEnabled;
        private Input<String> modelNamePrefix;
        private @Nullable Input<Double> prelabelAccuracyThreshold;
        private Input<ComputeBindingArgs> trainingComputeBinding;

        public Builder() {
    	      // Empty
        }

        public Builder(MLAssistConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inferencingComputeBinding = defaults.inferencingComputeBinding;
    	      this.mlAssistEnabled = defaults.mlAssistEnabled;
    	      this.modelNamePrefix = defaults.modelNamePrefix;
    	      this.prelabelAccuracyThreshold = defaults.prelabelAccuracyThreshold;
    	      this.trainingComputeBinding = defaults.trainingComputeBinding;
        }

        public Builder setInferencingComputeBinding(Input<ComputeBindingArgs> inferencingComputeBinding) {
            this.inferencingComputeBinding = Objects.requireNonNull(inferencingComputeBinding);
            return this;
        }

        public Builder setInferencingComputeBinding(ComputeBindingArgs inferencingComputeBinding) {
            this.inferencingComputeBinding = Input.of(Objects.requireNonNull(inferencingComputeBinding));
            return this;
        }

        public Builder setMlAssistEnabled(@Nullable Input<Boolean> mlAssistEnabled) {
            this.mlAssistEnabled = mlAssistEnabled;
            return this;
        }

        public Builder setMlAssistEnabled(@Nullable Boolean mlAssistEnabled) {
            this.mlAssistEnabled = Input.ofNullable(mlAssistEnabled);
            return this;
        }

        public Builder setModelNamePrefix(Input<String> modelNamePrefix) {
            this.modelNamePrefix = Objects.requireNonNull(modelNamePrefix);
            return this;
        }

        public Builder setModelNamePrefix(String modelNamePrefix) {
            this.modelNamePrefix = Input.of(Objects.requireNonNull(modelNamePrefix));
            return this;
        }

        public Builder setPrelabelAccuracyThreshold(@Nullable Input<Double> prelabelAccuracyThreshold) {
            this.prelabelAccuracyThreshold = prelabelAccuracyThreshold;
            return this;
        }

        public Builder setPrelabelAccuracyThreshold(@Nullable Double prelabelAccuracyThreshold) {
            this.prelabelAccuracyThreshold = Input.ofNullable(prelabelAccuracyThreshold);
            return this;
        }

        public Builder setTrainingComputeBinding(Input<ComputeBindingArgs> trainingComputeBinding) {
            this.trainingComputeBinding = Objects.requireNonNull(trainingComputeBinding);
            return this;
        }

        public Builder setTrainingComputeBinding(ComputeBindingArgs trainingComputeBinding) {
            this.trainingComputeBinding = Input.of(Objects.requireNonNull(trainingComputeBinding));
            return this;
        }

        public MLAssistConfigurationArgs build() {
            return new MLAssistConfigurationArgs(inferencingComputeBinding, mlAssistEnabled, modelNamePrefix, prelabelAccuracyThreshold, trainingComputeBinding);
        }
    }
}
