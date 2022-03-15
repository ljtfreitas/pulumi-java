// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.SslConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies connection parameters required specifically for MySQL databases.
 * 
 */
public final class MySqlConnectionProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final MySqlConnectionProfileArgs Empty = new MySqlConnectionProfileArgs();

    /**
     * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source.
     * 
     */
    @Import(name="cloudSqlId")
      private final @Nullable Output<String> cloudSqlId;

    public Output<String> getCloudSqlId() {
        return this.cloudSqlId == null ? Output.empty() : this.cloudSqlId;
    }

    /**
     * The IP or hostname of the source MySQL database.
     * 
     */
    @Import(name="host", required=true)
      private final Output<String> host;

    public Output<String> getHost() {
        return this.host;
    }

    /**
     * Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is encrypted when stored in Database Migration Service.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> getPassword() {
        return this.password;
    }

    /**
     * The network port of the source MySQL database.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }

    /**
     * SSL configuration for the destination to connect to the source database.
     * 
     */
    @Import(name="ssl")
      private final @Nullable Output<SslConfigArgs> ssl;

    public Output<SslConfigArgs> getSsl() {
        return this.ssl == null ? Output.empty() : this.ssl;
    }

    /**
     * The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> getUsername() {
        return this.username;
    }

    public MySqlConnectionProfileArgs(
        @Nullable Output<String> cloudSqlId,
        Output<String> host,
        Output<String> password,
        Output<Integer> port,
        @Nullable Output<SslConfigArgs> ssl,
        Output<String> username) {
        this.cloudSqlId = cloudSqlId;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.ssl = ssl;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private MySqlConnectionProfileArgs() {
        this.cloudSqlId = Output.empty();
        this.host = Output.empty();
        this.password = Output.empty();
        this.port = Output.empty();
        this.ssl = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MySqlConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudSqlId;
        private Output<String> host;
        private Output<String> password;
        private Output<Integer> port;
        private @Nullable Output<SslConfigArgs> ssl;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(MySqlConnectionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlId = defaults.cloudSqlId;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.ssl = defaults.ssl;
    	      this.username = defaults.username;
        }

        public Builder cloudSqlId(@Nullable Output<String> cloudSqlId) {
            this.cloudSqlId = cloudSqlId;
            return this;
        }

        public Builder cloudSqlId(@Nullable String cloudSqlId) {
            this.cloudSqlId = Output.ofNullable(cloudSqlId);
            return this;
        }

        public Builder host(Output<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder host(String host) {
            this.host = Output.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder password(Output<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder password(String password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }

        public Builder ssl(@Nullable Output<SslConfigArgs> ssl) {
            this.ssl = ssl;
            return this;
        }

        public Builder ssl(@Nullable SslConfigArgs ssl) {
            this.ssl = Output.ofNullable(ssl);
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
        public MySqlConnectionProfileArgs build() {
            return new MySqlConnectionProfileArgs(cloudSqlId, host, password, port, ssl, username);
        }
    }
}
