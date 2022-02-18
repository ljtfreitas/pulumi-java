// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TrackingInfoResponse {
    /**
     * Name of the carrier used in the delivery.
     * 
     */
    private final @Nullable String carrierName;
    /**
     * Serial number of the device being tracked.
     * 
     */
    private final @Nullable String serialNumber;
    /**
     * Tracking ID of the shipment.
     * 
     */
    private final @Nullable String trackingId;
    /**
     * Tracking URL of the shipment.
     * 
     */
    private final @Nullable String trackingUrl;

    @OutputCustomType.Constructor({"carrierName","serialNumber","trackingId","trackingUrl"})
    private TrackingInfoResponse(
        @Nullable String carrierName,
        @Nullable String serialNumber,
        @Nullable String trackingId,
        @Nullable String trackingUrl) {
        this.carrierName = carrierName;
        this.serialNumber = serialNumber;
        this.trackingId = trackingId;
        this.trackingUrl = trackingUrl;
    }

    /**
     * Name of the carrier used in the delivery.
     * 
     */
    public Optional<String> getCarrierName() {
        return Optional.ofNullable(this.carrierName);
    }
    /**
     * Serial number of the device being tracked.
     * 
     */
    public Optional<String> getSerialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }
    /**
     * Tracking ID of the shipment.
     * 
     */
    public Optional<String> getTrackingId() {
        return Optional.ofNullable(this.trackingId);
    }
    /**
     * Tracking URL of the shipment.
     * 
     */
    public Optional<String> getTrackingUrl() {
        return Optional.ofNullable(this.trackingUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrackingInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String carrierName;
        private @Nullable String serialNumber;
        private @Nullable String trackingId;
        private @Nullable String trackingUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(TrackingInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierName = defaults.carrierName;
    	      this.serialNumber = defaults.serialNumber;
    	      this.trackingId = defaults.trackingId;
    	      this.trackingUrl = defaults.trackingUrl;
        }

        public Builder setCarrierName(@Nullable String carrierName) {
            this.carrierName = carrierName;
            return this;
        }

        public Builder setSerialNumber(@Nullable String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder setTrackingId(@Nullable String trackingId) {
            this.trackingId = trackingId;
            return this;
        }

        public Builder setTrackingUrl(@Nullable String trackingUrl) {
            this.trackingUrl = trackingUrl;
            return this;
        }

        public TrackingInfoResponse build() {
            return new TrackingInfoResponse(carrierName, serialNumber, trackingId, trackingUrl);
        }
    }
}
