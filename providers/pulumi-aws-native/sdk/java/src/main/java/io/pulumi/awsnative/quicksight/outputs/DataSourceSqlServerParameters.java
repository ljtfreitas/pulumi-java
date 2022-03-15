// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourceSqlServerParameters {
    /**
     * <p>Database.</p>
     * 
     */
    private final String database;
    /**
     * <p>Host.</p>
     * 
     */
    private final String host;
    /**
     * <p>Port.</p>
     * 
     */
    private final Double port;

    @CustomType.Constructor
    private DataSourceSqlServerParameters(
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("port") Double port) {
        this.database = database;
        this.host = host;
        this.port = port;
    }

    /**
     * <p>Database.</p>
     * 
    */
    public String getDatabase() {
        return this.database;
    }
    /**
     * <p>Host.</p>
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * <p>Port.</p>
     * 
    */
    public Double getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSqlServerParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String host;
        private Double port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSqlServerParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder port(Double port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public DataSourceSqlServerParameters build() {
            return new DataSourceSqlServerParameters(database, host, port);
        }
    }
}
