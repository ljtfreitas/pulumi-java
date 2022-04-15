// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.InstanceFromMachineImageReservationAffinitySpecificReservationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageReservationAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageReservationAffinityArgs Empty = new InstanceFromMachineImageReservationAffinityArgs();

    @Import(name="specificReservation")
      private final @Nullable Output<InstanceFromMachineImageReservationAffinitySpecificReservationArgs> specificReservation;

    public Output<InstanceFromMachineImageReservationAffinitySpecificReservationArgs> specificReservation() {
        return this.specificReservation == null ? Codegen.empty() : this.specificReservation;
    }

    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public InstanceFromMachineImageReservationAffinityArgs(
        @Nullable Output<InstanceFromMachineImageReservationAffinitySpecificReservationArgs> specificReservation,
        Output<String> type) {
        this.specificReservation = specificReservation;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceFromMachineImageReservationAffinityArgs() {
        this.specificReservation = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceFromMachineImageReservationAffinitySpecificReservationArgs> specificReservation;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageReservationAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservation = defaults.specificReservation;
    	      this.type = defaults.type;
        }

        public Builder specificReservation(@Nullable Output<InstanceFromMachineImageReservationAffinitySpecificReservationArgs> specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }
        public Builder specificReservation(@Nullable InstanceFromMachineImageReservationAffinitySpecificReservationArgs specificReservation) {
            this.specificReservation = Codegen.ofNullable(specificReservation);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public InstanceFromMachineImageReservationAffinityArgs build() {
            return new InstanceFromMachineImageReservationAffinityArgs(specificReservation, type);
        }
    }
}
