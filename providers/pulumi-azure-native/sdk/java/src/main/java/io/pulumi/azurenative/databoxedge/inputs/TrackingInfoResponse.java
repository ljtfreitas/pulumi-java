// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Tracking courier information.
 * 
 */
public final class TrackingInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrackingInfoResponse Empty = new TrackingInfoResponse();

    /**
     * Name of the carrier used in the delivery.
     * 
     */
    @InputImport(name="carrierName")
        private final @Nullable String carrierName;

    public Optional<String> getCarrierName() {
        return this.carrierName == null ? Optional.empty() : Optional.ofNullable(this.carrierName);
    }

    /**
     * Serial number of the device being tracked.
     * 
     */
    @InputImport(name="serialNumber")
        private final @Nullable String serialNumber;

    public Optional<String> getSerialNumber() {
        return this.serialNumber == null ? Optional.empty() : Optional.ofNullable(this.serialNumber);
    }

    /**
     * Tracking ID of the shipment.
     * 
     */
    @InputImport(name="trackingId")
        private final @Nullable String trackingId;

    public Optional<String> getTrackingId() {
        return this.trackingId == null ? Optional.empty() : Optional.ofNullable(this.trackingId);
    }

    /**
     * Tracking URL of the shipment.
     * 
     */
    @InputImport(name="trackingUrl")
        private final @Nullable String trackingUrl;

    public Optional<String> getTrackingUrl() {
        return this.trackingUrl == null ? Optional.empty() : Optional.ofNullable(this.trackingUrl);
    }

    public TrackingInfoResponse(
        @Nullable String carrierName,
        @Nullable String serialNumber,
        @Nullable String trackingId,
        @Nullable String trackingUrl) {
        this.carrierName = carrierName;
        this.serialNumber = serialNumber;
        this.trackingId = trackingId;
        this.trackingUrl = trackingUrl;
    }

    private TrackingInfoResponse() {
        this.carrierName = null;
        this.serialNumber = null;
        this.trackingId = null;
        this.trackingUrl = null;
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
