// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigEndpointConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigEndpointConfigGetArgs Empty = new ClusterClusterConfigEndpointConfigGetArgs();

    /**
     * The flag to enable http access to specific ports
     * on the cluster from external sources (aka Component Gateway). Defaults to false.
     * 
     */
    @Import(name="enableHttpPortAccess", required=true)
      private final Output<Boolean> enableHttpPortAccess;

    public Output<Boolean> getEnableHttpPortAccess() {
        return this.enableHttpPortAccess;
    }

    @Import(name="httpPorts")
      private final @Nullable Output<Map<String,Object>> httpPorts;

    public Output<Map<String,Object>> getHttpPorts() {
        return this.httpPorts == null ? Output.empty() : this.httpPorts;
    }

    public ClusterClusterConfigEndpointConfigGetArgs(
        Output<Boolean> enableHttpPortAccess,
        @Nullable Output<Map<String,Object>> httpPorts) {
        this.enableHttpPortAccess = Objects.requireNonNull(enableHttpPortAccess, "expected parameter 'enableHttpPortAccess' to be non-null");
        this.httpPorts = httpPorts;
    }

    private ClusterClusterConfigEndpointConfigGetArgs() {
        this.enableHttpPortAccess = Output.empty();
        this.httpPorts = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigEndpointConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enableHttpPortAccess;
        private @Nullable Output<Map<String,Object>> httpPorts;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigEndpointConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHttpPortAccess = defaults.enableHttpPortAccess;
    	      this.httpPorts = defaults.httpPorts;
        }

        public Builder enableHttpPortAccess(Output<Boolean> enableHttpPortAccess) {
            this.enableHttpPortAccess = Objects.requireNonNull(enableHttpPortAccess);
            return this;
        }

        public Builder enableHttpPortAccess(Boolean enableHttpPortAccess) {
            this.enableHttpPortAccess = Output.of(Objects.requireNonNull(enableHttpPortAccess));
            return this;
        }

        public Builder httpPorts(@Nullable Output<Map<String,Object>> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }

        public Builder httpPorts(@Nullable Map<String,Object> httpPorts) {
            this.httpPorts = Output.ofNullable(httpPorts);
            return this;
        }
        public ClusterClusterConfigEndpointConfigGetArgs build() {
            return new ClusterClusterConfigEndpointConfigGetArgs(enableHttpPortAccess, httpPorts);
        }
    }
}
