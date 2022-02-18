// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.HostNameSslStateResponse;
import io.pulumi.azurenative.web.outputs.HostingEnvironmentProfileResponse;
import io.pulumi.azurenative.web.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.web.outputs.SiteConfigResponse;
import io.pulumi.azurenative.web.outputs.SlotSwapStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppResult {
    /**
     * Management information availability state for the app.
     * 
     */
    private final String availabilityState;
    /**
     * <code>true</code> to enable client affinity; <code>false</code> to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is <code>true</code>.
     * 
     */
    private final @Nullable Boolean clientAffinityEnabled;
    /**
     * <code>true</code> to enable client certificate authentication (TLS mutual authentication); otherwise, <code>false</code>. Default is <code>false</code>.
     * 
     */
    private final @Nullable Boolean clientCertEnabled;
    /**
     * client certificate authentication comma-separated exclusion paths
     * 
     */
    private final @Nullable String clientCertExclusionPaths;
    /**
     * This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     */
    private final @Nullable String clientCertMode;
    /**
     * Size of the function container.
     * 
     */
    private final @Nullable Integer containerSize;
    /**
     * Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
     * 
     */
    private final @Nullable String customDomainVerificationId;
    /**
     * Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     * 
     */
    private final @Nullable Integer dailyMemoryTimeQuota;
    /**
     * Default hostname of the app. Read-only.
     * 
     */
    private final String defaultHostName;
    /**
     * <code>true</code> if the app is enabled; otherwise, <code>false</code>. Setting this value to false disables the app (takes the app offline).
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Enabled hostnames for the app.Hostnames need to be assigned (see HostNames) AND enabled. Otherwise,
     * the app is not served on those hostnames.
     * 
     */
    private final List<String> enabledHostNames;
    /**
     * Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     * 
     */
    private final @Nullable List<HostNameSslStateResponse> hostNameSslStates;
    /**
     * Hostnames associated with the app.
     * 
     */
    private final List<String> hostNames;
    /**
     * <code>true</code> to disable the public hostnames of the app; otherwise, <code>false</code>.
     *  If <code>true</code>, the app is only accessible via API management process.
     * 
     */
    private final @Nullable Boolean hostNamesDisabled;
    /**
     * App Service Environment to use for the app.
     * 
     */
    private final @Nullable HostingEnvironmentProfileResponse hostingEnvironmentProfile;
    /**
     * HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests
     * 
     */
    private final @Nullable Boolean httpsOnly;
    /**
     * Hyper-V sandbox.
     * 
     */
    private final @Nullable Boolean hyperV;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Managed service identity.
     * 
     */
    private final @Nullable ManagedServiceIdentityResponse identity;
    /**
     * Specifies an operation id if this site has a pending operation.
     * 
     */
    private final String inProgressOperationId;
    /**
     * <code>true</code> if the app is a default container; otherwise, <code>false</code>.
     * 
     */
    private final Boolean isDefaultContainer;
    /**
     * Obsolete: Hyper-V sandbox.
     * 
     */
    private final @Nullable Boolean isXenon;
    /**
     * Identity to use for Key Vault Reference authentication.
     * 
     */
    private final @Nullable String keyVaultReferenceIdentity;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Last time the app was modified, in UTC. Read-only.
     * 
     */
    private final String lastModifiedTimeUtc;
    /**
     * Resource Location.
     * 
     */
    private final String location;
    /**
     * Maximum number of workers.
     * This only applies to Functions container.
     * 
     */
    private final Integer maxNumberOfWorkers;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from tenants that site can be hosted with current settings. Read-only.
     * 
     */
    private final String outboundIpAddresses;
    /**
     * List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from all tenants except dataComponent. Read-only.
     * 
     */
    private final String possibleOutboundIpAddresses;
    /**
     * Site redundancy mode
     * 
     */
    private final @Nullable String redundancyMode;
    /**
     * Name of the repository site.
     * 
     */
    private final String repositorySiteName;
    /**
     * <code>true</code> if reserved; otherwise, <code>false</code>.
     * 
     */
    private final @Nullable Boolean reserved;
    /**
     * Name of the resource group the app belongs to. Read-only.
     * 
     */
    private final String resourceGroup;
    /**
     * <code>true</code> to stop SCM (KUDU) site when the app is stopped; otherwise, <code>false</code>. The default is <code>false</code>.
     * 
     */
    private final @Nullable Boolean scmSiteAlsoStopped;
    /**
     * Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     * 
     */
    private final @Nullable String serverFarmId;
    /**
     * Configuration of the app.
     * 
     */
    private final @Nullable SiteConfigResponse siteConfig;
    /**
     * Status of the last deployment slot swap operation.
     * 
     */
    private final SlotSwapStatusResponse slotSwapStatus;
    /**
     * Current state of the app.
     * 
     */
    private final String state;
    /**
     * Checks if Customer provided storage account is required
     * 
     */
    private final @Nullable Boolean storageAccountRequired;
    /**
     * App suspended till in case memory-time quota is exceeded.
     * 
     */
    private final String suspendedTill;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Specifies which deployment slot this app will swap into. Read-only.
     * 
     */
    private final String targetSwapSlot;
    /**
     * Azure Traffic Manager hostnames associated with the app. Read-only.
     * 
     */
    private final List<String> trafficManagerHostNames;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * State indicating whether the app has exceeded its quota usage. Read-only.
     * 
     */
    private final String usageState;
    /**
     * Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
     * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
     * 
     */
    private final @Nullable String virtualNetworkSubnetId;

    @OutputCustomType.Constructor({"availabilityState","clientAffinityEnabled","clientCertEnabled","clientCertExclusionPaths","clientCertMode","containerSize","customDomainVerificationId","dailyMemoryTimeQuota","defaultHostName","enabled","enabledHostNames","hostNameSslStates","hostNames","hostNamesDisabled","hostingEnvironmentProfile","httpsOnly","hyperV","id","identity","inProgressOperationId","isDefaultContainer","isXenon","keyVaultReferenceIdentity","kind","lastModifiedTimeUtc","location","maxNumberOfWorkers","name","outboundIpAddresses","possibleOutboundIpAddresses","redundancyMode","repositorySiteName","reserved","resourceGroup","scmSiteAlsoStopped","serverFarmId","siteConfig","slotSwapStatus","state","storageAccountRequired","suspendedTill","tags","targetSwapSlot","trafficManagerHostNames","type","usageState","virtualNetworkSubnetId"})
    private GetWebAppResult(
        String availabilityState,
        @Nullable Boolean clientAffinityEnabled,
        @Nullable Boolean clientCertEnabled,
        @Nullable String clientCertExclusionPaths,
        @Nullable String clientCertMode,
        @Nullable Integer containerSize,
        @Nullable String customDomainVerificationId,
        @Nullable Integer dailyMemoryTimeQuota,
        String defaultHostName,
        @Nullable Boolean enabled,
        List<String> enabledHostNames,
        @Nullable List<HostNameSslStateResponse> hostNameSslStates,
        List<String> hostNames,
        @Nullable Boolean hostNamesDisabled,
        @Nullable HostingEnvironmentProfileResponse hostingEnvironmentProfile,
        @Nullable Boolean httpsOnly,
        @Nullable Boolean hyperV,
        String id,
        @Nullable ManagedServiceIdentityResponse identity,
        String inProgressOperationId,
        Boolean isDefaultContainer,
        @Nullable Boolean isXenon,
        @Nullable String keyVaultReferenceIdentity,
        @Nullable String kind,
        String lastModifiedTimeUtc,
        String location,
        Integer maxNumberOfWorkers,
        String name,
        String outboundIpAddresses,
        String possibleOutboundIpAddresses,
        @Nullable String redundancyMode,
        String repositorySiteName,
        @Nullable Boolean reserved,
        String resourceGroup,
        @Nullable Boolean scmSiteAlsoStopped,
        @Nullable String serverFarmId,
        @Nullable SiteConfigResponse siteConfig,
        SlotSwapStatusResponse slotSwapStatus,
        String state,
        @Nullable Boolean storageAccountRequired,
        String suspendedTill,
        @Nullable Map<String,String> tags,
        String targetSwapSlot,
        List<String> trafficManagerHostNames,
        String type,
        String usageState,
        @Nullable String virtualNetworkSubnetId) {
        this.availabilityState = Objects.requireNonNull(availabilityState);
        this.clientAffinityEnabled = clientAffinityEnabled;
        this.clientCertEnabled = clientCertEnabled;
        this.clientCertExclusionPaths = clientCertExclusionPaths;
        this.clientCertMode = clientCertMode;
        this.containerSize = containerSize;
        this.customDomainVerificationId = customDomainVerificationId;
        this.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
        this.defaultHostName = Objects.requireNonNull(defaultHostName);
        this.enabled = enabled;
        this.enabledHostNames = Objects.requireNonNull(enabledHostNames);
        this.hostNameSslStates = hostNameSslStates;
        this.hostNames = Objects.requireNonNull(hostNames);
        this.hostNamesDisabled = hostNamesDisabled;
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        this.httpsOnly = httpsOnly;
        this.hyperV = hyperV;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.inProgressOperationId = Objects.requireNonNull(inProgressOperationId);
        this.isDefaultContainer = Objects.requireNonNull(isDefaultContainer);
        this.isXenon = isXenon;
        this.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
        this.kind = kind;
        this.lastModifiedTimeUtc = Objects.requireNonNull(lastModifiedTimeUtc);
        this.location = Objects.requireNonNull(location);
        this.maxNumberOfWorkers = Objects.requireNonNull(maxNumberOfWorkers);
        this.name = Objects.requireNonNull(name);
        this.outboundIpAddresses = Objects.requireNonNull(outboundIpAddresses);
        this.possibleOutboundIpAddresses = Objects.requireNonNull(possibleOutboundIpAddresses);
        this.redundancyMode = redundancyMode;
        this.repositorySiteName = Objects.requireNonNull(repositorySiteName);
        this.reserved = reserved;
        this.resourceGroup = Objects.requireNonNull(resourceGroup);
        this.scmSiteAlsoStopped = scmSiteAlsoStopped;
        this.serverFarmId = serverFarmId;
        this.siteConfig = siteConfig;
        this.slotSwapStatus = Objects.requireNonNull(slotSwapStatus);
        this.state = Objects.requireNonNull(state);
        this.storageAccountRequired = storageAccountRequired;
        this.suspendedTill = Objects.requireNonNull(suspendedTill);
        this.tags = tags;
        this.targetSwapSlot = Objects.requireNonNull(targetSwapSlot);
        this.trafficManagerHostNames = Objects.requireNonNull(trafficManagerHostNames);
        this.type = Objects.requireNonNull(type);
        this.usageState = Objects.requireNonNull(usageState);
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
    }

    /**
     * Management information availability state for the app.
     * 
     */
    public String getAvailabilityState() {
        return this.availabilityState;
    }
    /**
     * <code>true</code> to enable client affinity; <code>false</code> to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is <code>true</code>.
     * 
     */
    public Optional<Boolean> getClientAffinityEnabled() {
        return Optional.ofNullable(this.clientAffinityEnabled);
    }
    /**
     * <code>true</code> to enable client certificate authentication (TLS mutual authentication); otherwise, <code>false</code>. Default is <code>false</code>.
     * 
     */
    public Optional<Boolean> getClientCertEnabled() {
        return Optional.ofNullable(this.clientCertEnabled);
    }
    /**
     * client certificate authentication comma-separated exclusion paths
     * 
     */
    public Optional<String> getClientCertExclusionPaths() {
        return Optional.ofNullable(this.clientCertExclusionPaths);
    }
    /**
     * This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     */
    public Optional<String> getClientCertMode() {
        return Optional.ofNullable(this.clientCertMode);
    }
    /**
     * Size of the function container.
     * 
     */
    public Optional<Integer> getContainerSize() {
        return Optional.ofNullable(this.containerSize);
    }
    /**
     * Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
     * 
     */
    public Optional<String> getCustomDomainVerificationId() {
        return Optional.ofNullable(this.customDomainVerificationId);
    }
    /**
     * Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     * 
     */
    public Optional<Integer> getDailyMemoryTimeQuota() {
        return Optional.ofNullable(this.dailyMemoryTimeQuota);
    }
    /**
     * Default hostname of the app. Read-only.
     * 
     */
    public String getDefaultHostName() {
        return this.defaultHostName;
    }
    /**
     * <code>true</code> if the app is enabled; otherwise, <code>false</code>. Setting this value to false disables the app (takes the app offline).
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Enabled hostnames for the app.Hostnames need to be assigned (see HostNames) AND enabled. Otherwise,
     * the app is not served on those hostnames.
     * 
     */
    public List<String> getEnabledHostNames() {
        return this.enabledHostNames;
    }
    /**
     * Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     * 
     */
    public List<HostNameSslStateResponse> getHostNameSslStates() {
        return this.hostNameSslStates == null ? List.of() : this.hostNameSslStates;
    }
    /**
     * Hostnames associated with the app.
     * 
     */
    public List<String> getHostNames() {
        return this.hostNames;
    }
    /**
     * <code>true</code> to disable the public hostnames of the app; otherwise, <code>false</code>.
     *  If <code>true</code>, the app is only accessible via API management process.
     * 
     */
    public Optional<Boolean> getHostNamesDisabled() {
        return Optional.ofNullable(this.hostNamesDisabled);
    }
    /**
     * App Service Environment to use for the app.
     * 
     */
    public Optional<HostingEnvironmentProfileResponse> getHostingEnvironmentProfile() {
        return Optional.ofNullable(this.hostingEnvironmentProfile);
    }
    /**
     * HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests
     * 
     */
    public Optional<Boolean> getHttpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }
    /**
     * Hyper-V sandbox.
     * 
     */
    public Optional<Boolean> getHyperV() {
        return Optional.ofNullable(this.hyperV);
    }
    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Managed service identity.
     * 
     */
    public Optional<ManagedServiceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Specifies an operation id if this site has a pending operation.
     * 
     */
    public String getInProgressOperationId() {
        return this.inProgressOperationId;
    }
    /**
     * <code>true</code> if the app is a default container; otherwise, <code>false</code>.
     * 
     */
    public Boolean getIsDefaultContainer() {
        return this.isDefaultContainer;
    }
    /**
     * Obsolete: Hyper-V sandbox.
     * 
     */
    public Optional<Boolean> getIsXenon() {
        return Optional.ofNullable(this.isXenon);
    }
    /**
     * Identity to use for Key Vault Reference authentication.
     * 
     */
    public Optional<String> getKeyVaultReferenceIdentity() {
        return Optional.ofNullable(this.keyVaultReferenceIdentity);
    }
    /**
     * Kind of resource.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Last time the app was modified, in UTC. Read-only.
     * 
     */
    public String getLastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    /**
     * Resource Location.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Maximum number of workers.
     * This only applies to Functions container.
     * 
     */
    public Integer getMaxNumberOfWorkers() {
        return this.maxNumberOfWorkers;
    }
    /**
     * Resource Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from tenants that site can be hosted with current settings. Read-only.
     * 
     */
    public String getOutboundIpAddresses() {
        return this.outboundIpAddresses;
    }
    /**
     * List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from all tenants except dataComponent. Read-only.
     * 
     */
    public String getPossibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }
    /**
     * Site redundancy mode
     * 
     */
    public Optional<String> getRedundancyMode() {
        return Optional.ofNullable(this.redundancyMode);
    }
    /**
     * Name of the repository site.
     * 
     */
    public String getRepositorySiteName() {
        return this.repositorySiteName;
    }
    /**
     * <code>true</code> if reserved; otherwise, <code>false</code>.
     * 
     */
    public Optional<Boolean> getReserved() {
        return Optional.ofNullable(this.reserved);
    }
    /**
     * Name of the resource group the app belongs to. Read-only.
     * 
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * <code>true</code> to stop SCM (KUDU) site when the app is stopped; otherwise, <code>false</code>. The default is <code>false</code>.
     * 
     */
    public Optional<Boolean> getScmSiteAlsoStopped() {
        return Optional.ofNullable(this.scmSiteAlsoStopped);
    }
    /**
     * Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     * 
     */
    public Optional<String> getServerFarmId() {
        return Optional.ofNullable(this.serverFarmId);
    }
    /**
     * Configuration of the app.
     * 
     */
    public Optional<SiteConfigResponse> getSiteConfig() {
        return Optional.ofNullable(this.siteConfig);
    }
    /**
     * Status of the last deployment slot swap operation.
     * 
     */
    public SlotSwapStatusResponse getSlotSwapStatus() {
        return this.slotSwapStatus;
    }
    /**
     * Current state of the app.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Checks if Customer provided storage account is required
     * 
     */
    public Optional<Boolean> getStorageAccountRequired() {
        return Optional.ofNullable(this.storageAccountRequired);
    }
    /**
     * App suspended till in case memory-time quota is exceeded.
     * 
     */
    public String getSuspendedTill() {
        return this.suspendedTill;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Specifies which deployment slot this app will swap into. Read-only.
     * 
     */
    public String getTargetSwapSlot() {
        return this.targetSwapSlot;
    }
    /**
     * Azure Traffic Manager hostnames associated with the app. Read-only.
     * 
     */
    public List<String> getTrafficManagerHostNames() {
        return this.trafficManagerHostNames;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * State indicating whether the app has exceeded its quota usage. Read-only.
     * 
     */
    public String getUsageState() {
        return this.usageState;
    }
    /**
     * Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
     * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
     * 
     */
    public Optional<String> getVirtualNetworkSubnetId() {
        return Optional.ofNullable(this.virtualNetworkSubnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityState;
        private @Nullable Boolean clientAffinityEnabled;
        private @Nullable Boolean clientCertEnabled;
        private @Nullable String clientCertExclusionPaths;
        private @Nullable String clientCertMode;
        private @Nullable Integer containerSize;
        private @Nullable String customDomainVerificationId;
        private @Nullable Integer dailyMemoryTimeQuota;
        private String defaultHostName;
        private @Nullable Boolean enabled;
        private List<String> enabledHostNames;
        private @Nullable List<HostNameSslStateResponse> hostNameSslStates;
        private List<String> hostNames;
        private @Nullable Boolean hostNamesDisabled;
        private @Nullable HostingEnvironmentProfileResponse hostingEnvironmentProfile;
        private @Nullable Boolean httpsOnly;
        private @Nullable Boolean hyperV;
        private String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private String inProgressOperationId;
        private Boolean isDefaultContainer;
        private @Nullable Boolean isXenon;
        private @Nullable String keyVaultReferenceIdentity;
        private @Nullable String kind;
        private String lastModifiedTimeUtc;
        private String location;
        private Integer maxNumberOfWorkers;
        private String name;
        private String outboundIpAddresses;
        private String possibleOutboundIpAddresses;
        private @Nullable String redundancyMode;
        private String repositorySiteName;
        private @Nullable Boolean reserved;
        private String resourceGroup;
        private @Nullable Boolean scmSiteAlsoStopped;
        private @Nullable String serverFarmId;
        private @Nullable SiteConfigResponse siteConfig;
        private SlotSwapStatusResponse slotSwapStatus;
        private String state;
        private @Nullable Boolean storageAccountRequired;
        private String suspendedTill;
        private @Nullable Map<String,String> tags;
        private String targetSwapSlot;
        private List<String> trafficManagerHostNames;
        private String type;
        private String usageState;
        private @Nullable String virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityState = defaults.availabilityState;
    	      this.clientAffinityEnabled = defaults.clientAffinityEnabled;
    	      this.clientCertEnabled = defaults.clientCertEnabled;
    	      this.clientCertExclusionPaths = defaults.clientCertExclusionPaths;
    	      this.clientCertMode = defaults.clientCertMode;
    	      this.containerSize = defaults.containerSize;
    	      this.customDomainVerificationId = defaults.customDomainVerificationId;
    	      this.dailyMemoryTimeQuota = defaults.dailyMemoryTimeQuota;
    	      this.defaultHostName = defaults.defaultHostName;
    	      this.enabled = defaults.enabled;
    	      this.enabledHostNames = defaults.enabledHostNames;
    	      this.hostNameSslStates = defaults.hostNameSslStates;
    	      this.hostNames = defaults.hostNames;
    	      this.hostNamesDisabled = defaults.hostNamesDisabled;
    	      this.hostingEnvironmentProfile = defaults.hostingEnvironmentProfile;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.hyperV = defaults.hyperV;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.inProgressOperationId = defaults.inProgressOperationId;
    	      this.isDefaultContainer = defaults.isDefaultContainer;
    	      this.isXenon = defaults.isXenon;
    	      this.keyVaultReferenceIdentity = defaults.keyVaultReferenceIdentity;
    	      this.kind = defaults.kind;
    	      this.lastModifiedTimeUtc = defaults.lastModifiedTimeUtc;
    	      this.location = defaults.location;
    	      this.maxNumberOfWorkers = defaults.maxNumberOfWorkers;
    	      this.name = defaults.name;
    	      this.outboundIpAddresses = defaults.outboundIpAddresses;
    	      this.possibleOutboundIpAddresses = defaults.possibleOutboundIpAddresses;
    	      this.redundancyMode = defaults.redundancyMode;
    	      this.repositorySiteName = defaults.repositorySiteName;
    	      this.reserved = defaults.reserved;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.scmSiteAlsoStopped = defaults.scmSiteAlsoStopped;
    	      this.serverFarmId = defaults.serverFarmId;
    	      this.siteConfig = defaults.siteConfig;
    	      this.slotSwapStatus = defaults.slotSwapStatus;
    	      this.state = defaults.state;
    	      this.storageAccountRequired = defaults.storageAccountRequired;
    	      this.suspendedTill = defaults.suspendedTill;
    	      this.tags = defaults.tags;
    	      this.targetSwapSlot = defaults.targetSwapSlot;
    	      this.trafficManagerHostNames = defaults.trafficManagerHostNames;
    	      this.type = defaults.type;
    	      this.usageState = defaults.usageState;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder setAvailabilityState(String availabilityState) {
            this.availabilityState = Objects.requireNonNull(availabilityState);
            return this;
        }

        public Builder setClientAffinityEnabled(@Nullable Boolean clientAffinityEnabled) {
            this.clientAffinityEnabled = clientAffinityEnabled;
            return this;
        }

        public Builder setClientCertEnabled(@Nullable Boolean clientCertEnabled) {
            this.clientCertEnabled = clientCertEnabled;
            return this;
        }

        public Builder setClientCertExclusionPaths(@Nullable String clientCertExclusionPaths) {
            this.clientCertExclusionPaths = clientCertExclusionPaths;
            return this;
        }

        public Builder setClientCertMode(@Nullable String clientCertMode) {
            this.clientCertMode = clientCertMode;
            return this;
        }

        public Builder setContainerSize(@Nullable Integer containerSize) {
            this.containerSize = containerSize;
            return this;
        }

        public Builder setCustomDomainVerificationId(@Nullable String customDomainVerificationId) {
            this.customDomainVerificationId = customDomainVerificationId;
            return this;
        }

        public Builder setDailyMemoryTimeQuota(@Nullable Integer dailyMemoryTimeQuota) {
            this.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
            return this;
        }

        public Builder setDefaultHostName(String defaultHostName) {
            this.defaultHostName = Objects.requireNonNull(defaultHostName);
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabledHostNames(List<String> enabledHostNames) {
            this.enabledHostNames = Objects.requireNonNull(enabledHostNames);
            return this;
        }

        public Builder setHostNameSslStates(@Nullable List<HostNameSslStateResponse> hostNameSslStates) {
            this.hostNameSslStates = hostNameSslStates;
            return this;
        }

        public Builder setHostNames(List<String> hostNames) {
            this.hostNames = Objects.requireNonNull(hostNames);
            return this;
        }

        public Builder setHostNamesDisabled(@Nullable Boolean hostNamesDisabled) {
            this.hostNamesDisabled = hostNamesDisabled;
            return this;
        }

        public Builder setHostingEnvironmentProfile(@Nullable HostingEnvironmentProfileResponse hostingEnvironmentProfile) {
            this.hostingEnvironmentProfile = hostingEnvironmentProfile;
            return this;
        }

        public Builder setHttpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }

        public Builder setHyperV(@Nullable Boolean hyperV) {
            this.hyperV = hyperV;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setInProgressOperationId(String inProgressOperationId) {
            this.inProgressOperationId = Objects.requireNonNull(inProgressOperationId);
            return this;
        }

        public Builder setIsDefaultContainer(Boolean isDefaultContainer) {
            this.isDefaultContainer = Objects.requireNonNull(isDefaultContainer);
            return this;
        }

        public Builder setIsXenon(@Nullable Boolean isXenon) {
            this.isXenon = isXenon;
            return this;
        }

        public Builder setKeyVaultReferenceIdentity(@Nullable String keyVaultReferenceIdentity) {
            this.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLastModifiedTimeUtc(String lastModifiedTimeUtc) {
            this.lastModifiedTimeUtc = Objects.requireNonNull(lastModifiedTimeUtc);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMaxNumberOfWorkers(Integer maxNumberOfWorkers) {
            this.maxNumberOfWorkers = Objects.requireNonNull(maxNumberOfWorkers);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutboundIpAddresses(String outboundIpAddresses) {
            this.outboundIpAddresses = Objects.requireNonNull(outboundIpAddresses);
            return this;
        }

        public Builder setPossibleOutboundIpAddresses(String possibleOutboundIpAddresses) {
            this.possibleOutboundIpAddresses = Objects.requireNonNull(possibleOutboundIpAddresses);
            return this;
        }

        public Builder setRedundancyMode(@Nullable String redundancyMode) {
            this.redundancyMode = redundancyMode;
            return this;
        }

        public Builder setRepositorySiteName(String repositorySiteName) {
            this.repositorySiteName = Objects.requireNonNull(repositorySiteName);
            return this;
        }

        public Builder setReserved(@Nullable Boolean reserved) {
            this.reserved = reserved;
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setScmSiteAlsoStopped(@Nullable Boolean scmSiteAlsoStopped) {
            this.scmSiteAlsoStopped = scmSiteAlsoStopped;
            return this;
        }

        public Builder setServerFarmId(@Nullable String serverFarmId) {
            this.serverFarmId = serverFarmId;
            return this;
        }

        public Builder setSiteConfig(@Nullable SiteConfigResponse siteConfig) {
            this.siteConfig = siteConfig;
            return this;
        }

        public Builder setSlotSwapStatus(SlotSwapStatusResponse slotSwapStatus) {
            this.slotSwapStatus = Objects.requireNonNull(slotSwapStatus);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStorageAccountRequired(@Nullable Boolean storageAccountRequired) {
            this.storageAccountRequired = storageAccountRequired;
            return this;
        }

        public Builder setSuspendedTill(String suspendedTill) {
            this.suspendedTill = Objects.requireNonNull(suspendedTill);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetSwapSlot(String targetSwapSlot) {
            this.targetSwapSlot = Objects.requireNonNull(targetSwapSlot);
            return this;
        }

        public Builder setTrafficManagerHostNames(List<String> trafficManagerHostNames) {
            this.trafficManagerHostNames = Objects.requireNonNull(trafficManagerHostNames);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsageState(String usageState) {
            this.usageState = Objects.requireNonNull(usageState);
            return this;
        }

        public Builder setVirtualNetworkSubnetId(@Nullable String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }

        public GetWebAppResult build() {
            return new GetWebAppResult(availabilityState, clientAffinityEnabled, clientCertEnabled, clientCertExclusionPaths, clientCertMode, containerSize, customDomainVerificationId, dailyMemoryTimeQuota, defaultHostName, enabled, enabledHostNames, hostNameSslStates, hostNames, hostNamesDisabled, hostingEnvironmentProfile, httpsOnly, hyperV, id, identity, inProgressOperationId, isDefaultContainer, isXenon, keyVaultReferenceIdentity, kind, lastModifiedTimeUtc, location, maxNumberOfWorkers, name, outboundIpAddresses, possibleOutboundIpAddresses, redundancyMode, repositorySiteName, reserved, resourceGroup, scmSiteAlsoStopped, serverFarmId, siteConfig, slotSwapStatus, state, storageAccountRequired, suspendedTill, tags, targetSwapSlot, trafficManagerHostNames, type, usageState, virtualNetworkSubnetId);
        }
    }
}
