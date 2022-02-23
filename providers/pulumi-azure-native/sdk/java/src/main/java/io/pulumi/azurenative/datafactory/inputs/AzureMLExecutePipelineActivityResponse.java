// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure ML Execute Pipeline activity.
 * 
 */
public final class AzureMLExecutePipelineActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureMLExecutePipelineActivityResponse Empty = new AzureMLExecutePipelineActivityResponse();

    /**
     * Whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="continueOnStepFailure")
        private final @Nullable Object continueOnStepFailure;

    public Optional<Object> getContinueOnStepFailure() {
        return this.continueOnStepFailure == null ? Optional.empty() : Optional.ofNullable(this.continueOnStepFailure);
    }

    /**
     * Dictionary used for changing data path assignments without retraining. Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    @InputImport(name="dataPathAssignments")
        private final @Nullable Object dataPathAssignments;

    public Optional<Object> getDataPathAssignments() {
        return this.dataPathAssignments == null ? Optional.empty() : Optional.ofNullable(this.dataPathAssignments);
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
        private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Run history experiment name of the pipeline run. This information will be passed in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="experimentName")
        private final @Nullable Object experimentName;

    public Optional<Object> getExperimentName() {
        return this.experimentName == null ? Optional.empty() : Optional.ofNullable(this.experimentName);
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
        private final @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return this.linkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * The parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="mlParentRunId")
        private final @Nullable Object mlParentRunId;

    public Optional<Object> getMlParentRunId() {
        return this.mlParentRunId == null ? Optional.empty() : Optional.ofNullable(this.mlParentRunId);
    }

    /**
     * ID of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="mlPipelineEndpointId")
        private final @Nullable Object mlPipelineEndpointId;

    public Optional<Object> getMlPipelineEndpointId() {
        return this.mlPipelineEndpointId == null ? Optional.empty() : Optional.ofNullable(this.mlPipelineEndpointId);
    }

    /**
     * ID of the published Azure ML pipeline. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="mlPipelineId")
        private final @Nullable Object mlPipelineId;

    public Optional<Object> getMlPipelineId() {
        return this.mlPipelineId == null ? Optional.empty() : Optional.ofNullable(this.mlPipelineId);
    }

    /**
     * Key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     * 
     */
    @InputImport(name="mlPipelineParameters")
        private final @Nullable Object mlPipelineParameters;

    public Optional<Object> getMlPipelineParameters() {
        return this.mlPipelineParameters == null ? Optional.empty() : Optional.ofNullable(this.mlPipelineParameters);
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
        private final @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    /**
     * Type of activity.
     * Expected value is 'AzureMLExecutePipeline'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
        private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    /**
     * Version of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="version")
        private final @Nullable Object version;

    public Optional<Object> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public AzureMLExecutePipelineActivityResponse(
        @Nullable Object continueOnStepFailure,
        @Nullable Object dataPathAssignments,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Object experimentName,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Object mlParentRunId,
        @Nullable Object mlPipelineEndpointId,
        @Nullable Object mlPipelineId,
        @Nullable Object mlPipelineParameters,
        String name,
        @Nullable ActivityPolicyResponse policy,
        String type,
        @Nullable List<UserPropertyResponse> userProperties,
        @Nullable Object version) {
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

    private AzureMLExecutePipelineActivityResponse() {
        this.continueOnStepFailure = null;
        this.dataPathAssignments = null;
        this.dependsOn = List.of();
        this.description = null;
        this.experimentName = null;
        this.linkedServiceName = null;
        this.mlParentRunId = null;
        this.mlPipelineEndpointId = null;
        this.mlPipelineId = null;
        this.mlPipelineParameters = null;
        this.name = null;
        this.policy = null;
        this.type = null;
        this.userProperties = List.of();
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLExecutePipelineActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object continueOnStepFailure;
        private @Nullable Object dataPathAssignments;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object experimentName;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object mlParentRunId;
        private @Nullable Object mlPipelineEndpointId;
        private @Nullable Object mlPipelineId;
        private @Nullable Object mlPipelineParameters;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private @Nullable Object version;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLExecutePipelineActivityResponse defaults) {
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

        public Builder setContinueOnStepFailure(@Nullable Object continueOnStepFailure) {
            this.continueOnStepFailure = continueOnStepFailure;
            return this;
        }

        public Builder setDataPathAssignments(@Nullable Object dataPathAssignments) {
            this.dataPathAssignments = dataPathAssignments;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExperimentName(@Nullable Object experimentName) {
            this.experimentName = experimentName;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setMlParentRunId(@Nullable Object mlParentRunId) {
            this.mlParentRunId = mlParentRunId;
            return this;
        }

        public Builder setMlPipelineEndpointId(@Nullable Object mlPipelineEndpointId) {
            this.mlPipelineEndpointId = mlPipelineEndpointId;
            return this;
        }

        public Builder setMlPipelineId(@Nullable Object mlPipelineId) {
            this.mlPipelineId = mlPipelineId;
            return this;
        }

        public Builder setMlPipelineParameters(@Nullable Object mlPipelineParameters) {
            this.mlPipelineParameters = mlPipelineParameters;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setVersion(@Nullable Object version) {
            this.version = version;
            return this;
        }
        public AzureMLExecutePipelineActivityResponse build() {
            return new AzureMLExecutePipelineActivityResponse(continueOnStepFailure, dataPathAssignments, dependsOn, description, experimentName, linkedServiceName, mlParentRunId, mlPipelineEndpointId, mlPipelineId, mlPipelineParameters, name, policy, type, userProperties, version);
        }
    }
}
