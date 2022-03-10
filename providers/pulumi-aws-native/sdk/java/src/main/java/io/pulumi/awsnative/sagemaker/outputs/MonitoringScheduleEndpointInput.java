// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.MonitoringScheduleEndpointInputS3DataDistributionType;
import io.pulumi.awsnative.sagemaker.enums.MonitoringScheduleEndpointInputS3InputMode;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MonitoringScheduleEndpointInput {
    private final String endpointName;
    /**
     * Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    private final String localPath;
    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    private final @Nullable MonitoringScheduleEndpointInputS3DataDistributionType s3DataDistributionType;
    /**
     * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    private final @Nullable MonitoringScheduleEndpointInputS3InputMode s3InputMode;

    @OutputCustomType.Constructor
    private MonitoringScheduleEndpointInput(
        @OutputCustomType.Parameter("endpointName") String endpointName,
        @OutputCustomType.Parameter("localPath") String localPath,
        @OutputCustomType.Parameter("s3DataDistributionType") @Nullable MonitoringScheduleEndpointInputS3DataDistributionType s3DataDistributionType,
        @OutputCustomType.Parameter("s3InputMode") @Nullable MonitoringScheduleEndpointInputS3InputMode s3InputMode) {
        this.endpointName = endpointName;
        this.localPath = localPath;
        this.s3DataDistributionType = s3DataDistributionType;
        this.s3InputMode = s3InputMode;
    }

    public String getEndpointName() {
        return this.endpointName;
    }
    /**
     * Path to the filesystem where the endpoint data is available to the container.
     * 
    */
    public String getLocalPath() {
        return this.localPath;
    }
    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
    */
    public Optional<MonitoringScheduleEndpointInputS3DataDistributionType> getS3DataDistributionType() {
        return Optional.ofNullable(this.s3DataDistributionType);
    }
    /**
     * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
    */
    public Optional<MonitoringScheduleEndpointInputS3InputMode> getS3InputMode() {
        return Optional.ofNullable(this.s3InputMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleEndpointInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointName;
        private String localPath;
        private @Nullable MonitoringScheduleEndpointInputS3DataDistributionType s3DataDistributionType;
        private @Nullable MonitoringScheduleEndpointInputS3InputMode s3InputMode;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleEndpointInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointName = defaults.endpointName;
    	      this.localPath = defaults.localPath;
    	      this.s3DataDistributionType = defaults.s3DataDistributionType;
    	      this.s3InputMode = defaults.s3InputMode;
        }

        public Builder setEndpointName(String endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder setLocalPath(String localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }

        public Builder setS3DataDistributionType(@Nullable MonitoringScheduleEndpointInputS3DataDistributionType s3DataDistributionType) {
            this.s3DataDistributionType = s3DataDistributionType;
            return this;
        }

        public Builder setS3InputMode(@Nullable MonitoringScheduleEndpointInputS3InputMode s3InputMode) {
            this.s3InputMode = s3InputMode;
            return this;
        }
        public MonitoringScheduleEndpointInput build() {
            return new MonitoringScheduleEndpointInput(endpointName, localPath, s3DataDistributionType, s3InputMode);
        }
    }
}
