// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.servicebus.enums.EntityStatus;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * ISO 8061 timeSpan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     * 
     */
    @InputImport(name="autoDeleteOnIdle")
        private final @Nullable Input<String> autoDeleteOnIdle;

    public Input<String> getAutoDeleteOnIdle() {
        return this.autoDeleteOnIdle == null ? Input.empty() : this.autoDeleteOnIdle;
    }

    /**
     * Value that indicates whether a subscription has dead letter support on filter evaluation exceptions.
     * 
     */
    @InputImport(name="deadLetteringOnFilterEvaluationExceptions")
        private final @Nullable Input<Boolean> deadLetteringOnFilterEvaluationExceptions;

    public Input<Boolean> getDeadLetteringOnFilterEvaluationExceptions() {
        return this.deadLetteringOnFilterEvaluationExceptions == null ? Input.empty() : this.deadLetteringOnFilterEvaluationExceptions;
    }

    /**
     * Value that indicates whether a subscription has dead letter support when a message expires.
     * 
     */
    @InputImport(name="deadLetteringOnMessageExpiration")
        private final @Nullable Input<Boolean> deadLetteringOnMessageExpiration;

    public Input<Boolean> getDeadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration == null ? Input.empty() : this.deadLetteringOnMessageExpiration;
    }

    /**
     * ISO 8061 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     * 
     */
    @InputImport(name="defaultMessageTimeToLive")
        private final @Nullable Input<String> defaultMessageTimeToLive;

    public Input<String> getDefaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive == null ? Input.empty() : this.defaultMessageTimeToLive;
    }

    /**
     * ISO 8601 timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     * 
     */
    @InputImport(name="duplicateDetectionHistoryTimeWindow")
        private final @Nullable Input<String> duplicateDetectionHistoryTimeWindow;

    public Input<String> getDuplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow == null ? Input.empty() : this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Value that indicates whether server-side batched operations are enabled.
     * 
     */
    @InputImport(name="enableBatchedOperations")
        private final @Nullable Input<Boolean> enableBatchedOperations;

    public Input<Boolean> getEnableBatchedOperations() {
        return this.enableBatchedOperations == null ? Input.empty() : this.enableBatchedOperations;
    }

    /**
     * Queue/Topic name to forward the Dead Letter message
     * 
     */
    @InputImport(name="forwardDeadLetteredMessagesTo")
        private final @Nullable Input<String> forwardDeadLetteredMessagesTo;

    public Input<String> getForwardDeadLetteredMessagesTo() {
        return this.forwardDeadLetteredMessagesTo == null ? Input.empty() : this.forwardDeadLetteredMessagesTo;
    }

    /**
     * Queue/Topic name to forward the messages
     * 
     */
    @InputImport(name="forwardTo")
        private final @Nullable Input<String> forwardTo;

    public Input<String> getForwardTo() {
        return this.forwardTo == null ? Input.empty() : this.forwardTo;
    }

    /**
     * ISO 8061 lock duration timespan for the subscription. The default value is 1 minute.
     * 
     */
    @InputImport(name="lockDuration")
        private final @Nullable Input<String> lockDuration;

    public Input<String> getLockDuration() {
        return this.lockDuration == null ? Input.empty() : this.lockDuration;
    }

    /**
     * Number of maximum deliveries.
     * 
     */
    @InputImport(name="maxDeliveryCount")
        private final @Nullable Input<Integer> maxDeliveryCount;

    public Input<Integer> getMaxDeliveryCount() {
        return this.maxDeliveryCount == null ? Input.empty() : this.maxDeliveryCount;
    }

    /**
     * The namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
        private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Value indicating if a subscription supports the concept of sessions.
     * 
     */
    @InputImport(name="requiresSession")
        private final @Nullable Input<Boolean> requiresSession;

    public Input<Boolean> getRequiresSession() {
        return this.requiresSession == null ? Input.empty() : this.requiresSession;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Enumerates the possible values for the status of a messaging entity.
     * 
     */
    @InputImport(name="status")
        private final @Nullable Input<EntityStatus> status;

    public Input<EntityStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The subscription name.
     * 
     */
    @InputImport(name="subscriptionName")
        private final @Nullable Input<String> subscriptionName;

    public Input<String> getSubscriptionName() {
        return this.subscriptionName == null ? Input.empty() : this.subscriptionName;
    }

    /**
     * The topic name.
     * 
     */
    @InputImport(name="topicName", required=true)
        private final Input<String> topicName;

    public Input<String> getTopicName() {
        return this.topicName;
    }

    public SubscriptionArgs(
        @Nullable Input<String> autoDeleteOnIdle,
        @Nullable Input<Boolean> deadLetteringOnFilterEvaluationExceptions,
        @Nullable Input<Boolean> deadLetteringOnMessageExpiration,
        @Nullable Input<String> defaultMessageTimeToLive,
        @Nullable Input<String> duplicateDetectionHistoryTimeWindow,
        @Nullable Input<Boolean> enableBatchedOperations,
        @Nullable Input<String> forwardDeadLetteredMessagesTo,
        @Nullable Input<String> forwardTo,
        @Nullable Input<String> lockDuration,
        @Nullable Input<Integer> maxDeliveryCount,
        Input<String> namespaceName,
        @Nullable Input<Boolean> requiresSession,
        Input<String> resourceGroupName,
        @Nullable Input<EntityStatus> status,
        @Nullable Input<String> subscriptionName,
        Input<String> topicName) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        this.deadLetteringOnFilterEvaluationExceptions = deadLetteringOnFilterEvaluationExceptions;
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        this.enableBatchedOperations = enableBatchedOperations;
        this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
        this.forwardTo = forwardTo;
        this.lockDuration = lockDuration;
        this.maxDeliveryCount = maxDeliveryCount;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.requiresSession = requiresSession;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.status = status;
        this.subscriptionName = subscriptionName;
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private SubscriptionArgs() {
        this.autoDeleteOnIdle = Input.empty();
        this.deadLetteringOnFilterEvaluationExceptions = Input.empty();
        this.deadLetteringOnMessageExpiration = Input.empty();
        this.defaultMessageTimeToLive = Input.empty();
        this.duplicateDetectionHistoryTimeWindow = Input.empty();
        this.enableBatchedOperations = Input.empty();
        this.forwardDeadLetteredMessagesTo = Input.empty();
        this.forwardTo = Input.empty();
        this.lockDuration = Input.empty();
        this.maxDeliveryCount = Input.empty();
        this.namespaceName = Input.empty();
        this.requiresSession = Input.empty();
        this.resourceGroupName = Input.empty();
        this.status = Input.empty();
        this.subscriptionName = Input.empty();
        this.topicName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> autoDeleteOnIdle;
        private @Nullable Input<Boolean> deadLetteringOnFilterEvaluationExceptions;
        private @Nullable Input<Boolean> deadLetteringOnMessageExpiration;
        private @Nullable Input<String> defaultMessageTimeToLive;
        private @Nullable Input<String> duplicateDetectionHistoryTimeWindow;
        private @Nullable Input<Boolean> enableBatchedOperations;
        private @Nullable Input<String> forwardDeadLetteredMessagesTo;
        private @Nullable Input<String> forwardTo;
        private @Nullable Input<String> lockDuration;
        private @Nullable Input<Integer> maxDeliveryCount;
        private Input<String> namespaceName;
        private @Nullable Input<Boolean> requiresSession;
        private Input<String> resourceGroupName;
        private @Nullable Input<EntityStatus> status;
        private @Nullable Input<String> subscriptionName;
        private Input<String> topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDeleteOnIdle = defaults.autoDeleteOnIdle;
    	      this.deadLetteringOnFilterEvaluationExceptions = defaults.deadLetteringOnFilterEvaluationExceptions;
    	      this.deadLetteringOnMessageExpiration = defaults.deadLetteringOnMessageExpiration;
    	      this.defaultMessageTimeToLive = defaults.defaultMessageTimeToLive;
    	      this.duplicateDetectionHistoryTimeWindow = defaults.duplicateDetectionHistoryTimeWindow;
    	      this.enableBatchedOperations = defaults.enableBatchedOperations;
    	      this.forwardDeadLetteredMessagesTo = defaults.forwardDeadLetteredMessagesTo;
    	      this.forwardTo = defaults.forwardTo;
    	      this.lockDuration = defaults.lockDuration;
    	      this.maxDeliveryCount = defaults.maxDeliveryCount;
    	      this.namespaceName = defaults.namespaceName;
    	      this.requiresSession = defaults.requiresSession;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
    	      this.subscriptionName = defaults.subscriptionName;
    	      this.topicName = defaults.topicName;
        }

        public Builder setAutoDeleteOnIdle(@Nullable Input<String> autoDeleteOnIdle) {
            this.autoDeleteOnIdle = autoDeleteOnIdle;
            return this;
        }

        public Builder setAutoDeleteOnIdle(@Nullable String autoDeleteOnIdle) {
            this.autoDeleteOnIdle = Input.ofNullable(autoDeleteOnIdle);
            return this;
        }

        public Builder setDeadLetteringOnFilterEvaluationExceptions(@Nullable Input<Boolean> deadLetteringOnFilterEvaluationExceptions) {
            this.deadLetteringOnFilterEvaluationExceptions = deadLetteringOnFilterEvaluationExceptions;
            return this;
        }

        public Builder setDeadLetteringOnFilterEvaluationExceptions(@Nullable Boolean deadLetteringOnFilterEvaluationExceptions) {
            this.deadLetteringOnFilterEvaluationExceptions = Input.ofNullable(deadLetteringOnFilterEvaluationExceptions);
            return this;
        }

        public Builder setDeadLetteringOnMessageExpiration(@Nullable Input<Boolean> deadLetteringOnMessageExpiration) {
            this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
            return this;
        }

        public Builder setDeadLetteringOnMessageExpiration(@Nullable Boolean deadLetteringOnMessageExpiration) {
            this.deadLetteringOnMessageExpiration = Input.ofNullable(deadLetteringOnMessageExpiration);
            return this;
        }

        public Builder setDefaultMessageTimeToLive(@Nullable Input<String> defaultMessageTimeToLive) {
            this.defaultMessageTimeToLive = defaultMessageTimeToLive;
            return this;
        }

        public Builder setDefaultMessageTimeToLive(@Nullable String defaultMessageTimeToLive) {
            this.defaultMessageTimeToLive = Input.ofNullable(defaultMessageTimeToLive);
            return this;
        }

        public Builder setDuplicateDetectionHistoryTimeWindow(@Nullable Input<String> duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            return this;
        }

        public Builder setDuplicateDetectionHistoryTimeWindow(@Nullable String duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = Input.ofNullable(duplicateDetectionHistoryTimeWindow);
            return this;
        }

        public Builder setEnableBatchedOperations(@Nullable Input<Boolean> enableBatchedOperations) {
            this.enableBatchedOperations = enableBatchedOperations;
            return this;
        }

        public Builder setEnableBatchedOperations(@Nullable Boolean enableBatchedOperations) {
            this.enableBatchedOperations = Input.ofNullable(enableBatchedOperations);
            return this;
        }

        public Builder setForwardDeadLetteredMessagesTo(@Nullable Input<String> forwardDeadLetteredMessagesTo) {
            this.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
            return this;
        }

        public Builder setForwardDeadLetteredMessagesTo(@Nullable String forwardDeadLetteredMessagesTo) {
            this.forwardDeadLetteredMessagesTo = Input.ofNullable(forwardDeadLetteredMessagesTo);
            return this;
        }

        public Builder setForwardTo(@Nullable Input<String> forwardTo) {
            this.forwardTo = forwardTo;
            return this;
        }

        public Builder setForwardTo(@Nullable String forwardTo) {
            this.forwardTo = Input.ofNullable(forwardTo);
            return this;
        }

        public Builder setLockDuration(@Nullable Input<String> lockDuration) {
            this.lockDuration = lockDuration;
            return this;
        }

        public Builder setLockDuration(@Nullable String lockDuration) {
            this.lockDuration = Input.ofNullable(lockDuration);
            return this;
        }

        public Builder setMaxDeliveryCount(@Nullable Input<Integer> maxDeliveryCount) {
            this.maxDeliveryCount = maxDeliveryCount;
            return this;
        }

        public Builder setMaxDeliveryCount(@Nullable Integer maxDeliveryCount) {
            this.maxDeliveryCount = Input.ofNullable(maxDeliveryCount);
            return this;
        }

        public Builder setNamespaceName(Input<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Input.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder setRequiresSession(@Nullable Input<Boolean> requiresSession) {
            this.requiresSession = requiresSession;
            return this;
        }

        public Builder setRequiresSession(@Nullable Boolean requiresSession) {
            this.requiresSession = Input.ofNullable(requiresSession);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setStatus(@Nullable Input<EntityStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable EntityStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setSubscriptionName(@Nullable Input<String> subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }

        public Builder setSubscriptionName(@Nullable String subscriptionName) {
            this.subscriptionName = Input.ofNullable(subscriptionName);
            return this;
        }

        public Builder setTopicName(Input<String> topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }

        public Builder setTopicName(String topicName) {
            this.topicName = Input.of(Objects.requireNonNull(topicName));
            return this;
        }
        public SubscriptionArgs build() {
            return new SubscriptionArgs(autoDeleteOnIdle, deadLetteringOnFilterEvaluationExceptions, deadLetteringOnMessageExpiration, defaultMessageTimeToLive, duplicateDetectionHistoryTimeWindow, enableBatchedOperations, forwardDeadLetteredMessagesTo, forwardTo, lockDuration, maxDeliveryCount, namespaceName, requiresSession, resourceGroupName, status, subscriptionName, topicName);
        }
    }
}
