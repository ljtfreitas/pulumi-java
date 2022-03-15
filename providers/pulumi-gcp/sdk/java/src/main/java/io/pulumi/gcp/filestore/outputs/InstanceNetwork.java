// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.filestore.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceNetwork {
    /**
     * The network connect mode of the Filestore instance.
     * If not provided, the connect mode defaults to
     * DIRECT_PEERING.
     * Default value is `DIRECT_PEERING`.
     * Possible values are `DIRECT_PEERING` and `PRIVATE_SERVICE_ACCESS`.
     * 
     */
    private final @Nullable String connectMode;
    /**
     * - 
     * A list of IPv4 or IPv6 addresses.
     * 
     */
    private final @Nullable List<String> ipAddresses;
    /**
     * IP versions for which the instance has
     * IP addresses assigned.
     * Each value may be one of `ADDRESS_MODE_UNSPECIFIED`, `MODE_IPV4`, and `MODE_IPV6`.
     * 
     */
    private final List<String> modes;
    /**
     * The name of the GCE VPC network to which the
     * instance is connected.
     * 
     */
    private final String network;
    /**
     * A /29 CIDR block that identifies the range of IP
     * addresses reserved for this instance.
     * 
     */
    private final @Nullable String reservedIpRange;

    @CustomType.Constructor
    private InstanceNetwork(
        @CustomType.Parameter("connectMode") @Nullable String connectMode,
        @CustomType.Parameter("ipAddresses") @Nullable List<String> ipAddresses,
        @CustomType.Parameter("modes") List<String> modes,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("reservedIpRange") @Nullable String reservedIpRange) {
        this.connectMode = connectMode;
        this.ipAddresses = ipAddresses;
        this.modes = modes;
        this.network = network;
        this.reservedIpRange = reservedIpRange;
    }

    /**
     * The network connect mode of the Filestore instance.
     * If not provided, the connect mode defaults to
     * DIRECT_PEERING.
     * Default value is `DIRECT_PEERING`.
     * Possible values are `DIRECT_PEERING` and `PRIVATE_SERVICE_ACCESS`.
     * 
    */
    public Optional<String> getConnectMode() {
        return Optional.ofNullable(this.connectMode);
    }
    /**
     * - 
     * A list of IPv4 or IPv6 addresses.
     * 
    */
    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * IP versions for which the instance has
     * IP addresses assigned.
     * Each value may be one of `ADDRESS_MODE_UNSPECIFIED`, `MODE_IPV4`, and `MODE_IPV6`.
     * 
    */
    public List<String> getModes() {
        return this.modes;
    }
    /**
     * The name of the GCE VPC network to which the
     * instance is connected.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * A /29 CIDR block that identifies the range of IP
     * addresses reserved for this instance.
     * 
    */
    public Optional<String> getReservedIpRange() {
        return Optional.ofNullable(this.reservedIpRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectMode;
        private @Nullable List<String> ipAddresses;
        private List<String> modes;
        private String network;
        private @Nullable String reservedIpRange;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectMode = defaults.connectMode;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.modes = defaults.modes;
    	      this.network = defaults.network;
    	      this.reservedIpRange = defaults.reservedIpRange;
        }

        public Builder connectMode(@Nullable String connectMode) {
            this.connectMode = connectMode;
            return this;
        }

        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder modes(List<String> modes) {
            this.modes = Objects.requireNonNull(modes);
            return this;
        }

        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder reservedIpRange(@Nullable String reservedIpRange) {
            this.reservedIpRange = reservedIpRange;
            return this;
        }
        public InstanceNetwork build() {
            return new InstanceNetwork(connectMode, ipAddresses, modes, network, reservedIpRange);
        }
    }
}
