// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterLoggingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingGetArgs Empty = new ClusterLoggingGetArgs();

    /**
     * The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
     * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
     * 
     */
    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName == null ? Output.empty() : this.bucketName;
    }

    /**
     * Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * 
     */
    @Import(name="enable", required=true)
      private final Output<Boolean> enable;

    public Output<Boolean> getEnable() {
        return this.enable;
    }

    /**
     * The prefix applied to the log file names.
     * 
     */
    @Import(name="s3KeyPrefix")
      private final @Nullable Output<String> s3KeyPrefix;

    public Output<String> getS3KeyPrefix() {
        return this.s3KeyPrefix == null ? Output.empty() : this.s3KeyPrefix;
    }

    public ClusterLoggingGetArgs(
        @Nullable Output<String> bucketName,
        Output<Boolean> enable,
        @Nullable Output<String> s3KeyPrefix) {
        this.bucketName = bucketName;
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private ClusterLoggingGetArgs() {
        this.bucketName = Output.empty();
        this.enable = Output.empty();
        this.s3KeyPrefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketName;
        private Output<Boolean> enable;
        private @Nullable Output<String> s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.enable = defaults.enable;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Output.ofNullable(bucketName);
            return this;
        }

        public Builder enable(Output<Boolean> enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder enable(Boolean enable) {
            this.enable = Output.of(Objects.requireNonNull(enable));
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
        public ClusterLoggingGetArgs build() {
            return new ClusterLoggingGetArgs(bucketName, enable, s3KeyPrefix);
        }
    }
}
