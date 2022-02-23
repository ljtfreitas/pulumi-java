// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.outputs;

import io.pulumi.azurenative.timeseriesinsights.outputs.EnvironmentStatusResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.Gen2StorageConfigurationOutputResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.SkuResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.TimeSeriesIdPropertyResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.WarmStoreConfigurationPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGen2EnvironmentResult {
    /**
     * The time the resource was created.
     * 
     */
    private final String creationTime;
    /**
     * The fully qualified domain name used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    private final String dataAccessFqdn;
    /**
     * An id used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    private final String dataAccessId;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The kind of the environment.
     * Expected value is 'Gen2'.
     * 
     */
    private final String kind;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    private final SkuResponse sku;
    /**
     * An object that represents the status of the environment, and its internal state in the Time Series Insights service.
     * 
     */
    private final EnvironmentStatusResponse status;
    /**
     * The storage configuration provides the connection details that allows the Time Series Insights service to connect to the customer storage account that is used to store the environment's data.
     * 
     */
    private final Gen2StorageConfigurationOutputResponse storageConfiguration;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The list of event properties which will be used to define the environment's time series id.
     * 
     */
    private final List<TimeSeriesIdPropertyResponse> timeSeriesIdProperties;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * The warm store configuration provides the details to create a warm store cache that will retain a copy of the environment's data available for faster query.
     * 
     */
    private final @Nullable WarmStoreConfigurationPropertiesResponse warmStoreConfiguration;

    @OutputCustomType.Constructor({"creationTime","dataAccessFqdn","dataAccessId","id","kind","location","name","provisioningState","sku","status","storageConfiguration","tags","timeSeriesIdProperties","type","warmStoreConfiguration"})
    private GetGen2EnvironmentResult(
        String creationTime,
        String dataAccessFqdn,
        String dataAccessId,
        String id,
        String kind,
        String location,
        String name,
        String provisioningState,
        SkuResponse sku,
        EnvironmentStatusResponse status,
        Gen2StorageConfigurationOutputResponse storageConfiguration,
        @Nullable Map<String,String> tags,
        List<TimeSeriesIdPropertyResponse> timeSeriesIdProperties,
        String type,
        @Nullable WarmStoreConfigurationPropertiesResponse warmStoreConfiguration) {
        this.creationTime = Objects.requireNonNull(creationTime);
        this.dataAccessFqdn = Objects.requireNonNull(dataAccessFqdn);
        this.dataAccessId = Objects.requireNonNull(dataAccessId);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sku = Objects.requireNonNull(sku);
        this.status = Objects.requireNonNull(status);
        this.storageConfiguration = Objects.requireNonNull(storageConfiguration);
        this.tags = tags;
        this.timeSeriesIdProperties = Objects.requireNonNull(timeSeriesIdProperties);
        this.type = Objects.requireNonNull(type);
        this.warmStoreConfiguration = warmStoreConfiguration;
    }

    /**
     * The time the resource was created.
     * 
     */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * The fully qualified domain name used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    public String getDataAccessFqdn() {
        return this.dataAccessFqdn;
    }
    /**
     * An id used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    public String getDataAccessId() {
        return this.dataAccessId;
    }
    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The kind of the environment.
     * Expected value is 'Gen2'.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource location
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * An object that represents the status of the environment, and its internal state in the Time Series Insights service.
     * 
     */
    public EnvironmentStatusResponse getStatus() {
        return this.status;
    }
    /**
     * The storage configuration provides the connection details that allows the Time Series Insights service to connect to the customer storage account that is used to store the environment's data.
     * 
     */
    public Gen2StorageConfigurationOutputResponse getStorageConfiguration() {
        return this.storageConfiguration;
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The list of event properties which will be used to define the environment's time series id.
     * 
     */
    public List<TimeSeriesIdPropertyResponse> getTimeSeriesIdProperties() {
        return this.timeSeriesIdProperties;
    }
    /**
     * Resource type
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The warm store configuration provides the details to create a warm store cache that will retain a copy of the environment's data available for faster query.
     * 
     */
    public Optional<WarmStoreConfigurationPropertiesResponse> getWarmStoreConfiguration() {
        return Optional.ofNullable(this.warmStoreConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGen2EnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private String dataAccessFqdn;
        private String dataAccessId;
        private String id;
        private String kind;
        private String location;
        private String name;
        private String provisioningState;
        private SkuResponse sku;
        private EnvironmentStatusResponse status;
        private Gen2StorageConfigurationOutputResponse storageConfiguration;
        private @Nullable Map<String,String> tags;
        private List<TimeSeriesIdPropertyResponse> timeSeriesIdProperties;
        private String type;
        private @Nullable WarmStoreConfigurationPropertiesResponse warmStoreConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGen2EnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.dataAccessFqdn = defaults.dataAccessFqdn;
    	      this.dataAccessId = defaults.dataAccessId;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.status = defaults.status;
    	      this.storageConfiguration = defaults.storageConfiguration;
    	      this.tags = defaults.tags;
    	      this.timeSeriesIdProperties = defaults.timeSeriesIdProperties;
    	      this.type = defaults.type;
    	      this.warmStoreConfiguration = defaults.warmStoreConfiguration;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setDataAccessFqdn(String dataAccessFqdn) {
            this.dataAccessFqdn = Objects.requireNonNull(dataAccessFqdn);
            return this;
        }

        public Builder setDataAccessId(String dataAccessId) {
            this.dataAccessId = Objects.requireNonNull(dataAccessId);
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

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setStatus(EnvironmentStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStorageConfiguration(Gen2StorageConfigurationOutputResponse storageConfiguration) {
            this.storageConfiguration = Objects.requireNonNull(storageConfiguration);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeSeriesIdProperties(List<TimeSeriesIdPropertyResponse> timeSeriesIdProperties) {
            this.timeSeriesIdProperties = Objects.requireNonNull(timeSeriesIdProperties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWarmStoreConfiguration(@Nullable WarmStoreConfigurationPropertiesResponse warmStoreConfiguration) {
            this.warmStoreConfiguration = warmStoreConfiguration;
            return this;
        }
        public GetGen2EnvironmentResult build() {
            return new GetGen2EnvironmentResult(creationTime, dataAccessFqdn, dataAccessId, id, kind, location, name, provisioningState, sku, status, storageConfiguration, tags, timeSeriesIdProperties, type, warmStoreConfiguration);
        }
    }
}
