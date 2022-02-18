// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.WaitStatisticsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description about the errors happen while performing migration validation
 * 
 */
public final class ExecutionStatisticsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExecutionStatisticsResponse Empty = new ExecutionStatisticsResponse();

    /**
     * CPU Time in millisecond(s) for the query execution
     * 
     */
    @InputImport(name="cpuTimeMs", required=true)
    private final Double cpuTimeMs;

    public Double getCpuTimeMs() {
        return this.cpuTimeMs;
    }

    /**
     * Time taken in millisecond(s) for executing the query
     * 
     */
    @InputImport(name="elapsedTimeMs", required=true)
    private final Double elapsedTimeMs;

    public Double getElapsedTimeMs() {
        return this.elapsedTimeMs;
    }

    /**
     * No. of query executions
     * 
     */
    @InputImport(name="executionCount", required=true)
    private final Double executionCount;

    public Double getExecutionCount() {
        return this.executionCount;
    }

    /**
     * Indicates whether the query resulted in an error
     * 
     */
    @InputImport(name="hasErrors", required=true)
    private final Boolean hasErrors;

    public Boolean getHasErrors() {
        return this.hasErrors;
    }

    /**
     * List of sql Errors
     * 
     */
    @InputImport(name="sqlErrors", required=true)
    private final List<String> sqlErrors;

    public List<String> getSqlErrors() {
        return this.sqlErrors;
    }

    /**
     * Dictionary of sql query execution wait types and the respective statistics
     * 
     */
    @InputImport(name="waitStats")
    private final @Nullable Map<String,WaitStatisticsResponse> waitStats;

    public Map<String,WaitStatisticsResponse> getWaitStats() {
        return this.waitStats == null ? Map.of() : this.waitStats;
    }

    public ExecutionStatisticsResponse(
        Double cpuTimeMs,
        Double elapsedTimeMs,
        Double executionCount,
        Boolean hasErrors,
        List<String> sqlErrors,
        @Nullable Map<String,WaitStatisticsResponse> waitStats) {
        this.cpuTimeMs = Objects.requireNonNull(cpuTimeMs, "expected parameter 'cpuTimeMs' to be non-null");
        this.elapsedTimeMs = Objects.requireNonNull(elapsedTimeMs, "expected parameter 'elapsedTimeMs' to be non-null");
        this.executionCount = Objects.requireNonNull(executionCount, "expected parameter 'executionCount' to be non-null");
        this.hasErrors = Objects.requireNonNull(hasErrors, "expected parameter 'hasErrors' to be non-null");
        this.sqlErrors = Objects.requireNonNull(sqlErrors, "expected parameter 'sqlErrors' to be non-null");
        this.waitStats = waitStats;
    }

    private ExecutionStatisticsResponse() {
        this.cpuTimeMs = null;
        this.elapsedTimeMs = null;
        this.executionCount = null;
        this.hasErrors = null;
        this.sqlErrors = List.of();
        this.waitStats = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpuTimeMs;
        private Double elapsedTimeMs;
        private Double executionCount;
        private Boolean hasErrors;
        private List<String> sqlErrors;
        private @Nullable Map<String,WaitStatisticsResponse> waitStats;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuTimeMs = defaults.cpuTimeMs;
    	      this.elapsedTimeMs = defaults.elapsedTimeMs;
    	      this.executionCount = defaults.executionCount;
    	      this.hasErrors = defaults.hasErrors;
    	      this.sqlErrors = defaults.sqlErrors;
    	      this.waitStats = defaults.waitStats;
        }

        public Builder setCpuTimeMs(Double cpuTimeMs) {
            this.cpuTimeMs = Objects.requireNonNull(cpuTimeMs);
            return this;
        }

        public Builder setElapsedTimeMs(Double elapsedTimeMs) {
            this.elapsedTimeMs = Objects.requireNonNull(elapsedTimeMs);
            return this;
        }

        public Builder setExecutionCount(Double executionCount) {
            this.executionCount = Objects.requireNonNull(executionCount);
            return this;
        }

        public Builder setHasErrors(Boolean hasErrors) {
            this.hasErrors = Objects.requireNonNull(hasErrors);
            return this;
        }

        public Builder setSqlErrors(List<String> sqlErrors) {
            this.sqlErrors = Objects.requireNonNull(sqlErrors);
            return this;
        }

        public Builder setWaitStats(@Nullable Map<String,WaitStatisticsResponse> waitStats) {
            this.waitStats = waitStats;
            return this;
        }

        public ExecutionStatisticsResponse build() {
            return new ExecutionStatisticsResponse(cpuTimeMs, elapsedTimeMs, executionCount, hasErrors, sqlErrors, waitStats);
        }
    }
}
