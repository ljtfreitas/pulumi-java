// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.SamplingAlgorithm;
import io.pulumi.azurenative.machinelearningservices.inputs.AmlTokenArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.BanditPolicyArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ComputeConfigurationArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ManagedIdentityArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.MedianStoppingPolicyArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ObjectiveArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.TrialComponentArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.TruncationSelectionPolicyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sweep job definition.
 * 
 */
public final class SweepJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final SweepJobArgs Empty = new SweepJobArgs();

    /**
     * Type of the hyperparameter sampling algorithms
     * 
     */
    @Import(name="algorithm", required=true)
      private final Output<Either<String,SamplingAlgorithm>> algorithm;

    public Output<Either<String,SamplingAlgorithm>> getAlgorithm() {
        return this.algorithm;
    }

    /**
     * Compute binding for the job.
     * 
     */
    @Import(name="compute", required=true)
      private final Output<ComputeConfigurationArgs> compute;

    public Output<ComputeConfigurationArgs> getCompute() {
        return this.compute;
    }

    /**
     * The asset description text.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Early termination policies enable canceling poor-performing runs before they complete.
     * 
     */
    @Import(name="earlyTermination")
      private final @Nullable Output<Object> earlyTermination;

    public Output<Object> getEarlyTermination() {
        return this.earlyTermination == null ? Output.empty() : this.earlyTermination;
    }

    /**
     * The name of the experiment the job belongs to. If not set, the job is placed in the "Default" experiment.
     * 
     */
    @Import(name="experimentName")
      private final @Nullable Output<String> experimentName;

    public Output<String> getExperimentName() {
        return this.experimentName == null ? Output.empty() : this.experimentName;
    }

    /**
     * Identity configuration. If set, this should be one of AmlToken, ManagedIdentity or null.
     * Defaults to AmlToken if null.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<Either<AmlTokenArgs,ManagedIdentityArgs>> identity;

    public Output<Either<AmlTokenArgs,ManagedIdentityArgs>> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * Enum to determine the type of job.
     * Expected value is 'Sweep'.
     * 
     */
    @Import(name="jobType", required=true)
      private final Output<String> jobType;

    public Output<String> getJobType() {
        return this.jobType;
    }

    /**
     * An upper bound on the number of trials performed in parallel.
     * 
     */
    @Import(name="maxConcurrentTrials")
      private final @Nullable Output<Integer> maxConcurrentTrials;

    public Output<Integer> getMaxConcurrentTrials() {
        return this.maxConcurrentTrials == null ? Output.empty() : this.maxConcurrentTrials;
    }

    /**
     * An upper bound on the number of trials to perform.
     * 
     */
    @Import(name="maxTotalTrials")
      private final @Nullable Output<Integer> maxTotalTrials;

    public Output<Integer> getMaxTotalTrials() {
        return this.maxTotalTrials == null ? Output.empty() : this.maxTotalTrials;
    }

    /**
     * Optimization objective.
     * 
     */
    @Import(name="objective", required=true)
      private final Output<ObjectiveArgs> objective;

    public Output<ObjectiveArgs> getObjective() {
        return this.objective;
    }

    /**
     * Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * The asset property dictionary.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * A dictionary containing each parameter and its distribution. The dictionary key is the name of the parameter
     * 
     */
    @Import(name="searchSpace", required=true)
      private final Output<Map<String,Object>> searchSpace;

    public Output<Map<String,Object>> getSearchSpace() {
        return this.searchSpace;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The total timeout in ISO 8601 format. Only supports duration with precision as low as Minutes.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * Trial component definition.
     * 
     */
    @Import(name="trial")
      private final @Nullable Output<TrialComponentArgs> trial;

    public Output<TrialComponentArgs> getTrial() {
        return this.trial == null ? Output.empty() : this.trial;
    }

    public SweepJobArgs(
        Output<Either<String,SamplingAlgorithm>> algorithm,
        Output<ComputeConfigurationArgs> compute,
        @Nullable Output<String> description,
        @Nullable Output<Object> earlyTermination,
        @Nullable Output<String> experimentName,
        @Nullable Output<Either<AmlTokenArgs,ManagedIdentityArgs>> identity,
        Output<String> jobType,
        @Nullable Output<Integer> maxConcurrentTrials,
        @Nullable Output<Integer> maxTotalTrials,
        Output<ObjectiveArgs> objective,
        @Nullable Output<Integer> priority,
        @Nullable Output<Map<String,String>> properties,
        Output<Map<String,Object>> searchSpace,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> timeout,
        @Nullable Output<TrialComponentArgs> trial) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.compute = Objects.requireNonNull(compute, "expected parameter 'compute' to be non-null");
        this.description = description;
        this.earlyTermination = earlyTermination;
        this.experimentName = experimentName;
        this.identity = identity;
        this.jobType = Objects.requireNonNull(jobType, "expected parameter 'jobType' to be non-null");
        this.maxConcurrentTrials = maxConcurrentTrials;
        this.maxTotalTrials = maxTotalTrials;
        this.objective = Objects.requireNonNull(objective, "expected parameter 'objective' to be non-null");
        this.priority = priority;
        this.properties = properties;
        this.searchSpace = Objects.requireNonNull(searchSpace, "expected parameter 'searchSpace' to be non-null");
        this.tags = tags;
        this.timeout = timeout;
        this.trial = trial;
    }

    private SweepJobArgs() {
        this.algorithm = Output.empty();
        this.compute = Output.empty();
        this.description = Output.empty();
        this.earlyTermination = Output.empty();
        this.experimentName = Output.empty();
        this.identity = Output.empty();
        this.jobType = Output.empty();
        this.maxConcurrentTrials = Output.empty();
        this.maxTotalTrials = Output.empty();
        this.objective = Output.empty();
        this.priority = Output.empty();
        this.properties = Output.empty();
        this.searchSpace = Output.empty();
        this.tags = Output.empty();
        this.timeout = Output.empty();
        this.trial = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SweepJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,SamplingAlgorithm>> algorithm;
        private Output<ComputeConfigurationArgs> compute;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> earlyTermination;
        private @Nullable Output<String> experimentName;
        private @Nullable Output<Either<AmlTokenArgs,ManagedIdentityArgs>> identity;
        private Output<String> jobType;
        private @Nullable Output<Integer> maxConcurrentTrials;
        private @Nullable Output<Integer> maxTotalTrials;
        private Output<ObjectiveArgs> objective;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<Map<String,String>> properties;
        private Output<Map<String,Object>> searchSpace;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> timeout;
        private @Nullable Output<TrialComponentArgs> trial;

        public Builder() {
    	      // Empty
        }

        public Builder(SweepJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.compute = defaults.compute;
    	      this.description = defaults.description;
    	      this.earlyTermination = defaults.earlyTermination;
    	      this.experimentName = defaults.experimentName;
    	      this.identity = defaults.identity;
    	      this.jobType = defaults.jobType;
    	      this.maxConcurrentTrials = defaults.maxConcurrentTrials;
    	      this.maxTotalTrials = defaults.maxTotalTrials;
    	      this.objective = defaults.objective;
    	      this.priority = defaults.priority;
    	      this.properties = defaults.properties;
    	      this.searchSpace = defaults.searchSpace;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.trial = defaults.trial;
        }

        public Builder algorithm(Output<Either<String,SamplingAlgorithm>> algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder algorithm(Either<String,SamplingAlgorithm> algorithm) {
            this.algorithm = Output.of(Objects.requireNonNull(algorithm));
            return this;
        }

        public Builder compute(Output<ComputeConfigurationArgs> compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }

        public Builder compute(ComputeConfigurationArgs compute) {
            this.compute = Output.of(Objects.requireNonNull(compute));
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

        public Builder earlyTermination(@Nullable Output<Object> earlyTermination) {
            this.earlyTermination = earlyTermination;
            return this;
        }

        public Builder earlyTermination(@Nullable Object earlyTermination) {
            this.earlyTermination = Output.ofNullable(earlyTermination);
            return this;
        }

        public Builder experimentName(@Nullable Output<String> experimentName) {
            this.experimentName = experimentName;
            return this;
        }

        public Builder experimentName(@Nullable String experimentName) {
            this.experimentName = Output.ofNullable(experimentName);
            return this;
        }

        public Builder identity(@Nullable Output<Either<AmlTokenArgs,ManagedIdentityArgs>> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable Either<AmlTokenArgs,ManagedIdentityArgs> identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }

        public Builder jobType(Output<String> jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }

        public Builder jobType(String jobType) {
            this.jobType = Output.of(Objects.requireNonNull(jobType));
            return this;
        }

        public Builder maxConcurrentTrials(@Nullable Output<Integer> maxConcurrentTrials) {
            this.maxConcurrentTrials = maxConcurrentTrials;
            return this;
        }

        public Builder maxConcurrentTrials(@Nullable Integer maxConcurrentTrials) {
            this.maxConcurrentTrials = Output.ofNullable(maxConcurrentTrials);
            return this;
        }

        public Builder maxTotalTrials(@Nullable Output<Integer> maxTotalTrials) {
            this.maxTotalTrials = maxTotalTrials;
            return this;
        }

        public Builder maxTotalTrials(@Nullable Integer maxTotalTrials) {
            this.maxTotalTrials = Output.ofNullable(maxTotalTrials);
            return this;
        }

        public Builder objective(Output<ObjectiveArgs> objective) {
            this.objective = Objects.requireNonNull(objective);
            return this;
        }

        public Builder objective(ObjectiveArgs objective) {
            this.objective = Output.of(Objects.requireNonNull(objective));
            return this;
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }

        public Builder searchSpace(Output<Map<String,Object>> searchSpace) {
            this.searchSpace = Objects.requireNonNull(searchSpace);
            return this;
        }

        public Builder searchSpace(Map<String,Object> searchSpace) {
            this.searchSpace = Output.of(Objects.requireNonNull(searchSpace));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }

        public Builder trial(@Nullable Output<TrialComponentArgs> trial) {
            this.trial = trial;
            return this;
        }

        public Builder trial(@Nullable TrialComponentArgs trial) {
            this.trial = Output.ofNullable(trial);
            return this;
        }
        public SweepJobArgs build() {
            return new SweepJobArgs(algorithm, compute, description, earlyTermination, experimentName, identity, jobType, maxConcurrentTrials, maxTotalTrials, objective, priority, properties, searchSpace, tags, timeout, trial);
        }
    }
}
