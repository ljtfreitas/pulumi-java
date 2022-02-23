// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * <p>Spark parameters.</p>
 * 
 */
public final class DataSourceSparkParameters extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceSparkParameters Empty = new DataSourceSparkParameters();

    /**
     * <p>Host.</p>
     * 
     */
    @InputImport(name="host", required=true)
        private final String host;

    public String getHost() {
        return this.host;
    }

    /**
     * <p>Port.</p>
     * 
     */
    @InputImport(name="port", required=true)
        private final Double port;

    public Double getPort() {
        return this.port;
    }

    public DataSourceSparkParameters(
        String host,
        Double port) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceSparkParameters() {
        this.host = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSparkParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private Double port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSparkParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPort(Double port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public DataSourceSparkParameters build() {
            return new DataSourceSparkParameters(host, port);
        }
    }
}
