// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class FirewallDeniedItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallDeniedItemResponse Empty = new FirewallDeniedItemResponse();

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * 
     */
    @InputImport(name="ipProtocol", required=true)
      private final String ipProtocol;

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * 
     */
    @InputImport(name="ports", required=true)
      private final List<String> ports;

    public List<String> getPorts() {
        return this.ports;
    }

    public FirewallDeniedItemResponse(
        String ipProtocol,
        List<String> ports) {
        this.ipProtocol = Objects.requireNonNull(ipProtocol, "expected parameter 'ipProtocol' to be non-null");
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
    }

    private FirewallDeniedItemResponse() {
        this.ipProtocol = null;
        this.ports = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallDeniedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipProtocol;
        private List<String> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallDeniedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ports = defaults.ports;
        }

        public Builder setIpProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }

        public Builder setPorts(List<String> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public FirewallDeniedItemResponse build() {
            return new FirewallDeniedItemResponse(ipProtocol, ports);
        }
    }
}
