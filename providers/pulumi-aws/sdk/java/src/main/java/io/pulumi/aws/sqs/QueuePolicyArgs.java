// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sqs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class QueuePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueuePolicyArgs Empty = new QueuePolicyArgs();

    /**
     * The JSON policy for the SQS queue.
     * 
     */
    @Import(name="policy", required=true)
      private final Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }

    /**
     * The URL of the SQS Queue to which to attach the policy
     * 
     */
    @Import(name="queueUrl", required=true)
      private final Output<String> queueUrl;

    public Output<String> getQueueUrl() {
        return this.queueUrl;
    }

    public QueuePolicyArgs(
        Output<String> policy,
        Output<String> queueUrl) {
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.queueUrl = Objects.requireNonNull(queueUrl, "expected parameter 'queueUrl' to be non-null");
    }

    private QueuePolicyArgs() {
        this.policy = Output.empty();
        this.queueUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueuePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> policy;
        private Output<String> queueUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(QueuePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.queueUrl = defaults.queueUrl;
        }

        public Builder policy(Output<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder queueUrl(Output<String> queueUrl) {
            this.queueUrl = Objects.requireNonNull(queueUrl);
            return this;
        }

        public Builder queueUrl(String queueUrl) {
            this.queueUrl = Output.of(Objects.requireNonNull(queueUrl));
            return this;
        }
        public QueuePolicyArgs build() {
            return new QueuePolicyArgs(policy, queueUrl);
        }
    }
}
