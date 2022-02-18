// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute;

import io.pulumi.azurenative.machinelearningcompute.enums.ClusterType;
import io.pulumi.azurenative.machinelearningcompute.inputs.AcsClusterPropertiesArgs;
import io.pulumi.azurenative.machinelearningcompute.inputs.AppInsightsPropertiesArgs;
import io.pulumi.azurenative.machinelearningcompute.inputs.ContainerRegistryPropertiesArgs;
import io.pulumi.azurenative.machinelearningcompute.inputs.GlobalServiceConfigurationArgs;
import io.pulumi.azurenative.machinelearningcompute.inputs.StorageAccountPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OperationalizationClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final OperationalizationClusterArgs Empty = new OperationalizationClusterArgs();

    /**
     * AppInsights configuration.
     * 
     */
    @InputImport(name="appInsights")
    private final @Nullable Input<AppInsightsPropertiesArgs> appInsights;

    public Input<AppInsightsPropertiesArgs> getAppInsights() {
        return this.appInsights == null ? Input.empty() : this.appInsights;
    }

    /**
     * The name of the cluster.
     * 
     */
    @InputImport(name="clusterName")
    private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * The cluster type.
     * 
     */
    @InputImport(name="clusterType", required=true)
    private final Input<Either<String,ClusterType>> clusterType;

    public Input<Either<String,ClusterType>> getClusterType() {
        return this.clusterType;
    }

    /**
     * Container Registry properties.
     * 
     */
    @InputImport(name="containerRegistry")
    private final @Nullable Input<ContainerRegistryPropertiesArgs> containerRegistry;

    public Input<ContainerRegistryPropertiesArgs> getContainerRegistry() {
        return this.containerRegistry == null ? Input.empty() : this.containerRegistry;
    }

    /**
     * Parameters for the Azure Container Service cluster.
     * 
     */
    @InputImport(name="containerService")
    private final @Nullable Input<AcsClusterPropertiesArgs> containerService;

    public Input<AcsClusterPropertiesArgs> getContainerService() {
        return this.containerService == null ? Input.empty() : this.containerService;
    }

    /**
     * The description of the cluster.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Contains global configuration for the web services in the cluster.
     * 
     */
    @InputImport(name="globalServiceConfiguration")
    private final @Nullable Input<GlobalServiceConfigurationArgs> globalServiceConfiguration;

    public Input<GlobalServiceConfigurationArgs> getGlobalServiceConfiguration() {
        return this.globalServiceConfiguration == null ? Input.empty() : this.globalServiceConfiguration;
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the resource group in which the cluster is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Storage Account properties.
     * 
     */
    @InputImport(name="storageAccount")
    private final @Nullable Input<StorageAccountPropertiesArgs> storageAccount;

    public Input<StorageAccountPropertiesArgs> getStorageAccount() {
        return this.storageAccount == null ? Input.empty() : this.storageAccount;
    }

    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public OperationalizationClusterArgs(
        @Nullable Input<AppInsightsPropertiesArgs> appInsights,
        @Nullable Input<String> clusterName,
        Input<Either<String,ClusterType>> clusterType,
        @Nullable Input<ContainerRegistryPropertiesArgs> containerRegistry,
        @Nullable Input<AcsClusterPropertiesArgs> containerService,
        @Nullable Input<String> description,
        @Nullable Input<GlobalServiceConfigurationArgs> globalServiceConfiguration,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<StorageAccountPropertiesArgs> storageAccount,
        @Nullable Input<Map<String,String>> tags) {
        this.appInsights = appInsights;
        this.clusterName = clusterName;
        this.clusterType = Objects.requireNonNull(clusterType, "expected parameter 'clusterType' to be non-null");
        this.containerRegistry = containerRegistry;
        this.containerService = containerService;
        this.description = description;
        this.globalServiceConfiguration = globalServiceConfiguration;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccount = storageAccount;
        this.tags = tags;
    }

    private OperationalizationClusterArgs() {
        this.appInsights = Input.empty();
        this.clusterName = Input.empty();
        this.clusterType = Input.empty();
        this.containerRegistry = Input.empty();
        this.containerService = Input.empty();
        this.description = Input.empty();
        this.globalServiceConfiguration = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.storageAccount = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationalizationClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppInsightsPropertiesArgs> appInsights;
        private @Nullable Input<String> clusterName;
        private Input<Either<String,ClusterType>> clusterType;
        private @Nullable Input<ContainerRegistryPropertiesArgs> containerRegistry;
        private @Nullable Input<AcsClusterPropertiesArgs> containerService;
        private @Nullable Input<String> description;
        private @Nullable Input<GlobalServiceConfigurationArgs> globalServiceConfiguration;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<StorageAccountPropertiesArgs> storageAccount;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationalizationClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appInsights = defaults.appInsights;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterType = defaults.clusterType;
    	      this.containerRegistry = defaults.containerRegistry;
    	      this.containerService = defaults.containerService;
    	      this.description = defaults.description;
    	      this.globalServiceConfiguration = defaults.globalServiceConfiguration;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccount = defaults.storageAccount;
    	      this.tags = defaults.tags;
        }

        public Builder setAppInsights(@Nullable Input<AppInsightsPropertiesArgs> appInsights) {
            this.appInsights = appInsights;
            return this;
        }

        public Builder setAppInsights(@Nullable AppInsightsPropertiesArgs appInsights) {
            this.appInsights = Input.ofNullable(appInsights);
            return this;
        }

        public Builder setClusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder setClusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder setClusterType(Input<Either<String,ClusterType>> clusterType) {
            this.clusterType = Objects.requireNonNull(clusterType);
            return this;
        }

        public Builder setClusterType(Either<String,ClusterType> clusterType) {
            this.clusterType = Input.of(Objects.requireNonNull(clusterType));
            return this;
        }

        public Builder setContainerRegistry(@Nullable Input<ContainerRegistryPropertiesArgs> containerRegistry) {
            this.containerRegistry = containerRegistry;
            return this;
        }

        public Builder setContainerRegistry(@Nullable ContainerRegistryPropertiesArgs containerRegistry) {
            this.containerRegistry = Input.ofNullable(containerRegistry);
            return this;
        }

        public Builder setContainerService(@Nullable Input<AcsClusterPropertiesArgs> containerService) {
            this.containerService = containerService;
            return this;
        }

        public Builder setContainerService(@Nullable AcsClusterPropertiesArgs containerService) {
            this.containerService = Input.ofNullable(containerService);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGlobalServiceConfiguration(@Nullable Input<GlobalServiceConfigurationArgs> globalServiceConfiguration) {
            this.globalServiceConfiguration = globalServiceConfiguration;
            return this;
        }

        public Builder setGlobalServiceConfiguration(@Nullable GlobalServiceConfigurationArgs globalServiceConfiguration) {
            this.globalServiceConfiguration = Input.ofNullable(globalServiceConfiguration);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setStorageAccount(@Nullable Input<StorageAccountPropertiesArgs> storageAccount) {
            this.storageAccount = storageAccount;
            return this;
        }

        public Builder setStorageAccount(@Nullable StorageAccountPropertiesArgs storageAccount) {
            this.storageAccount = Input.ofNullable(storageAccount);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public OperationalizationClusterArgs build() {
            return new OperationalizationClusterArgs(appInsights, clusterName, clusterType, containerRegistry, containerService, description, globalServiceConfiguration, location, resourceGroupName, storageAccount, tags);
        }
    }
}
