// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HaVpnGatewayVpnInterfaceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final HaVpnGatewayVpnInterfaceGetArgs Empty = new HaVpnGatewayVpnInterfaceGetArgs();

    /**
     * The numeric ID of this VPN gateway interface.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<Integer> id;

    public Output<Integer> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * URL of the interconnect attachment resource. When the value
     * of this field is present, the VPN Gateway will be used for
     * IPsec-encrypted Cloud Interconnect; all Egress or Ingress
     * traffic for this VPN Gateway interface will go through the
     * specified interconnect attachment resource.
     * Not currently available publicly.
     * 
     */
    @Import(name="interconnectAttachment")
      private final @Nullable Output<String> interconnectAttachment;

    public Output<String> getInterconnectAttachment() {
        return this.interconnectAttachment == null ? Output.empty() : this.interconnectAttachment;
    }

    /**
     * - 
     * The external IP address for this VPN gateway interface.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    public HaVpnGatewayVpnInterfaceGetArgs(
        @Nullable Output<Integer> id,
        @Nullable Output<String> interconnectAttachment,
        @Nullable Output<String> ipAddress) {
        this.id = id;
        this.interconnectAttachment = interconnectAttachment;
        this.ipAddress = ipAddress;
    }

    private HaVpnGatewayVpnInterfaceGetArgs() {
        this.id = Output.empty();
        this.interconnectAttachment = Output.empty();
        this.ipAddress = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HaVpnGatewayVpnInterfaceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> id;
        private @Nullable Output<String> interconnectAttachment;
        private @Nullable Output<String> ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(HaVpnGatewayVpnInterfaceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.interconnectAttachment = defaults.interconnectAttachment;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder id(@Nullable Output<Integer> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable Integer id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder interconnectAttachment(@Nullable Output<String> interconnectAttachment) {
            this.interconnectAttachment = interconnectAttachment;
            return this;
        }

        public Builder interconnectAttachment(@Nullable String interconnectAttachment) {
            this.interconnectAttachment = Output.ofNullable(interconnectAttachment);
            return this;
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }
        public HaVpnGatewayVpnInterfaceGetArgs build() {
            return new HaVpnGatewayVpnInterfaceGetArgs(id, interconnectAttachment, ipAddress);
        }
    }
}
