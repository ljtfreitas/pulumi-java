// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync;

import io.pulumi.aws.datasync.inputs.S3LocationS3ConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class S3LocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final S3LocationArgs Empty = new S3LocationArgs();

    /**
     * A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    @InputImport(name="agentArns")
    private final @Nullable Input<List<String>> agentArns;

    public Input<List<String>> getAgentArns() {
        return this.agentArns == null ? Input.empty() : this.agentArns;
    }

    /**
     * Amazon Resource Name (ARN) of the S3 Bucket.
     * 
     */
    @InputImport(name="s3BucketArn", required=true)
    private final Input<String> s3BucketArn;

    public Input<String> getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * Configuration block containing information for connecting to S3.
     * 
     */
    @InputImport(name="s3Config", required=true)
    private final Input<S3LocationS3ConfigArgs> s3Config;

    public Input<S3LocationS3ConfigArgs> getS3Config() {
        return this.s3Config;
    }

    /**
     * The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * 
     */
    @InputImport(name="s3StorageClass")
    private final @Nullable Input<String> s3StorageClass;

    public Input<String> getS3StorageClass() {
        return this.s3StorageClass == null ? Input.empty() : this.s3StorageClass;
    }

    /**
     * Prefix to perform actions as source or destination.
     * 
     */
    @InputImport(name="subdirectory", required=true)
    private final Input<String> subdirectory;

    public Input<String> getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public S3LocationArgs(
        @Nullable Input<List<String>> agentArns,
        Input<String> s3BucketArn,
        Input<S3LocationS3ConfigArgs> s3Config,
        @Nullable Input<String> s3StorageClass,
        Input<String> subdirectory,
        @Nullable Input<Map<String,String>> tags) {
        this.agentArns = agentArns;
        this.s3BucketArn = Objects.requireNonNull(s3BucketArn, "expected parameter 's3BucketArn' to be non-null");
        this.s3Config = Objects.requireNonNull(s3Config, "expected parameter 's3Config' to be non-null");
        this.s3StorageClass = s3StorageClass;
        this.subdirectory = Objects.requireNonNull(subdirectory, "expected parameter 'subdirectory' to be non-null");
        this.tags = tags;
    }

    private S3LocationArgs() {
        this.agentArns = Input.empty();
        this.s3BucketArn = Input.empty();
        this.s3Config = Input.empty();
        this.s3StorageClass = Input.empty();
        this.subdirectory = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(S3LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> agentArns;
        private Input<String> s3BucketArn;
        private Input<S3LocationS3ConfigArgs> s3Config;
        private @Nullable Input<String> s3StorageClass;
        private Input<String> subdirectory;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(S3LocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
    	      this.s3BucketArn = defaults.s3BucketArn;
    	      this.s3Config = defaults.s3Config;
    	      this.s3StorageClass = defaults.s3StorageClass;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
        }

        public Builder setAgentArns(@Nullable Input<List<String>> agentArns) {
            this.agentArns = agentArns;
            return this;
        }

        public Builder setAgentArns(@Nullable List<String> agentArns) {
            this.agentArns = Input.ofNullable(agentArns);
            return this;
        }

        public Builder setS3BucketArn(Input<String> s3BucketArn) {
            this.s3BucketArn = Objects.requireNonNull(s3BucketArn);
            return this;
        }

        public Builder setS3BucketArn(String s3BucketArn) {
            this.s3BucketArn = Input.of(Objects.requireNonNull(s3BucketArn));
            return this;
        }

        public Builder setS3Config(Input<S3LocationS3ConfigArgs> s3Config) {
            this.s3Config = Objects.requireNonNull(s3Config);
            return this;
        }

        public Builder setS3Config(S3LocationS3ConfigArgs s3Config) {
            this.s3Config = Input.of(Objects.requireNonNull(s3Config));
            return this;
        }

        public Builder setS3StorageClass(@Nullable Input<String> s3StorageClass) {
            this.s3StorageClass = s3StorageClass;
            return this;
        }

        public Builder setS3StorageClass(@Nullable String s3StorageClass) {
            this.s3StorageClass = Input.ofNullable(s3StorageClass);
            return this;
        }

        public Builder setSubdirectory(Input<String> subdirectory) {
            this.subdirectory = Objects.requireNonNull(subdirectory);
            return this;
        }

        public Builder setSubdirectory(String subdirectory) {
            this.subdirectory = Input.of(Objects.requireNonNull(subdirectory));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public S3LocationArgs build() {
            return new S3LocationArgs(agentArns, s3BucketArn, s3Config, s3StorageClass, subdirectory, tags);
        }
    }
}
