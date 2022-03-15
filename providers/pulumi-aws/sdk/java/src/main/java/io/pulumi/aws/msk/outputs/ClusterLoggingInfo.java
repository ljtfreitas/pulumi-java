// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.outputs;

import io.pulumi.aws.msk.outputs.ClusterLoggingInfoBrokerLogs;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ClusterLoggingInfo {
    /**
     * Configuration block for Broker Logs settings for logging info. See below.
     * 
     */
    private final ClusterLoggingInfoBrokerLogs brokerLogs;

    @CustomType.Constructor
    private ClusterLoggingInfo(@CustomType.Parameter("brokerLogs") ClusterLoggingInfoBrokerLogs brokerLogs) {
        this.brokerLogs = brokerLogs;
    }

    /**
     * Configuration block for Broker Logs settings for logging info. See below.
     * 
    */
    public ClusterLoggingInfoBrokerLogs getBrokerLogs() {
        return this.brokerLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterLoggingInfoBrokerLogs brokerLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brokerLogs = defaults.brokerLogs;
        }

        public Builder brokerLogs(ClusterLoggingInfoBrokerLogs brokerLogs) {
            this.brokerLogs = Objects.requireNonNull(brokerLogs);
            return this;
        }
        public ClusterLoggingInfo build() {
            return new ClusterLoggingInfo(brokerLogs);
        }
    }
}
