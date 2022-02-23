// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.AutoUserSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specify either the userName or autoUser property, but not both.
 * 
 */
public final class UserIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserIdentityArgs Empty = new UserIdentityArgs();

    /**
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     * 
     */
    @InputImport(name="autoUser")
        private final @Nullable Input<AutoUserSpecificationArgs> autoUser;

    public Input<AutoUserSpecificationArgs> getAutoUser() {
        return this.autoUser == null ? Input.empty() : this.autoUser;
    }

    /**
     * The userName and autoUser properties are mutually exclusive; you must specify one but not both.
     * 
     */
    @InputImport(name="userName")
        private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public UserIdentityArgs(
        @Nullable Input<AutoUserSpecificationArgs> autoUser,
        @Nullable Input<String> userName) {
        this.autoUser = autoUser;
        this.userName = userName;
    }

    private UserIdentityArgs() {
        this.autoUser = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoUserSpecificationArgs> autoUser;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUser = defaults.autoUser;
    	      this.userName = defaults.userName;
        }

        public Builder setAutoUser(@Nullable Input<AutoUserSpecificationArgs> autoUser) {
            this.autoUser = autoUser;
            return this;
        }

        public Builder setAutoUser(@Nullable AutoUserSpecificationArgs autoUser) {
            this.autoUser = Input.ofNullable(autoUser);
            return this;
        }

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public UserIdentityArgs build() {
            return new UserIdentityArgs(autoUser, userName);
        }
    }
}
