// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.testing_v1.inputs.EnvironmentResponse;
import io.pulumi.googlenative.testing_v1.inputs.ShardResponse;
import io.pulumi.googlenative.testing_v1.inputs.TestDetailsResponse;
import io.pulumi.googlenative.testing_v1.inputs.TestSpecificationResponse;
import io.pulumi.googlenative.testing_v1.inputs.ToolResultsStepResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A single test executed in a single environment.
 * 
 */
public final class TestExecutionResponse extends io.pulumi.resources.InvokeArgs {

    public static final TestExecutionResponse Empty = new TestExecutionResponse();

    /**
     * How the host machine(s) are configured.
     * 
     */
    @Import(name="environment", required=true)
      private final EnvironmentResponse environment;

    public EnvironmentResponse getEnvironment() {
        return this.environment;
    }

    /**
     * Id of the containing TestMatrix.
     * 
     */
    @Import(name="matrixId", required=true)
      private final String matrixId;

    public String getMatrixId() {
        return this.matrixId;
    }

    /**
     * The cloud project that owns the test execution.
     * 
     */
    @Import(name="project", required=true)
      private final String project;

    public String getProject() {
        return this.project;
    }

    /**
     * Details about the shard.
     * 
     */
    @Import(name="shard", required=true)
      private final ShardResponse shard;

    public ShardResponse getShard() {
        return this.shard;
    }

    /**
     * Indicates the current progress of the test execution (e.g., FINISHED).
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Additional details about the running test.
     * 
     */
    @Import(name="testDetails", required=true)
      private final TestDetailsResponse testDetails;

    public TestDetailsResponse getTestDetails() {
        return this.testDetails;
    }

    /**
     * How to run the test.
     * 
     */
    @Import(name="testSpecification", required=true)
      private final TestSpecificationResponse testSpecification;

    public TestSpecificationResponse getTestSpecification() {
        return this.testSpecification;
    }

    /**
     * The time this test execution was initially created.
     * 
     */
    @Import(name="timestamp", required=true)
      private final String timestamp;

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * Where the results for this execution are written.
     * 
     */
    @Import(name="toolResultsStep", required=true)
      private final ToolResultsStepResponse toolResultsStep;

    public ToolResultsStepResponse getToolResultsStep() {
        return this.toolResultsStep;
    }

    public TestExecutionResponse(
        EnvironmentResponse environment,
        String matrixId,
        String project,
        ShardResponse shard,
        String state,
        TestDetailsResponse testDetails,
        TestSpecificationResponse testSpecification,
        String timestamp,
        ToolResultsStepResponse toolResultsStep) {
        this.environment = Objects.requireNonNull(environment, "expected parameter 'environment' to be non-null");
        this.matrixId = Objects.requireNonNull(matrixId, "expected parameter 'matrixId' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.shard = Objects.requireNonNull(shard, "expected parameter 'shard' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.testDetails = Objects.requireNonNull(testDetails, "expected parameter 'testDetails' to be non-null");
        this.testSpecification = Objects.requireNonNull(testSpecification, "expected parameter 'testSpecification' to be non-null");
        this.timestamp = Objects.requireNonNull(timestamp, "expected parameter 'timestamp' to be non-null");
        this.toolResultsStep = Objects.requireNonNull(toolResultsStep, "expected parameter 'toolResultsStep' to be non-null");
    }

    private TestExecutionResponse() {
        this.environment = null;
        this.matrixId = null;
        this.project = null;
        this.shard = null;
        this.state = null;
        this.testDetails = null;
        this.testSpecification = null;
        this.timestamp = null;
        this.toolResultsStep = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestExecutionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentResponse environment;
        private String matrixId;
        private String project;
        private ShardResponse shard;
        private String state;
        private TestDetailsResponse testDetails;
        private TestSpecificationResponse testSpecification;
        private String timestamp;
        private ToolResultsStepResponse toolResultsStep;

        public Builder() {
    	      // Empty
        }

        public Builder(TestExecutionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
    	      this.matrixId = defaults.matrixId;
    	      this.project = defaults.project;
    	      this.shard = defaults.shard;
    	      this.state = defaults.state;
    	      this.testDetails = defaults.testDetails;
    	      this.testSpecification = defaults.testSpecification;
    	      this.timestamp = defaults.timestamp;
    	      this.toolResultsStep = defaults.toolResultsStep;
        }

        public Builder environment(EnvironmentResponse environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder matrixId(String matrixId) {
            this.matrixId = Objects.requireNonNull(matrixId);
            return this;
        }

        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder shard(ShardResponse shard) {
            this.shard = Objects.requireNonNull(shard);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder testDetails(TestDetailsResponse testDetails) {
            this.testDetails = Objects.requireNonNull(testDetails);
            return this;
        }

        public Builder testSpecification(TestSpecificationResponse testSpecification) {
            this.testSpecification = Objects.requireNonNull(testSpecification);
            return this;
        }

        public Builder timestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }

        public Builder toolResultsStep(ToolResultsStepResponse toolResultsStep) {
            this.toolResultsStep = Objects.requireNonNull(toolResultsStep);
            return this;
        }
        public TestExecutionResponse build() {
            return new TestExecutionResponse(environment, matrixId, project, shard, state, testDetails, testSpecification, timestamp, toolResultsStep);
        }
    }
}
