// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.pubsublite_v1.outputs.CapacityResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PartitionConfigResponse {
    /**
     * The capacity configuration.
     * 
     */
    private final CapacityResponse capacity;
    /**
     * The number of partitions in the topic. Must be at least 1. Once a topic has been created the number of partitions can be increased but not decreased. Message ordering is not guaranteed across a topic resize. For more information see https://cloud.google.com/pubsub/lite/docs/topics#scaling_capacity
     * 
     */
    private final String count;

    @OutputCustomType.Constructor({"capacity","count"})
    private PartitionConfigResponse(
        CapacityResponse capacity,
        String count) {
        this.capacity = Objects.requireNonNull(capacity);
        this.count = Objects.requireNonNull(count);
    }

    /**
     * The capacity configuration.
     * 
     */
    public CapacityResponse getCapacity() {
        return this.capacity;
    }
    /**
     * The number of partitions in the topic. Must be at least 1. Once a topic has been created the number of partitions can be increased but not decreased. Message ordering is not guaranteed across a topic resize. For more information see https://cloud.google.com/pubsub/lite/docs/topics#scaling_capacity
     * 
     */
    public String getCount() {
        return this.count;
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
