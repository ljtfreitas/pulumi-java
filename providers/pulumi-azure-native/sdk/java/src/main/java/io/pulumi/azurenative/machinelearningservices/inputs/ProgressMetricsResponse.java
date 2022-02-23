// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Progress metrics for a labeling job.
 * 
 */
public final class ProgressMetricsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProgressMetricsResponse Empty = new ProgressMetricsResponse();

    /**
     * The completed datapoint count.
     * 
     */
    @InputImport(name="completedDatapointCount", required=true)
        private final Double completedDatapointCount;

    public Double getCompletedDatapointCount() {
        return this.completedDatapointCount;
    }

    /**
     * The time of last successful incremental dataset refresh in UTC.
     * 
     */
    @InputImport(name="incrementalDatasetLastRefreshTime", required=true)
        private final String incrementalDatasetLastRefreshTime;

    public String getIncrementalDatasetLastRefreshTime() {
        return this.incrementalDatasetLastRefreshTime;
    }

    /**
     * The skipped datapoint count.
     * 
     */
    @InputImport(name="skippedDatapointCount", required=true)
        private final Double skippedDatapointCount;

    public Double getSkippedDatapointCount() {
        return this.skippedDatapointCount;
    }

    /**
     * The total datapoint count.
     * 
     */
    @InputImport(name="totalDatapointCount", required=true)
        private final Double totalDatapointCount;

    public Double getTotalDatapointCount() {
        return this.totalDatapointCount;
    }

    public ProgressMetricsResponse(
        Double completedDatapointCount,
        String incrementalDatasetLastRefreshTime,
        Double skippedDatapointCount,
        Double totalDatapointCount) {
        this.completedDatapointCount = Objects.requireNonNull(completedDatapointCount, "expected parameter 'completedDatapointCount' to be non-null");
        this.incrementalDatasetLastRefreshTime = Objects.requireNonNull(incrementalDatasetLastRefreshTime, "expected parameter 'incrementalDatasetLastRefreshTime' to be non-null");
        this.skippedDatapointCount = Objects.requireNonNull(skippedDatapointCount, "expected parameter 'skippedDatapointCount' to be non-null");
        this.totalDatapointCount = Objects.requireNonNull(totalDatapointCount, "expected parameter 'totalDatapointCount' to be non-null");
    }

    private ProgressMetricsResponse() {
        this.completedDatapointCount = null;
        this.incrementalDatasetLastRefreshTime = null;
        this.skippedDatapointCount = null;
        this.totalDatapointCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProgressMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double completedDatapointCount;
        private String incrementalDatasetLastRefreshTime;
        private Double skippedDatapointCount;
        private Double totalDatapointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ProgressMetricsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completedDatapointCount = defaults.completedDatapointCount;
    	      this.incrementalDatasetLastRefreshTime = defaults.incrementalDatasetLastRefreshTime;
    	      this.skippedDatapointCount = defaults.skippedDatapointCount;
    	      this.totalDatapointCount = defaults.totalDatapointCount;
        }

        public Builder setCompletedDatapointCount(Double completedDatapointCount) {
            this.completedDatapointCount = Objects.requireNonNull(completedDatapointCount);
            return this;
        }

        public Builder setIncrementalDatasetLastRefreshTime(String incrementalDatasetLastRefreshTime) {
            this.incrementalDatasetLastRefreshTime = Objects.requireNonNull(incrementalDatasetLastRefreshTime);
            return this;
        }

        public Builder setSkippedDatapointCount(Double skippedDatapointCount) {
            this.skippedDatapointCount = Objects.requireNonNull(skippedDatapointCount);
            return this;
        }

        public Builder setTotalDatapointCount(Double totalDatapointCount) {
            this.totalDatapointCount = Objects.requireNonNull(totalDatapointCount);
            return this;
        }
        public ProgressMetricsResponse build() {
            return new ProgressMetricsResponse(completedDatapointCount, incrementalDatasetLastRefreshTime, skippedDatapointCount, totalDatapointCount);
        }
    }
}
