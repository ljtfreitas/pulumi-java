// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The JMX Prometheus Exporter settings.
 * 
 */
public final class ApplicationJMXPrometheusExporterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationJMXPrometheusExporterArgs Empty = new ApplicationJMXPrometheusExporterArgs();

    /**
     * Java agent host port
     * 
     */
    @Import(name="hostPort")
      private final @Nullable Output<String> hostPort;

    public Output<String> getHostPort() {
        return this.hostPort == null ? Output.empty() : this.hostPort;
    }

    /**
     * JMX service URL.
     * 
     */
    @Import(name="jMXURL")
      private final @Nullable Output<String> jMXURL;

    public Output<String> getJMXURL() {
        return this.jMXURL == null ? Output.empty() : this.jMXURL;
    }

    /**
     * Prometheus exporter port.
     * 
     */
    @Import(name="prometheusPort")
      private final @Nullable Output<String> prometheusPort;

    public Output<String> getPrometheusPort() {
        return this.prometheusPort == null ? Output.empty() : this.prometheusPort;
    }

    public ApplicationJMXPrometheusExporterArgs(
        @Nullable Output<String> hostPort,
        @Nullable Output<String> jMXURL,
        @Nullable Output<String> prometheusPort) {
        this.hostPort = hostPort;
        this.jMXURL = jMXURL;
        this.prometheusPort = prometheusPort;
    }

    private ApplicationJMXPrometheusExporterArgs() {
        this.hostPort = Output.empty();
        this.jMXURL = Output.empty();
        this.prometheusPort = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationJMXPrometheusExporterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostPort;
        private @Nullable Output<String> jMXURL;
        private @Nullable Output<String> prometheusPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationJMXPrometheusExporterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostPort = defaults.hostPort;
    	      this.jMXURL = defaults.jMXURL;
    	      this.prometheusPort = defaults.prometheusPort;
        }

        public Builder hostPort(@Nullable Output<String> hostPort) {
            this.hostPort = hostPort;
            return this;
        }

        public Builder hostPort(@Nullable String hostPort) {
            this.hostPort = Output.ofNullable(hostPort);
            return this;
        }

        public Builder jMXURL(@Nullable Output<String> jMXURL) {
            this.jMXURL = jMXURL;
            return this;
        }

        public Builder jMXURL(@Nullable String jMXURL) {
            this.jMXURL = Output.ofNullable(jMXURL);
            return this;
        }

        public Builder prometheusPort(@Nullable Output<String> prometheusPort) {
            this.prometheusPort = prometheusPort;
            return this;
        }

        public Builder prometheusPort(@Nullable String prometheusPort) {
            this.prometheusPort = Output.ofNullable(prometheusPort);
            return this;
        }
        public ApplicationJMXPrometheusExporterArgs build() {
            return new ApplicationJMXPrometheusExporterArgs(hostPort, jMXURL, prometheusPort);
        }
    }
}
