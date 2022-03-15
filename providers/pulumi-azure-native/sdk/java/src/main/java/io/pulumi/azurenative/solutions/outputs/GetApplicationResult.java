// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.azurenative.solutions.outputs.ApplicationArtifactResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationAuthorizationResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationBillingDetailsDefinitionResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationClientDetailsResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationJitAccessPolicyResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationPackageContactResponse;
import io.pulumi.azurenative.solutions.outputs.ApplicationPackageSupportUrlsResponse;
import io.pulumi.azurenative.solutions.outputs.IdentityResponse;
import io.pulumi.azurenative.solutions.outputs.PlanResponse;
import io.pulumi.azurenative.solutions.outputs.SkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationResult {
    /**
     * The fully qualified path of managed application definition Id.
     * 
     */
    private final @Nullable String applicationDefinitionId;
    /**
     * The collection of managed application artifacts.
     * 
     */
    private final List<ApplicationArtifactResponse> artifacts;
    /**
     * The  read-only authorizations property that is retrieved from the application package.
     * 
     */
    private final List<ApplicationAuthorizationResponse> authorizations;
    /**
     * The managed application billing details.
     * 
     */
    private final ApplicationBillingDetailsDefinitionResponse billingDetails;
    /**
     * The client entity that created the JIT request.
     * 
     */
    private final ApplicationClientDetailsResponse createdBy;
    /**
     * The read-only customer support property that is retrieved from the application package.
     * 
     */
    private final ApplicationPackageContactResponse customerSupport;
    /**
     * Resource ID
     * 
     */
    private final String id;
    /**
     * The identity of the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * The managed application Jit access policy.
     * 
     */
    private final @Nullable ApplicationJitAccessPolicyResponse jitAccessPolicy;
    /**
     * The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     * 
     */
    private final String kind;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * ID of the resource that manages this resource.
     * 
     */
    private final @Nullable String managedBy;
    /**
     * The managed resource group Id.
     * 
     */
    private final @Nullable String managedResourceGroupId;
    /**
     * The managed application management mode.
     * 
     */
    private final String managementMode;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Name and value pairs that define the managed application outputs.
     * 
     */
    private final Object outputs;
    /**
     * Name and value pairs that define the managed application parameters. It can be a JObject or a well formed JSON string.
     * 
     */
    private final @Nullable Object parameters;
    /**
     * The plan information.
     * 
     */
    private final @Nullable PlanResponse plan;
    /**
     * The managed application provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The publisher tenant Id.
     * 
     */
    private final String publisherTenantId;
    /**
     * The SKU of the resource.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * The read-only support URLs property that is retrieved from the application package.
     * 
     */
    private final ApplicationPackageSupportUrlsResponse supportUrls;
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
    /**
     * The client entity that last updated the JIT request.
     * 
     */
    private final ApplicationClientDetailsResponse updatedBy;

    @CustomType.Constructor
    private GetApplicationResult(
        @CustomType.Parameter("applicationDefinitionId") @Nullable String applicationDefinitionId,
        @CustomType.Parameter("artifacts") List<ApplicationArtifactResponse> artifacts,
        @CustomType.Parameter("authorizations") List<ApplicationAuthorizationResponse> authorizations,
        @CustomType.Parameter("billingDetails") ApplicationBillingDetailsDefinitionResponse billingDetails,
        @CustomType.Parameter("createdBy") ApplicationClientDetailsResponse createdBy,
        @CustomType.Parameter("customerSupport") ApplicationPackageContactResponse customerSupport,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("jitAccessPolicy") @Nullable ApplicationJitAccessPolicyResponse jitAccessPolicy,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managedBy") @Nullable String managedBy,
        @CustomType.Parameter("managedResourceGroupId") @Nullable String managedResourceGroupId,
        @CustomType.Parameter("managementMode") String managementMode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outputs") Object outputs,
        @CustomType.Parameter("parameters") @Nullable Object parameters,
        @CustomType.Parameter("plan") @Nullable PlanResponse plan,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publisherTenantId") String publisherTenantId,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("supportUrls") ApplicationPackageSupportUrlsResponse supportUrls,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updatedBy") ApplicationClientDetailsResponse updatedBy) {
        this.applicationDefinitionId = applicationDefinitionId;
        this.artifacts = artifacts;
        this.authorizations = authorizations;
        this.billingDetails = billingDetails;
        this.createdBy = createdBy;
        this.customerSupport = customerSupport;
        this.id = id;
        this.identity = identity;
        this.jitAccessPolicy = jitAccessPolicy;
        this.kind = kind;
        this.location = location;
        this.managedBy = managedBy;
        this.managedResourceGroupId = managedResourceGroupId;
        this.managementMode = managementMode;
        this.name = name;
        this.outputs = outputs;
        this.parameters = parameters;
        this.plan = plan;
        this.provisioningState = provisioningState;
        this.publisherTenantId = publisherTenantId;
        this.sku = sku;
        this.supportUrls = supportUrls;
        this.tags = tags;
        this.type = type;
        this.updatedBy = updatedBy;
    }

    /**
     * The fully qualified path of managed application definition Id.
     * 
    */
    public Optional<String> getApplicationDefinitionId() {
        return Optional.ofNullable(this.applicationDefinitionId);
    }
    /**
     * The collection of managed application artifacts.
     * 
    */
    public List<ApplicationArtifactResponse> getArtifacts() {
        return this.artifacts;
    }
    /**
     * The  read-only authorizations property that is retrieved from the application package.
     * 
    */
    public List<ApplicationAuthorizationResponse> getAuthorizations() {
        return this.authorizations;
    }
    /**
     * The managed application billing details.
     * 
    */
    public ApplicationBillingDetailsDefinitionResponse getBillingDetails() {
        return this.billingDetails;
    }
    /**
     * The client entity that created the JIT request.
     * 
    */
    public ApplicationClientDetailsResponse getCreatedBy() {
        return this.createdBy;
    }
    /**
     * The read-only customer support property that is retrieved from the application package.
     * 
    */
    public ApplicationPackageContactResponse getCustomerSupport() {
        return this.customerSupport;
    }
    /**
     * Resource ID
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the resource.
     * 
    */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The managed application Jit access policy.
     * 
    */
    public Optional<ApplicationJitAccessPolicyResponse> getJitAccessPolicy() {
        return Optional.ofNullable(this.jitAccessPolicy);
    }
    /**
     * The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource location
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * ID of the resource that manages this resource.
     * 
    */
    public Optional<String> getManagedBy() {
        return Optional.ofNullable(this.managedBy);
    }
    /**
     * The managed resource group Id.
     * 
    */
    public Optional<String> getManagedResourceGroupId() {
        return Optional.ofNullable(this.managedResourceGroupId);
    }
    /**
     * The managed application management mode.
     * 
    */
    public String getManagementMode() {
        return this.managementMode;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Name and value pairs that define the managed application outputs.
     * 
    */
    public Object getOutputs() {
        return this.outputs;
    }
    /**
     * Name and value pairs that define the managed application parameters. It can be a JObject or a well formed JSON string.
     * 
    */
    public Optional<Object> getParameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * The plan information.
     * 
    */
    public Optional<PlanResponse> getPlan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * The managed application provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The publisher tenant Id.
     * 
    */
    public String getPublisherTenantId() {
        return this.publisherTenantId;
    }
    /**
     * The SKU of the resource.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The read-only support URLs property that is retrieved from the application package.
     * 
    */
    public ApplicationPackageSupportUrlsResponse getSupportUrls() {
        return this.supportUrls;
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
    /**
     * The client entity that last updated the JIT request.
     * 
    */
    public ApplicationClientDetailsResponse getUpdatedBy() {
        return this.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationDefinitionId;
        private List<ApplicationArtifactResponse> artifacts;
        private List<ApplicationAuthorizationResponse> authorizations;
        private ApplicationBillingDetailsDefinitionResponse billingDetails;
        private ApplicationClientDetailsResponse createdBy;
        private ApplicationPackageContactResponse customerSupport;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable ApplicationJitAccessPolicyResponse jitAccessPolicy;
        private String kind;
        private @Nullable String location;
        private @Nullable String managedBy;
        private @Nullable String managedResourceGroupId;
        private String managementMode;
        private String name;
        private Object outputs;
        private @Nullable Object parameters;
        private @Nullable PlanResponse plan;
        private String provisioningState;
        private String publisherTenantId;
        private @Nullable SkuResponse sku;
        private ApplicationPackageSupportUrlsResponse supportUrls;
        private @Nullable Map<String,String> tags;
        private String type;
        private ApplicationClientDetailsResponse updatedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationDefinitionId = defaults.applicationDefinitionId;
    	      this.artifacts = defaults.artifacts;
    	      this.authorizations = defaults.authorizations;
    	      this.billingDetails = defaults.billingDetails;
    	      this.createdBy = defaults.createdBy;
    	      this.customerSupport = defaults.customerSupport;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.jitAccessPolicy = defaults.jitAccessPolicy;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.managedResourceGroupId = defaults.managedResourceGroupId;
    	      this.managementMode = defaults.managementMode;
    	      this.name = defaults.name;
    	      this.outputs = defaults.outputs;
    	      this.parameters = defaults.parameters;
    	      this.plan = defaults.plan;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publisherTenantId = defaults.publisherTenantId;
    	      this.sku = defaults.sku;
    	      this.supportUrls = defaults.supportUrls;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.updatedBy = defaults.updatedBy;
        }

        public Builder applicationDefinitionId(@Nullable String applicationDefinitionId) {
            this.applicationDefinitionId = applicationDefinitionId;
            return this;
        }

        public Builder artifacts(List<ApplicationArtifactResponse> artifacts) {
            this.artifacts = Objects.requireNonNull(artifacts);
            return this;
        }

        public Builder authorizations(List<ApplicationAuthorizationResponse> authorizations) {
            this.authorizations = Objects.requireNonNull(authorizations);
            return this;
        }

        public Builder billingDetails(ApplicationBillingDetailsDefinitionResponse billingDetails) {
            this.billingDetails = Objects.requireNonNull(billingDetails);
            return this;
        }

        public Builder createdBy(ApplicationClientDetailsResponse createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }

        public Builder customerSupport(ApplicationPackageContactResponse customerSupport) {
            this.customerSupport = Objects.requireNonNull(customerSupport);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder jitAccessPolicy(@Nullable ApplicationJitAccessPolicyResponse jitAccessPolicy) {
            this.jitAccessPolicy = jitAccessPolicy;
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder managedBy(@Nullable String managedBy) {
            this.managedBy = managedBy;
            return this;
        }

        public Builder managedResourceGroupId(@Nullable String managedResourceGroupId) {
            this.managedResourceGroupId = managedResourceGroupId;
            return this;
        }

        public Builder managementMode(String managementMode) {
            this.managementMode = Objects.requireNonNull(managementMode);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder outputs(Object outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }

        public Builder parameters(@Nullable Object parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder plan(@Nullable PlanResponse plan) {
            this.plan = plan;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publisherTenantId(String publisherTenantId) {
            this.publisherTenantId = Objects.requireNonNull(publisherTenantId);
            return this;
        }

        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder supportUrls(ApplicationPackageSupportUrlsResponse supportUrls) {
            this.supportUrls = Objects.requireNonNull(supportUrls);
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

        public Builder updatedBy(ApplicationClientDetailsResponse updatedBy) {
            this.updatedBy = Objects.requireNonNull(updatedBy);
            return this;
        }
        public GetApplicationResult build() {
            return new GetApplicationResult(applicationDefinitionId, artifacts, authorizations, billingDetails, createdBy, customerSupport, id, identity, jitAccessPolicy, kind, location, managedBy, managedResourceGroupId, managementMode, name, outputs, parameters, plan, provisioningState, publisherTenantId, sku, supportUrls, tags, type, updatedBy);
        }
    }
}
