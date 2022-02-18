// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureToAzureNetworkMappingSettingsResponse {
    /**
     * Gets the Instance type.
     * Expected value is 'AzureToAzure'.
     * 
     */
    private final String instanceType;
    /**
     * The primary fabric location.
     * 
     */
    private final @Nullable String primaryFabricLocation;
    /**
     * The recovery fabric location.
     * 
     */
    private final @Nullable String recoveryFabricLocation;

    @OutputCustomType.Constructor({"instanceType","primaryFabricLocation","recoveryFabricLocation"})
    private AzureToAzureNetworkMappingSettingsResponse(
        String instanceType,
        @Nullable String primaryFabricLocation,
        @Nullable String recoveryFabricLocation) {
        this.instanceType = Objects.requireNonNull(instanceType);
        this.primaryFabricLocation = primaryFabricLocation;
        this.recoveryFabricLocation = recoveryFabricLocation;
    }

    /**
     * Gets the Instance type.
     * Expected value is 'AzureToAzure'.
     * 
     */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The primary fabric location.
     * 
     */
    public Optional<String> getPrimaryFabricLocation() {
        return Optional.ofNullable(this.primaryFabricLocation);
    }
    /**
     * The recovery fabric location.
     * 
     */
    public Optional<String> getRecoveryFabricLocation() {
        return Optional.ofNullable(this.recoveryFabricLocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureToAzureNetworkMappingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;
        private @Nullable String primaryFabricLocation;
        private @Nullable String recoveryFabricLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureToAzureNetworkMappingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.primaryFabricLocation = defaults.primaryFabricLocation;
    	      this.recoveryFabricLocation = defaults.recoveryFabricLocation;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setPrimaryFabricLocation(@Nullable String primaryFabricLocation) {
            this.primaryFabricLocation = primaryFabricLocation;
            return this;
        }

        public Builder setRecoveryFabricLocation(@Nullable String recoveryFabricLocation) {
            this.recoveryFabricLocation = recoveryFabricLocation;
            return this;
        }

        public AzureToAzureNetworkMappingSettingsResponse build() {
            return new AzureToAzureNetworkMappingSettingsResponse(instanceType, primaryFabricLocation, recoveryFabricLocation);
        }
    }
}
