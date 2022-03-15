// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.CloudServiceUpgradeMode;
import io.pulumi.azurenative.compute.inputs.CloudServiceExtensionProfileArgs;
import io.pulumi.azurenative.compute.inputs.CloudServiceNetworkProfileArgs;
import io.pulumi.azurenative.compute.inputs.CloudServiceOsProfileArgs;
import io.pulumi.azurenative.compute.inputs.CloudServiceRoleProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="allowModelOverride")
      private final @Nullable Output<Boolean> allowModelOverride;

    public Output<Boolean> getAllowModelOverride() {
        return this.allowModelOverride == null ? Output.empty() : this.allowModelOverride;
    }

    /**
     * Specifies the XML service configuration (.cscfg) for the cloud service.
     * 
     */
    @Import(name="configuration")
      private final @Nullable Output<String> configuration;

    public Output<String> getConfiguration() {
        return this.configuration == null ? Output.empty() : this.configuration;
    }

    /**
     * Specifies a URL that refers to the location of the service configuration in the Blob service. The service package URL  can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     */
    @Import(name="configurationUrl")
      private final @Nullable Output<String> configurationUrl;

    public Output<String> getConfigurationUrl() {
        return this.configurationUrl == null ? Output.empty() : this.configurationUrl;
    }

    /**
     * Describes a cloud service extension profile.
     * 
     */
    @Import(name="extensionProfile")
      private final @Nullable Output<CloudServiceExtensionProfileArgs> extensionProfile;

    public Output<CloudServiceExtensionProfileArgs> getExtensionProfile() {
        return this.extensionProfile == null ? Output.empty() : this.extensionProfile;
    }

    /**
     * Network Profile for the cloud service.
     * 
     */
    @Import(name="networkProfile")
      private final @Nullable Output<CloudServiceNetworkProfileArgs> networkProfile;

    public Output<CloudServiceNetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Output.empty() : this.networkProfile;
    }

    /**
     * Describes the OS profile for the cloud service.
     * 
     */
    @Import(name="osProfile")
      private final @Nullable Output<CloudServiceOsProfileArgs> osProfile;

    public Output<CloudServiceOsProfileArgs> getOsProfile() {
        return this.osProfile == null ? Output.empty() : this.osProfile;
    }

    /**
     * Specifies a URL that refers to the location of the service package in the Blob service. The service package URL can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     */
    @Import(name="packageUrl")
      private final @Nullable Output<String> packageUrl;

    public Output<String> getPackageUrl() {
        return this.packageUrl == null ? Output.empty() : this.packageUrl;
    }

    /**
     * Describes the role profile for the cloud service.
     * 
     */
    @Import(name="roleProfile")
      private final @Nullable Output<CloudServiceRoleProfileArgs> roleProfile;

    public Output<CloudServiceRoleProfileArgs> getRoleProfile() {
        return this.roleProfile == null ? Output.empty() : this.roleProfile;
    }

    /**
     * (Optional) Indicates whether to start the cloud service immediately after it is created. The default value is `true`.
     * If false, the service model is still deployed, but the code is not run immediately. Instead, the service is PoweredOff until you call Start, at which time the service will be started. A deployed service still incurs charges, even if it is poweredoff.
     * 
     */
    @Import(name="startCloudService")
      private final @Nullable Output<Boolean> startCloudService;

    public Output<Boolean> getStartCloudService() {
        return this.startCloudService == null ? Output.empty() : this.startCloudService;
    }

    /**
     * Update mode for the cloud service. Role instances are allocated to update domains when the service is deployed. Updates can be initiated manually in each update domain or initiated automatically in all update domains.
     * Possible Values are <br /><br />**Auto**<br /><br />**Manual** <br /><br />**Simultaneous**<br /><br />
     * If not specified, the default value is Auto. If set to Manual, PUT UpdateDomain must be called to apply the update. If set to Auto, the update is automatically applied to each update domain in sequence.
     * 
     */
    @Import(name="upgradeMode")
      private final @Nullable Output<Either<String,CloudServiceUpgradeMode>> upgradeMode;

    public Output<Either<String,CloudServiceUpgradeMode>> getUpgradeMode() {
        return this.upgradeMode == null ? Output.empty() : this.upgradeMode;
    }

    public CloudServicePropertiesArgs(
        @Nullable Output<Boolean> allowModelOverride,
        @Nullable Output<String> configuration,
        @Nullable Output<String> configurationUrl,
        @Nullable Output<CloudServiceExtensionProfileArgs> extensionProfile,
        @Nullable Output<CloudServiceNetworkProfileArgs> networkProfile,
        @Nullable Output<CloudServiceOsProfileArgs> osProfile,
        @Nullable Output<String> packageUrl,
        @Nullable Output<CloudServiceRoleProfileArgs> roleProfile,
        @Nullable Output<Boolean> startCloudService,
        @Nullable Output<Either<String,CloudServiceUpgradeMode>> upgradeMode) {
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
        this.allowModelOverride = Output.empty();
        this.configuration = Output.empty();
        this.configurationUrl = Output.empty();
        this.extensionProfile = Output.empty();
        this.networkProfile = Output.empty();
        this.osProfile = Output.empty();
        this.packageUrl = Output.empty();
        this.roleProfile = Output.empty();
        this.startCloudService = Output.empty();
        this.upgradeMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowModelOverride;
        private @Nullable Output<String> configuration;
        private @Nullable Output<String> configurationUrl;
        private @Nullable Output<CloudServiceExtensionProfileArgs> extensionProfile;
        private @Nullable Output<CloudServiceNetworkProfileArgs> networkProfile;
        private @Nullable Output<CloudServiceOsProfileArgs> osProfile;
        private @Nullable Output<String> packageUrl;
        private @Nullable Output<CloudServiceRoleProfileArgs> roleProfile;
        private @Nullable Output<Boolean> startCloudService;
        private @Nullable Output<Either<String,CloudServiceUpgradeMode>> upgradeMode;

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

        public Builder allowModelOverride(@Nullable Output<Boolean> allowModelOverride) {
            this.allowModelOverride = allowModelOverride;
            return this;
        }

        public Builder allowModelOverride(@Nullable Boolean allowModelOverride) {
            this.allowModelOverride = Output.ofNullable(allowModelOverride);
            return this;
        }

        public Builder configuration(@Nullable Output<String> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder configuration(@Nullable String configuration) {
            this.configuration = Output.ofNullable(configuration);
            return this;
        }

        public Builder configurationUrl(@Nullable Output<String> configurationUrl) {
            this.configurationUrl = configurationUrl;
            return this;
        }

        public Builder configurationUrl(@Nullable String configurationUrl) {
            this.configurationUrl = Output.ofNullable(configurationUrl);
            return this;
        }

        public Builder extensionProfile(@Nullable Output<CloudServiceExtensionProfileArgs> extensionProfile) {
            this.extensionProfile = extensionProfile;
            return this;
        }

        public Builder extensionProfile(@Nullable CloudServiceExtensionProfileArgs extensionProfile) {
            this.extensionProfile = Output.ofNullable(extensionProfile);
            return this;
        }

        public Builder networkProfile(@Nullable Output<CloudServiceNetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder networkProfile(@Nullable CloudServiceNetworkProfileArgs networkProfile) {
            this.networkProfile = Output.ofNullable(networkProfile);
            return this;
        }

        public Builder osProfile(@Nullable Output<CloudServiceOsProfileArgs> osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder osProfile(@Nullable CloudServiceOsProfileArgs osProfile) {
            this.osProfile = Output.ofNullable(osProfile);
            return this;
        }

        public Builder packageUrl(@Nullable Output<String> packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }

        public Builder packageUrl(@Nullable String packageUrl) {
            this.packageUrl = Output.ofNullable(packageUrl);
            return this;
        }

        public Builder roleProfile(@Nullable Output<CloudServiceRoleProfileArgs> roleProfile) {
            this.roleProfile = roleProfile;
            return this;
        }

        public Builder roleProfile(@Nullable CloudServiceRoleProfileArgs roleProfile) {
            this.roleProfile = Output.ofNullable(roleProfile);
            return this;
        }

        public Builder startCloudService(@Nullable Output<Boolean> startCloudService) {
            this.startCloudService = startCloudService;
            return this;
        }

        public Builder startCloudService(@Nullable Boolean startCloudService) {
            this.startCloudService = Output.ofNullable(startCloudService);
            return this;
        }

        public Builder upgradeMode(@Nullable Output<Either<String,CloudServiceUpgradeMode>> upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }

        public Builder upgradeMode(@Nullable Either<String,CloudServiceUpgradeMode> upgradeMode) {
            this.upgradeMode = Output.ofNullable(upgradeMode);
            return this;
        }
        public CloudServicePropertiesArgs build() {
            return new CloudServicePropertiesArgs(allowModelOverride, configuration, configurationUrl, extensionProfile, networkProfile, osProfile, packageUrl, roleProfile, startCloudService, upgradeMode);
        }
    }
}
