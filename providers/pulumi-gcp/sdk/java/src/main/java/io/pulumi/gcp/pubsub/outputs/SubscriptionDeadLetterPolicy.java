// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SubscriptionDeadLetterPolicy {
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
    private final @Nullable String deadLetterTopic;
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
    private final @Nullable Integer maxDeliveryAttempts;

    @OutputCustomType.Constructor({"deadLetterTopic","maxDeliveryAttempts"})
    private SubscriptionDeadLetterPolicy(
        @Nullable String deadLetterTopic,
        @Nullable Integer maxDeliveryAttempts) {
        this.deadLetterTopic = deadLetterTopic;
        this.maxDeliveryAttempts = maxDeliveryAttempts;
    }

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
    public Optional<String> getDeadLetterTopic() {
        return Optional.ofNullable(this.deadLetterTopic);
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
    public Optional<Integer> getMaxDeliveryAttempts() {
        return Optional.ofNullable(this.maxDeliveryAttempts);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionDeadLetterPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deadLetterTopic;
        private @Nullable Integer maxDeliveryAttempts;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionDeadLetterPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterTopic = defaults.deadLetterTopic;
    	      this.maxDeliveryAttempts = defaults.maxDeliveryAttempts;
        }

        public Builder setDeadLetterTopic(@Nullable String deadLetterTopic) {
            this.deadLetterTopic = deadLetterTopic;
            return this;
        }

        public Builder setMaxDeliveryAttempts(@Nullable Integer maxDeliveryAttempts) {
            this.maxDeliveryAttempts = maxDeliveryAttempts;
            return this;
        }
        public SubscriptionDeadLetterPolicy build() {
            return new SubscriptionDeadLetterPolicy(deadLetterTopic, maxDeliveryAttempts);
        }
    }
}
