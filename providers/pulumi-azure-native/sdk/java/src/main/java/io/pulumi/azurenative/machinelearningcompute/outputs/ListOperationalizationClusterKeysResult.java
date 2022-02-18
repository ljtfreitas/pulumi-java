// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.azurenative.machinelearningcompute.outputs.AppInsightsCredentialsResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.ContainerRegistryCredentialsResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.ContainerServiceCredentialsResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.ServiceAuthConfigurationResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.SslConfigurationResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.StorageAccountCredentialsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListOperationalizationClusterKeysResult {
    /**
     * Credentials for Azure AppInsights.
     * 
     */
    private final @Nullable AppInsightsCredentialsResponse appInsights;
    /**
     * Credentials for Azure Container Registry.
     * 
     */
    private final @Nullable ContainerRegistryCredentialsResponse containerRegistry;
    /**
     * Credentials for Azure Container Service.
     * 
     */
    private final @Nullable ContainerServiceCredentialsResponse containerService;
    /**
     * Global authorization keys for all user services deployed in cluster. These are used if the service does not have auth keys.
     * 
     */
    private final @Nullable ServiceAuthConfigurationResponse serviceAuthConfiguration;
    /**
     * The SSL configuration for the services.
     * 
     */
    private final @Nullable SslConfigurationResponse sslConfiguration;
    /**
     * Credentials for the Storage Account.
     * 
     */
    private final @Nullable StorageAccountCredentialsResponse storageAccount;

    @OutputCustomType.Constructor({"appInsights","containerRegistry","containerService","serviceAuthConfiguration","sslConfiguration","storageAccount"})
    private ListOperationalizationClusterKeysResult(
        @Nullable AppInsightsCredentialsResponse appInsights,
        @Nullable ContainerRegistryCredentialsResponse containerRegistry,
        @Nullable ContainerServiceCredentialsResponse containerService,
        @Nullable ServiceAuthConfigurationResponse serviceAuthConfiguration,
        @Nullable SslConfigurationResponse sslConfiguration,
        @Nullable StorageAccountCredentialsResponse storageAccount) {
        this.appInsights = appInsights;
        this.containerRegistry = containerRegistry;
        this.containerService = containerService;
        this.serviceAuthConfiguration = serviceAuthConfiguration;
        this.sslConfiguration = sslConfiguration;
        this.storageAccount = storageAccount;
    }

    /**
     * Credentials for Azure AppInsights.
     * 
     */
    public Optional<AppInsightsCredentialsResponse> getAppInsights() {
        return Optional.ofNullable(this.appInsights);
    }
    /**
     * Credentials for Azure Container Registry.
     * 
     */
    public Optional<ContainerRegistryCredentialsResponse> getContainerRegistry() {
        return Optional.ofNullable(this.containerRegistry);
    }
    /**
     * Credentials for Azure Container Service.
     * 
     */
    public Optional<ContainerServiceCredentialsResponse> getContainerService() {
        return Optional.ofNullable(this.containerService);
    }
    /**
     * Global authorization keys for all user services deployed in cluster. These are used if the service does not have auth keys.
     * 
     */
    public Optional<ServiceAuthConfigurationResponse> getServiceAuthConfiguration() {
        return Optional.ofNullable(this.serviceAuthConfiguration);
    }
    /**
     * The SSL configuration for the services.
     * 
     */
    public Optional<SslConfigurationResponse> getSslConfiguration() {
        return Optional.ofNullable(this.sslConfiguration);
    }
    /**
     * Credentials for the Storage Account.
     * 
     */
    public Optional<StorageAccountCredentialsResponse> getStorageAccount() {
        return Optional.ofNullable(this.storageAccount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListOperationalizationClusterKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AppInsightsCredentialsResponse appInsights;
        private @Nullable ContainerRegistryCredentialsResponse containerRegistry;
        private @Nullable ContainerServiceCredentialsResponse containerService;
        private @Nullable ServiceAuthConfigurationResponse serviceAuthConfiguration;
        private @Nullable SslConfigurationResponse sslConfiguration;
        private @Nullable StorageAccountCredentialsResponse storageAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ListOperationalizationClusterKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appInsights = defaults.appInsights;
    	      this.containerRegistry = defaults.containerRegistry;
    	      this.containerService = defaults.containerService;
    	      this.serviceAuthConfiguration = defaults.serviceAuthConfiguration;
    	      this.sslConfiguration = defaults.sslConfiguration;
    	      this.storageAccount = defaults.storageAccount;
        }

        public Builder setAppInsights(@Nullable AppInsightsCredentialsResponse appInsights) {
            this.appInsights = appInsights;
            return this;
        }

        public Builder setContainerRegistry(@Nullable ContainerRegistryCredentialsResponse containerRegistry) {
            this.containerRegistry = containerRegistry;
            return this;
        }

        public Builder setContainerService(@Nullable ContainerServiceCredentialsResponse containerService) {
            this.containerService = containerService;
            return this;
        }

        public Builder setServiceAuthConfiguration(@Nullable ServiceAuthConfigurationResponse serviceAuthConfiguration) {
            this.serviceAuthConfiguration = serviceAuthConfiguration;
            return this;
        }

        public Builder setSslConfiguration(@Nullable SslConfigurationResponse sslConfiguration) {
            this.sslConfiguration = sslConfiguration;
            return this;
        }

        public Builder setStorageAccount(@Nullable StorageAccountCredentialsResponse storageAccount) {
            this.storageAccount = storageAccount;
            return this;
        }

        public ListOperationalizationClusterKeysResult build() {
            return new ListOperationalizationClusterKeysResult(appInsights, containerRegistry, containerService, serviceAuthConfiguration, sslConfiguration, storageAccount);
        }
    }
}
