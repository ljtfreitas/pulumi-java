// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ShippingInformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ShippingInformationArgs Empty = new ShippingInformationArgs();

    @InputImport(name="city")
    private final @Nullable Input<String> city;

    public Input<String> getCity() {
        return this.city == null ? Input.empty() : this.city;
    }

    @InputImport(name="countryOrRegion")
    private final @Nullable Input<String> countryOrRegion;

    public Input<String> getCountryOrRegion() {
        return this.countryOrRegion == null ? Input.empty() : this.countryOrRegion;
    }

    @InputImport(name="phone")
    private final @Nullable Input<String> phone;

    public Input<String> getPhone() {
        return this.phone == null ? Input.empty() : this.phone;
    }

    @InputImport(name="postalCode")
    private final @Nullable Input<String> postalCode;

    public Input<String> getPostalCode() {
        return this.postalCode == null ? Input.empty() : this.postalCode;
    }

    @InputImport(name="recipientName")
    private final @Nullable Input<String> recipientName;

    public Input<String> getRecipientName() {
        return this.recipientName == null ? Input.empty() : this.recipientName;
    }

    @InputImport(name="stateOrProvince")
    private final @Nullable Input<String> stateOrProvince;

    public Input<String> getStateOrProvince() {
        return this.stateOrProvince == null ? Input.empty() : this.stateOrProvince;
    }

    @InputImport(name="streetAddress1")
    private final @Nullable Input<String> streetAddress1;

    public Input<String> getStreetAddress1() {
        return this.streetAddress1 == null ? Input.empty() : this.streetAddress1;
    }

    @InputImport(name="streetAddress2")
    private final @Nullable Input<String> streetAddress2;

    public Input<String> getStreetAddress2() {
        return this.streetAddress2 == null ? Input.empty() : this.streetAddress2;
    }

    public ShippingInformationArgs(
        @Nullable Input<String> city,
        @Nullable Input<String> countryOrRegion,
        @Nullable Input<String> phone,
        @Nullable Input<String> postalCode,
        @Nullable Input<String> recipientName,
        @Nullable Input<String> stateOrProvince,
        @Nullable Input<String> streetAddress1,
        @Nullable Input<String> streetAddress2) {
        this.city = city;
        this.countryOrRegion = countryOrRegion;
        this.phone = phone;
        this.postalCode = postalCode;
        this.recipientName = recipientName;
        this.stateOrProvince = stateOrProvince;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
    }

    private ShippingInformationArgs() {
        this.city = Input.empty();
        this.countryOrRegion = Input.empty();
        this.phone = Input.empty();
        this.postalCode = Input.empty();
        this.recipientName = Input.empty();
        this.stateOrProvince = Input.empty();
        this.streetAddress1 = Input.empty();
        this.streetAddress2 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShippingInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> city;
        private @Nullable Input<String> countryOrRegion;
        private @Nullable Input<String> phone;
        private @Nullable Input<String> postalCode;
        private @Nullable Input<String> recipientName;
        private @Nullable Input<String> stateOrProvince;
        private @Nullable Input<String> streetAddress1;
        private @Nullable Input<String> streetAddress2;

        public Builder() {
    	      // Empty
        }

        public Builder(ShippingInformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.countryOrRegion = defaults.countryOrRegion;
    	      this.phone = defaults.phone;
    	      this.postalCode = defaults.postalCode;
    	      this.recipientName = defaults.recipientName;
    	      this.stateOrProvince = defaults.stateOrProvince;
    	      this.streetAddress1 = defaults.streetAddress1;
    	      this.streetAddress2 = defaults.streetAddress2;
        }

        public Builder setCity(@Nullable Input<String> city) {
            this.city = city;
            return this;
        }

        public Builder setCity(@Nullable String city) {
            this.city = Input.ofNullable(city);
            return this;
        }

        public Builder setCountryOrRegion(@Nullable Input<String> countryOrRegion) {
            this.countryOrRegion = countryOrRegion;
            return this;
        }

        public Builder setCountryOrRegion(@Nullable String countryOrRegion) {
            this.countryOrRegion = Input.ofNullable(countryOrRegion);
            return this;
        }

        public Builder setPhone(@Nullable Input<String> phone) {
            this.phone = phone;
            return this;
        }

        public Builder setPhone(@Nullable String phone) {
            this.phone = Input.ofNullable(phone);
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

        public Builder setRecipientName(@Nullable Input<String> recipientName) {
            this.recipientName = recipientName;
            return this;
        }

        public Builder setRecipientName(@Nullable String recipientName) {
            this.recipientName = Input.ofNullable(recipientName);
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

        public Builder setStreetAddress1(@Nullable Input<String> streetAddress1) {
            this.streetAddress1 = streetAddress1;
            return this;
        }

        public Builder setStreetAddress1(@Nullable String streetAddress1) {
            this.streetAddress1 = Input.ofNullable(streetAddress1);
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

        public ShippingInformationArgs build() {
            return new ShippingInformationArgs(city, countryOrRegion, phone, postalCode, recipientName, stateOrProvince, streetAddress1, streetAddress2);
        }
    }
}