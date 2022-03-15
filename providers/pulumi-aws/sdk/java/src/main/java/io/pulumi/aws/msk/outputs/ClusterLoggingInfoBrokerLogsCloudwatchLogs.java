// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterLoggingInfoBrokerLogsCloudwatchLogs {
    /**
     * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
     * 
     */
    private final Boolean enabled;
    /**
     * Name of the Cloudwatch Log Group to deliver logs to.
     * 
     */
    private final @Nullable String logGroup;

    @CustomType.Constructor
    private ClusterLoggingInfoBrokerLogsCloudwatchLogs(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("logGroup") @Nullable String logGroup) {
        this.enabled = enabled;
        this.logGroup = logGroup;
    }

    /**
     * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Name of the Cloudwatch Log Group to deliver logs to.
     * 
    */
    public Optional<String> getLogGroup() {
        return Optional.ofNullable(this.logGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingInfoBrokerLogsCloudwatchLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String logGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingInfoBrokerLogsCloudwatchLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroup = defaults.logGroup;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder logGroup(@Nullable String logGroup) {
            this.logGroup = logGroup;
            return this;
        }
        public ClusterLoggingInfoBrokerLogsCloudwatchLogs build() {
            return new ClusterLoggingInfoBrokerLogsCloudwatchLogs(enabled, logGroup);
        }
    }
}
