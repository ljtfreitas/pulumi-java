// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.timeseriesinsights.inputs.Gen2StorageConfigurationInputArgs;
import io.pulumi.azurenative.timeseriesinsights.inputs.SkuArgs;
import io.pulumi.azurenative.timeseriesinsights.inputs.TimeSeriesIdPropertyArgs;
import io.pulumi.azurenative.timeseriesinsights.inputs.WarmStoreConfigurationPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Gen2EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final Gen2EnvironmentArgs Empty = new Gen2EnvironmentArgs();

    /**
     * Name of the environment
     * 
     */
    @InputImport(name="environmentName")
    private final @Nullable Input<String> environmentName;

    public Input<String> getEnvironmentName() {
        return this.environmentName == null ? Input.empty() : this.environmentName;
    }

    /**
     * The kind of the environment.
     * Expected value is 'Gen2'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    @InputImport(name="sku", required=true)
    private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * The storage configuration provides the connection details that allows the Time Series Insights service to connect to the customer storage account that is used to store the environment's data.
     * 
     */
    @InputImport(name="storageConfiguration", required=true)
    private final Input<Gen2StorageConfigurationInputArgs> storageConfiguration;

    public Input<Gen2StorageConfigurationInputArgs> getStorageConfiguration() {
        return this.storageConfiguration;
    }

    /**
     * Key-value pairs of additional properties for the resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The list of event properties which will be used to define the environment's time series id.
     * 
     */
    @InputImport(name="timeSeriesIdProperties", required=true)
    private final Input<List<TimeSeriesIdPropertyArgs>> timeSeriesIdProperties;

    public Input<List<TimeSeriesIdPropertyArgs>> getTimeSeriesIdProperties() {
        return this.timeSeriesIdProperties;
    }

    /**
     * The warm store configuration provides the details to create a warm store cache that will retain a copy of the environment's data available for faster query.
     * 
     */
    @InputImport(name="warmStoreConfiguration")
    private final @Nullable Input<WarmStoreConfigurationPropertiesArgs> warmStoreConfiguration;

    public Input<WarmStoreConfigurationPropertiesArgs> getWarmStoreConfiguration() {
        return this.warmStoreConfiguration == null ? Input.empty() : this.warmStoreConfiguration;
    }

    public Gen2EnvironmentArgs(
        @Nullable Input<String> environmentName,
        Input<String> kind,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<SkuArgs> sku,
        Input<Gen2StorageConfigurationInputArgs> storageConfiguration,
        @Nullable Input<Map<String,String>> tags,
        Input<List<TimeSeriesIdPropertyArgs>> timeSeriesIdProperties,
        @Nullable Input<WarmStoreConfigurationPropertiesArgs> warmStoreConfiguration) {
        this.environmentName = environmentName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.storageConfiguration = Objects.requireNonNull(storageConfiguration, "expected parameter 'storageConfiguration' to be non-null");
        this.tags = tags;
        this.timeSeriesIdProperties = Objects.requireNonNull(timeSeriesIdProperties, "expected parameter 'timeSeriesIdProperties' to be non-null");
        this.warmStoreConfiguration = warmStoreConfiguration;
    }

    private Gen2EnvironmentArgs() {
        this.environmentName = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.storageConfiguration = Input.empty();
        this.tags = Input.empty();
        this.timeSeriesIdProperties = Input.empty();
        this.warmStoreConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Gen2EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> environmentName;
        private Input<String> kind;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<SkuArgs> sku;
        private Input<Gen2StorageConfigurationInputArgs> storageConfiguration;
        private @Nullable Input<Map<String,String>> tags;
        private Input<List<TimeSeriesIdPropertyArgs>> timeSeriesIdProperties;
        private @Nullable Input<WarmStoreConfigurationPropertiesArgs> warmStoreConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(Gen2EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentName = defaults.environmentName;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.storageConfiguration = defaults.storageConfiguration;
    	      this.tags = defaults.tags;
    	      this.timeSeriesIdProperties = defaults.timeSeriesIdProperties;
    	      this.warmStoreConfiguration = defaults.warmStoreConfiguration;
        }

        public Builder setEnvironmentName(@Nullable Input<String> environmentName) {
            this.environmentName = environmentName;
            return this;
        }

        public Builder setEnvironmentName(@Nullable String environmentName) {
            this.environmentName = Input.ofNullable(environmentName);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setStorageConfiguration(Input<Gen2StorageConfigurationInputArgs> storageConfiguration) {
            this.storageConfiguration = Objects.requireNonNull(storageConfiguration);
            return this;
        }

        public Builder setStorageConfiguration(Gen2StorageConfigurationInputArgs storageConfiguration) {
            this.storageConfiguration = Input.of(Objects.requireNonNull(storageConfiguration));
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

        public Builder setTimeSeriesIdProperties(Input<List<TimeSeriesIdPropertyArgs>> timeSeriesIdProperties) {
            this.timeSeriesIdProperties = Objects.requireNonNull(timeSeriesIdProperties);
            return this;
        }

        public Builder setTimeSeriesIdProperties(List<TimeSeriesIdPropertyArgs> timeSeriesIdProperties) {
            this.timeSeriesIdProperties = Input.of(Objects.requireNonNull(timeSeriesIdProperties));
            return this;
        }

        public Builder setWarmStoreConfiguration(@Nullable Input<WarmStoreConfigurationPropertiesArgs> warmStoreConfiguration) {
            this.warmStoreConfiguration = warmStoreConfiguration;
            return this;
        }

        public Builder setWarmStoreConfiguration(@Nullable WarmStoreConfigurationPropertiesArgs warmStoreConfiguration) {
            this.warmStoreConfiguration = Input.ofNullable(warmStoreConfiguration);
            return this;
        }

        public Gen2EnvironmentArgs build() {
            return new Gen2EnvironmentArgs(environmentName, kind, location, resourceGroupName, sku, storageConfiguration, tags, timeSeriesIdProperties, warmStoreConfiguration);
        }
    }
}
