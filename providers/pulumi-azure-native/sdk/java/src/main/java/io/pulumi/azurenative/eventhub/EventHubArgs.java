// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.eventhub.enums.EntityStatus;
import io.pulumi.azurenative.eventhub.inputs.CaptureDescriptionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventHubArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubArgs Empty = new EventHubArgs();

    /**
     * Properties of capture description
     * 
     */
    @Import(name="captureDescription")
      private final @Nullable Output<CaptureDescriptionArgs> captureDescription;

    public Output<CaptureDescriptionArgs> getCaptureDescription() {
        return this.captureDescription == null ? Output.empty() : this.captureDescription;
    }

    /**
     * The Event Hub name
     * 
     */
    @Import(name="eventHubName")
      private final @Nullable Output<String> eventHubName;

    public Output<String> getEventHubName() {
        return this.eventHubName == null ? Output.empty() : this.eventHubName;
    }

    /**
     * Number of days to retain the events for this Event Hub, value should be 1 to 7 days
     * 
     */
    @Import(name="messageRetentionInDays")
      private final @Nullable Output<Double> messageRetentionInDays;

    public Output<Double> getMessageRetentionInDays() {
        return this.messageRetentionInDays == null ? Output.empty() : this.messageRetentionInDays;
    }

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Number of partitions created for the Event Hub, allowed values are from 1 to 32 partitions.
     * 
     */
    @Import(name="partitionCount")
      private final @Nullable Output<Double> partitionCount;

    public Output<Double> getPartitionCount() {
        return this.partitionCount == null ? Output.empty() : this.partitionCount;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Enumerates the possible values for the status of the Event Hub.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<EntityStatus> status;

    public Output<EntityStatus> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public EventHubArgs(
        @Nullable Output<CaptureDescriptionArgs> captureDescription,
        @Nullable Output<String> eventHubName,
        @Nullable Output<Double> messageRetentionInDays,
        Output<String> namespaceName,
        @Nullable Output<Double> partitionCount,
        Output<String> resourceGroupName,
        @Nullable Output<EntityStatus> status) {
        this.captureDescription = captureDescription;
        this.eventHubName = eventHubName;
        this.messageRetentionInDays = messageRetentionInDays;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.partitionCount = partitionCount;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.status = status;
    }

    private EventHubArgs() {
        this.captureDescription = Output.empty();
        this.eventHubName = Output.empty();
        this.messageRetentionInDays = Output.empty();
        this.namespaceName = Output.empty();
        this.partitionCount = Output.empty();
        this.resourceGroupName = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CaptureDescriptionArgs> captureDescription;
        private @Nullable Output<String> eventHubName;
        private @Nullable Output<Double> messageRetentionInDays;
        private Output<String> namespaceName;
        private @Nullable Output<Double> partitionCount;
        private Output<String> resourceGroupName;
        private @Nullable Output<EntityStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.captureDescription = defaults.captureDescription;
    	      this.eventHubName = defaults.eventHubName;
    	      this.messageRetentionInDays = defaults.messageRetentionInDays;
    	      this.namespaceName = defaults.namespaceName;
    	      this.partitionCount = defaults.partitionCount;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
        }

        public Builder captureDescription(@Nullable Output<CaptureDescriptionArgs> captureDescription) {
            this.captureDescription = captureDescription;
            return this;
        }

        public Builder captureDescription(@Nullable CaptureDescriptionArgs captureDescription) {
            this.captureDescription = Output.ofNullable(captureDescription);
            return this;
        }

        public Builder eventHubName(@Nullable Output<String> eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }

        public Builder eventHubName(@Nullable String eventHubName) {
            this.eventHubName = Output.ofNullable(eventHubName);
            return this;
        }

        public Builder messageRetentionInDays(@Nullable Output<Double> messageRetentionInDays) {
            this.messageRetentionInDays = messageRetentionInDays;
            return this;
        }

        public Builder messageRetentionInDays(@Nullable Double messageRetentionInDays) {
            this.messageRetentionInDays = Output.ofNullable(messageRetentionInDays);
            return this;
        }

        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder partitionCount(@Nullable Output<Double> partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        public Builder partitionCount(@Nullable Double partitionCount) {
            this.partitionCount = Output.ofNullable(partitionCount);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder status(@Nullable Output<EntityStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable EntityStatus status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public EventHubArgs build() {
            return new EventHubArgs(captureDescription, eventHubName, messageRetentionInDays, namespaceName, partitionCount, resourceGroupName, status);
        }
    }
}
