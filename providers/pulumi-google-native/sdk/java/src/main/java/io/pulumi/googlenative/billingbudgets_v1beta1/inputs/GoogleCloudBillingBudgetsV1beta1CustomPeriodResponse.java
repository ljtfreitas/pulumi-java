// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.billingbudgets_v1beta1.inputs.GoogleTypeDateResponse;
import java.util.Objects;


public final class GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse Empty = new GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse();

    @InputImport(name="endDate", required=true)
    private final GoogleTypeDateResponse endDate;

    public GoogleTypeDateResponse getEndDate() {
        return this.endDate;
    }

    @InputImport(name="startDate", required=true)
    private final GoogleTypeDateResponse startDate;

    public GoogleTypeDateResponse getStartDate() {
        return this.startDate;
    }

    public GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse(
        GoogleTypeDateResponse endDate,
        GoogleTypeDateResponse startDate) {
        this.endDate = Objects.requireNonNull(endDate, "expected parameter 'endDate' to be non-null");
        this.startDate = Objects.requireNonNull(startDate, "expected parameter 'startDate' to be non-null");
    }

    private GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse() {
        this.endDate = null;
        this.startDate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleTypeDateResponse endDate;
        private GoogleTypeDateResponse startDate;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        public Builder setEndDate(GoogleTypeDateResponse endDate) {
            this.endDate = Objects.requireNonNull(endDate);
            return this;
        }

        public Builder setStartDate(GoogleTypeDateResponse startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }

        public GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse build() {
            return new GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse(endDate, startDate);
        }
    }
}