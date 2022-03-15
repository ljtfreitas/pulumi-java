// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A class that contains virtual network definition.
 * 
 */
public final class VirtualNetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkConfigurationArgs Empty = new VirtualNetworkConfigurationArgs();

    /**
     * Data management's service public IP address resource id.
     * 
     */
    @Import(name="dataManagementPublicIpId", required=true)
      private final Output<String> dataManagementPublicIpId;

    public Output<String> getDataManagementPublicIpId() {
        return this.dataManagementPublicIpId;
    }

    /**
     * Engine service's public IP address resource id.
     * 
     */
    @Import(name="enginePublicIpId", required=true)
      private final Output<String> enginePublicIpId;

    public Output<String> getEnginePublicIpId() {
        return this.enginePublicIpId;
    }

    /**
     * The subnet resource id.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    public VirtualNetworkConfigurationArgs(
        Output<String> dataManagementPublicIpId,
        Output<String> enginePublicIpId,
        Output<String> subnetId) {
        this.dataManagementPublicIpId = Objects.requireNonNull(dataManagementPublicIpId, "expected parameter 'dataManagementPublicIpId' to be non-null");
        this.enginePublicIpId = Objects.requireNonNull(enginePublicIpId, "expected parameter 'enginePublicIpId' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private VirtualNetworkConfigurationArgs() {
        this.dataManagementPublicIpId = Output.empty();
        this.enginePublicIpId = Output.empty();
        this.subnetId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataManagementPublicIpId;
        private Output<String> enginePublicIpId;
        private Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataManagementPublicIpId = defaults.dataManagementPublicIpId;
    	      this.enginePublicIpId = defaults.enginePublicIpId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder dataManagementPublicIpId(Output<String> dataManagementPublicIpId) {
            this.dataManagementPublicIpId = Objects.requireNonNull(dataManagementPublicIpId);
            return this;
        }

        public Builder dataManagementPublicIpId(String dataManagementPublicIpId) {
            this.dataManagementPublicIpId = Output.of(Objects.requireNonNull(dataManagementPublicIpId));
            return this;
        }

        public Builder enginePublicIpId(Output<String> enginePublicIpId) {
            this.enginePublicIpId = Objects.requireNonNull(enginePublicIpId);
            return this;
        }

        public Builder enginePublicIpId(String enginePublicIpId) {
            this.enginePublicIpId = Output.of(Objects.requireNonNull(enginePublicIpId));
            return this;
        }

        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }
        public VirtualNetworkConfigurationArgs build() {
            return new VirtualNetworkConfigurationArgs(dataManagementPublicIpId, enginePublicIpId, subnetId);
        }
    }
}
