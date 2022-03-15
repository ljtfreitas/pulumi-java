// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterOpenMonitoringPrometheusJmxExporterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterOpenMonitoringPrometheusJmxExporterArgs Empty = new ClusterOpenMonitoringPrometheusJmxExporterArgs();

    /**
     * Indicates whether you want to enable or disable the JMX Exporter.
     * 
     */
    @Import(name="enabledInBroker", required=true)
      private final Output<Boolean> enabledInBroker;

    public Output<Boolean> getEnabledInBroker() {
        return this.enabledInBroker;
    }

    public ClusterOpenMonitoringPrometheusJmxExporterArgs(Output<Boolean> enabledInBroker) {
        this.enabledInBroker = Objects.requireNonNull(enabledInBroker, "expected parameter 'enabledInBroker' to be non-null");
    }

    private ClusterOpenMonitoringPrometheusJmxExporterArgs() {
        this.enabledInBroker = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOpenMonitoringPrometheusJmxExporterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enabledInBroker;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterOpenMonitoringPrometheusJmxExporterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledInBroker = defaults.enabledInBroker;
        }

        public Builder enabledInBroker(Output<Boolean> enabledInBroker) {
            this.enabledInBroker = Objects.requireNonNull(enabledInBroker);
            return this;
        }

        public Builder enabledInBroker(Boolean enabledInBroker) {
            this.enabledInBroker = Output.of(Objects.requireNonNull(enabledInBroker));
            return this;
        }
        public ClusterOpenMonitoringPrometheusJmxExporterArgs build() {
            return new ClusterOpenMonitoringPrometheusJmxExporterArgs(enabledInBroker);
        }
    }
}
