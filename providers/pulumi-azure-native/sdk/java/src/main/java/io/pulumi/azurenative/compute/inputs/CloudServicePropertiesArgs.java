// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.CloudServiceUpgradeMode;
import io.pulumi.azurenative.compute.inputs.CloudServiceExtensionProfileArgs;
import io.pulumi.azurenative.compute.inputs.CloudServiceNetworkProfileArgs;
import io.pulumi.azurenative.compute.inputs.CloudServiceOsProfileArgs;
import io.pulumi.azurenative.compute.inputs.CloudServiceRoleProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cloud service properties
 * 
 */
public final class CloudServicePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServicePropertiesArgs Empty = new CloudServicePropertiesArgs();

    /**
     * (Optional) Indicates whether the role sku properties (roleProfile.roles.sku) specified in the model/template should override the role instance count and vm size specified in the .cscfg and .csdef respectively.
     * The default value is `false`.
     * 
     */
    @InputImport(name="allowModelOverride")
    private final @Nullable Input<Boolean> allowModelOverride;

    public Input<Boolean> getAllowModelOverride() {
        return this.allowModelOverride == null ? Input.empty() : this.allowModelOverride;
    }

    /**
     * Specifies the XML service configuration (.cscfg) for the cloud service.
     * 
     */
    @InputImport(name="configuration")
    private final @Nullable Input<String> configuration;

    public Input<String> getConfiguration() {
        return this.configuration == null ? Input.empty() : this.configuration;
    }

    /**
     * Specifies a URL that refers to the location of the service configuration in the Blob service. The service package URL  can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     */
    @InputImport(name="configurationUrl")
    private final @Nullable Input<String> configurationUrl;

    public Input<String> getConfigurationUrl() {
        return this.configurationUrl == null ? Input.empty() : this.configurationUrl;
    }

    /**
     * Describes a cloud service extension profile.
     * 
     */
    @InputImport(name="extensionProfile")
    private final @Nullable Input<CloudServiceExtensionProfileArgs> extensionProfile;

    public Input<CloudServiceExtensionProfileArgs> getExtensionProfile() {
        return this.extensionProfile == null ? Input.empty() : this.extensionProfile;
    }

    /**
     * Network Profile for the cloud service.
     * 
     */
    @InputImport(name="networkProfile")
    private final @Nullable Input<CloudServiceNetworkProfileArgs> networkProfile;

    public Input<CloudServiceNetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Input.empty() : this.networkProfile;
    }

    /**
     * Describes the OS profile for the cloud service.
     * 
     */
    @InputImport(name="osProfile")
    private final @Nullable Input<CloudServiceOsProfileArgs> osProfile;

    public Input<CloudServiceOsProfileArgs> getOsProfile() {
        return this.osProfile == null ? Input.empty() : this.osProfile;
    }

    /**
     * Specifies a URL that refers to the location of the service package in the Blob service. The service package URL can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     */
    @InputImport(name="packageUrl")
    private final @Nullable Input<String> packageUrl;

    public Input<String> getPackageUrl() {
        return this.packageUrl == null ? Input.empty() : this.packageUrl;
    }

    /**
     * Describes the role profile for the cloud service.
     * 
     */
    @InputImport(name="roleProfile")
    private final @Nullable Input<CloudServiceRoleProfileArgs> roleProfile;

    public Input<CloudServiceRoleProfileArgs> getRoleProfile() {
        return this.roleProfile == null ? Input.empty() : this.roleProfile;
    }

    /**
     * (Optional) Indicates whether to start the cloud service immediately after it is created. The default value is `true`.
     * If false, the service model is still deployed, but the code is not run immediately. Instead, the service is PoweredOff until you call Start, at which time the service will be started. A deployed service still incurs charges, even if it is poweredoff.
     * 
     */
    @InputImport(name="startCloudService")
    private final @Nullable Input<Boolean> startCloudService;

    public Input<Boolean> getStartCloudService() {
        return this.startCloudService == null ? Input.empty() : this.startCloudService;
    }

    /**
     * Update mode for the cloud service. Role instances are allocated to update domains when the service is deployed. Updates can be initiated manually in each update domain or initiated automatically in all update domains.
     * Possible Values are <br /><br />**Auto**<br /><br />**Manual** <br /><br />**Simultaneous**<br /><br />
     * If not specified, the default value is Auto. If set to Manual, PUT UpdateDomain must be called to apply the update. If set to Auto, the update is automatically applied to each update domain in sequence.
     * 
     */
    @InputImport(name="upgradeMode")
    private final @Nullable Input<Either<String,CloudServiceUpgradeMode>> upgradeMode;

    public Input<Either<String,CloudServiceUpgradeMode>> getUpgradeMode() {
        return this.upgradeMode == null ? Input.empty() : this.upgradeMode;
    }

    public CloudServicePropertiesArgs(
        @Nullable Input<Boolean> allowModelOverride,
        @Nullable Input<String> configuration,
        @Nullable Input<String> configurationUrl,
        @Nullable Input<CloudServiceExtensionProfileArgs> extensionProfile,
        @Nullable Input<CloudServiceNetworkProfileArgs> networkProfile,
        @Nullable Input<CloudServiceOsProfileArgs> osProfile,
        @Nullable Input<String> packageUrl,
        @Nullable Input<CloudServiceRoleProfileArgs> roleProfile,
        @Nullable Input<Boolean> startCloudService,
        @Nullable Input<Either<String,CloudServiceUpgradeMode>> upgradeMode) {
        this.allowModelOverride = allowModelOverride;
        this.configuration = configuration;
        this.configurationUrl = configurationUrl;
        this.extensionProfile = extensionProfile;
        this.networkProfile = networkProfile;
        this.osProfile = osProfile;
        this.packageUrl = packageUrl;
        this.roleProfile = roleProfile;
        this.startCloudService = startCloudService;
        this.upgradeMode = upgradeMode;
    }

    private CloudServicePropertiesArgs() {
        this.allowModelOverride = Input.empty();
        this.configuration = Input.empty();
        this.configurationUrl = Input.empty();
        this.extensionProfile = Input.empty();
        this.networkProfile = Input.empty();
        this.osProfile = Input.empty();
        this.packageUrl = Input.empty();
        this.roleProfile = Input.empty();
        this.startCloudService = Input.empty();
        this.upgradeMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowModelOverride;
        private @Nullable Input<String> configuration;
        private @Nullable Input<String> configurationUrl;
        private @Nullable Input<CloudServiceExtensionProfileArgs> extensionProfile;
        private @Nullable Input<CloudServiceNetworkProfileArgs> networkProfile;
        private @Nullable Input<CloudServiceOsProfileArgs> osProfile;
        private @Nullable Input<String> packageUrl;
        private @Nullable Input<CloudServiceRoleProfileArgs> roleProfile;
        private @Nullable Input<Boolean> startCloudService;
        private @Nullable Input<Either<String,CloudServiceUpgradeMode>> upgradeMode;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServicePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowModelOverride = defaults.allowModelOverride;
    	      this.configuration = defaults.configuration;
    	      this.configurationUrl = defaults.configurationUrl;
    	      this.extensionProfile = defaults.extensionProfile;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osProfile = defaults.osProfile;
    	      this.packageUrl = defaults.packageUrl;
    	      this.roleProfile = defaults.roleProfile;
    	      this.startCloudService = defaults.startCloudService;
    	      this.upgradeMode = defaults.upgradeMode;
        }

        public Builder setAllowModelOverride(@Nullable Input<Boolean> allowModelOverride) {
            this.allowModelOverride = allowModelOverride;
            return this;
        }

        public Builder setAllowModelOverride(@Nullable Boolean allowModelOverride) {
            this.allowModelOverride = Input.ofNullable(allowModelOverride);
            return this;
        }

        public Builder setConfiguration(@Nullable Input<String> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setConfiguration(@Nullable String configuration) {
            this.configuration = Input.ofNullable(configuration);
            return this;
        }

        public Builder setConfigurationUrl(@Nullable Input<String> configurationUrl) {
            this.configurationUrl = configurationUrl;
            return this;
        }

        public Builder setConfigurationUrl(@Nullable String configurationUrl) {
            this.configurationUrl = Input.ofNullable(configurationUrl);
            return this;
        }

        public Builder setExtensionProfile(@Nullable Input<CloudServiceExtensionProfileArgs> extensionProfile) {
            this.extensionProfile = extensionProfile;
            return this;
        }

        public Builder setExtensionProfile(@Nullable CloudServiceExtensionProfileArgs extensionProfile) {
            this.extensionProfile = Input.ofNullable(extensionProfile);
            return this;
        }

        public Builder setNetworkProfile(@Nullable Input<CloudServiceNetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setNetworkProfile(@Nullable CloudServiceNetworkProfileArgs networkProfile) {
            this.networkProfile = Input.ofNullable(networkProfile);
            return this;
        }

        public Builder setOsProfile(@Nullable Input<CloudServiceOsProfileArgs> osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder setOsProfile(@Nullable CloudServiceOsProfileArgs osProfile) {
            this.osProfile = Input.ofNullable(osProfile);
            return this;
        }

        public Builder setPackageUrl(@Nullable Input<String> packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }

        public Builder setPackageUrl(@Nullable String packageUrl) {
            this.packageUrl = Input.ofNullable(packageUrl);
            return this;
        }

        public Builder setRoleProfile(@Nullable Input<CloudServiceRoleProfileArgs> roleProfile) {
            this.roleProfile = roleProfile;
            return this;
        }

        public Builder setRoleProfile(@Nullable CloudServiceRoleProfileArgs roleProfile) {
            this.roleProfile = Input.ofNullable(roleProfile);
            return this;
        }

        public Builder setStartCloudService(@Nullable Input<Boolean> startCloudService) {
            this.startCloudService = startCloudService;
            return this;
        }

        public Builder setStartCloudService(@Nullable Boolean startCloudService) {
            this.startCloudService = Input.ofNullable(startCloudService);
            return this;
        }

        public Builder setUpgradeMode(@Nullable Input<Either<String,CloudServiceUpgradeMode>> upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }

        public Builder setUpgradeMode(@Nullable Either<String,CloudServiceUpgradeMode> upgradeMode) {
            this.upgradeMode = Input.ofNullable(upgradeMode);
            return this;
        }

        public CloudServicePropertiesArgs build() {
            return new CloudServicePropertiesArgs(allowModelOverride, configuration, configurationUrl, extensionProfile, networkProfile, osProfile, packageUrl, roleProfile, startCloudService, upgradeMode);
        }
    }
}
