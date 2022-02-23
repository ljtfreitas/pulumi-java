// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNetworkConfigurationResponse {
    /**
     * The full resource ID of a subnet in a virtual network to deploy the API Management service in.
     * 
     */
    private final @Nullable String subnetResourceId;
    /**
     * The name of the subnet.
     * 
     */
    private final String subnetname;
    /**
     * The virtual network ID. This is typically a GUID. Expect a null GUID by default.
     * 
     */
    private final String vnetid;

    @OutputCustomType.Constructor({"subnetResourceId","subnetname","vnetid"})
    private VirtualNetworkConfigurationResponse(
        @Nullable String subnetResourceId,
        String subnetname,
        String vnetid) {
        this.subnetResourceId = subnetResourceId;
        this.subnetname = Objects.requireNonNull(subnetname);
        this.vnetid = Objects.requireNonNull(vnetid);
    }

    /**
     * The full resource ID of a subnet in a virtual network to deploy the API Management service in.
     * 
     */
    public Optional<String> getSubnetResourceId() {
        return Optional.ofNullable(this.subnetResourceId);
    }
    /**
     * The name of the subnet.
     * 
     */
    public String getSubnetname() {
        return this.subnetname;
    }
    /**
     * The virtual network ID. This is typically a GUID. Expect a null GUID by default.
     * 
     */
    public String getVnetid() {
        return this.vnetid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetResourceId;
        private String subnetname;
        private String vnetid;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetResourceId = defaults.subnetResourceId;
    	      this.subnetname = defaults.subnetname;
    	      this.vnetid = defaults.vnetid;
        }

        public Builder setSubnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }

        public Builder setSubnetname(String subnetname) {
            this.subnetname = Objects.requireNonNull(subnetname);
            return this;
        }

        public Builder setVnetid(String vnetid) {
            this.vnetid = Objects.requireNonNull(vnetid);
            return this;
        }
        public VirtualNetworkConfigurationResponse build() {
            return new VirtualNetworkConfigurationResponse(subnetResourceId, subnetname, vnetid);
        }
    }
}
