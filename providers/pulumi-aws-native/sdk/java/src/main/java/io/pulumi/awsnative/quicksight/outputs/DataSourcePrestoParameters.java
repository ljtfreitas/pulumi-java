// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourcePrestoParameters {
    /**
     * <p>Catalog.</p>
     * 
     */
    private final String catalog;
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
    private DataSourcePrestoParameters(
        @CustomType.Parameter("catalog") String catalog,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("port") Double port) {
        this.catalog = catalog;
        this.host = host;
        this.port = port;
    }

    /**
     * <p>Catalog.</p>
     * 
    */
    public String getCatalog() {
        return this.catalog;
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

    public static Builder builder(DataSourcePrestoParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalog;
        private String host;
        private Double port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourcePrestoParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalog = defaults.catalog;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder catalog(String catalog) {
            this.catalog = Objects.requireNonNull(catalog);
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
        public DataSourcePrestoParameters build() {
            return new DataSourcePrestoParameters(catalog, host, port);
        }
    }
}
