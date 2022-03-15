// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataSourceCredentialsCredentialPairGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceCredentialsCredentialPairGetArgs Empty = new DataSourceCredentialsCredentialPairGetArgs();

    /**
     * Password, maximum length of 1024 characters.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> getPassword() {
        return this.password;
    }

    /**
     * User name, maximum length of 64 characters.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> getUsername() {
        return this.username;
    }

    public DataSourceCredentialsCredentialPairGetArgs(
        Output<String> password,
        Output<String> username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private DataSourceCredentialsCredentialPairGetArgs() {
        this.password = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceCredentialsCredentialPairGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> password;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceCredentialsCredentialPairGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder password(Output<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder password(String password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }
        public DataSourceCredentialsCredentialPairGetArgs build() {
            return new DataSourceCredentialsCredentialPairGetArgs(password, username);
        }
    }
}
