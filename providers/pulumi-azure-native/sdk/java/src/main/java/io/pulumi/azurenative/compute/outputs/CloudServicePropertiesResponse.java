// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CloudServiceExtensionProfileResponse;
import io.pulumi.azurenative.compute.outputs.CloudServiceNetworkProfileResponse;
import io.pulumi.azurenative.compute.outputs.CloudServiceOsProfileResponse;
import io.pulumi.azurenative.compute.outputs.CloudServiceRoleProfileResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudServicePropertiesResponse {
    /**
     * (Optional) Indicates whether the role sku properties (roleProfile.roles.sku) specified in the model/template should override the role instance count and vm size specified in the .cscfg and .csdef respectively.
     * The default value is `false`.
     * 
     */
    private final @Nullable Boolean allowModelOverride;
    /**
     * Specifies the XML service configuration (.cscfg) for the cloud service.
     * 
     */
    private final @Nullable String configuration;
    /**
     * Specifies a URL that refers to the location of the service configuration in the Blob service. The service package URL  can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     */
    private final @Nullable String configurationUrl;
    /**
     * Describes a cloud service extension profile.
     * 
     */
    private final @Nullable CloudServiceExtensionProfileResponse extensionProfile;
    /**
     * Network Profile for the cloud service.
     * 
     */
    private final @Nullable CloudServiceNetworkProfileResponse networkProfile;
    /**
     * Describes the OS profile for the cloud service.
     * 
     */
    private final @Nullable CloudServiceOsProfileResponse osProfile;
    /**
     * Specifies a URL that refers to the location of the service package in the Blob service. The service package URL can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     */
    private final @Nullable String packageUrl;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * Describes the role profile for the cloud service.
     * 
     */
    private final @Nullable CloudServiceRoleProfileResponse roleProfile;
    /**
     * (Optional) Indicates whether to start the cloud service immediately after it is created. The default value is `true`.
     * If false, the service model is still deployed, but the code is not run immediately. Instead, the service is PoweredOff until you call Start, at which time the service will be started. A deployed service still incurs charges, even if it is poweredoff.
     * 
     */
    private final @Nullable Boolean startCloudService;
    /**
     * The unique identifier for the cloud service.
     * 
     */
    private final String uniqueId;
    /**
     * Update mode for the cloud service. Role instances are allocated to update domains when the service is deployed. Updates can be initiated manually in each update domain or initiated automatically in all update domains.
     * Possible Values are <br /><br />**Auto**<br /><br />**Manual** <br /><br />**Simultaneous**<br /><br />
     * If not specified, the default value is Auto. If set to Manual, PUT UpdateDomain must be called to apply the update. If set to Auto, the update is automatically applied to each update domain in sequence.
     * 
     */
    private final @Nullable String upgradeMode;

    @CustomType.Constructor
    private CloudServicePropertiesResponse(
        @CustomType.Parameter("allowModelOverride") @Nullable Boolean allowModelOverride,
        @CustomType.Parameter("configuration") @Nullable String configuration,
        @CustomType.Parameter("configurationUrl") @Nullable String configurationUrl,
        @CustomType.Parameter("extensionProfile") @Nullable CloudServiceExtensionProfileResponse extensionProfile,
        @CustomType.Parameter("networkProfile") @Nullable CloudServiceNetworkProfileResponse networkProfile,
        @CustomType.Parameter("osProfile") @Nullable CloudServiceOsProfileResponse osProfile,
        @CustomType.Parameter("packageUrl") @Nullable String packageUrl,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("roleProfile") @Nullable CloudServiceRoleProfileResponse roleProfile,
        @CustomType.Parameter("startCloudService") @Nullable Boolean startCloudService,
        @CustomType.Parameter("uniqueId") String uniqueId,
        @CustomType.Parameter("upgradeMode") @Nullable String upgradeMode) {
        this.allowModelOverride = allowModelOverride;
        this.configuration = configuration;
        this.configurationUrl = configurationUrl;
        this.extensionProfile = extensionProfile;
        this.networkProfile = networkProfile;
        this.osProfile = osProfile;
        this.packageUrl = packageUrl;
        this.provisioningState = provisioningState;
        this.roleProfile = roleProfile;
        this.startCloudService = startCloudService;
        this.uniqueId = uniqueId;
        this.upgradeMode = upgradeMode;
    }

    /**
     * (Optional) Indicates whether the role sku properties (roleProfile.roles.sku) specified in the model/template should override the role instance count and vm size specified in the .cscfg and .csdef respectively.
     * The default value is `false`.
     * 
    */
    public Optional<Boolean> getAllowModelOverride() {
        return Optional.ofNullable(this.allowModelOverride);
    }
    /**
     * Specifies the XML service configuration (.cscfg) for the cloud service.
     * 
    */
    public Optional<String> getConfiguration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * Specifies a URL that refers to the location of the service configuration in the Blob service. The service package URL  can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
    */
    public Optional<String> getConfigurationUrl() {
        return Optional.ofNullable(this.configurationUrl);
    }
    /**
     * Describes a cloud service extension profile.
     * 
    */
    public Optional<CloudServiceExtensionProfileResponse> getExtensionProfile() {
        return Optional.ofNullable(this.extensionProfile);
    }
    /**
     * Network Profile for the cloud service.
     * 
    */
    public Optional<CloudServiceNetworkProfileResponse> getNetworkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * Describes the OS profile for the cloud service.
     * 
    */
    public Optional<CloudServiceOsProfileResponse> getOsProfile() {
        return Optional.ofNullable(this.osProfile);
    }
    /**
     * Specifies a URL that refers to the location of the service package in the Blob service. The service package URL can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
    */
    public Optional<String> getPackageUrl() {
        return Optional.ofNullable(this.packageUrl);
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Describes the role profile for the cloud service.
     * 
    */
    public Optional<CloudServiceRoleProfileResponse> getRoleProfile() {
        return Optional.ofNullable(this.roleProfile);
    }
    /**
     * (Optional) Indicates whether to start the cloud service immediately after it is created. The default value is `true`.
     * If false, the service model is still deployed, but the code is not run immediately. Instead, the service is PoweredOff until you call Start, at which time the service will be started. A deployed service still incurs charges, even if it is poweredoff.
     * 
    */
    public Optional<Boolean> getStartCloudService() {
        return Optional.ofNullable(this.startCloudService);
    }
    /**
     * The unique identifier for the cloud service.
     * 
    */
    public String getUniqueId() {
        return this.uniqueId;
    }
    /**
     * Update mode for the cloud service. Role instances are allocated to update domains when the service is deployed. Updates can be initiated manually in each update domain or initiated automatically in all update domains.
     * Possible Values are <br /><br />**Auto**<br /><br />**Manual** <br /><br />**Simultaneous**<br /><br />
     * If not specified, the default value is Auto. If set to Manual, PUT UpdateDomain must be called to apply the update. If set to Auto, the update is automatically applied to each update domain in sequence.
     * 
    */
    public Optional<String> getUpgradeMode() {
        return Optional.ofNullable(this.upgradeMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServicePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowModelOverride;
        private @Nullable String configuration;
        private @Nullable String configurationUrl;
        private @Nullable CloudServiceExtensionProfileResponse extensionProfile;
        private @Nullable CloudServiceNetworkProfileResponse networkProfile;
        private @Nullable CloudServiceOsProfileResponse osProfile;
        private @Nullable String packageUrl;
        private String provisioningState;
        private @Nullable CloudServiceRoleProfileResponse roleProfile;
        private @Nullable Boolean startCloudService;
        private String uniqueId;
        private @Nullable String upgradeMode;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServicePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowModelOverride = defaults.allowModelOverride;
    	      this.configuration = defaults.configuration;
    	      this.configurationUrl = defaults.configurationUrl;
    	      this.extensionProfile = defaults.extensionProfile;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osProfile = defaults.osProfile;
    	      this.packageUrl = defaults.packageUrl;
    	      this.provisioningState = defaults.provisioningState;
    	      this.roleProfile = defaults.roleProfile;
    	      this.startCloudService = defaults.startCloudService;
    	      this.uniqueId = defaults.uniqueId;
    	      this.upgradeMode = defaults.upgradeMode;
        }

        public Builder allowModelOverride(@Nullable Boolean allowModelOverride) {
            this.allowModelOverride = allowModelOverride;
            return this;
        }

        public Builder configuration(@Nullable String configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder configurationUrl(@Nullable String configurationUrl) {
            this.configurationUrl = configurationUrl;
            return this;
        }

        public Builder extensionProfile(@Nullable CloudServiceExtensionProfileResponse extensionProfile) {
            this.extensionProfile = extensionProfile;
            return this;
        }

        public Builder networkProfile(@Nullable CloudServiceNetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder osProfile(@Nullable CloudServiceOsProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder packageUrl(@Nullable String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder roleProfile(@Nullable CloudServiceRoleProfileResponse roleProfile) {
            this.roleProfile = roleProfile;
            return this;
        }

        public Builder startCloudService(@Nullable Boolean startCloudService) {
            this.startCloudService = startCloudService;
            return this;
        }

        public Builder uniqueId(String uniqueId) {
            this.uniqueId = Objects.requireNonNull(uniqueId);
            return this;
        }

        public Builder upgradeMode(@Nullable String upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }
        public CloudServicePropertiesResponse build() {
            return new CloudServicePropertiesResponse(allowModelOverride, configuration, configurationUrl, extensionProfile, networkProfile, osProfile, packageUrl, provisioningState, roleProfile, startCloudService, uniqueId, upgradeMode);
        }
    }
}
