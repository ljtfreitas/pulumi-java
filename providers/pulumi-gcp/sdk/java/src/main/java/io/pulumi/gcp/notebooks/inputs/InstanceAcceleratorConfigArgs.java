// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceAcceleratorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAcceleratorConfigArgs Empty = new InstanceAcceleratorConfigArgs();

    /**
     * Count of cores of this accelerator.
     * 
     */
    @Import(name="coreCount", required=true)
      private final Output<Integer> coreCount;

    public Output<Integer> coreCount() {
        return this.coreCount;
    }

    /**
     * Type of this accelerator.
     * Possible values are `ACCELERATOR_TYPE_UNSPECIFIED`, `NVIDIA_TESLA_K80`, `NVIDIA_TESLA_P100`, `NVIDIA_TESLA_V100`, `NVIDIA_TESLA_P4`, `NVIDIA_TESLA_T4`, `NVIDIA_TESLA_T4_VWS`, `NVIDIA_TESLA_P100_VWS`, `NVIDIA_TESLA_P4_VWS`, `NVIDIA_TESLA_A100`, `TPU_V2`, and `TPU_V3`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public InstanceAcceleratorConfigArgs(
        Output<Integer> coreCount,
        Output<String> type) {
        this.coreCount = Objects.requireNonNull(coreCount, "expected parameter 'coreCount' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceAcceleratorConfigArgs() {
        this.coreCount = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> coreCount;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAcceleratorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.type = defaults.type;
        }

        public Builder coreCount(Output<Integer> coreCount) {
            this.coreCount = Objects.requireNonNull(coreCount);
            return this;
        }
        public Builder coreCount(Integer coreCount) {
            this.coreCount = Output.of(Objects.requireNonNull(coreCount));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public InstanceAcceleratorConfigArgs build() {
            return new InstanceAcceleratorConfigArgs(coreCount, type);
        }
    }
}
