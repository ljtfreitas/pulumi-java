// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.media.enums.Priority;
import io.pulumi.azurenative.media.inputs.JobInputAssetArgs;
import io.pulumi.azurenative.media.inputs.JobInputClipArgs;
import io.pulumi.azurenative.media.inputs.JobInputHttpArgs;
import io.pulumi.azurenative.media.inputs.JobInputSequenceArgs;
import io.pulumi.azurenative.media.inputs.JobInputsArgs;
import io.pulumi.azurenative.media.inputs.JobOutputAssetArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Customer provided key, value pairs that will be returned in Job and JobOutput state events.
     * 
     */
    @Import(name="correlationData")
      private final @Nullable Output<Map<String,String>> correlationData;

    public Output<Map<String,String>> getCorrelationData() {
        return this.correlationData == null ? Output.empty() : this.correlationData;
    }

    /**
     * Optional customer supplied description of the Job.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The inputs for the Job.
     * 
     */
    @Import(name="input", required=true)
      private final Output<Object> input;

    public Output<Object> getInput() {
        return this.input;
    }

    /**
     * The Job name.
     * 
     */
    @Import(name="jobName")
      private final @Nullable Output<String> jobName;

    public Output<String> getJobName() {
        return this.jobName == null ? Output.empty() : this.jobName;
    }

    /**
     * The outputs for the Job.
     * 
     */
    @Import(name="outputs", required=true)
      private final Output<List<JobOutputAssetArgs>> outputs;

    public Output<List<JobOutputAssetArgs>> getOutputs() {
        return this.outputs;
    }

    /**
     * Priority with which the job should be processed. Higher priority jobs are processed before lower priority jobs. If not set, the default is normal.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Either<String,Priority>> priority;

    public Output<Either<String,Priority>> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Transform name.
     * 
     */
    @Import(name="transformName", required=true)
      private final Output<String> transformName;

    public Output<String> getTransformName() {
        return this.transformName;
    }

    public JobArgs(
        Output<String> accountName,
        @Nullable Output<Map<String,String>> correlationData,
        @Nullable Output<String> description,
        Output<Object> input,
        @Nullable Output<String> jobName,
        Output<List<JobOutputAssetArgs>> outputs,
        @Nullable Output<Either<String,Priority>> priority,
        Output<String> resourceGroupName,
        Output<String> transformName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.correlationData = correlationData;
        this.description = description;
        this.input = Objects.requireNonNull(input, "expected parameter 'input' to be non-null");
        this.jobName = jobName;
        this.outputs = Objects.requireNonNull(outputs, "expected parameter 'outputs' to be non-null");
        this.priority = priority;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.transformName = Objects.requireNonNull(transformName, "expected parameter 'transformName' to be non-null");
    }

    private JobArgs() {
        this.accountName = Output.empty();
        this.correlationData = Output.empty();
        this.description = Output.empty();
        this.input = Output.empty();
        this.jobName = Output.empty();
        this.outputs = Output.empty();
        this.priority = Output.empty();
        this.resourceGroupName = Output.empty();
        this.transformName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<Map<String,String>> correlationData;
        private @Nullable Output<String> description;
        private Output<Object> input;
        private @Nullable Output<String> jobName;
        private Output<List<JobOutputAssetArgs>> outputs;
        private @Nullable Output<Either<String,Priority>> priority;
        private Output<String> resourceGroupName;
        private Output<String> transformName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.correlationData = defaults.correlationData;
    	      this.description = defaults.description;
    	      this.input = defaults.input;
    	      this.jobName = defaults.jobName;
    	      this.outputs = defaults.outputs;
    	      this.priority = defaults.priority;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.transformName = defaults.transformName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder correlationData(@Nullable Output<Map<String,String>> correlationData) {
            this.correlationData = correlationData;
            return this;
        }

        public Builder correlationData(@Nullable Map<String,String> correlationData) {
            this.correlationData = Output.ofNullable(correlationData);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder input(Output<Object> input) {
            this.input = Objects.requireNonNull(input);
            return this;
        }

        public Builder input(Object input) {
            this.input = Output.of(Objects.requireNonNull(input));
            return this;
        }

        public Builder jobName(@Nullable Output<String> jobName) {
            this.jobName = jobName;
            return this;
        }

        public Builder jobName(@Nullable String jobName) {
            this.jobName = Output.ofNullable(jobName);
            return this;
        }

        public Builder outputs(Output<List<JobOutputAssetArgs>> outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }

        public Builder outputs(List<JobOutputAssetArgs> outputs) {
            this.outputs = Output.of(Objects.requireNonNull(outputs));
            return this;
        }

        public Builder priority(@Nullable Output<Either<String,Priority>> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Either<String,Priority> priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder transformName(Output<String> transformName) {
            this.transformName = Objects.requireNonNull(transformName);
            return this;
        }

        public Builder transformName(String transformName) {
            this.transformName = Output.of(Objects.requireNonNull(transformName));
            return this;
        }
        public JobArgs build() {
            return new JobArgs(accountName, correlationData, description, input, jobName, outputs, priority, resourceGroupName, transformName);
        }
    }
}
