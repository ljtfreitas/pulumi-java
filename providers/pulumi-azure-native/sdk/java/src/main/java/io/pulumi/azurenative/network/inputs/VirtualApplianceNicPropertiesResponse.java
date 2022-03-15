// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Network Virtual Appliance NIC properties.
 * 
 */
public final class VirtualApplianceNicPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualApplianceNicPropertiesResponse Empty = new VirtualApplianceNicPropertiesResponse();

    /**
     * NIC name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Private IP address.
     * 
     */
    @Import(name="privateIpAddress", required=true)
      private final String privateIpAddress;

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Public IP address.
     * 
     */
    @Import(name="publicIpAddress", required=true)
      private final String publicIpAddress;

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public VirtualApplianceNicPropertiesResponse(
        String name,
        String privateIpAddress,
        String publicIpAddress) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress, "expected parameter 'privateIpAddress' to be non-null");
        this.publicIpAddress = Objects.requireNonNull(publicIpAddress, "expected parameter 'publicIpAddress' to be non-null");
    }

    private VirtualApplianceNicPropertiesResponse() {
        this.name = null;
        this.privateIpAddress = null;
        this.publicIpAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualApplianceNicPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String privateIpAddress;
        private String publicIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualApplianceNicPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }
        public VirtualApplianceNicPropertiesResponse build() {
            return new VirtualApplianceNicPropertiesResponse(name, privateIpAddress, publicIpAddress);
        }
    }
}
