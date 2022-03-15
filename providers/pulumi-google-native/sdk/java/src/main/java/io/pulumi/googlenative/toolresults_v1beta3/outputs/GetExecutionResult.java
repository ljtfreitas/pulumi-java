// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.MatrixDimensionDefinitionResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.OutcomeResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.SpecificationResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.TimestampResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetExecutionResult {
    /**
     * The time when the Execution status transitioned to COMPLETE. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
     */
    private final TimestampResponse completionTime;
    /**
     * The time when the Execution was created. This value will be set automatically when CreateExecution is called. - In response: always set - In create/update request: never set
     * 
     */
    private final TimestampResponse creationTime;
    /**
     * The dimensions along which different steps in this execution may vary. This must remain fixed over the life of the execution. Returns INVALID_ARGUMENT if this field is set in an update request. Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition. Returns INVALID_ARGUMENT if the size of the list is over 100. - In response: present if set by create - In create request: optional - In update request: never set
     * 
     */
    private final List<MatrixDimensionDefinitionResponse> dimensionDefinitions;
    /**
     * A unique identifier within a History for this Execution. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create/update request: never set
     * 
     */
    private final String executionId;
    /**
     * Classify the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    private final OutcomeResponse outcome;
    /**
     * Lightweight information about execution request. - In response: present if set by create - In create: optional - In update: optional
     * 
     */
    private final SpecificationResponse specification;
    /**
     * The initial state is IN_PROGRESS. The only legal state transitions is from IN_PROGRESS to COMPLETE. A PRECONDITION_FAILED will be returned if an invalid transition is requested. The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set to COMPLETE multiple times. If the state is set to COMPLETE, all the in-progress steps within the execution will be set as COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE. - In response always set - In create/update request: optional
     * 
     */
    private final String state;
    /**
     * TestExecution Matrix ID that the TestExecutionService uses. - In response: present if set by create - In create: optional - In update: never set
     * 
     */
    private final String testExecutionMatrixId;

    @CustomType.Constructor
    private GetExecutionResult(
        @CustomType.Parameter("completionTime") TimestampResponse completionTime,
        @CustomType.Parameter("creationTime") TimestampResponse creationTime,
        @CustomType.Parameter("dimensionDefinitions") List<MatrixDimensionDefinitionResponse> dimensionDefinitions,
        @CustomType.Parameter("executionId") String executionId,
        @CustomType.Parameter("outcome") OutcomeResponse outcome,
        @CustomType.Parameter("specification") SpecificationResponse specification,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("testExecutionMatrixId") String testExecutionMatrixId) {
        this.completionTime = completionTime;
        this.creationTime = creationTime;
        this.dimensionDefinitions = dimensionDefinitions;
        this.executionId = executionId;
        this.outcome = outcome;
        this.specification = specification;
        this.state = state;
        this.testExecutionMatrixId = testExecutionMatrixId;
    }

    /**
     * The time when the Execution status transitioned to COMPLETE. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
    */
    public TimestampResponse getCompletionTime() {
        return this.completionTime;
    }
    /**
     * The time when the Execution was created. This value will be set automatically when CreateExecution is called. - In response: always set - In create/update request: never set
     * 
    */
    public TimestampResponse getCreationTime() {
        return this.creationTime;
    }
    /**
     * The dimensions along which different steps in this execution may vary. This must remain fixed over the life of the execution. Returns INVALID_ARGUMENT if this field is set in an update request. Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition. Returns INVALID_ARGUMENT if the size of the list is over 100. - In response: present if set by create - In create request: optional - In update request: never set
     * 
    */
    public List<MatrixDimensionDefinitionResponse> getDimensionDefinitions() {
        return this.dimensionDefinitions;
    }
    /**
     * A unique identifier within a History for this Execution. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create/update request: never set
     * 
    */
    public String getExecutionId() {
        return this.executionId;
    }
    /**
     * Classify the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
    */
    public OutcomeResponse getOutcome() {
        return this.outcome;
    }
    /**
     * Lightweight information about execution request. - In response: present if set by create - In create: optional - In update: optional
     * 
    */
    public SpecificationResponse getSpecification() {
        return this.specification;
    }
    /**
     * The initial state is IN_PROGRESS. The only legal state transitions is from IN_PROGRESS to COMPLETE. A PRECONDITION_FAILED will be returned if an invalid transition is requested. The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set to COMPLETE multiple times. If the state is set to COMPLETE, all the in-progress steps within the execution will be set as COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE. - In response always set - In create/update request: optional
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * TestExecution Matrix ID that the TestExecutionService uses. - In response: present if set by create - In create: optional - In update: never set
     * 
    */
    public String getTestExecutionMatrixId() {
        return this.testExecutionMatrixId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExecutionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimestampResponse completionTime;
        private TimestampResponse creationTime;
        private List<MatrixDimensionDefinitionResponse> dimensionDefinitions;
        private String executionId;
        private OutcomeResponse outcome;
        private SpecificationResponse specification;
        private String state;
        private String testExecutionMatrixId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExecutionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionTime = defaults.completionTime;
    	      this.creationTime = defaults.creationTime;
    	      this.dimensionDefinitions = defaults.dimensionDefinitions;
    	      this.executionId = defaults.executionId;
    	      this.outcome = defaults.outcome;
    	      this.specification = defaults.specification;
    	      this.state = defaults.state;
    	      this.testExecutionMatrixId = defaults.testExecutionMatrixId;
        }

        public Builder completionTime(TimestampResponse completionTime) {
            this.completionTime = Objects.requireNonNull(completionTime);
            return this;
        }

        public Builder creationTime(TimestampResponse creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder dimensionDefinitions(List<MatrixDimensionDefinitionResponse> dimensionDefinitions) {
            this.dimensionDefinitions = Objects.requireNonNull(dimensionDefinitions);
            return this;
        }

        public Builder executionId(String executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }

        public Builder outcome(OutcomeResponse outcome) {
            this.outcome = Objects.requireNonNull(outcome);
            return this;
        }

        public Builder specification(SpecificationResponse specification) {
            this.specification = Objects.requireNonNull(specification);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder testExecutionMatrixId(String testExecutionMatrixId) {
            this.testExecutionMatrixId = Objects.requireNonNull(testExecutionMatrixId);
            return this;
        }
        public GetExecutionResult build() {
            return new GetExecutionResult(completionTime, creationTime, dimensionDefinitions, executionId, outcome, specification, state, testExecutionMatrixId);
        }
    }
}
