// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserInfoArgs Empty = new UserInfoArgs();

    /**
     * Email of the user used by Logz for contacting them if needed
     * 
     */
    @Import(name="emailAddress")
      private final @Nullable Output<String> emailAddress;

    public Output<String> getEmailAddress() {
        return this.emailAddress == null ? Output.empty() : this.emailAddress;
    }

    /**
     * First Name of the user
     * 
     */
    @Import(name="firstName")
      private final @Nullable Output<String> firstName;

    public Output<String> getFirstName() {
        return this.firstName == null ? Output.empty() : this.firstName;
    }

    /**
     * Last Name of the user
     * 
     */
    @Import(name="lastName")
      private final @Nullable Output<String> lastName;

    public Output<String> getLastName() {
        return this.lastName == null ? Output.empty() : this.lastName;
    }

    /**
     * Phone number of the user used by Logz for contacting them if needed
     * 
     */
    @Import(name="phoneNumber")
      private final @Nullable Output<String> phoneNumber;

    public Output<String> getPhoneNumber() {
        return this.phoneNumber == null ? Output.empty() : this.phoneNumber;
    }

    public UserInfoArgs(
        @Nullable Output<String> emailAddress,
        @Nullable Output<String> firstName,
        @Nullable Output<String> lastName,
        @Nullable Output<String> phoneNumber) {
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    private UserInfoArgs() {
        this.emailAddress = Output.empty();
        this.firstName = Output.empty();
        this.lastName = Output.empty();
        this.phoneNumber = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> emailAddress;
        private @Nullable Output<String> firstName;
        private @Nullable Output<String> lastName;
        private @Nullable Output<String> phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder emailAddress(@Nullable String emailAddress) {
            this.emailAddress = Output.ofNullable(emailAddress);
            return this;
        }

        public Builder firstName(@Nullable Output<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder firstName(@Nullable String firstName) {
            this.firstName = Output.ofNullable(firstName);
            return this;
        }

        public Builder lastName(@Nullable Output<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lastName(@Nullable String lastName) {
            this.lastName = Output.ofNullable(lastName);
            return this;
        }

        public Builder phoneNumber(@Nullable Output<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder phoneNumber(@Nullable String phoneNumber) {
            this.phoneNumber = Output.ofNullable(phoneNumber);
            return this;
        }
        public UserInfoArgs build() {
            return new UserInfoArgs(emailAddress, firstName, lastName, phoneNumber);
        }
    }
}
