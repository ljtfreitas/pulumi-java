// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__PredictionInputArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__PredictionOutputArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__TrainingInputArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__TrainingOutputArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a job from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform job updates in order to avoid race conditions: An `etag` is returned in the response to `GetJob`, and systems are expected to put that etag in the request to `UpdateJob` to ensure that their change will be applied to the same version of the job.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The user-specified id of the job.
     * 
     */
    @Import(name="jobId", required=true)
      private final Output<String> jobId;

    public Output<String> getJobId() {
        return this.jobId;
    }

    /**
     * Optional. One or more labels that you can add, to organize your jobs. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Input parameters to create a prediction job.
     * 
     */
    @Import(name="predictionInput")
      private final @Nullable Output<GoogleCloudMlV1__PredictionInputArgs> predictionInput;

    public Output<GoogleCloudMlV1__PredictionInputArgs> getPredictionInput() {
        return this.predictionInput == null ? Output.empty() : this.predictionInput;
    }

    /**
     * The current prediction job result.
     * 
     */
    @Import(name="predictionOutput")
      private final @Nullable Output<GoogleCloudMlV1__PredictionOutputArgs> predictionOutput;

    public Output<GoogleCloudMlV1__PredictionOutputArgs> getPredictionOutput() {
        return this.predictionOutput == null ? Output.empty() : this.predictionOutput;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Input parameters to create a training job.
     * 
     */
    @Import(name="trainingInput")
      private final @Nullable Output<GoogleCloudMlV1__TrainingInputArgs> trainingInput;

    public Output<GoogleCloudMlV1__TrainingInputArgs> getTrainingInput() {
        return this.trainingInput == null ? Output.empty() : this.trainingInput;
    }

    /**
     * The current training job result.
     * 
     */
    @Import(name="trainingOutput")
      private final @Nullable Output<GoogleCloudMlV1__TrainingOutputArgs> trainingOutput;

    public Output<GoogleCloudMlV1__TrainingOutputArgs> getTrainingOutput() {
        return this.trainingOutput == null ? Output.empty() : this.trainingOutput;
    }

    public JobArgs(
        @Nullable Output<String> etag,
        Output<String> jobId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<GoogleCloudMlV1__PredictionInputArgs> predictionInput,
        @Nullable Output<GoogleCloudMlV1__PredictionOutputArgs> predictionOutput,
        @Nullable Output<String> project,
        @Nullable Output<GoogleCloudMlV1__TrainingInputArgs> trainingInput,
        @Nullable Output<GoogleCloudMlV1__TrainingOutputArgs> trainingOutput) {
        this.etag = etag;
        this.jobId = Objects.requireNonNull(jobId, "expected parameter 'jobId' to be non-null");
        this.labels = labels;
        this.predictionInput = predictionInput;
        this.predictionOutput = predictionOutput;
        this.project = project;
        this.trainingInput = trainingInput;
        this.trainingOutput = trainingOutput;
    }

    private JobArgs() {
        this.etag = Output.empty();
        this.jobId = Output.empty();
        this.labels = Output.empty();
        this.predictionInput = Output.empty();
        this.predictionOutput = Output.empty();
        this.project = Output.empty();
        this.trainingInput = Output.empty();
        this.trainingOutput = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> etag;
        private Output<String> jobId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<GoogleCloudMlV1__PredictionInputArgs> predictionInput;
        private @Nullable Output<GoogleCloudMlV1__PredictionOutputArgs> predictionOutput;
        private @Nullable Output<String> project;
        private @Nullable Output<GoogleCloudMlV1__TrainingInputArgs> trainingInput;
        private @Nullable Output<GoogleCloudMlV1__TrainingOutputArgs> trainingOutput;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.jobId = defaults.jobId;
    	      this.labels = defaults.labels;
    	      this.predictionInput = defaults.predictionInput;
    	      this.predictionOutput = defaults.predictionOutput;
    	      this.project = defaults.project;
    	      this.trainingInput = defaults.trainingInput;
    	      this.trainingOutput = defaults.trainingOutput;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder jobId(Output<String> jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }

        public Builder jobId(String jobId) {
            this.jobId = Output.of(Objects.requireNonNull(jobId));
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder predictionInput(@Nullable Output<GoogleCloudMlV1__PredictionInputArgs> predictionInput) {
            this.predictionInput = predictionInput;
            return this;
        }

        public Builder predictionInput(@Nullable GoogleCloudMlV1__PredictionInputArgs predictionInput) {
            this.predictionInput = Output.ofNullable(predictionInput);
            return this;
        }

        public Builder predictionOutput(@Nullable Output<GoogleCloudMlV1__PredictionOutputArgs> predictionOutput) {
            this.predictionOutput = predictionOutput;
            return this;
        }

        public Builder predictionOutput(@Nullable GoogleCloudMlV1__PredictionOutputArgs predictionOutput) {
            this.predictionOutput = Output.ofNullable(predictionOutput);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder trainingInput(@Nullable Output<GoogleCloudMlV1__TrainingInputArgs> trainingInput) {
            this.trainingInput = trainingInput;
            return this;
        }

        public Builder trainingInput(@Nullable GoogleCloudMlV1__TrainingInputArgs trainingInput) {
            this.trainingInput = Output.ofNullable(trainingInput);
            return this;
        }

        public Builder trainingOutput(@Nullable Output<GoogleCloudMlV1__TrainingOutputArgs> trainingOutput) {
            this.trainingOutput = trainingOutput;
            return this;
        }

        public Builder trainingOutput(@Nullable GoogleCloudMlV1__TrainingOutputArgs trainingOutput) {
            this.trainingOutput = Output.ofNullable(trainingOutput);
            return this;
        }
        public JobArgs build() {
            return new JobArgs(etag, jobId, labels, predictionInput, predictionOutput, project, trainingInput, trainingOutput);
        }
    }
}
