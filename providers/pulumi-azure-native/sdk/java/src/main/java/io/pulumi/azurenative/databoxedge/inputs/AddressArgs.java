// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The shipping address of the customer.
 * 
 */
public final class AddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddressArgs Empty = new AddressArgs();

    /**
     * The address line1.
     * 
     */
    @InputImport(name="addressLine1")
    private final @Nullable Input<String> addressLine1;

    public Input<String> getAddressLine1() {
        return this.addressLine1 == null ? Input.empty() : this.addressLine1;
    }

    /**
     * The address line2.
     * 
     */
    @InputImport(name="addressLine2")
    private final @Nullable Input<String> addressLine2;

    public Input<String> getAddressLine2() {
        return this.addressLine2 == null ? Input.empty() : this.addressLine2;
    }

    /**
     * The address line3.
     * 
     */
    @InputImport(name="addressLine3")
    private final @Nullable Input<String> addressLine3;

    public Input<String> getAddressLine3() {
        return this.addressLine3 == null ? Input.empty() : this.addressLine3;
    }

    /**
     * The city name.
     * 
     */
    @InputImport(name="city")
    private final @Nullable Input<String> city;

    public Input<String> getCity() {
        return this.city == null ? Input.empty() : this.city;
    }

    /**
     * The country name.
     * 
     */
    @InputImport(name="country", required=true)
    private final Input<String> country;

    public Input<String> getCountry() {
        return this.country;
    }

    /**
     * The postal code.
     * 
     */
    @InputImport(name="postalCode")
    private final @Nullable Input<String> postalCode;

    public Input<String> getPostalCode() {
        return this.postalCode == null ? Input.empty() : this.postalCode;
    }

    /**
     * The state name.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public AddressArgs(
        @Nullable Input<String> addressLine1,
        @Nullable Input<String> addressLine2,
        @Nullable Input<String> addressLine3,
        @Nullable Input<String> city,
        Input<String> country,
        @Nullable Input<String> postalCode,
        @Nullable Input<String> state) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.country = Objects.requireNonNull(country, "expected parameter 'country' to be non-null");
        this.postalCode = postalCode;
        this.state = state;
    }

    private AddressArgs() {
        this.addressLine1 = Input.empty();
        this.addressLine2 = Input.empty();
        this.addressLine3 = Input.empty();
        this.city = Input.empty();
        this.country = Input.empty();
        this.postalCode = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addressLine1;
        private @Nullable Input<String> addressLine2;
        private @Nullable Input<String> addressLine3;
        private @Nullable Input<String> city;
        private Input<String> country;
        private @Nullable Input<String> postalCode;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressLine1 = defaults.addressLine1;
    	      this.addressLine2 = defaults.addressLine2;
    	      this.addressLine3 = defaults.addressLine3;
    	      this.city = defaults.city;
    	      this.country = defaults.country;
    	      this.postalCode = defaults.postalCode;
    	      this.state = defaults.state;
        }

        public Builder setAddressLine1(@Nullable Input<String> addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public Builder setAddressLine1(@Nullable String addressLine1) {
            this.addressLine1 = Input.ofNullable(addressLine1);
            return this;
        }

        public Builder setAddressLine2(@Nullable Input<String> addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public Builder setAddressLine2(@Nullable String addressLine2) {
            this.addressLine2 = Input.ofNullable(addressLine2);
            return this;
        }

        public Builder setAddressLine3(@Nullable Input<String> addressLine3) {
            this.addressLine3 = addressLine3;
            return this;
        }

        public Builder setAddressLine3(@Nullable String addressLine3) {
            this.addressLine3 = Input.ofNullable(addressLine3);
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

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public AddressArgs build() {
            return new AddressArgs(addressLine1, addressLine2, addressLine3, city, country, postalCode, state);
        }
    }
}
