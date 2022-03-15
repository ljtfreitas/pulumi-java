// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.outputs.FlowS3OutputFormatConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowS3DestinationProperties {
    private final String bucketName;
    private final @Nullable String bucketPrefix;
    private final @Nullable FlowS3OutputFormatConfig s3OutputFormatConfig;

    @CustomType.Constructor
    private FlowS3DestinationProperties(
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("bucketPrefix") @Nullable String bucketPrefix,
        @CustomType.Parameter("s3OutputFormatConfig") @Nullable FlowS3OutputFormatConfig s3OutputFormatConfig) {
        this.bucketName = bucketName;
        this.bucketPrefix = bucketPrefix;
        this.s3OutputFormatConfig = s3OutputFormatConfig;
    }

    public String getBucketName() {
        return this.bucketName;
    }
    public Optional<String> getBucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    public Optional<FlowS3OutputFormatConfig> getS3OutputFormatConfig() {
        return Optional.ofNullable(this.s3OutputFormatConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowS3DestinationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String bucketPrefix;
        private @Nullable FlowS3OutputFormatConfig s3OutputFormatConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowS3DestinationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.s3OutputFormatConfig = defaults.s3OutputFormatConfig;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder s3OutputFormatConfig(@Nullable FlowS3OutputFormatConfig s3OutputFormatConfig) {
            this.s3OutputFormatConfig = s3OutputFormatConfig;
            return this;
        }
        public FlowS3DestinationProperties build() {
            return new FlowS3DestinationProperties(bucketName, bucketPrefix, s3OutputFormatConfig);
        }
    }
}
