// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.azurenative.operationalinsights.outputs.PrivateLinkScopedResourceResponse;
import io.pulumi.azurenative.operationalinsights.outputs.WorkspaceCappingResponse;
import io.pulumi.azurenative.operationalinsights.outputs.WorkspaceFeaturesResponse;
import io.pulumi.azurenative.operationalinsights.outputs.WorkspaceSkuResponse;
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
public final class GetWorkspaceResult {
    /**
     * Workspace creation date.
     * 
     */
    private final String createdDate;
    /**
     * This is a read-only property. Represents the ID associated with the workspace.
     * 
     */
    private final String customerId;
    /**
     * The ETag of the workspace.
     * 
     */
    private final @Nullable String eTag;
    /**
     * Workspace features.
     * 
     */
    private final @Nullable WorkspaceFeaturesResponse features;
    /**
     * Indicates whether customer managed storage is mandatory for query management.
     * 
     */
    private final @Nullable Boolean forceCmkForQuery;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * Workspace modification date.
     * 
     */
    private final String modifiedDate;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * List of linked private link scope resources.
     * 
     */
    private final List<PrivateLinkScopedResourceResponse> privateLinkScopedResources;
    /**
     * The provisioning state of the workspace.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The network access type for accessing Log Analytics ingestion.
     * 
     */
    private final @Nullable String publicNetworkAccessForIngestion;
    /**
     * The network access type for accessing Log Analytics query.
     * 
     */
    private final @Nullable String publicNetworkAccessForQuery;
    /**
     * The workspace data retention in days. Allowed values are per pricing plan. See pricing tiers documentation for details.
     * 
     */
    private final @Nullable Integer retentionInDays;
    /**
     * The SKU of the workspace.
     * 
     */
    private final @Nullable WorkspaceSkuResponse sku;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * The daily volume cap for ingestion.
     * 
     */
    private final @Nullable WorkspaceCappingResponse workspaceCapping;

    @OutputCustomType.Constructor({"createdDate","customerId","eTag","features","forceCmkForQuery","id","location","modifiedDate","name","privateLinkScopedResources","provisioningState","publicNetworkAccessForIngestion","publicNetworkAccessForQuery","retentionInDays","sku","tags","type","workspaceCapping"})
    private GetWorkspaceResult(
        String createdDate,
        String customerId,
        @Nullable String eTag,
        @Nullable WorkspaceFeaturesResponse features,
        @Nullable Boolean forceCmkForQuery,
        String id,
        String location,
        String modifiedDate,
        String name,
        List<PrivateLinkScopedResourceResponse> privateLinkScopedResources,
        @Nullable String provisioningState,
        @Nullable String publicNetworkAccessForIngestion,
        @Nullable String publicNetworkAccessForQuery,
        @Nullable Integer retentionInDays,
        @Nullable WorkspaceSkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable WorkspaceCappingResponse workspaceCapping) {
        this.createdDate = Objects.requireNonNull(createdDate);
        this.customerId = Objects.requireNonNull(customerId);
        this.eTag = eTag;
        this.features = features;
        this.forceCmkForQuery = forceCmkForQuery;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.modifiedDate = Objects.requireNonNull(modifiedDate);
        this.name = Objects.requireNonNull(name);
        this.privateLinkScopedResources = Objects.requireNonNull(privateLinkScopedResources);
        this.provisioningState = provisioningState;
        this.publicNetworkAccessForIngestion = publicNetworkAccessForIngestion;
        this.publicNetworkAccessForQuery = publicNetworkAccessForQuery;
        this.retentionInDays = retentionInDays;
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.workspaceCapping = workspaceCapping;
    }

