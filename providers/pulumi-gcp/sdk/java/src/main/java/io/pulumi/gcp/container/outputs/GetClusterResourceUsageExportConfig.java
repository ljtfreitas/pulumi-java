// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.GetClusterResourceUsageExportConfigBigqueryDestination;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetClusterResourceUsageExportConfig {
    private final List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations;
    private final Boolean enableNetworkEgressMetering;
    private final Boolean enableResourceConsumptionMetering;

    @OutputCustomType.Constructor({"bigqueryDestinations","enableNetworkEgressMetering","enableResourceConsumptionMetering"})
    private GetClusterResourceUsageExportConfig(
        List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations,
        Boolean enableNetworkEgressMetering,
        Boolean enableResourceConsumptionMetering) {
        this.bigqueryDestinations = Objects.requireNonNull(bigqueryDestinations);
        this.enableNetworkEgressMetering = Objects.requireNonNull(enableNetworkEgressMetering);
        this.enableResourceConsumptionMetering = Objects.requireNonNull(enableResourceConsumptionMetering);
    }

    public List<GetClusterResourceUsageExportConfigBigqueryDestination> getBigqueryDestinations() {
        return this.bigqueryDestinations;
    }
    public Boolean getEnableNetworkEgressMetering() {
        return this.enableNetworkEgressMetering;
    }
    public Boolean getEnableResourceConsumptionMetering() {
        return this.enableResourceConsumptionMetering;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResourceUsageExportConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations;
        private Boolean enableNetworkEgressMetering;
        private Boolean enableResourceConsumptionMetering;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResourceUsageExportConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestinations = defaults.bigqueryDestinations;
    	      this.enableNetworkEgressMetering = defaults.enableNetworkEgressMetering;
    	      this.enableResourceConsumptionMetering = defaults.enableResourceConsumptionMetering;
        }

        public Builder setBigqueryDestinations(List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations) {
            this.bigqueryDestinations = Objects.requireNonNull(bigqueryDestinations);
            return this;
        }

        public Builder setEnableNetworkEgressMetering(Boolean enableNetworkEgressMetering) {
            this.enableNetworkEgressMetering = Objects.requireNonNull(enableNetworkEgressMetering);
            return this;
        }

        public Builder setEnableResourceConsumptionMetering(Boolean enableResourceConsumptionMetering) {
            this.enableResourceConsumptionMetering = Objects.requireNonNull(enableResourceConsumptionMetering);
            return this;
        }
        public GetClusterResourceUsageExportConfig build() {
            return new GetClusterResourceUsageExportConfig(bigqueryDestinations, enableNetworkEgressMetering, enableResourceConsumptionMetering);
        }
    }
}
