// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.eventhub.enums.EntityStatus;
import io.pulumi.azurenative.eventhub.inputs.CaptureDescriptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="captureDescription")
    private final @Nullable Input<CaptureDescriptionArgs> captureDescription;

    public Input<CaptureDescriptionArgs> getCaptureDescription() {
        return this.captureDescription == null ? Input.empty() : this.captureDescription;
    }

    /**
     * The Event Hub name
     * 
     */
    @InputImport(name="eventHubName")
    private final @Nullable Input<String> eventHubName;

    public Input<String> getEventHubName() {
        return this.eventHubName == null ? Input.empty() : this.eventHubName;
    }

    /**
     * Number of days to retain the events for this Event Hub, value should be 1 to 7 days
     * 
     */
    @InputImport(name="messageRetentionInDays")
    private final @Nullable Input<Double> messageRetentionInDays;

    public Input<Double> getMessageRetentionInDays() {
        return this.messageRetentionInDays == null ? Input.empty() : this.messageRetentionInDays;
    }

    /**
     * The Namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
    private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Number of partitions created for the Event Hub, allowed values are from 1 to 32 partitions.
     * 
     */
    @InputImport(name="partitionCount")
    private final @Nullable Input<Double> partitionCount;

    public Input<Double> getPartitionCount() {
        return this.partitionCount == null ? Input.empty() : this.partitionCount;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Enumerates the possible values for the status of the Event Hub.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<EntityStatus> status;

    public Input<EntityStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public EventHubArgs(
        @Nullable Input<CaptureDescriptionArgs> captureDescription,
        @Nullable Input<String> eventHubName,
        @Nullable Input<Double> messageRetentionInDays,
        Input<String> namespaceName,
        @Nullable Input<Double> partitionCount,
        Input<String> resourceGroupName,
        @Nullable Input<EntityStatus> status) {
        this.captureDescription = captureDescription;
        this.eventHubName = eventHubName;
        this.messageRetentionInDays = messageRetentionInDays;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.partitionCount = partitionCount;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.status = status;
    }

    private EventHubArgs() {
        this.captureDescription = Input.empty();
        this.eventHubName = Input.empty();
        this.messageRetentionInDays = Input.empty();
        this.namespaceName = Input.empty();
        this.partitionCount = Input.empty();
        this.resourceGroupName = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CaptureDescriptionArgs> captureDescription;
        private @Nullable Input<String> eventHubName;
        private @Nullable Input<Double> messageRetentionInDays;
        private Input<String> namespaceName;
        private @Nullable Input<Double> partitionCount;
        private Input<String> resourceGroupName;
        private @Nullable Input<EntityStatus> status;

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

        public Builder setCaptureDescription(@Nullable Input<CaptureDescriptionArgs> captureDescription) {
            this.captureDescription = captureDescription;
            return this;
        }

        public Builder setCaptureDescription(@Nullable CaptureDescriptionArgs captureDescription) {
            this.captureDescription = Input.ofNullable(captureDescription);
            return this;
        }

        public Builder setEventHubName(@Nullable Input<String> eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }

        public Builder setEventHubName(@Nullable String eventHubName) {
            this.eventHubName = Input.ofNullable(eventHubName);
            return this;
        }

        public Builder setMessageRetentionInDays(@Nullable Input<Double> messageRetentionInDays) {
            this.messageRetentionInDays = messageRetentionInDays;
            return this;
        }

        public Builder setMessageRetentionInDays(@Nullable Double messageRetentionInDays) {
            this.messageRetentionInDays = Input.ofNullable(messageRetentionInDays);
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

        public Builder setPartitionCount(@Nullable Input<Double> partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        public Builder setPartitionCount(@Nullable Double partitionCount) {
            this.partitionCount = Input.ofNullable(partitionCount);
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

        public EventHubArgs build() {
            return new EventHubArgs(captureDescription, eventHubName, messageRetentionInDays, namespaceName, partitionCount, resourceGroupName, status);
        }
    }
}
