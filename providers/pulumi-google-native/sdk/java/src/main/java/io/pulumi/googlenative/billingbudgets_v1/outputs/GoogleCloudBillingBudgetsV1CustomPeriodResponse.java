// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.billingbudgets_v1.outputs.GoogleTypeDateResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudBillingBudgetsV1CustomPeriodResponse {
    /**
     * Optional. The end date of the time period. Budgets with elapsed end date won't be processed. If unset, specifies to track all usage incurred since the start_date.
     * 
     */
    private final GoogleTypeDateResponse endDate;
    /**
     * The start date must be after January 1, 2017.
     * 
     */
    private final GoogleTypeDateResponse startDate;

    @CustomType.Constructor
    private GoogleCloudBillingBudgetsV1CustomPeriodResponse(
        @CustomType.Parameter("endDate") GoogleTypeDateResponse endDate,
        @CustomType.Parameter("startDate") GoogleTypeDateResponse startDate) {
        this.endDate = endDate;
        this.startDate = startDate;
    }

    /**
     * Optional. The end date of the time period. Budgets with elapsed end date won't be processed. If unset, specifies to track all usage incurred since the start_date.
     * 
    */
    public GoogleTypeDateResponse getEndDate() {
        return this.endDate;
    }
    /**
     * The start date must be after January 1, 2017.
     * 
    */
    public GoogleTypeDateResponse getStartDate() {
        return this.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1CustomPeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleTypeDateResponse endDate;
        private GoogleTypeDateResponse startDate;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1CustomPeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        public Builder endDate(GoogleTypeDateResponse endDate) {
            this.endDate = Objects.requireNonNull(endDate);
            return this;
        }

        public Builder startDate(GoogleTypeDateResponse startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }
        public GoogleCloudBillingBudgetsV1CustomPeriodResponse build() {
            return new GoogleCloudBillingBudgetsV1CustomPeriodResponse(endDate, startDate);
        }
    }
}
