// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information of estimated or observed impact on various metrics for an Azure SQL Database, Server or Elastic Pool Recommended Action.
 * 
 */
public final class RecommendedActionImpactRecordResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecommendedActionImpactRecordResponse Empty = new RecommendedActionImpactRecordResponse();

    /**
     * Gets the absolute value of this dimension if applicable. e.g., Number of Queries affected
     * 
     */
    @InputImport(name="absoluteValue", required=true)
        private final Double absoluteValue;

    public Double getAbsoluteValue() {
        return this.absoluteValue;
    }

    /**
     * Gets the absolute change in the value of this dimension. e.g., Absolute Disk space change in Megabytes
     * 
     */
    @InputImport(name="changeValueAbsolute", required=true)
        private final Double changeValueAbsolute;

    public Double getChangeValueAbsolute() {
        return this.changeValueAbsolute;
    }

    /**
     * Gets the relative change in the value of this dimension. e.g., Relative Disk space change in Percentage
     * 
     */
    @InputImport(name="changeValueRelative", required=true)
        private final Double changeValueRelative;

    public Double getChangeValueRelative() {
        return this.changeValueRelative;
    }

    /**
     * Gets the name of the impact dimension. e.g., CPUChange, DiskSpaceChange, NumberOfQueriesAffected.
     * 
     */
    @InputImport(name="dimensionName", required=true)
        private final String dimensionName;

    public String getDimensionName() {
        return this.dimensionName;
    }

    /**
     * Gets the name of the impact dimension. e.g., CPUChange, DiskSpaceChange, NumberOfQueriesAffected.
     * 
     */
    @InputImport(name="unit", required=true)
        private final String unit;

    public String getUnit() {
        return this.unit;
    }

    public RecommendedActionImpactRecordResponse(
        Double absoluteValue,
        Double changeValueAbsolute,
        Double changeValueRelative,
        String dimensionName,
        String unit) {
        this.absoluteValue = Objects.requireNonNull(absoluteValue, "expected parameter 'absoluteValue' to be non-null");
        this.changeValueAbsolute = Objects.requireNonNull(changeValueAbsolute, "expected parameter 'changeValueAbsolute' to be non-null");
        this.changeValueRelative = Objects.requireNonNull(changeValueRelative, "expected parameter 'changeValueRelative' to be non-null");
        this.dimensionName = Objects.requireNonNull(dimensionName, "expected parameter 'dimensionName' to be non-null");
        this.unit = Objects.requireNonNull(unit, "expected parameter 'unit' to be non-null");
    }

    private RecommendedActionImpactRecordResponse() {
        this.absoluteValue = null;
        this.changeValueAbsolute = null;
        this.changeValueRelative = null;
        this.dimensionName = null;
        this.unit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendedActionImpactRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double absoluteValue;
        private Double changeValueAbsolute;
        private Double changeValueRelative;
        private String dimensionName;
        private String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendedActionImpactRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.absoluteValue = defaults.absoluteValue;
    	      this.changeValueAbsolute = defaults.changeValueAbsolute;
    	      this.changeValueRelative = defaults.changeValueRelative;
    	      this.dimensionName = defaults.dimensionName;
    	      this.unit = defaults.unit;
        }

        public Builder setAbsoluteValue(Double absoluteValue) {
            this.absoluteValue = Objects.requireNonNull(absoluteValue);
            return this;
        }

        public Builder setChangeValueAbsolute(Double changeValueAbsolute) {
            this.changeValueAbsolute = Objects.requireNonNull(changeValueAbsolute);
            return this;
        }

        public Builder setChangeValueRelative(Double changeValueRelative) {
            this.changeValueRelative = Objects.requireNonNull(changeValueRelative);
            return this;
        }

        public Builder setDimensionName(String dimensionName) {
            this.dimensionName = Objects.requireNonNull(dimensionName);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public RecommendedActionImpactRecordResponse build() {
            return new RecommendedActionImpactRecordResponse(absoluteValue, changeValueAbsolute, changeValueRelative, dimensionName, unit);
        }
    }
}
