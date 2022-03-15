// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sns.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicSubscriptionState extends io.pulumi.resources.ResourceArgs {

    public static final TopicSubscriptionState Empty = new TopicSubscriptionState();

    /**
     * ARN of the subscription.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Integer indicating number of minutes to wait in retrying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols. Default is `1`.
     * 
     */
    @Import(name="confirmationTimeoutInMinutes")
      private final @Nullable Output<Integer> confirmationTimeoutInMinutes;

    public Output<Integer> getConfirmationTimeoutInMinutes() {
        return this.confirmationTimeoutInMinutes == null ? Output.empty() : this.confirmationTimeoutInMinutes;
    }

    /**
     * Whether the subscription confirmation request was authenticated.
     * 
     */
    @Import(name="confirmationWasAuthenticated")
      private final @Nullable Output<Boolean> confirmationWasAuthenticated;

    public Output<Boolean> getConfirmationWasAuthenticated() {
        return this.confirmationWasAuthenticated == null ? Output.empty() : this.confirmationWasAuthenticated;
    }

    /**
     * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
     * 
     */
    @Import(name="deliveryPolicy")
      private final @Nullable Output<String> deliveryPolicy;

    public Output<String> getDeliveryPolicy() {
        return this.deliveryPolicy == null ? Output.empty() : this.deliveryPolicy;
    }

    /**
     * Endpoint to send data to. The contents vary with the protocol. See details below.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * Whether the endpoint is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) (e.g., PagerDuty). Default is `false`.
     * 
     */
    @Import(name="endpointAutoConfirms")
      private final @Nullable Output<Boolean> endpointAutoConfirms;

    public Output<Boolean> getEndpointAutoConfirms() {
        return this.endpointAutoConfirms == null ? Output.empty() : this.endpointAutoConfirms;
    }

    /**
     * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
     * 
     */
    @Import(name="filterPolicy")
      private final @Nullable Output<String> filterPolicy;

    public Output<String> getFilterPolicy() {
        return this.filterPolicy == null ? Output.empty() : this.filterPolicy;
    }

    /**
     * AWS account ID of the subscription's owner.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * Whether the subscription has not been confirmed.
     * 
     */
    @Import(name="pendingConfirmation")
      private final @Nullable Output<Boolean> pendingConfirmation;

    public Output<Boolean> getPendingConfirmation() {
        return this.pendingConfirmation == null ? Output.empty() : this.pendingConfirmation;
    }

    /**
     * Protocol to use. Valid values are: `sqs`, `sms`, `lambda`, `firehose`, and `application`. Protocols `email`, `email-json`, `http` and `https` are also valid but partially supported. See details below.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    /**
     * Whether to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property). Default is `false`.
     * 
     */
    @Import(name="rawMessageDelivery")
      private final @Nullable Output<Boolean> rawMessageDelivery;

    public Output<Boolean> getRawMessageDelivery() {
        return this.rawMessageDelivery == null ? Output.empty() : this.rawMessageDelivery;
    }

    /**
     * JSON String with the redrive policy that will be used in the subscription. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-dead-letter-queues.html#how-messages-moved-into-dead-letter-queue) for more details.
     * 
     */
    @Import(name="redrivePolicy")
      private final @Nullable Output<String> redrivePolicy;

    public Output<String> getRedrivePolicy() {
        return this.redrivePolicy == null ? Output.empty() : this.redrivePolicy;
    }

    /**
     * ARN of the IAM role to publish to Kinesis Data Firehose delivery stream. Refer to [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html).
     * 
     */
    @Import(name="subscriptionRoleArn")
      private final @Nullable Output<String> subscriptionRoleArn;

    public Output<String> getSubscriptionRoleArn() {
        return this.subscriptionRoleArn == null ? Output.empty() : this.subscriptionRoleArn;
    }

    /**
     * ARN of the SNS topic to subscribe to.
     * 
     */
    @Import(name="topic")
      private final @Nullable Output<String> topic;

    public Output<String> getTopic() {
        return this.topic == null ? Output.empty() : this.topic;
    }

    public TopicSubscriptionState(
        @Nullable Output<String> arn,
        @Nullable Output<Integer> confirmationTimeoutInMinutes,
        @Nullable Output<Boolean> confirmationWasAuthenticated,
        @Nullable Output<String> deliveryPolicy,
        @Nullable Output<String> endpoint,
        @Nullable Output<Boolean> endpointAutoConfirms,
        @Nullable Output<String> filterPolicy,
        @Nullable Output<String> ownerId,
        @Nullable Output<Boolean> pendingConfirmation,
        @Nullable Output<String> protocol,
        @Nullable Output<Boolean> rawMessageDelivery,
        @Nullable Output<String> redrivePolicy,
        @Nullable Output<String> subscriptionRoleArn,
        @Nullable Output<String> topic) {
        this.arn = arn;
        this.confirmationTimeoutInMinutes = confirmationTimeoutInMinutes;
        this.confirmationWasAuthenticated = confirmationWasAuthenticated;
        this.deliveryPolicy = deliveryPolicy;
        this.endpoint = endpoint;
        this.endpointAutoConfirms = endpointAutoConfirms;
        this.filterPolicy = filterPolicy;
        this.ownerId = ownerId;
        this.pendingConfirmation = pendingConfirmation;
        this.protocol = protocol;
        this.rawMessageDelivery = rawMessageDelivery;
        this.redrivePolicy = redrivePolicy;
        this.subscriptionRoleArn = subscriptionRoleArn;
        this.topic = topic;
    }

    private TopicSubscriptionState() {
        this.arn = Output.empty();
        this.confirmationTimeoutInMinutes = Output.empty();
        this.confirmationWasAuthenticated = Output.empty();
        this.deliveryPolicy = Output.empty();
        this.endpoint = Output.empty();
        this.endpointAutoConfirms = Output.empty();
        this.filterPolicy = Output.empty();
        this.ownerId = Output.empty();
        this.pendingConfirmation = Output.empty();
        this.protocol = Output.empty();
        this.rawMessageDelivery = Output.empty();
        this.redrivePolicy = Output.empty();
        this.subscriptionRoleArn = Output.empty();
        this.topic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Integer> confirmationTimeoutInMinutes;
        private @Nullable Output<Boolean> confirmationWasAuthenticated;
        private @Nullable Output<String> deliveryPolicy;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<Boolean> endpointAutoConfirms;
        private @Nullable Output<String> filterPolicy;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<Boolean> pendingConfirmation;
        private @Nullable Output<String> protocol;
        private @Nullable Output<Boolean> rawMessageDelivery;
        private @Nullable Output<String> redrivePolicy;
        private @Nullable Output<String> subscriptionRoleArn;
        private @Nullable Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicSubscriptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.confirmationTimeoutInMinutes = defaults.confirmationTimeoutInMinutes;
    	      this.confirmationWasAuthenticated = defaults.confirmationWasAuthenticated;
    	      this.deliveryPolicy = defaults.deliveryPolicy;
    	      this.endpoint = defaults.endpoint;
    	      this.endpointAutoConfirms = defaults.endpointAutoConfirms;
    	      this.filterPolicy = defaults.filterPolicy;
    	      this.ownerId = defaults.ownerId;
    	      this.pendingConfirmation = defaults.pendingConfirmation;
    	      this.protocol = defaults.protocol;
    	      this.rawMessageDelivery = defaults.rawMessageDelivery;
    	      this.redrivePolicy = defaults.redrivePolicy;
    	      this.subscriptionRoleArn = defaults.subscriptionRoleArn;
    	      this.topic = defaults.topic;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder confirmationTimeoutInMinutes(@Nullable Output<Integer> confirmationTimeoutInMinutes) {
            this.confirmationTimeoutInMinutes = confirmationTimeoutInMinutes;
            return this;
        }

        public Builder confirmationTimeoutInMinutes(@Nullable Integer confirmationTimeoutInMinutes) {
            this.confirmationTimeoutInMinutes = Output.ofNullable(confirmationTimeoutInMinutes);
            return this;
        }

        public Builder confirmationWasAuthenticated(@Nullable Output<Boolean> confirmationWasAuthenticated) {
            this.confirmationWasAuthenticated = confirmationWasAuthenticated;
            return this;
        }

        public Builder confirmationWasAuthenticated(@Nullable Boolean confirmationWasAuthenticated) {
            this.confirmationWasAuthenticated = Output.ofNullable(confirmationWasAuthenticated);
            return this;
        }

        public Builder deliveryPolicy(@Nullable Output<String> deliveryPolicy) {
            this.deliveryPolicy = deliveryPolicy;
            return this;
        }

        public Builder deliveryPolicy(@Nullable String deliveryPolicy) {
            this.deliveryPolicy = Output.ofNullable(deliveryPolicy);
            return this;
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }

        public Builder endpointAutoConfirms(@Nullable Output<Boolean> endpointAutoConfirms) {
            this.endpointAutoConfirms = endpointAutoConfirms;
            return this;
        }

        public Builder endpointAutoConfirms(@Nullable Boolean endpointAutoConfirms) {
            this.endpointAutoConfirms = Output.ofNullable(endpointAutoConfirms);
            return this;
        }

        public Builder filterPolicy(@Nullable Output<String> filterPolicy) {
            this.filterPolicy = filterPolicy;
            return this;
        }

        public Builder filterPolicy(@Nullable String filterPolicy) {
            this.filterPolicy = Output.ofNullable(filterPolicy);
            return this;
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Output.ofNullable(ownerId);
            return this;
        }

        public Builder pendingConfirmation(@Nullable Output<Boolean> pendingConfirmation) {
            this.pendingConfirmation = pendingConfirmation;
            return this;
        }

        public Builder pendingConfirmation(@Nullable Boolean pendingConfirmation) {
            this.pendingConfirmation = Output.ofNullable(pendingConfirmation);
            return this;
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }

        public Builder rawMessageDelivery(@Nullable Output<Boolean> rawMessageDelivery) {
            this.rawMessageDelivery = rawMessageDelivery;
            return this;
        }

        public Builder rawMessageDelivery(@Nullable Boolean rawMessageDelivery) {
            this.rawMessageDelivery = Output.ofNullable(rawMessageDelivery);
            return this;
        }

        public Builder redrivePolicy(@Nullable Output<String> redrivePolicy) {
            this.redrivePolicy = redrivePolicy;
            return this;
        }

        public Builder redrivePolicy(@Nullable String redrivePolicy) {
            this.redrivePolicy = Output.ofNullable(redrivePolicy);
            return this;
        }

        public Builder subscriptionRoleArn(@Nullable Output<String> subscriptionRoleArn) {
            this.subscriptionRoleArn = subscriptionRoleArn;
            return this;
        }

        public Builder subscriptionRoleArn(@Nullable String subscriptionRoleArn) {
            this.subscriptionRoleArn = Output.ofNullable(subscriptionRoleArn);
            return this;
        }

        public Builder topic(@Nullable Output<String> topic) {
            this.topic = topic;
            return this;
        }
        public TopicSubscriptionState build() {
            return new TopicSubscriptionState(arn, confirmationTimeoutInMinutes, confirmationWasAuthenticated, deliveryPolicy, endpoint, endpointAutoConfirms, filterPolicy, ownerId, pendingConfirmation, protocol, rawMessageDelivery, redrivePolicy, subscriptionRoleArn, topic);
        }
    }
}
