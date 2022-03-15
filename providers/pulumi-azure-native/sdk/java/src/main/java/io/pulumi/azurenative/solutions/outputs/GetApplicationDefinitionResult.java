// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.azurenative.solutions.outputs.ApplicationAuthorizationResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationDefinitionArtifactResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationDeploymentPolicyResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationManagementPolicyResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationNotificationPolicyResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationPackageLockingPolicyDefinitionResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationPolicyResponse;
import io.pulumi.azurenative.solutions.outputs.SkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationDefinitionResult {
    /**
     * The collection of managed application artifacts. The portal will use the files specified as artifacts to construct the user experience of creating a managed application from a managed application definition.
     * 
     */
    private final @Nullable List<ApplicationDefinitionArtifactResponse> artifacts;
    /**
     * The managed application provider authorizations.
     * 
     */
    private final @Nullable List<ApplicationAuthorizationResponse> authorizations;
    /**
     * The createUiDefinition json for the backing template with Microsoft.Solutions/applications resource. It can be a JObject or well-formed JSON string.
     * 
     */
    private final @Nullable Object createUiDefinition;
    /**
     * The managed application deployment policy.
     * 
     */
    private final @Nullable ApplicationDeploymentPolicyResponse deploymentPolicy;
    /**
     * The managed application definition description.
     * 
     */
    private final @Nullable String description;
    /**
     * The managed application definition display name.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Resource ID
     * 
     */
    private final String id;
    /**
     * A value indicating whether the package is enabled or not.
     * 
     */
    private final @Nullable Boolean isEnabled;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * The managed application lock level.
     * 
     */
    private final String lockLevel;
    /**
     * The managed application locking policy.
     * 
     */
    private final @Nullable ApplicationPackageLockingPolicyDefinitionResponse lockingPolicy;
    /**
     * The inline main template json which has resources to be provisioned. It can be a JObject or well-formed JSON string.
     * 
     */
    private final @Nullable Object mainTemplate;
    /**
     * ID of the resource that manages this resource.
     * 
     */
    private final @Nullable String managedBy;
    /**
     * The managed application management policy that determines publisher's access to the managed resource group.
     * 
     */
    private final @Nullable ApplicationManagementPolicyResponse managementPolicy;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The managed application notification policy.
     * 
     */
    private final @Nullable ApplicationNotificationPolicyResponse notificationPolicy;
    /**
     * The managed application definition package file Uri. Use this element
     * 
     */
    private final @Nullable String packageFileUri;
    /**
     * The managed application provider policies.
     * 
     */
    private final @Nullable List<ApplicationPolicyResponse> policies;
    /**
     * The SKU of the resource.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetApplicationDefinitionResult(
        @CustomType.Parameter("artifacts") @Nullable List<ApplicationDefinitionArtifactResponse> artifacts,
        @CustomType.Parameter("authorizations") @Nullable List<ApplicationAuthorizationResponse> authorizations,
        @CustomType.Parameter("createUiDefinition") @Nullable Object createUiDefinition,
        @CustomType.Parameter("deploymentPolicy") @Nullable ApplicationDeploymentPolicyResponse deploymentPolicy,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isEnabled") @Nullable Boolean isEnabled,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("lockLevel") String lockLevel,
        @CustomType.Parameter("lockingPolicy") @Nullable ApplicationPackageLockingPolicyDefinitionResponse lockingPolicy,
        @CustomType.Parameter("mainTemplate") @Nullable Object mainTemplate,
        @CustomType.Parameter("managedBy") @Nullable String managedBy,
        @CustomType.Parameter("managementPolicy") @Nullable ApplicationManagementPolicyResponse managementPolicy,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notificationPolicy") @Nullable ApplicationNotificationPolicyResponse notificationPolicy,
        @CustomType.Parameter("packageFileUri") @Nullable String packageFileUri,
        @CustomType.Parameter("policies") @Nullable List<ApplicationPolicyResponse> policies,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.artifacts = artifacts;
        this.authorizations = authorizations;
        this.createUiDefinition = createUiDefinition;
        this.deploymentPolicy = deploymentPolicy;
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.isEnabled = isEnabled;
        this.location = location;
        this.lockLevel = lockLevel;
        this.lockingPolicy = lockingPolicy;
        this.mainTemplate = mainTemplate;
        this.managedBy = managedBy;
        this.managementPolicy = managementPolicy;
        this.name = name;
        this.notificationPolicy = notificationPolicy;
        this.packageFileUri = packageFileUri;
        this.policies = policies;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The collection of managed application artifacts. The portal will use the files specified as artifacts to construct the user experience of creating a managed application from a managed application definition.
     * 
    */
    public List<ApplicationDefinitionArtifactResponse> getArtifacts() {
        return this.artifacts == null ? List.of() : this.artifacts;
    }
    /**
     * The managed application provider authorizations.
     * 
    */
    public List<ApplicationAuthorizationResponse> getAuthorizations() {
        return this.authorizations == null ? List.of() : this.authorizations;
    }
    /**
     * The createUiDefinition json for the backing template with Microsoft.Solutions/applications resource. It can be a JObject or well-formed JSON string.
     * 
    */
    public Optional<Object> getCreateUiDefinition() {
        return Optional.ofNullable(this.createUiDefinition);
    }
    /**
     * The managed application deployment policy.
     * 
    */
    public Optional<ApplicationDeploymentPolicyResponse> getDeploymentPolicy() {
        return Optional.ofNullable(this.deploymentPolicy);
    }
    /**
     * The managed application definition description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The managed application definition display name.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Resource ID
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A value indicating whether the package is enabled or not.
     * 
    */
    public Optional<Boolean> getIsEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * Resource location
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The managed application lock level.
     * 
    */
    public String getLockLevel() {
        return this.lockLevel;
    }
    /**
     * The managed application locking policy.
     * 
    */
    public Optional<ApplicationPackageLockingPolicyDefinitionResponse> getLockingPolicy() {
        return Optional.ofNullable(this.lockingPolicy);
    }
    /**
     * The inline main template json which has resources to be provisioned. It can be a JObject or well-formed JSON string.
     * 
    */
    public Optional<Object> getMainTemplate() {
        return Optional.ofNullable(this.mainTemplate);
    }
    /**
     * ID of the resource that manages this resource.
     * 
    */
    public Optional<String> getManagedBy() {
        return Optional.ofNullable(this.managedBy);
    }
    /**
     * The managed application management policy that determines publisher's access to the managed resource group.
     * 
    */
    public Optional<ApplicationManagementPolicyResponse> getManagementPolicy() {
        return Optional.ofNullable(this.managementPolicy);
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The managed application notification policy.
     * 
    */
    public Optional<ApplicationNotificationPolicyResponse> getNotificationPolicy() {
        return Optional.ofNullable(this.notificationPolicy);
    }
    /**
     * The managed application definition package file Uri. Use this element
     * 
    */
    public Optional<String> getPackageFileUri() {
        return Optional.ofNullable(this.packageFileUri);
    }
    /**
     * The managed application provider policies.
     * 
    */
    public List<ApplicationPolicyResponse> getPolicies() {
        return this.policies == null ? List.of() : this.policies;
    }
    /**
     * The SKU of the resource.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationDefinitionArtifactResponse> artifacts;
        private @Nullable List<ApplicationAuthorizationResponse> authorizations;
        private @Nullable Object createUiDefinition;
        private @Nullable ApplicationDeploymentPolicyResponse deploymentPolicy;
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private @Nullable Boolean isEnabled;
        private @Nullable String location;
        private String lockLevel;
        private @Nullable ApplicationPackageLockingPolicyDefinitionResponse lockingPolicy;
        private @Nullable Object mainTemplate;
        private @Nullable String managedBy;
        private @Nullable ApplicationManagementPolicyResponse managementPolicy;
        private String name;
        private @Nullable ApplicationNotificationPolicyResponse notificationPolicy;
        private @Nullable String packageFileUri;
        private @Nullable List<ApplicationPolicyResponse> policies;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.authorizations = defaults.authorizations;
    	      this.createUiDefinition = defaults.createUiDefinition;
    	      this.deploymentPolicy = defaults.deploymentPolicy;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.location = defaults.location;
    	      this.lockLevel = defaults.lockLevel;
    	      this.lockingPolicy = defaults.lockingPolicy;
    	      this.mainTemplate = defaults.mainTemplate;
    	      this.managedBy = defaults.managedBy;
    	      this.managementPolicy = defaults.managementPolicy;
    	      this.name = defaults.name;
    	      this.notificationPolicy = defaults.notificationPolicy;
    	      this.packageFileUri = defaults.packageFileUri;
    	      this.policies = defaults.policies;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder artifacts(@Nullable List<ApplicationDefinitionArtifactResponse> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder authorizations(@Nullable List<ApplicationAuthorizationResponse> authorizations) {
            this.authorizations = authorizations;
            return this;
        }

        public Builder createUiDefinition(@Nullable Object createUiDefinition) {
            this.createUiDefinition = createUiDefinition;
            return this;
        }

        public Builder deploymentPolicy(@Nullable ApplicationDeploymentPolicyResponse deploymentPolicy) {
            this.deploymentPolicy = deploymentPolicy;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder lockLevel(String lockLevel) {
            this.lockLevel = Objects.requireNonNull(lockLevel);
            return this;
        }

        public Builder lockingPolicy(@Nullable ApplicationPackageLockingPolicyDefinitionResponse lockingPolicy) {
            this.lockingPolicy = lockingPolicy;
            return this;
        }

        public Builder mainTemplate(@Nullable Object mainTemplate) {
            this.mainTemplate = mainTemplate;
            return this;
        }

        public Builder managedBy(@Nullable String managedBy) {
            this.managedBy = managedBy;
            return this;
        }

        public Builder managementPolicy(@Nullable ApplicationManagementPolicyResponse managementPolicy) {
            this.managementPolicy = managementPolicy;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder notificationPolicy(@Nullable ApplicationNotificationPolicyResponse notificationPolicy) {
            this.notificationPolicy = notificationPolicy;
            return this;
        }

        public Builder packageFileUri(@Nullable String packageFileUri) {
            this.packageFileUri = packageFileUri;
            return this;
        }

        public Builder policies(@Nullable List<ApplicationPolicyResponse> policies) {
            this.policies = policies;
            return this;
        }

        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetApplicationDefinitionResult build() {
            return new GetApplicationDefinitionResult(artifacts, authorizations, createUiDefinition, deploymentPolicy, description, displayName, id, isEnabled, location, lockLevel, lockingPolicy, mainTemplate, managedBy, managementPolicy, name, notificationPolicy, packageFileUri, policies, sku, tags, type);
        }
    }
}
