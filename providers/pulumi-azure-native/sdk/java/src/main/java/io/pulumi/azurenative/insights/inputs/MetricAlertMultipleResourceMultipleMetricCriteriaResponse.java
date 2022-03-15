// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.DynamicMetricCriteriaResponse;
import io.pulumi.azurenative.insights.inputs.MetricCriteriaResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the metric alert criteria for multiple resource that has multiple metric criteria.
 * 
 */
public final class MetricAlertMultipleResourceMultipleMetricCriteriaResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetricAlertMultipleResourceMultipleMetricCriteriaResponse Empty = new MetricAlertMultipleResourceMultipleMetricCriteriaResponse();

    /**
     * the list of multiple metric criteria for this 'all of' operation.
     * 
     */
    @Import(name="allOf")
      private final @Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf;

    public List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> getAllOf() {
        return this.allOf == null ? List.of() : this.allOf;
    }

    /**
     * specifies the type of the alert criteria.
     * Expected value is 'Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public MetricAlertMultipleResourceMultipleMetricCriteriaResponse(
        @Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf,
        String odataType) {
        this.allOf = allOf;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private MetricAlertMultipleResourceMultipleMetricCriteriaResponse() {
        this.allOf = List.of();
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertMultipleResourceMultipleMetricCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertMultipleResourceMultipleMetricCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
    	      this.odataType = defaults.odataType;
        }

        public Builder allOf(@Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf) {
            this.allOf = allOf;
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public MetricAlertMultipleResourceMultipleMetricCriteriaResponse build() {
            return new MetricAlertMultipleResourceMultipleMetricCriteriaResponse(allOf, odataType);
        }
    }
}
