// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ExportDatasetResponse;
import io.pulumi.azurenative.costmanagement.inputs.ExportTimePeriodResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of an export.
 * 
 */
public final class ExportDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExportDefinitionResponse Empty = new ExportDefinitionResponse();

    /**
     * The definition for data in the export.
     * 
     */
    @InputImport(name="dataSet")
        private final @Nullable ExportDatasetResponse dataSet;

    public Optional<ExportDatasetResponse> getDataSet() {
        return this.dataSet == null ? Optional.empty() : Optional.ofNullable(this.dataSet);
    }

    /**
     * Has time period for pulling data for the export.
     * 
     */
    @InputImport(name="timePeriod")
        private final @Nullable ExportTimePeriodResponse timePeriod;

    public Optional<ExportTimePeriodResponse> getTimePeriod() {
        return this.timePeriod == null ? Optional.empty() : Optional.ofNullable(this.timePeriod);
    }

    /**
     * The time frame for pulling data for the export. If custom, then a specific time period must be provided.
     * 
     */
    @InputImport(name="timeframe", required=true)
        private final String timeframe;

    public String getTimeframe() {
        return this.timeframe;
    }

    /**
     * The type of the export. Note that 'Usage' is equivalent to 'ActualCost' and is applicable to exports that do not yet provide data for charges or amortization for service reservations.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public ExportDefinitionResponse(
        @Nullable ExportDatasetResponse dataSet,
        @Nullable ExportTimePeriodResponse timePeriod,
        String timeframe,
        String type) {
        this.dataSet = dataSet;
        this.timePeriod = timePeriod;
        this.timeframe = Objects.requireNonNull(timeframe, "expected parameter 'timeframe' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ExportDefinitionResponse() {
        this.dataSet = null;
        this.timePeriod = null;
        this.timeframe = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExportDatasetResponse dataSet;
        private @Nullable ExportTimePeriodResponse timePeriod;
        private String timeframe;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSet = defaults.dataSet;
    	      this.timePeriod = defaults.timePeriod;
    	      this.timeframe = defaults.timeframe;
    	      this.type = defaults.type;
        }

        public Builder setDataSet(@Nullable ExportDatasetResponse dataSet) {
            this.dataSet = dataSet;
            return this;
        }

        public Builder setTimePeriod(@Nullable ExportTimePeriodResponse timePeriod) {
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
        public ExportDefinitionResponse build() {
            return new ExportDefinitionResponse(dataSet, timePeriod, timeframe, type);
        }
    }
}
