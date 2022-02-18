// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.AzureSkuResponse;
import io.pulumi.azurenative.synapse.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetkustoPoolResult {
    /**
     * The Kusto Pool data ingestion URI.
     * 
     */
    private final String dataIngestionUri;
    /**
     * The engine type
     * 
     */
    private final @Nullable String engineType;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
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
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The provisioned state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The SKU of the kusto pool.
     * 
     */
    private final AzureSkuResponse sku;
    /**
     * The state of the resource.
     * 
     */
    private final String state;
    /**
     * The reason for the Kusto Pool's current state.
     * 
     */
    private final String stateReason;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
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
     * The Kusto Pool URI.
     * 
     */
    private final String uri;
    /**
     * The workspace unique identifier.
     * 
     */
    private final @Nullable String workspaceUid;

    @OutputCustomType.Constructor({"dataIngestionUri","engineType","etag","id","location","name","provisioningState","sku","state","stateReason","systemData","tags","type","uri","workspaceUid"})
    private GetkustoPoolResult(
        String dataIngestionUri,
        @Nullable String engineType,
        String etag,
        String id,
        String location,
        String name,
        String provisioningState,
        AzureSkuResponse sku,
        String state,
        String stateReason,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type,
        String uri,
        @Nullable String workspaceUid) {
        this.dataIngestionUri = Objects.requireNonNull(dataIngestionUri);
        this.engineType = engineType;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sku = Objects.requireNonNull(sku);
        this.state = Objects.requireNonNull(state);
        this.stateReason = Objects.requireNonNull(stateReason);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.uri = Objects.requireNonNull(uri);
        this.workspaceUid = workspaceUid;
    }

    /**
     * The Kusto Pool data ingestion URI.
     * 
     */
    public String getDataIngestionUri() {
        return this.dataIngestionUri;
    }
    /**
     * The engine type
     * 
     */
    public Optional<String> getEngineType() {
        return Optional.ofNullable(this.engineType);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
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
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioned state of the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU of the kusto pool.
     * 
     */
    public AzureSkuResponse getSku() {
        return this.sku;
    }
    /**
     * The state of the resource.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The reason for the Kusto Pool's current state.
     * 
     */
    public String getStateReason() {
        return this.stateReason;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
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
     * The Kusto Pool URI.
     * 
     */
    public String getUri() {
        return this.uri;
    }
    /**
     * The workspace unique identifier.
     * 
     */
    public Optional<String> getWorkspaceUid() {
        return Optional.ofNullable(this.workspaceUid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetkustoPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataIngestionUri;
        private @Nullable String engineType;
        private String etag;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private AzureSkuResponse sku;
        private String state;
        private String stateReason;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uri;
        private @Nullable String workspaceUid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetkustoPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataIngestionUri = defaults.dataIngestionUri;
    	      this.engineType = defaults.engineType;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.stateReason = defaults.stateReason;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
    	      this.workspaceUid = defaults.workspaceUid;
        }

        public Builder setDataIngestionUri(String dataIngestionUri) {
            this.dataIngestionUri = Objects.requireNonNull(dataIngestionUri);
            return this;
        }

        public Builder setEngineType(@Nullable String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSku(AzureSkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStateReason(String stateReason) {
            this.stateReason = Objects.requireNonNull(stateReason);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setWorkspaceUid(@Nullable String workspaceUid) {
            this.workspaceUid = workspaceUid;
            return this;
        }

        public GetkustoPoolResult build() {
            return new GetkustoPoolResult(dataIngestionUri, engineType, etag, id, location, name, provisioningState, sku, state, stateReason, systemData, tags, type, uri, workspaceUid);
        }
    }
}
