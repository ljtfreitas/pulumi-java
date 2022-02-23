// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * NetworkInterface represents a NIC of a VM.
 * 
 */
public final class NetworkInterfaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceResponse Empty = new NetworkInterfaceResponse();

    /**
     * The external IP to define in the NIC.
     * 
     */
    @InputImport(name="externalIp", required=true)
      private final String externalIp;

    public String getExternalIp() {
        return this.externalIp;
    }

    /**
     * The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
     * 
     */
    @InputImport(name="internalIp", required=true)
      private final String internalIp;

    public String getInternalIp() {
        return this.internalIp;
    }

    /**
     * The network to connect the NIC to.
     * 
     */
    @InputImport(name="network", required=true)
      private final String network;

    public String getNetwork() {
        return this.network;
    }

    /**
     * The subnetwork to connect the NIC to.
     * 
     */
    @InputImport(name="subnetwork", required=true)
      private final String subnetwork;

    public String getSubnetwork() {
        return this.subnetwork;
    }

    public NetworkInterfaceResponse(
        String externalIp,
        String internalIp,
        String network,
        String subnetwork) {
        this.externalIp = Objects.requireNonNull(externalIp, "expected parameter 'externalIp' to be non-null");
        this.internalIp = Objects.requireNonNull(internalIp, "expected parameter 'internalIp' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
    }

    private NetworkInterfaceResponse() {
        this.externalIp = null;
        this.internalIp = null;
        this.network = null;
        this.subnetwork = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalIp;
        private String internalIp;
        private String network;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIp = defaults.externalIp;
    	      this.internalIp = defaults.internalIp;
    	      this.network = defaults.network;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setExternalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }

        public Builder setInternalIp(String internalIp) {
            this.internalIp = Objects.requireNonNull(internalIp);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(externalIp, internalIp, network, subnetwork);
        }
    }
}
