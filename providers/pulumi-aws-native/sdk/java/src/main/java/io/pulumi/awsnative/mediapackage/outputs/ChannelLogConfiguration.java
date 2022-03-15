// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelLogConfiguration {
    /**
     * Sets a custom AWS CloudWatch log group name for access logs. If a log group name isn't specified, the defaults are used: /aws/MediaPackage/EgressAccessLogs for egress access logs and /aws/MediaPackage/IngressAccessLogs for ingress access logs.
     * 
     */
    private final @Nullable String logGroupName;

    @CustomType.Constructor
    private ChannelLogConfiguration(@CustomType.Parameter("logGroupName") @Nullable String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * Sets a custom AWS CloudWatch log group name for access logs. If a log group name isn't specified, the defaults are used: /aws/MediaPackage/EgressAccessLogs for egress access logs and /aws/MediaPackage/IngressAccessLogs for ingress access logs.
     * 
    */
    public Optional<String> getLogGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelLogConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelLogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
        }

        public Builder logGroupName(@Nullable String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }
        public ChannelLogConfiguration build() {
            return new ChannelLogConfiguration(logGroupName);
        }
    }
}
