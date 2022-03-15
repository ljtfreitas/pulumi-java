// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of the provisioned Event Hub-compatible endpoint used by the IoT hub.
 * 
 */
public final class EventHubPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubPropertiesArgs Empty = new EventHubPropertiesArgs();

    /**
     * The number of partitions for receiving device-to-cloud messages in the Event Hub-compatible endpoint. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     * 
     */
    @Import(name="partitionCount")
      private final @Nullable Output<Integer> partitionCount;

    public Output<Integer> getPartitionCount() {
        return this.partitionCount == null ? Output.empty() : this.partitionCount;
    }

    /**
     * The retention time for device-to-cloud messages in days. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages
     * 
     */
    @Import(name="retentionTimeInDays")
      private final @Nullable Output<Double> retentionTimeInDays;

    public Output<Double> getRetentionTimeInDays() {
        return this.retentionTimeInDays == null ? Output.empty() : this.retentionTimeInDays;
    }

    public EventHubPropertiesArgs(
        @Nullable Output<Integer> partitionCount,
        @Nullable Output<Double> retentionTimeInDays) {
        this.partitionCount = partitionCount;
        this.retentionTimeInDays = retentionTimeInDays;
    }

    private EventHubPropertiesArgs() {
        this.partitionCount = Output.empty();
        this.retentionTimeInDays = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> partitionCount;
        private @Nullable Output<Double> retentionTimeInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionCount = defaults.partitionCount;
    	      this.retentionTimeInDays = defaults.retentionTimeInDays;
        }

        public Builder partitionCount(@Nullable Output<Integer> partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        public Builder partitionCount(@Nullable Integer partitionCount) {
            this.partitionCount = Output.ofNullable(partitionCount);
            return this;
        }

        public Builder retentionTimeInDays(@Nullable Output<Double> retentionTimeInDays) {
            this.retentionTimeInDays = retentionTimeInDays;
            return this;
        }

        public Builder retentionTimeInDays(@Nullable Double retentionTimeInDays) {
            this.retentionTimeInDays = Output.ofNullable(retentionTimeInDays);
            return this;
        }
        public EventHubPropertiesArgs build() {
            return new EventHubPropertiesArgs(partitionCount, retentionTimeInDays);
        }
    }
}
