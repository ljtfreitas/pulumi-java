// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.SubnetworkLogConfigAggregationInterval;
import io.pulumi.googlenative.compute_v1.enums.SubnetworkLogConfigMetadata;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The available logging options for this subnetwork.
 * 
 */
public final class SubnetworkLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkLogConfigArgs Empty = new SubnetworkLogConfigArgs();

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the aggregation interval for collecting flow logs. Increasing the interval time will reduce the amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds per connection.
     * 
     */
    @InputImport(name="aggregationInterval")
      private final @Nullable Input<SubnetworkLogConfigAggregationInterval> aggregationInterval;

    public Input<SubnetworkLogConfigAggregationInterval> getAggregationInterval() {
        return this.aggregationInterval == null ? Input.empty() : this.aggregationInterval;
    }

    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled.
     * 
     */
    @InputImport(name="enable")
      private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to define which VPC flow logs should be logged.
     * 
     */
    @InputImport(name="filterExpr")
      private final @Nullable Input<String> filterExpr;

    public Input<String> getFilterExpr() {
        return this.filterExpr == null ? Input.empty() : this.filterExpr;
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless otherwise specified by the org policy, which means half of all collected logs are reported.
     * 
     */
    @InputImport(name="flowSampling")
      private final @Nullable Input<Double> flowSampling;

    public Input<Double> getFlowSampling() {
        return this.flowSampling == null ? Input.empty() : this.flowSampling;
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all, none or a subset of metadata fields should be added to the reported VPC flow logs. Default is EXCLUDE_ALL_METADATA.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<SubnetworkLogConfigMetadata> metadata;

    public Input<SubnetworkLogConfigMetadata> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to CUSTOM_METADATA.
     * 
     */
    @InputImport(name="metadataFields")
      private final @Nullable Input<List<String>> metadataFields;

    public Input<List<String>> getMetadataFields() {
        return this.metadataFields == null ? Input.empty() : this.metadataFields;
    }

    public SubnetworkLogConfigArgs(
        @Nullable Input<SubnetworkLogConfigAggregationInterval> aggregationInterval,
        @Nullable Input<Boolean> enable,
        @Nullable Input<String> filterExpr,
        @Nullable Input<Double> flowSampling,
        @Nullable Input<SubnetworkLogConfigMetadata> metadata,
        @Nullable Input<List<String>> metadataFields) {
        this.aggregationInterval = aggregationInterval;
        this.enable = enable;
        this.filterExpr = filterExpr;
        this.flowSampling = flowSampling;
        this.metadata = metadata;
        this.metadataFields = metadataFields;
    }

    private SubnetworkLogConfigArgs() {
        this.aggregationInterval = Input.empty();
        this.enable = Input.empty();
        this.filterExpr = Input.empty();
        this.flowSampling = Input.empty();
        this.metadata = Input.empty();
        this.metadataFields = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubnetworkLogConfigAggregationInterval> aggregationInterval;
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<String> filterExpr;
        private @Nullable Input<Double> flowSampling;
        private @Nullable Input<SubnetworkLogConfigMetadata> metadata;
        private @Nullable Input<List<String>> metadataFields;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationInterval = defaults.aggregationInterval;
    	      this.enable = defaults.enable;
    	      this.filterExpr = defaults.filterExpr;
    	      this.flowSampling = defaults.flowSampling;
    	      this.metadata = defaults.metadata;
    	      this.metadataFields = defaults.metadataFields;
        }

        public Builder setAggregationInterval(@Nullable Input<SubnetworkLogConfigAggregationInterval> aggregationInterval) {
            this.aggregationInterval = aggregationInterval;
            return this;
        }

        public Builder setAggregationInterval(@Nullable SubnetworkLogConfigAggregationInterval aggregationInterval) {
            this.aggregationInterval = Input.ofNullable(aggregationInterval);
            return this;
        }

        public Builder setEnable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder setFilterExpr(@Nullable Input<String> filterExpr) {
            this.filterExpr = filterExpr;
            return this;
        }

        public Builder setFilterExpr(@Nullable String filterExpr) {
            this.filterExpr = Input.ofNullable(filterExpr);
            return this;
        }

        public Builder setFlowSampling(@Nullable Input<Double> flowSampling) {
            this.flowSampling = flowSampling;
            return this;
        }

        public Builder setFlowSampling(@Nullable Double flowSampling) {
            this.flowSampling = Input.ofNullable(flowSampling);
            return this;
        }

        public Builder setMetadata(@Nullable Input<SubnetworkLogConfigMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable SubnetworkLogConfigMetadata metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setMetadataFields(@Nullable Input<List<String>> metadataFields) {
            this.metadataFields = metadataFields;
            return this;
        }

        public Builder setMetadataFields(@Nullable List<String> metadataFields) {
            this.metadataFields = Input.ofNullable(metadataFields);
            return this;
        }
        public SubnetworkLogConfigArgs build() {
            return new SubnetworkLogConfigArgs(aggregationInterval, enable, filterExpr, flowSampling, metadata, metadataFields);
        }
    }
}
