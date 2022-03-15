// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The shipping address of the customer.
 * 
 */
public final class AddressResponse extends io.pulumi.resources.InvokeArgs {

    public static final AddressResponse Empty = new AddressResponse();

    /**
     * The address line1.
     * 
     */
    @Import(name="addressLine1")
      private final @Nullable String addressLine1;

    public Optional<String> getAddressLine1() {
        return this.addressLine1 == null ? Optional.empty() : Optional.ofNullable(this.addressLine1);
    }

    /**
     * The address line2.
     * 
     */
    @Import(name="addressLine2")
      private final @Nullable String addressLine2;

    public Optional<String> getAddressLine2() {
        return this.addressLine2 == null ? Optional.empty() : Optional.ofNullable(this.addressLine2);
    }

    /**
     * The address line3.
     * 
     */
    @Import(name="addressLine3")
      private final @Nullable String addressLine3;

    public Optional<String> getAddressLine3() {
        return this.addressLine3 == null ? Optional.empty() : Optional.ofNullable(this.addressLine3);
    }

    /**
     * The city name.
     * 
     */
    @Import(name="city")
      private final @Nullable String city;

    public Optional<String> getCity() {
        return this.city == null ? Optional.empty() : Optional.ofNullable(this.city);
    }

    /**
     * The country name.
     * 
     */
    @Import(name="country", required=true)
      private final String country;

    public String getCountry() {
        return this.country;
    }

    /**
     * The postal code.
     * 
     */
    @Import(name="postalCode")
      private final @Nullable String postalCode;

    public Optional<String> getPostalCode() {
        return this.postalCode == null ? Optional.empty() : Optional.ofNullable(this.postalCode);
    }

    /**
     * The state name.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public AddressResponse(
        @Nullable String addressLine1,
        @Nullable String addressLine2,
        @Nullable String addressLine3,
        @Nullable String city,
        String country,
        @Nullable String postalCode,
        @Nullable String state) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.country = Objects.requireNonNull(country, "expected parameter 'country' to be non-null");
        this.postalCode = postalCode;
        this.state = state;
    }

    private AddressResponse() {
        this.addressLine1 = null;
        this.addressLine2 = null;
        this.addressLine3 = null;
        this.city = null;
        this.country = null;
        this.postalCode = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressLine1;
        private @Nullable String addressLine2;
        private @Nullable String addressLine3;
        private @Nullable String city;
        private String country;
        private @Nullable String postalCode;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressLine1 = defaults.addressLine1;
    	      this.addressLine2 = defaults.addressLine2;
    	      this.addressLine3 = defaults.addressLine3;
    	      this.city = defaults.city;
    	      this.country = defaults.country;
    	      this.postalCode = defaults.postalCode;
    	      this.state = defaults.state;
        }

        public Builder addressLine1(@Nullable String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public Builder addressLine2(@Nullable String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public Builder addressLine3(@Nullable String addressLine3) {
            this.addressLine3 = addressLine3;
            return this;
        }

        public Builder city(@Nullable String city) {
            this.city = city;
            return this;
        }

        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }

        public Builder postalCode(@Nullable String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public AddressResponse build() {
            return new AddressResponse(addressLine1, addressLine2, addressLine3, city, country, postalCode, state);
        }
    }
}
