// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network configuration for a Data Fusion instance. These configurations are used for peering with the customer network. Configurations are optional when a public Data Fusion instance is to be created. However, providing these configurations allows several benefits, such as reduced network latency while accessing the customer resources from managed Data Fusion instance nodes, as well as access to the customer on-prem resources.
 * 
 */
public final class NetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range must not overlap with any other ranges used in the Data Fusion instance network.
     * 
     */
    @Import(name="ipAllocation")
      private final @Nullable Output<String> ipAllocation;

    public Output<String> getIpAllocation() {
        return this.ipAllocation == null ? Output.empty() : this.ipAllocation;
    }

    /**
     * Name of the network in the customer project with which the Tenant Project will be peered for executing pipelines. In case of shared VPC where the network resides in another host project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    public NetworkConfigArgs(
        @Nullable Output<String> ipAllocation,
        @Nullable Output<String> network) {
        this.ipAllocation = ipAllocation;
        this.network = network;
    }

    private NetworkConfigArgs() {
        this.ipAllocation = Output.empty();
        this.network = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipAllocation;
        private @Nullable Output<String> network;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAllocation = defaults.ipAllocation;
    	      this.network = defaults.network;
        }

        public Builder ipAllocation(@Nullable Output<String> ipAllocation) {
            this.ipAllocation = ipAllocation;
            return this;
        }

        public Builder ipAllocation(@Nullable String ipAllocation) {
            this.ipAllocation = Output.ofNullable(ipAllocation);
            return this;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }
        public NetworkConfigArgs build() {
            return new NetworkConfigArgs(ipAllocation, network);
        }
    }
}
