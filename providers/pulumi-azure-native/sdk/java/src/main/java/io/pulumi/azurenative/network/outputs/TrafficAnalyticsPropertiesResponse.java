// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.TrafficAnalyticsConfigurationPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TrafficAnalyticsPropertiesResponse {
    /**
     * Parameters that define the configuration of traffic analytics.
     * 
     */
    private final @Nullable TrafficAnalyticsConfigurationPropertiesResponse networkWatcherFlowAnalyticsConfiguration;

    @OutputCustomType.Constructor({"networkWatcherFlowAnalyticsConfiguration"})
    private TrafficAnalyticsPropertiesResponse(@Nullable TrafficAnalyticsConfigurationPropertiesResponse networkWatcherFlowAnalyticsConfiguration) {
        this.networkWatcherFlowAnalyticsConfiguration = networkWatcherFlowAnalyticsConfiguration;
    }

    /**
     * Parameters that define the configuration of traffic analytics.
     * 
     */
    public Optional<TrafficAnalyticsConfigurationPropertiesResponse> getNetworkWatcherFlowAnalyticsConfiguration() {
        return Optional.ofNullable(this.networkWatcherFlowAnalyticsConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficAnalyticsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TrafficAnalyticsConfigurationPropertiesResponse networkWatcherFlowAnalyticsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficAnalyticsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkWatcherFlowAnalyticsConfiguration = defaults.networkWatcherFlowAnalyticsConfiguration;
        }

        public Builder setNetworkWatcherFlowAnalyticsConfiguration(@Nullable TrafficAnalyticsConfigurationPropertiesResponse networkWatcherFlowAnalyticsConfiguration) {
            this.networkWatcherFlowAnalyticsConfiguration = networkWatcherFlowAnalyticsConfiguration;
            return this;
        }
        public TrafficAnalyticsPropertiesResponse build() {
            return new TrafficAnalyticsPropertiesResponse(networkWatcherFlowAnalyticsConfiguration);
        }
    }
}
