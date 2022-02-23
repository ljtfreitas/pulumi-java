// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Preferences related to the shipment logistics of the sku
 * 
 */
public final class TransportPreferencesResponse extends io.pulumi.resources.InvokeArgs {

    public static final TransportPreferencesResponse Empty = new TransportPreferencesResponse();

    /**
     * Indicates Shipment Logistics type that the customer preferred.
     * 
     */
    @InputImport(name="preferredShipmentType", required=true)
        private final String preferredShipmentType;

    public String getPreferredShipmentType() {
        return this.preferredShipmentType;
    }

    public TransportPreferencesResponse(String preferredShipmentType) {
        this.preferredShipmentType = Objects.requireNonNull(preferredShipmentType, "expected parameter 'preferredShipmentType' to be non-null");
    }

    private TransportPreferencesResponse() {
        this.preferredShipmentType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransportPreferencesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String preferredShipmentType;

        public Builder() {
    	      // Empty
        }

        public Builder(TransportPreferencesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredShipmentType = defaults.preferredShipmentType;
        }

        public Builder setPreferredShipmentType(String preferredShipmentType) {
            this.preferredShipmentType = Objects.requireNonNull(preferredShipmentType);
            return this;
        }
        public TransportPreferencesResponse build() {
            return new TransportPreferencesResponse(preferredShipmentType);
        }
    }
}
