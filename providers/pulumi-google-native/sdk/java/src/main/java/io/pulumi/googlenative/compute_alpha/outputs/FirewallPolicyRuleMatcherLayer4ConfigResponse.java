// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FirewallPolicyRuleMatcherLayer4ConfigResponse {
    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * 
     */
    private final String ipProtocol;
    /**
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * 
     */
    private final List<String> ports;

    @CustomType.Constructor
    private FirewallPolicyRuleMatcherLayer4ConfigResponse(
        @CustomType.Parameter("ipProtocol") String ipProtocol,
        @CustomType.Parameter("ports") List<String> ports) {
        this.ipProtocol = ipProtocol;
        this.ports = ports;
    }

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * 
    */
    public String getIpProtocol() {
        return this.ipProtocol;
    }
    /**
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * 
    */
    public List<String> getPorts() {
        return this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatcherLayer4ConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipProtocol;
        private List<String> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatcherLayer4ConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ports = defaults.ports;
        }

        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }

        public Builder ports(List<String> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public FirewallPolicyRuleMatcherLayer4ConfigResponse build() {
            return new FirewallPolicyRuleMatcherLayer4ConfigResponse(ipProtocol, ports);
        }
    }
}
