// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.ClusterResourceUsageExportConfigBigqueryDestinationArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterResourceUsageExportConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterResourceUsageExportConfigArgs Empty = new ClusterResourceUsageExportConfigArgs();

    /**
     * Parameters for using BigQuery as the destination of resource usage export.
     * 
     */
    @InputImport(name="bigqueryDestination", required=true)
        private final Input<ClusterResourceUsageExportConfigBigqueryDestinationArgs> bigqueryDestination;

    public Input<ClusterResourceUsageExportConfigBigqueryDestinationArgs> getBigqueryDestination() {
        return this.bigqueryDestination;
    }

    /**
     * Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created
     * in the cluster to meter network egress traffic.
     * 
     */
    @InputImport(name="enableNetworkEgressMetering")
        private final @Nullable Input<Boolean> enableNetworkEgressMetering;

    public Input<Boolean> getEnableNetworkEgressMetering() {
        return this.enableNetworkEgressMetering == null ? Input.empty() : this.enableNetworkEgressMetering;
    }

    /**
     * Whether to enable resource
     * consumption metering on this cluster. When enabled, a table will be created in
     * the resource export BigQuery dataset to store resource consumption data. The
     * resulting table can be joined with the resource usage table or with BigQuery
     * billing export. Defaults to `true`.
     * 
     */
    @InputImport(name="enableResourceConsumptionMetering")
        private final @Nullable Input<Boolean> enableResourceConsumptionMetering;

    public Input<Boolean> getEnableResourceConsumptionMetering() {
        return this.enableResourceConsumptionMetering == null ? Input.empty() : this.enableResourceConsumptionMetering;
    }

    public ClusterResourceUsageExportConfigArgs(
        Input<ClusterResourceUsageExportConfigBigqueryDestinationArgs> bigqueryDestination,
        @Nullable Input<Boolean> enableNetworkEgressMetering,
        @Nullable Input<Boolean> enableResourceConsumptionMetering) {
        this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination, "expected parameter 'bigqueryDestination' to be non-null");
        this.enableNetworkEgressMetering = enableNetworkEgressMetering;
        this.enableResourceConsumptionMetering = enableResourceConsumptionMetering;
    }

    private ClusterResourceUsageExportConfigArgs() {
        this.bigqueryDestination = Input.empty();
        this.enableNetworkEgressMetering = Input.empty();
        this.enableResourceConsumptionMetering = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterResourceUsageExportConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ClusterResourceUsageExportConfigBigqueryDestinationArgs> bigqueryDestination;
        private @Nullable Input<Boolean> enableNetworkEgressMetering;
        private @Nullable Input<Boolean> enableResourceConsumptionMetering;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterResourceUsageExportConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
    	      this.enableNetworkEgressMetering = defaults.enableNetworkEgressMetering;
    	      this.enableResourceConsumptionMetering = defaults.enableResourceConsumptionMetering;
        }

        public Builder setBigqueryDestination(Input<ClusterResourceUsageExportConfigBigqueryDestinationArgs> bigqueryDestination) {
            this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination);
            return this;
        }

        public Builder setBigqueryDestination(ClusterResourceUsageExportConfigBigqueryDestinationArgs bigqueryDestination) {
            this.bigqueryDestination = Input.of(Objects.requireNonNull(bigqueryDestination));
            return this;
        }

        public Builder setEnableNetworkEgressMetering(@Nullable Input<Boolean> enableNetworkEgressMetering) {
            this.enableNetworkEgressMetering = enableNetworkEgressMetering;
            return this;
        }

        public Builder setEnableNetworkEgressMetering(@Nullable Boolean enableNetworkEgressMetering) {
            this.enableNetworkEgressMetering = Input.ofNullable(enableNetworkEgressMetering);
            return this;
        }

        public Builder setEnableResourceConsumptionMetering(@Nullable Input<Boolean> enableResourceConsumptionMetering) {
            this.enableResourceConsumptionMetering = enableResourceConsumptionMetering;
            return this;
        }

        public Builder setEnableResourceConsumptionMetering(@Nullable Boolean enableResourceConsumptionMetering) {
            this.enableResourceConsumptionMetering = Input.ofNullable(enableResourceConsumptionMetering);
            return this;
        }
        public ClusterResourceUsageExportConfigArgs build() {
            return new ClusterResourceUsageExportConfigArgs(bigqueryDestination, enableNetworkEgressMetering, enableResourceConsumptionMetering);
        }
    }
}
