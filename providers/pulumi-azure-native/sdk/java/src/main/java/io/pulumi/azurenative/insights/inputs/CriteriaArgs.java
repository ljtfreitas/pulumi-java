// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.DimensionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the criteria for converting log to metric.
 * 
 */
public final class CriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final CriteriaArgs Empty = new CriteriaArgs();

    /**
     * List of Dimensions for creating metric
     * 
     */
    @InputImport(name="dimensions")
    private final @Nullable Input<List<DimensionArgs>> dimensions;

    public Input<List<DimensionArgs>> getDimensions() {
        return this.dimensions == null ? Input.empty() : this.dimensions;
    }

    /**
     * Name of the metric
     * 
     */
    @InputImport(name="metricName", required=true)
    private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    public CriteriaArgs(
        @Nullable Input<List<DimensionArgs>> dimensions,
        Input<String> metricName) {
        this.dimensions = dimensions;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
    }

    private CriteriaArgs() {
        this.dimensions = Input.empty();
        this.metricName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DimensionArgs>> dimensions;
        private Input<String> metricName;

        public Builder() {
    	      // Empty
        }

        public Builder(CriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
        }

        public Builder setDimensions(@Nullable Input<List<DimensionArgs>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setDimensions(@Nullable List<DimensionArgs> dimensions) {
            this.dimensions = Input.ofNullable(dimensions);
            return this;
        }

        public Builder setMetricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public CriteriaArgs build() {
            return new CriteriaArgs(dimensions, metricName);
        }
    }
}
