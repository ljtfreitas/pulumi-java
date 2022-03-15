// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusJmxExporterGetArgs;
import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusNodeExporterGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterOpenMonitoringPrometheusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterOpenMonitoringPrometheusGetArgs Empty = new ClusterOpenMonitoringPrometheusGetArgs();

    /**
     * Configuration block for JMX Exporter. See below.
     * 
     */
    @Import(name="jmxExporter")
      private final @Nullable Output<ClusterOpenMonitoringPrometheusJmxExporterGetArgs> jmxExporter;

    public Output<ClusterOpenMonitoringPrometheusJmxExporterGetArgs> getJmxExporter() {
        return this.jmxExporter == null ? Output.empty() : this.jmxExporter;
    }

    /**
     * Configuration block for Node Exporter. See below.
     * 
     */
    @Import(name="nodeExporter")
      private final @Nullable Output<ClusterOpenMonitoringPrometheusNodeExporterGetArgs> nodeExporter;

    public Output<ClusterOpenMonitoringPrometheusNodeExporterGetArgs> getNodeExporter() {
        return this.nodeExporter == null ? Output.empty() : this.nodeExporter;
    }

    public ClusterOpenMonitoringPrometheusGetArgs(
        @Nullable Output<ClusterOpenMonitoringPrometheusJmxExporterGetArgs> jmxExporter,
        @Nullable Output<ClusterOpenMonitoringPrometheusNodeExporterGetArgs> nodeExporter) {
        this.jmxExporter = jmxExporter;
        this.nodeExporter = nodeExporter;
    }

    private ClusterOpenMonitoringPrometheusGetArgs() {
        this.jmxExporter = Output.empty();
        this.nodeExporter = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOpenMonitoringPrometheusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterOpenMonitoringPrometheusJmxExporterGetArgs> jmxExporter;
        private @Nullable Output<ClusterOpenMonitoringPrometheusNodeExporterGetArgs> nodeExporter;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterOpenMonitoringPrometheusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jmxExporter = defaults.jmxExporter;
    	      this.nodeExporter = defaults.nodeExporter;
        }

        public Builder jmxExporter(@Nullable Output<ClusterOpenMonitoringPrometheusJmxExporterGetArgs> jmxExporter) {
            this.jmxExporter = jmxExporter;
            return this;
        }

        public Builder jmxExporter(@Nullable ClusterOpenMonitoringPrometheusJmxExporterGetArgs jmxExporter) {
            this.jmxExporter = Output.ofNullable(jmxExporter);
            return this;
        }

        public Builder nodeExporter(@Nullable Output<ClusterOpenMonitoringPrometheusNodeExporterGetArgs> nodeExporter) {
            this.nodeExporter = nodeExporter;
            return this;
        }

        public Builder nodeExporter(@Nullable ClusterOpenMonitoringPrometheusNodeExporterGetArgs nodeExporter) {
            this.nodeExporter = Output.ofNullable(nodeExporter);
            return this;
        }
        public ClusterOpenMonitoringPrometheusGetArgs build() {
            return new ClusterOpenMonitoringPrometheusGetArgs(jmxExporter, nodeExporter);
        }
    }
}
