// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.PrivateEndpointConnectionVaultPropertiesResponse;
import io.pulumi.azurenative.recoveryservices.outputs.UpgradeDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VaultPropertiesResponseEncryption;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VaultPropertiesResponse {
    /**
     * Customer Managed Key details of the resource.
     * 
     */
    private final @Nullable VaultPropertiesResponseEncryption encryption;
    /**
     * List of private endpoint connection.
     * 
     */
    private final List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections;
    /**
     * Private endpoint state for backup.
     * 
     */
    private final String privateEndpointStateForBackup;
    /**
     * Private endpoint state for site recovery.
     * 
     */
    private final String privateEndpointStateForSiteRecovery;
    /**
     * Provisioning State.
     * 
     */
    private final String provisioningState;
    /**
     * Details for upgrading vault.
     * 
     */
    private final @Nullable UpgradeDetailsResponse upgradeDetails;

    @OutputCustomType.Constructor({"encryption","privateEndpointConnections","privateEndpointStateForBackup","privateEndpointStateForSiteRecovery","provisioningState","upgradeDetails"})
    private VaultPropertiesResponse(
        @Nullable VaultPropertiesResponseEncryption encryption,
        List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections,
        String privateEndpointStateForBackup,
        String privateEndpointStateForSiteRecovery,
        String provisioningState,
        @Nullable UpgradeDetailsResponse upgradeDetails) {
        this.encryption = encryption;
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.privateEndpointStateForBackup = Objects.requireNonNull(privateEndpointStateForBackup);
        this.privateEndpointStateForSiteRecovery = Objects.requireNonNull(privateEndpointStateForSiteRecovery);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.upgradeDetails = upgradeDetails;
    }

    /**
     * Customer Managed Key details of the resource.
     * 
     */
    public Optional<VaultPropertiesResponseEncryption> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * List of private endpoint connection.
     * 
     */
    public List<PrivateEndpointConnectionVaultPropertiesResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Private endpoint state for backup.
     * 
     */
    public String getPrivateEndpointStateForBackup() {
        return this.privateEndpointStateForBackup;
    }
    /**
     * Private endpoint state for site recovery.
     * 
     */
    public String getPrivateEndpointStateForSiteRecovery() {
        return this.privateEndpointStateForSiteRecovery;
    }
    /**
     * Provisioning State.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Details for upgrading vault.
     * 
     */
    public Optional<UpgradeDetailsResponse> getUpgradeDetails() {
        return Optional.ofNullable(this.upgradeDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VaultPropertiesResponseEncryption encryption;
        private List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections;
        private String privateEndpointStateForBackup;
        private String privateEndpointStateForSiteRecovery;
        private String provisioningState;
        private @Nullable UpgradeDetailsResponse upgradeDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.privateEndpointStateForBackup = defaults.privateEndpointStateForBackup;
    	      this.privateEndpointStateForSiteRecovery = defaults.privateEndpointStateForSiteRecovery;
    	      this.provisioningState = defaults.provisioningState;
    	      this.upgradeDetails = defaults.upgradeDetails;
        }

        public Builder setEncryption(@Nullable VaultPropertiesResponseEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setPrivateEndpointStateForBackup(String privateEndpointStateForBackup) {
            this.privateEndpointStateForBackup = Objects.requireNonNull(privateEndpointStateForBackup);
            return this;
        }

        public Builder setPrivateEndpointStateForSiteRecovery(String privateEndpointStateForSiteRecovery) {
            this.privateEndpointStateForSiteRecovery = Objects.requireNonNull(privateEndpointStateForSiteRecovery);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setUpgradeDetails(@Nullable UpgradeDetailsResponse upgradeDetails) {
            this.upgradeDetails = upgradeDetails;
            return this;
        }

        public VaultPropertiesResponse build() {
            return new VaultPropertiesResponse(encryption, privateEndpointConnections, privateEndpointStateForBackup, privateEndpointStateForSiteRecovery, provisioningState, upgradeDetails);
        }
    }
}
