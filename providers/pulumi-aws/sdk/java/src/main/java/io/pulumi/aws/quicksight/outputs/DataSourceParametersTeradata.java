// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceParametersTeradata {
    /**
     * The database to which to connect.
     * 
     */
    private final String database;
    /**
     * The host to which to connect.
     * 
     */
    private final String host;
    /**
     * The warehouse to which to connect.
     * 
     */
    private final Integer port;

    @OutputCustomType.Constructor({"database","host","port"})
    private DataSourceParametersTeradata(
        String database,
        String host,
        Integer port) {
        this.database = Objects.requireNonNull(database);
        this.host = Objects.requireNonNull(host);
        this.port = Objects.requireNonNull(port);
    }

    /**
     * The database to which to connect.
     * 
     */
    public String getDatabase() {
        return this.database;
    }
    /**
     * The host to which to connect.
     * 
     */
    public String getHost() {
        return this.host;
    }
    /**
     * The warehouse to which to connect.
     * 
     */
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersTeradata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String host;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersTeradata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public DataSourceParametersTeradata build() {
            return new DataSourceParametersTeradata(database, host, port);
        }
    }
}
