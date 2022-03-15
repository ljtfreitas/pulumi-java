// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.awsnative.gamelift.enums.FleetIpPermissionProtocol;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A range of IP addresses and port settings that allow inbound traffic to connect to server processes on an Amazon GameLift hosting resource. New game sessions that are started on the fleet are assigned an IP address/port number combination, which must fall into the fleet's allowed ranges. For fleets created with a custom game server, the ranges reflect the server's game session assignments. For Realtime Servers fleets, Amazon GameLift automatically opens two port ranges, one for TCP messaging and one for UDP, for use by the Realtime servers.
 * 
 */
public final class FleetIpPermission extends io.pulumi.resources.InvokeArgs {

    public static final FleetIpPermission Empty = new FleetIpPermission();

    /**
     * A starting value for a range of allowed port numbers.
     * 
     */
    @Import(name="fromPort", required=true)
      private final Integer fromPort;

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * A range of allowed IP addresses. This value must be expressed in CIDR notation. Example: "000.000.000.000/[subnet mask]" or optionally the shortened version "0.0.0.0/[subnet mask]".
     * 
     */
    @Import(name="ipRange", required=true)
      private final String ipRange;

    public String getIpRange() {
        return this.ipRange;
    }

    /**
     * The network communication protocol used by the fleet.
     * 
     */
    @Import(name="protocol", required=true)
      private final FleetIpPermissionProtocol protocol;

    public FleetIpPermissionProtocol getProtocol() {
        return this.protocol;
    }

    /**
     * An ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than FromPort.
     * 
     */
    @Import(name="toPort", required=true)
      private final Integer toPort;

    public Integer getToPort() {
        return this.toPort;
    }

    public FleetIpPermission(
        Integer fromPort,
        String ipRange,
        FleetIpPermissionProtocol protocol,
        Integer toPort) {
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.ipRange = Objects.requireNonNull(ipRange, "expected parameter 'ipRange' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private FleetIpPermission() {
        this.fromPort = null;
        this.ipRange = null;
        this.protocol = null;
        this.toPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetIpPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fromPort;
        private String ipRange;
        private FleetIpPermissionProtocol protocol;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetIpPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.ipRange = defaults.ipRange;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder ipRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }

        public Builder protocol(FleetIpPermissionProtocol protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder toPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public FleetIpPermission build() {
            return new FleetIpPermission(fromPort, ipRange, protocol, toPort);
        }
    }
}
