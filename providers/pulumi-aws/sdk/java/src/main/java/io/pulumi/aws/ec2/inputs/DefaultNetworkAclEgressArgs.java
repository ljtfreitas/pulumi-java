// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultNetworkAclEgressArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultNetworkAclEgressArgs Empty = new DefaultNetworkAclEgressArgs();

    /**
     * The action to take.
     * 
     */
    @InputImport(name="action", required=true)
    private final Input<String> action;

    public Input<String> getAction() {
        return this.action;
    }

    /**
     * The CIDR block to match. This must be a valid network mask.
     * 
     */
    @InputImport(name="cidrBlock")
    private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    /**
     * The from port to match.
     * 
     */
    @InputImport(name="fromPort", required=true)
    private final Input<Integer> fromPort;

    public Input<Integer> getFromPort() {
        return this.fromPort;
    }

    /**
     * The ICMP type code to be used. Default 0.
     * 
     */
    @InputImport(name="icmpCode")
    private final @Nullable Input<Integer> icmpCode;

    public Input<Integer> getIcmpCode() {
        return this.icmpCode == null ? Input.empty() : this.icmpCode;
    }

    /**
     * The ICMP type to be used. Default 0.
     * 
     */
    @InputImport(name="icmpType")
    private final @Nullable Input<Integer> icmpType;

    public Input<Integer> getIcmpType() {
        return this.icmpType == null ? Input.empty() : this.icmpType;
    }

    /**
     * The IPv6 CIDR block.
     * 
     */
    @InputImport(name="ipv6CidrBlock")
    private final @Nullable Input<String> ipv6CidrBlock;

    public Input<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Input.empty() : this.ipv6CidrBlock;
    }

    /**
     * The protocol to match. If using the -1 'all' protocol, you must specify a from and to port of 0.
     * 
     */
    @InputImport(name="protocol", required=true)
    private final Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol;
    }

    /**
     * The rule number. Used for ordering.
     * 
     */
    @InputImport(name="ruleNo", required=true)
    private final Input<Integer> ruleNo;

    public Input<Integer> getRuleNo() {
        return this.ruleNo;
    }

    /**
     * The to port to match.
     * 
     */
    @InputImport(name="toPort", required=true)
    private final Input<Integer> toPort;

    public Input<Integer> getToPort() {
        return this.toPort;
    }

    public DefaultNetworkAclEgressArgs(
        Input<String> action,
        @Nullable Input<String> cidrBlock,
        Input<Integer> fromPort,
        @Nullable Input<Integer> icmpCode,
        @Nullable Input<Integer> icmpType,
        @Nullable Input<String> ipv6CidrBlock,
        Input<String> protocol,
        Input<Integer> ruleNo,
        Input<Integer> toPort) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.cidrBlock = cidrBlock;
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.icmpCode = icmpCode;
        this.icmpType = icmpType;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.ruleNo = Objects.requireNonNull(ruleNo, "expected parameter 'ruleNo' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private DefaultNetworkAclEgressArgs() {
        this.action = Input.empty();
        this.cidrBlock = Input.empty();
        this.fromPort = Input.empty();
        this.icmpCode = Input.empty();
        this.icmpType = Input.empty();
        this.ipv6CidrBlock = Input.empty();
        this.protocol = Input.empty();
        this.ruleNo = Input.empty();
        this.toPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultNetworkAclEgressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> action;
        private @Nullable Input<String> cidrBlock;
        private Input<Integer> fromPort;
        private @Nullable Input<Integer> icmpCode;
        private @Nullable Input<Integer> icmpType;
        private @Nullable Input<String> ipv6CidrBlock;
        private Input<String> protocol;
        private Input<Integer> ruleNo;
        private Input<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultNetworkAclEgressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.fromPort = defaults.fromPort;
    	      this.icmpCode = defaults.icmpCode;
    	      this.icmpType = defaults.icmpType;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.protocol = defaults.protocol;
    	      this.ruleNo = defaults.ruleNo;
    	      this.toPort = defaults.toPort;
        }

        public Builder setAction(Input<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(String action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setCidrBlock(@Nullable Input<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder setCidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Input.ofNullable(cidrBlock);
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

        public Builder setIcmpCode(@Nullable Input<Integer> icmpCode) {
            this.icmpCode = icmpCode;
            return this;
        }

        public Builder setIcmpCode(@Nullable Integer icmpCode) {
            this.icmpCode = Input.ofNullable(icmpCode);
            return this;
        }

        public Builder setIcmpType(@Nullable Input<Integer> icmpType) {
            this.icmpType = icmpType;
            return this;
        }

        public Builder setIcmpType(@Nullable Integer icmpType) {
            this.icmpType = Input.ofNullable(icmpType);
            return this;
        }

        public Builder setIpv6CidrBlock(@Nullable Input<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        public Builder setIpv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Input.ofNullable(ipv6CidrBlock);
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

        public Builder setRuleNo(Input<Integer> ruleNo) {
            this.ruleNo = Objects.requireNonNull(ruleNo);
            return this;
        }

        public Builder setRuleNo(Integer ruleNo) {
            this.ruleNo = Input.of(Objects.requireNonNull(ruleNo));
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
        public DefaultNetworkAclEgressArgs build() {
            return new DefaultNetworkAclEgressArgs(action, cidrBlock, fromPort, icmpCode, icmpType, ipv6CidrBlock, protocol, ruleNo, toPort);
        }
    }
}
