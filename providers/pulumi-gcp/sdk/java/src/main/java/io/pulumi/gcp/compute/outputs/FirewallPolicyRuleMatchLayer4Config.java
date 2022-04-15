// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyRuleMatchLayer4Config {
    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (`tcp`, `udp`, `icmp`, `esp`, `ah`, `ipip`, `sctp`), or the IP protocol number.
     * 
     */
    private final String ipProtocol;
    /**
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ``.
     * 
     */
    private final @Nullable List<String> ports;

    @CustomType.Constructor
    private FirewallPolicyRuleMatchLayer4Config(
        @CustomType.Parameter("ipProtocol") String ipProtocol,
        @CustomType.Parameter("ports") @Nullable List<String> ports) {
        this.ipProtocol = ipProtocol;
        this.ports = ports;
    }

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (`tcp`, `udp`, `icmp`, `esp`, `ah`, `ipip`, `sctp`), or the IP protocol number.
     * 
    */
    public String ipProtocol() {
        return this.ipProtocol;
    }
    /**
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ``.
     * 
    */
    public List<String> ports() {
        return this.ports == null ? List.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatchLayer4Config defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipProtocol;
        private @Nullable List<String> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatchLayer4Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ports = defaults.ports;
        }

        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }
        public Builder ports(@Nullable List<String> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }        public FirewallPolicyRuleMatchLayer4Config build() {
            return new FirewallPolicyRuleMatchLayer4Config(ipProtocol, ports);
        }
    }
}
