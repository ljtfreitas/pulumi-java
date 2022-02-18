// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.AzureToAzureNetworkMappingSettingsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VmmToAzureNetworkMappingSettingsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VmmToVmmNetworkMappingSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkMappingPropertiesResponse {
    /**
     * The fabric specific settings.
     * 
     */
    private final @Nullable Object fabricSpecificSettings;
    /**
     * The primary fabric friendly name.
     * 
     */
    private final @Nullable String primaryFabricFriendlyName;
    /**
     * The primary network friendly name.
     * 
     */
    private final @Nullable String primaryNetworkFriendlyName;
    /**
     * The primary network id for network mapping.
     * 
     */
    private final @Nullable String primaryNetworkId;
    /**
     * The recovery fabric ARM id.
     * 
     */
    private final @Nullable String recoveryFabricArmId;
    /**
     * The recovery fabric friendly name.
     * 
     */
    private final @Nullable String recoveryFabricFriendlyName;
    /**
     * The recovery network friendly name.
     * 
     */
    private final @Nullable String recoveryNetworkFriendlyName;
    /**
     * The recovery network id for network mapping.
     * 
     */
    private final @Nullable String recoveryNetworkId;
    /**
     * The pairing state for network mapping.
     * 
     */
    private final @Nullable String state;

    @OutputCustomType.Constructor({"fabricSpecificSettings","primaryFabricFriendlyName","primaryNetworkFriendlyName","primaryNetworkId","recoveryFabricArmId","recoveryFabricFriendlyName","recoveryNetworkFriendlyName","recoveryNetworkId","state"})
    private NetworkMappingPropertiesResponse(
        @Nullable Object fabricSpecificSettings,
        @Nullable String primaryFabricFriendlyName,
        @Nullable String primaryNetworkFriendlyName,
        @Nullable String primaryNetworkId,
        @Nullable String recoveryFabricArmId,
        @Nullable String recoveryFabricFriendlyName,
        @Nullable String recoveryNetworkFriendlyName,
        @Nullable String recoveryNetworkId,
        @Nullable String state) {
        this.fabricSpecificSettings = fabricSpecificSettings;
        this.primaryFabricFriendlyName = primaryFabricFriendlyName;
        this.primaryNetworkFriendlyName = primaryNetworkFriendlyName;
        this.primaryNetworkId = primaryNetworkId;
        this.recoveryFabricArmId = recoveryFabricArmId;
        this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
        this.recoveryNetworkFriendlyName = recoveryNetworkFriendlyName;
        this.recoveryNetworkId = recoveryNetworkId;
        this.state = state;
    }

    /**
     * The fabric specific settings.
     * 
     */
    public Optional<Object> getFabricSpecificSettings() {
        return Optional.ofNullable(this.fabricSpecificSettings);
    }
    /**
     * The primary fabric friendly name.
     * 
     */
    public Optional<String> getPrimaryFabricFriendlyName() {
        return Optional.ofNullable(this.primaryFabricFriendlyName);
    }
    /**
     * The primary network friendly name.
     * 
     */
    public Optional<String> getPrimaryNetworkFriendlyName() {
        return Optional.ofNullable(this.primaryNetworkFriendlyName);
    }
    /**
     * The primary network id for network mapping.
     * 
     */
    public Optional<String> getPrimaryNetworkId() {
        return Optional.ofNullable(this.primaryNetworkId);
    }
    /**
     * The recovery fabric ARM id.
     * 
     */
    public Optional<String> getRecoveryFabricArmId() {
        return Optional.ofNullable(this.recoveryFabricArmId);
    }
    /**
     * The recovery fabric friendly name.
     * 
     */
    public Optional<String> getRecoveryFabricFriendlyName() {
        return Optional.ofNullable(this.recoveryFabricFriendlyName);
    }
    /**
     * The recovery network friendly name.
     * 
     */
    public Optional<String> getRecoveryNetworkFriendlyName() {
        return Optional.ofNullable(this.recoveryNetworkFriendlyName);
    }
    /**
     * The recovery network id for network mapping.
     * 
     */
    public Optional<String> getRecoveryNetworkId() {
        return Optional.ofNullable(this.recoveryNetworkId);
    }
    /**
     * The pairing state for network mapping.
     * 
     */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkMappingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fabricSpecificSettings;
        private @Nullable String primaryFabricFriendlyName;
        private @Nullable String primaryNetworkFriendlyName;
        private @Nullable String primaryNetworkId;
        private @Nullable String recoveryFabricArmId;
        private @Nullable String recoveryFabricFriendlyName;
        private @Nullable String recoveryNetworkFriendlyName;
        private @Nullable String recoveryNetworkId;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkMappingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricSpecificSettings = defaults.fabricSpecificSettings;
    	      this.primaryFabricFriendlyName = defaults.primaryFabricFriendlyName;
    	      this.primaryNetworkFriendlyName = defaults.primaryNetworkFriendlyName;
    	      this.primaryNetworkId = defaults.primaryNetworkId;
    	      this.recoveryFabricArmId = defaults.recoveryFabricArmId;
    	      this.recoveryFabricFriendlyName = defaults.recoveryFabricFriendlyName;
    	      this.recoveryNetworkFriendlyName = defaults.recoveryNetworkFriendlyName;
    	      this.recoveryNetworkId = defaults.recoveryNetworkId;
    	      this.state = defaults.state;
        }

        public Builder setFabricSpecificSettings(@Nullable Object fabricSpecificSettings) {
            this.fabricSpecificSettings = fabricSpecificSettings;
            return this;
        }

        public Builder setPrimaryFabricFriendlyName(@Nullable String primaryFabricFriendlyName) {
            this.primaryFabricFriendlyName = primaryFabricFriendlyName;
            return this;
        }

        public Builder setPrimaryNetworkFriendlyName(@Nullable String primaryNetworkFriendlyName) {
            this.primaryNetworkFriendlyName = primaryNetworkFriendlyName;
            return this;
        }

        public Builder setPrimaryNetworkId(@Nullable String primaryNetworkId) {
            this.primaryNetworkId = primaryNetworkId;
            return this;
        }

        public Builder setRecoveryFabricArmId(@Nullable String recoveryFabricArmId) {
            this.recoveryFabricArmId = recoveryFabricArmId;
            return this;
        }

        public Builder setRecoveryFabricFriendlyName(@Nullable String recoveryFabricFriendlyName) {
            this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
            return this;
        }

        public Builder setRecoveryNetworkFriendlyName(@Nullable String recoveryNetworkFriendlyName) {
            this.recoveryNetworkFriendlyName = recoveryNetworkFriendlyName;
            return this;
        }

        public Builder setRecoveryNetworkId(@Nullable String recoveryNetworkId) {
            this.recoveryNetworkId = recoveryNetworkId;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public NetworkMappingPropertiesResponse build() {
            return new NetworkMappingPropertiesResponse(fabricSpecificSettings, primaryFabricFriendlyName, primaryNetworkFriendlyName, primaryNetworkId, recoveryFabricArmId, recoveryFabricFriendlyName, recoveryNetworkFriendlyName, recoveryNetworkId, state);
        }
    }
}
