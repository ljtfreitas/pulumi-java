// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.containerservice.inputs.ContainerServiceLinuxProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.ContainerServiceNetworkProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterAADProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterAPIServerAccessProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterAddonProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterAgentPoolProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterAutoUpgradeProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterHTTPProxyConfigArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterIdentityArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterPodIdentityProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterPropertiesAutoScalerProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterPropertiesIdentityProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterSKUArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterServicePrincipalProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterWindowsProfileArgs;
import io.pulumi.azurenative.containerservice.inputs.PrivateLinkResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedClusterArgs Empty = new ManagedClusterArgs();

    /**
     * Profile of Azure Active Directory configuration.
     * 
     */
    @InputImport(name="aadProfile")
    private final @Nullable Input<ManagedClusterAADProfileArgs> aadProfile;

    public Input<ManagedClusterAADProfileArgs> getAadProfile() {
        return this.aadProfile == null ? Input.empty() : this.aadProfile;
    }

    /**
     * Profile of managed cluster add-on.
     * 
     */
    @InputImport(name="addonProfiles")
    private final @Nullable Input<Map<String,ManagedClusterAddonProfileArgs>> addonProfiles;

    public Input<Map<String,ManagedClusterAddonProfileArgs>> getAddonProfiles() {
        return this.addonProfiles == null ? Input.empty() : this.addonProfiles;
    }

    /**
     * Properties of the agent pool.
     * 
     */
    @InputImport(name="agentPoolProfiles")
    private final @Nullable Input<List<ManagedClusterAgentPoolProfileArgs>> agentPoolProfiles;

    public Input<List<ManagedClusterAgentPoolProfileArgs>> getAgentPoolProfiles() {
        return this.agentPoolProfiles == null ? Input.empty() : this.agentPoolProfiles;
    }

    /**
     * Access profile for managed cluster API server.
     * 
     */
    @InputImport(name="apiServerAccessProfile")
    private final @Nullable Input<ManagedClusterAPIServerAccessProfileArgs> apiServerAccessProfile;

    public Input<ManagedClusterAPIServerAccessProfileArgs> getApiServerAccessProfile() {
        return this.apiServerAccessProfile == null ? Input.empty() : this.apiServerAccessProfile;
    }

    /**
     * Parameters to be applied to the cluster-autoscaler when enabled
     * 
     */
    @InputImport(name="autoScalerProfile")
    private final @Nullable Input<ManagedClusterPropertiesAutoScalerProfileArgs> autoScalerProfile;

    public Input<ManagedClusterPropertiesAutoScalerProfileArgs> getAutoScalerProfile() {
        return this.autoScalerProfile == null ? Input.empty() : this.autoScalerProfile;
    }

    /**
     * Profile of auto upgrade configuration.
     * 
     */
    @InputImport(name="autoUpgradeProfile")
    private final @Nullable Input<ManagedClusterAutoUpgradeProfileArgs> autoUpgradeProfile;

    public Input<ManagedClusterAutoUpgradeProfileArgs> getAutoUpgradeProfile() {
        return this.autoUpgradeProfile == null ? Input.empty() : this.autoUpgradeProfile;
    }

    /**
     * If set to true, getting static credential will be disabled for this cluster. Expected to only be used for AAD clusters.
     * 
     */
    @InputImport(name="disableLocalAccounts")
    private final @Nullable Input<Boolean> disableLocalAccounts;

    public Input<Boolean> getDisableLocalAccounts() {
        return this.disableLocalAccounts == null ? Input.empty() : this.disableLocalAccounts;
    }

    /**
     * ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     */
    @InputImport(name="diskEncryptionSetID")
    private final @Nullable Input<String> diskEncryptionSetID;

    public Input<String> getDiskEncryptionSetID() {
        return this.diskEncryptionSetID == null ? Input.empty() : this.diskEncryptionSetID;
    }

    /**
     * DNS prefix specified when creating the managed cluster.
     * 
     */
    @InputImport(name="dnsPrefix")
    private final @Nullable Input<String> dnsPrefix;

    public Input<String> getDnsPrefix() {
        return this.dnsPrefix == null ? Input.empty() : this.dnsPrefix;
    }

    /**
     * (DEPRECATING) Whether to enable Kubernetes pod security policy (preview). This feature is set for removal on October 15th, 2020. Learn more at aka.ms/aks/azpodpolicy.
     * 
     */
    @InputImport(name="enablePodSecurityPolicy")
    private final @Nullable Input<Boolean> enablePodSecurityPolicy;

    public Input<Boolean> getEnablePodSecurityPolicy() {
        return this.enablePodSecurityPolicy == null ? Input.empty() : this.enablePodSecurityPolicy;
    }

    /**
     * Whether to enable Kubernetes Role-Based Access Control.
     * 
     */
    @InputImport(name="enableRBAC")
    private final @Nullable Input<Boolean> enableRBAC;

    public Input<Boolean> getEnableRBAC() {
        return this.enableRBAC == null ? Input.empty() : this.enableRBAC;
    }

    /**
     * The extended location of the Virtual Machine.
     * 
     */
    @InputImport(name="extendedLocation")
    private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

    /**
     * FQDN subdomain specified when creating private cluster with custom private dns zone.
     * 
     */
    @InputImport(name="fqdnSubdomain")
    private final @Nullable Input<String> fqdnSubdomain;

    public Input<String> getFqdnSubdomain() {
        return this.fqdnSubdomain == null ? Input.empty() : this.fqdnSubdomain;
    }

    /**
     * Configurations for provisioning the cluster with HTTP proxy servers.
     * 
     */
    @InputImport(name="httpProxyConfig")
    private final @Nullable Input<ManagedClusterHTTPProxyConfigArgs> httpProxyConfig;

    public Input<ManagedClusterHTTPProxyConfigArgs> getHttpProxyConfig() {
        return this.httpProxyConfig == null ? Input.empty() : this.httpProxyConfig;
    }

    /**
     * The identity of the managed cluster, if configured.
     * 
     */
    @InputImport(name="identity")
    private final @Nullable Input<ManagedClusterIdentityArgs> identity;

    public Input<ManagedClusterIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Identities associated with the cluster.
     * 
     */
    @InputImport(name="identityProfile")
    private final @Nullable Input<Map<String,ManagedClusterPropertiesIdentityProfileArgs>> identityProfile;

    public Input<Map<String,ManagedClusterPropertiesIdentityProfileArgs>> getIdentityProfile() {
        return this.identityProfile == null ? Input.empty() : this.identityProfile;
    }

    /**
     * Version of Kubernetes specified when creating the managed cluster.
     * 
     */
    @InputImport(name="kubernetesVersion")
    private final @Nullable Input<String> kubernetesVersion;

    public Input<String> getKubernetesVersion() {
        return this.kubernetesVersion == null ? Input.empty() : this.kubernetesVersion;
    }

    /**
     * Profile for Linux VMs in the container service cluster.
     * 
     */
    @InputImport(name="linuxProfile")
    private final @Nullable Input<ContainerServiceLinuxProfileArgs> linuxProfile;

    public Input<ContainerServiceLinuxProfileArgs> getLinuxProfile() {
        return this.linuxProfile == null ? Input.empty() : this.linuxProfile;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Profile of network configuration.
     * 
     */
    @InputImport(name="networkProfile")
    private final @Nullable Input<ContainerServiceNetworkProfileArgs> networkProfile;

    public Input<ContainerServiceNetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Input.empty() : this.networkProfile;
    }

    /**
     * Name of the resource group containing agent pool nodes.
     * 
     */
    @InputImport(name="nodeResourceGroup")
    private final @Nullable Input<String> nodeResourceGroup;

    public Input<String> getNodeResourceGroup() {
        return this.nodeResourceGroup == null ? Input.empty() : this.nodeResourceGroup;
    }

    /**
     * Profile of managed cluster pod identity.
     * 
     */
    @InputImport(name="podIdentityProfile")
    private final @Nullable Input<ManagedClusterPodIdentityProfileArgs> podIdentityProfile;

    public Input<ManagedClusterPodIdentityProfileArgs> getPodIdentityProfile() {
        return this.podIdentityProfile == null ? Input.empty() : this.podIdentityProfile;
    }

    /**
     * Private link resources associated with the cluster.
     * 
     */
    @InputImport(name="privateLinkResources")
    private final @Nullable Input<List<PrivateLinkResourceArgs>> privateLinkResources;

    public Input<List<PrivateLinkResourceArgs>> getPrivateLinkResources() {
        return this.privateLinkResources == null ? Input.empty() : this.privateLinkResources;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the managed cluster resource.
     * 
     */
    @InputImport(name="resourceName")
    private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * Information about a service principal identity for the cluster to use for manipulating Azure APIs.
     * 
     */
    @InputImport(name="servicePrincipalProfile")
    private final @Nullable Input<ManagedClusterServicePrincipalProfileArgs> servicePrincipalProfile;

    public Input<ManagedClusterServicePrincipalProfileArgs> getServicePrincipalProfile() {
        return this.servicePrincipalProfile == null ? Input.empty() : this.servicePrincipalProfile;
    }

    /**
     * The managed cluster SKU.
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<ManagedClusterSKUArgs> sku;

    public Input<ManagedClusterSKUArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Profile for Windows VMs in the container service cluster.
     * 
     */
    @InputImport(name="windowsProfile")
    private final @Nullable Input<ManagedClusterWindowsProfileArgs> windowsProfile;

    public Input<ManagedClusterWindowsProfileArgs> getWindowsProfile() {
        return this.windowsProfile == null ? Input.empty() : this.windowsProfile;
    }

    public ManagedClusterArgs(
        @Nullable Input<ManagedClusterAADProfileArgs> aadProfile,
        @Nullable Input<Map<String,ManagedClusterAddonProfileArgs>> addonProfiles,
        @Nullable Input<List<ManagedClusterAgentPoolProfileArgs>> agentPoolProfiles,
        @Nullable Input<ManagedClusterAPIServerAccessProfileArgs> apiServerAccessProfile,
        @Nullable Input<ManagedClusterPropertiesAutoScalerProfileArgs> autoScalerProfile,
        @Nullable Input<ManagedClusterAutoUpgradeProfileArgs> autoUpgradeProfile,
        @Nullable Input<Boolean> disableLocalAccounts,
        @Nullable Input<String> diskEncryptionSetID,
        @Nullable Input<String> dnsPrefix,
        @Nullable Input<Boolean> enablePodSecurityPolicy,
        @Nullable Input<Boolean> enableRBAC,
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<String> fqdnSubdomain,
        @Nullable Input<ManagedClusterHTTPProxyConfigArgs> httpProxyConfig,
        @Nullable Input<ManagedClusterIdentityArgs> identity,
        @Nullable Input<Map<String,ManagedClusterPropertiesIdentityProfileArgs>> identityProfile,
        @Nullable Input<String> kubernetesVersion,
        @Nullable Input<ContainerServiceLinuxProfileArgs> linuxProfile,
        @Nullable Input<String> location,
        @Nullable Input<ContainerServiceNetworkProfileArgs> networkProfile,
        @Nullable Input<String> nodeResourceGroup,
        @Nullable Input<ManagedClusterPodIdentityProfileArgs> podIdentityProfile,
        @Nullable Input<List<PrivateLinkResourceArgs>> privateLinkResources,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<ManagedClusterServicePrincipalProfileArgs> servicePrincipalProfile,
        @Nullable Input<ManagedClusterSKUArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<ManagedClusterWindowsProfileArgs> windowsProfile) {
        this.aadProfile = aadProfile;
        this.addonProfiles = addonProfiles;
        this.agentPoolProfiles = agentPoolProfiles;
        this.apiServerAccessProfile = apiServerAccessProfile;
        this.autoScalerProfile = autoScalerProfile;
        this.autoUpgradeProfile = autoUpgradeProfile;
        this.disableLocalAccounts = disableLocalAccounts;
        this.diskEncryptionSetID = diskEncryptionSetID;
        this.dnsPrefix = dnsPrefix;
        this.enablePodSecurityPolicy = enablePodSecurityPolicy;
        this.enableRBAC = enableRBAC;
        this.extendedLocation = extendedLocation;
        this.fqdnSubdomain = fqdnSubdomain;
        this.httpProxyConfig = httpProxyConfig;
        this.identity = identity;
        this.identityProfile = identityProfile;
        this.kubernetesVersion = kubernetesVersion;
        this.linuxProfile = linuxProfile;
        this.location = location;
        this.networkProfile = networkProfile;
        this.nodeResourceGroup = nodeResourceGroup;
        this.podIdentityProfile = podIdentityProfile;
        this.privateLinkResources = privateLinkResources;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.servicePrincipalProfile = servicePrincipalProfile;
        this.sku = sku;
        this.tags = tags;
        this.windowsProfile = windowsProfile;
    }

    private ManagedClusterArgs() {
        this.aadProfile = Input.empty();
        this.addonProfiles = Input.empty();
        this.agentPoolProfiles = Input.empty();
        this.apiServerAccessProfile = Input.empty();
        this.autoScalerProfile = Input.empty();
        this.autoUpgradeProfile = Input.empty();
        this.disableLocalAccounts = Input.empty();
        this.diskEncryptionSetID = Input.empty();
        this.dnsPrefix = Input.empty();
        this.enablePodSecurityPolicy = Input.empty();
        this.enableRBAC = Input.empty();
        this.extendedLocation = Input.empty();
        this.fqdnSubdomain = Input.empty();
        this.httpProxyConfig = Input.empty();
        this.identity = Input.empty();
        this.identityProfile = Input.empty();
        this.kubernetesVersion = Input.empty();
        this.linuxProfile = Input.empty();
        this.location = Input.empty();
        this.networkProfile = Input.empty();
        this.nodeResourceGroup = Input.empty();
        this.podIdentityProfile = Input.empty();
        this.privateLinkResources = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.servicePrincipalProfile = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.windowsProfile = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ManagedClusterAADProfileArgs> aadProfile;
        private @Nullable Input<Map<String,ManagedClusterAddonProfileArgs>> addonProfiles;
        private @Nullable Input<List<ManagedClusterAgentPoolProfileArgs>> agentPoolProfiles;
        private @Nullable Input<ManagedClusterAPIServerAccessProfileArgs> apiServerAccessProfile;
        private @Nullable Input<ManagedClusterPropertiesAutoScalerProfileArgs> autoScalerProfile;
        private @Nullable Input<ManagedClusterAutoUpgradeProfileArgs> autoUpgradeProfile;
        private @Nullable Input<Boolean> disableLocalAccounts;
        private @Nullable Input<String> diskEncryptionSetID;
        private @Nullable Input<String> dnsPrefix;
        private @Nullable Input<Boolean> enablePodSecurityPolicy;
        private @Nullable Input<Boolean> enableRBAC;
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<String> fqdnSubdomain;
        private @Nullable Input<ManagedClusterHTTPProxyConfigArgs> httpProxyConfig;
        private @Nullable Input<ManagedClusterIdentityArgs> identity;
        private @Nullable Input<Map<String,ManagedClusterPropertiesIdentityProfileArgs>> identityProfile;
        private @Nullable Input<String> kubernetesVersion;
        private @Nullable Input<ContainerServiceLinuxProfileArgs> linuxProfile;
        private @Nullable Input<String> location;
        private @Nullable Input<ContainerServiceNetworkProfileArgs> networkProfile;
        private @Nullable Input<String> nodeResourceGroup;
        private @Nullable Input<ManagedClusterPodIdentityProfileArgs> podIdentityProfile;
        private @Nullable Input<List<PrivateLinkResourceArgs>> privateLinkResources;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<ManagedClusterServicePrincipalProfileArgs> servicePrincipalProfile;
        private @Nullable Input<ManagedClusterSKUArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<ManagedClusterWindowsProfileArgs> windowsProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadProfile = defaults.aadProfile;
    	      this.addonProfiles = defaults.addonProfiles;
    	      this.agentPoolProfiles = defaults.agentPoolProfiles;
    	      this.apiServerAccessProfile = defaults.apiServerAccessProfile;
    	      this.autoScalerProfile = defaults.autoScalerProfile;
    	      this.autoUpgradeProfile = defaults.autoUpgradeProfile;
    	      this.disableLocalAccounts = defaults.disableLocalAccounts;
    	      this.diskEncryptionSetID = defaults.diskEncryptionSetID;
    	      this.dnsPrefix = defaults.dnsPrefix;
    	      this.enablePodSecurityPolicy = defaults.enablePodSecurityPolicy;
    	      this.enableRBAC = defaults.enableRBAC;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.fqdnSubdomain = defaults.fqdnSubdomain;
    	      this.httpProxyConfig = defaults.httpProxyConfig;
    	      this.identity = defaults.identity;
    	      this.identityProfile = defaults.identityProfile;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.linuxProfile = defaults.linuxProfile;
    	      this.location = defaults.location;
    	      this.networkProfile = defaults.networkProfile;
    	      this.nodeResourceGroup = defaults.nodeResourceGroup;
    	      this.podIdentityProfile = defaults.podIdentityProfile;
    	      this.privateLinkResources = defaults.privateLinkResources;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.servicePrincipalProfile = defaults.servicePrincipalProfile;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.windowsProfile = defaults.windowsProfile;
        }

        public Builder setAadProfile(@Nullable Input<ManagedClusterAADProfileArgs> aadProfile) {
            this.aadProfile = aadProfile;
            return this;
        }

        public Builder setAadProfile(@Nullable ManagedClusterAADProfileArgs aadProfile) {
            this.aadProfile = Input.ofNullable(aadProfile);
            return this;
        }

        public Builder setAddonProfiles(@Nullable Input<Map<String,ManagedClusterAddonProfileArgs>> addonProfiles) {
            this.addonProfiles = addonProfiles;
            return this;
        }

        public Builder setAddonProfiles(@Nullable Map<String,ManagedClusterAddonProfileArgs> addonProfiles) {
            this.addonProfiles = Input.ofNullable(addonProfiles);
            return this;
        }

        public Builder setAgentPoolProfiles(@Nullable Input<List<ManagedClusterAgentPoolProfileArgs>> agentPoolProfiles) {
            this.agentPoolProfiles = agentPoolProfiles;
            return this;
        }

        public Builder setAgentPoolProfiles(@Nullable List<ManagedClusterAgentPoolProfileArgs> agentPoolProfiles) {
            this.agentPoolProfiles = Input.ofNullable(agentPoolProfiles);
            return this;
        }

        public Builder setApiServerAccessProfile(@Nullable Input<ManagedClusterAPIServerAccessProfileArgs> apiServerAccessProfile) {
            this.apiServerAccessProfile = apiServerAccessProfile;
            return this;
        }

        public Builder setApiServerAccessProfile(@Nullable ManagedClusterAPIServerAccessProfileArgs apiServerAccessProfile) {
            this.apiServerAccessProfile = Input.ofNullable(apiServerAccessProfile);
            return this;
        }

        public Builder setAutoScalerProfile(@Nullable Input<ManagedClusterPropertiesAutoScalerProfileArgs> autoScalerProfile) {
            this.autoScalerProfile = autoScalerProfile;
            return this;
        }

        public Builder setAutoScalerProfile(@Nullable ManagedClusterPropertiesAutoScalerProfileArgs autoScalerProfile) {
            this.autoScalerProfile = Input.ofNullable(autoScalerProfile);
            return this;
        }

        public Builder setAutoUpgradeProfile(@Nullable Input<ManagedClusterAutoUpgradeProfileArgs> autoUpgradeProfile) {
            this.autoUpgradeProfile = autoUpgradeProfile;
            return this;
        }

        public Builder setAutoUpgradeProfile(@Nullable ManagedClusterAutoUpgradeProfileArgs autoUpgradeProfile) {
            this.autoUpgradeProfile = Input.ofNullable(autoUpgradeProfile);
            return this;
        }

        public Builder setDisableLocalAccounts(@Nullable Input<Boolean> disableLocalAccounts) {
            this.disableLocalAccounts = disableLocalAccounts;
            return this;
        }

        public Builder setDisableLocalAccounts(@Nullable Boolean disableLocalAccounts) {
            this.disableLocalAccounts = Input.ofNullable(disableLocalAccounts);
            return this;
        }

        public Builder setDiskEncryptionSetID(@Nullable Input<String> diskEncryptionSetID) {
            this.diskEncryptionSetID = diskEncryptionSetID;
            return this;
        }

        public Builder setDiskEncryptionSetID(@Nullable String diskEncryptionSetID) {
            this.diskEncryptionSetID = Input.ofNullable(diskEncryptionSetID);
            return this;
        }

        public Builder setDnsPrefix(@Nullable Input<String> dnsPrefix) {
            this.dnsPrefix = dnsPrefix;
            return this;
        }

        public Builder setDnsPrefix(@Nullable String dnsPrefix) {
            this.dnsPrefix = Input.ofNullable(dnsPrefix);
            return this;
        }

        public Builder setEnablePodSecurityPolicy(@Nullable Input<Boolean> enablePodSecurityPolicy) {
            this.enablePodSecurityPolicy = enablePodSecurityPolicy;
            return this;
        }

        public Builder setEnablePodSecurityPolicy(@Nullable Boolean enablePodSecurityPolicy) {
            this.enablePodSecurityPolicy = Input.ofNullable(enablePodSecurityPolicy);
            return this;
        }

        public Builder setEnableRBAC(@Nullable Input<Boolean> enableRBAC) {
            this.enableRBAC = enableRBAC;
            return this;
        }

        public Builder setEnableRBAC(@Nullable Boolean enableRBAC) {
            this.enableRBAC = Input.ofNullable(enableRBAC);
            return this;
        }

        public Builder setExtendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
            return this;
        }

        public Builder setFqdnSubdomain(@Nullable Input<String> fqdnSubdomain) {
            this.fqdnSubdomain = fqdnSubdomain;
            return this;
        }

        public Builder setFqdnSubdomain(@Nullable String fqdnSubdomain) {
            this.fqdnSubdomain = Input.ofNullable(fqdnSubdomain);
            return this;
        }

        public Builder setHttpProxyConfig(@Nullable Input<ManagedClusterHTTPProxyConfigArgs> httpProxyConfig) {
            this.httpProxyConfig = httpProxyConfig;
            return this;
        }

        public Builder setHttpProxyConfig(@Nullable ManagedClusterHTTPProxyConfigArgs httpProxyConfig) {
            this.httpProxyConfig = Input.ofNullable(httpProxyConfig);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ManagedClusterIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedClusterIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setIdentityProfile(@Nullable Input<Map<String,ManagedClusterPropertiesIdentityProfileArgs>> identityProfile) {
            this.identityProfile = identityProfile;
            return this;
        }

        public Builder setIdentityProfile(@Nullable Map<String,ManagedClusterPropertiesIdentityProfileArgs> identityProfile) {
            this.identityProfile = Input.ofNullable(identityProfile);
            return this;
        }

        public Builder setKubernetesVersion(@Nullable Input<String> kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        public Builder setKubernetesVersion(@Nullable String kubernetesVersion) {
            this.kubernetesVersion = Input.ofNullable(kubernetesVersion);
            return this;
        }

        public Builder setLinuxProfile(@Nullable Input<ContainerServiceLinuxProfileArgs> linuxProfile) {
            this.linuxProfile = linuxProfile;
            return this;
        }

        public Builder setLinuxProfile(@Nullable ContainerServiceLinuxProfileArgs linuxProfile) {
            this.linuxProfile = Input.ofNullable(linuxProfile);
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

        public Builder setNetworkProfile(@Nullable Input<ContainerServiceNetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setNetworkProfile(@Nullable ContainerServiceNetworkProfileArgs networkProfile) {
            this.networkProfile = Input.ofNullable(networkProfile);
            return this;
        }

        public Builder setNodeResourceGroup(@Nullable Input<String> nodeResourceGroup) {
            this.nodeResourceGroup = nodeResourceGroup;
            return this;
        }

        public Builder setNodeResourceGroup(@Nullable String nodeResourceGroup) {
            this.nodeResourceGroup = Input.ofNullable(nodeResourceGroup);
            return this;
        }

        public Builder setPodIdentityProfile(@Nullable Input<ManagedClusterPodIdentityProfileArgs> podIdentityProfile) {
            this.podIdentityProfile = podIdentityProfile;
            return this;
        }

        public Builder setPodIdentityProfile(@Nullable ManagedClusterPodIdentityProfileArgs podIdentityProfile) {
            this.podIdentityProfile = Input.ofNullable(podIdentityProfile);
            return this;
        }

        public Builder setPrivateLinkResources(@Nullable Input<List<PrivateLinkResourceArgs>> privateLinkResources) {
            this.privateLinkResources = privateLinkResources;
            return this;
        }

        public Builder setPrivateLinkResources(@Nullable List<PrivateLinkResourceArgs> privateLinkResources) {
            this.privateLinkResources = Input.ofNullable(privateLinkResources);
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

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setServicePrincipalProfile(@Nullable Input<ManagedClusterServicePrincipalProfileArgs> servicePrincipalProfile) {
            this.servicePrincipalProfile = servicePrincipalProfile;
            return this;
        }

        public Builder setServicePrincipalProfile(@Nullable ManagedClusterServicePrincipalProfileArgs servicePrincipalProfile) {
            this.servicePrincipalProfile = Input.ofNullable(servicePrincipalProfile);
            return this;
        }

        public Builder setSku(@Nullable Input<ManagedClusterSKUArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable ManagedClusterSKUArgs sku) {
            this.sku = Input.ofNullable(sku);
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

        public Builder setWindowsProfile(@Nullable Input<ManagedClusterWindowsProfileArgs> windowsProfile) {
            this.windowsProfile = windowsProfile;
            return this;
        }

        public Builder setWindowsProfile(@Nullable ManagedClusterWindowsProfileArgs windowsProfile) {
            this.windowsProfile = Input.ofNullable(windowsProfile);
            return this;
        }

        public ManagedClusterArgs build() {
            return new ManagedClusterArgs(aadProfile, addonProfiles, agentPoolProfiles, apiServerAccessProfile, autoScalerProfile, autoUpgradeProfile, disableLocalAccounts, diskEncryptionSetID, dnsPrefix, enablePodSecurityPolicy, enableRBAC, extendedLocation, fqdnSubdomain, httpProxyConfig, identity, identityProfile, kubernetesVersion, linuxProfile, location, networkProfile, nodeResourceGroup, podIdentityProfile, privateLinkResources, resourceGroupName, resourceName, servicePrincipalProfile, sku, tags, windowsProfile);
        }
    }
}
