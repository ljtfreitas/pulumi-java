// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contact information for a customer account.
 * 
 */
public final class GoogleCloudChannelV1ContactInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudChannelV1ContactInfoArgs Empty = new GoogleCloudChannelV1ContactInfoArgs();

    /**
     * The customer account's contact email. Required for entitlements that create admin.google.com accounts, and serves as the customer's username for those accounts. Use this email to invite Team customers.
     * 
     */
    @InputImport(name="email")
      private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * The customer account contact's first name. Optional for Team customers.
     * 
     */
    @InputImport(name="firstName")
      private final @Nullable Input<String> firstName;

    public Input<String> getFirstName() {
        return this.firstName == null ? Input.empty() : this.firstName;
    }

    /**
     * The customer account contact's last name. Optional for Team customers.
     * 
     */
    @InputImport(name="lastName")
      private final @Nullable Input<String> lastName;

    public Input<String> getLastName() {
        return this.lastName == null ? Input.empty() : this.lastName;
    }

    /**
     * The customer account's contact phone number.
     * 
     */
    @InputImport(name="phone")
      private final @Nullable Input<String> phone;

    public Input<String> getPhone() {
        return this.phone == null ? Input.empty() : this.phone;
    }

    /**
     * Optional. The customer account contact's job title.
     * 
     */
    @InputImport(name="title")
      private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public GoogleCloudChannelV1ContactInfoArgs(
        @Nullable Input<String> email,
        @Nullable Input<String> firstName,
        @Nullable Input<String> lastName,
        @Nullable Input<String> phone,
        @Nullable Input<String> title) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.title = title;
    }

    private GoogleCloudChannelV1ContactInfoArgs() {
        this.email = Input.empty();
        this.firstName = Input.empty();
        this.lastName = Input.empty();
        this.phone = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1ContactInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> email;
        private @Nullable Input<String> firstName;
        private @Nullable Input<String> lastName;
        private @Nullable Input<String> phone;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1ContactInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.phone = defaults.phone;
    	      this.title = defaults.title;
        }

        public Builder setEmail(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setFirstName(@Nullable Input<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setFirstName(@Nullable String firstName) {
            this.firstName = Input.ofNullable(firstName);
            return this;
        }

        public Builder setLastName(@Nullable Input<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setLastName(@Nullable String lastName) {
            this.lastName = Input.ofNullable(lastName);
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

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }
        public GoogleCloudChannelV1ContactInfoArgs build() {
            return new GoogleCloudChannelV1ContactInfoArgs(email, firstName, lastName, phone, title);
        }
    }
}
