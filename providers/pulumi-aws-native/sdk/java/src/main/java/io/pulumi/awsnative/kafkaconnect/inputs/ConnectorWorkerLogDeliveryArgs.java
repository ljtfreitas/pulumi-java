// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorCloudWatchLogsLogDeliveryArgs;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorFirehoseLogDeliveryArgs;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorS3LogDeliveryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies where worker logs are delivered.
 * 
 */
public final class ConnectorWorkerLogDeliveryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorWorkerLogDeliveryArgs Empty = new ConnectorWorkerLogDeliveryArgs();

    @InputImport(name="cloudWatchLogs")
        private final @Nullable Input<ConnectorCloudWatchLogsLogDeliveryArgs> cloudWatchLogs;

    public Input<ConnectorCloudWatchLogsLogDeliveryArgs> getCloudWatchLogs() {
        return this.cloudWatchLogs == null ? Input.empty() : this.cloudWatchLogs;
    }

    @InputImport(name="firehose")
        private final @Nullable Input<ConnectorFirehoseLogDeliveryArgs> firehose;

    public Input<ConnectorFirehoseLogDeliveryArgs> getFirehose() {
        return this.firehose == null ? Input.empty() : this.firehose;
    }

    @InputImport(name="s3")
        private final @Nullable Input<ConnectorS3LogDeliveryArgs> s3;

    public Input<ConnectorS3LogDeliveryArgs> getS3() {
        return this.s3 == null ? Input.empty() : this.s3;
    }

    public ConnectorWorkerLogDeliveryArgs(
        @Nullable Input<ConnectorCloudWatchLogsLogDeliveryArgs> cloudWatchLogs,
        @Nullable Input<ConnectorFirehoseLogDeliveryArgs> firehose,
        @Nullable Input<ConnectorS3LogDeliveryArgs> s3) {
        this.cloudWatchLogs = cloudWatchLogs;
        this.firehose = firehose;
        this.s3 = s3;
    }

    private ConnectorWorkerLogDeliveryArgs() {
        this.cloudWatchLogs = Input.empty();
        this.firehose = Input.empty();
        this.s3 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorWorkerLogDeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConnectorCloudWatchLogsLogDeliveryArgs> cloudWatchLogs;
        private @Nullable Input<ConnectorFirehoseLogDeliveryArgs> firehose;
        private @Nullable Input<ConnectorS3LogDeliveryArgs> s3;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorWorkerLogDeliveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogs = defaults.cloudWatchLogs;
    	      this.firehose = defaults.firehose;
    	      this.s3 = defaults.s3;
        }

        public Builder setCloudWatchLogs(@Nullable Input<ConnectorCloudWatchLogsLogDeliveryArgs> cloudWatchLogs) {
            this.cloudWatchLogs = cloudWatchLogs;
            return this;
        }

        public Builder setCloudWatchLogs(@Nullable ConnectorCloudWatchLogsLogDeliveryArgs cloudWatchLogs) {
            this.cloudWatchLogs = Input.ofNullable(cloudWatchLogs);
            return this;
        }

        public Builder setFirehose(@Nullable Input<ConnectorFirehoseLogDeliveryArgs> firehose) {
            this.firehose = firehose;
            return this;
        }

        public Builder setFirehose(@Nullable ConnectorFirehoseLogDeliveryArgs firehose) {
            this.firehose = Input.ofNullable(firehose);
            return this;
        }

        public Builder setS3(@Nullable Input<ConnectorS3LogDeliveryArgs> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setS3(@Nullable ConnectorS3LogDeliveryArgs s3) {
            this.s3 = Input.ofNullable(s3);
            return this;
        }
        public ConnectorWorkerLogDeliveryArgs build() {
            return new ConnectorWorkerLogDeliveryArgs(cloudWatchLogs, firehose, s3);
        }
    }
}
