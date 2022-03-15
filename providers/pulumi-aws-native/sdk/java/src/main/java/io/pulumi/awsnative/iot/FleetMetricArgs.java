// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.inputs.FleetMetricAggregationTypeArgs;
import io.pulumi.awsnative.iot.inputs.FleetMetricTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetMetricArgs Empty = new FleetMetricArgs();

    /**
     * The aggregation field to perform aggregation and metric emission
     * 
     */
    @Import(name="aggregationField")
      private final @Nullable Output<String> aggregationField;

    public Output<String> getAggregationField() {
        return this.aggregationField == null ? Output.empty() : this.aggregationField;
    }

    @Import(name="aggregationType")
      private final @Nullable Output<FleetMetricAggregationTypeArgs> aggregationType;

    public Output<FleetMetricAggregationTypeArgs> getAggregationType() {
        return this.aggregationType == null ? Output.empty() : this.aggregationType;
    }

    /**
     * The description of a fleet metric
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The index name of a fleet metric
     * 
     */
    @Import(name="indexName")
      private final @Nullable Output<String> indexName;

    public Output<String> getIndexName() {
        return this.indexName == null ? Output.empty() : this.indexName;
    }

    /**
     * The name of the fleet metric
     * 
     */
    @Import(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName;
    }

    /**
     * The period of metric emission in seconds
     * 
     */
    @Import(name="period")
      private final @Nullable Output<Integer> period;

    public Output<Integer> getPeriod() {
        return this.period == null ? Output.empty() : this.period;
    }

    /**
     * The Fleet Indexing query used by a fleet metric
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<String> queryString;

    public Output<String> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * The version of a Fleet Indexing query used by a fleet metric
     * 
     */
    @Import(name="queryVersion")
      private final @Nullable Output<String> queryVersion;

    public Output<String> getQueryVersion() {
        return this.queryVersion == null ? Output.empty() : this.queryVersion;
    }

    /**
     * An array of key-value pairs to apply to this resource
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<FleetMetricTagArgs>> tags;

    public Output<List<FleetMetricTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The unit of data points emitted by a fleet metric
     * 
     */
    @Import(name="unit")
      private final @Nullable Output<String> unit;

    public Output<String> getUnit() {
        return this.unit == null ? Output.empty() : this.unit;
    }

    public FleetMetricArgs(
        @Nullable Output<String> aggregationField,
        @Nullable Output<FleetMetricAggregationTypeArgs> aggregationType,
        @Nullable Output<String> description,
        @Nullable Output<String> indexName,
        Output<String> metricName,
        @Nullable Output<Integer> period,
        @Nullable Output<String> queryString,
        @Nullable Output<String> queryVersion,
        @Nullable Output<List<FleetMetricTagArgs>> tags,
        @Nullable Output<String> unit) {
        this.aggregationField = aggregationField;
        this.aggregationType = aggregationType;
        this.description = description;
        this.indexName = indexName;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.period = period;
        this.queryString = queryString;
        this.queryVersion = queryVersion;
        this.tags = tags;
        this.unit = unit;
    }

    private FleetMetricArgs() {
        this.aggregationField = Output.empty();
        this.aggregationType = Output.empty();
        this.description = Output.empty();
        this.indexName = Output.empty();
        this.metricName = Output.empty();
        this.period = Output.empty();
        this.queryString = Output.empty();
        this.queryVersion = Output.empty();
        this.tags = Output.empty();
        this.unit = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> aggregationField;
        private @Nullable Output<FleetMetricAggregationTypeArgs> aggregationType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> indexName;
        private Output<String> metricName;
        private @Nullable Output<Integer> period;
        private @Nullable Output<String> queryString;
        private @Nullable Output<String> queryVersion;
        private @Nullable Output<List<FleetMetricTagArgs>> tags;
        private @Nullable Output<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationField = defaults.aggregationField;
    	      this.aggregationType = defaults.aggregationType;
    	      this.description = defaults.description;
    	      this.indexName = defaults.indexName;
    	      this.metricName = defaults.metricName;
    	      this.period = defaults.period;
    	      this.queryString = defaults.queryString;
    	      this.queryVersion = defaults.queryVersion;
    	      this.tags = defaults.tags;
    	      this.unit = defaults.unit;
        }

        public Builder aggregationField(@Nullable Output<String> aggregationField) {
            this.aggregationField = aggregationField;
            return this;
        }

        public Builder aggregationField(@Nullable String aggregationField) {
            this.aggregationField = Output.ofNullable(aggregationField);
            return this;
        }

        public Builder aggregationType(@Nullable Output<FleetMetricAggregationTypeArgs> aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }

        public Builder aggregationType(@Nullable FleetMetricAggregationTypeArgs aggregationType) {
            this.aggregationType = Output.ofNullable(aggregationType);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder indexName(@Nullable Output<String> indexName) {
            this.indexName = indexName;
            return this;
        }

        public Builder indexName(@Nullable String indexName) {
            this.indexName = Output.ofNullable(indexName);
            return this;
        }

        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder period(@Nullable Output<Integer> period) {
            this.period = period;
            return this;
        }

        public Builder period(@Nullable Integer period) {
            this.period = Output.ofNullable(period);
            return this;
        }

        public Builder queryString(@Nullable Output<String> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable String queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }

        public Builder queryVersion(@Nullable Output<String> queryVersion) {
            this.queryVersion = queryVersion;
            return this;
        }

        public Builder queryVersion(@Nullable String queryVersion) {
            this.queryVersion = Output.ofNullable(queryVersion);
            return this;
        }

        public Builder tags(@Nullable Output<List<FleetMetricTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<FleetMetricTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder unit(@Nullable Output<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder unit(@Nullable String unit) {
            this.unit = Output.ofNullable(unit);
            return this;
        }
        public FleetMetricArgs build() {
            return new FleetMetricArgs(aggregationField, aggregationType, description, indexName, metricName, period, queryString, queryVersion, tags, unit);
        }
    }
}
