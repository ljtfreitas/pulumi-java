// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.MonitoringScheduleEndpointInputS3DataDistributionType;
import io.pulumi.awsnative.sagemaker.enums.MonitoringScheduleEndpointInputS3InputMode;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The endpoint for a monitoring job.
 * 
 */
public final class MonitoringScheduleEndpointInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleEndpointInputArgs Empty = new MonitoringScheduleEndpointInputArgs();

    @Import(name="endpointName", required=true)
      private final Output<String> endpointName;

    public Output<String> getEndpointName() {
        return this.endpointName;
    }

    /**
     * Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    @Import(name="localPath", required=true)
      private final Output<String> localPath;

    public Output<String> getLocalPath() {
        return this.localPath;
    }

    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    @Import(name="s3DataDistributionType")
      private final @Nullable Output<MonitoringScheduleEndpointInputS3DataDistributionType> s3DataDistributionType;

    public Output<MonitoringScheduleEndpointInputS3DataDistributionType> getS3DataDistributionType() {
        return this.s3DataDistributionType == null ? Output.empty() : this.s3DataDistributionType;
    }

    /**
     * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    @Import(name="s3InputMode")
      private final @Nullable Output<MonitoringScheduleEndpointInputS3InputMode> s3InputMode;

    public Output<MonitoringScheduleEndpointInputS3InputMode> getS3InputMode() {
        return this.s3InputMode == null ? Output.empty() : this.s3InputMode;
    }

    public MonitoringScheduleEndpointInputArgs(
        Output<String> endpointName,
        Output<String> localPath,
        @Nullable Output<MonitoringScheduleEndpointInputS3DataDistributionType> s3DataDistributionType,
        @Nullable Output<MonitoringScheduleEndpointInputS3InputMode> s3InputMode) {
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.localPath = Objects.requireNonNull(localPath, "expected parameter 'localPath' to be non-null");
        this.s3DataDistributionType = s3DataDistributionType;
        this.s3InputMode = s3InputMode;
    }

    private MonitoringScheduleEndpointInputArgs() {
        this.endpointName = Output.empty();
        this.localPath = Output.empty();
        this.s3DataDistributionType = Output.empty();
        this.s3InputMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleEndpointInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endpointName;
        private Output<String> localPath;
        private @Nullable Output<MonitoringScheduleEndpointInputS3DataDistributionType> s3DataDistributionType;
        private @Nullable Output<MonitoringScheduleEndpointInputS3InputMode> s3InputMode;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleEndpointInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.localPath = defaults.localPath;
    	      this.s3DataDistributionType = defaults.s3DataDistributionType;
    	      this.s3InputMode = defaults.s3InputMode;
        }

        public Builder endpointName(Output<String> endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder endpointName(String endpointName) {
            this.endpointName = Output.of(Objects.requireNonNull(endpointName));
            return this;
        }

        public Builder localPath(Output<String> localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }

        public Builder localPath(String localPath) {
            this.localPath = Output.of(Objects.requireNonNull(localPath));
            return this;
        }

        public Builder s3DataDistributionType(@Nullable Output<MonitoringScheduleEndpointInputS3DataDistributionType> s3DataDistributionType) {
            this.s3DataDistributionType = s3DataDistributionType;
            return this;
        }

        public Builder s3DataDistributionType(@Nullable MonitoringScheduleEndpointInputS3DataDistributionType s3DataDistributionType) {
            this.s3DataDistributionType = Output.ofNullable(s3DataDistributionType);
            return this;
        }

        public Builder s3InputMode(@Nullable Output<MonitoringScheduleEndpointInputS3InputMode> s3InputMode) {
            this.s3InputMode = s3InputMode;
            return this;
        }

        public Builder s3InputMode(@Nullable MonitoringScheduleEndpointInputS3InputMode s3InputMode) {
            this.s3InputMode = Output.ofNullable(s3InputMode);
            return this;
        }
        public MonitoringScheduleEndpointInputArgs build() {
            return new MonitoringScheduleEndpointInputArgs(endpointName, localPath, s3DataDistributionType, s3InputMode);
        }
    }
}
