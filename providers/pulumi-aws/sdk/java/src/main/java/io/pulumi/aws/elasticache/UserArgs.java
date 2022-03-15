// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="accessString", required=true)
      private final Output<String> accessString;

    public Output<String> getAccessString() {
        return this.accessString;
    }

    /**
     * The ARN of the created ElastiCache User.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The current supported value is `REDIS`.
     * 
     */
    @Import(name="engine", required=true)
      private final Output<String> engine;

    public Output<String> getEngine() {
        return this.engine;
    }

    /**
     * Indicates a password is not required for this user.
     * 
     */
    @Import(name="noPasswordRequired")
      private final @Nullable Output<Boolean> noPasswordRequired;

    public Output<Boolean> getNoPasswordRequired() {
        return this.noPasswordRequired == null ? Output.empty() : this.noPasswordRequired;
    }

    /**
     * Passwords used for this user. You can create up to two passwords for each user.
     * 
     */
    @Import(name="passwords")
      private final @Nullable Output<List<String>> passwords;

    public Output<List<String>> getPasswords() {
        return this.passwords == null ? Output.empty() : this.passwords;
    }

    /**
     * A list of tags to be added to this resource. A tag is a key-value pair.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The ID of the user.
     * 
     */
    @Import(name="userId", required=true)
      private final Output<String> userId;

    public Output<String> getUserId() {
        return this.userId;
    }

    /**
     * The username of the user.
     * 
     */
    @Import(name="userName", required=true)
      private final Output<String> userName;

    public Output<String> getUserName() {
        return this.userName;
    }

    public UserArgs(
        Output<String> accessString,
        @Nullable Output<String> arn,
        Output<String> engine,
        @Nullable Output<Boolean> noPasswordRequired,
        @Nullable Output<List<String>> passwords,
        @Nullable Output<Map<String,String>> tags,
        Output<String> userId,
        Output<String> userName) {
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
        this.accessString = Output.empty();
        this.arn = Output.empty();
        this.engine = Output.empty();
        this.noPasswordRequired = Output.empty();
        this.passwords = Output.empty();
        this.tags = Output.empty();
        this.userId = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accessString;
        private @Nullable Output<String> arn;
        private Output<String> engine;
        private @Nullable Output<Boolean> noPasswordRequired;
        private @Nullable Output<List<String>> passwords;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> userId;
        private Output<String> userName;

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

        public Builder accessString(Output<String> accessString) {
            this.accessString = Objects.requireNonNull(accessString);
            return this;
        }

        public Builder accessString(String accessString) {
            this.accessString = Output.of(Objects.requireNonNull(accessString));
            return this;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder engine(Output<String> engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }

        public Builder engine(String engine) {
            this.engine = Output.of(Objects.requireNonNull(engine));
            return this;
        }

        public Builder noPasswordRequired(@Nullable Output<Boolean> noPasswordRequired) {
            this.noPasswordRequired = noPasswordRequired;
            return this;
        }

        public Builder noPasswordRequired(@Nullable Boolean noPasswordRequired) {
            this.noPasswordRequired = Output.ofNullable(noPasswordRequired);
            return this;
        }

        public Builder passwords(@Nullable Output<List<String>> passwords) {
            this.passwords = passwords;
            return this;
        }

        public Builder passwords(@Nullable List<String> passwords) {
            this.passwords = Output.ofNullable(passwords);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder userId(Output<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Output.of(Objects.requireNonNull(userId));
            return this;
        }

        public Builder userName(Output<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder userName(String userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }
        public UserArgs build() {
            return new UserArgs(accessString, arn, engine, noPasswordRequired, passwords, tags, userId, userName);
        }
    }
}
