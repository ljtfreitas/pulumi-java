// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceNetworkPerformanceConfig {
    /**
     * The egress bandwidth tier to enable.
     * Possible values: TIER_1, DEFAULT
     * 
     */
    private final String totalEgressBandwidthTier;

    @OutputCustomType.Constructor({"totalEgressBandwidthTier"})
    private InstanceNetworkPerformanceConfig(String totalEgressBandwidthTier) {
        this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier);
    }

    /**
     * The egress bandwidth tier to enable.
     * Possible values: TIER_1, DEFAULT
     * 
     */
    public String getTotalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkPerformanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String totalEgressBandwidthTier;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkPerformanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.totalEgressBandwidthTier = defaults.totalEgressBandwidthTier;
        }

        public Builder setTotalEgressBandwidthTier(String totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier);
            return this;
        }
        public InstanceNetworkPerformanceConfig build() {
            return new InstanceNetworkPerformanceConfig(totalEgressBandwidthTier);
        }
    }
}
