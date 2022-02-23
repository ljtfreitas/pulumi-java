// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class NetworkPerformanceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkPerformanceConfigResponse Empty = new NetworkPerformanceConfigResponse();

    @InputImport(name="externalIpEgressBandwidthTier", required=true)
      private final String externalIpEgressBandwidthTier;

    public String getExternalIpEgressBandwidthTier() {
        return this.externalIpEgressBandwidthTier;
    }

    @InputImport(name="totalEgressBandwidthTier", required=true)
      private final String totalEgressBandwidthTier;

    public String getTotalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    public NetworkPerformanceConfigResponse(
        String externalIpEgressBandwidthTier,
        String totalEgressBandwidthTier) {
        this.externalIpEgressBandwidthTier = Objects.requireNonNull(externalIpEgressBandwidthTier, "expected parameter 'externalIpEgressBandwidthTier' to be non-null");
        this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier, "expected parameter 'totalEgressBandwidthTier' to be non-null");
    }

    private NetworkPerformanceConfigResponse() {
        this.externalIpEgressBandwidthTier = null;
        this.totalEgressBandwidthTier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPerformanceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalIpEgressBandwidthTier;
        private String totalEgressBandwidthTier;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPerformanceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpEgressBandwidthTier = defaults.externalIpEgressBandwidthTier;
    	      this.totalEgressBandwidthTier = defaults.totalEgressBandwidthTier;
        }

        public Builder setExternalIpEgressBandwidthTier(String externalIpEgressBandwidthTier) {
            this.externalIpEgressBandwidthTier = Objects.requireNonNull(externalIpEgressBandwidthTier);
            return this;
        }

        public Builder setTotalEgressBandwidthTier(String totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier);
            return this;
        }
        public NetworkPerformanceConfigResponse build() {
            return new NetworkPerformanceConfigResponse(externalIpEgressBandwidthTier, totalEgressBandwidthTier);
        }
    }
}
