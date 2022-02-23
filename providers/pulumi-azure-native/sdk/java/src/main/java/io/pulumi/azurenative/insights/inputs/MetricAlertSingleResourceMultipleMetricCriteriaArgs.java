// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.MetricCriteriaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the metric alert criteria for a single resource that has multiple metric criteria.
 * 
 */
public final class MetricAlertSingleResourceMultipleMetricCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricAlertSingleResourceMultipleMetricCriteriaArgs Empty = new MetricAlertSingleResourceMultipleMetricCriteriaArgs();

    /**
     * The list of metric criteria for this 'all of' operation.
     * 
     */
    @InputImport(name="allOf")
        private final @Nullable Input<List<MetricCriteriaArgs>> allOf;

    public Input<List<MetricCriteriaArgs>> getAllOf() {
        return this.allOf == null ? Input.empty() : this.allOf;
    }

    /**
     * specifies the type of the alert criteria.
     * Expected value is 'Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public MetricAlertSingleResourceMultipleMetricCriteriaArgs(
        @Nullable Input<List<MetricCriteriaArgs>> allOf,
        Input<String> odataType) {
        this.allOf = allOf;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private MetricAlertSingleResourceMultipleMetricCriteriaArgs() {
        this.allOf = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertSingleResourceMultipleMetricCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<MetricCriteriaArgs>> allOf;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertSingleResourceMultipleMetricCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAllOf(@Nullable Input<List<MetricCriteriaArgs>> allOf) {
            this.allOf = allOf;
            return this;
        }

        public Builder setAllOf(@Nullable List<MetricCriteriaArgs> allOf) {
            this.allOf = Input.ofNullable(allOf);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }
        public MetricAlertSingleResourceMultipleMetricCriteriaArgs build() {
            return new MetricAlertSingleResourceMultipleMetricCriteriaArgs(allOf, odataType);
        }
    }
}
