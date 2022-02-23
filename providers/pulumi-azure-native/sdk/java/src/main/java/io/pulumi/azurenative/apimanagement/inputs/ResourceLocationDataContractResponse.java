// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource location data properties.
 * 
 */
public final class ResourceLocationDataContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceLocationDataContractResponse Empty = new ResourceLocationDataContractResponse();

    /**
     * The city or locality where the resource is located.
     * 
     */
    @InputImport(name="city")
        private final @Nullable String city;

    public Optional<String> getCity() {
        return this.city == null ? Optional.empty() : Optional.ofNullable(this.city);
    }

    /**
     * The country or region where the resource is located.
     * 
     */
    @InputImport(name="countryOrRegion")
        private final @Nullable String countryOrRegion;

    public Optional<String> getCountryOrRegion() {
        return this.countryOrRegion == null ? Optional.empty() : Optional.ofNullable(this.countryOrRegion);
    }

    /**
     * The district, state, or province where the resource is located.
     * 
     */
    @InputImport(name="district")
        private final @Nullable String district;

    public Optional<String> getDistrict() {
        return this.district == null ? Optional.empty() : Optional.ofNullable(this.district);
    }

    /**
     * A canonical name for the geographic or physical location.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    public ResourceLocationDataContractResponse(
        @Nullable String city,
        @Nullable String countryOrRegion,
        @Nullable String district,
        String name) {
        this.city = city;
        this.countryOrRegion = countryOrRegion;
        this.district = district;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ResourceLocationDataContractResponse() {
        this.city = null;
        this.countryOrRegion = null;
        this.district = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLocationDataContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String city;
        private @Nullable String countryOrRegion;
        private @Nullable String district;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLocationDataContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.countryOrRegion = defaults.countryOrRegion;
    	      this.district = defaults.district;
    	      this.name = defaults.name;
        }

        public Builder setCity(@Nullable String city) {
            this.city = city;
            return this;
        }

        public Builder setCountryOrRegion(@Nullable String countryOrRegion) {
            this.countryOrRegion = countryOrRegion;
            return this;
        }

        public Builder setDistrict(@Nullable String district) {
            this.district = district;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ResourceLocationDataContractResponse build() {
            return new ResourceLocationDataContractResponse(city, countryOrRegion, district, name);
        }
    }
}
