// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleErrorActionSqsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionSqsGetArgs Empty = new TopicRuleErrorActionSqsGetArgs();

    /**
     * The URL of the Amazon SQS queue.
     * 
     */
    @InputImport(name="queueUrl", required=true)
    private final Input<String> queueUrl;

    public Input<String> getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Specifies whether to use Base64 encoding.
     * 
     */
    @InputImport(name="useBase64", required=true)
    private final Input<Boolean> useBase64;

    public Input<Boolean> getUseBase64() {
        return this.useBase64;
    }

    public TopicRuleErrorActionSqsGetArgs(
        Input<String> queueUrl,
        Input<String> roleArn,
        Input<Boolean> useBase64) {
        this.queueUrl = Objects.requireNonNull(queueUrl, "expected parameter 'queueUrl' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.useBase64 = Objects.requireNonNull(useBase64, "expected parameter 'useBase64' to be non-null");
    }

    private TopicRuleErrorActionSqsGetArgs() {
        this.queueUrl = Input.empty();
        this.roleArn = Input.empty();
        this.useBase64 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionSqsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> queueUrl;
        private Input<String> roleArn;
        private Input<Boolean> useBase64;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionSqsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queueUrl = defaults.queueUrl;
    	      this.roleArn = defaults.roleArn;
    	      this.useBase64 = defaults.useBase64;
        }

        public Builder setQueueUrl(Input<String> queueUrl) {
            this.queueUrl = Objects.requireNonNull(queueUrl);
            return this;
        }

        public Builder setQueueUrl(String queueUrl) {
            this.queueUrl = Input.of(Objects.requireNonNull(queueUrl));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setUseBase64(Input<Boolean> useBase64) {
            this.useBase64 = Objects.requireNonNull(useBase64);
            return this;
        }

        public Builder setUseBase64(Boolean useBase64) {
            this.useBase64 = Input.of(Objects.requireNonNull(useBase64));
            return this;
        }
        public TopicRuleErrorActionSqsGetArgs build() {
            return new TopicRuleErrorActionSqsGetArgs(queueUrl, roleArn, useBase64);
        }
    }
}
