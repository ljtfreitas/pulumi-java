// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultSecurityGroupIngressArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultSecurityGroupIngressArgs Empty = new DefaultSecurityGroupIngressArgs();

    /**
     * List of CIDR blocks.
     * 
     */
    @InputImport(name="cidrBlocks")
    private final @Nullable Input<List<String>> cidrBlocks;

    public Input<List<String>> getCidrBlocks() {
        return this.cidrBlocks == null ? Input.empty() : this.cidrBlocks;
    }

    /**
     * Description of this rule.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Start port (or ICMP type number if protocol is `icmp`)
     * 
     */
    @InputImport(name="fromPort", required=true)
    private final Input<Integer> fromPort;

    public Input<Integer> getFromPort() {
        return this.fromPort;
    }

    /**
     * List of IPv6 CIDR blocks.
     * 
     */
    @InputImport(name="ipv6CidrBlocks")
    private final @Nullable Input<List<String>> ipv6CidrBlocks;

    public Input<List<String>> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks == null ? Input.empty() : this.ipv6CidrBlocks;
    }

    /**
     * List of prefix list IDs (for allowing access to VPC endpoints)
     * 
     */
    @InputImport(name="prefixListIds")
    private final @Nullable Input<List<String>> prefixListIds;

    public Input<List<String>> getPrefixListIds() {
        return this.prefixListIds == null ? Input.empty() : this.prefixListIds;
    }

    /**
     * Protocol. If you select a protocol of "-1" (semantically equivalent to `all`, which is not a valid value here), you must specify a `from_port` and `to_port` equal to `0`. If not `icmp`, `tcp`, `udp`, or `-1` use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * 
     */
    @InputImport(name="protocol", required=true)
    private final Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol;
    }

    /**
     * List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
     * 
     */
    @InputImport(name="securityGroups")
    private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * Whether the security group itself will be added as a source to this egress rule.
     * 
     */
    @InputImport(name="self")
    private final @Nullable Input<Boolean> self;

    public Input<Boolean> getSelf() {
        return this.self == null ? Input.empty() : this.self;
    }

    /**
     * End range port (or ICMP code if protocol is `icmp`).
     * 
     */
    @InputImport(name="toPort", required=true)
    private final Input<Integer> toPort;

    public Input<Integer> getToPort() {
        return this.toPort;
    }

    public DefaultSecurityGroupIngressArgs(
        @Nullable Input<List<String>> cidrBlocks,
        @Nullable Input<String> description,
        Input<Integer> fromPort,
        @Nullable Input<List<String>> ipv6CidrBlocks,
        @Nullable Input<List<String>> prefixListIds,
        Input<String> protocol,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<Boolean> self,
        Input<Integer> toPort) {
        this.cidrBlocks = cidrBlocks;
        this.description = description;
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.ipv6CidrBlocks = ipv6CidrBlocks;
        this.prefixListIds = prefixListIds;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.securityGroups = securityGroups;
        this.self = self;
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private DefaultSecurityGroupIngressArgs() {
        this.cidrBlocks = Input.empty();
        this.description = Input.empty();
        this.fromPort = Input.empty();
        this.ipv6CidrBlocks = Input.empty();
        this.prefixListIds = Input.empty();
        this.protocol = Input.empty();
        this.securityGroups = Input.empty();
        this.self = Input.empty();
        this.toPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSecurityGroupIngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> cidrBlocks;
        private @Nullable Input<String> description;
        private Input<Integer> fromPort;
        private @Nullable Input<List<String>> ipv6CidrBlocks;
        private @Nullable Input<List<String>> prefixListIds;
        private Input<String> protocol;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<Boolean> self;
        private Input<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSecurityGroupIngressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.description = defaults.description;
    	      this.fromPort = defaults.fromPort;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
    	      this.prefixListIds = defaults.prefixListIds;
    	      this.protocol = defaults.protocol;
    	      this.securityGroups = defaults.securityGroups;
    	      this.self = defaults.self;
    	      this.toPort = defaults.toPort;
        }

        public Builder setCidrBlocks(@Nullable Input<List<String>> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }

        public Builder setCidrBlocks(@Nullable List<String> cidrBlocks) {
            this.cidrBlocks = Input.ofNullable(cidrBlocks);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFromPort(Input<Integer> fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder setFromPort(Integer fromPort) {
            this.fromPort = Input.of(Objects.requireNonNull(fromPort));
            return this;
        }

        public Builder setIpv6CidrBlocks(@Nullable Input<List<String>> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }

        public Builder setIpv6CidrBlocks(@Nullable List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = Input.ofNullable(ipv6CidrBlocks);
            return this;
        }

        public Builder setPrefixListIds(@Nullable Input<List<String>> prefixListIds) {
            this.prefixListIds = prefixListIds;
            return this;
        }

        public Builder setPrefixListIds(@Nullable List<String> prefixListIds) {
            this.prefixListIds = Input.ofNullable(prefixListIds);
            return this;
        }

        public Builder setProtocol(Input<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }

        public Builder setSecurityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder setSelf(@Nullable Input<Boolean> self) {
            this.self = self;
            return this;
        }

        public Builder setSelf(@Nullable Boolean self) {
            this.self = Input.ofNullable(self);
            return this;
        }

        public Builder setToPort(Input<Integer> toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }

        public Builder setToPort(Integer toPort) {
            this.toPort = Input.of(Objects.requireNonNull(toPort));
            return this;
        }
        public DefaultSecurityGroupIngressArgs build() {
            return new DefaultSecurityGroupIngressArgs(cidrBlocks, description, fromPort, ipv6CidrBlocks, prefixListIds, protocol, securityGroups, self, toPort);
        }
    }
}
