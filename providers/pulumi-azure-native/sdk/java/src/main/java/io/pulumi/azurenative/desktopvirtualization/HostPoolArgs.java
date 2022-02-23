// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.desktopvirtualization.enums.HostPoolType;
import io.pulumi.azurenative.desktopvirtualization.enums.LoadBalancerType;
import io.pulumi.azurenative.desktopvirtualization.enums.PersonalDesktopAssignmentType;
import io.pulumi.azurenative.desktopvirtualization.enums.PreferredAppGroupType;
import io.pulumi.azurenative.desktopvirtualization.enums.SSOSecretType;
import io.pulumi.azurenative.desktopvirtualization.inputs.MigrationRequestPropertiesArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.RegistrationInfoArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetIdentityArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetPlanArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetSkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostPoolArgs Empty = new HostPoolArgs();

    /**
     * Custom rdp property of HostPool.
     * 
     */
    @InputImport(name="customRdpProperty")
        private final @Nullable Input<String> customRdpProperty;

    public Input<String> getCustomRdpProperty() {
        return this.customRdpProperty == null ? Input.empty() : this.customRdpProperty;
    }

    /**
     * Description of HostPool.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Friendly name of HostPool.
     * 
     */
    @InputImport(name="friendlyName")
        private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * The name of the host pool within the specified resource group
     * 
     */
    @InputImport(name="hostPoolName")
        private final @Nullable Input<String> hostPoolName;

    public Input<String> getHostPoolName() {
        return this.hostPoolName == null ? Input.empty() : this.hostPoolName;
    }

    /**
     * HostPool type for desktop.
     * 
     */
    @InputImport(name="hostPoolType", required=true)
        private final Input<Either<String,HostPoolType>> hostPoolType;

    public Input<Either<String,HostPoolType>> getHostPoolType() {
        return this.hostPoolType;
    }

    @InputImport(name="identity")
        private final @Nullable Input<ResourceModelWithAllowedPropertySetIdentityArgs> identity;

    public Input<ResourceModelWithAllowedPropertySetIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The type of the load balancer.
     * 
     */
    @InputImport(name="loadBalancerType", required=true)
        private final Input<Either<String,LoadBalancerType>> loadBalancerType;

    public Input<Either<String,LoadBalancerType>> getLoadBalancerType() {
        return this.loadBalancerType;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    @InputImport(name="managedBy")
        private final @Nullable Input<String> managedBy;

    public Input<String> getManagedBy() {
        return this.managedBy == null ? Input.empty() : this.managedBy;
    }

    /**
     * The max session limit of HostPool.
     * 
     */
    @InputImport(name="maxSessionLimit")
        private final @Nullable Input<Integer> maxSessionLimit;

    public Input<Integer> getMaxSessionLimit() {
        return this.maxSessionLimit == null ? Input.empty() : this.maxSessionLimit;
    }

    /**
     * The registration info of HostPool.
     * 
     */
    @InputImport(name="migrationRequest")
        private final @Nullable Input<MigrationRequestPropertiesArgs> migrationRequest;

    public Input<MigrationRequestPropertiesArgs> getMigrationRequest() {
        return this.migrationRequest == null ? Input.empty() : this.migrationRequest;
    }

    /**
     * PersonalDesktopAssignment type for HostPool.
     * 
     */
    @InputImport(name="personalDesktopAssignmentType")
        private final @Nullable Input<Either<String,PersonalDesktopAssignmentType>> personalDesktopAssignmentType;

    public Input<Either<String,PersonalDesktopAssignmentType>> getPersonalDesktopAssignmentType() {
        return this.personalDesktopAssignmentType == null ? Input.empty() : this.personalDesktopAssignmentType;
    }

    @InputImport(name="plan")
        private final @Nullable Input<ResourceModelWithAllowedPropertySetPlanArgs> plan;

    public Input<ResourceModelWithAllowedPropertySetPlanArgs> getPlan() {
        return this.plan == null ? Input.empty() : this.plan;
    }

    /**
     * The type of preferred application group type, default to Desktop Application Group
     * 
     */
    @InputImport(name="preferredAppGroupType", required=true)
        private final Input<Either<String,PreferredAppGroupType>> preferredAppGroupType;

    public Input<Either<String,PreferredAppGroupType>> getPreferredAppGroupType() {
        return this.preferredAppGroupType;
    }

    /**
     * The registration info of HostPool.
     * 
     */
    @InputImport(name="registrationInfo")
        private final @Nullable Input<RegistrationInfoArgs> registrationInfo;

    public Input<RegistrationInfoArgs> getRegistrationInfo() {
        return this.registrationInfo == null ? Input.empty() : this.registrationInfo;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The ring number of HostPool.
     * 
     */
    @InputImport(name="ring")
        private final @Nullable Input<Integer> ring;

    public Input<Integer> getRing() {
        return this.ring == null ? Input.empty() : this.ring;
    }

    @InputImport(name="sku")
        private final @Nullable Input<ResourceModelWithAllowedPropertySetSkuArgs> sku;

    public Input<ResourceModelWithAllowedPropertySetSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * ClientId for the registered Relying Party used to issue WVD SSO certificates.
     * 
     */
    @InputImport(name="ssoClientId")
        private final @Nullable Input<String> ssoClientId;

    public Input<String> getSsoClientId() {
        return this.ssoClientId == null ? Input.empty() : this.ssoClientId;
    }

    /**
     * Path to Azure KeyVault storing the secret used for communication to ADFS.
     * 
     */
    @InputImport(name="ssoClientSecretKeyVaultPath")
        private final @Nullable Input<String> ssoClientSecretKeyVaultPath;

    public Input<String> getSsoClientSecretKeyVaultPath() {
        return this.ssoClientSecretKeyVaultPath == null ? Input.empty() : this.ssoClientSecretKeyVaultPath;
    }

    /**
     * The type of single sign on Secret Type.
     * 
     */
    @InputImport(name="ssoSecretType")
        private final @Nullable Input<Either<String,SSOSecretType>> ssoSecretType;

    public Input<Either<String,SSOSecretType>> getSsoSecretType() {
        return this.ssoSecretType == null ? Input.empty() : this.ssoSecretType;
    }

    /**
     * URL to customer ADFS server for signing WVD SSO certificates.
     * 
     */
    @InputImport(name="ssoadfsAuthority")
        private final @Nullable Input<String> ssoadfsAuthority;

    public Input<String> getSsoadfsAuthority() {
        return this.ssoadfsAuthority == null ? Input.empty() : this.ssoadfsAuthority;
    }

    /**
     * The flag to turn on/off StartVMOnConnect feature.
     * 
     */
    @InputImport(name="startVMOnConnect")
        private final @Nullable Input<Boolean> startVMOnConnect;

    public Input<Boolean> getStartVMOnConnect() {
        return this.startVMOnConnect == null ? Input.empty() : this.startVMOnConnect;
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
     * Is validation environment.
     * 
     */
    @InputImport(name="validationEnvironment")
        private final @Nullable Input<Boolean> validationEnvironment;

    public Input<Boolean> getValidationEnvironment() {
        return this.validationEnvironment == null ? Input.empty() : this.validationEnvironment;
    }

    /**
     * VM template for sessionhosts configuration within hostpool.
     * 
     */
    @InputImport(name="vmTemplate")
        private final @Nullable Input<String> vmTemplate;

    public Input<String> getVmTemplate() {
        return this.vmTemplate == null ? Input.empty() : this.vmTemplate;
    }

    public HostPoolArgs(
        @Nullable Input<String> customRdpProperty,
        @Nullable Input<String> description,
        @Nullable Input<String> friendlyName,
        @Nullable Input<String> hostPoolName,
        Input<Either<String,HostPoolType>> hostPoolType,
        @Nullable Input<ResourceModelWithAllowedPropertySetIdentityArgs> identity,
        @Nullable Input<String> kind,
        Input<Either<String,LoadBalancerType>> loadBalancerType,
        @Nullable Input<String> location,
        @Nullable Input<String> managedBy,
        @Nullable Input<Integer> maxSessionLimit,
        @Nullable Input<MigrationRequestPropertiesArgs> migrationRequest,
        @Nullable Input<Either<String,PersonalDesktopAssignmentType>> personalDesktopAssignmentType,
        @Nullable Input<ResourceModelWithAllowedPropertySetPlanArgs> plan,
        Input<Either<String,PreferredAppGroupType>> preferredAppGroupType,
        @Nullable Input<RegistrationInfoArgs> registrationInfo,
        Input<String> resourceGroupName,
        @Nullable Input<Integer> ring,
        @Nullable Input<ResourceModelWithAllowedPropertySetSkuArgs> sku,
        @Nullable Input<String> ssoClientId,
        @Nullable Input<String> ssoClientSecretKeyVaultPath,
        @Nullable Input<Either<String,SSOSecretType>> ssoSecretType,
        @Nullable Input<String> ssoadfsAuthority,
        @Nullable Input<Boolean> startVMOnConnect,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Boolean> validationEnvironment,
        @Nullable Input<String> vmTemplate) {
        this.customRdpProperty = customRdpProperty;
        this.description = description;
        this.friendlyName = friendlyName;
        this.hostPoolName = hostPoolName;
        this.hostPoolType = Objects.requireNonNull(hostPoolType, "expected parameter 'hostPoolType' to be non-null");
        this.identity = identity;
        this.kind = kind;
        this.loadBalancerType = Objects.requireNonNull(loadBalancerType, "expected parameter 'loadBalancerType' to be non-null");
        this.location = location;
        this.managedBy = managedBy;
        this.maxSessionLimit = maxSessionLimit;
        this.migrationRequest = migrationRequest;
        this.personalDesktopAssignmentType = personalDesktopAssignmentType;
        this.plan = plan;
        this.preferredAppGroupType = Objects.requireNonNull(preferredAppGroupType, "expected parameter 'preferredAppGroupType' to be non-null");
        this.registrationInfo = registrationInfo;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ring = ring;
        this.sku = sku;
        this.ssoClientId = ssoClientId;
        this.ssoClientSecretKeyVaultPath = ssoClientSecretKeyVaultPath;
        this.ssoSecretType = ssoSecretType;
        this.ssoadfsAuthority = ssoadfsAuthority;
        this.startVMOnConnect = startVMOnConnect;
        this.tags = tags;
        this.validationEnvironment = validationEnvironment;
        this.vmTemplate = vmTemplate;
    }

    private HostPoolArgs() {
        this.customRdpProperty = Input.empty();
        this.description = Input.empty();
        this.friendlyName = Input.empty();
        this.hostPoolName = Input.empty();
        this.hostPoolType = Input.empty();
        this.identity = Input.empty();
        this.kind = Input.empty();
        this.loadBalancerType = Input.empty();
        this.location = Input.empty();
        this.managedBy = Input.empty();
        this.maxSessionLimit = Input.empty();
        this.migrationRequest = Input.empty();
        this.personalDesktopAssignmentType = Input.empty();
        this.plan = Input.empty();
        this.preferredAppGroupType = Input.empty();
        this.registrationInfo = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ring = Input.empty();
        this.sku = Input.empty();
        this.ssoClientId = Input.empty();
        this.ssoClientSecretKeyVaultPath = Input.empty();
        this.ssoSecretType = Input.empty();
        this.ssoadfsAuthority = Input.empty();
        this.startVMOnConnect = Input.empty();
        this.tags = Input.empty();
        this.validationEnvironment = Input.empty();
        this.vmTemplate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customRdpProperty;
        private @Nullable Input<String> description;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<String> hostPoolName;
        private Input<Either<String,HostPoolType>> hostPoolType;
        private @Nullable Input<ResourceModelWithAllowedPropertySetIdentityArgs> identity;
        private @Nullable Input<String> kind;
        private Input<Either<String,LoadBalancerType>> loadBalancerType;
        private @Nullable Input<String> location;
        private @Nullable Input<String> managedBy;
        private @Nullable Input<Integer> maxSessionLimit;
        private @Nullable Input<MigrationRequestPropertiesArgs> migrationRequest;
        private @Nullable Input<Either<String,PersonalDesktopAssignmentType>> personalDesktopAssignmentType;
        private @Nullable Input<ResourceModelWithAllowedPropertySetPlanArgs> plan;
        private Input<Either<String,PreferredAppGroupType>> preferredAppGroupType;
        private @Nullable Input<RegistrationInfoArgs> registrationInfo;
        private Input<String> resourceGroupName;
        private @Nullable Input<Integer> ring;
        private @Nullable Input<ResourceModelWithAllowedPropertySetSkuArgs> sku;
        private @Nullable Input<String> ssoClientId;
        private @Nullable Input<String> ssoClientSecretKeyVaultPath;
        private @Nullable Input<Either<String,SSOSecretType>> ssoSecretType;
        private @Nullable Input<String> ssoadfsAuthority;
        private @Nullable Input<Boolean> startVMOnConnect;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Boolean> validationEnvironment;
        private @Nullable Input<String> vmTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(HostPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRdpProperty = defaults.customRdpProperty;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.hostPoolName = defaults.hostPoolName;
    	      this.hostPoolType = defaults.hostPoolType;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.loadBalancerType = defaults.loadBalancerType;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.maxSessionLimit = defaults.maxSessionLimit;
    	      this.migrationRequest = defaults.migrationRequest;
    	      this.personalDesktopAssignmentType = defaults.personalDesktopAssignmentType;
    	      this.plan = defaults.plan;
    	      this.preferredAppGroupType = defaults.preferredAppGroupType;
    	      this.registrationInfo = defaults.registrationInfo;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ring = defaults.ring;
    	      this.sku = defaults.sku;
    	      this.ssoClientId = defaults.ssoClientId;
    	      this.ssoClientSecretKeyVaultPath = defaults.ssoClientSecretKeyVaultPath;
    	      this.ssoSecretType = defaults.ssoSecretType;
    	      this.ssoadfsAuthority = defaults.ssoadfsAuthority;
    	      this.startVMOnConnect = defaults.startVMOnConnect;
    	      this.tags = defaults.tags;
    	      this.validationEnvironment = defaults.validationEnvironment;
    	      this.vmTemplate = defaults.vmTemplate;
        }

        public Builder setCustomRdpProperty(@Nullable Input<String> customRdpProperty) {
            this.customRdpProperty = customRdpProperty;
            return this;
        }

        public Builder setCustomRdpProperty(@Nullable String customRdpProperty) {
            this.customRdpProperty = Input.ofNullable(customRdpProperty);
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

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setHostPoolName(@Nullable Input<String> hostPoolName) {
            this.hostPoolName = hostPoolName;
            return this;
        }

        public Builder setHostPoolName(@Nullable String hostPoolName) {
            this.hostPoolName = Input.ofNullable(hostPoolName);
            return this;
        }

        public Builder setHostPoolType(Input<Either<String,HostPoolType>> hostPoolType) {
            this.hostPoolType = Objects.requireNonNull(hostPoolType);
            return this;
        }

        public Builder setHostPoolType(Either<String,HostPoolType> hostPoolType) {
            this.hostPoolType = Input.of(Objects.requireNonNull(hostPoolType));
            return this;
        }

        public Builder setIdentity(@Nullable Input<ResourceModelWithAllowedPropertySetIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ResourceModelWithAllowedPropertySetIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLoadBalancerType(Input<Either<String,LoadBalancerType>> loadBalancerType) {
            this.loadBalancerType = Objects.requireNonNull(loadBalancerType);
            return this;
        }

        public Builder setLoadBalancerType(Either<String,LoadBalancerType> loadBalancerType) {
            this.loadBalancerType = Input.of(Objects.requireNonNull(loadBalancerType));
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

        public Builder setManagedBy(@Nullable Input<String> managedBy) {
            this.managedBy = managedBy;
            return this;
        }

        public Builder setManagedBy(@Nullable String managedBy) {
            this.managedBy = Input.ofNullable(managedBy);
            return this;
        }

        public Builder setMaxSessionLimit(@Nullable Input<Integer> maxSessionLimit) {
            this.maxSessionLimit = maxSessionLimit;
            return this;
        }

        public Builder setMaxSessionLimit(@Nullable Integer maxSessionLimit) {
            this.maxSessionLimit = Input.ofNullable(maxSessionLimit);
            return this;
        }

        public Builder setMigrationRequest(@Nullable Input<MigrationRequestPropertiesArgs> migrationRequest) {
            this.migrationRequest = migrationRequest;
            return this;
        }

        public Builder setMigrationRequest(@Nullable MigrationRequestPropertiesArgs migrationRequest) {
            this.migrationRequest = Input.ofNullable(migrationRequest);
            return this;
        }

        public Builder setPersonalDesktopAssignmentType(@Nullable Input<Either<String,PersonalDesktopAssignmentType>> personalDesktopAssignmentType) {
            this.personalDesktopAssignmentType = personalDesktopAssignmentType;
            return this;
        }

        public Builder setPersonalDesktopAssignmentType(@Nullable Either<String,PersonalDesktopAssignmentType> personalDesktopAssignmentType) {
            this.personalDesktopAssignmentType = Input.ofNullable(personalDesktopAssignmentType);
            return this;
        }

        public Builder setPlan(@Nullable Input<ResourceModelWithAllowedPropertySetPlanArgs> plan) {
            this.plan = plan;
            return this;
        }

        public Builder setPlan(@Nullable ResourceModelWithAllowedPropertySetPlanArgs plan) {
            this.plan = Input.ofNullable(plan);
            return this;
        }

        public Builder setPreferredAppGroupType(Input<Either<String,PreferredAppGroupType>> preferredAppGroupType) {
            this.preferredAppGroupType = Objects.requireNonNull(preferredAppGroupType);
            return this;
        }

        public Builder setPreferredAppGroupType(Either<String,PreferredAppGroupType> preferredAppGroupType) {
            this.preferredAppGroupType = Input.of(Objects.requireNonNull(preferredAppGroupType));
            return this;
        }

        public Builder setRegistrationInfo(@Nullable Input<RegistrationInfoArgs> registrationInfo) {
            this.registrationInfo = registrationInfo;
            return this;
        }

        public Builder setRegistrationInfo(@Nullable RegistrationInfoArgs registrationInfo) {
            this.registrationInfo = Input.ofNullable(registrationInfo);
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

        public Builder setRing(@Nullable Input<Integer> ring) {
            this.ring = ring;
            return this;
        }

        public Builder setRing(@Nullable Integer ring) {
            this.ring = Input.ofNullable(ring);
            return this;
        }

        public Builder setSku(@Nullable Input<ResourceModelWithAllowedPropertySetSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable ResourceModelWithAllowedPropertySetSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setSsoClientId(@Nullable Input<String> ssoClientId) {
            this.ssoClientId = ssoClientId;
            return this;
        }

        public Builder setSsoClientId(@Nullable String ssoClientId) {
            this.ssoClientId = Input.ofNullable(ssoClientId);
            return this;
        }

        public Builder setSsoClientSecretKeyVaultPath(@Nullable Input<String> ssoClientSecretKeyVaultPath) {
            this.ssoClientSecretKeyVaultPath = ssoClientSecretKeyVaultPath;
            return this;
        }

        public Builder setSsoClientSecretKeyVaultPath(@Nullable String ssoClientSecretKeyVaultPath) {
            this.ssoClientSecretKeyVaultPath = Input.ofNullable(ssoClientSecretKeyVaultPath);
            return this;
        }

        public Builder setSsoSecretType(@Nullable Input<Either<String,SSOSecretType>> ssoSecretType) {
            this.ssoSecretType = ssoSecretType;
            return this;
        }

        public Builder setSsoSecretType(@Nullable Either<String,SSOSecretType> ssoSecretType) {
            this.ssoSecretType = Input.ofNullable(ssoSecretType);
            return this;
        }

        public Builder setSsoadfsAuthority(@Nullable Input<String> ssoadfsAuthority) {
            this.ssoadfsAuthority = ssoadfsAuthority;
            return this;
        }

        public Builder setSsoadfsAuthority(@Nullable String ssoadfsAuthority) {
            this.ssoadfsAuthority = Input.ofNullable(ssoadfsAuthority);
            return this;
        }

        public Builder setStartVMOnConnect(@Nullable Input<Boolean> startVMOnConnect) {
            this.startVMOnConnect = startVMOnConnect;
            return this;
        }

        public Builder setStartVMOnConnect(@Nullable Boolean startVMOnConnect) {
            this.startVMOnConnect = Input.ofNullable(startVMOnConnect);
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

        public Builder setValidationEnvironment(@Nullable Input<Boolean> validationEnvironment) {
            this.validationEnvironment = validationEnvironment;
            return this;
        }

        public Builder setValidationEnvironment(@Nullable Boolean validationEnvironment) {
            this.validationEnvironment = Input.ofNullable(validationEnvironment);
            return this;
        }

        public Builder setVmTemplate(@Nullable Input<String> vmTemplate) {
            this.vmTemplate = vmTemplate;
            return this;
        }

        public Builder setVmTemplate(@Nullable String vmTemplate) {
            this.vmTemplate = Input.ofNullable(vmTemplate);
            return this;
        }
        public HostPoolArgs build() {
            return new HostPoolArgs(customRdpProperty, description, friendlyName, hostPoolName, hostPoolType, identity, kind, loadBalancerType, location, managedBy, maxSessionLimit, migrationRequest, personalDesktopAssignmentType, plan, preferredAppGroupType, registrationInfo, resourceGroupName, ring, sku, ssoClientId, ssoClientSecretKeyVaultPath, ssoSecretType, ssoadfsAuthority, startVMOnConnect, tags, validationEnvironment, vmTemplate);
        }
    }
}
