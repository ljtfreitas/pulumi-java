// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.file_v1.enums.NetworkConfigConnectMode;
import io.pulumi.googlenative.file_v1.enums.NetworkConfigModesItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network configuration for the instance.
 * 
 */
public final class NetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * The network connect mode of the Filestore instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
     */
    @Import(name="connectMode")
      private final @Nullable Output<NetworkConfigConnectMode> connectMode;

    public Output<NetworkConfigConnectMode> getConnectMode() {
        return this.connectMode == null ? Output.empty() : this.connectMode;
    }

    /**
     * Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported.
     * 
     */
    @Import(name="modes")
      private final @Nullable Output<List<NetworkConfigModesItem>> modes;

    public Output<List<NetworkConfigModesItem>> getModes() {
        return this.modes == null ? Output.empty() : this.modes;
    }

    /**
     * The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * Optional, reserved_ip_range can have one of the following two types of values. * CIDR range value when using DIRECT_PEERING connect mode. * [Allocated IP address range](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address) when using PRIVATE_SERVICE_ACCESS connect mode. When the name of an allocated IP address range is specified, it must be one of the ranges associated with the private service access connection. When specified as a direct CIDR value, it must be a /29 CIDR block for Basic tier or a /24 CIDR block for High Scale or Enterprise tier in one of the [internal IP address ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies the range of IP addresses reserved for this instance. For example, 10.0.0.0/29 or 192.168.0.0/24. The range you specify can't overlap with either existing subnets or assigned IP address ranges for other Cloud Filestore instances in the selected VPC network.
     * 
     */
    @Import(name="reservedIpRange")
      private final @Nullable Output<String> reservedIpRange;

    public Output<String> getReservedIpRange() {
        return this.reservedIpRange == null ? Output.empty() : this.reservedIpRange;
    }

    public NetworkConfigArgs(
        @Nullable Output<NetworkConfigConnectMode> connectMode,
        @Nullable Output<List<NetworkConfigModesItem>> modes,
        @Nullable Output<String> network,
        @Nullable Output<String> reservedIpRange) {
        this.connectMode = connectMode;
        this.modes = modes;
        this.network = network;
        this.reservedIpRange = reservedIpRange;
    }

    private NetworkConfigArgs() {
        this.connectMode = Output.empty();
        this.modes = Output.empty();
        this.network = Output.empty();
        this.reservedIpRange = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NetworkConfigConnectMode> connectMode;
        private @Nullable Output<List<NetworkConfigModesItem>> modes;
        private @Nullable Output<String> network;
        private @Nullable Output<String> reservedIpRange;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectMode = defaults.connectMode;
    	      this.modes = defaults.modes;
    	      this.network = defaults.network;
    	      this.reservedIpRange = defaults.reservedIpRange;
        }

        public Builder connectMode(@Nullable Output<NetworkConfigConnectMode> connectMode) {
            this.connectMode = connectMode;
            return this;
        }

        public Builder connectMode(@Nullable NetworkConfigConnectMode connectMode) {
            this.connectMode = Output.ofNullable(connectMode);
            return this;
        }

        public Builder modes(@Nullable Output<List<NetworkConfigModesItem>> modes) {
            this.modes = modes;
            return this;
        }

        public Builder modes(@Nullable List<NetworkConfigModesItem> modes) {
            this.modes = Output.ofNullable(modes);
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

        public Builder reservedIpRange(@Nullable Output<String> reservedIpRange) {
            this.reservedIpRange = reservedIpRange;
            return this;
        }

        public Builder reservedIpRange(@Nullable String reservedIpRange) {
            this.reservedIpRange = Output.ofNullable(reservedIpRange);
            return this;
        }
        public NetworkConfigArgs build() {
            return new NetworkConfigArgs(connectMode, modes, network, reservedIpRange);
        }
    }
}
