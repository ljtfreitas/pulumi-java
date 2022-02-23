// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.timeseriesinsights.enums.IngressStartAtType;
import io.pulumi.azurenative.timeseriesinsights.inputs.LocalTimestampArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IoTHubEventSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final IoTHubEventSourceArgs Empty = new IoTHubEventSourceArgs();

    /**
     * The name of the iot hub's consumer group that holds the partitions from which events will be read.
     * 
     */
    @InputImport(name="consumerGroupName", required=true)
        private final Input<String> consumerGroupName;

    public Input<String> getConsumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @InputImport(name="environmentName", required=true)
        private final Input<String> environmentName;

    public Input<String> getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * Name of the event source.
     * 
     */
    @InputImport(name="eventSourceName")
        private final @Nullable Input<String> eventSourceName;

    public Input<String> getEventSourceName() {
        return this.eventSourceName == null ? Input.empty() : this.eventSourceName;
    }

    /**
     * The resource id of the event source in Azure Resource Manager.
     * 
     */
    @InputImport(name="eventSourceResourceId", required=true)
        private final Input<String> eventSourceResourceId;

    public Input<String> getEventSourceResourceId() {
        return this.eventSourceResourceId;
    }

    /**
     * The name of the iot hub.
     * 
     */
    @InputImport(name="iotHubName", required=true)
        private final Input<String> iotHubName;

    public Input<String> getIotHubName() {
        return this.iotHubName;
    }

    /**
     * The name of the Shared Access Policy key that grants the Time Series Insights service access to the iot hub. This shared access policy key must grant 'service connect' permissions to the iot hub.
     * 
     */
    @InputImport(name="keyName", required=true)
        private final Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName;
    }

    /**
     * The kind of the event source.
     * Expected value is 'Microsoft.IoTHub'.
     * 
     */
    @InputImport(name="kind", required=true)
        private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * An object that represents the local timestamp property. It contains the format of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     * 
     */
    @InputImport(name="localTimestamp")
        private final @Nullable Input<LocalTimestampArgs> localTimestamp;

    public Input<LocalTimestampArgs> getLocalTimestamp() {
        return this.localTimestamp == null ? Input.empty() : this.localTimestamp;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The value of the Shared Access Policy key that grants the Time Series Insights service read access to the iot hub. This property is not shown in event source responses.
     * 
     */
    @InputImport(name="sharedAccessKey", required=true)
        private final Input<String> sharedAccessKey;

    public Input<String> getSharedAccessKey() {
        return this.sharedAccessKey;
    }

    /**
     * Key-value pairs of additional properties for the resource.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * ISO8601 UTC datetime with seconds precision (milliseconds are optional), specifying the date and time that will be the starting point for Events to be consumed.
     * 
     */
    @InputImport(name="time")
        private final @Nullable Input<String> time;

    public Input<String> getTime() {
        return this.time == null ? Input.empty() : this.time;
    }

    /**
     * The event property that will be used as the event source's timestamp. If a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     * 
     */
    @InputImport(name="timestampPropertyName")
        private final @Nullable Input<String> timestampPropertyName;

    public Input<String> getTimestampPropertyName() {
        return this.timestampPropertyName == null ? Input.empty() : this.timestampPropertyName;
    }

    /**
     * The type of the ingressStartAt, It can be "EarliestAvailable", "EventSourceCreationTime", "CustomEnqueuedTime".
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<Either<String,IngressStartAtType>> type;

    public Input<Either<String,IngressStartAtType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public IoTHubEventSourceArgs(
        Input<String> consumerGroupName,
        Input<String> environmentName,
        @Nullable Input<String> eventSourceName,
        Input<String> eventSourceResourceId,
        Input<String> iotHubName,
        Input<String> keyName,
        Input<String> kind,
        @Nullable Input<LocalTimestampArgs> localTimestamp,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<String> sharedAccessKey,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> time,
        @Nullable Input<String> timestampPropertyName,
        @Nullable Input<Either<String,IngressStartAtType>> type) {
        this.consumerGroupName = Objects.requireNonNull(consumerGroupName, "expected parameter 'consumerGroupName' to be non-null");
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.eventSourceName = eventSourceName;
        this.eventSourceResourceId = Objects.requireNonNull(eventSourceResourceId, "expected parameter 'eventSourceResourceId' to be non-null");
        this.iotHubName = Objects.requireNonNull(iotHubName, "expected parameter 'iotHubName' to be non-null");
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.localTimestamp = localTimestamp;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sharedAccessKey = Objects.requireNonNull(sharedAccessKey, "expected parameter 'sharedAccessKey' to be non-null");
        this.tags = tags;
        this.time = time;
        this.timestampPropertyName = timestampPropertyName;
        this.type = type;
    }

    private IoTHubEventSourceArgs() {
        this.consumerGroupName = Input.empty();
        this.environmentName = Input.empty();
        this.eventSourceName = Input.empty();
        this.eventSourceResourceId = Input.empty();
        this.iotHubName = Input.empty();
        this.keyName = Input.empty();
        this.kind = Input.empty();
        this.localTimestamp = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sharedAccessKey = Input.empty();
        this.tags = Input.empty();
        this.time = Input.empty();
        this.timestampPropertyName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTHubEventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> consumerGroupName;
        private Input<String> environmentName;
        private @Nullable Input<String> eventSourceName;
        private Input<String> eventSourceResourceId;
        private Input<String> iotHubName;
        private Input<String> keyName;
        private Input<String> kind;
        private @Nullable Input<LocalTimestampArgs> localTimestamp;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<String> sharedAccessKey;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> time;
        private @Nullable Input<String> timestampPropertyName;
        private @Nullable Input<Either<String,IngressStartAtType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTHubEventSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroupName = defaults.consumerGroupName;
    	      this.environmentName = defaults.environmentName;
    	      this.eventSourceName = defaults.eventSourceName;
    	      this.eventSourceResourceId = defaults.eventSourceResourceId;
    	      this.iotHubName = defaults.iotHubName;
    	      this.keyName = defaults.keyName;
    	      this.kind = defaults.kind;
    	      this.localTimestamp = defaults.localTimestamp;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sharedAccessKey = defaults.sharedAccessKey;
    	      this.tags = defaults.tags;
    	      this.time = defaults.time;
    	      this.timestampPropertyName = defaults.timestampPropertyName;
    	      this.type = defaults.type;
        }

        public Builder setConsumerGroupName(Input<String> consumerGroupName) {
            this.consumerGroupName = Objects.requireNonNull(consumerGroupName);
            return this;
        }

        public Builder setConsumerGroupName(String consumerGroupName) {
            this.consumerGroupName = Input.of(Objects.requireNonNull(consumerGroupName));
            return this;
        }

        public Builder setEnvironmentName(Input<String> environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }

        public Builder setEnvironmentName(String environmentName) {
            this.environmentName = Input.of(Objects.requireNonNull(environmentName));
            return this;
        }

        public Builder setEventSourceName(@Nullable Input<String> eventSourceName) {
            this.eventSourceName = eventSourceName;
            return this;
        }

        public Builder setEventSourceName(@Nullable String eventSourceName) {
            this.eventSourceName = Input.ofNullable(eventSourceName);
            return this;
        }

        public Builder setEventSourceResourceId(Input<String> eventSourceResourceId) {
            this.eventSourceResourceId = Objects.requireNonNull(eventSourceResourceId);
            return this;
        }

        public Builder setEventSourceResourceId(String eventSourceResourceId) {
            this.eventSourceResourceId = Input.of(Objects.requireNonNull(eventSourceResourceId));
            return this;
        }

        public Builder setIotHubName(Input<String> iotHubName) {
            this.iotHubName = Objects.requireNonNull(iotHubName);
            return this;
        }

        public Builder setIotHubName(String iotHubName) {
            this.iotHubName = Input.of(Objects.requireNonNull(iotHubName));
            return this;
        }

        public Builder setKeyName(Input<String> keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Input.of(Objects.requireNonNull(keyName));
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setLocalTimestamp(@Nullable Input<LocalTimestampArgs> localTimestamp) {
            this.localTimestamp = localTimestamp;
            return this;
        }

        public Builder setLocalTimestamp(@Nullable LocalTimestampArgs localTimestamp) {
            this.localTimestamp = Input.ofNullable(localTimestamp);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setSharedAccessKey(Input<String> sharedAccessKey) {
            this.sharedAccessKey = Objects.requireNonNull(sharedAccessKey);
            return this;
        }

        public Builder setSharedAccessKey(String sharedAccessKey) {
            this.sharedAccessKey = Input.of(Objects.requireNonNull(sharedAccessKey));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTime(@Nullable Input<String> time) {
            this.time = time;
            return this;
        }

        public Builder setTime(@Nullable String time) {
            this.time = Input.ofNullable(time);
            return this;
        }

        public Builder setTimestampPropertyName(@Nullable Input<String> timestampPropertyName) {
            this.timestampPropertyName = timestampPropertyName;
            return this;
        }

        public Builder setTimestampPropertyName(@Nullable String timestampPropertyName) {
            this.timestampPropertyName = Input.ofNullable(timestampPropertyName);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,IngressStartAtType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,IngressStartAtType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public IoTHubEventSourceArgs build() {
            return new IoTHubEventSourceArgs(consumerGroupName, environmentName, eventSourceName, eventSourceResourceId, iotHubName, keyName, kind, localTimestamp, location, resourceGroupName, sharedAccessKey, tags, time, timestampPropertyName, type);
        }
    }
}
