// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class ClusterOpenMonitoringArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterOpenMonitoringArgs Empty = new ClusterOpenMonitoringArgs();

    /**
     * Configuration block for Prometheus settings for open monitoring. See below.
     * 
     */
    @InputImport(name="prometheus", required=true)
    private final Input<ClusterOpenMonitoringPrometheusArgs> prometheus;

    public Input<ClusterOpenMonitoringPrometheusArgs> getPrometheus() {
        return this.prometheus;
    }

    public ClusterOpenMonitoringArgs(Input<ClusterOpenMonitoringPrometheusArgs> prometheus) {
        this.prometheus = Objects.requireNonNull(prometheus, "expected parameter 'prometheus' to be non-null");
    }

    private ClusterOpenMonitoringArgs() {
        this.prometheus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOpenMonitoringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ClusterOpenMonitoringPrometheusArgs> prometheus;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterOpenMonitoringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prometheus = defaults.prometheus;
        }

        public Builder setPrometheus(Input<ClusterOpenMonitoringPrometheusArgs> prometheus) {
            this.prometheus = Objects.requireNonNull(prometheus);
            return this;
        }

        public Builder setPrometheus(ClusterOpenMonitoringPrometheusArgs prometheus) {
            this.prometheus = Input.of(Objects.requireNonNull(prometheus));
            return this;
        }
        public ClusterOpenMonitoringArgs build() {
            return new ClusterOpenMonitoringArgs(prometheus);
        }
    }
}
