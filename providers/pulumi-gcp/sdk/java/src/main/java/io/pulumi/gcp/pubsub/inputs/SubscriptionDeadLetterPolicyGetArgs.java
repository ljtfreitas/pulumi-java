// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionDeadLetterPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionDeadLetterPolicyGetArgs Empty = new SubscriptionDeadLetterPolicyGetArgs();

    /**
     * The name of the topic to which dead letter messages should be published.
     * Format is `projects/{project}/topics/{topic}`.
     * The Cloud Pub/Sub service account associated with the enclosing subscription's
     * parent project (i.e.,
     * service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have
     * permission to Publish() to this topic.
     * The operation will fail if the topic does not exist.
     * Users should ensure that there is a subscription attached to this topic
     * since messages published to a topic with no subscriptions are lost.
     * 
     */
    @Import(name="deadLetterTopic")
      private final @Nullable Output<String> deadLetterTopic;

    public Output<String> getDeadLetterTopic() {
        return this.deadLetterTopic == null ? Output.empty() : this.deadLetterTopic;
    }

    /**
     * The maximum number of delivery attempts for any message. The value must be
     * between 5 and 100.
     * The number of delivery attempts is defined as 1 + (the sum of number of
     * NACKs and number of times the acknowledgement deadline has been exceeded for the message).
     * A NACK is any call to ModifyAckDeadline with a 0 deadline. Note that
     * client libraries may automatically extend ack_deadlines.
     * This field will be honored on a best effort basis.
     * If this parameter is 0, a default value of 5 is used.
     * 
     */
    @Import(name="maxDeliveryAttempts")
      private final @Nullable Output<Integer> maxDeliveryAttempts;

    public Output<Integer> getMaxDeliveryAttempts() {
        return this.maxDeliveryAttempts == null ? Output.empty() : this.maxDeliveryAttempts;
    }

    public SubscriptionDeadLetterPolicyGetArgs(
        @Nullable Output<String> deadLetterTopic,
        @Nullable Output<Integer> maxDeliveryAttempts) {
        this.deadLetterTopic = deadLetterTopic;
        this.maxDeliveryAttempts = maxDeliveryAttempts;
    }

    private SubscriptionDeadLetterPolicyGetArgs() {
        this.deadLetterTopic = Output.empty();
        this.maxDeliveryAttempts = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionDeadLetterPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deadLetterTopic;
        private @Nullable Output<Integer> maxDeliveryAttempts;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionDeadLetterPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterTopic = defaults.deadLetterTopic;
    	      this.maxDeliveryAttempts = defaults.maxDeliveryAttempts;
        }

        public Builder deadLetterTopic(@Nullable Output<String> deadLetterTopic) {
            this.deadLetterTopic = deadLetterTopic;
            return this;
        }

        public Builder deadLetterTopic(@Nullable String deadLetterTopic) {
            this.deadLetterTopic = Output.ofNullable(deadLetterTopic);
            return this;
        }

        public Builder maxDeliveryAttempts(@Nullable Output<Integer> maxDeliveryAttempts) {
            this.maxDeliveryAttempts = maxDeliveryAttempts;
            return this;
        }

        public Builder maxDeliveryAttempts(@Nullable Integer maxDeliveryAttempts) {
            this.maxDeliveryAttempts = Output.ofNullable(maxDeliveryAttempts);
            return this;
        }
        public SubscriptionDeadLetterPolicyGetArgs build() {
            return new SubscriptionDeadLetterPolicyGetArgs(deadLetterTopic, maxDeliveryAttempts);
        }
    }
}
