// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.appservice.inputs.WindowsFunctionAppAuthSettingsArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppBackupArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppConnectionStringArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppIdentityArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSiteConfigArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppStickySettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsFunctionAppArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsFunctionAppArgs Empty = new WindowsFunctionAppArgs();

    /**
     * A map of key-value pairs for [App Settings](https://docs.microsoft.com/en-us/azure/azure-functions/functions-app-settings) and custom values.
     * 
     */
    @Import(name="appSettings")
    private @Nullable Output<Map<String,String>> appSettings;

    /**
     * @return A map of key-value pairs for [App Settings](https://docs.microsoft.com/en-us/azure/azure-functions/functions-app-settings) and custom values.
     * 
     */
    public Optional<Output<Map<String,String>>> appSettings() {
        return Optional.ofNullable(this.appSettings);
    }

    /**
     * A `auth_settings` block as defined below.
     * 
     */
    @Import(name="authSettings")
    private @Nullable Output<WindowsFunctionAppAuthSettingsArgs> authSettings;

    /**
     * @return A `auth_settings` block as defined below.
     * 
     */
    public Optional<Output<WindowsFunctionAppAuthSettingsArgs>> authSettings() {
        return Optional.ofNullable(this.authSettings);
    }

    /**
     * A `backup` block as defined below.
     * 
     */
    @Import(name="backup")
    private @Nullable Output<WindowsFunctionAppBackupArgs> backup;

    /**
     * @return A `backup` block as defined below.
     * 
     */
    public Optional<Output<WindowsFunctionAppBackupArgs>> backup() {
        return Optional.ofNullable(this.backup);
    }

    /**
     * Should built in logging be enabled. Configures `AzureWebJobsDashboard` app setting based on the configured storage setting.
     * 
     */
    @Import(name="builtinLoggingEnabled")
    private @Nullable Output<Boolean> builtinLoggingEnabled;

    /**
     * @return Should built in logging be enabled. Configures `AzureWebJobsDashboard` app setting based on the configured storage setting.
     * 
     */
    public Optional<Output<Boolean>> builtinLoggingEnabled() {
        return Optional.ofNullable(this.builtinLoggingEnabled);
    }

    /**
     * Should the function app use Client Certificates.
     * 
     */
    @Import(name="clientCertificateEnabled")
    private @Nullable Output<Boolean> clientCertificateEnabled;

    /**
     * @return Should the function app use Client Certificates.
     * 
     */
    public Optional<Output<Boolean>> clientCertificateEnabled() {
        return Optional.ofNullable(this.clientCertificateEnabled);
    }

    /**
     * The mode of the Function App&#39;s client certificates requirement for incoming requests. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`.
     * 
     */
    @Import(name="clientCertificateMode")
    private @Nullable Output<String> clientCertificateMode;

    /**
     * @return The mode of the Function App&#39;s client certificates requirement for incoming requests. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`.
     * 
     */
    public Optional<Output<String>> clientCertificateMode() {
        return Optional.ofNullable(this.clientCertificateMode);
    }

    /**
     * One or more `connection_string` blocks as defined below.
     * 
     */
    @Import(name="connectionStrings")
    private @Nullable Output<List<WindowsFunctionAppConnectionStringArgs>> connectionStrings;

    /**
     * @return One or more `connection_string` blocks as defined below.
     * 
     */
    public Optional<Output<List<WindowsFunctionAppConnectionStringArgs>>> connectionStrings() {
        return Optional.ofNullable(this.connectionStrings);
    }

    /**
     * Should Content Share Settings be disabled. Defaults to `false`.
     * 
     */
    @Import(name="contentShareForceDisabled")
    private @Nullable Output<Boolean> contentShareForceDisabled;

    /**
     * @return Should Content Share Settings be disabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> contentShareForceDisabled() {
        return Optional.ofNullable(this.contentShareForceDisabled);
    }

    /**
     * The amount of memory in gigabyte-seconds that your application is allowed to consume per day. Setting this value only affects function apps under the consumption plan. Defaults to `0`.
     * 
     */
    @Import(name="dailyMemoryTimeQuota")
    private @Nullable Output<Integer> dailyMemoryTimeQuota;

    /**
     * @return The amount of memory in gigabyte-seconds that your application is allowed to consume per day. Setting this value only affects function apps under the consumption plan. Defaults to `0`.
     * 
     */
    public Optional<Output<Integer>> dailyMemoryTimeQuota() {
        return Optional.ofNullable(this.dailyMemoryTimeQuota);
    }

    /**
     * Is the Function App enabled?
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is the Function App enabled?
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The runtime version associated with the Function App. Defaults to `~4`.
     * 
     */
    @Import(name="functionsExtensionVersion")
    private @Nullable Output<String> functionsExtensionVersion;

    /**
     * @return The runtime version associated with the Function App. Defaults to `~4`.
     * 
     */
    public Optional<Output<String>> functionsExtensionVersion() {
        return Optional.ofNullable(this.functionsExtensionVersion);
    }

    /**
     * Can the Function App only be accessed via HTTPS? Defaults to `false`.
     * 
     */
    @Import(name="httpsOnly")
    private @Nullable Output<Boolean> httpsOnly;

    /**
     * @return Can the Function App only be accessed via HTTPS? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }

    /**
     * A `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<WindowsFunctionAppIdentityArgs> identity;

    /**
     * @return A `identity` block as defined below.
     * 
     */
    public Optional<Output<WindowsFunctionAppIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/en-us/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
     * 
     */
    @Import(name="keyVaultReferenceIdentityId")
    private @Nullable Output<String> keyVaultReferenceIdentityId;

    /**
     * @return The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/en-us/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
     * 
     */
    public Optional<Output<String>> keyVaultReferenceIdentityId() {
        return Optional.ofNullable(this.keyVaultReferenceIdentityId);
    }

    /**
     * The Azure Region where the Windows Function App should exist. Changing this forces a new Windows Function App to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Windows Function App should exist. Changing this forces a new Windows Function App to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Windows Function App. Changing this forces a new Windows Function App to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Windows Function App. Changing this forces a new Windows Function App to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Windows Function App should exist. Changing this forces a new Windows Function App to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Windows Function App should exist. Changing this forces a new Windows Function App to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The ID of the App Service Plan within which to create this Function App.
     * 
     */
    @Import(name="servicePlanId", required=true)
    private Output<String> servicePlanId;

    /**
     * @return The ID of the App Service Plan within which to create this Function App.
     * 
     */
    public Output<String> servicePlanId() {
        return this.servicePlanId;
    }

    /**
     * A `site_config` block as defined below.
     * 
     */
    @Import(name="siteConfig", required=true)
    private Output<WindowsFunctionAppSiteConfigArgs> siteConfig;

    /**
     * @return A `site_config` block as defined below.
     * 
     */
    public Output<WindowsFunctionAppSiteConfigArgs> siteConfig() {
        return this.siteConfig;
    }

    /**
     * A `sticky_settings` block as defined below.
     * 
     */
    @Import(name="stickySettings")
    private @Nullable Output<WindowsFunctionAppStickySettingsArgs> stickySettings;

    /**
     * @return A `sticky_settings` block as defined below.
     * 
     */
    public Optional<Output<WindowsFunctionAppStickySettingsArgs>> stickySettings() {
        return Optional.ofNullable(this.stickySettings);
    }

    /**
     * The access key which will be used to access the backend storage account for the Function App. Conflicts with `storage_uses_managed_identity`.
     * 
     */
    @Import(name="storageAccountAccessKey")
    private @Nullable Output<String> storageAccountAccessKey;

    /**
     * @return The access key which will be used to access the backend storage account for the Function App. Conflicts with `storage_uses_managed_identity`.
     * 
     */
    public Optional<Output<String>> storageAccountAccessKey() {
        return Optional.ofNullable(this.storageAccountAccessKey);
    }

    /**
     * The backend storage account name which will be used by this Function App.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable Output<String> storageAccountName;

    /**
     * @return The backend storage account name which will be used by this Function App.
     * 
     */
    public Optional<Output<String>> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    /**
     * The Key Vault Secret ID, optionally including version, that contains the Connection String to connect to the storage account for this Function App.
     * 
     */
    @Import(name="storageKeyVaultSecretId")
    private @Nullable Output<String> storageKeyVaultSecretId;

    /**
     * @return The Key Vault Secret ID, optionally including version, that contains the Connection String to connect to the storage account for this Function App.
     * 
     */
    public Optional<Output<String>> storageKeyVaultSecretId() {
        return Optional.ofNullable(this.storageKeyVaultSecretId);
    }

    /**
     * Should the Function App use Managed Identity to access the storage account. Conflicts with `storage_account_access_key`.
     * 
     */
    @Import(name="storageUsesManagedIdentity")
    private @Nullable Output<Boolean> storageUsesManagedIdentity;

    /**
     * @return Should the Function App use Managed Identity to access the storage account. Conflicts with `storage_account_access_key`.
     * 
     */
    public Optional<Output<Boolean>> storageUsesManagedIdentity() {
        return Optional.ofNullable(this.storageUsesManagedIdentity);
    }

    /**
     * A mapping of tags which should be assigned to the Windows Function App.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Windows Function App.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private WindowsFunctionAppArgs() {}

    private WindowsFunctionAppArgs(WindowsFunctionAppArgs $) {
        this.appSettings = $.appSettings;
        this.authSettings = $.authSettings;
        this.backup = $.backup;
        this.builtinLoggingEnabled = $.builtinLoggingEnabled;
        this.clientCertificateEnabled = $.clientCertificateEnabled;
        this.clientCertificateMode = $.clientCertificateMode;
        this.connectionStrings = $.connectionStrings;
        this.contentShareForceDisabled = $.contentShareForceDisabled;
        this.dailyMemoryTimeQuota = $.dailyMemoryTimeQuota;
        this.enabled = $.enabled;
        this.functionsExtensionVersion = $.functionsExtensionVersion;
        this.httpsOnly = $.httpsOnly;
        this.identity = $.identity;
        this.keyVaultReferenceIdentityId = $.keyVaultReferenceIdentityId;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.servicePlanId = $.servicePlanId;
        this.siteConfig = $.siteConfig;
        this.stickySettings = $.stickySettings;
        this.storageAccountAccessKey = $.storageAccountAccessKey;
        this.storageAccountName = $.storageAccountName;
        this.storageKeyVaultSecretId = $.storageKeyVaultSecretId;
        this.storageUsesManagedIdentity = $.storageUsesManagedIdentity;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsFunctionAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsFunctionAppArgs $;

        public Builder() {
            $ = new WindowsFunctionAppArgs();
        }

        public Builder(WindowsFunctionAppArgs defaults) {
            $ = new WindowsFunctionAppArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appSettings A map of key-value pairs for [App Settings](https://docs.microsoft.com/en-us/azure/azure-functions/functions-app-settings) and custom values.
         * 
         * @return builder
         * 
         */
        public Builder appSettings(@Nullable Output<Map<String,String>> appSettings) {
            $.appSettings = appSettings;
            return this;
        }

        /**
         * @param appSettings A map of key-value pairs for [App Settings](https://docs.microsoft.com/en-us/azure/azure-functions/functions-app-settings) and custom values.
         * 
         * @return builder
         * 
         */
        public Builder appSettings(Map<String,String> appSettings) {
            return appSettings(Output.of(appSettings));
        }

        /**
         * @param authSettings A `auth_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder authSettings(@Nullable Output<WindowsFunctionAppAuthSettingsArgs> authSettings) {
            $.authSettings = authSettings;
            return this;
        }

        /**
         * @param authSettings A `auth_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder authSettings(WindowsFunctionAppAuthSettingsArgs authSettings) {
            return authSettings(Output.of(authSettings));
        }

        /**
         * @param backup A `backup` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder backup(@Nullable Output<WindowsFunctionAppBackupArgs> backup) {
            $.backup = backup;
            return this;
        }

        /**
         * @param backup A `backup` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder backup(WindowsFunctionAppBackupArgs backup) {
            return backup(Output.of(backup));
        }

        /**
         * @param builtinLoggingEnabled Should built in logging be enabled. Configures `AzureWebJobsDashboard` app setting based on the configured storage setting.
         * 
         * @return builder
         * 
         */
        public Builder builtinLoggingEnabled(@Nullable Output<Boolean> builtinLoggingEnabled) {
            $.builtinLoggingEnabled = builtinLoggingEnabled;
            return this;
        }

        /**
         * @param builtinLoggingEnabled Should built in logging be enabled. Configures `AzureWebJobsDashboard` app setting based on the configured storage setting.
         * 
         * @return builder
         * 
         */
        public Builder builtinLoggingEnabled(Boolean builtinLoggingEnabled) {
            return builtinLoggingEnabled(Output.of(builtinLoggingEnabled));
        }

        /**
         * @param clientCertificateEnabled Should the function app use Client Certificates.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateEnabled(@Nullable Output<Boolean> clientCertificateEnabled) {
            $.clientCertificateEnabled = clientCertificateEnabled;
            return this;
        }

        /**
         * @param clientCertificateEnabled Should the function app use Client Certificates.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateEnabled(Boolean clientCertificateEnabled) {
            return clientCertificateEnabled(Output.of(clientCertificateEnabled));
        }

        /**
         * @param clientCertificateMode The mode of the Function App&#39;s client certificates requirement for incoming requests. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateMode(@Nullable Output<String> clientCertificateMode) {
            $.clientCertificateMode = clientCertificateMode;
            return this;
        }

        /**
         * @param clientCertificateMode The mode of the Function App&#39;s client certificates requirement for incoming requests. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateMode(String clientCertificateMode) {
            return clientCertificateMode(Output.of(clientCertificateMode));
        }

        /**
         * @param connectionStrings One or more `connection_string` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(@Nullable Output<List<WindowsFunctionAppConnectionStringArgs>> connectionStrings) {
            $.connectionStrings = connectionStrings;
            return this;
        }

        /**
         * @param connectionStrings One or more `connection_string` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(List<WindowsFunctionAppConnectionStringArgs> connectionStrings) {
            return connectionStrings(Output.of(connectionStrings));
        }

        /**
         * @param connectionStrings One or more `connection_string` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(WindowsFunctionAppConnectionStringArgs... connectionStrings) {
            return connectionStrings(List.of(connectionStrings));
        }

        /**
         * @param contentShareForceDisabled Should Content Share Settings be disabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder contentShareForceDisabled(@Nullable Output<Boolean> contentShareForceDisabled) {
            $.contentShareForceDisabled = contentShareForceDisabled;
            return this;
        }

        /**
         * @param contentShareForceDisabled Should Content Share Settings be disabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder contentShareForceDisabled(Boolean contentShareForceDisabled) {
            return contentShareForceDisabled(Output.of(contentShareForceDisabled));
        }

        /**
         * @param dailyMemoryTimeQuota The amount of memory in gigabyte-seconds that your application is allowed to consume per day. Setting this value only affects function apps under the consumption plan. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder dailyMemoryTimeQuota(@Nullable Output<Integer> dailyMemoryTimeQuota) {
            $.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
            return this;
        }

        /**
         * @param dailyMemoryTimeQuota The amount of memory in gigabyte-seconds that your application is allowed to consume per day. Setting this value only affects function apps under the consumption plan. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder dailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
            return dailyMemoryTimeQuota(Output.of(dailyMemoryTimeQuota));
        }

        /**
         * @param enabled Is the Function App enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the Function App enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param functionsExtensionVersion The runtime version associated with the Function App. Defaults to `~4`.
         * 
         * @return builder
         * 
         */
        public Builder functionsExtensionVersion(@Nullable Output<String> functionsExtensionVersion) {
            $.functionsExtensionVersion = functionsExtensionVersion;
            return this;
        }

        /**
         * @param functionsExtensionVersion The runtime version associated with the Function App. Defaults to `~4`.
         * 
         * @return builder
         * 
         */
        public Builder functionsExtensionVersion(String functionsExtensionVersion) {
            return functionsExtensionVersion(Output.of(functionsExtensionVersion));
        }

        /**
         * @param httpsOnly Can the Function App only be accessed via HTTPS? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            $.httpsOnly = httpsOnly;
            return this;
        }

        /**
         * @param httpsOnly Can the Function App only be accessed via HTTPS? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(Boolean httpsOnly) {
            return httpsOnly(Output.of(httpsOnly));
        }

        /**
         * @param identity A `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<WindowsFunctionAppIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity A `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(WindowsFunctionAppIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param keyVaultReferenceIdentityId The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/en-us/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
         * 
         * @return builder
         * 
         */
        public Builder keyVaultReferenceIdentityId(@Nullable Output<String> keyVaultReferenceIdentityId) {
            $.keyVaultReferenceIdentityId = keyVaultReferenceIdentityId;
            return this;
        }

        /**
         * @param keyVaultReferenceIdentityId The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/en-us/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
         * 
         * @return builder
         * 
         */
        public Builder keyVaultReferenceIdentityId(String keyVaultReferenceIdentityId) {
            return keyVaultReferenceIdentityId(Output.of(keyVaultReferenceIdentityId));
        }

        /**
         * @param location The Azure Region where the Windows Function App should exist. Changing this forces a new Windows Function App to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Windows Function App should exist. Changing this forces a new Windows Function App to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Windows Function App. Changing this forces a new Windows Function App to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Windows Function App. Changing this forces a new Windows Function App to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Windows Function App should exist. Changing this forces a new Windows Function App to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Windows Function App should exist. Changing this forces a new Windows Function App to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param servicePlanId The ID of the App Service Plan within which to create this Function App.
         * 
         * @return builder
         * 
         */
        public Builder servicePlanId(Output<String> servicePlanId) {
            $.servicePlanId = servicePlanId;
            return this;
        }

        /**
         * @param servicePlanId The ID of the App Service Plan within which to create this Function App.
         * 
         * @return builder
         * 
         */
        public Builder servicePlanId(String servicePlanId) {
            return servicePlanId(Output.of(servicePlanId));
        }

        /**
         * @param siteConfig A `site_config` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder siteConfig(Output<WindowsFunctionAppSiteConfigArgs> siteConfig) {
            $.siteConfig = siteConfig;
            return this;
        }

        /**
         * @param siteConfig A `site_config` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder siteConfig(WindowsFunctionAppSiteConfigArgs siteConfig) {
            return siteConfig(Output.of(siteConfig));
        }

        /**
         * @param stickySettings A `sticky_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder stickySettings(@Nullable Output<WindowsFunctionAppStickySettingsArgs> stickySettings) {
            $.stickySettings = stickySettings;
            return this;
        }

        /**
         * @param stickySettings A `sticky_settings` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder stickySettings(WindowsFunctionAppStickySettingsArgs stickySettings) {
            return stickySettings(Output.of(stickySettings));
        }

        /**
         * @param storageAccountAccessKey The access key which will be used to access the backend storage account for the Function App. Conflicts with `storage_uses_managed_identity`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountAccessKey(@Nullable Output<String> storageAccountAccessKey) {
            $.storageAccountAccessKey = storageAccountAccessKey;
            return this;
        }

        /**
         * @param storageAccountAccessKey The access key which will be used to access the backend storage account for the Function App. Conflicts with `storage_uses_managed_identity`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountAccessKey(String storageAccountAccessKey) {
            return storageAccountAccessKey(Output.of(storageAccountAccessKey));
        }

        /**
         * @param storageAccountName The backend storage account name which will be used by this Function App.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName The backend storage account name which will be used by this Function App.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        /**
         * @param storageKeyVaultSecretId The Key Vault Secret ID, optionally including version, that contains the Connection String to connect to the storage account for this Function App.
         * 
         * @return builder
         * 
         */
        public Builder storageKeyVaultSecretId(@Nullable Output<String> storageKeyVaultSecretId) {
            $.storageKeyVaultSecretId = storageKeyVaultSecretId;
            return this;
        }

        /**
         * @param storageKeyVaultSecretId The Key Vault Secret ID, optionally including version, that contains the Connection String to connect to the storage account for this Function App.
         * 
         * @return builder
         * 
         */
        public Builder storageKeyVaultSecretId(String storageKeyVaultSecretId) {
            return storageKeyVaultSecretId(Output.of(storageKeyVaultSecretId));
        }

        /**
         * @param storageUsesManagedIdentity Should the Function App use Managed Identity to access the storage account. Conflicts with `storage_account_access_key`.
         * 
         * @return builder
         * 
         */
        public Builder storageUsesManagedIdentity(@Nullable Output<Boolean> storageUsesManagedIdentity) {
            $.storageUsesManagedIdentity = storageUsesManagedIdentity;
            return this;
        }

        /**
         * @param storageUsesManagedIdentity Should the Function App use Managed Identity to access the storage account. Conflicts with `storage_account_access_key`.
         * 
         * @return builder
         * 
         */
        public Builder storageUsesManagedIdentity(Boolean storageUsesManagedIdentity) {
            return storageUsesManagedIdentity(Output.of(storageUsesManagedIdentity));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Windows Function App.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Windows Function App.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public WindowsFunctionAppArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.servicePlanId = Objects.requireNonNull($.servicePlanId, "expected parameter 'servicePlanId' to be non-null");
            $.siteConfig = Objects.requireNonNull($.siteConfig, "expected parameter 'siteConfig' to be non-null");
            return $;
        }
    }

}
