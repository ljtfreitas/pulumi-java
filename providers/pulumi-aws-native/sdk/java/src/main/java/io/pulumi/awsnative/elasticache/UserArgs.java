// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache;

import io.pulumi.awsnative.elasticache.enums.UserEngine;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * Access permissions string used for this user account.
     * 
     */
    @InputImport(name="accessString")
        private final @Nullable Input<String> accessString;

    public Input<String> getAccessString() {
        return this.accessString == null ? Input.empty() : this.accessString;
    }

    /**
     * Must be redis.
     * 
     */
    @InputImport(name="engine", required=true)
        private final Input<UserEngine> engine;

    public Input<UserEngine> getEngine() {
        return this.engine;
    }

    /**
     * Indicates a password is not required for this user account.
     * 
     */
    @InputImport(name="noPasswordRequired")
        private final @Nullable Input<Boolean> noPasswordRequired;

    public Input<Boolean> getNoPasswordRequired() {
        return this.noPasswordRequired == null ? Input.empty() : this.noPasswordRequired;
    }

    /**
     * Passwords used for this user account. You can create up to two passwords for each user.
     * 
     */
    @InputImport(name="passwords")
        private final @Nullable Input<List<String>> passwords;

    public Input<List<String>> getPasswords() {
        return this.passwords == null ? Input.empty() : this.passwords;
    }

    /**
     * The ID of the user.
     * 
     */
    @InputImport(name="userId", required=true)
        private final Input<String> userId;

    public Input<String> getUserId() {
        return this.userId;
    }

    /**
     * The username of the user.
     * 
     */
    @InputImport(name="userName")
        private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public UserArgs(
        @Nullable Input<String> accessString,
        Input<UserEngine> engine,
        @Nullable Input<Boolean> noPasswordRequired,
        @Nullable Input<List<String>> passwords,
        Input<String> userId,
        @Nullable Input<String> userName) {
        this.accessString = accessString;
        this.engine = Objects.requireNonNull(engine, "expected parameter 'engine' to be non-null");
        this.noPasswordRequired = noPasswordRequired;
        this.passwords = passwords;
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
        this.userName = userName;
    }

    private UserArgs() {
        this.accessString = Input.empty();
        this.engine = Input.empty();
        this.noPasswordRequired = Input.empty();
        this.passwords = Input.empty();
        this.userId = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessString;
        private Input<UserEngine> engine;
        private @Nullable Input<Boolean> noPasswordRequired;
        private @Nullable Input<List<String>> passwords;
        private Input<String> userId;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessString = defaults.accessString;
    	      this.engine = defaults.engine;
    	      this.noPasswordRequired = defaults.noPasswordRequired;
    	      this.passwords = defaults.passwords;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
        }

        public Builder setAccessString(@Nullable Input<String> accessString) {
            this.accessString = accessString;
            return this;
        }

        public Builder setAccessString(@Nullable String accessString) {
            this.accessString = Input.ofNullable(accessString);
            return this;
        }

        public Builder setEngine(Input<UserEngine> engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }

        public Builder setEngine(UserEngine engine) {
            this.engine = Input.of(Objects.requireNonNull(engine));
            return this;
        }

        public Builder setNoPasswordRequired(@Nullable Input<Boolean> noPasswordRequired) {
            this.noPasswordRequired = noPasswordRequired;
            return this;
        }

        public Builder setNoPasswordRequired(@Nullable Boolean noPasswordRequired) {
            this.noPasswordRequired = Input.ofNullable(noPasswordRequired);
            return this;
        }

        public Builder setPasswords(@Nullable Input<List<String>> passwords) {
            this.passwords = passwords;
            return this;
        }

        public Builder setPasswords(@Nullable List<String> passwords) {
            this.passwords = Input.ofNullable(passwords);
            return this;
        }

        public Builder setUserId(Input<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Input.of(Objects.requireNonNull(userId));
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
        public UserArgs build() {
            return new UserArgs(accessString, engine, noPasswordRequired, passwords, userId, userName);
        }
    }
}
