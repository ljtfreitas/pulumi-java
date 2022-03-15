// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicenetworking.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionState extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * Name of VPC network connected with service producers using VPC peering.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    @Import(name="peering")
      private final @Nullable Output<String> peering;

    public Output<String> getPeering() {
        return this.peering == null ? Output.empty() : this.peering;
    }

    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     * 
     */
    @Import(name="reservedPeeringRanges")
      private final @Nullable Output<List<String>> reservedPeeringRanges;

    public Output<List<String>> getReservedPeeringRanges() {
        return this.reservedPeeringRanges == null ? Output.empty() : this.reservedPeeringRanges;
    }

    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * 'servicenetworking.googleapis.com'.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Output.empty() : this.service;
    }

    public ConnectionState(
        @Nullable Output<String> network,
        @Nullable Output<String> peering,
        @Nullable Output<List<String>> reservedPeeringRanges,
        @Nullable Output<String> service) {
        this.network = network;
        this.peering = peering;
        this.reservedPeeringRanges = reservedPeeringRanges;
        this.service = service;
    }

    private ConnectionState() {
        this.network = Output.empty();
        this.peering = Output.empty();
        this.reservedPeeringRanges = Output.empty();
        this.service = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> network;
        private @Nullable Output<String> peering;
        private @Nullable Output<List<String>> reservedPeeringRanges;
        private @Nullable Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
    	      this.peering = defaults.peering;
    	      this.reservedPeeringRanges = defaults.reservedPeeringRanges;
    	      this.service = defaults.service;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }

        public Builder peering(@Nullable Output<String> peering) {
            this.peering = peering;
            return this;
        }

        public Builder peering(@Nullable String peering) {
            this.peering = Output.ofNullable(peering);
            return this;
        }

        public Builder reservedPeeringRanges(@Nullable Output<List<String>> reservedPeeringRanges) {
            this.reservedPeeringRanges = reservedPeeringRanges;
            return this;
        }

        public Builder reservedPeeringRanges(@Nullable List<String> reservedPeeringRanges) {
            this.reservedPeeringRanges = Output.ofNullable(reservedPeeringRanges);
            return this;
        }

        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }

        public Builder service(@Nullable String service) {
            this.service = Output.ofNullable(service);
            return this;
        }
        public ConnectionState build() {
            return new ConnectionState(network, peering, reservedPeeringRanges, service);
        }
    }
}
