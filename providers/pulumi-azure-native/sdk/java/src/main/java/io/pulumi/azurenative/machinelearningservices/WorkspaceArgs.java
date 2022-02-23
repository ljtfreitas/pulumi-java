// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.machinelearningservices.inputs.EncryptionPropertyArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.IdentityArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ServiceManagedResourcesSettingsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.SharedPrivateLinkResourceArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The flag to indicate whether to allow public access when behind VNet.
     * 
     */
    @InputImport(name="allowPublicAccessWhenBehindVnet")
        private final @Nullable Input<Boolean> allowPublicAccessWhenBehindVnet;

    public Input<Boolean> getAllowPublicAccessWhenBehindVnet() {
        return this.allowPublicAccessWhenBehindVnet == null ? Input.empty() : this.allowPublicAccessWhenBehindVnet;
    }

    /**
     * ARM id of the application insights associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    @InputImport(name="applicationInsights")
        private final @Nullable Input<String> applicationInsights;

    public Input<String> getApplicationInsights() {
        return this.applicationInsights == null ? Input.empty() : this.applicationInsights;
    }

    /**
     * ARM id of the container registry associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    @InputImport(name="containerRegistry")
        private final @Nullable Input<String> containerRegistry;

    public Input<String> getContainerRegistry() {
        return this.containerRegistry == null ? Input.empty() : this.containerRegistry;
    }

    /**
     * The description of this workspace.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Url for the discovery service to identify regional endpoints for machine learning experimentation services
     * 
     */
    @InputImport(name="discoveryUrl")
        private final @Nullable Input<String> discoveryUrl;

    public Input<String> getDiscoveryUrl() {
        return this.discoveryUrl == null ? Input.empty() : this.discoveryUrl;
    }

    /**
     * The encryption settings of Azure ML workspace.
     * 
     */
    @InputImport(name="encryption")
        private final @Nullable Input<EncryptionPropertyArgs> encryption;

    public Input<EncryptionPropertyArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * The friendly name for this workspace. This name in mutable
     * 
     */
    @InputImport(name="friendlyName")
        private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * The flag to signal HBI data in the workspace and reduce diagnostic data collected by the service
     * 
     */
    @InputImport(name="hbiWorkspace")
        private final @Nullable Input<Boolean> hbiWorkspace;

    public Input<Boolean> getHbiWorkspace() {
        return this.hbiWorkspace == null ? Input.empty() : this.hbiWorkspace;
    }

    /**
     * The identity of the resource.
     * 
     */
    @InputImport(name="identity")
        private final @Nullable Input<IdentityArgs> identity;

    public Input<IdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The compute name for image build
     * 
     */
    @InputImport(name="imageBuildCompute")
        private final @Nullable Input<String> imageBuildCompute;

    public Input<String> getImageBuildCompute() {
        return this.imageBuildCompute == null ? Input.empty() : this.imageBuildCompute;
    }

    /**
     * ARM id of the key vault associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    @InputImport(name="keyVault")
        private final @Nullable Input<String> keyVault;

    public Input<String> getKeyVault() {
        return this.keyVault == null ? Input.empty() : this.keyVault;
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
     * The user assigned identity resource id that represents the workspace identity.
     * 
     */
    @InputImport(name="primaryUserAssignedIdentity")
        private final @Nullable Input<String> primaryUserAssignedIdentity;

    public Input<String> getPrimaryUserAssignedIdentity() {
        return this.primaryUserAssignedIdentity == null ? Input.empty() : this.primaryUserAssignedIdentity;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The service managed resource settings.
     * 
     */
    @InputImport(name="serviceManagedResourcesSettings")
        private final @Nullable Input<ServiceManagedResourcesSettingsArgs> serviceManagedResourcesSettings;

    public Input<ServiceManagedResourcesSettingsArgs> getServiceManagedResourcesSettings() {
        return this.serviceManagedResourcesSettings == null ? Input.empty() : this.serviceManagedResourcesSettings;
    }

    /**
     * The list of shared private link resources in this workspace.
     * 
     */
    @InputImport(name="sharedPrivateLinkResources")
        private final @Nullable Input<List<SharedPrivateLinkResourceArgs>> sharedPrivateLinkResources;

    public Input<List<SharedPrivateLinkResourceArgs>> getSharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources == null ? Input.empty() : this.sharedPrivateLinkResources;
    }

    /**
     * The sku of the workspace.
     * 
     */
    @InputImport(name="sku")
        private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * ARM id of the storage account associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    @InputImport(name="storageAccount")
        private final @Nullable Input<String> storageAccount;

    public Input<String> getStorageAccount() {
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

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @InputImport(name="workspaceName")
        private final @Nullable Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName == null ? Input.empty() : this.workspaceName;
    }

    public WorkspaceArgs(
        @Nullable Input<Boolean> allowPublicAccessWhenBehindVnet,
        @Nullable Input<String> applicationInsights,
        @Nullable Input<String> containerRegistry,
        @Nullable Input<String> description,
        @Nullable Input<String> discoveryUrl,
        @Nullable Input<EncryptionPropertyArgs> encryption,
        @Nullable Input<String> friendlyName,
        @Nullable Input<Boolean> hbiWorkspace,
        @Nullable Input<IdentityArgs> identity,
        @Nullable Input<String> imageBuildCompute,
        @Nullable Input<String> keyVault,
        @Nullable Input<String> location,
        @Nullable Input<String> primaryUserAssignedIdentity,
        Input<String> resourceGroupName,
        @Nullable Input<ServiceManagedResourcesSettingsArgs> serviceManagedResourcesSettings,
        @Nullable Input<List<SharedPrivateLinkResourceArgs>> sharedPrivateLinkResources,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<String> storageAccount,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> workspaceName) {
        this.allowPublicAccessWhenBehindVnet = allowPublicAccessWhenBehindVnet == null ? Input.ofNullable(false) : allowPublicAccessWhenBehindVnet;
        this.applicationInsights = applicationInsights;
        this.containerRegistry = containerRegistry;
        this.description = description;
        this.discoveryUrl = discoveryUrl;
        this.encryption = encryption;
        this.friendlyName = friendlyName;
        this.hbiWorkspace = hbiWorkspace == null ? Input.ofNullable(false) : hbiWorkspace;
        this.identity = identity;
        this.imageBuildCompute = imageBuildCompute;
        this.keyVault = keyVault;
        this.location = location;
        this.primaryUserAssignedIdentity = primaryUserAssignedIdentity;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceManagedResourcesSettings = serviceManagedResourcesSettings;
        this.sharedPrivateLinkResources = sharedPrivateLinkResources;
        this.sku = sku;
        this.storageAccount = storageAccount;
        this.tags = tags;
        this.workspaceName = workspaceName;
    }

    private WorkspaceArgs() {
        this.allowPublicAccessWhenBehindVnet = Input.empty();
        this.applicationInsights = Input.empty();
        this.containerRegistry = Input.empty();
        this.description = Input.empty();
        this.discoveryUrl = Input.empty();
        this.encryption = Input.empty();
        this.friendlyName = Input.empty();
        this.hbiWorkspace = Input.empty();
        this.identity = Input.empty();
        this.imageBuildCompute = Input.empty();
        this.keyVault = Input.empty();
        this.location = Input.empty();
        this.primaryUserAssignedIdentity = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceManagedResourcesSettings = Input.empty();
        this.sharedPrivateLinkResources = Input.empty();
        this.sku = Input.empty();
        this.storageAccount = Input.empty();
        this.tags = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowPublicAccessWhenBehindVnet;
        private @Nullable Input<String> applicationInsights;
        private @Nullable Input<String> containerRegistry;
        private @Nullable Input<String> description;
        private @Nullable Input<String> discoveryUrl;
        private @Nullable Input<EncryptionPropertyArgs> encryption;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<Boolean> hbiWorkspace;
        private @Nullable Input<IdentityArgs> identity;
        private @Nullable Input<String> imageBuildCompute;
        private @Nullable Input<String> keyVault;
        private @Nullable Input<String> location;
        private @Nullable Input<String> primaryUserAssignedIdentity;
        private Input<String> resourceGroupName;
        private @Nullable Input<ServiceManagedResourcesSettingsArgs> serviceManagedResourcesSettings;
        private @Nullable Input<List<SharedPrivateLinkResourceArgs>> sharedPrivateLinkResources;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<String> storageAccount;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPublicAccessWhenBehindVnet = defaults.allowPublicAccessWhenBehindVnet;
    	      this.applicationInsights = defaults.applicationInsights;
    	      this.containerRegistry = defaults.containerRegistry;
    	      this.description = defaults.description;
    	      this.discoveryUrl = defaults.discoveryUrl;
    	      this.encryption = defaults.encryption;
    	      this.friendlyName = defaults.friendlyName;
    	      this.hbiWorkspace = defaults.hbiWorkspace;
    	      this.identity = defaults.identity;
    	      this.imageBuildCompute = defaults.imageBuildCompute;
    	      this.keyVault = defaults.keyVault;
    	      this.location = defaults.location;
    	      this.primaryUserAssignedIdentity = defaults.primaryUserAssignedIdentity;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceManagedResourcesSettings = defaults.serviceManagedResourcesSettings;
    	      this.sharedPrivateLinkResources = defaults.sharedPrivateLinkResources;
    	      this.sku = defaults.sku;
    	      this.storageAccount = defaults.storageAccount;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setAllowPublicAccessWhenBehindVnet(@Nullable Input<Boolean> allowPublicAccessWhenBehindVnet) {
            this.allowPublicAccessWhenBehindVnet = allowPublicAccessWhenBehindVnet;
            return this;
        }

        public Builder setAllowPublicAccessWhenBehindVnet(@Nullable Boolean allowPublicAccessWhenBehindVnet) {
            this.allowPublicAccessWhenBehindVnet = Input.ofNullable(allowPublicAccessWhenBehindVnet);
            return this;
        }

        public Builder setApplicationInsights(@Nullable Input<String> applicationInsights) {
            this.applicationInsights = applicationInsights;
            return this;
        }

        public Builder setApplicationInsights(@Nullable String applicationInsights) {
            this.applicationInsights = Input.ofNullable(applicationInsights);
            return this;
        }

        public Builder setContainerRegistry(@Nullable Input<String> containerRegistry) {
            this.containerRegistry = containerRegistry;
            return this;
        }

        public Builder setContainerRegistry(@Nullable String containerRegistry) {
            this.containerRegistry = Input.ofNullable(containerRegistry);
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

        public Builder setDiscoveryUrl(@Nullable Input<String> discoveryUrl) {
            this.discoveryUrl = discoveryUrl;
            return this;
        }

        public Builder setDiscoveryUrl(@Nullable String discoveryUrl) {
            this.discoveryUrl = Input.ofNullable(discoveryUrl);
            return this;
        }

        public Builder setEncryption(@Nullable Input<EncryptionPropertyArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable EncryptionPropertyArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setHbiWorkspace(@Nullable Input<Boolean> hbiWorkspace) {
            this.hbiWorkspace = hbiWorkspace;
            return this;
        }

        public Builder setHbiWorkspace(@Nullable Boolean hbiWorkspace) {
            this.hbiWorkspace = Input.ofNullable(hbiWorkspace);
            return this;
        }

        public Builder setIdentity(@Nullable Input<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setImageBuildCompute(@Nullable Input<String> imageBuildCompute) {
            this.imageBuildCompute = imageBuildCompute;
            return this;
        }

        public Builder setImageBuildCompute(@Nullable String imageBuildCompute) {
            this.imageBuildCompute = Input.ofNullable(imageBuildCompute);
            return this;
        }

        public Builder setKeyVault(@Nullable Input<String> keyVault) {
            this.keyVault = keyVault;
            return this;
        }

        public Builder setKeyVault(@Nullable String keyVault) {
            this.keyVault = Input.ofNullable(keyVault);
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

        public Builder setPrimaryUserAssignedIdentity(@Nullable Input<String> primaryUserAssignedIdentity) {
            this.primaryUserAssignedIdentity = primaryUserAssignedIdentity;
            return this;
        }

        public Builder setPrimaryUserAssignedIdentity(@Nullable String primaryUserAssignedIdentity) {
            this.primaryUserAssignedIdentity = Input.ofNullable(primaryUserAssignedIdentity);
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

        public Builder setServiceManagedResourcesSettings(@Nullable Input<ServiceManagedResourcesSettingsArgs> serviceManagedResourcesSettings) {
            this.serviceManagedResourcesSettings = serviceManagedResourcesSettings;
            return this;
        }

        public Builder setServiceManagedResourcesSettings(@Nullable ServiceManagedResourcesSettingsArgs serviceManagedResourcesSettings) {
            this.serviceManagedResourcesSettings = Input.ofNullable(serviceManagedResourcesSettings);
            return this;
        }

        public Builder setSharedPrivateLinkResources(@Nullable Input<List<SharedPrivateLinkResourceArgs>> sharedPrivateLinkResources) {
            this.sharedPrivateLinkResources = sharedPrivateLinkResources;
            return this;
        }

        public Builder setSharedPrivateLinkResources(@Nullable List<SharedPrivateLinkResourceArgs> sharedPrivateLinkResources) {
            this.sharedPrivateLinkResources = Input.ofNullable(sharedPrivateLinkResources);
            return this;
        }

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setStorageAccount(@Nullable Input<String> storageAccount) {
            this.storageAccount = storageAccount;
            return this;
        }

        public Builder setStorageAccount(@Nullable String storageAccount) {
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

        public Builder setWorkspaceName(@Nullable Input<String> workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public Builder setWorkspaceName(@Nullable String workspaceName) {
            this.workspaceName = Input.ofNullable(workspaceName);
            return this;
        }
        public WorkspaceArgs build() {
            return new WorkspaceArgs(allowPublicAccessWhenBehindVnet, applicationInsights, containerRegistry, description, discoveryUrl, encryption, friendlyName, hbiWorkspace, identity, imageBuildCompute, keyVault, location, primaryUserAssignedIdentity, resourceGroupName, serviceManagedResourcesSettings, sharedPrivateLinkResources, sku, storageAccount, tags, workspaceName);
        }
    }
}
