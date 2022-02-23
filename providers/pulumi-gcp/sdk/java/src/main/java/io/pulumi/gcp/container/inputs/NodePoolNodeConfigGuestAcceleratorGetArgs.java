// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodePoolNodeConfigGuestAcceleratorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigGuestAcceleratorGetArgs Empty = new NodePoolNodeConfigGuestAcceleratorGetArgs();

    @InputImport(name="count", required=true)
        private final Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count;
    }

    @InputImport(name="gpuPartitionSize")
        private final @Nullable Input<String> gpuPartitionSize;

    public Input<String> getGpuPartitionSize() {
        return this.gpuPartitionSize == null ? Input.empty() : this.gpuPartitionSize;
    }

    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public NodePoolNodeConfigGuestAcceleratorGetArgs(
        Input<Integer> count,
        @Nullable Input<String> gpuPartitionSize,
        Input<String> type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.gpuPartitionSize = gpuPartitionSize;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private NodePoolNodeConfigGuestAcceleratorGetArgs() {
        this.count = Input.empty();
        this.gpuPartitionSize = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigGuestAcceleratorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> count;
        private @Nullable Input<String> gpuPartitionSize;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNodeConfigGuestAcceleratorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.gpuPartitionSize = defaults.gpuPartitionSize;
    	      this.type = defaults.type;
        }

        public Builder setCount(Input<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = Input.of(Objects.requireNonNull(count));
            return this;
        }

        public Builder setGpuPartitionSize(@Nullable Input<String> gpuPartitionSize) {
            this.gpuPartitionSize = gpuPartitionSize;
            return this;
        }

        public Builder setGpuPartitionSize(@Nullable String gpuPartitionSize) {
            this.gpuPartitionSize = Input.ofNullable(gpuPartitionSize);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public NodePoolNodeConfigGuestAcceleratorGetArgs build() {
            return new NodePoolNodeConfigGuestAcceleratorGetArgs(count, gpuPartitionSize, type);
        }
    }
}
