// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.enums.IPAllocationMethod;
import io.pulumi.azurenative.hybridnetwork.enums.IPVersion;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network interface IP configuration properties.
 * 
 */
public final class NetworkInterfaceIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceIPConfigurationArgs Empty = new NetworkInterfaceIPConfigurationArgs();

    /**
     * The list of DNS servers IP addresses.
     * 
     */
    @InputImport(name="dnsServers")
    private final @Nullable Input<List<String>> dnsServers;

    public Input<List<String>> getDnsServers() {
        return this.dnsServers == null ? Input.empty() : this.dnsServers;
    }

    /**
     * The value of the gateway.
     * 
     */
    @InputImport(name="gateway")
    private final @Nullable Input<String> gateway;

    public Input<String> getGateway() {
        return this.gateway == null ? Input.empty() : this.gateway;
    }

    /**
     * The value of the IP address.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * IP address allocation method.
     * 
     */
    @InputImport(name="ipAllocationMethod")
    private final @Nullable Input<Either<String,IPAllocationMethod>> ipAllocationMethod;

    public Input<Either<String,IPAllocationMethod>> getIpAllocationMethod() {
        return this.ipAllocationMethod == null ? Input.empty() : this.ipAllocationMethod;
    }

    /**
     * IP address version.
     * 
     */
    @InputImport(name="ipVersion")
    private final @Nullable Input<Either<String,IPVersion>> ipVersion;

    public Input<Either<String,IPVersion>> getIpVersion() {
        return this.ipVersion == null ? Input.empty() : this.ipVersion;
    }

    /**
     * The value of the subnet.
     * 
     */
    @InputImport(name="subnet")
    private final @Nullable Input<String> subnet;

    public Input<String> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    public NetworkInterfaceIPConfigurationArgs(
        @Nullable Input<List<String>> dnsServers,
        @Nullable Input<String> gateway,
        @Nullable Input<String> ipAddress,
        @Nullable Input<Either<String,IPAllocationMethod>> ipAllocationMethod,
        @Nullable Input<Either<String,IPVersion>> ipVersion,
        @Nullable Input<String> subnet) {
        this.dnsServers = dnsServers;
        this.gateway = gateway;
        this.ipAddress = ipAddress;
        this.ipAllocationMethod = ipAllocationMethod;
        this.ipVersion = ipVersion;
        this.subnet = subnet;
    }

    private NetworkInterfaceIPConfigurationArgs() {
        this.dnsServers = Input.empty();
        this.gateway = Input.empty();
        this.ipAddress = Input.empty();
        this.ipAllocationMethod = Input.empty();
        this.ipVersion = Input.empty();
        this.subnet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> dnsServers;
        private @Nullable Input<String> gateway;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<Either<String,IPAllocationMethod>> ipAllocationMethod;
        private @Nullable Input<Either<String,IPVersion>> ipVersion;
        private @Nullable Input<String> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceIPConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
    	      this.gateway = defaults.gateway;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipAllocationMethod = defaults.ipAllocationMethod;
    	      this.ipVersion = defaults.ipVersion;
    	      this.subnet = defaults.subnet;
        }

        public Builder setDnsServers(@Nullable Input<List<String>> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = Input.ofNullable(dnsServers);
            return this;
        }

        public Builder setGateway(@Nullable Input<String> gateway) {
            this.gateway = gateway;
            return this;
        }

        public Builder setGateway(@Nullable String gateway) {
            this.gateway = Input.ofNullable(gateway);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setIpAllocationMethod(@Nullable Input<Either<String,IPAllocationMethod>> ipAllocationMethod) {
            this.ipAllocationMethod = ipAllocationMethod;
            return this;
        }

        public Builder setIpAllocationMethod(@Nullable Either<String,IPAllocationMethod> ipAllocationMethod) {
            this.ipAllocationMethod = Input.ofNullable(ipAllocationMethod);
            return this;
        }

        public Builder setIpVersion(@Nullable Input<Either<String,IPVersion>> ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        public Builder setIpVersion(@Nullable Either<String,IPVersion> ipVersion) {
            this.ipVersion = Input.ofNullable(ipVersion);
            return this;
        }

        public Builder setSubnet(@Nullable Input<String> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setSubnet(@Nullable String subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }

        public NetworkInterfaceIPConfigurationArgs build() {
            return new NetworkInterfaceIPConfigurationArgs(dnsServers, gateway, ipAddress, ipAllocationMethod, ipVersion, subnet);
        }
    }
}
