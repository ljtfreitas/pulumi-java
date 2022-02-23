// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.EndpointAddress;
import io.pulumi.kubernetes.core_v1.outputs.EndpointPort;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointSubset {
    /**
     * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
     * 
     */
    private final @Nullable List<EndpointAddress> addresses;
    /**
     * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
     * 
     */
    private final @Nullable List<EndpointAddress> notReadyAddresses;
    /**
     * Port numbers available on the related IP addresses.
     * 
     */
    private final @Nullable List<EndpointPort> ports;

    @OutputCustomType.Constructor({"addresses","notReadyAddresses","ports"})
    private EndpointSubset(
        @Nullable List<EndpointAddress> addresses,
        @Nullable List<EndpointAddress> notReadyAddresses,
        @Nullable List<EndpointPort> ports) {
        this.addresses = addresses;
        this.notReadyAddresses = notReadyAddresses;
        this.ports = ports;
    }

    /**
     * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
     * 
     */
    public List<EndpointAddress> getAddresses() {
        return this.addresses == null ? List.of() : this.addresses;
    }
    /**
     * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
     * 
     */
    public List<EndpointAddress> getNotReadyAddresses() {
        return this.notReadyAddresses == null ? List.of() : this.notReadyAddresses;
    }
    /**
     * Port numbers available on the related IP addresses.
     * 
     */
    public List<EndpointPort> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointSubset defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EndpointAddress> addresses;
        private @Nullable List<EndpointAddress> notReadyAddresses;
        private @Nullable List<EndpointPort> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointSubset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.notReadyAddresses = defaults.notReadyAddresses;
    	      this.ports = defaults.ports;
        }

        public Builder setAddresses(@Nullable List<EndpointAddress> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder setNotReadyAddresses(@Nullable List<EndpointAddress> notReadyAddresses) {
            this.notReadyAddresses = notReadyAddresses;
            return this;
        }

        public Builder setPorts(@Nullable List<EndpointPort> ports) {
            this.ports = ports;
            return this;
        }
        public EndpointSubset build() {
            return new EndpointSubset(addresses, notReadyAddresses, ports);
        }
    }
}
