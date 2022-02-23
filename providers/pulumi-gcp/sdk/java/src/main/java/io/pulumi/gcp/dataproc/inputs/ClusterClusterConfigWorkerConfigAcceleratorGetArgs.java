// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ClusterClusterConfigWorkerConfigAcceleratorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigWorkerConfigAcceleratorGetArgs Empty = new ClusterClusterConfigWorkerConfigAcceleratorGetArgs();

    /**
     * The number of the accelerator cards of this type exposed to this instance. Often restricted to one of `1`, `2`, `4`, or `8`.
     * 
     */
    @InputImport(name="acceleratorCount", required=true)
        private final Input<Integer> acceleratorCount;

    public Input<Integer> getAcceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * The short name of the accelerator type to expose to this instance. For example, `nvidia-tesla-k80`.
     * 
     */
    @InputImport(name="acceleratorType", required=true)
        private final Input<String> acceleratorType;

    public Input<String> getAcceleratorType() {
        return this.acceleratorType;
    }

    public ClusterClusterConfigWorkerConfigAcceleratorGetArgs(
        Input<Integer> acceleratorCount,
        Input<String> acceleratorType) {
        this.acceleratorCount = Objects.requireNonNull(acceleratorCount, "expected parameter 'acceleratorCount' to be non-null");
        this.acceleratorType = Objects.requireNonNull(acceleratorType, "expected parameter 'acceleratorType' to be non-null");
    }

    private ClusterClusterConfigWorkerConfigAcceleratorGetArgs() {
        this.acceleratorCount = Input.empty();
        this.acceleratorType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigWorkerConfigAcceleratorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> acceleratorCount;
        private Input<String> acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigWorkerConfigAcceleratorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder setAcceleratorCount(Input<Integer> acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }

        public Builder setAcceleratorCount(Integer acceleratorCount) {
            this.acceleratorCount = Input.of(Objects.requireNonNull(acceleratorCount));
            return this;
        }

        public Builder setAcceleratorType(Input<String> acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Input.of(Objects.requireNonNull(acceleratorType));
            return this;
        }
        public ClusterClusterConfigWorkerConfigAcceleratorGetArgs build() {
            return new ClusterClusterConfigWorkerConfigAcceleratorGetArgs(acceleratorCount, acceleratorType);
        }
    }
}
