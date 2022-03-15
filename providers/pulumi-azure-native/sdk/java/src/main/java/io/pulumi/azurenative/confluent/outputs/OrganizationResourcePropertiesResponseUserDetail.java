// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confluent.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationResourcePropertiesResponseUserDetail {
    /**
     * Email address
     * 
     */
    private final @Nullable String emailAddress;
    /**
     * First name
     * 
     */
    private final @Nullable String firstName;
    /**
     * Last name
     * 
     */
    private final @Nullable String lastName;

    @CustomType.Constructor
    private OrganizationResourcePropertiesResponseUserDetail(
        @CustomType.Parameter("emailAddress") @Nullable String emailAddress,
        @CustomType.Parameter("firstName") @Nullable String firstName,
        @CustomType.Parameter("lastName") @Nullable String lastName) {
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Email address
     * 
    */
    public Optional<String> getEmailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }
    /**
     * First name
     * 
    */
    public Optional<String> getFirstName() {
        return Optional.ofNullable(this.firstName);
    }
    /**
     * Last name
     * 
    */
    public Optional<String> getLastName() {
        return Optional.ofNullable(this.lastName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationResourcePropertiesResponseUserDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailAddress;
        private @Nullable String firstName;
        private @Nullable String lastName;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationResourcePropertiesResponseUserDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
        }

        public Builder emailAddress(@Nullable String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder firstName(@Nullable String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(@Nullable String lastName) {
            this.lastName = lastName;
            return this;
        }
        public OrganizationResourcePropertiesResponseUserDetail build() {
            return new OrganizationResourcePropertiesResponseUserDetail(emailAddress, firstName, lastName);
        }
    }
}
