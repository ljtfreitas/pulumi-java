// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datafusion.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class InstanceNetworkConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkConfigGetArgs Empty = new InstanceNetworkConfigGetArgs();

    /**
     * The IP range in CIDR notation to use for the managed Data Fusion instance
     * nodes. This range must not overlap with any other ranges used in the Data Fusion instance network.
     * 
     */
    @Import(name="ipAllocation", required=true)
      private final Output<String> ipAllocation;

    public Output<String> ipAllocation() {
        return this.ipAllocation;
    }

    /**
     * Name of the network in the project with which the tenant project
     * will be peered for executing pipelines. In case of shared VPC where the network resides in another host
     * project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
     * 
     */
    @Import(name="network", required=true)
      private final Output<String> network;

    public Output<String> network() {
        return this.network;
    }

    public InstanceNetworkConfigGetArgs(
        Output<String> ipAllocation,
        Output<String> network) {
        this.ipAllocation = Objects.requireNonNull(ipAllocation, "expected parameter 'ipAllocation' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
    }

    private InstanceNetworkConfigGetArgs() {
        this.ipAllocation = Codegen.empty();
        this.network = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> ipAllocation;
        private Output<String> network;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAllocation = defaults.ipAllocation;
    	      this.network = defaults.network;
        }

        public Builder ipAllocation(Output<String> ipAllocation) {
            this.ipAllocation = Objects.requireNonNull(ipAllocation);
            return this;
        }
        public Builder ipAllocation(String ipAllocation) {
            this.ipAllocation = Output.of(Objects.requireNonNull(ipAllocation));
            return this;
        }
        public Builder network(Output<String> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder network(String network) {
            this.network = Output.of(Objects.requireNonNull(network));
            return this;
        }        public InstanceNetworkConfigGetArgs build() {
            return new InstanceNetworkConfigGetArgs(ipAllocation, network);
        }
    }
}
