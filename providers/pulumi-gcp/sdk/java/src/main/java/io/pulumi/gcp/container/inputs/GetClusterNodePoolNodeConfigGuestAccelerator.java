// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetClusterNodePoolNodeConfigGuestAccelerator extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodePoolNodeConfigGuestAccelerator Empty = new GetClusterNodePoolNodeConfigGuestAccelerator();

    @Import(name="count", required=true)
      private final Integer count;

    public Integer count() {
        return this.count;
    }

    @Import(name="gpuPartitionSize", required=true)
      private final String gpuPartitionSize;

    public String gpuPartitionSize() {
        return this.gpuPartitionSize;
    }

    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public GetClusterNodePoolNodeConfigGuestAccelerator(
        Integer count,
        String gpuPartitionSize,
        String type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.gpuPartitionSize = Objects.requireNonNull(gpuPartitionSize, "expected parameter 'gpuPartitionSize' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetClusterNodePoolNodeConfigGuestAccelerator() {
        this.count = null;
        this.gpuPartitionSize = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfigGuestAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String gpuPartitionSize;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNodeConfigGuestAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.gpuPartitionSize = defaults.gpuPartitionSize;
    	      this.type = defaults.type;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder gpuPartitionSize(String gpuPartitionSize) {
            this.gpuPartitionSize = Objects.requireNonNull(gpuPartitionSize);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetClusterNodePoolNodeConfigGuestAccelerator build() {
            return new GetClusterNodePoolNodeConfigGuestAccelerator(count, gpuPartitionSize, type);
        }
    }
}
