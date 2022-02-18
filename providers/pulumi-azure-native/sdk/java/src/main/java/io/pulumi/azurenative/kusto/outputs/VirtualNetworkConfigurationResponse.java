// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualNetworkConfigurationResponse {
    /**
     * Data management's service public IP address resource id.
     * 
     */
    private final String dataManagementPublicIpId;
    /**
     * Engine service's public IP address resource id.
     * 
     */
    private final String enginePublicIpId;
    /**
     * The subnet resource id.
     * 
     */
    private final String subnetId;

    @OutputCustomType.Constructor({"dataManagementPublicIpId","enginePublicIpId","subnetId"})
    private VirtualNetworkConfigurationResponse(
        String dataManagementPublicIpId,
        String enginePublicIpId,
        String subnetId) {
        this.dataManagementPublicIpId = Objects.requireNonNull(dataManagementPublicIpId);
        this.enginePublicIpId = Objects.requireNonNull(enginePublicIpId);
        this.subnetId = Objects.requireNonNull(subnetId);
    }

    /**
     * Data management's service public IP address resource id.
     * 
     */
    public String getDataManagementPublicIpId() {
        return this.dataManagementPublicIpId;
    }
    /**
     * Engine service's public IP address resource id.
     * 
     */
    public String getEnginePublicIpId() {
        return this.enginePublicIpId;
    }
    /**
     * The subnet resource id.
     * 
     */
    public String getSubnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataManagementPublicIpId;
        private String enginePublicIpId;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataManagementPublicIpId = defaults.dataManagementPublicIpId;
    	      this.enginePublicIpId = defaults.enginePublicIpId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setDataManagementPublicIpId(String dataManagementPublicIpId) {
            this.dataManagementPublicIpId = Objects.requireNonNull(dataManagementPublicIpId);
            return this;
        }

        public Builder setEnginePublicIpId(String enginePublicIpId) {
            this.enginePublicIpId = Objects.requireNonNull(enginePublicIpId);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public VirtualNetworkConfigurationResponse build() {
            return new VirtualNetworkConfigurationResponse(dataManagementPublicIpId, enginePublicIpId, subnetId);
        }
    }
}
