// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetKustoDatabaseDataSetMappingResult {
    /**
     * The id of the source data set.
     * 
     */
    private final String dataSetId;
    /**
     * Gets the status of the data set mapping.
     * 
     */
    private final String dataSetMappingStatus;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set mapping.
     * Expected value is 'KustoDatabase'.
     * 
     */
    private final String kind;
    /**
     * Resource id of the sink kusto cluster.
     * 
     */
    private final String kustoClusterResourceId;
    /**
     * Location of the sink kusto cluster.
     * 
     */
    private final String location;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    private final String provisioningState;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"dataSetId","dataSetMappingStatus","id","kind","kustoClusterResourceId","location","name","provisioningState","systemData","type"})
    private GetKustoDatabaseDataSetMappingResult(
        String dataSetId,
        String dataSetMappingStatus,
        String id,
        String kind,
        String kustoClusterResourceId,
        String location,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        String type) {
        this.dataSetId = Objects.requireNonNull(dataSetId);
        this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.kustoClusterResourceId = Objects.requireNonNull(kustoClusterResourceId);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The id of the source data set.
     * 
     */
    public String getDataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
     */
    public String getDataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * The resource id of the azure resource
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of data set mapping.
     * Expected value is 'KustoDatabase'.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource id of the sink kusto cluster.
     * 
     */
    public String getKustoClusterResourceId() {
        return this.kustoClusterResourceId;
    }
    /**
     * Location of the sink kusto cluster.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Name of the azure resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKustoDatabaseDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String dataSetMappingStatus;
        private String id;
        private String kind;
        private String kustoClusterResourceId;
        private String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKustoDatabaseDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.kustoClusterResourceId = defaults.kustoClusterResourceId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setDataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKustoClusterResourceId(String kustoClusterResourceId) {
            this.kustoClusterResourceId = Objects.requireNonNull(kustoClusterResourceId);
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

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetKustoDatabaseDataSetMappingResult build() {
            return new GetKustoDatabaseDataSetMappingResult(dataSetId, dataSetMappingStatus, id, kind, kustoClusterResourceId, location, name, provisioningState, systemData, type);
        }
    }
}
