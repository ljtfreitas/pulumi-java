// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * <p>Presto parameters.</p>
 * 
 */
public final class DataSourcePrestoParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourcePrestoParametersArgs Empty = new DataSourcePrestoParametersArgs();

    /**
     * <p>Catalog.</p>
     * 
     */
    @InputImport(name="catalog", required=true)
        private final Input<String> catalog;

    public Input<String> getCatalog() {
        return this.catalog;
    }

    /**
     * <p>Host.</p>
     * 
     */
    @InputImport(name="host", required=true)
        private final Input<String> host;

    public Input<String> getHost() {
        return this.host;
    }

    /**
     * <p>Port.</p>
     * 
     */
    @InputImport(name="port", required=true)
        private final Input<Double> port;

    public Input<Double> getPort() {
        return this.port;
    }

    public DataSourcePrestoParametersArgs(
        Input<String> catalog,
        Input<String> host,
        Input<Double> port) {
        this.catalog = Objects.requireNonNull(catalog, "expected parameter 'catalog' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourcePrestoParametersArgs() {
        this.catalog = Input.empty();
        this.host = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourcePrestoParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> catalog;
        private Input<String> host;
        private Input<Double> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourcePrestoParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalog = defaults.catalog;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setCatalog(Input<String> catalog) {
            this.catalog = Objects.requireNonNull(catalog);
            return this;
        }

        public Builder setCatalog(String catalog) {
            this.catalog = Input.of(Objects.requireNonNull(catalog));
            return this;
        }

        public Builder setHost(Input<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Input.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder setPort(Input<Double> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPort(Double port) {
            this.port = Input.of(Objects.requireNonNull(port));
            return this;
        }
        public DataSourcePrestoParametersArgs build() {
            return new DataSourcePrestoParametersArgs(catalog, host, port);
        }
    }
}
