// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.outputs;

import io.pulumi.aws.guardduty.outputs.DetectorDatasourcesS3Logs;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorDatasources {
    /**
     * Describes whether S3 data event logs are enabled as a data source. See S3 Logs below for more details.
     * 
     */
    private final @Nullable DetectorDatasourcesS3Logs s3Logs;

    @OutputCustomType.Constructor({"s3Logs"})
    private DetectorDatasources(@Nullable DetectorDatasourcesS3Logs s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * Describes whether S3 data event logs are enabled as a data source. See S3 Logs below for more details.
     * 
     */
    public Optional<DetectorDatasourcesS3Logs> getS3Logs() {
        return Optional.ofNullable(this.s3Logs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorDatasources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DetectorDatasourcesS3Logs s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorDatasources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder setS3Logs(@Nullable DetectorDatasourcesS3Logs s3Logs) {
            this.s3Logs = s3Logs;
            return this;
        }
        public DetectorDatasources build() {
            return new DetectorDatasources(s3Logs);
        }
    }
}
