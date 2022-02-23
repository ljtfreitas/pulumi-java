// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.jobs_v4.outputs.LatLngResponse;
import io.pulumi.googlenative.jobs_v4.outputs.PostalAddressResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LocationResponse {
    /**
     * An object representing a latitude/longitude pair.
     * 
     */
    private final LatLngResponse latLng;
    /**
     * The type of a location, which corresponds to the address lines field of google.type.PostalAddress. For example, "Downtown, Atlanta, GA, USA" has a type of LocationType.NEIGHBORHOOD, and "Kansas City, KS, USA" has a type of LocationType.LOCALITY.
     * 
     */
    private final String locationType;
    /**
     * Postal address of the location that includes human readable information, such as postal delivery and payments addresses. Given a postal address, a postal service can deliver items to a premises, P.O. Box, or other delivery location.
     * 
     */
    private final PostalAddressResponse postalAddress;
    /**
     * Radius in miles of the job location. This value is derived from the location bounding box in which a circle with the specified radius centered from google.type.LatLng covers the area associated with the job location. For example, currently, "Mountain View, CA, USA" has a radius of 6.17 miles.
     * 
     */
    private final Double radiusMiles;

    @OutputCustomType.Constructor({"latLng","locationType","postalAddress","radiusMiles"})
    private LocationResponse(
        LatLngResponse latLng,
        String locationType,
        PostalAddressResponse postalAddress,
        Double radiusMiles) {
        this.latLng = Objects.requireNonNull(latLng);
        this.locationType = Objects.requireNonNull(locationType);
        this.postalAddress = Objects.requireNonNull(postalAddress);
        this.radiusMiles = Objects.requireNonNull(radiusMiles);
    }

    /**
     * An object representing a latitude/longitude pair.
     * 
     */
    public LatLngResponse getLatLng() {
        return this.latLng;
    }
    /**
     * The type of a location, which corresponds to the address lines field of google.type.PostalAddress. For example, "Downtown, Atlanta, GA, USA" has a type of LocationType.NEIGHBORHOOD, and "Kansas City, KS, USA" has a type of LocationType.LOCALITY.
     * 
     */
    public String getLocationType() {
        return this.locationType;
    }
    /**
     * Postal address of the location that includes human readable information, such as postal delivery and payments addresses. Given a postal address, a postal service can deliver items to a premises, P.O. Box, or other delivery location.
     * 
     */
    public PostalAddressResponse getPostalAddress() {
        return this.postalAddress;
    }
    /**
     * Radius in miles of the job location. This value is derived from the location bounding box in which a circle with the specified radius centered from google.type.LatLng covers the area associated with the job location. For example, currently, "Mountain View, CA, USA" has a radius of 6.17 miles.
     * 
     */
    public Double getRadiusMiles() {
        return this.radiusMiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LatLngResponse latLng;
        private String locationType;
        private PostalAddressResponse postalAddress;
        private Double radiusMiles;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latLng = defaults.latLng;
    	      this.locationType = defaults.locationType;
    	      this.postalAddress = defaults.postalAddress;
    	      this.radiusMiles = defaults.radiusMiles;
        }

        public Builder setLatLng(LatLngResponse latLng) {
            this.latLng = Objects.requireNonNull(latLng);
            return this;
        }

        public Builder setLocationType(String locationType) {
            this.locationType = Objects.requireNonNull(locationType);
            return this;
        }

        public Builder setPostalAddress(PostalAddressResponse postalAddress) {
            this.postalAddress = Objects.requireNonNull(postalAddress);
            return this;
        }

        public Builder setRadiusMiles(Double radiusMiles) {
            this.radiusMiles = Objects.requireNonNull(radiusMiles);
            return this;
        }
        public LocationResponse build() {
            return new LocationResponse(latLng, locationType, postalAddress, radiusMiles);
        }
    }
}
