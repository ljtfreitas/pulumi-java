// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs Empty = new ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs();

    /**
     * The number of the guest accelerator cards exposed to
     * this instance.
     * 
     */
    @Import(name="acceleratorCount", required=true)
      private final Output<Integer> acceleratorCount;

    public Output<Integer> acceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * The full or partial URL of the accelerator type to
     * attach to this instance. For example:
     * `projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100`
     * If you are creating an instance template, specify only the accelerator name.
     * 
     */
    @Import(name="acceleratorType", required=true)
      private final Output<String> acceleratorType;

    public Output<String> acceleratorType() {
        return this.acceleratorType;
    }

    public ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs(
        Output<Integer> acceleratorCount,
        Output<String> acceleratorType) {
        this.acceleratorCount = Objects.requireNonNull(acceleratorCount, "expected parameter 'acceleratorCount' to be non-null");
        this.acceleratorType = Objects.requireNonNull(acceleratorType, "expected parameter 'acceleratorType' to be non-null");
    }

    private ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs() {
        this.acceleratorCount = Codegen.empty();
        this.acceleratorType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> acceleratorCount;
        private Output<String> acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder acceleratorCount(Output<Integer> acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }
        public Builder acceleratorCount(Integer acceleratorCount) {
            this.acceleratorCount = Output.of(Objects.requireNonNull(acceleratorCount));
            return this;
        }
        public Builder acceleratorType(Output<String> acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = Output.of(Objects.requireNonNull(acceleratorType));
            return this;
        }        public ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs build() {
            return new ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs(acceleratorCount, acceleratorType);
        }
    }
}
