// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ReportDatasetResponse;
import io.pulumi.azurenative.costmanagement.inputs.ReportTimePeriodResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of a report.
 * 
 */
public final class ReportDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportDefinitionResponse Empty = new ReportDefinitionResponse();

    /**
     * Has definition for data in this report.
     * 
     */
    @InputImport(name="dataset")
        private final @Nullable ReportDatasetResponse dataset;

    public Optional<ReportDatasetResponse> getDataset() {
        return this.dataset == null ? Optional.empty() : Optional.ofNullable(this.dataset);
    }

    /**
     * Has time period for pulling data for the report.
     * 
     */
    @InputImport(name="timePeriod")
        private final @Nullable ReportTimePeriodResponse timePeriod;

    public Optional<ReportTimePeriodResponse> getTimePeriod() {
        return this.timePeriod == null ? Optional.empty() : Optional.ofNullable(this.timePeriod);
    }

    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    @InputImport(name="timeframe", required=true)
        private final String timeframe;

    public String getTimeframe() {
        return this.timeframe;
    }

    /**
     * The type of the report.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public ReportDefinitionResponse(
        @Nullable ReportDatasetResponse dataset,
        @Nullable ReportTimePeriodResponse timePeriod,
        String timeframe,
        String type) {
        this.dataset = dataset;
        this.timePeriod = timePeriod;
        this.timeframe = Objects.requireNonNull(timeframe, "expected parameter 'timeframe' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ReportDefinitionResponse() {
        this.dataset = null;
        this.timePeriod = null;
        this.timeframe = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ReportDatasetResponse dataset;
        private @Nullable ReportTimePeriodResponse timePeriod;
        private String timeframe;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.timePeriod = defaults.timePeriod;
    	      this.timeframe = defaults.timeframe;
    	      this.type = defaults.type;
        }

        public Builder setDataset(@Nullable ReportDatasetResponse dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder setTimePeriod(@Nullable ReportTimePeriodResponse timePeriod) {
            this.timePeriod = timePeriod;
            return this;
        }

        public Builder setTimeframe(String timeframe) {
            this.timeframe = Objects.requireNonNull(timeframe);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ReportDefinitionResponse build() {
            return new ReportDefinitionResponse(dataset, timePeriod, timeframe, type);
        }
    }
}
