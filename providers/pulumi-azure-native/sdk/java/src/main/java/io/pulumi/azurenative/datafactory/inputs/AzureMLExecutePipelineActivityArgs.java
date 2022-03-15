// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure ML Execute Pipeline activity.
 * 
 */
public final class AzureMLExecutePipelineActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMLExecutePipelineActivityArgs Empty = new AzureMLExecutePipelineActivityArgs();

    /**
     * Whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="continueOnStepFailure")
      private final @Nullable Output<Object> continueOnStepFailure;

    public Output<Object> getContinueOnStepFailure() {
        return this.continueOnStepFailure == null ? Output.empty() : this.continueOnStepFailure;
    }

    /**
     * Dictionary used for changing data path assignments without retraining. Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    @Import(name="dataPathAssignments")
      private final @Nullable Output<Object> dataPathAssignments;

    public Output<Object> getDataPathAssignments() {
        return this.dataPathAssignments == null ? Output.empty() : this.dataPathAssignments;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Output<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Output.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Run history experiment name of the pipeline run. This information will be passed in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="experimentName")
      private final @Nullable Output<Object> experimentName;

    public Output<Object> getExperimentName() {
        return this.experimentName == null ? Output.empty() : this.experimentName;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
      private final @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Output.empty() : this.linkedServiceName;
    }

    /**
     * The parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mlParentRunId")
      private final @Nullable Output<Object> mlParentRunId;

    public Output<Object> getMlParentRunId() {
        return this.mlParentRunId == null ? Output.empty() : this.mlParentRunId;
    }

    /**
     * ID of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mlPipelineEndpointId")
      private final @Nullable Output<Object> mlPipelineEndpointId;

    public Output<Object> getMlPipelineEndpointId() {
        return this.mlPipelineEndpointId == null ? Output.empty() : this.mlPipelineEndpointId;
    }

    /**
     * ID of the published Azure ML pipeline. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mlPipelineId")
      private final @Nullable Output<Object> mlPipelineId;

    public Output<Object> getMlPipelineId() {
        return this.mlPipelineId == null ? Output.empty() : this.mlPipelineId;
    }

    /**
     * Key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    @Import(name="mlPipelineParameters")
      private final @Nullable Output<Object> mlPipelineParameters;

    public Output<Object> getMlPipelineParameters() {
        return this.mlPipelineParameters == null ? Output.empty() : this.mlPipelineParameters;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<ActivityPolicyArgs> policy;

    public Output<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * Type of activity.
     * Expected value is 'AzureMLExecutePipeline'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Output<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Output.empty() : this.userProperties;
    }

    /**
     * Version of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Object> version;

    public Output<Object> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public AzureMLExecutePipelineActivityArgs(
        @Nullable Output<Object> continueOnStepFailure,
        @Nullable Output<Object> dataPathAssignments,
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        @Nullable Output<Object> experimentName,
        @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Output<Object> mlParentRunId,
        @Nullable Output<Object> mlPipelineEndpointId,
        @Nullable Output<Object> mlPipelineId,
        @Nullable Output<Object> mlPipelineParameters,
        Output<String> name,
        @Nullable Output<ActivityPolicyArgs> policy,
        Output<String> type,
        @Nullable Output<List<UserPropertyArgs>> userProperties,
        @Nullable Output<Object> version) {
        this.continueOnStepFailure = continueOnStepFailure;
        this.dataPathAssignments = dataPathAssignments;
        this.dependsOn = dependsOn;
        this.description = description;
        this.experimentName = experimentName;
        this.linkedServiceName = linkedServiceName;
        this.mlParentRunId = mlParentRunId;
        this.mlPipelineEndpointId = mlPipelineEndpointId;
        this.mlPipelineId = mlPipelineId;
        this.mlPipelineParameters = mlPipelineParameters;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
        this.version = version;
    }

    private AzureMLExecutePipelineActivityArgs() {
        this.continueOnStepFailure = Output.empty();
        this.dataPathAssignments = Output.empty();
        this.dependsOn = Output.empty();
        this.description = Output.empty();
        this.experimentName = Output.empty();
        this.linkedServiceName = Output.empty();
        this.mlParentRunId = Output.empty();
        this.mlPipelineEndpointId = Output.empty();
        this.mlPipelineId = Output.empty();
        this.mlPipelineParameters = Output.empty();
        this.name = Output.empty();
        this.policy = Output.empty();
        this.type = Output.empty();
        this.userProperties = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLExecutePipelineActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> continueOnStepFailure;
        private @Nullable Output<Object> dataPathAssignments;
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> experimentName;
        private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Output<Object> mlParentRunId;
        private @Nullable Output<Object> mlPipelineEndpointId;
        private @Nullable Output<Object> mlPipelineId;
        private @Nullable Output<Object> mlPipelineParameters;
        private Output<String> name;
        private @Nullable Output<ActivityPolicyArgs> policy;
        private Output<String> type;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;
        private @Nullable Output<Object> version;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLExecutePipelineActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnStepFailure = defaults.continueOnStepFailure;
    	      this.dataPathAssignments = defaults.dataPathAssignments;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.experimentName = defaults.experimentName;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.mlParentRunId = defaults.mlParentRunId;
    	      this.mlPipelineEndpointId = defaults.mlPipelineEndpointId;
    	      this.mlPipelineId = defaults.mlPipelineId;
    	      this.mlPipelineParameters = defaults.mlPipelineParameters;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.version = defaults.version;
        }

        public Builder continueOnStepFailure(@Nullable Output<Object> continueOnStepFailure) {
            this.continueOnStepFailure = continueOnStepFailure;
            return this;
        }

        public Builder continueOnStepFailure(@Nullable Object continueOnStepFailure) {
            this.continueOnStepFailure = Output.ofNullable(continueOnStepFailure);
            return this;
        }

        public Builder dataPathAssignments(@Nullable Output<Object> dataPathAssignments) {
            this.dataPathAssignments = dataPathAssignments;
            return this;
        }

        public Builder dataPathAssignments(@Nullable Object dataPathAssignments) {
            this.dataPathAssignments = Output.ofNullable(dataPathAssignments);
            return this;
        }

        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Output.ofNullable(dependsOn);
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

        public Builder experimentName(@Nullable Output<Object> experimentName) {
            this.experimentName = experimentName;
            return this;
        }

        public Builder experimentName(@Nullable Object experimentName) {
            this.experimentName = Output.ofNullable(experimentName);
            return this;
        }

        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder linkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Output.ofNullable(linkedServiceName);
            return this;
        }

        public Builder mlParentRunId(@Nullable Output<Object> mlParentRunId) {
            this.mlParentRunId = mlParentRunId;
            return this;
        }

        public Builder mlParentRunId(@Nullable Object mlParentRunId) {
            this.mlParentRunId = Output.ofNullable(mlParentRunId);
            return this;
        }

        public Builder mlPipelineEndpointId(@Nullable Output<Object> mlPipelineEndpointId) {
            this.mlPipelineEndpointId = mlPipelineEndpointId;
            return this;
        }

        public Builder mlPipelineEndpointId(@Nullable Object mlPipelineEndpointId) {
            this.mlPipelineEndpointId = Output.ofNullable(mlPipelineEndpointId);
            return this;
        }

        public Builder mlPipelineId(@Nullable Output<Object> mlPipelineId) {
            this.mlPipelineId = mlPipelineId;
            return this;
        }

        public Builder mlPipelineId(@Nullable Object mlPipelineId) {
            this.mlPipelineId = Output.ofNullable(mlPipelineId);
            return this;
        }

        public Builder mlPipelineParameters(@Nullable Output<Object> mlPipelineParameters) {
            this.mlPipelineParameters = mlPipelineParameters;
            return this;
        }

        public Builder mlPipelineParameters(@Nullable Object mlPipelineParameters) {
            this.mlPipelineParameters = Output.ofNullable(mlPipelineParameters);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Output.ofNullable(userProperties);
            return this;
        }

        public Builder version(@Nullable Output<Object> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable Object version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public AzureMLExecutePipelineActivityArgs build() {
            return new AzureMLExecutePipelineActivityArgs(continueOnStepFailure, dataPathAssignments, dependsOn, description, experimentName, linkedServiceName, mlParentRunId, mlPipelineEndpointId, mlPipelineId, mlPipelineParameters, name, policy, type, userProperties, version);
        }
    }
}
