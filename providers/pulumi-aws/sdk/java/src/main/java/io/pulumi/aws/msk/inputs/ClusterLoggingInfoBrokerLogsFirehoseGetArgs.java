// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterLoggingInfoBrokerLogsFirehoseGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingInfoBrokerLogsFirehoseGetArgs Empty = new ClusterLoggingInfoBrokerLogsFirehoseGetArgs();

    /**
     * Name of the Kinesis Data Firehose delivery stream to deliver logs to.
     * 
     */
    @InputImport(name="deliveryStream")
    private final @Nullable Input<String> deliveryStream;

    public Input<String> getDeliveryStream() {
        return this.deliveryStream == null ? Input.empty() : this.deliveryStream;
    }

    /**
     * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    public ClusterLoggingInfoBrokerLogsFirehoseGetArgs(
        @Nullable Input<String> deliveryStream,
        Input<Boolean> enabled) {
        this.deliveryStream = deliveryStream;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private ClusterLoggingInfoBrokerLogsFirehoseGetArgs() {
        this.deliveryStream = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingInfoBrokerLogsFirehoseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deliveryStream;
        private Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingInfoBrokerLogsFirehoseGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryStream = defaults.deliveryStream;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDeliveryStream(@Nullable Input<String> deliveryStream) {
            this.deliveryStream = deliveryStream;
            return this;
        }

        public Builder setDeliveryStream(@Nullable String deliveryStream) {
            this.deliveryStream = Input.ofNullable(deliveryStream);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }
        public ClusterLoggingInfoBrokerLogsFirehoseGetArgs build() {
            return new ClusterLoggingInfoBrokerLogsFirehoseGetArgs(deliveryStream, enabled);
        }
    }
}
