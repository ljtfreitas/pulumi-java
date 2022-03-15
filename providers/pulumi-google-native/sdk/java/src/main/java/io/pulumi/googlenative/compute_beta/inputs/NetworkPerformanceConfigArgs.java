// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.enums.NetworkPerformanceConfigTotalEgressBandwidthTier;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkPerformanceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPerformanceConfigArgs Empty = new NetworkPerformanceConfigArgs();

    @Import(name="totalEgressBandwidthTier")
      private final @Nullable Output<NetworkPerformanceConfigTotalEgressBandwidthTier> totalEgressBandwidthTier;

    public Output<NetworkPerformanceConfigTotalEgressBandwidthTier> getTotalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier == null ? Output.empty() : this.totalEgressBandwidthTier;
    }

    public NetworkPerformanceConfigArgs(@Nullable Output<NetworkPerformanceConfigTotalEgressBandwidthTier> totalEgressBandwidthTier) {
        this.totalEgressBandwidthTier = totalEgressBandwidthTier;
    }

    private NetworkPerformanceConfigArgs() {
        this.totalEgressBandwidthTier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPerformanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NetworkPerformanceConfigTotalEgressBandwidthTier> totalEgressBandwidthTier;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPerformanceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.totalEgressBandwidthTier = defaults.totalEgressBandwidthTier;
        }

        public Builder totalEgressBandwidthTier(@Nullable Output<NetworkPerformanceConfigTotalEgressBandwidthTier> totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = totalEgressBandwidthTier;
            return this;
        }

        public Builder totalEgressBandwidthTier(@Nullable NetworkPerformanceConfigTotalEgressBandwidthTier totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Output.ofNullable(totalEgressBandwidthTier);
            return this;
        }
        public NetworkPerformanceConfigArgs build() {
            return new NetworkPerformanceConfigArgs(totalEgressBandwidthTier);
        }
    }
}
