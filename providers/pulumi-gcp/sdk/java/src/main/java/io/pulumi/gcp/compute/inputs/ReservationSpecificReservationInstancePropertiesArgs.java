// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs;
import io.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesLocalSsdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationSpecificReservationInstancePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationSpecificReservationInstancePropertiesArgs Empty = new ReservationSpecificReservationInstancePropertiesArgs();

    /**
     * Guest accelerator type and count.
     * Structure is documented below.
     * 
     */
    @Import(name="guestAccelerators")
      private final @Nullable Output<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> guestAccelerators;

    public Output<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> guestAccelerators() {
        return this.guestAccelerators == null ? Codegen.empty() : this.guestAccelerators;
    }

    /**
     * The amount of local ssd to reserve with each instance. This
     * reserves disks of type `local-ssd`.
     * Structure is documented below.
     * 
     */
    @Import(name="localSsds")
      private final @Nullable Output<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> localSsds;

    public Output<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> localSsds() {
        return this.localSsds == null ? Codegen.empty() : this.localSsds;
    }

    /**
     * The name of the machine type to reserve.
     * 
     */
    @Import(name="machineType", required=true)
      private final Output<String> machineType;

    public Output<String> machineType() {
        return this.machineType;
    }

    /**
     * The minimum CPU platform for the reservation. For example,
     * `"Intel Skylake"`. See
     * the CPU platform availability reference](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform#availablezones)
     * for information on available CPU platforms.
     * 
     */
    @Import(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> minCpuPlatform() {
        return this.minCpuPlatform == null ? Codegen.empty() : this.minCpuPlatform;
    }

    public ReservationSpecificReservationInstancePropertiesArgs(
        @Nullable Output<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> guestAccelerators,
        @Nullable Output<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> localSsds,
        Output<String> machineType,
        @Nullable Output<String> minCpuPlatform) {
        this.guestAccelerators = guestAccelerators;
        this.localSsds = localSsds;
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.minCpuPlatform = minCpuPlatform;
    }

    private ReservationSpecificReservationInstancePropertiesArgs() {
        this.guestAccelerators = Codegen.empty();
        this.localSsds = Codegen.empty();
        this.machineType = Codegen.empty();
        this.minCpuPlatform = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationSpecificReservationInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> guestAccelerators;
        private @Nullable Output<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> localSsds;
        private Output<String> machineType;
        private @Nullable Output<String> minCpuPlatform;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationSpecificReservationInstancePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.localSsds = defaults.localSsds;
    	      this.machineType = defaults.machineType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
        }

        public Builder guestAccelerators(@Nullable Output<List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }
        public Builder guestAccelerators(@Nullable List<ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs> guestAccelerators) {
            this.guestAccelerators = Codegen.ofNullable(guestAccelerators);
            return this;
        }
        public Builder guestAccelerators(ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        public Builder localSsds(@Nullable Output<List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs>> localSsds) {
            this.localSsds = localSsds;
            return this;
        }
        public Builder localSsds(@Nullable List<ReservationSpecificReservationInstancePropertiesLocalSsdArgs> localSsds) {
            this.localSsds = Codegen.ofNullable(localSsds);
            return this;
        }
        public Builder localSsds(ReservationSpecificReservationInstancePropertiesLocalSsdArgs... localSsds) {
            return localSsds(List.of(localSsds));
        }
        public Builder machineType(Output<String> machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Output.of(Objects.requireNonNull(machineType));
            return this;
        }
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Codegen.ofNullable(minCpuPlatform);
            return this;
        }        public ReservationSpecificReservationInstancePropertiesArgs build() {
            return new ReservationSpecificReservationInstancePropertiesArgs(guestAccelerators, localSsds, machineType, minCpuPlatform);
        }
    }
}