    /**
     * Workspace creation date.
     * 
     */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * This is a read-only property. Represents the ID associated with the workspace.
     * 
     */
    public String getCustomerId() {
        return this.customerId;
    }
    /**
     * The ETag of the workspace.
     * 
     */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Workspace features.
     * 
     */
    public Optional<WorkspaceFeaturesResponse> getFeatures() {
        return Optional.ofNullable(this.features);
    }
    /**
     * Indicates whether customer managed storage is mandatory for query management.
     * 
     */
    public Optional<Boolean> getForceCmkForQuery() {
        return Optional.ofNullable(this.forceCmkForQuery);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Workspace modification date.
     * 
     */
    public String getModifiedDate() {
        return this.modifiedDate;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * List of linked private link scope resources.
     * 
     */
    public List<PrivateLinkScopedResourceResponse> getPrivateLinkScopedResources() {
        return this.privateLinkScopedResources;
    }
    /**
     * The provisioning state of the workspace.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The network access type for accessing Log Analytics ingestion.
     * 
     */
    public Optional<String> getPublicNetworkAccessForIngestion() {
        return Optional.ofNullable(this.publicNetworkAccessForIngestion);
    }
    /**
     * The network access type for accessing Log Analytics query.
     * 
     */
    public Optional<String> getPublicNetworkAccessForQuery() {
        return Optional.ofNullable(this.publicNetworkAccessForQuery);
    }
    /**
     * The workspace data retention in days. Allowed values are per pricing plan. See pricing tiers documentation for details.
     * 
     */
    public Optional<Integer> getRetentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }
    /**
     * The SKU of the workspace.
     * 
     */
    public Optional<WorkspaceSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The daily volume cap for ingestion.
     * 
     */
    public Optional<WorkspaceCappingResponse> getWorkspaceCapping() {
        return Optional.ofNullable(this.workspaceCapping);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private String customerId;
        private @Nullable String eTag;
        private @Nullable WorkspaceFeaturesResponse features;
        private @Nullable Boolean forceCmkForQuery;
        private String id;
        private String location;
        private String modifiedDate;
        private String name;
        private List<PrivateLinkScopedResourceResponse> privateLinkScopedResources;
        private @Nullable String provisioningState;
        private @Nullable String publicNetworkAccessForIngestion;
        private @Nullable String publicNetworkAccessForQuery;
        private @Nullable Integer retentionInDays;
        private @Nullable WorkspaceSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable WorkspaceCappingResponse workspaceCapping;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.customerId = defaults.customerId;
    	      this.eTag = defaults.eTag;
    	      this.features = defaults.features;
    	      this.forceCmkForQuery = defaults.forceCmkForQuery;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.modifiedDate = defaults.modifiedDate;
    	      this.name = defaults.name;
    	      this.privateLinkScopedResources = defaults.privateLinkScopedResources;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccessForIngestion = defaults.publicNetworkAccessForIngestion;
    	      this.publicNetworkAccessForQuery = defaults.publicNetworkAccessForQuery;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.workspaceCapping = defaults.workspaceCapping;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = Objects.requireNonNull(customerId);
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setFeatures(@Nullable WorkspaceFeaturesResponse features) {
            this.features = features;
            return this;
        }

        public Builder setForceCmkForQuery(@Nullable Boolean forceCmkForQuery) {
            this.forceCmkForQuery = forceCmkForQuery;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setModifiedDate(String modifiedDate) {
            this.modifiedDate = Objects.requireNonNull(modifiedDate);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateLinkScopedResources(List<PrivateLinkScopedResourceResponse> privateLinkScopedResources) {
            this.privateLinkScopedResources = Objects.requireNonNull(privateLinkScopedResources);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setPublicNetworkAccessForIngestion(@Nullable String publicNetworkAccessForIngestion) {
            this.publicNetworkAccessForIngestion = publicNetworkAccessForIngestion;
            return this;
        }

        public Builder setPublicNetworkAccessForQuery(@Nullable String publicNetworkAccessForQuery) {
            this.publicNetworkAccessForQuery = publicNetworkAccessForQuery;
            return this;
        }

        public Builder setRetentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public Builder setSku(@Nullable WorkspaceSkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWorkspaceCapping(@Nullable WorkspaceCappingResponse workspaceCapping) {
            this.workspaceCapping = workspaceCapping;
            return this;
        }
        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(createdDate, customerId, eTag, features, forceCmkForQuery, id, location, modifiedDate, name, privateLinkScopedResources, provisioningState, publicNetworkAccessForIngestion, publicNetworkAccessForQuery, retentionInDays, sku, tags, type, workspaceCapping);
        }
    }
}
