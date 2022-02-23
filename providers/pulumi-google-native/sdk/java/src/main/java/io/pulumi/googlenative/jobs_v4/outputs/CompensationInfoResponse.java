// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.jobs_v4.outputs.CompensationEntryResponse;
import io.pulumi.googlenative.jobs_v4.outputs.CompensationRangeResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CompensationInfoResponse {
    /**
     * Annualized base compensation range. Computed as base compensation entry's CompensationEntry.amount times CompensationEntry.expected_units_per_year. See CompensationEntry for explanation on compensation annualization.
     * 
     */
    private final CompensationRangeResponse annualizedBaseCompensationRange;
    /**
     * Annualized total compensation range. Computed as all compensation entries' CompensationEntry.amount times CompensationEntry.expected_units_per_year. See CompensationEntry for explanation on compensation annualization.
     * 
     */
    private final CompensationRangeResponse annualizedTotalCompensationRange;
    /**
     * Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as **base compensation entry** for the job.
     * 
     */
    private final List<CompensationEntryResponse> entries;

    @OutputCustomType.Constructor({"annualizedBaseCompensationRange","annualizedTotalCompensationRange","entries"})
    private CompensationInfoResponse(
        CompensationRangeResponse annualizedBaseCompensationRange,
        CompensationRangeResponse annualizedTotalCompensationRange,
        List<CompensationEntryResponse> entries) {
        this.annualizedBaseCompensationRange = Objects.requireNonNull(annualizedBaseCompensationRange);
        this.annualizedTotalCompensationRange = Objects.requireNonNull(annualizedTotalCompensationRange);
        this.entries = Objects.requireNonNull(entries);
    }

    /**
     * Annualized base compensation range. Computed as base compensation entry's CompensationEntry.amount times CompensationEntry.expected_units_per_year. See CompensationEntry for explanation on compensation annualization.
     * 
     */
    public CompensationRangeResponse getAnnualizedBaseCompensationRange() {
        return this.annualizedBaseCompensationRange;
    }
    /**
     * Annualized total compensation range. Computed as all compensation entries' CompensationEntry.amount times CompensationEntry.expected_units_per_year. See CompensationEntry for explanation on compensation annualization.
     * 
     */
    public CompensationRangeResponse getAnnualizedTotalCompensationRange() {
        return this.annualizedTotalCompensationRange;
    }
    /**
     * Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as **base compensation entry** for the job.
     * 
     */
    public List<CompensationEntryResponse> getEntries() {
        return this.entries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompensationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompensationRangeResponse annualizedBaseCompensationRange;
        private CompensationRangeResponse annualizedTotalCompensationRange;
        private List<CompensationEntryResponse> entries;

        public Builder() {
    	      // Empty
        }

        public Builder(CompensationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annualizedBaseCompensationRange = defaults.annualizedBaseCompensationRange;
    	      this.annualizedTotalCompensationRange = defaults.annualizedTotalCompensationRange;
    	      this.entries = defaults.entries;
        }

        public Builder setAnnualizedBaseCompensationRange(CompensationRangeResponse annualizedBaseCompensationRange) {
            this.annualizedBaseCompensationRange = Objects.requireNonNull(annualizedBaseCompensationRange);
            return this;
        }

        public Builder setAnnualizedTotalCompensationRange(CompensationRangeResponse annualizedTotalCompensationRange) {
            this.annualizedTotalCompensationRange = Objects.requireNonNull(annualizedTotalCompensationRange);
            return this;
        }

        public Builder setEntries(List<CompensationEntryResponse> entries) {
            this.entries = Objects.requireNonNull(entries);
            return this;
        }
        public CompensationInfoResponse build() {
            return new CompensationInfoResponse(annualizedBaseCompensationRange, annualizedTotalCompensationRange, entries);
        }
    }
}
