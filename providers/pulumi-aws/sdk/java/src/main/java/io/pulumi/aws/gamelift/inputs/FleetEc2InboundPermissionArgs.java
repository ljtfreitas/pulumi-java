// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class FleetEc2InboundPermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetEc2InboundPermissionArgs Empty = new FleetEc2InboundPermissionArgs();

    /**
     * Starting value for a range of allowed port numbers.
     * 
     */
    @InputImport(name="fromPort", required=true)
    private final Input<Integer> fromPort;

    public Input<Integer> getFromPort() {
        return this.fromPort;
    }

    /**
     * Range of allowed IP addresses expressed in CIDR notationE.g., `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
     * 
     */
    @InputImport(name="ipRange", required=true)
    private final Input<String> ipRange;

    public Input<String> getIpRange() {
        return this.ipRange;
    }

    /**
     * Network communication protocol used by the fleetE.g., `TCP` or `UDP`
     * 
     */
    @InputImport(name="protocol", required=true)
    private final Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol;
    }

    /**
     * Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `from_port`.
     * 
     */
    @InputImport(name="toPort", required=true)
    private final Input<Integer> toPort;

    public Input<Integer> getToPort() {
        return this.toPort;
    }

    public FleetEc2InboundPermissionArgs(
        Input<Integer> fromPort,
        Input<String> ipRange,
        Input<String> protocol,
        Input<Integer> toPort) {
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.ipRange = Objects.requireNonNull(ipRange, "expected parameter 'ipRange' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private FleetEc2InboundPermissionArgs() {
        this.fromPort = Input.empty();
        this.ipRange = Input.empty();
        this.protocol = Input.empty();
        this.toPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetEc2InboundPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> fromPort;
        private Input<String> ipRange;
        private Input<String> protocol;
        private Input<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetEc2InboundPermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.ipRange = defaults.ipRange;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder setFromPort(Input<Integer> fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder setFromPort(Integer fromPort) {
            this.fromPort = Input.of(Objects.requireNonNull(fromPort));
            return this;
        }

        public Builder setIpRange(Input<String> ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }

        public Builder setIpRange(String ipRange) {
            this.ipRange = Input.of(Objects.requireNonNull(ipRange));
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

        public Builder setToPort(Input<Integer> toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }

        public Builder setToPort(Integer toPort) {
            this.toPort = Input.of(Objects.requireNonNull(toPort));
            return this;
        }
        public FleetEc2InboundPermissionArgs build() {
            return new FleetEc2InboundPermissionArgs(fromPort, ipRange, protocol, toPort);
        }
    }
}
