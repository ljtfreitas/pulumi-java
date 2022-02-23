// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.StorageLensCloudWatchMetrics;
import io.pulumi.awsnative.s3.outputs.StorageLensS3BucketDestination;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageLensDataExport {
    private final @Nullable StorageLensCloudWatchMetrics cloudWatchMetrics;
    private final @Nullable StorageLensS3BucketDestination s3BucketDestination;

    @OutputCustomType.Constructor({"cloudWatchMetrics","s3BucketDestination"})
    private StorageLensDataExport(
        @Nullable StorageLensCloudWatchMetrics cloudWatchMetrics,
        @Nullable StorageLensS3BucketDestination s3BucketDestination) {
        this.cloudWatchMetrics = cloudWatchMetrics;
        this.s3BucketDestination = s3BucketDestination;
    }

    public Optional<StorageLensCloudWatchMetrics> getCloudWatchMetrics() {
        return Optional.ofNullable(this.cloudWatchMetrics);
    }
    public Optional<StorageLensS3BucketDestination> getS3BucketDestination() {
        return Optional.ofNullable(this.s3BucketDestination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensDataExport defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StorageLensCloudWatchMetrics cloudWatchMetrics;
        private @Nullable StorageLensS3BucketDestination s3BucketDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensDataExport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchMetrics = defaults.cloudWatchMetrics;
    	      this.s3BucketDestination = defaults.s3BucketDestination;
        }

        public Builder setCloudWatchMetrics(@Nullable StorageLensCloudWatchMetrics cloudWatchMetrics) {
            this.cloudWatchMetrics = cloudWatchMetrics;
            return this;
        }

        public Builder setS3BucketDestination(@Nullable StorageLensS3BucketDestination s3BucketDestination) {
            this.s3BucketDestination = s3BucketDestination;
            return this;
        }
        public StorageLensDataExport build() {
            return new StorageLensDataExport(cloudWatchMetrics, s3BucketDestination);
        }
    }
}
