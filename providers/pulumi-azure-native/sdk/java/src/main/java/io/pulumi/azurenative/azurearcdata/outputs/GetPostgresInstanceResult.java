// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.outputs;

import io.pulumi.azurenative.azurearcdata.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.azurearcdata.outputs.PostgresInstancePropertiesResponse;
import io.pulumi.azurenative.azurearcdata.outputs.PostgresInstanceSkuResponse;
import io.pulumi.azurenative.azurearcdata.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPostgresInstanceResult {
    /**
     * The extendedLocation of the resource.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
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
     * null
     * 
     */
    private final PostgresInstancePropertiesResponse properties;
    /**
     * Resource sku.
     * 
     */
    private final @Nullable PostgresInstanceSkuResponse sku;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"extendedLocation","id","location","name","properties","sku","systemData","tags","type"})
    private GetPostgresInstanceResult(
        @Nullable ExtendedLocationResponse extendedLocation,
        String id,
        String location,
        String name,
        PostgresInstancePropertiesResponse properties,
        @Nullable PostgresInstanceSkuResponse sku,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.extendedLocation = extendedLocation;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.sku = sku;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The extendedLocation of the resource.
     * 
     */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
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
     * null
     * 
     */
    public PostgresInstancePropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Resource sku.
     * 
     */
    public Optional<PostgresInstanceSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Read only system data
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
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPostgresInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExtendedLocationResponse extendedLocation;
        private String id;
        private String location;
        private String name;
        private PostgresInstancePropertiesResponse properties;
        private @Nullable PostgresInstanceSkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPostgresInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
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

        public Builder setProperties(PostgresInstancePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSku(@Nullable PostgresInstanceSkuResponse sku) {
            this.sku = sku;
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

        public GetPostgresInstanceResult build() {
            return new GetPostgresInstanceResult(extendedLocation, id, location, name, properties, sku, systemData, tags, type);
        }
    }
}
