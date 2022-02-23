// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Dead lettering is done on a best effort basis. The same message might be dead lettered multiple times. If validation on any of the fields fails at subscription creation/updation, the create/update subscription request will fail.
 * 
 */
public final class DeadLetterPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeadLetterPolicyResponse Empty = new DeadLetterPolicyResponse();

    /**
     * The name of the topic to which dead letter messages should be published. Format is `projects/{project}/topics/{topic}`.The Cloud Pub/Sub service account associated with the enclosing subscription's parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Publish() to this topic. The operation will fail if the topic does not exist. Users should ensure that there is a subscription attached to this topic since messages published to a topic with no subscriptions are lost.
     * 
     */
    @InputImport(name="deadLetterTopic", required=true)
      private final String deadLetterTopic;

    public String getDeadLetterTopic() {
        return this.deadLetterTopic;
    }

    /**
     * The maximum number of delivery attempts for any message. The value must be between 5 and 100. The number of delivery attempts is defined as 1 + (the sum of number of NACKs and number of times the acknowledgement deadline has been exceeded for the message). A NACK is any call to ModifyAckDeadline with a 0 deadline. Note that client libraries may automatically extend ack_deadlines. This field will be honored on a best effort basis. If this parameter is 0, a default value of 5 is used.
     * 
     */
    @InputImport(name="maxDeliveryAttempts", required=true)
      private final Integer maxDeliveryAttempts;

    public Integer getMaxDeliveryAttempts() {
        return this.maxDeliveryAttempts;
    }

    public DeadLetterPolicyResponse(
        String deadLetterTopic,
        Integer maxDeliveryAttempts) {
        this.deadLetterTopic = Objects.requireNonNull(deadLetterTopic, "expected parameter 'deadLetterTopic' to be non-null");
        this.maxDeliveryAttempts = Objects.requireNonNull(maxDeliveryAttempts, "expected parameter 'maxDeliveryAttempts' to be non-null");
    }

    private DeadLetterPolicyResponse() {
        this.deadLetterTopic = null;
        this.maxDeliveryAttempts = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeadLetterPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deadLetterTopic;
        private Integer maxDeliveryAttempts;

        public Builder() {
    	      // Empty
        }

        public Builder(DeadLetterPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterTopic = defaults.deadLetterTopic;
    	      this.maxDeliveryAttempts = defaults.maxDeliveryAttempts;
        }

        public Builder setDeadLetterTopic(String deadLetterTopic) {
            this.deadLetterTopic = Objects.requireNonNull(deadLetterTopic);
            return this;
        }

        public Builder setMaxDeliveryAttempts(Integer maxDeliveryAttempts) {
            this.maxDeliveryAttempts = Objects.requireNonNull(maxDeliveryAttempts);
            return this;
        }
        public DeadLetterPolicyResponse build() {
            return new DeadLetterPolicyResponse(deadLetterTopic, maxDeliveryAttempts);
        }
    }
}
