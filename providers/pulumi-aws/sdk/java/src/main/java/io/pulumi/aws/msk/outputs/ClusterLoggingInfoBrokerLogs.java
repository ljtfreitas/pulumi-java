// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.outputs;

import io.pulumi.aws.msk.outputs.ClusterLoggingInfoBrokerLogsCloudwatchLogs;
import io.pulumi.aws.msk.outputs.ClusterLoggingInfoBrokerLogsFirehose;
import io.pulumi.aws.msk.outputs.ClusterLoggingInfoBrokerLogsS3;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterLoggingInfoBrokerLogs {
    private final @Nullable ClusterLoggingInfoBrokerLogsCloudwatchLogs cloudwatchLogs;
    private final @Nullable ClusterLoggingInfoBrokerLogsFirehose firehose;
    private final @Nullable ClusterLoggingInfoBrokerLogsS3 s3;

    @CustomType.Constructor
    private ClusterLoggingInfoBrokerLogs(
        @CustomType.Parameter("cloudwatchLogs") @Nullable ClusterLoggingInfoBrokerLogsCloudwatchLogs cloudwatchLogs,
        @CustomType.Parameter("firehose") @Nullable ClusterLoggingInfoBrokerLogsFirehose firehose,
        @CustomType.Parameter("s3") @Nullable ClusterLoggingInfoBrokerLogsS3 s3) {
        this.cloudwatchLogs = cloudwatchLogs;
        this.firehose = firehose;
        this.s3 = s3;
    }

    public Optional<ClusterLoggingInfoBrokerLogsCloudwatchLogs> getCloudwatchLogs() {
        return Optional.ofNullable(this.cloudwatchLogs);
    }
    public Optional<ClusterLoggingInfoBrokerLogsFirehose> getFirehose() {
        return Optional.ofNullable(this.firehose);
    }
    public Optional<ClusterLoggingInfoBrokerLogsS3> getS3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingInfoBrokerLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterLoggingInfoBrokerLogsCloudwatchLogs cloudwatchLogs;
        private @Nullable ClusterLoggingInfoBrokerLogsFirehose firehose;
        private @Nullable ClusterLoggingInfoBrokerLogsS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingInfoBrokerLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogs = defaults.cloudwatchLogs;
    	      this.firehose = defaults.firehose;
    	      this.s3 = defaults.s3;
        }

        public Builder cloudwatchLogs(@Nullable ClusterLoggingInfoBrokerLogsCloudwatchLogs cloudwatchLogs) {
            this.cloudwatchLogs = cloudwatchLogs;
            return this;
        }

        public Builder firehose(@Nullable ClusterLoggingInfoBrokerLogsFirehose firehose) {
            this.firehose = firehose;
            return this;
        }

        public Builder s3(@Nullable ClusterLoggingInfoBrokerLogsS3 s3) {
            this.s3 = s3;
            return this;
        }
        public ClusterLoggingInfoBrokerLogs build() {
            return new ClusterLoggingInfoBrokerLogs(cloudwatchLogs, firehose, s3);
        }
    }
}
