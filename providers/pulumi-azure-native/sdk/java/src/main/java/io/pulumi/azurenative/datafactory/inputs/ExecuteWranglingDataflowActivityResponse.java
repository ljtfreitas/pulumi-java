// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.inputs.DataFlowReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.DataFlowStagingInfoResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityTypePropertiesResponseCompute;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.PowerQuerySinkMappingResponse;
import io.pulumi.azurenative.datafactory.inputs.PowerQuerySinkResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Execute power query activity.
 * 
 */
public final class ExecuteWranglingDataflowActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExecuteWranglingDataflowActivityResponse Empty = new ExecuteWranglingDataflowActivityResponse();

    /**
     * Compute properties for data flow activity.
     * 
     */
    @InputImport(name="compute")
        private final @Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute;

    public Optional<ExecuteDataFlowActivityTypePropertiesResponseCompute> getCompute() {
        return this.compute == null ? Optional.empty() : Optional.ofNullable(this.compute);
    }

    /**
     * Continue on error setting used for data flow execution. Enables processing to continue if a sink fails. Type: boolean (or Expression with resultType boolean)
     * 
     */
    @InputImport(name="continueOnError")
        private final @Nullable Object continueOnError;

    public Optional<Object> getContinueOnError() {
        return this.continueOnError == null ? Optional.empty() : Optional.ofNullable(this.continueOnError);
    }

    /**
     * Data flow reference.
     * 
     */
    @InputImport(name="dataFlow", required=true)
        private final DataFlowReferenceResponse dataFlow;

    public DataFlowReferenceResponse getDataFlow() {
        return this.dataFlow;
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
     * The integration runtime reference.
     * 
     */
    @InputImport(name="integrationRuntime")
        private final @Nullable IntegrationRuntimeReferenceResponse integrationRuntime;

    public Optional<IntegrationRuntimeReferenceResponse> getIntegrationRuntime() {
        return this.integrationRuntime == null ? Optional.empty() : Optional.ofNullable(this.integrationRuntime);
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
     * List of mapping for Power Query mashup query to sink dataset(s).
     * 
     */
    @InputImport(name="queries")
        private final @Nullable List<PowerQuerySinkMappingResponse> queries;

    public List<PowerQuerySinkMappingResponse> getQueries() {
        return this.queries == null ? List.of() : this.queries;
    }

    /**
     * Concurrent run setting used for data flow execution. Allows sinks with the same save order to be processed concurrently. Type: boolean (or Expression with resultType boolean)
     * 
     */
    @InputImport(name="runConcurrently")
        private final @Nullable Object runConcurrently;

    public Optional<Object> getRunConcurrently() {
        return this.runConcurrently == null ? Optional.empty() : Optional.ofNullable(this.runConcurrently);
    }

    /**
     * (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a queryName.
     * 
     */
    @InputImport(name="sinks")
        private final @Nullable Map<String,PowerQuerySinkResponse> sinks;

    public Map<String,PowerQuerySinkResponse> getSinks() {
        return this.sinks == null ? Map.of() : this.sinks;
    }

    /**
     * Staging info for execute data flow activity.
     * 
     */
    @InputImport(name="staging")
        private final @Nullable DataFlowStagingInfoResponse staging;

    public Optional<DataFlowStagingInfoResponse> getStaging() {
        return this.staging == null ? Optional.empty() : Optional.ofNullable(this.staging);
    }

    /**
     * Trace level setting used for data flow monitoring output. Supported values are: 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="traceLevel")
        private final @Nullable Object traceLevel;

    public Optional<Object> getTraceLevel() {
        return this.traceLevel == null ? Optional.empty() : Optional.ofNullable(this.traceLevel);
    }

    /**
     * Type of activity.
     * Expected value is 'ExecuteWranglingDataflow'.
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

    public ExecuteWranglingDataflowActivityResponse(
        @Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute,
        @Nullable Object continueOnError,
        DataFlowReferenceResponse dataFlow,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable IntegrationRuntimeReferenceResponse integrationRuntime,
        String name,
        @Nullable ActivityPolicyResponse policy,
        @Nullable List<PowerQuerySinkMappingResponse> queries,
        @Nullable Object runConcurrently,
        @Nullable Map<String,PowerQuerySinkResponse> sinks,
        @Nullable DataFlowStagingInfoResponse staging,
        @Nullable Object traceLevel,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.compute = compute;
        this.continueOnError = continueOnError;
        this.dataFlow = Objects.requireNonNull(dataFlow, "expected parameter 'dataFlow' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.integrationRuntime = integrationRuntime;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.queries = queries;
        this.runConcurrently = runConcurrently;
        this.sinks = sinks;
        this.staging = staging;
        this.traceLevel = traceLevel;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private ExecuteWranglingDataflowActivityResponse() {
        this.compute = null;
        this.continueOnError = null;
        this.dataFlow = null;
        this.dependsOn = List.of();
        this.description = null;
        this.integrationRuntime = null;
        this.name = null;
        this.policy = null;
        this.queries = List.of();
        this.runConcurrently = null;
        this.sinks = Map.of();
        this.staging = null;
        this.traceLevel = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecuteWranglingDataflowActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute;
        private @Nullable Object continueOnError;
        private DataFlowReferenceResponse dataFlow;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable IntegrationRuntimeReferenceResponse integrationRuntime;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable List<PowerQuerySinkMappingResponse> queries;
        private @Nullable Object runConcurrently;
        private @Nullable Map<String,PowerQuerySinkResponse> sinks;
        private @Nullable DataFlowStagingInfoResponse staging;
        private @Nullable Object traceLevel;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecuteWranglingDataflowActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compute = defaults.compute;
    	      this.continueOnError = defaults.continueOnError;
    	      this.dataFlow = defaults.dataFlow;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.integrationRuntime = defaults.integrationRuntime;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.queries = defaults.queries;
    	      this.runConcurrently = defaults.runConcurrently;
    	      this.sinks = defaults.sinks;
    	      this.staging = defaults.staging;
    	      this.traceLevel = defaults.traceLevel;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setCompute(@Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute) {
            this.compute = compute;
            return this;
        }

        public Builder setContinueOnError(@Nullable Object continueOnError) {
            this.continueOnError = continueOnError;
            return this;
        }

        public Builder setDataFlow(DataFlowReferenceResponse dataFlow) {
            this.dataFlow = Objects.requireNonNull(dataFlow);
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

        public Builder setIntegrationRuntime(@Nullable IntegrationRuntimeReferenceResponse integrationRuntime) {
            this.integrationRuntime = integrationRuntime;
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

        public Builder setQueries(@Nullable List<PowerQuerySinkMappingResponse> queries) {
            this.queries = queries;
            return this;
        }

        public Builder setRunConcurrently(@Nullable Object runConcurrently) {
            this.runConcurrently = runConcurrently;
            return this;
        }

        public Builder setSinks(@Nullable Map<String,PowerQuerySinkResponse> sinks) {
            this.sinks = sinks;
            return this;
        }

        public Builder setStaging(@Nullable DataFlowStagingInfoResponse staging) {
            this.staging = staging;
            return this;
        }

        public Builder setTraceLevel(@Nullable Object traceLevel) {
            this.traceLevel = traceLevel;
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
        public ExecuteWranglingDataflowActivityResponse build() {
            return new ExecuteWranglingDataflowActivityResponse(compute, continueOnError, dataFlow, dependsOn, description, integrationRuntime, name, policy, queries, runConcurrently, sinks, staging, traceLevel, type, userProperties);
        }
    }
}
