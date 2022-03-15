// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkIpamConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkIpamConfigGetArgs Empty = new NetworkIpamConfigGetArgs();

    @Import(name="auxAddress")
      private final @Nullable Output<Map<String,Object>> auxAddress;

    public Output<Map<String,Object>> getAuxAddress() {
        return this.auxAddress == null ? Output.empty() : this.auxAddress;
    }

    @Import(name="gateway")
      private final @Nullable Output<String> gateway;

    public Output<String> getGateway() {
        return this.gateway == null ? Output.empty() : this.gateway;
    }

    @Import(name="ipRange")
      private final @Nullable Output<String> ipRange;

    public Output<String> getIpRange() {
        return this.ipRange == null ? Output.empty() : this.ipRange;
    }

    @Import(name="subnet")
      private final @Nullable Output<String> subnet;

    public Output<String> getSubnet() {
        return this.subnet == null ? Output.empty() : this.subnet;
    }

    public NetworkIpamConfigGetArgs(
        @Nullable Output<Map<String,Object>> auxAddress,
        @Nullable Output<String> gateway,
        @Nullable Output<String> ipRange,
        @Nullable Output<String> subnet) {
        this.auxAddress = auxAddress;
        this.gateway = gateway;
        this.ipRange = ipRange;
        this.subnet = subnet;
    }

    private NetworkIpamConfigGetArgs() {
        this.auxAddress = Output.empty();
        this.gateway = Output.empty();
        this.ipRange = Output.empty();
        this.subnet = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkIpamConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,Object>> auxAddress;
        private @Nullable Output<String> gateway;
        private @Nullable Output<String> ipRange;
        private @Nullable Output<String> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkIpamConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxAddress = defaults.auxAddress;
    	      this.gateway = defaults.gateway;
    	      this.ipRange = defaults.ipRange;
    	      this.subnet = defaults.subnet;
        }

        public Builder auxAddress(@Nullable Output<Map<String,Object>> auxAddress) {
            this.auxAddress = auxAddress;
            return this;
        }

        public Builder auxAddress(@Nullable Map<String,Object> auxAddress) {
            this.auxAddress = Output.ofNullable(auxAddress);
            return this;
        }

        public Builder gateway(@Nullable Output<String> gateway) {
            this.gateway = gateway;
            return this;
        }

        public Builder gateway(@Nullable String gateway) {
            this.gateway = Output.ofNullable(gateway);
            return this;
        }

        public Builder ipRange(@Nullable Output<String> ipRange) {
            this.ipRange = ipRange;
            return this;
        }

        public Builder ipRange(@Nullable String ipRange) {
            this.ipRange = Output.ofNullable(ipRange);
            return this;
        }

        public Builder subnet(@Nullable Output<String> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder subnet(@Nullable String subnet) {
            this.subnet = Output.ofNullable(subnet);
            return this;
        }
        public NetworkIpamConfigGetArgs build() {
            return new NetworkIpamConfigGetArgs(auxAddress, gateway, ipRange, subnet);
        }
    }
}
