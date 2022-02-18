// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.enums.AddressType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Shipping address where customer wishes to receive the device.
 * 
 */
public final class ShippingAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final ShippingAddressArgs Empty = new ShippingAddressArgs();

    /**
     * Type of address.
     * 
     */
    @InputImport(name="addressType")
    private final @Nullable Input<Either<String,AddressType>> addressType;

    public Input<Either<String,AddressType>> getAddressType() {
        return this.addressType == null ? Input.empty() : this.addressType;
    }

    /**
     * Name of the City.
     * 
     */
    @InputImport(name="city")
    private final @Nullable Input<String> city;

    public Input<String> getCity() {
        return this.city == null ? Input.empty() : this.city;
    }

    /**
     * Name of the company.
     * 
     */
    @InputImport(name="companyName")
    private final @Nullable Input<String> companyName;

    public Input<String> getCompanyName() {
        return this.companyName == null ? Input.empty() : this.companyName;
    }

    /**
     * Name of the Country.
     * 
     */
    @InputImport(name="country", required=true)
    private final Input<String> country;

    public Input<String> getCountry() {
        return this.country;
    }

    /**
     * Postal code.
     * 
     */
    @InputImport(name="postalCode")
    private final @Nullable Input<String> postalCode;

    public Input<String> getPostalCode() {
        return this.postalCode == null ? Input.empty() : this.postalCode;
    }

    /**
     * Name of the State or Province.
     * 
     */
    @InputImport(name="stateOrProvince")
    private final @Nullable Input<String> stateOrProvince;

    public Input<String> getStateOrProvince() {
        return this.stateOrProvince == null ? Input.empty() : this.stateOrProvince;
    }

    /**
     * Street Address line 1.
     * 
     */
    @InputImport(name="streetAddress1", required=true)
    private final Input<String> streetAddress1;

    public Input<String> getStreetAddress1() {
        return this.streetAddress1;
    }

    /**
     * Street Address line 2.
     * 
     */
    @InputImport(name="streetAddress2")
    private final @Nullable Input<String> streetAddress2;

    public Input<String> getStreetAddress2() {
        return this.streetAddress2 == null ? Input.empty() : this.streetAddress2;
    }

    /**
     * Street Address line 3.
     * 
     */
    @InputImport(name="streetAddress3")
    private final @Nullable Input<String> streetAddress3;

    public Input<String> getStreetAddress3() {
        return this.streetAddress3 == null ? Input.empty() : this.streetAddress3;
    }

    /**
     * Extended Zip Code.
     * 
     */
    @InputImport(name="zipExtendedCode")
    private final @Nullable Input<String> zipExtendedCode;

    public Input<String> getZipExtendedCode() {
        return this.zipExtendedCode == null ? Input.empty() : this.zipExtendedCode;
    }

    public ShippingAddressArgs(
        @Nullable Input<Either<String,AddressType>> addressType,
        @Nullable Input<String> city,
        @Nullable Input<String> companyName,
        Input<String> country,
        @Nullable Input<String> postalCode,
        @Nullable Input<String> stateOrProvince,
        Input<String> streetAddress1,
        @Nullable Input<String> streetAddress2,
        @Nullable Input<String> streetAddress3,
        @Nullable Input<String> zipExtendedCode) {
        this.addressType = addressType == null ? Input.ofLeft("None") : addressType;
        this.city = city;
        this.companyName = companyName;
        this.country = Objects.requireNonNull(country, "expected parameter 'country' to be non-null");
        this.postalCode = postalCode;
        this.stateOrProvince = stateOrProvince;
        this.streetAddress1 = Objects.requireNonNull(streetAddress1, "expected parameter 'streetAddress1' to be non-null");
        this.streetAddress2 = streetAddress2;
        this.streetAddress3 = streetAddress3;
        this.zipExtendedCode = zipExtendedCode;
    }

    private ShippingAddressArgs() {
        this.addressType = Input.empty();
        this.city = Input.empty();
        this.companyName = Input.empty();
        this.country = Input.empty();
        this.postalCode = Input.empty();
        this.stateOrProvince = Input.empty();
        this.streetAddress1 = Input.empty();
        this.streetAddress2 = Input.empty();
        this.streetAddress3 = Input.empty();
        this.zipExtendedCode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShippingAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AddressType>> addressType;
        private @Nullable Input<String> city;
        private @Nullable Input<String> companyName;
        private Input<String> country;
        private @Nullable Input<String> postalCode;
        private @Nullable Input<String> stateOrProvince;
        private Input<String> streetAddress1;
        private @Nullable Input<String> streetAddress2;
        private @Nullable Input<String> streetAddress3;
        private @Nullable Input<String> zipExtendedCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ShippingAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressType = defaults.addressType;
    	      this.city = defaults.city;
    	      this.companyName = defaults.companyName;
    	      this.country = defaults.country;
    	      this.postalCode = defaults.postalCode;
    	      this.stateOrProvince = defaults.stateOrProvince;
    	      this.streetAddress1 = defaults.streetAddress1;
    	      this.streetAddress2 = defaults.streetAddress2;
    	      this.streetAddress3 = defaults.streetAddress3;
    	      this.zipExtendedCode = defaults.zipExtendedCode;
        }

        public Builder setAddressType(@Nullable Input<Either<String,AddressType>> addressType) {
            this.addressType = addressType;
            return this;
        }

        public Builder setAddressType(@Nullable Either<String,AddressType> addressType) {
            this.addressType = Input.ofNullable(addressType);
            return this;
        }

        public Builder setCity(@Nullable Input<String> city) {
            this.city = city;
            return this;
        }

        public Builder setCity(@Nullable String city) {
            this.city = Input.ofNullable(city);
            return this;
        }

        public Builder setCompanyName(@Nullable Input<String> companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder setCompanyName(@Nullable String companyName) {
            this.companyName = Input.ofNullable(companyName);
            return this;
        }

        public Builder setCountry(Input<String> country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }

        public Builder setCountry(String country) {
            this.country = Input.of(Objects.requireNonNull(country));
            return this;
        }

        public Builder setPostalCode(@Nullable Input<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setPostalCode(@Nullable String postalCode) {
            this.postalCode = Input.ofNullable(postalCode);
            return this;
        }

        public Builder setStateOrProvince(@Nullable Input<String> stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }

        public Builder setStateOrProvince(@Nullable String stateOrProvince) {
            this.stateOrProvince = Input.ofNullable(stateOrProvince);
            return this;
        }

        public Builder setStreetAddress1(Input<String> streetAddress1) {
            this.streetAddress1 = Objects.requireNonNull(streetAddress1);
            return this;
        }

        public Builder setStreetAddress1(String streetAddress1) {
            this.streetAddress1 = Input.of(Objects.requireNonNull(streetAddress1));
            return this;
        }

        public Builder setStreetAddress2(@Nullable Input<String> streetAddress2) {
            this.streetAddress2 = streetAddress2;
            return this;
        }

        public Builder setStreetAddress2(@Nullable String streetAddress2) {
            this.streetAddress2 = Input.ofNullable(streetAddress2);
            return this;
        }

        public Builder setStreetAddress3(@Nullable Input<String> streetAddress3) {
            this.streetAddress3 = streetAddress3;
            return this;
        }

        public Builder setStreetAddress3(@Nullable String streetAddress3) {
            this.streetAddress3 = Input.ofNullable(streetAddress3);
            return this;
        }

        public Builder setZipExtendedCode(@Nullable Input<String> zipExtendedCode) {
            this.zipExtendedCode = zipExtendedCode;
            return this;
        }

        public Builder setZipExtendedCode(@Nullable String zipExtendedCode) {
            this.zipExtendedCode = Input.ofNullable(zipExtendedCode);
            return this;
        }

        public ShippingAddressArgs build() {
            return new ShippingAddressArgs(addressType, city, companyName, country, postalCode, stateOrProvince, streetAddress1, streetAddress2, streetAddress3, zipExtendedCode);
        }
    }
}
