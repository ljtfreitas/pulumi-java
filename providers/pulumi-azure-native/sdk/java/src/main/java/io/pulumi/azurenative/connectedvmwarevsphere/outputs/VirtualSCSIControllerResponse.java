// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualSCSIControllerResponse {
    /**
     * Gets or sets the bus number of the controller.
     * 
     */
    private final @Nullable Integer busNumber;
    /**
     * Gets or sets the key of the controller.
     * 
     */
    private final @Nullable Integer controllerKey;
    /**
     * Gets or sets the SCSI controller unit number.
     * 
     */
    private final @Nullable Integer scsiCtlrUnitNumber;
    /**
     * Gets or sets the sharing mode.
     * 
     */
    private final @Nullable String sharing;
    /**
     * Gets or sets the controller type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"busNumber","controllerKey","scsiCtlrUnitNumber","sharing","type"})
    private VirtualSCSIControllerResponse(
        @Nullable Integer busNumber,
        @Nullable Integer controllerKey,
        @Nullable Integer scsiCtlrUnitNumber,
        @Nullable String sharing,
        @Nullable String type) {
        this.busNumber = busNumber;
        this.controllerKey = controllerKey;
        this.scsiCtlrUnitNumber = scsiCtlrUnitNumber;
        this.sharing = sharing;
        this.type = type;
    }

    /**
     * Gets or sets the bus number of the controller.
     * 
     */
    public Optional<Integer> getBusNumber() {
        return Optional.ofNullable(this.busNumber);
    }
    /**
     * Gets or sets the key of the controller.
     * 
     */
    public Optional<Integer> getControllerKey() {
        return Optional.ofNullable(this.controllerKey);
    }
    /**
     * Gets or sets the SCSI controller unit number.
     * 
     */
    public Optional<Integer> getScsiCtlrUnitNumber() {
        return Optional.ofNullable(this.scsiCtlrUnitNumber);
    }
    /**
     * Gets or sets the sharing mode.
     * 
     */
    public Optional<String> getSharing() {
        return Optional.ofNullable(this.sharing);
    }
    /**
     * Gets or sets the controller type.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualSCSIControllerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer busNumber;
        private @Nullable Integer controllerKey;
        private @Nullable Integer scsiCtlrUnitNumber;
        private @Nullable String sharing;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualSCSIControllerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.busNumber = defaults.busNumber;
    	      this.controllerKey = defaults.controllerKey;
    	      this.scsiCtlrUnitNumber = defaults.scsiCtlrUnitNumber;
    	      this.sharing = defaults.sharing;
    	      this.type = defaults.type;
        }

        public Builder setBusNumber(@Nullable Integer busNumber) {
            this.busNumber = busNumber;
            return this;
        }

        public Builder setControllerKey(@Nullable Integer controllerKey) {
            this.controllerKey = controllerKey;
            return this;
        }

        public Builder setScsiCtlrUnitNumber(@Nullable Integer scsiCtlrUnitNumber) {
            this.scsiCtlrUnitNumber = scsiCtlrUnitNumber;
            return this;
        }

        public Builder setSharing(@Nullable String sharing) {
            this.sharing = sharing;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public VirtualSCSIControllerResponse build() {
            return new VirtualSCSIControllerResponse(busNumber, controllerKey, scsiCtlrUnitNumber, sharing, type);
        }
    }
}
