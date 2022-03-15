// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkLogConfigArgs Empty = new SubnetworkLogConfigArgs();

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled.
     * Toggles the aggregation interval for collecting flow logs. Increasing the
     * interval time will reduce the amount of generated flow logs for long
     * lasting connections. Default is an interval of 5 seconds per connection.
     * Default value is `INTERVAL_5_SEC`.
     * Possible values are `INTERVAL_5_SEC`, `INTERVAL_30_SEC`, `INTERVAL_1_MIN`, `INTERVAL_5_MIN`, `INTERVAL_10_MIN`, and `INTERVAL_15_MIN`.
     * 
     */
    @Import(name="aggregationInterval")
      private final @Nullable Output<String> aggregationInterval;

    public Output<String> getAggregationInterval() {
        return this.aggregationInterval == null ? Output.empty() : this.aggregationInterval;
    }

    /**
     * Export filter used to define which VPC flow logs should be logged, as as CEL expression. See
     * https://cloud.google.com/vpc/docs/flow-logs#filtering for details on how to format this field.
     * The default value is 'true', which evaluates to include everything.
     * 
     */
    @Import(name="filterExpr")
      private final @Nullable Output<String> filterExpr;

    public Output<String> getFilterExpr() {
        return this.filterExpr == null ? Output.empty() : this.filterExpr;
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled.
     * The value of the field must be in [0, 1]. Set the sampling rate of VPC
     * flow logs within the subnetwork where 1.0 means all collected logs are
     * reported and 0.0 means no logs are reported. Default is 0.5 which means
     * half of all collected logs are reported.
     * 
     */
    @Import(name="flowSampling")
      private final @Nullable Output<Double> flowSampling;

    public Output<Double> getFlowSampling() {
        return this.flowSampling == null ? Output.empty() : this.flowSampling;
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled.
     * Configures whether metadata fields should be added to the reported VPC
     * flow logs.
     * Default value is `INCLUDE_ALL_METADATA`.
     * Possible values are `EXCLUDE_ALL_METADATA`, `INCLUDE_ALL_METADATA`, and `CUSTOM_METADATA`.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<String> metadata;

    public Output<String> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * List of metadata fields that should be added to reported logs.
     * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" is set to CUSTOM_METADATA.
     * 
     */
    @Import(name="metadataFields")
      private final @Nullable Output<List<String>> metadataFields;

    public Output<List<String>> getMetadataFields() {
        return this.metadataFields == null ? Output.empty() : this.metadataFields;
    }

    public SubnetworkLogConfigArgs(
        @Nullable Output<String> aggregationInterval,
        @Nullable Output<String> filterExpr,
        @Nullable Output<Double> flowSampling,
        @Nullable Output<String> metadata,
        @Nullable Output<List<String>> metadataFields) {
        this.aggregationInterval = aggregationInterval;
        this.filterExpr = filterExpr;
        this.flowSampling = flowSampling;
        this.metadata = metadata;
        this.metadataFields = metadataFields;
    }

    private SubnetworkLogConfigArgs() {
        this.aggregationInterval = Output.empty();
        this.filterExpr = Output.empty();
        this.flowSampling = Output.empty();
        this.metadata = Output.empty();
        this.metadataFields = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> aggregationInterval;
        private @Nullable Output<String> filterExpr;
        private @Nullable Output<Double> flowSampling;
        private @Nullable Output<String> metadata;
        private @Nullable Output<List<String>> metadataFields;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationInterval = defaults.aggregationInterval;
    	      this.filterExpr = defaults.filterExpr;
    	      this.flowSampling = defaults.flowSampling;
    	      this.metadata = defaults.metadata;
    	      this.metadataFields = defaults.metadataFields;
        }

        public Builder aggregationInterval(@Nullable Output<String> aggregationInterval) {
            this.aggregationInterval = aggregationInterval;
            return this;
        }

        public Builder aggregationInterval(@Nullable String aggregationInterval) {
            this.aggregationInterval = Output.ofNullable(aggregationInterval);
            return this;
        }

        public Builder filterExpr(@Nullable Output<String> filterExpr) {
            this.filterExpr = filterExpr;
            return this;
        }

        public Builder filterExpr(@Nullable String filterExpr) {
            this.filterExpr = Output.ofNullable(filterExpr);
            return this;
        }

        public Builder flowSampling(@Nullable Output<Double> flowSampling) {
            this.flowSampling = flowSampling;
            return this;
        }

        public Builder flowSampling(@Nullable Double flowSampling) {
            this.flowSampling = Output.ofNullable(flowSampling);
            return this;
        }

        public Builder metadata(@Nullable Output<String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable String metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }

        public Builder metadataFields(@Nullable Output<List<String>> metadataFields) {
            this.metadataFields = metadataFields;
            return this;
        }

        public Builder metadataFields(@Nullable List<String> metadataFields) {
            this.metadataFields = Output.ofNullable(metadataFields);
            return this;
        }
        public SubnetworkLogConfigArgs build() {
            return new SubnetworkLogConfigArgs(aggregationInterval, filterExpr, flowSampling, metadata, metadataFields);
        }
    }
}
