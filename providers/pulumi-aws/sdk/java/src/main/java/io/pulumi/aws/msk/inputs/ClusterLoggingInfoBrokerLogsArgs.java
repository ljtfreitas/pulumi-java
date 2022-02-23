// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs;
import io.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsFirehoseArgs;
import io.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsS3Args;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterLoggingInfoBrokerLogsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingInfoBrokerLogsArgs Empty = new ClusterLoggingInfoBrokerLogsArgs();

    @InputImport(name="cloudwatchLogs")
    private final @Nullable Input<ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs> cloudwatchLogs;

    public Input<ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs> getCloudwatchLogs() {
        return this.cloudwatchLogs == null ? Input.empty() : this.cloudwatchLogs;
    }

    @InputImport(name="firehose")
    private final @Nullable Input<ClusterLoggingInfoBrokerLogsFirehoseArgs> firehose;

    public Input<ClusterLoggingInfoBrokerLogsFirehoseArgs> getFirehose() {
        return this.firehose == null ? Input.empty() : this.firehose;
    }

    @InputImport(name="s3")
    private final @Nullable Input<ClusterLoggingInfoBrokerLogsS3Args> s3;

    public Input<ClusterLoggingInfoBrokerLogsS3Args> getS3() {
        return this.s3 == null ? Input.empty() : this.s3;
    }

    public ClusterLoggingInfoBrokerLogsArgs(
        @Nullable Input<ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs> cloudwatchLogs,
        @Nullable Input<ClusterLoggingInfoBrokerLogsFirehoseArgs> firehose,
        @Nullable Input<ClusterLoggingInfoBrokerLogsS3Args> s3) {
        this.cloudwatchLogs = cloudwatchLogs;
        this.firehose = firehose;
        this.s3 = s3;
    }

    private ClusterLoggingInfoBrokerLogsArgs() {
        this.cloudwatchLogs = Input.empty();
        this.firehose = Input.empty();
        this.s3 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingInfoBrokerLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs> cloudwatchLogs;
        private @Nullable Input<ClusterLoggingInfoBrokerLogsFirehoseArgs> firehose;
        private @Nullable Input<ClusterLoggingInfoBrokerLogsS3Args> s3;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingInfoBrokerLogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogs = defaults.cloudwatchLogs;
    	      this.firehose = defaults.firehose;
    	      this.s3 = defaults.s3;
        }

        public Builder setCloudwatchLogs(@Nullable Input<ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs> cloudwatchLogs) {
            this.cloudwatchLogs = cloudwatchLogs;
            return this;
        }

        public Builder setCloudwatchLogs(@Nullable ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs cloudwatchLogs) {
            this.cloudwatchLogs = Input.ofNullable(cloudwatchLogs);
            return this;
        }

        public Builder setFirehose(@Nullable Input<ClusterLoggingInfoBrokerLogsFirehoseArgs> firehose) {
            this.firehose = firehose;
            return this;
        }

        public Builder setFirehose(@Nullable ClusterLoggingInfoBrokerLogsFirehoseArgs firehose) {
            this.firehose = Input.ofNullable(firehose);
            return this;
        }

        public Builder setS3(@Nullable Input<ClusterLoggingInfoBrokerLogsS3Args> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setS3(@Nullable ClusterLoggingInfoBrokerLogsS3Args s3) {
            this.s3 = Input.ofNullable(s3);
            return this;
        }
        public ClusterLoggingInfoBrokerLogsArgs build() {
            return new ClusterLoggingInfoBrokerLogsArgs(cloudwatchLogs, firehose, s3);
        }
    }
}
