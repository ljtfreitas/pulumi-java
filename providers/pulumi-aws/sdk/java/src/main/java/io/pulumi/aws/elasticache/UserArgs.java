// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * Access permissions string used for this user. See [Specifying Permissions Using an Access String](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html#Access-string) for more details.
     * 
     */
    @InputImport(name="accessString", required=true)
    private final Input<String> accessString;

    public Input<String> getAccessString() {
        return this.accessString;
    }

    /**
     * The ARN of the created ElastiCache User.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The current supported value is `REDIS`.
     * 
     */
    @InputImport(name="engine", required=true)
    private final Input<String> engine;

    public Input<String> getEngine() {
        return this.engine;
    }

    /**
     * Indicates a password is not required for this user.
     * 
     */
    @InputImport(name="noPasswordRequired")
    private final @Nullable Input<Boolean> noPasswordRequired;

    public Input<Boolean> getNoPasswordRequired() {
        return this.noPasswordRequired == null ? Input.empty() : this.noPasswordRequired;
    }

    /**
     * Passwords used for this user. You can create up to two passwords for each user.
     * 
     */
    @InputImport(name="passwords")
    private final @Nullable Input<List<String>> passwords;

    public Input<List<String>> getPasswords() {
        return this.passwords == null ? Input.empty() : this.passwords;
    }

    /**
     * A list of tags to be added to this resource. A tag is a key-value pair.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
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
    @InputImport(name="userName", required=true)
    private final Input<String> userName;

    public Input<String> getUserName() {
        return this.userName;
    }

    public UserArgs(
        Input<String> accessString,
        @Nullable Input<String> arn,
        Input<String> engine,
        @Nullable Input<Boolean> noPasswordRequired,
        @Nullable Input<List<String>> passwords,
        @Nullable Input<Map<String,String>> tags,
        Input<String> userId,
        Input<String> userName) {
        this.accessString = Objects.requireNonNull(accessString, "expected parameter 'accessString' to be non-null");
        this.arn = arn;
        this.engine = Objects.requireNonNull(engine, "expected parameter 'engine' to be non-null");
        this.noPasswordRequired = noPasswordRequired;
        this.passwords = passwords;
        this.tags = tags;
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private UserArgs() {
        this.accessString = Input.empty();
        this.arn = Input.empty();
        this.engine = Input.empty();
        this.noPasswordRequired = Input.empty();
        this.passwords = Input.empty();
        this.tags = Input.empty();
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
        private Input<String> accessString;
        private @Nullable Input<String> arn;
        private Input<String> engine;
        private @Nullable Input<Boolean> noPasswordRequired;
        private @Nullable Input<List<String>> passwords;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> userId;
        private Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessString = defaults.accessString;
    	      this.arn = defaults.arn;
    	      this.engine = defaults.engine;
    	      this.noPasswordRequired = defaults.noPasswordRequired;
    	      this.passwords = defaults.passwords;
    	      this.tags = defaults.tags;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
        }

        public Builder setAccessString(Input<String> accessString) {
            this.accessString = Objects.requireNonNull(accessString);
            return this;
        }

        public Builder setAccessString(String accessString) {
            this.accessString = Input.of(Objects.requireNonNull(accessString));
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setEngine(Input<String> engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }

        public Builder setEngine(String engine) {
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
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

        public Builder setUserName(Input<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Input.of(Objects.requireNonNull(userName));
            return this;
        }
        public UserArgs build() {
            return new UserArgs(accessString, arn, engine, noPasswordRequired, passwords, tags, userId, userName);
        }
    }
}
