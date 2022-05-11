// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemTopicEventSubscriptionStorageQueueEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystemTopicEventSubscriptionStorageQueueEndpointArgs Empty = new SystemTopicEventSubscriptionStorageQueueEndpointArgs();

    /**
     * Storage queue message time to live in seconds.
     * 
     */
    @Import(name="queueMessageTimeToLiveInSeconds")
    private @Nullable Output<Integer> queueMessageTimeToLiveInSeconds;

    /**
     * @return Storage queue message time to live in seconds.
     * 
     */
    public Optional<Output<Integer>> queueMessageTimeToLiveInSeconds() {
        return Optional.ofNullable(this.queueMessageTimeToLiveInSeconds);
    }

    /**
     * Specifies the name of the storage queue where the Event Subscription will receive events.
     * 
     */
    @Import(name="queueName", required=true)
    private Output<String> queueName;

    /**
     * @return Specifies the name of the storage queue where the Event Subscription will receive events.
     * 
     */
    public Output<String> queueName() {
        return this.queueName;
    }

    /**
     * Specifies the id of the storage account id where the storage queue is located.
     * 
     */
    @Import(name="storageAccountId", required=true)
    private Output<String> storageAccountId;

    /**
     * @return Specifies the id of the storage account id where the storage queue is located.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    private SystemTopicEventSubscriptionStorageQueueEndpointArgs() {}

    private SystemTopicEventSubscriptionStorageQueueEndpointArgs(SystemTopicEventSubscriptionStorageQueueEndpointArgs $) {
        this.queueMessageTimeToLiveInSeconds = $.queueMessageTimeToLiveInSeconds;
        this.queueName = $.queueName;
        this.storageAccountId = $.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemTopicEventSubscriptionStorageQueueEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemTopicEventSubscriptionStorageQueueEndpointArgs $;

        public Builder() {
            $ = new SystemTopicEventSubscriptionStorageQueueEndpointArgs();
        }

        public Builder(SystemTopicEventSubscriptionStorageQueueEndpointArgs defaults) {
            $ = new SystemTopicEventSubscriptionStorageQueueEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param queueMessageTimeToLiveInSeconds Storage queue message time to live in seconds.
         * 
         * @return builder
         * 
         */
        public Builder queueMessageTimeToLiveInSeconds(@Nullable Output<Integer> queueMessageTimeToLiveInSeconds) {
            $.queueMessageTimeToLiveInSeconds = queueMessageTimeToLiveInSeconds;
            return this;
        }

        /**
         * @param queueMessageTimeToLiveInSeconds Storage queue message time to live in seconds.
         * 
         * @return builder
         * 
         */
        public Builder queueMessageTimeToLiveInSeconds(Integer queueMessageTimeToLiveInSeconds) {
            return queueMessageTimeToLiveInSeconds(Output.of(queueMessageTimeToLiveInSeconds));
        }

        /**
         * @param queueName Specifies the name of the storage queue where the Event Subscription will receive events.
         * 
         * @return builder
         * 
         */
        public Builder queueName(Output<String> queueName) {
            $.queueName = queueName;
            return this;
        }

        /**
         * @param queueName Specifies the name of the storage queue where the Event Subscription will receive events.
         * 
         * @return builder
         * 
         */
        public Builder queueName(String queueName) {
            return queueName(Output.of(queueName));
        }

        /**
         * @param storageAccountId Specifies the id of the storage account id where the storage queue is located.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId Specifies the id of the storage account id where the storage queue is located.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        public SystemTopicEventSubscriptionStorageQueueEndpointArgs build() {
            $.queueName = Objects.requireNonNull($.queueName, "expected parameter 'queueName' to be non-null");
            $.storageAccountId = Objects.requireNonNull($.storageAccountId, "expected parameter 'storageAccountId' to be non-null");
            return $;
        }
    }

}
