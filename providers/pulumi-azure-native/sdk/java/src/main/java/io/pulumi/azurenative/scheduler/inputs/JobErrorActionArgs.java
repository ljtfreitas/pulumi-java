// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.JobActionType;
import io.pulumi.azurenative.scheduler.inputs.HttpRequestArgs;
import io.pulumi.azurenative.scheduler.inputs.RetryPolicyArgs;
import io.pulumi.azurenative.scheduler.inputs.ServiceBusQueueMessageArgs;
import io.pulumi.azurenative.scheduler.inputs.ServiceBusTopicMessageArgs;
import io.pulumi.azurenative.scheduler.inputs.StorageQueueMessageArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobErrorActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobErrorActionArgs Empty = new JobErrorActionArgs();

    /**
     * Gets or sets the storage queue message.
     * 
     */
    @Import(name="queueMessage")
      private final @Nullable Output<StorageQueueMessageArgs> queueMessage;

    public Output<StorageQueueMessageArgs> getQueueMessage() {
        return this.queueMessage == null ? Output.empty() : this.queueMessage;
    }

    /**
     * Gets or sets the http requests.
     * 
     */
    @Import(name="request")
      private final @Nullable Output<HttpRequestArgs> request;

    public Output<HttpRequestArgs> getRequest() {
        return this.request == null ? Output.empty() : this.request;
    }

    /**
     * Gets or sets the retry policy.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RetryPolicyArgs> retryPolicy;

    public Output<RetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    /**
     * Gets or sets the service bus queue message.
     * 
     */
    @Import(name="serviceBusQueueMessage")
      private final @Nullable Output<ServiceBusQueueMessageArgs> serviceBusQueueMessage;

    public Output<ServiceBusQueueMessageArgs> getServiceBusQueueMessage() {
        return this.serviceBusQueueMessage == null ? Output.empty() : this.serviceBusQueueMessage;
    }

    /**
     * Gets or sets the service bus topic message.
     * 
     */
    @Import(name="serviceBusTopicMessage")
      private final @Nullable Output<ServiceBusTopicMessageArgs> serviceBusTopicMessage;

    public Output<ServiceBusTopicMessageArgs> getServiceBusTopicMessage() {
        return this.serviceBusTopicMessage == null ? Output.empty() : this.serviceBusTopicMessage;
    }

    /**
     * Gets or sets the job error action type.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<JobActionType> type;

    public Output<JobActionType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public JobErrorActionArgs(
        @Nullable Output<StorageQueueMessageArgs> queueMessage,
        @Nullable Output<HttpRequestArgs> request,
        @Nullable Output<RetryPolicyArgs> retryPolicy,
        @Nullable Output<ServiceBusQueueMessageArgs> serviceBusQueueMessage,
        @Nullable Output<ServiceBusTopicMessageArgs> serviceBusTopicMessage,
        @Nullable Output<JobActionType> type) {
        this.queueMessage = queueMessage;
        this.request = request;
        this.retryPolicy = retryPolicy;
        this.serviceBusQueueMessage = serviceBusQueueMessage;
        this.serviceBusTopicMessage = serviceBusTopicMessage;
        this.type = type;
    }

    private JobErrorActionArgs() {
        this.queueMessage = Output.empty();
        this.request = Output.empty();
        this.retryPolicy = Output.empty();
        this.serviceBusQueueMessage = Output.empty();
        this.serviceBusTopicMessage = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobErrorActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StorageQueueMessageArgs> queueMessage;
        private @Nullable Output<HttpRequestArgs> request;
        private @Nullable Output<RetryPolicyArgs> retryPolicy;
        private @Nullable Output<ServiceBusQueueMessageArgs> serviceBusQueueMessage;
        private @Nullable Output<ServiceBusTopicMessageArgs> serviceBusTopicMessage;
        private @Nullable Output<JobActionType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobErrorActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queueMessage = defaults.queueMessage;
    	      this.request = defaults.request;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.serviceBusQueueMessage = defaults.serviceBusQueueMessage;
    	      this.serviceBusTopicMessage = defaults.serviceBusTopicMessage;
    	      this.type = defaults.type;
        }

        public Builder queueMessage(@Nullable Output<StorageQueueMessageArgs> queueMessage) {
            this.queueMessage = queueMessage;
            return this;
        }

        public Builder queueMessage(@Nullable StorageQueueMessageArgs queueMessage) {
            this.queueMessage = Output.ofNullable(queueMessage);
            return this;
        }

        public Builder request(@Nullable Output<HttpRequestArgs> request) {
            this.request = request;
            return this;
        }

        public Builder request(@Nullable HttpRequestArgs request) {
            this.request = Output.ofNullable(request);
            return this;
        }

        public Builder retryPolicy(@Nullable Output<RetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(@Nullable RetryPolicyArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }

        public Builder serviceBusQueueMessage(@Nullable Output<ServiceBusQueueMessageArgs> serviceBusQueueMessage) {
            this.serviceBusQueueMessage = serviceBusQueueMessage;
            return this;
        }

        public Builder serviceBusQueueMessage(@Nullable ServiceBusQueueMessageArgs serviceBusQueueMessage) {
            this.serviceBusQueueMessage = Output.ofNullable(serviceBusQueueMessage);
            return this;
        }

        public Builder serviceBusTopicMessage(@Nullable Output<ServiceBusTopicMessageArgs> serviceBusTopicMessage) {
            this.serviceBusTopicMessage = serviceBusTopicMessage;
            return this;
        }

        public Builder serviceBusTopicMessage(@Nullable ServiceBusTopicMessageArgs serviceBusTopicMessage) {
            this.serviceBusTopicMessage = Output.ofNullable(serviceBusTopicMessage);
            return this;
        }

        public Builder type(@Nullable Output<JobActionType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable JobActionType type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public JobErrorActionArgs build() {
            return new JobErrorActionArgs(queueMessage, request, retryPolicy, serviceBusQueueMessage, serviceBusTopicMessage, type);
        }
    }
}
