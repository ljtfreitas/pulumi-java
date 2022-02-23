// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information about the identity of a user.
 * 
 */
public final class UserIdentityInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserIdentityInfoArgs Empty = new UserIdentityInfoArgs();

    @InputImport(name="email")
        private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    @InputImport(name="firstName")
        private final @Nullable Input<String> firstName;

    public Input<String> getFirstName() {
        return this.firstName == null ? Input.empty() : this.firstName;
    }

    @InputImport(name="lastName")
        private final @Nullable Input<String> lastName;

    public Input<String> getLastName() {
        return this.lastName == null ? Input.empty() : this.lastName;
    }

    public UserIdentityInfoArgs(
        @Nullable Input<String> email,
        @Nullable Input<String> firstName,
        @Nullable Input<String> lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private UserIdentityInfoArgs() {
        this.email = Input.empty();
        this.firstName = Input.empty();
        this.lastName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> email;
        private @Nullable Input<String> firstName;
        private @Nullable Input<String> lastName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
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
        public UserIdentityInfoArgs build() {
            return new UserIdentityInfoArgs(email, firstName, lastName);
        }
    }
}
