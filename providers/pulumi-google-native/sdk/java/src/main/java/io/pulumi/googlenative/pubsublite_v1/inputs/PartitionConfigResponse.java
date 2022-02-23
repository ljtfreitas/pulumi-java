// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.pubsublite_v1.inputs.CapacityResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The settings for a topic's partitions.
 * 
 */
public final class PartitionConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final PartitionConfigResponse Empty = new PartitionConfigResponse();

    /**
     * The capacity configuration.
     * 
     */
    @InputImport(name="capacity", required=true)
      private final CapacityResponse capacity;

    public CapacityResponse getCapacity() {
        return this.capacity;
    }

    /**
     * The number of partitions in the topic. Must be at least 1. Once a topic has been created the number of partitions can be increased but not decreased. Message ordering is not guaranteed across a topic resize. For more information see https://cloud.google.com/pubsub/lite/docs/topics#scaling_capacity
     * 
     */
    @InputImport(name="count", required=true)
      private final String count;

    public String getCount() {
        return this.count;
    }

    public PartitionConfigResponse(
        CapacityResponse capacity,
        String count) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
    }

    private PartitionConfigResponse() {
        this.capacity = null;
        this.count = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartitionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CapacityResponse capacity;
        private String count;

        public Builder() {
    	      // Empty
        }

        public Builder(PartitionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.count = defaults.count;
        }

        public Builder setCapacity(CapacityResponse capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder setCount(String count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public PartitionConfigResponse build() {
            return new PartitionConfigResponse(capacity, count);
        }
    }
}
