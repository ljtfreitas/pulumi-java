// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.outputs;

import io.pulumi.azurenative.sqlvirtualmachine.outputs.PrivateIPAddressResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoadBalancerConfigurationResponse {
    /**
     * Resource id of the load balancer.
     * 
     */
    private final @Nullable String loadBalancerResourceId;
    /**
     * Private IP address.
     * 
     */
    private final @Nullable PrivateIPAddressResponse privateIpAddress;
    /**
     * Probe port.
     * 
     */
    private final @Nullable Integer probePort;
    /**
     * Resource id of the public IP.
     * 
     */
    private final @Nullable String publicIpAddressResourceId;
    /**
     * List of the SQL virtual machine instance resource id's that are enrolled into the availability group listener.
     * 
     */
    private final @Nullable List<String> sqlVirtualMachineInstances;

    @OutputCustomType.Constructor({"loadBalancerResourceId","privateIpAddress","probePort","publicIpAddressResourceId","sqlVirtualMachineInstances"})
    private LoadBalancerConfigurationResponse(
        @Nullable String loadBalancerResourceId,
        @Nullable PrivateIPAddressResponse privateIpAddress,
        @Nullable Integer probePort,
        @Nullable String publicIpAddressResourceId,
        @Nullable List<String> sqlVirtualMachineInstances) {
        this.loadBalancerResourceId = loadBalancerResourceId;
        this.privateIpAddress = privateIpAddress;
        this.probePort = probePort;
        this.publicIpAddressResourceId = publicIpAddressResourceId;
        this.sqlVirtualMachineInstances = sqlVirtualMachineInstances;
    }

    /**
     * Resource id of the load balancer.
     * 
     */
    public Optional<String> getLoadBalancerResourceId() {
        return Optional.ofNullable(this.loadBalancerResourceId);
    }
    /**
     * Private IP address.
     * 
     */
    public Optional<PrivateIPAddressResponse> getPrivateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }
    /**
     * Probe port.
     * 
     */
    public Optional<Integer> getProbePort() {
        return Optional.ofNullable(this.probePort);
    }
    /**
     * Resource id of the public IP.
     * 
     */
    public Optional<String> getPublicIpAddressResourceId() {
        return Optional.ofNullable(this.publicIpAddressResourceId);
    }
    /**
     * List of the SQL virtual machine instance resource id's that are enrolled into the availability group listener.
     * 
     */
    public List<String> getSqlVirtualMachineInstances() {
        return this.sqlVirtualMachineInstances == null ? List.of() : this.sqlVirtualMachineInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String loadBalancerResourceId;
        private @Nullable PrivateIPAddressResponse privateIpAddress;
        private @Nullable Integer probePort;
        private @Nullable String publicIpAddressResourceId;
        private @Nullable List<String> sqlVirtualMachineInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerResourceId = defaults.loadBalancerResourceId;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.probePort = defaults.probePort;
    	      this.publicIpAddressResourceId = defaults.publicIpAddressResourceId;
    	      this.sqlVirtualMachineInstances = defaults.sqlVirtualMachineInstances;
        }

        public Builder setLoadBalancerResourceId(@Nullable String loadBalancerResourceId) {
            this.loadBalancerResourceId = loadBalancerResourceId;
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable PrivateIPAddressResponse privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder setProbePort(@Nullable Integer probePort) {
            this.probePort = probePort;
            return this;
        }

        public Builder setPublicIpAddressResourceId(@Nullable String publicIpAddressResourceId) {
            this.publicIpAddressResourceId = publicIpAddressResourceId;
            return this;
        }

        public Builder setSqlVirtualMachineInstances(@Nullable List<String> sqlVirtualMachineInstances) {
            this.sqlVirtualMachineInstances = sqlVirtualMachineInstances;
            return this;
        }
        public LoadBalancerConfigurationResponse build() {
            return new LoadBalancerConfigurationResponse(loadBalancerResourceId, privateIpAddress, probePort, publicIpAddressResourceId, sqlVirtualMachineInstances);
        }
    }
}
