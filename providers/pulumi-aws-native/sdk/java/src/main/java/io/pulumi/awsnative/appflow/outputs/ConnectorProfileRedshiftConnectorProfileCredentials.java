// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorProfileRedshiftConnectorProfileCredentials {
    /**
     * The password that corresponds to the username.
     * 
     */
    private final String password;
    /**
     * The name of the user.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private ConnectorProfileRedshiftConnectorProfileCredentials(
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("username") String username) {
        this.password = password;
        this.username = username;
    }

    /**
     * The password that corresponds to the username.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * The name of the user.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileRedshiftConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileRedshiftConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public ConnectorProfileRedshiftConnectorProfileCredentials build() {
            return new ConnectorProfileRedshiftConnectorProfileCredentials(password, username);
        }
    }
}
