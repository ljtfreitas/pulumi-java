// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleS3GetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleS3GetArgs Empty = new TopicRuleS3GetArgs();

    /**
     * The Amazon S3 bucket name.
     * 
     */
    @Import(name="bucketName", required=true)
      private final Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName;
    }

    /**
     * The object key.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleS3GetArgs(
        Output<String> bucketName,
        Output<String> key,
        Output<String> roleArn) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleS3GetArgs() {
        this.bucketName = Output.empty();
        this.key = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleS3GetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketName;
        private Output<String> key;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleS3GetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.key = defaults.key;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucketName(Output<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Output.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public TopicRuleS3GetArgs build() {
            return new TopicRuleS3GetArgs(bucketName, key, roleArn);
        }
    }
}
