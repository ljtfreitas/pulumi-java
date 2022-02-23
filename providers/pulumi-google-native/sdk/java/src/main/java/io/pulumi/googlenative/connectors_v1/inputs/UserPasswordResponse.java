// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.connectors_v1.inputs.SecretResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Parameters to support Username and Password Authentication.
 * 
 */
public final class UserPasswordResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserPasswordResponse Empty = new UserPasswordResponse();

    /**
     * Secret version reference containing the password.
     * 
     */
    @InputImport(name="password", required=true)
      private final SecretResponse password;

    public SecretResponse getPassword() {
        return this.password;
    }

    /**
     * Username.
     * 
     */
    @InputImport(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    public UserPasswordResponse(
        SecretResponse password,
        String username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private UserPasswordResponse() {
        this.password = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPasswordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretResponse password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPasswordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setPassword(SecretResponse password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public UserPasswordResponse build() {
            return new UserPasswordResponse(password, username);
        }
    }
}
