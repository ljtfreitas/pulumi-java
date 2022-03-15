// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BasicAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BasicAuthenticationArgs Empty = new BasicAuthenticationArgs();

    /**
     * Gets or sets the password, return value will always be empty.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * Gets or sets the HTTP authentication type.
     * Expected value is 'Basic'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Gets or sets the username.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    public BasicAuthenticationArgs(
        @Nullable Output<String> password,
        Output<String> type,
        @Nullable Output<String> username) {
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private BasicAuthenticationArgs() {
        this.password = Output.empty();
        this.type = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private Output<String> type;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }
        public BasicAuthenticationArgs build() {
            return new BasicAuthenticationArgs(password, type, username);
        }
    }
}
