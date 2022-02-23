// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class NetworkInterfaceSubInterfaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceSubInterfaceResponse Empty = new NetworkInterfaceSubInterfaceResponse();

    /**
     * An IPv4 internal IP address to assign to the instance for this subinterface. If specified, ip_allocation_mode should be set to ALLOCATE_IP.
     * 
     */
    @InputImport(name="ipAddress", required=true)
      private final String ipAddress;

    public String getIpAddress() {
        return this.ipAddress;
    }

    @InputImport(name="ipAllocationMode", required=true)
      private final String ipAllocationMode;

    public String getIpAllocationMode() {
        return this.ipAllocationMode;
    }

    /**
     * If specified, this subnetwork must belong to the same network as that of the network interface. If not specified the subnet of network interface will be used. If you specify this property, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    @InputImport(name="subnetwork", required=true)
      private final String subnetwork;

    public String getSubnetwork() {
        return this.subnetwork;
    }

    /**
     * VLAN tag. Should match the VLAN(s) supported by the subnetwork to which this subinterface is connecting.
     * 
     */
    @InputImport(name="vlan", required=true)
      private final Integer vlan;

    public Integer getVlan() {
        return this.vlan;
    }

    public NetworkInterfaceSubInterfaceResponse(
        String ipAddress,
        String ipAllocationMode,
        String subnetwork,
        Integer vlan) {
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.ipAllocationMode = Objects.requireNonNull(ipAllocationMode, "expected parameter 'ipAllocationMode' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
        this.vlan = Objects.requireNonNull(vlan, "expected parameter 'vlan' to be non-null");
    }

    private NetworkInterfaceSubInterfaceResponse() {
        this.ipAddress = null;
        this.ipAllocationMode = null;
        this.subnetwork = null;
        this.vlan = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceSubInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private String ipAllocationMode;
        private String subnetwork;
        private Integer vlan;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceSubInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipAllocationMode = defaults.ipAllocationMode;
    	      this.subnetwork = defaults.subnetwork;
    	      this.vlan = defaults.vlan;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setIpAllocationMode(String ipAllocationMode) {
            this.ipAllocationMode = Objects.requireNonNull(ipAllocationMode);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public Builder setVlan(Integer vlan) {
            this.vlan = Objects.requireNonNull(vlan);
            return this;
        }
        public NetworkInterfaceSubInterfaceResponse build() {
            return new NetworkInterfaceSubInterfaceResponse(ipAddress, ipAllocationMode, subnetwork, vlan);
        }
    }
}
