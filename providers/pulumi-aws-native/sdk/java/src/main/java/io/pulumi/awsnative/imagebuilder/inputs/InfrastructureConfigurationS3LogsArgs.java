// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The S3 path in which to store the logs.
 * 
 */
public final class InfrastructureConfigurationS3LogsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InfrastructureConfigurationS3LogsArgs Empty = new InfrastructureConfigurationS3LogsArgs();

    /**
     * S3BucketName
     * 
     */
    @Import(name="s3BucketName")
      private final @Nullable Output<String> s3BucketName;

    public Output<String> getS3BucketName() {
        return this.s3BucketName == null ? Output.empty() : this.s3BucketName;
    }

    /**
     * S3KeyPrefix
     * 
     */
    @Import(name="s3KeyPrefix")
      private final @Nullable Output<String> s3KeyPrefix;

    public Output<String> getS3KeyPrefix() {
        return this.s3KeyPrefix == null ? Output.empty() : this.s3KeyPrefix;
    }

    public InfrastructureConfigurationS3LogsArgs(
        @Nullable Output<String> s3BucketName,
        @Nullable Output<String> s3KeyPrefix) {
        this.s3BucketName = s3BucketName;
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private InfrastructureConfigurationS3LogsArgs() {
        this.s3BucketName = Output.empty();
        this.s3KeyPrefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationS3LogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> s3BucketName;
        private @Nullable Output<String> s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationS3LogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder s3BucketName(@Nullable Output<String> s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        public Builder s3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = Output.ofNullable(s3BucketName);
            return this;
        }

        public Builder s3KeyPrefix(@Nullable Output<String> s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = Output.ofNullable(s3KeyPrefix);
            return this;
        }
        public InfrastructureConfigurationS3LogsArgs build() {
            return new InfrastructureConfigurationS3LogsArgs(s3BucketName, s3KeyPrefix);
        }
    }
}
