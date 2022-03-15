// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.SubnetResourceSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the virtual network resource settings.
 * 
 */
public final class VirtualNetworkResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkResourceSettingsResponse Empty = new VirtualNetworkResourceSettingsResponse();

    /**
     * Gets or sets the address prefixes for the virtual network.
     * 
     */
    @Import(name="addressSpace")
      private final @Nullable List<String> addressSpace;

    public List<String> getAddressSpace() {
        return this.addressSpace == null ? List.of() : this.addressSpace;
    }

    /**
     * Gets or sets DHCPOptions that contains an array of DNS servers available to VMs
     * deployed in the virtual network.
     * 
     */
    @Import(name="dnsServers")
      private final @Nullable List<String> dnsServers;

    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }

    /**
     * Gets or sets a value indicating whether gets or sets whether the
     * DDOS protection should be switched on.
     * 
     */
    @Import(name="enableDdosProtection")
      private final @Nullable Boolean enableDdosProtection;

    public Optional<Boolean> getEnableDdosProtection() {
        return this.enableDdosProtection == null ? Optional.empty() : Optional.ofNullable(this.enableDdosProtection);
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/virtualNetworks'.
     * 
     */
    @Import(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets List of subnets in a VirtualNetwork.
     * 
     */
    @Import(name="subnets")
      private final @Nullable List<SubnetResourceSettingsResponse> subnets;

    public List<SubnetResourceSettingsResponse> getSubnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @Import(name="targetResourceName", required=true)
      private final String targetResourceName;

    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    public VirtualNetworkResourceSettingsResponse(
        @Nullable List<String> addressSpace,
        @Nullable List<String> dnsServers,
        @Nullable Boolean enableDdosProtection,
        String resourceType,
        @Nullable List<SubnetResourceSettingsResponse> subnets,
        String targetResourceName) {
        this.addressSpace = addressSpace;
        this.dnsServers = dnsServers;
        this.enableDdosProtection = enableDdosProtection;
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.subnets = subnets;
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
    }

    private VirtualNetworkResourceSettingsResponse() {
        this.addressSpace = List.of();
        this.dnsServers = List.of();
        this.enableDdosProtection = null;
        this.resourceType = null;
        this.subnets = List.of();
        this.targetResourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addressSpace;
        private @Nullable List<String> dnsServers;
        private @Nullable Boolean enableDdosProtection;
        private String resourceType;
        private @Nullable List<SubnetResourceSettingsResponse> subnets;
        private String targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressSpace = defaults.addressSpace;
    	      this.dnsServers = defaults.dnsServers;
    	      this.enableDdosProtection = defaults.enableDdosProtection;
    	      this.resourceType = defaults.resourceType;
    	      this.subnets = defaults.subnets;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder addressSpace(@Nullable List<String> addressSpace) {
            this.addressSpace = addressSpace;
            return this;
        }

        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder enableDdosProtection(@Nullable Boolean enableDdosProtection) {
            this.enableDdosProtection = enableDdosProtection;
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder subnets(@Nullable List<SubnetResourceSettingsResponse> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }
        public VirtualNetworkResourceSettingsResponse build() {
            return new VirtualNetworkResourceSettingsResponse(addressSpace, dnsServers, enableDdosProtection, resourceType, subnets, targetResourceName);
        }
    }
}
