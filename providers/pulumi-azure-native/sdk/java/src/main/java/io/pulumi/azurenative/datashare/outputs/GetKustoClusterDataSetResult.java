// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetKustoClusterDataSetResult {
    /**
     * Unique id for identifying a data set resource
     * 
     */
    private final String dataSetId;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set.
     * Expected value is 'KustoCluster'.
     * 
     */
    private final String kind;
    /**
     * Resource id of the kusto cluster.
     * 
     */
    private final String kustoClusterResourceId;
    /**
     * Location of the kusto cluster.
     * 
     */
    private final String location;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Provisioning state of the kusto cluster data set.
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

    @OutputCustomType.Constructor({"dataSetId","id","kind","kustoClusterResourceId","location","name","provisioningState","systemData","type"})
    private GetKustoClusterDataSetResult(
        String dataSetId,
        String id,
        String kind,
        String kustoClusterResourceId,
        String location,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        String type) {
        this.dataSetId = Objects.requireNonNull(dataSetId);
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
     * Unique id for identifying a data set resource
     * 
     */
    public String getDataSetId() {
        return this.dataSetId;
    }
    /**
     * The resource id of the azure resource
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of data set.
     * Expected value is 'KustoCluster'.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource id of the kusto cluster.
     * 
     */
    public String getKustoClusterResourceId() {
        return this.kustoClusterResourceId;
    }
    /**
     * Location of the kusto cluster.
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
     * Provisioning state of the kusto cluster data set.
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

    public static Builder builder(GetKustoClusterDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
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

        public Builder(GetKustoClusterDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
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
        public GetKustoClusterDataSetResult build() {
            return new GetKustoClusterDataSetResult(dataSetId, id, kind, kustoClusterResourceId, location, name, provisioningState, systemData, type);
        }
    }
}
