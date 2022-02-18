// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PostgreSqlConnectionInfoResponse {
    /**
     * Name of the database
     * 
     */
    private final @Nullable String databaseName;
    /**
     * Password credential.
     * 
     */
    private final @Nullable String password;
    /**
     * Port for Server
     * 
     */
    private final Integer port;
    /**
     * Name of the server
     * 
     */
    private final String serverName;
    /**
     * Type of connection info
     * Expected value is 'PostgreSqlConnectionInfo'.
     * 
     */
    private final String type;
    /**
     * User name
     * 
     */
    private final @Nullable String userName;

    @OutputCustomType.Constructor({"databaseName","password","port","serverName","type","userName"})
    private PostgreSqlConnectionInfoResponse(
        @Nullable String databaseName,
        @Nullable String password,
        Integer port,
        String serverName,
        String type,
        @Nullable String userName) {
        this.databaseName = databaseName;
        this.password = password;
        this.port = Objects.requireNonNull(port);
        this.serverName = Objects.requireNonNull(serverName);
        this.type = Objects.requireNonNull(type);
        this.userName = userName;
    }

    /**
     * Name of the database
     * 
     */
    public Optional<String> getDatabaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * Password credential.
     * 
     */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Port for Server
     * 
     */
    public Integer getPort() {
        return this.port;
    }
    /**
     * Name of the server
     * 
     */
    public String getServerName() {
        return this.serverName;
    }
    /**
     * Type of connection info
     * Expected value is 'PostgreSqlConnectionInfo'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * User name
     * 
     */
    public Optional<String> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostgreSqlConnectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String databaseName;
        private @Nullable String password;
        private Integer port;
        private String serverName;
        private String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(PostgreSqlConnectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.serverName = defaults.serverName;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }

        public PostgreSqlConnectionInfoResponse build() {
            return new PostgreSqlConnectionInfoResponse(databaseName, password, port, serverName, type, userName);
        }
    }
}
