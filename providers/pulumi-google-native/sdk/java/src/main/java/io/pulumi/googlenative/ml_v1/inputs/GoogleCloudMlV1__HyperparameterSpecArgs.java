// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1__HyperparameterSpecAlgorithm;
import io.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1__HyperparameterSpecGoal;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ParameterSpecArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a set of hyperparameters to optimize.
 * 
 */
public final class GoogleCloudMlV1__HyperparameterSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__HyperparameterSpecArgs Empty = new GoogleCloudMlV1__HyperparameterSpecArgs();

    /**
     * Optional. The search algorithm specified for the hyperparameter tuning job. Uses the default AI Platform hyperparameter tuning algorithm if unspecified.
     * 
     */
    @InputImport(name="algorithm")
      private final @Nullable Input<GoogleCloudMlV1__HyperparameterSpecAlgorithm> algorithm;

    public Input<GoogleCloudMlV1__HyperparameterSpecAlgorithm> getAlgorithm() {
        return this.algorithm == null ? Input.empty() : this.algorithm;
    }

    /**
     * Optional. Indicates if the hyperparameter tuning job enables auto trial early stopping.
     * 
     */
    @InputImport(name="enableTrialEarlyStopping")
      private final @Nullable Input<Boolean> enableTrialEarlyStopping;

    public Input<Boolean> getEnableTrialEarlyStopping() {
        return this.enableTrialEarlyStopping == null ? Input.empty() : this.enableTrialEarlyStopping;
    }

    /**
     * The type of goal to use for tuning. Available types are `MAXIMIZE` and `MINIMIZE`. Defaults to `MAXIMIZE`.
     * 
     */
    @InputImport(name="goal", required=true)
      private final Input<GoogleCloudMlV1__HyperparameterSpecGoal> goal;

    public Input<GoogleCloudMlV1__HyperparameterSpecGoal> getGoal() {
        return this.goal;
    }

    /**
     * Optional. The TensorFlow summary tag name to use for optimizing trials. For current versions of TensorFlow, this tag name should exactly match what is shown in TensorBoard, including all scopes. For versions of TensorFlow prior to 0.12, this should be only the tag passed to tf.Summary. By default, "training/hptuning/metric" will be used.
     * 
     */
    @InputImport(name="hyperparameterMetricTag")
      private final @Nullable Input<String> hyperparameterMetricTag;

    public Input<String> getHyperparameterMetricTag() {
        return this.hyperparameterMetricTag == null ? Input.empty() : this.hyperparameterMetricTag;
    }

    /**
     * Optional. The number of failed trials that need to be seen before failing the hyperparameter tuning job. You can specify this field to override the default failing criteria for AI Platform hyperparameter tuning jobs. Defaults to zero, which means the service decides when a hyperparameter job should fail.
     * 
     */
    @InputImport(name="maxFailedTrials")
      private final @Nullable Input<Integer> maxFailedTrials;

    public Input<Integer> getMaxFailedTrials() {
        return this.maxFailedTrials == null ? Input.empty() : this.maxFailedTrials;
    }

    /**
     * Optional. The number of training trials to run concurrently. You can reduce the time it takes to perform hyperparameter tuning by adding trials in parallel. However, each trail only benefits from the information gained in completed trials. That means that a trial does not get access to the results of trials running at the same time, which could reduce the quality of the overall optimization. Each trial will use the same scale tier and machine types. Defaults to one.
     * 
     */
    @InputImport(name="maxParallelTrials")
      private final @Nullable Input<Integer> maxParallelTrials;

    public Input<Integer> getMaxParallelTrials() {
        return this.maxParallelTrials == null ? Input.empty() : this.maxParallelTrials;
    }

    /**
     * Optional. How many training trials should be attempted to optimize the specified hyperparameters. Defaults to one.
     * 
     */
    @InputImport(name="maxTrials")
      private final @Nullable Input<Integer> maxTrials;

    public Input<Integer> getMaxTrials() {
        return this.maxTrials == null ? Input.empty() : this.maxTrials;
    }

    /**
     * The set of parameters to tune.
     * 
     */
    @InputImport(name="params", required=true)
      private final Input<List<GoogleCloudMlV1__ParameterSpecArgs>> params;

    public Input<List<GoogleCloudMlV1__ParameterSpecArgs>> getParams() {
        return this.params;
    }

    /**
     * Optional. The prior hyperparameter tuning job id that users hope to continue with. The job id will be used to find the corresponding vizier study guid and resume the study.
     * 
     */
    @InputImport(name="resumePreviousJobId")
      private final @Nullable Input<String> resumePreviousJobId;

    public Input<String> getResumePreviousJobId() {
        return this.resumePreviousJobId == null ? Input.empty() : this.resumePreviousJobId;
    }

    public GoogleCloudMlV1__HyperparameterSpecArgs(
        @Nullable Input<GoogleCloudMlV1__HyperparameterSpecAlgorithm> algorithm,
        @Nullable Input<Boolean> enableTrialEarlyStopping,
        Input<GoogleCloudMlV1__HyperparameterSpecGoal> goal,
        @Nullable Input<String> hyperparameterMetricTag,
        @Nullable Input<Integer> maxFailedTrials,
        @Nullable Input<Integer> maxParallelTrials,
        @Nullable Input<Integer> maxTrials,
        Input<List<GoogleCloudMlV1__ParameterSpecArgs>> params,
        @Nullable Input<String> resumePreviousJobId) {
        this.algorithm = algorithm;
        this.enableTrialEarlyStopping = enableTrialEarlyStopping;
        this.goal = Objects.requireNonNull(goal, "expected parameter 'goal' to be non-null");
        this.hyperparameterMetricTag = hyperparameterMetricTag;
        this.maxFailedTrials = maxFailedTrials;
        this.maxParallelTrials = maxParallelTrials;
        this.maxTrials = maxTrials;
        this.params = Objects.requireNonNull(params, "expected parameter 'params' to be non-null");
        this.resumePreviousJobId = resumePreviousJobId;
    }

    private GoogleCloudMlV1__HyperparameterSpecArgs() {
        this.algorithm = Input.empty();
        this.enableTrialEarlyStopping = Input.empty();
        this.goal = Input.empty();
        this.hyperparameterMetricTag = Input.empty();
        this.maxFailedTrials = Input.empty();
        this.maxParallelTrials = Input.empty();
        this.maxTrials = Input.empty();
        this.params = Input.empty();
        this.resumePreviousJobId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__HyperparameterSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudMlV1__HyperparameterSpecAlgorithm> algorithm;
        private @Nullable Input<Boolean> enableTrialEarlyStopping;
        private Input<GoogleCloudMlV1__HyperparameterSpecGoal> goal;
        private @Nullable Input<String> hyperparameterMetricTag;
        private @Nullable Input<Integer> maxFailedTrials;
        private @Nullable Input<Integer> maxParallelTrials;
        private @Nullable Input<Integer> maxTrials;
        private Input<List<GoogleCloudMlV1__ParameterSpecArgs>> params;
        private @Nullable Input<String> resumePreviousJobId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__HyperparameterSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.enableTrialEarlyStopping = defaults.enableTrialEarlyStopping;
    	      this.goal = defaults.goal;
    	      this.hyperparameterMetricTag = defaults.hyperparameterMetricTag;
    	      this.maxFailedTrials = defaults.maxFailedTrials;
    	      this.maxParallelTrials = defaults.maxParallelTrials;
    	      this.maxTrials = defaults.maxTrials;
    	      this.params = defaults.params;
    	      this.resumePreviousJobId = defaults.resumePreviousJobId;
        }

        public Builder setAlgorithm(@Nullable Input<GoogleCloudMlV1__HyperparameterSpecAlgorithm> algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setAlgorithm(@Nullable GoogleCloudMlV1__HyperparameterSpecAlgorithm algorithm) {
            this.algorithm = Input.ofNullable(algorithm);
            return this;
        }

        public Builder setEnableTrialEarlyStopping(@Nullable Input<Boolean> enableTrialEarlyStopping) {
            this.enableTrialEarlyStopping = enableTrialEarlyStopping;
            return this;
        }

        public Builder setEnableTrialEarlyStopping(@Nullable Boolean enableTrialEarlyStopping) {
            this.enableTrialEarlyStopping = Input.ofNullable(enableTrialEarlyStopping);
            return this;
        }

        public Builder setGoal(Input<GoogleCloudMlV1__HyperparameterSpecGoal> goal) {
            this.goal = Objects.requireNonNull(goal);
            return this;
        }

        public Builder setGoal(GoogleCloudMlV1__HyperparameterSpecGoal goal) {
            this.goal = Input.of(Objects.requireNonNull(goal));
            return this;
        }

        public Builder setHyperparameterMetricTag(@Nullable Input<String> hyperparameterMetricTag) {
            this.hyperparameterMetricTag = hyperparameterMetricTag;
            return this;
        }

        public Builder setHyperparameterMetricTag(@Nullable String hyperparameterMetricTag) {
            this.hyperparameterMetricTag = Input.ofNullable(hyperparameterMetricTag);
            return this;
        }

        public Builder setMaxFailedTrials(@Nullable Input<Integer> maxFailedTrials) {
            this.maxFailedTrials = maxFailedTrials;
            return this;
        }

        public Builder setMaxFailedTrials(@Nullable Integer maxFailedTrials) {
            this.maxFailedTrials = Input.ofNullable(maxFailedTrials);
            return this;
        }

        public Builder setMaxParallelTrials(@Nullable Input<Integer> maxParallelTrials) {
            this.maxParallelTrials = maxParallelTrials;
            return this;
        }

        public Builder setMaxParallelTrials(@Nullable Integer maxParallelTrials) {
            this.maxParallelTrials = Input.ofNullable(maxParallelTrials);
            return this;
        }

        public Builder setMaxTrials(@Nullable Input<Integer> maxTrials) {
            this.maxTrials = maxTrials;
            return this;
        }

        public Builder setMaxTrials(@Nullable Integer maxTrials) {
            this.maxTrials = Input.ofNullable(maxTrials);
            return this;
        }

        public Builder setParams(Input<List<GoogleCloudMlV1__ParameterSpecArgs>> params) {
            this.params = Objects.requireNonNull(params);
            return this;
        }

        public Builder setParams(List<GoogleCloudMlV1__ParameterSpecArgs> params) {
            this.params = Input.of(Objects.requireNonNull(params));
            return this;
        }

        public Builder setResumePreviousJobId(@Nullable Input<String> resumePreviousJobId) {
            this.resumePreviousJobId = resumePreviousJobId;
            return this;
        }

        public Builder setResumePreviousJobId(@Nullable String resumePreviousJobId) {
            this.resumePreviousJobId = Input.ofNullable(resumePreviousJobId);
            return this;
        }
        public GoogleCloudMlV1__HyperparameterSpecArgs build() {
            return new GoogleCloudMlV1__HyperparameterSpecArgs(algorithm, enableTrialEarlyStopping, goal, hyperparameterMetricTag, maxFailedTrials, maxParallelTrials, maxTrials, params, resumePreviousJobId);
        }
    }
}
