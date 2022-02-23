// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.jobs_v4.inputs.CompensationRangeResponse;
import io.pulumi.googlenative.jobs_v4.inputs.MoneyResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * A compensation entry that represents one component of compensation, such as base pay, bonus, or other compensation type. Annualization: One compensation entry can be annualized if - it contains valid amount or range. - and its expected_units_per_year is set or can be derived. Its annualized range is determined as (amount or range) times expected_units_per_year.
 * 
 */
public final class CompensationEntryResponse extends io.pulumi.resources.InvokeArgs {

    public static final CompensationEntryResponse Empty = new CompensationEntryResponse();

    /**
     * Compensation amount.
     * 
     */
    @InputImport(name="amount", required=true)
      private final MoneyResponse amount;

    public MoneyResponse getAmount() {
        return this.amount;
    }

    /**
     * Compensation description. For example, could indicate equity terms or provide additional context to an estimated bonus.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Expected number of units paid each year. If not specified, when Job.employment_types is FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY: 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
     * 
     */
    @InputImport(name="expectedUnitsPerYear", required=true)
      private final Double expectedUnitsPerYear;

    public Double getExpectedUnitsPerYear() {
        return this.expectedUnitsPerYear;
    }

    /**
     * Compensation range.
     * 
     */
    @InputImport(name="range", required=true)
      private final CompensationRangeResponse range;

    public CompensationRangeResponse getRange() {
        return this.range;
    }

    /**
     * Compensation type. Default is CompensationType.COMPENSATION_TYPE_UNSPECIFIED.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Frequency of the specified amount. Default is CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED.
     * 
     */
    @InputImport(name="unit", required=true)
      private final String unit;

    public String getUnit() {
        return this.unit;
    }

    public CompensationEntryResponse(
        MoneyResponse amount,
        String description,
        Double expectedUnitsPerYear,
        CompensationRangeResponse range,
        String type,
        String unit) {
        this.amount = Objects.requireNonNull(amount, "expected parameter 'amount' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.expectedUnitsPerYear = Objects.requireNonNull(expectedUnitsPerYear, "expected parameter 'expectedUnitsPerYear' to be non-null");
        this.range = Objects.requireNonNull(range, "expected parameter 'range' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.unit = Objects.requireNonNull(unit, "expected parameter 'unit' to be non-null");
    }

    private CompensationEntryResponse() {
        this.amount = null;
        this.description = null;
        this.expectedUnitsPerYear = null;
        this.range = null;
        this.type = null;
        this.unit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompensationEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoneyResponse amount;
        private String description;
        private Double expectedUnitsPerYear;
        private CompensationRangeResponse range;
        private String type;
        private String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(CompensationEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.description = defaults.description;
    	      this.expectedUnitsPerYear = defaults.expectedUnitsPerYear;
    	      this.range = defaults.range;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
        }

        public Builder setAmount(MoneyResponse amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setExpectedUnitsPerYear(Double expectedUnitsPerYear) {
            this.expectedUnitsPerYear = Objects.requireNonNull(expectedUnitsPerYear);
            return this;
        }

        public Builder setRange(CompensationRangeResponse range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public CompensationEntryResponse build() {
            return new CompensationEntryResponse(amount, description, expectedUnitsPerYear, range, type, unit);
        }
    }
}
