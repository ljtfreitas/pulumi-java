// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceSparkParameters {
    private final String host;
    private final Double port;

    @OutputCustomType.Constructor({"host","port"})
    private DataSourceSparkParameters(
        String host,
        Double port) {
        this.host = Objects.requireNonNull(host);
        this.port = Objects.requireNonNull(port);
    }

    public String getHost() {
        return this.host;
    }
    public Double getPort() {
        return this.port;
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