// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.changeanalysis.outputs;

import io.pulumi.azurenative.changeanalysis.outputs.AzureMonitorWorkspacePropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NotificationSettingsResponse {
    /**
     * The state of notifications feature.
     * 
     */
    private final @Nullable String activationState;
    /**
     * Configuration properties of an Azure Monitor workspace that receives change notifications.
     * 
     */
    private final @Nullable AzureMonitorWorkspacePropertiesResponse azureMonitorWorkspaceProperties;

    @OutputCustomType.Constructor({"activationState","azureMonitorWorkspaceProperties"})
    private NotificationSettingsResponse(
        @Nullable String activationState,
        @Nullable AzureMonitorWorkspacePropertiesResponse azureMonitorWorkspaceProperties) {
        this.activationState = activationState;
        this.azureMonitorWorkspaceProperties = azureMonitorWorkspaceProperties;
    }

    /**
     * The state of notifications feature.
     * 
     */
    public Optional<String> getActivationState() {
        return Optional.ofNullable(this.activationState);
    }
    /**
     * Configuration properties of an Azure Monitor workspace that receives change notifications.
     * 
     */
    public Optional<AzureMonitorWorkspacePropertiesResponse> getAzureMonitorWorkspaceProperties() {
        return Optional.ofNullable(this.azureMonitorWorkspaceProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activationState;
        private @Nullable AzureMonitorWorkspacePropertiesResponse azureMonitorWorkspaceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationState = defaults.activationState;
    	      this.azureMonitorWorkspaceProperties = defaults.azureMonitorWorkspaceProperties;
        }

        public Builder setActivationState(@Nullable String activationState) {
            this.activationState = activationState;
            return this;
        }

        public Builder setAzureMonitorWorkspaceProperties(@Nullable AzureMonitorWorkspacePropertiesResponse azureMonitorWorkspaceProperties) {
            this.azureMonitorWorkspaceProperties = azureMonitorWorkspaceProperties;
            return this;
        }
        public NotificationSettingsResponse build() {
            return new NotificationSettingsResponse(activationState, azureMonitorWorkspaceProperties);
        }
    }
}
