// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm;

import io.pulumi.awsnative.ssm.inputs.ResourceDataSyncS3DestinationArgs;
import io.pulumi.awsnative.ssm.inputs.ResourceDataSyncSyncSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceDataSyncArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceDataSyncArgs Empty = new ResourceDataSyncArgs();

    @InputImport(name="bucketName")
        private final @Nullable Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName == null ? Input.empty() : this.bucketName;
    }

    @InputImport(name="bucketPrefix")
        private final @Nullable Input<String> bucketPrefix;

    public Input<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Input.empty() : this.bucketPrefix;
    }

    @InputImport(name="bucketRegion")
        private final @Nullable Input<String> bucketRegion;

    public Input<String> getBucketRegion() {
        return this.bucketRegion == null ? Input.empty() : this.bucketRegion;
    }

    @InputImport(name="kMSKeyArn")
        private final @Nullable Input<String> kMSKeyArn;

    public Input<String> getKMSKeyArn() {
        return this.kMSKeyArn == null ? Input.empty() : this.kMSKeyArn;
    }

    @InputImport(name="s3Destination")
        private final @Nullable Input<ResourceDataSyncS3DestinationArgs> s3Destination;

    public Input<ResourceDataSyncS3DestinationArgs> getS3Destination() {
        return this.s3Destination == null ? Input.empty() : this.s3Destination;
    }

    @InputImport(name="syncFormat")
        private final @Nullable Input<String> syncFormat;

    public Input<String> getSyncFormat() {
        return this.syncFormat == null ? Input.empty() : this.syncFormat;
    }

    @InputImport(name="syncSource")
        private final @Nullable Input<ResourceDataSyncSyncSourceArgs> syncSource;

    public Input<ResourceDataSyncSyncSourceArgs> getSyncSource() {
        return this.syncSource == null ? Input.empty() : this.syncSource;
    }

    @InputImport(name="syncType")
        private final @Nullable Input<String> syncType;

    public Input<String> getSyncType() {
        return this.syncType == null ? Input.empty() : this.syncType;
    }

    public ResourceDataSyncArgs(
        @Nullable Input<String> bucketName,
        @Nullable Input<String> bucketPrefix,
        @Nullable Input<String> bucketRegion,
        @Nullable Input<String> kMSKeyArn,
        @Nullable Input<ResourceDataSyncS3DestinationArgs> s3Destination,
        @Nullable Input<String> syncFormat,
        @Nullable Input<ResourceDataSyncSyncSourceArgs> syncSource,
        @Nullable Input<String> syncType) {
        this.bucketName = bucketName;
        this.bucketPrefix = bucketPrefix;
        this.bucketRegion = bucketRegion;
        this.kMSKeyArn = kMSKeyArn;
        this.s3Destination = s3Destination;
        this.syncFormat = syncFormat;
        this.syncSource = syncSource;
        this.syncType = syncType;
    }

    private ResourceDataSyncArgs() {
        this.bucketName = Input.empty();
        this.bucketPrefix = Input.empty();
        this.bucketRegion = Input.empty();
        this.kMSKeyArn = Input.empty();
        this.s3Destination = Input.empty();
        this.syncFormat = Input.empty();
        this.syncSource = Input.empty();
        this.syncType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceDataSyncArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucketName;
        private @Nullable Input<String> bucketPrefix;
        private @Nullable Input<String> bucketRegion;
        private @Nullable Input<String> kMSKeyArn;
        private @Nullable Input<ResourceDataSyncS3DestinationArgs> s3Destination;
        private @Nullable Input<String> syncFormat;
        private @Nullable Input<ResourceDataSyncSyncSourceArgs> syncSource;
        private @Nullable Input<String> syncType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceDataSyncArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.bucketRegion = defaults.bucketRegion;
    	      this.kMSKeyArn = defaults.kMSKeyArn;
    	      this.s3Destination = defaults.s3Destination;
    	      this.syncFormat = defaults.syncFormat;
    	      this.syncSource = defaults.syncSource;
    	      this.syncType = defaults.syncType;
        }

        public Builder setBucketName(@Nullable Input<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder setBucketName(@Nullable String bucketName) {
            this.bucketName = Input.ofNullable(bucketName);
            return this;
        }

        public Builder setBucketPrefix(@Nullable Input<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Input.ofNullable(bucketPrefix);
            return this;
        }

        public Builder setBucketRegion(@Nullable Input<String> bucketRegion) {
            this.bucketRegion = bucketRegion;
            return this;
        }

        public Builder setBucketRegion(@Nullable String bucketRegion) {
            this.bucketRegion = Input.ofNullable(bucketRegion);
            return this;
        }

        public Builder setKMSKeyArn(@Nullable Input<String> kMSKeyArn) {
            this.kMSKeyArn = kMSKeyArn;
            return this;
        }

        public Builder setKMSKeyArn(@Nullable String kMSKeyArn) {
            this.kMSKeyArn = Input.ofNullable(kMSKeyArn);
            return this;
        }

        public Builder setS3Destination(@Nullable Input<ResourceDataSyncS3DestinationArgs> s3Destination) {
            this.s3Destination = s3Destination;
            return this;
        }

        public Builder setS3Destination(@Nullable ResourceDataSyncS3DestinationArgs s3Destination) {
            this.s3Destination = Input.ofNullable(s3Destination);
            return this;
        }

        public Builder setSyncFormat(@Nullable Input<String> syncFormat) {
            this.syncFormat = syncFormat;
            return this;
        }

        public Builder setSyncFormat(@Nullable String syncFormat) {
            this.syncFormat = Input.ofNullable(syncFormat);
            return this;
        }

        public Builder setSyncSource(@Nullable Input<ResourceDataSyncSyncSourceArgs> syncSource) {
            this.syncSource = syncSource;
            return this;
        }

        public Builder setSyncSource(@Nullable ResourceDataSyncSyncSourceArgs syncSource) {
            this.syncSource = Input.ofNullable(syncSource);
            return this;
        }

        public Builder setSyncType(@Nullable Input<String> syncType) {
            this.syncType = syncType;
            return this;
        }

        public Builder setSyncType(@Nullable String syncType) {
            this.syncType = Input.ofNullable(syncType);
            return this;
        }
        public ResourceDataSyncArgs build() {
            return new ResourceDataSyncArgs(bucketName, bucketPrefix, bucketRegion, kMSKeyArn, s3Destination, syncFormat, syncSource, syncType);
        }
    }
}
