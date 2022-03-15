// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceFromTemplateNetworkPerformanceConfig {
    private final String totalEgressBandwidthTier;

    @CustomType.Constructor
    private InstanceFromTemplateNetworkPerformanceConfig(@CustomType.Parameter("totalEgressBandwidthTier") String totalEgressBandwidthTier) {
        this.totalEgressBandwidthTier = totalEgressBandwidthTier;
    }

    public String getTotalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateNetworkPerformanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String totalEgressBandwidthTier;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateNetworkPerformanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.totalEgressBandwidthTier = defaults.totalEgressBandwidthTier;
        }

        public Builder totalEgressBandwidthTier(String totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier);
            return this;
        }
        public InstanceFromTemplateNetworkPerformanceConfig build() {
            return new InstanceFromTemplateNetworkPerformanceConfig(totalEgressBandwidthTier);
        }
    }
}
