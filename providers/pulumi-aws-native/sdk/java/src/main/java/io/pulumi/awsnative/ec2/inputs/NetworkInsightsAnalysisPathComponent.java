// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAnalysisAnalysisAclRule;
import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAnalysisAnalysisComponent;
import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAnalysisAnalysisPacketHeader;
import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAnalysisAnalysisRouteTableRoute;
import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAnalysisAnalysisSecurityGroupRule;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisPathComponent extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInsightsAnalysisPathComponent Empty = new NetworkInsightsAnalysisPathComponent();

    @InputImport(name="aclRule")
        private final @Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule;

    public Optional<NetworkInsightsAnalysisAnalysisAclRule> getAclRule() {
        return this.aclRule == null ? Optional.empty() : Optional.ofNullable(this.aclRule);
    }

    @InputImport(name="component")
        private final @Nullable NetworkInsightsAnalysisAnalysisComponent component;

    public Optional<NetworkInsightsAnalysisAnalysisComponent> getComponent() {
        return this.component == null ? Optional.empty() : Optional.ofNullable(this.component);
    }

    @InputImport(name="destinationVpc")
        private final @Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc;

    public Optional<NetworkInsightsAnalysisAnalysisComponent> getDestinationVpc() {
        return this.destinationVpc == null ? Optional.empty() : Optional.ofNullable(this.destinationVpc);
    }

    @InputImport(name="inboundHeader")
        private final @Nullable NetworkInsightsAnalysisAnalysisPacketHeader inboundHeader;

    public Optional<NetworkInsightsAnalysisAnalysisPacketHeader> getInboundHeader() {
        return this.inboundHeader == null ? Optional.empty() : Optional.ofNullable(this.inboundHeader);
    }

    @InputImport(name="outboundHeader")
        private final @Nullable NetworkInsightsAnalysisAnalysisPacketHeader outboundHeader;

    public Optional<NetworkInsightsAnalysisAnalysisPacketHeader> getOutboundHeader() {
        return this.outboundHeader == null ? Optional.empty() : Optional.ofNullable(this.outboundHeader);
    }

    @InputImport(name="routeTableRoute")
        private final @Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute;

    public Optional<NetworkInsightsAnalysisAnalysisRouteTableRoute> getRouteTableRoute() {
        return this.routeTableRoute == null ? Optional.empty() : Optional.ofNullable(this.routeTableRoute);
    }

    @InputImport(name="securityGroupRule")
        private final @Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule;

    public Optional<NetworkInsightsAnalysisAnalysisSecurityGroupRule> getSecurityGroupRule() {
        return this.securityGroupRule == null ? Optional.empty() : Optional.ofNullable(this.securityGroupRule);
    }

    @InputImport(name="sequenceNumber")
        private final @Nullable Integer sequenceNumber;

    public Optional<Integer> getSequenceNumber() {
        return this.sequenceNumber == null ? Optional.empty() : Optional.ofNullable(this.sequenceNumber);
    }

    @InputImport(name="sourceVpc")
        private final @Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc;

    public Optional<NetworkInsightsAnalysisAnalysisComponent> getSourceVpc() {
        return this.sourceVpc == null ? Optional.empty() : Optional.ofNullable(this.sourceVpc);
    }

    @InputImport(name="subnet")
        private final @Nullable NetworkInsightsAnalysisAnalysisComponent subnet;

    public Optional<NetworkInsightsAnalysisAnalysisComponent> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    @InputImport(name="vpc")
        private final @Nullable NetworkInsightsAnalysisAnalysisComponent vpc;

    public Optional<NetworkInsightsAnalysisAnalysisComponent> getVpc() {
        return this.vpc == null ? Optional.empty() : Optional.ofNullable(this.vpc);
    }

    public NetworkInsightsAnalysisPathComponent(
        @Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule,
        @Nullable NetworkInsightsAnalysisAnalysisComponent component,
        @Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc,
        @Nullable NetworkInsightsAnalysisAnalysisPacketHeader inboundHeader,
        @Nullable NetworkInsightsAnalysisAnalysisPacketHeader outboundHeader,
        @Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute,
        @Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule,
        @Nullable Integer sequenceNumber,
        @Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc,
        @Nullable NetworkInsightsAnalysisAnalysisComponent subnet,
        @Nullable NetworkInsightsAnalysisAnalysisComponent vpc) {
        this.aclRule = aclRule;
        this.component = component;
        this.destinationVpc = destinationVpc;
        this.inboundHeader = inboundHeader;
        this.outboundHeader = outboundHeader;
        this.routeTableRoute = routeTableRoute;
        this.securityGroupRule = securityGroupRule;
        this.sequenceNumber = sequenceNumber;
        this.sourceVpc = sourceVpc;
        this.subnet = subnet;
        this.vpc = vpc;
    }

    private NetworkInsightsAnalysisPathComponent() {
        this.aclRule = null;
        this.component = null;
        this.destinationVpc = null;
        this.inboundHeader = null;
        this.outboundHeader = null;
        this.routeTableRoute = null;
        this.securityGroupRule = null;
        this.sequenceNumber = null;
        this.sourceVpc = null;
        this.subnet = null;
        this.vpc = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisPathComponent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent component;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc;
        private @Nullable NetworkInsightsAnalysisAnalysisPacketHeader inboundHeader;
        private @Nullable NetworkInsightsAnalysisAnalysisPacketHeader outboundHeader;
        private @Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute;
        private @Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule;
        private @Nullable Integer sequenceNumber;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent subnet;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisPathComponent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclRule = defaults.aclRule;
    	      this.component = defaults.component;
    	      this.destinationVpc = defaults.destinationVpc;
    	      this.inboundHeader = defaults.inboundHeader;
    	      this.outboundHeader = defaults.outboundHeader;
    	      this.routeTableRoute = defaults.routeTableRoute;
    	      this.securityGroupRule = defaults.securityGroupRule;
    	      this.sequenceNumber = defaults.sequenceNumber;
    	      this.sourceVpc = defaults.sourceVpc;
    	      this.subnet = defaults.subnet;
    	      this.vpc = defaults.vpc;
        }

        public Builder setAclRule(@Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule) {
            this.aclRule = aclRule;
            return this;
        }

        public Builder setComponent(@Nullable NetworkInsightsAnalysisAnalysisComponent component) {
            this.component = component;
            return this;
        }

        public Builder setDestinationVpc(@Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc) {
            this.destinationVpc = destinationVpc;
            return this;
        }

        public Builder setInboundHeader(@Nullable NetworkInsightsAnalysisAnalysisPacketHeader inboundHeader) {
            this.inboundHeader = inboundHeader;
            return this;
        }

        public Builder setOutboundHeader(@Nullable NetworkInsightsAnalysisAnalysisPacketHeader outboundHeader) {
            this.outboundHeader = outboundHeader;
            return this;
        }

        public Builder setRouteTableRoute(@Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute) {
            this.routeTableRoute = routeTableRoute;
            return this;
        }

        public Builder setSecurityGroupRule(@Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule) {
            this.securityGroupRule = securityGroupRule;
            return this;
        }

        public Builder setSequenceNumber(@Nullable Integer sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }

        public Builder setSourceVpc(@Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc) {
            this.sourceVpc = sourceVpc;
            return this;
        }

        public Builder setSubnet(@Nullable NetworkInsightsAnalysisAnalysisComponent subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setVpc(@Nullable NetworkInsightsAnalysisAnalysisComponent vpc) {
            this.vpc = vpc;
            return this;
        }
        public NetworkInsightsAnalysisPathComponent build() {
            return new NetworkInsightsAnalysisPathComponent(aclRule, component, destinationVpc, inboundHeader, outboundHeader, routeTableRoute, securityGroupRule, sequenceNumber, sourceVpc, subnet, vpc);
        }
    }
}
