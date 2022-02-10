// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.azurenative.databricks.inputs.WorkspaceCustomBooleanParameterResponse;
import io.pulumi.azurenative.databricks.inputs.WorkspaceCustomObjectParameterResponse;
import io.pulumi.azurenative.databricks.inputs.WorkspaceCustomStringParameterResponse;
import io.pulumi.azurenative.databricks.inputs.WorkspaceEncryptionParameterResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceCustomParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkspaceCustomParametersResponse Empty = new WorkspaceCustomParametersResponse();

    @InputImport(name="amlWorkspaceId")
    private final @Nullable WorkspaceCustomStringParameterResponse amlWorkspaceId;

    public Optional<WorkspaceCustomStringParameterResponse> getAmlWorkspaceId() {
        return this.amlWorkspaceId == null ? Optional.empty() : Optional.ofNullable(this.amlWorkspaceId);
    }

    @InputImport(name="customPrivateSubnetName")
    private final @Nullable WorkspaceCustomStringParameterResponse customPrivateSubnetName;

    public Optional<WorkspaceCustomStringParameterResponse> getCustomPrivateSubnetName() {
        return this.customPrivateSubnetName == null ? Optional.empty() : Optional.ofNullable(this.customPrivateSubnetName);
    }

    @InputImport(name="customPublicSubnetName")
    private final @Nullable WorkspaceCustomStringParameterResponse customPublicSubnetName;

    public Optional<WorkspaceCustomStringParameterResponse> getCustomPublicSubnetName() {
        return this.customPublicSubnetName == null ? Optional.empty() : Optional.ofNullable(this.customPublicSubnetName);
    }

    @InputImport(name="customVirtualNetworkId")
    private final @Nullable WorkspaceCustomStringParameterResponse customVirtualNetworkId;

    public Optional<WorkspaceCustomStringParameterResponse> getCustomVirtualNetworkId() {
        return this.customVirtualNetworkId == null ? Optional.empty() : Optional.ofNullable(this.customVirtualNetworkId);
    }

    @InputImport(name="enableNoPublicIp")
    private final @Nullable WorkspaceCustomBooleanParameterResponse enableNoPublicIp;

    public Optional<WorkspaceCustomBooleanParameterResponse> getEnableNoPublicIp() {
        return this.enableNoPublicIp == null ? Optional.empty() : Optional.ofNullable(this.enableNoPublicIp);
    }

    @InputImport(name="encryption")
    private final @Nullable WorkspaceEncryptionParameterResponse encryption;

    public Optional<WorkspaceEncryptionParameterResponse> getEncryption() {
        return this.encryption == null ? Optional.empty() : Optional.ofNullable(this.encryption);
    }

    @InputImport(name="loadBalancerBackendPoolName")
    private final @Nullable WorkspaceCustomStringParameterResponse loadBalancerBackendPoolName;

    public Optional<WorkspaceCustomStringParameterResponse> getLoadBalancerBackendPoolName() {
        return this.loadBalancerBackendPoolName == null ? Optional.empty() : Optional.ofNullable(this.loadBalancerBackendPoolName);
    }

    @InputImport(name="loadBalancerId")
    private final @Nullable WorkspaceCustomStringParameterResponse loadBalancerId;

    public Optional<WorkspaceCustomStringParameterResponse> getLoadBalancerId() {
        return this.loadBalancerId == null ? Optional.empty() : Optional.ofNullable(this.loadBalancerId);
    }

    @InputImport(name="natGatewayName")
    private final @Nullable WorkspaceCustomStringParameterResponse natGatewayName;

    public Optional<WorkspaceCustomStringParameterResponse> getNatGatewayName() {
        return this.natGatewayName == null ? Optional.empty() : Optional.ofNullable(this.natGatewayName);
    }

    @InputImport(name="prepareEncryption")
    private final @Nullable WorkspaceCustomBooleanParameterResponse prepareEncryption;

    public Optional<WorkspaceCustomBooleanParameterResponse> getPrepareEncryption() {
        return this.prepareEncryption == null ? Optional.empty() : Optional.ofNullable(this.prepareEncryption);
    }

    @InputImport(name="publicIpName")
    private final @Nullable WorkspaceCustomStringParameterResponse publicIpName;

    public Optional<WorkspaceCustomStringParameterResponse> getPublicIpName() {
        return this.publicIpName == null ? Optional.empty() : Optional.ofNullable(this.publicIpName);
    }

    @InputImport(name="requireInfrastructureEncryption")
    private final @Nullable WorkspaceCustomBooleanParameterResponse requireInfrastructureEncryption;

    public Optional<WorkspaceCustomBooleanParameterResponse> getRequireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption == null ? Optional.empty() : Optional.ofNullable(this.requireInfrastructureEncryption);
    }

    @InputImport(name="resourceTags", required=true)
    private final WorkspaceCustomObjectParameterResponse resourceTags;

    public WorkspaceCustomObjectParameterResponse getResourceTags() {
        return this.resourceTags;
    }

    @InputImport(name="storageAccountName")
    private final @Nullable WorkspaceCustomStringParameterResponse storageAccountName;

    public Optional<WorkspaceCustomStringParameterResponse> getStorageAccountName() {
        return this.storageAccountName == null ? Optional.empty() : Optional.ofNullable(this.storageAccountName);
    }

    @InputImport(name="storageAccountSkuName")
    private final @Nullable WorkspaceCustomStringParameterResponse storageAccountSkuName;

    public Optional<WorkspaceCustomStringParameterResponse> getStorageAccountSkuName() {
        return this.storageAccountSkuName == null ? Optional.empty() : Optional.ofNullable(this.storageAccountSkuName);
    }

    @InputImport(name="vnetAddressPrefix")
    private final @Nullable WorkspaceCustomStringParameterResponse vnetAddressPrefix;

    public Optional<WorkspaceCustomStringParameterResponse> getVnetAddressPrefix() {
        return this.vnetAddressPrefix == null ? Optional.empty() : Optional.ofNullable(this.vnetAddressPrefix);
    }

    public WorkspaceCustomParametersResponse(
        @Nullable WorkspaceCustomStringParameterResponse amlWorkspaceId,
        @Nullable WorkspaceCustomStringParameterResponse customPrivateSubnetName,
        @Nullable WorkspaceCustomStringParameterResponse customPublicSubnetName,
        @Nullable WorkspaceCustomStringParameterResponse customVirtualNetworkId,
        @Nullable WorkspaceCustomBooleanParameterResponse enableNoPublicIp,
        @Nullable WorkspaceEncryptionParameterResponse encryption,
        @Nullable WorkspaceCustomStringParameterResponse loadBalancerBackendPoolName,
        @Nullable WorkspaceCustomStringParameterResponse loadBalancerId,
        @Nullable WorkspaceCustomStringParameterResponse natGatewayName,
        @Nullable WorkspaceCustomBooleanParameterResponse prepareEncryption,
        @Nullable WorkspaceCustomStringParameterResponse publicIpName,
        @Nullable WorkspaceCustomBooleanParameterResponse requireInfrastructureEncryption,
        WorkspaceCustomObjectParameterResponse resourceTags,
        @Nullable WorkspaceCustomStringParameterResponse storageAccountName,
        @Nullable WorkspaceCustomStringParameterResponse storageAccountSkuName,
        @Nullable WorkspaceCustomStringParameterResponse vnetAddressPrefix) {
        this.amlWorkspaceId = amlWorkspaceId;
        this.customPrivateSubnetName = customPrivateSubnetName;
        this.customPublicSubnetName = customPublicSubnetName;
        this.customVirtualNetworkId = customVirtualNetworkId;
        this.enableNoPublicIp = enableNoPublicIp;
        this.encryption = encryption;
        this.loadBalancerBackendPoolName = loadBalancerBackendPoolName;
        this.loadBalancerId = loadBalancerId;
        this.natGatewayName = natGatewayName;
        this.prepareEncryption = prepareEncryption;
        this.publicIpName = publicIpName;
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        this.resourceTags = Objects.requireNonNull(resourceTags, "expected parameter 'resourceTags' to be non-null");
        this.storageAccountName = storageAccountName;
        this.storageAccountSkuName = storageAccountSkuName;
        this.vnetAddressPrefix = vnetAddressPrefix;
    }

    private WorkspaceCustomParametersResponse() {
        this.amlWorkspaceId = null;
        this.customPrivateSubnetName = null;
        this.customPublicSubnetName = null;
        this.customVirtualNetworkId = null;
        this.enableNoPublicIp = null;
        this.encryption = null;
        this.loadBalancerBackendPoolName = null;
        this.loadBalancerId = null;
        this.natGatewayName = null;
        this.prepareEncryption = null;
        this.publicIpName = null;
        this.requireInfrastructureEncryption = null;
        this.resourceTags = null;
        this.storageAccountName = null;
        this.storageAccountSkuName = null;
        this.vnetAddressPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkspaceCustomStringParameterResponse amlWorkspaceId;
        private @Nullable WorkspaceCustomStringParameterResponse customPrivateSubnetName;
        private @Nullable WorkspaceCustomStringParameterResponse customPublicSubnetName;
        private @Nullable WorkspaceCustomStringParameterResponse customVirtualNetworkId;
        private @Nullable WorkspaceCustomBooleanParameterResponse enableNoPublicIp;
        private @Nullable WorkspaceEncryptionParameterResponse encryption;
        private @Nullable WorkspaceCustomStringParameterResponse loadBalancerBackendPoolName;
        private @Nullable WorkspaceCustomStringParameterResponse loadBalancerId;
        private @Nullable WorkspaceCustomStringParameterResponse natGatewayName;
        private @Nullable WorkspaceCustomBooleanParameterResponse prepareEncryption;
        private @Nullable WorkspaceCustomStringParameterResponse publicIpName;
        private @Nullable WorkspaceCustomBooleanParameterResponse requireInfrastructureEncryption;
        private WorkspaceCustomObjectParameterResponse resourceTags;
        private @Nullable WorkspaceCustomStringParameterResponse storageAccountName;
        private @Nullable WorkspaceCustomStringParameterResponse storageAccountSkuName;
        private @Nullable WorkspaceCustomStringParameterResponse vnetAddressPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCustomParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amlWorkspaceId = defaults.amlWorkspaceId;
    	      this.customPrivateSubnetName = defaults.customPrivateSubnetName;
    	      this.customPublicSubnetName = defaults.customPublicSubnetName;
    	      this.customVirtualNetworkId = defaults.customVirtualNetworkId;
    	      this.enableNoPublicIp = defaults.enableNoPublicIp;
    	      this.encryption = defaults.encryption;
    	      this.loadBalancerBackendPoolName = defaults.loadBalancerBackendPoolName;
    	      this.loadBalancerId = defaults.loadBalancerId;
    	      this.natGatewayName = defaults.natGatewayName;
    	      this.prepareEncryption = defaults.prepareEncryption;
    	      this.publicIpName = defaults.publicIpName;
    	      this.requireInfrastructureEncryption = defaults.requireInfrastructureEncryption;
    	      this.resourceTags = defaults.resourceTags;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.storageAccountSkuName = defaults.storageAccountSkuName;
    	      this.vnetAddressPrefix = defaults.vnetAddressPrefix;
        }

        public Builder setAmlWorkspaceId(@Nullable WorkspaceCustomStringParameterResponse amlWorkspaceId) {
            this.amlWorkspaceId = amlWorkspaceId;
            return this;
        }

        public Builder setCustomPrivateSubnetName(@Nullable WorkspaceCustomStringParameterResponse customPrivateSubnetName) {
            this.customPrivateSubnetName = customPrivateSubnetName;
            return this;
        }

        public Builder setCustomPublicSubnetName(@Nullable WorkspaceCustomStringParameterResponse customPublicSubnetName) {
            this.customPublicSubnetName = customPublicSubnetName;
            return this;
        }

        public Builder setCustomVirtualNetworkId(@Nullable WorkspaceCustomStringParameterResponse customVirtualNetworkId) {
            this.customVirtualNetworkId = customVirtualNetworkId;
            return this;
        }

        public Builder setEnableNoPublicIp(@Nullable WorkspaceCustomBooleanParameterResponse enableNoPublicIp) {
            this.enableNoPublicIp = enableNoPublicIp;
            return this;
        }

        public Builder setEncryption(@Nullable WorkspaceEncryptionParameterResponse encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setLoadBalancerBackendPoolName(@Nullable WorkspaceCustomStringParameterResponse loadBalancerBackendPoolName) {
            this.loadBalancerBackendPoolName = loadBalancerBackendPoolName;
            return this;
        }

        public Builder setLoadBalancerId(@Nullable WorkspaceCustomStringParameterResponse loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        public Builder setNatGatewayName(@Nullable WorkspaceCustomStringParameterResponse natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }

        public Builder setPrepareEncryption(@Nullable WorkspaceCustomBooleanParameterResponse prepareEncryption) {
            this.prepareEncryption = prepareEncryption;
            return this;
        }

        public Builder setPublicIpName(@Nullable WorkspaceCustomStringParameterResponse publicIpName) {
            this.publicIpName = publicIpName;
            return this;
        }

        public Builder setRequireInfrastructureEncryption(@Nullable WorkspaceCustomBooleanParameterResponse requireInfrastructureEncryption) {
            this.requireInfrastructureEncryption = requireInfrastructureEncryption;
            return this;
        }

        public Builder setResourceTags(WorkspaceCustomObjectParameterResponse resourceTags) {
            this.resourceTags = Objects.requireNonNull(resourceTags);
            return this;
        }

        public Builder setStorageAccountName(@Nullable WorkspaceCustomStringParameterResponse storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }

        public Builder setStorageAccountSkuName(@Nullable WorkspaceCustomStringParameterResponse storageAccountSkuName) {
            this.storageAccountSkuName = storageAccountSkuName;
            return this;
        }

        public Builder setVnetAddressPrefix(@Nullable WorkspaceCustomStringParameterResponse vnetAddressPrefix) {
            this.vnetAddressPrefix = vnetAddressPrefix;
            return this;
        }

        public WorkspaceCustomParametersResponse build() {
            return new WorkspaceCustomParametersResponse(amlWorkspaceId, customPrivateSubnetName, customPublicSubnetName, customVirtualNetworkId, enableNoPublicIp, encryption, loadBalancerBackendPoolName, loadBalancerId, natGatewayName, prepareEncryption, publicIpName, requireInfrastructureEncryption, resourceTags, storageAccountName, storageAccountSkuName, vnetAddressPrefix);
        }
    }
}