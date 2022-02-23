// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.ManagedInstanceLicenseType;
import io.pulumi.azurenative.sql.enums.ManagedInstanceProxyOverride;
import io.pulumi.azurenative.sql.enums.ManagedServerCreateMode;
import io.pulumi.azurenative.sql.enums.StorageAccountType;
import io.pulumi.azurenative.sql.inputs.ManagedInstanceExternalAdministratorArgs;
import io.pulumi.azurenative.sql.inputs.ResourceIdentityArgs;
import io.pulumi.azurenative.sql.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceArgs Empty = new ManagedInstanceArgs();

    /**
     * Administrator username for the managed instance. Can only be specified when the managed instance is being created (and is required for creation).
     * 
     */
    @InputImport(name="administratorLogin")
        private final @Nullable Input<String> administratorLogin;

    public Input<String> getAdministratorLogin() {
        return this.administratorLogin == null ? Input.empty() : this.administratorLogin;
    }

    /**
     * The administrator login password (required for managed instance creation).
     * 
     */
    @InputImport(name="administratorLoginPassword")
        private final @Nullable Input<String> administratorLoginPassword;

    public Input<String> getAdministratorLoginPassword() {
        return this.administratorLoginPassword == null ? Input.empty() : this.administratorLoginPassword;
    }

    /**
     * The Azure Active Directory administrator of the server.
     * 
     */
    @InputImport(name="administrators")
        private final @Nullable Input<ManagedInstanceExternalAdministratorArgs> administrators;

    public Input<ManagedInstanceExternalAdministratorArgs> getAdministrators() {
        return this.administrators == null ? Input.empty() : this.administrators;
    }

    /**
     * Collation of the managed instance.
     * 
     */
    @InputImport(name="collation")
        private final @Nullable Input<String> collation;

    public Input<String> getCollation() {
        return this.collation == null ? Input.empty() : this.collation;
    }

    /**
     * The resource id of another managed instance whose DNS zone this managed instance will share after creation.
     * 
     */
    @InputImport(name="dnsZonePartner")
        private final @Nullable Input<String> dnsZonePartner;

    public Input<String> getDnsZonePartner() {
        return this.dnsZonePartner == null ? Input.empty() : this.dnsZonePartner;
    }

    /**
     * The Azure Active Directory identity of the managed instance.
     * 
     */
    @InputImport(name="identity")
        private final @Nullable Input<ResourceIdentityArgs> identity;

    public Input<ResourceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The Id of the instance pool this managed server belongs to.
     * 
     */
    @InputImport(name="instancePoolId")
        private final @Nullable Input<String> instancePoolId;

    public Input<String> getInstancePoolId() {
        return this.instancePoolId == null ? Input.empty() : this.instancePoolId;
    }

    /**
     * A CMK URI of the key to use for encryption.
     * 
     */
    @InputImport(name="keyId")
        private final @Nullable Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId == null ? Input.empty() : this.keyId;
    }

    /**
     * The license type. Possible values are 'LicenseIncluded' (regular price inclusive of a new SQL license) and 'BasePrice' (discounted AHB price for bringing your own SQL licenses).
     * 
     */
    @InputImport(name="licenseType")
        private final @Nullable Input<Either<String,ManagedInstanceLicenseType>> licenseType;

    public Input<Either<String,ManagedInstanceLicenseType>> getLicenseType() {
        return this.licenseType == null ? Input.empty() : this.licenseType;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Specifies maintenance configuration id to apply to this managed instance.
     * 
     */
    @InputImport(name="maintenanceConfigurationId")
        private final @Nullable Input<String> maintenanceConfigurationId;

    public Input<String> getMaintenanceConfigurationId() {
        return this.maintenanceConfigurationId == null ? Input.empty() : this.maintenanceConfigurationId;
    }

    /**
     * Specifies the mode of database creation.
     * 
     * Default: Regular instance creation.
     * 
     * Restore: Creates an instance by restoring a set of backups to specific point in time. RestorePointInTime and SourceManagedInstanceId must be specified.
     * 
     */
    @InputImport(name="managedInstanceCreateMode")
        private final @Nullable Input<Either<String,ManagedServerCreateMode>> managedInstanceCreateMode;

    public Input<Either<String,ManagedServerCreateMode>> getManagedInstanceCreateMode() {
        return this.managedInstanceCreateMode == null ? Input.empty() : this.managedInstanceCreateMode;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @InputImport(name="managedInstanceName")
        private final @Nullable Input<String> managedInstanceName;

    public Input<String> getManagedInstanceName() {
        return this.managedInstanceName == null ? Input.empty() : this.managedInstanceName;
    }

    /**
     * Minimal TLS version. Allowed values: 'None', '1.0', '1.1', '1.2'
     * 
     */
    @InputImport(name="minimalTlsVersion")
        private final @Nullable Input<String> minimalTlsVersion;

    public Input<String> getMinimalTlsVersion() {
        return this.minimalTlsVersion == null ? Input.empty() : this.minimalTlsVersion;
    }

    /**
     * The resource id of a user assigned identity to be used by default.
     * 
     */
    @InputImport(name="primaryUserAssignedIdentityId")
        private final @Nullable Input<String> primaryUserAssignedIdentityId;

    public Input<String> getPrimaryUserAssignedIdentityId() {
        return this.primaryUserAssignedIdentityId == null ? Input.empty() : this.primaryUserAssignedIdentityId;
    }

    /**
     * Connection type used for connecting to the instance.
     * 
     */
    @InputImport(name="proxyOverride")
        private final @Nullable Input<Either<String,ManagedInstanceProxyOverride>> proxyOverride;

    public Input<Either<String,ManagedInstanceProxyOverride>> getProxyOverride() {
        return this.proxyOverride == null ? Input.empty() : this.proxyOverride;
    }

    /**
     * Whether or not the public data endpoint is enabled.
     * 
     */
    @InputImport(name="publicDataEndpointEnabled")
        private final @Nullable Input<Boolean> publicDataEndpointEnabled;

    public Input<Boolean> getPublicDataEndpointEnabled() {
        return this.publicDataEndpointEnabled == null ? Input.empty() : this.publicDataEndpointEnabled;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database.
     * 
     */
    @InputImport(name="restorePointInTime")
        private final @Nullable Input<String> restorePointInTime;

    public Input<String> getRestorePointInTime() {
        return this.restorePointInTime == null ? Input.empty() : this.restorePointInTime;
    }

    /**
     * Managed instance SKU. Allowed values for sku.name: GP_Gen4, GP_Gen5, BC_Gen4, BC_Gen5
     * 
     */
    @InputImport(name="sku")
        private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * The resource identifier of the source managed instance associated with create operation of this instance.
     * 
     */
    @InputImport(name="sourceManagedInstanceId")
        private final @Nullable Input<String> sourceManagedInstanceId;

    public Input<String> getSourceManagedInstanceId() {
        return this.sourceManagedInstanceId == null ? Input.empty() : this.sourceManagedInstanceId;
    }

    /**
     * The storage account type used to store backups for this instance. The options are LRS (LocallyRedundantStorage), ZRS (ZoneRedundantStorage) and GRS (GeoRedundantStorage)
     * 
     */
    @InputImport(name="storageAccountType")
        private final @Nullable Input<Either<String,StorageAccountType>> storageAccountType;

    public Input<Either<String,StorageAccountType>> getStorageAccountType() {
        return this.storageAccountType == null ? Input.empty() : this.storageAccountType;
    }

    /**
     * Storage size in GB. Minimum value: 32. Maximum value: 8192. Increments of 32 GB allowed only.
     * 
     */
    @InputImport(name="storageSizeInGB")
        private final @Nullable Input<Integer> storageSizeInGB;

    public Input<Integer> getStorageSizeInGB() {
        return this.storageSizeInGB == null ? Input.empty() : this.storageSizeInGB;
    }

    /**
     * Subnet resource ID for the managed instance.
     * 
     */
    @InputImport(name="subnetId")
        private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Id of the timezone. Allowed values are timezones supported by Windows.
     * Windows keeps details on supported timezones, including the id, in registry under
     * KEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Time Zones.
     * You can get those registry values via SQL Server by querying SELECT name AS timezone_id FROM sys.time_zone_info.
     * List of Ids can also be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
     * An example of valid timezone id is "Pacific Standard Time" or "W. Europe Standard Time".
     * 
     */
    @InputImport(name="timezoneId")
        private final @Nullable Input<String> timezoneId;

    public Input<String> getTimezoneId() {
        return this.timezoneId == null ? Input.empty() : this.timezoneId;
    }

    /**
     * The number of vCores. Allowed values: 8, 16, 24, 32, 40, 64, 80.
     * 
     */
    @InputImport(name="vCores")
        private final @Nullable Input<Integer> vCores;

    public Input<Integer> getVCores() {
        return this.vCores == null ? Input.empty() : this.vCores;
    }

    /**
     * Whether or not the multi-az is enabled.
     * 
     */
    @InputImport(name="zoneRedundant")
        private final @Nullable Input<Boolean> zoneRedundant;

    public Input<Boolean> getZoneRedundant() {
        return this.zoneRedundant == null ? Input.empty() : this.zoneRedundant;
    }

    public ManagedInstanceArgs(
        @Nullable Input<String> administratorLogin,
        @Nullable Input<String> administratorLoginPassword,
        @Nullable Input<ManagedInstanceExternalAdministratorArgs> administrators,
        @Nullable Input<String> collation,
        @Nullable Input<String> dnsZonePartner,
        @Nullable Input<ResourceIdentityArgs> identity,
        @Nullable Input<String> instancePoolId,
        @Nullable Input<String> keyId,
        @Nullable Input<Either<String,ManagedInstanceLicenseType>> licenseType,
        @Nullable Input<String> location,
        @Nullable Input<String> maintenanceConfigurationId,
        @Nullable Input<Either<String,ManagedServerCreateMode>> managedInstanceCreateMode,
        @Nullable Input<String> managedInstanceName,
        @Nullable Input<String> minimalTlsVersion,
        @Nullable Input<String> primaryUserAssignedIdentityId,
        @Nullable Input<Either<String,ManagedInstanceProxyOverride>> proxyOverride,
        @Nullable Input<Boolean> publicDataEndpointEnabled,
        Input<String> resourceGroupName,
        @Nullable Input<String> restorePointInTime,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<String> sourceManagedInstanceId,
        @Nullable Input<Either<String,StorageAccountType>> storageAccountType,
        @Nullable Input<Integer> storageSizeInGB,
        @Nullable Input<String> subnetId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> timezoneId,
        @Nullable Input<Integer> vCores,
        @Nullable Input<Boolean> zoneRedundant) {
        this.administratorLogin = administratorLogin;
        this.administratorLoginPassword = administratorLoginPassword;
        this.administrators = administrators;
        this.collation = collation;
        this.dnsZonePartner = dnsZonePartner;
        this.identity = identity;
        this.instancePoolId = instancePoolId;
        this.keyId = keyId;
        this.licenseType = licenseType;
        this.location = location;
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        this.managedInstanceCreateMode = managedInstanceCreateMode;
        this.managedInstanceName = managedInstanceName;
        this.minimalTlsVersion = minimalTlsVersion;
        this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
        this.proxyOverride = proxyOverride;
        this.publicDataEndpointEnabled = publicDataEndpointEnabled;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorePointInTime = restorePointInTime;
        this.sku = sku;
        this.sourceManagedInstanceId = sourceManagedInstanceId;
        this.storageAccountType = storageAccountType;
        this.storageSizeInGB = storageSizeInGB;
        this.subnetId = subnetId;
        this.tags = tags;
        this.timezoneId = timezoneId;
        this.vCores = vCores;
        this.zoneRedundant = zoneRedundant;
    }

    private ManagedInstanceArgs() {
        this.administratorLogin = Input.empty();
        this.administratorLoginPassword = Input.empty();
        this.administrators = Input.empty();
        this.collation = Input.empty();
        this.dnsZonePartner = Input.empty();
        this.identity = Input.empty();
        this.instancePoolId = Input.empty();
        this.keyId = Input.empty();
        this.licenseType = Input.empty();
        this.location = Input.empty();
        this.maintenanceConfigurationId = Input.empty();
        this.managedInstanceCreateMode = Input.empty();
        this.managedInstanceName = Input.empty();
        this.minimalTlsVersion = Input.empty();
        this.primaryUserAssignedIdentityId = Input.empty();
        this.proxyOverride = Input.empty();
        this.publicDataEndpointEnabled = Input.empty();
        this.resourceGroupName = Input.empty();
        this.restorePointInTime = Input.empty();
        this.sku = Input.empty();
        this.sourceManagedInstanceId = Input.empty();
        this.storageAccountType = Input.empty();
        this.storageSizeInGB = Input.empty();
        this.subnetId = Input.empty();
        this.tags = Input.empty();
        this.timezoneId = Input.empty();
        this.vCores = Input.empty();
        this.zoneRedundant = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> administratorLogin;
        private @Nullable Input<String> administratorLoginPassword;
        private @Nullable Input<ManagedInstanceExternalAdministratorArgs> administrators;
        private @Nullable Input<String> collation;
        private @Nullable Input<String> dnsZonePartner;
        private @Nullable Input<ResourceIdentityArgs> identity;
        private @Nullable Input<String> instancePoolId;
        private @Nullable Input<String> keyId;
        private @Nullable Input<Either<String,ManagedInstanceLicenseType>> licenseType;
        private @Nullable Input<String> location;
        private @Nullable Input<String> maintenanceConfigurationId;
        private @Nullable Input<Either<String,ManagedServerCreateMode>> managedInstanceCreateMode;
        private @Nullable Input<String> managedInstanceName;
        private @Nullable Input<String> minimalTlsVersion;
        private @Nullable Input<String> primaryUserAssignedIdentityId;
        private @Nullable Input<Either<String,ManagedInstanceProxyOverride>> proxyOverride;
        private @Nullable Input<Boolean> publicDataEndpointEnabled;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> restorePointInTime;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<String> sourceManagedInstanceId;
        private @Nullable Input<Either<String,StorageAccountType>> storageAccountType;
        private @Nullable Input<Integer> storageSizeInGB;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> timezoneId;
        private @Nullable Input<Integer> vCores;
        private @Nullable Input<Boolean> zoneRedundant;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.administratorLoginPassword = defaults.administratorLoginPassword;
    	      this.administrators = defaults.administrators;
    	      this.collation = defaults.collation;
    	      this.dnsZonePartner = defaults.dnsZonePartner;
    	      this.identity = defaults.identity;
    	      this.instancePoolId = defaults.instancePoolId;
    	      this.keyId = defaults.keyId;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.maintenanceConfigurationId = defaults.maintenanceConfigurationId;
    	      this.managedInstanceCreateMode = defaults.managedInstanceCreateMode;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.minimalTlsVersion = defaults.minimalTlsVersion;
    	      this.primaryUserAssignedIdentityId = defaults.primaryUserAssignedIdentityId;
    	      this.proxyOverride = defaults.proxyOverride;
    	      this.publicDataEndpointEnabled = defaults.publicDataEndpointEnabled;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorePointInTime = defaults.restorePointInTime;
    	      this.sku = defaults.sku;
    	      this.sourceManagedInstanceId = defaults.sourceManagedInstanceId;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.storageSizeInGB = defaults.storageSizeInGB;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.timezoneId = defaults.timezoneId;
    	      this.vCores = defaults.vCores;
    	      this.zoneRedundant = defaults.zoneRedundant;
        }

        public Builder setAdministratorLogin(@Nullable Input<String> administratorLogin) {
            this.administratorLogin = administratorLogin;
            return this;
        }

        public Builder setAdministratorLogin(@Nullable String administratorLogin) {
            this.administratorLogin = Input.ofNullable(administratorLogin);
            return this;
        }

        public Builder setAdministratorLoginPassword(@Nullable Input<String> administratorLoginPassword) {
            this.administratorLoginPassword = administratorLoginPassword;
            return this;
        }

        public Builder setAdministratorLoginPassword(@Nullable String administratorLoginPassword) {
            this.administratorLoginPassword = Input.ofNullable(administratorLoginPassword);
            return this;
        }

        public Builder setAdministrators(@Nullable Input<ManagedInstanceExternalAdministratorArgs> administrators) {
            this.administrators = administrators;
            return this;
        }

        public Builder setAdministrators(@Nullable ManagedInstanceExternalAdministratorArgs administrators) {
            this.administrators = Input.ofNullable(administrators);
            return this;
        }

        public Builder setCollation(@Nullable Input<String> collation) {
            this.collation = collation;
            return this;
        }

        public Builder setCollation(@Nullable String collation) {
            this.collation = Input.ofNullable(collation);
            return this;
        }

        public Builder setDnsZonePartner(@Nullable Input<String> dnsZonePartner) {
            this.dnsZonePartner = dnsZonePartner;
            return this;
        }

        public Builder setDnsZonePartner(@Nullable String dnsZonePartner) {
            this.dnsZonePartner = Input.ofNullable(dnsZonePartner);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setInstancePoolId(@Nullable Input<String> instancePoolId) {
            this.instancePoolId = instancePoolId;
            return this;
        }

        public Builder setInstancePoolId(@Nullable String instancePoolId) {
            this.instancePoolId = Input.ofNullable(instancePoolId);
            return this;
        }

        public Builder setKeyId(@Nullable Input<String> keyId) {
            this.keyId = keyId;
            return this;
        }

        public Builder setKeyId(@Nullable String keyId) {
            this.keyId = Input.ofNullable(keyId);
            return this;
        }

        public Builder setLicenseType(@Nullable Input<Either<String,ManagedInstanceLicenseType>> licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLicenseType(@Nullable Either<String,ManagedInstanceLicenseType> licenseType) {
            this.licenseType = Input.ofNullable(licenseType);
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

        public Builder setMaintenanceConfigurationId(@Nullable Input<String> maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }

        public Builder setMaintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = Input.ofNullable(maintenanceConfigurationId);
            return this;
        }

        public Builder setManagedInstanceCreateMode(@Nullable Input<Either<String,ManagedServerCreateMode>> managedInstanceCreateMode) {
            this.managedInstanceCreateMode = managedInstanceCreateMode;
            return this;
        }

        public Builder setManagedInstanceCreateMode(@Nullable Either<String,ManagedServerCreateMode> managedInstanceCreateMode) {
            this.managedInstanceCreateMode = Input.ofNullable(managedInstanceCreateMode);
            return this;
        }

        public Builder setManagedInstanceName(@Nullable Input<String> managedInstanceName) {
            this.managedInstanceName = managedInstanceName;
            return this;
        }

        public Builder setManagedInstanceName(@Nullable String managedInstanceName) {
            this.managedInstanceName = Input.ofNullable(managedInstanceName);
            return this;
        }

        public Builder setMinimalTlsVersion(@Nullable Input<String> minimalTlsVersion) {
            this.minimalTlsVersion = minimalTlsVersion;
            return this;
        }

        public Builder setMinimalTlsVersion(@Nullable String minimalTlsVersion) {
            this.minimalTlsVersion = Input.ofNullable(minimalTlsVersion);
            return this;
        }

        public Builder setPrimaryUserAssignedIdentityId(@Nullable Input<String> primaryUserAssignedIdentityId) {
            this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            return this;
        }

        public Builder setPrimaryUserAssignedIdentityId(@Nullable String primaryUserAssignedIdentityId) {
            this.primaryUserAssignedIdentityId = Input.ofNullable(primaryUserAssignedIdentityId);
            return this;
        }

        public Builder setProxyOverride(@Nullable Input<Either<String,ManagedInstanceProxyOverride>> proxyOverride) {
            this.proxyOverride = proxyOverride;
            return this;
        }

        public Builder setProxyOverride(@Nullable Either<String,ManagedInstanceProxyOverride> proxyOverride) {
            this.proxyOverride = Input.ofNullable(proxyOverride);
            return this;
        }

        public Builder setPublicDataEndpointEnabled(@Nullable Input<Boolean> publicDataEndpointEnabled) {
            this.publicDataEndpointEnabled = publicDataEndpointEnabled;
            return this;
        }

        public Builder setPublicDataEndpointEnabled(@Nullable Boolean publicDataEndpointEnabled) {
            this.publicDataEndpointEnabled = Input.ofNullable(publicDataEndpointEnabled);
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

        public Builder setRestorePointInTime(@Nullable Input<String> restorePointInTime) {
            this.restorePointInTime = restorePointInTime;
            return this;
        }

        public Builder setRestorePointInTime(@Nullable String restorePointInTime) {
            this.restorePointInTime = Input.ofNullable(restorePointInTime);
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

        public Builder setSourceManagedInstanceId(@Nullable Input<String> sourceManagedInstanceId) {
            this.sourceManagedInstanceId = sourceManagedInstanceId;
            return this;
        }

        public Builder setSourceManagedInstanceId(@Nullable String sourceManagedInstanceId) {
            this.sourceManagedInstanceId = Input.ofNullable(sourceManagedInstanceId);
            return this;
        }

        public Builder setStorageAccountType(@Nullable Input<Either<String,StorageAccountType>> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder setStorageAccountType(@Nullable Either<String,StorageAccountType> storageAccountType) {
            this.storageAccountType = Input.ofNullable(storageAccountType);
            return this;
        }

        public Builder setStorageSizeInGB(@Nullable Input<Integer> storageSizeInGB) {
            this.storageSizeInGB = storageSizeInGB;
            return this;
        }

        public Builder setStorageSizeInGB(@Nullable Integer storageSizeInGB) {
            this.storageSizeInGB = Input.ofNullable(storageSizeInGB);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
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

        public Builder setTimezoneId(@Nullable Input<String> timezoneId) {
            this.timezoneId = timezoneId;
            return this;
        }

        public Builder setTimezoneId(@Nullable String timezoneId) {
            this.timezoneId = Input.ofNullable(timezoneId);
            return this;
        }

        public Builder setVCores(@Nullable Input<Integer> vCores) {
            this.vCores = vCores;
            return this;
        }

        public Builder setVCores(@Nullable Integer vCores) {
            this.vCores = Input.ofNullable(vCores);
            return this;
        }

        public Builder setZoneRedundant(@Nullable Input<Boolean> zoneRedundant) {
            this.zoneRedundant = zoneRedundant;
            return this;
        }

        public Builder setZoneRedundant(@Nullable Boolean zoneRedundant) {
            this.zoneRedundant = Input.ofNullable(zoneRedundant);
            return this;
        }
        public ManagedInstanceArgs build() {
            return new ManagedInstanceArgs(administratorLogin, administratorLoginPassword, administrators, collation, dnsZonePartner, identity, instancePoolId, keyId, licenseType, location, maintenanceConfigurationId, managedInstanceCreateMode, managedInstanceName, minimalTlsVersion, primaryUserAssignedIdentityId, proxyOverride, publicDataEndpointEnabled, resourceGroupName, restorePointInTime, sku, sourceManagedInstanceId, storageAccountType, storageSizeInGB, subnetId, tags, timezoneId, vCores, zoneRedundant);
        }
    }
}
