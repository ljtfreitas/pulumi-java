// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.domains_v1.inputs.PostalAddressResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Details required for a contact associated with a `Registration`.
 * 
 */
public final class ContactResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContactResponse Empty = new ContactResponse();

    /**
     * Email address of the contact.
     * 
     */
    @InputImport(name="email", required=true)
      private final String email;

    public String getEmail() {
        return this.email;
    }

    /**
     * Fax number of the contact in international format. For example, `"+1-800-555-0123"`.
     * 
     */
    @InputImport(name="faxNumber", required=true)
      private final String faxNumber;

    public String getFaxNumber() {
        return this.faxNumber;
    }

    /**
     * Phone number of the contact in international format. For example, `"+1-800-555-0123"`.
     * 
     */
    @InputImport(name="phoneNumber", required=true)
      private final String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Postal address of the contact.
     * 
     */
    @InputImport(name="postalAddress", required=true)
      private final PostalAddressResponse postalAddress;

    public PostalAddressResponse getPostalAddress() {
        return this.postalAddress;
    }

    public ContactResponse(
        String email,
        String faxNumber,
        String phoneNumber,
        PostalAddressResponse postalAddress) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.faxNumber = Objects.requireNonNull(faxNumber, "expected parameter 'faxNumber' to be non-null");
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
        this.postalAddress = Objects.requireNonNull(postalAddress, "expected parameter 'postalAddress' to be non-null");
    }

    private ContactResponse() {
        this.email = null;
        this.faxNumber = null;
        this.phoneNumber = null;
        this.postalAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String faxNumber;
        private String phoneNumber;
        private PostalAddressResponse postalAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.faxNumber = defaults.faxNumber;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.postalAddress = defaults.postalAddress;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setFaxNumber(String faxNumber) {
            this.faxNumber = Objects.requireNonNull(faxNumber);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder setPostalAddress(PostalAddressResponse postalAddress) {
            this.postalAddress = Objects.requireNonNull(postalAddress);
            return this;
        }
        public ContactResponse build() {
            return new ContactResponse(email, faxNumber, phoneNumber, postalAddress);
        }
    }
}
