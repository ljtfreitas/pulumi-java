// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouterApplianceInstanceResponse {
    /**
     * The IP address of the network interface to use for peering.
     * 
     */
    private final String ipAddress;
    private final String networkInterface;
    /**
     * The URI of the virtual machine resource
     * 
     */
    private final String virtualMachine;

    @CustomType.Constructor
    private RouterApplianceInstanceResponse(
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("networkInterface") String networkInterface,
        @CustomType.Parameter("virtualMachine") String virtualMachine) {
        this.ipAddress = ipAddress;
        this.networkInterface = networkInterface;
        this.virtualMachine = virtualMachine;
    }

    /**
     * The IP address of the network interface to use for peering.
     * 
    */
    public String getIpAddress() {
        return this.ipAddress;
    }
    public String getNetworkInterface() {
        return this.networkInterface;
    }
    /**
     * The URI of the virtual machine resource
     * 
    */
    public String getVirtualMachine() {
        return this.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterApplianceInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private String networkInterface;
        private String virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterApplianceInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.networkInterface = defaults.networkInterface;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder networkInterface(String networkInterface) {
            this.networkInterface = Objects.requireNonNull(networkInterface);
            return this;
        }

        public Builder virtualMachine(String virtualMachine) {
            this.virtualMachine = Objects.requireNonNull(virtualMachine);
            return this;
        }
        public RouterApplianceInstanceResponse build() {
            return new RouterApplianceInstanceResponse(ipAddress, networkInterface, virtualMachine);
        }
    }
}
