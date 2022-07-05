// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.file.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.file.v1beta1.enums.NetworkConfigConnectMode;
import com.pulumi.googlenative.file.v1beta1.enums.NetworkConfigModesItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network configuration for the instance.
 * 
 */
public final class NetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * The network connect mode of the Filestore instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
     */
    @Import(name="connectMode")
    private @Nullable Output<NetworkConfigConnectMode> connectMode;

    /**
     * @return The network connect mode of the Filestore instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
     */
    public Optional<Output<NetworkConfigConnectMode>> connectMode() {
        return Optional.ofNullable(this.connectMode);
    }

    /**
     * Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported.
     * 
     */
    @Import(name="modes")
    private @Nullable Output<List<NetworkConfigModesItem>> modes;

    /**
     * @return Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported.
     * 
     */
    public Optional<Output<List<NetworkConfigModesItem>>> modes() {
        return Optional.ofNullable(this.modes);
    }

    /**
     * The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Optional, reserved_ip_range can have one of the following two types of values. * CIDR range value when using DIRECT_PEERING connect mode. * [Allocated IP address range](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address) when using PRIVATE_SERVICE_ACCESS connect mode. When the name of an allocated IP address range is specified, it must be one of the ranges associated with the private service access connection. When specified as a direct CIDR value, it must be a /29 CIDR block for Basic tier or a /24 CIDR block for High Scale or Enterprise tier in one of the [internal IP address ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies the range of IP addresses reserved for this instance. For example, 10.0.0.0/29 or 192.168.0.0/24. The range you specify can&#39;t overlap with either existing subnets or assigned IP address ranges for other Cloud Filestore instances in the selected VPC network.
     * 
     */
    @Import(name="reservedIpRange")
    private @Nullable Output<String> reservedIpRange;

    /**
     * @return Optional, reserved_ip_range can have one of the following two types of values. * CIDR range value when using DIRECT_PEERING connect mode. * [Allocated IP address range](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address) when using PRIVATE_SERVICE_ACCESS connect mode. When the name of an allocated IP address range is specified, it must be one of the ranges associated with the private service access connection. When specified as a direct CIDR value, it must be a /29 CIDR block for Basic tier or a /24 CIDR block for High Scale or Enterprise tier in one of the [internal IP address ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies the range of IP addresses reserved for this instance. For example, 10.0.0.0/29 or 192.168.0.0/24. The range you specify can&#39;t overlap with either existing subnets or assigned IP address ranges for other Cloud Filestore instances in the selected VPC network.
     * 
     */
    public Optional<Output<String>> reservedIpRange() {
        return Optional.ofNullable(this.reservedIpRange);
    }

    private NetworkConfigArgs() {}

    private NetworkConfigArgs(NetworkConfigArgs $) {
        this.connectMode = $.connectMode;
        this.modes = $.modes;
        this.network = $.network;
        this.reservedIpRange = $.reservedIpRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkConfigArgs $;

        public Builder() {
            $ = new NetworkConfigArgs();
        }

        public Builder(NetworkConfigArgs defaults) {
            $ = new NetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectMode The network connect mode of the Filestore instance. If not provided, the connect mode defaults to DIRECT_PEERING.
         * 
         * @return builder
         * 
         */
        public Builder connectMode(@Nullable Output<NetworkConfigConnectMode> connectMode) {
            $.connectMode = connectMode;
            return this;
        }

        /**
         * @param connectMode The network connect mode of the Filestore instance. If not provided, the connect mode defaults to DIRECT_PEERING.
         * 
         * @return builder
         * 
         */
        public Builder connectMode(NetworkConfigConnectMode connectMode) {
            return connectMode(Output.of(connectMode));
        }

        /**
         * @param modes Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder modes(@Nullable Output<List<NetworkConfigModesItem>> modes) {
            $.modes = modes;
            return this;
        }

        /**
         * @param modes Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder modes(List<NetworkConfigModesItem> modes) {
            return modes(Output.of(modes));
        }

        /**
         * @param modes Internet protocol versions for which the instance has IP addresses assigned. For this version, only MODE_IPV4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder modes(NetworkConfigModesItem... modes) {
            return modes(List.of(modes));
        }

        /**
         * @param network The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param reservedIpRange Optional, reserved_ip_range can have one of the following two types of values. * CIDR range value when using DIRECT_PEERING connect mode. * [Allocated IP address range](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address) when using PRIVATE_SERVICE_ACCESS connect mode. When the name of an allocated IP address range is specified, it must be one of the ranges associated with the private service access connection. When specified as a direct CIDR value, it must be a /29 CIDR block for Basic tier or a /24 CIDR block for High Scale or Enterprise tier in one of the [internal IP address ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies the range of IP addresses reserved for this instance. For example, 10.0.0.0/29 or 192.168.0.0/24. The range you specify can&#39;t overlap with either existing subnets or assigned IP address ranges for other Cloud Filestore instances in the selected VPC network.
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(@Nullable Output<String> reservedIpRange) {
            $.reservedIpRange = reservedIpRange;
            return this;
        }

        /**
         * @param reservedIpRange Optional, reserved_ip_range can have one of the following two types of values. * CIDR range value when using DIRECT_PEERING connect mode. * [Allocated IP address range](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address) when using PRIVATE_SERVICE_ACCESS connect mode. When the name of an allocated IP address range is specified, it must be one of the ranges associated with the private service access connection. When specified as a direct CIDR value, it must be a /29 CIDR block for Basic tier or a /24 CIDR block for High Scale or Enterprise tier in one of the [internal IP address ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies the range of IP addresses reserved for this instance. For example, 10.0.0.0/29 or 192.168.0.0/24. The range you specify can&#39;t overlap with either existing subnets or assigned IP address ranges for other Cloud Filestore instances in the selected VPC network.
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(String reservedIpRange) {
            return reservedIpRange(Output.of(reservedIpRange));
        }

        public NetworkConfigArgs build() {
            return $;
        }
    }

}
