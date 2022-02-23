// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about the package being shipped by the customer to the Microsoft data center.
 * 
 */
public final class PackageInformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageInformationArgs Empty = new PackageInformationArgs();

    /**
     * The name of the carrier that is used to ship the import or export drives.
     * 
     */
    @InputImport(name="carrierName", required=true)
        private final Input<String> carrierName;

    public Input<String> getCarrierName() {
        return this.carrierName;
    }

    /**
     * The number of drives included in the package.
     * 
     */
    @InputImport(name="driveCount", required=true)
        private final Input<Double> driveCount;

    public Input<Double> getDriveCount() {
        return this.driveCount;
    }

    /**
     * The date when the package is shipped.
     * 
     */
    @InputImport(name="shipDate", required=true)
        private final Input<String> shipDate;

    public Input<String> getShipDate() {
        return this.shipDate;
    }

    /**
     * The tracking number of the package.
     * 
     */
    @InputImport(name="trackingNumber", required=true)
        private final Input<String> trackingNumber;

    public Input<String> getTrackingNumber() {
        return this.trackingNumber;
    }

    public PackageInformationArgs(
        Input<String> carrierName,
        Input<Double> driveCount,
        Input<String> shipDate,
        Input<String> trackingNumber) {
        this.carrierName = Objects.requireNonNull(carrierName, "expected parameter 'carrierName' to be non-null");
        this.driveCount = Objects.requireNonNull(driveCount, "expected parameter 'driveCount' to be non-null");
        this.shipDate = Objects.requireNonNull(shipDate, "expected parameter 'shipDate' to be non-null");
        this.trackingNumber = Objects.requireNonNull(trackingNumber, "expected parameter 'trackingNumber' to be non-null");
    }

    private PackageInformationArgs() {
        this.carrierName = Input.empty();
        this.driveCount = Input.empty();
        this.shipDate = Input.empty();
        this.trackingNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> carrierName;
        private Input<Double> driveCount;
        private Input<String> shipDate;
        private Input<String> trackingNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageInformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierName = defaults.carrierName;
    	      this.driveCount = defaults.driveCount;
    	      this.shipDate = defaults.shipDate;
    	      this.trackingNumber = defaults.trackingNumber;
        }

        public Builder setCarrierName(Input<String> carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }

        public Builder setCarrierName(String carrierName) {
            this.carrierName = Input.of(Objects.requireNonNull(carrierName));
            return this;
        }

        public Builder setDriveCount(Input<Double> driveCount) {
            this.driveCount = Objects.requireNonNull(driveCount);
            return this;
        }

        public Builder setDriveCount(Double driveCount) {
            this.driveCount = Input.of(Objects.requireNonNull(driveCount));
            return this;
        }

        public Builder setShipDate(Input<String> shipDate) {
            this.shipDate = Objects.requireNonNull(shipDate);
            return this;
        }

        public Builder setShipDate(String shipDate) {
            this.shipDate = Input.of(Objects.requireNonNull(shipDate));
            return this;
        }

        public Builder setTrackingNumber(Input<String> trackingNumber) {
            this.trackingNumber = Objects.requireNonNull(trackingNumber);
            return this;
        }

        public Builder setTrackingNumber(String trackingNumber) {
            this.trackingNumber = Input.of(Objects.requireNonNull(trackingNumber));
            return this;
        }
        public PackageInformationArgs build() {
            return new PackageInformationArgs(carrierName, driveCount, shipDate, trackingNumber);
        }
    }
}
