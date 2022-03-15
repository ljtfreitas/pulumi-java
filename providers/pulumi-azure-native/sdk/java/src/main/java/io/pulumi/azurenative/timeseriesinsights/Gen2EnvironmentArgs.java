// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.timeseriesinsights.inputs.Gen2StorageConfigurationInputArgs;
import io.pulumi.azurenative.timeseriesinsights.inputs.SkuArgs;
import io.pulumi.azurenative.timeseriesinsights.inputs.TimeSeriesIdPropertyArgs;
import io.pulumi.azurenative.timeseriesinsights.inputs.WarmStoreConfigurationPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="environmentName")
      private final @Nullable Output<String> environmentName;

    public Output<String> getEnvironmentName() {
        return this.environmentName == null ? Output.empty() : this.environmentName;
    }

    /**
     * The kind of the environment.
     * Expected value is 'Gen2'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * The storage configuration provides the connection details that allows the Time Series Insights service to connect to the customer storage account that is used to store the environment's data.
     * 
     */
    @Import(name="storageConfiguration", required=true)
      private final Output<Gen2StorageConfigurationInputArgs> storageConfiguration;

    public Output<Gen2StorageConfigurationInputArgs> getStorageConfiguration() {
        return this.storageConfiguration;
    }

    /**
     * Key-value pairs of additional properties for the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The list of event properties which will be used to define the environment's time series id.
     * 
     */
    @Import(name="timeSeriesIdProperties", required=true)
      private final Output<List<TimeSeriesIdPropertyArgs>> timeSeriesIdProperties;

    public Output<List<TimeSeriesIdPropertyArgs>> getTimeSeriesIdProperties() {
        return this.timeSeriesIdProperties;
    }

    /**
     * The warm store configuration provides the details to create a warm store cache that will retain a copy of the environment's data available for faster query.
     * 
     */
    @Import(name="warmStoreConfiguration")
      private final @Nullable Output<WarmStoreConfigurationPropertiesArgs> warmStoreConfiguration;

    public Output<WarmStoreConfigurationPropertiesArgs> getWarmStoreConfiguration() {
        return this.warmStoreConfiguration == null ? Output.empty() : this.warmStoreConfiguration;
    }

    public Gen2EnvironmentArgs(
        @Nullable Output<String> environmentName,
        Output<String> kind,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        Output<SkuArgs> sku,
        Output<Gen2StorageConfigurationInputArgs> storageConfiguration,
        @Nullable Output<Map<String,String>> tags,
        Output<List<TimeSeriesIdPropertyArgs>> timeSeriesIdProperties,
        @Nullable Output<WarmStoreConfigurationPropertiesArgs> warmStoreConfiguration) {
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
        this.environmentName = Output.empty();
        this.kind = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.storageConfiguration = Output.empty();
        this.tags = Output.empty();
        this.timeSeriesIdProperties = Output.empty();
        this.warmStoreConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Gen2EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> environmentName;
        private Output<String> kind;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private Output<SkuArgs> sku;
        private Output<Gen2StorageConfigurationInputArgs> storageConfiguration;
        private @Nullable Output<Map<String,String>> tags;
        private Output<List<TimeSeriesIdPropertyArgs>> timeSeriesIdProperties;
        private @Nullable Output<WarmStoreConfigurationPropertiesArgs> warmStoreConfiguration;

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

        public Builder environmentName(@Nullable Output<String> environmentName) {
            this.environmentName = environmentName;
            return this;
        }

        public Builder environmentName(@Nullable String environmentName) {
            this.environmentName = Output.ofNullable(environmentName);
            return this;
        }

        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sku(Output<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder sku(SkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder storageConfiguration(Output<Gen2StorageConfigurationInputArgs> storageConfiguration) {
            this.storageConfiguration = Objects.requireNonNull(storageConfiguration);
            return this;
        }

        public Builder storageConfiguration(Gen2StorageConfigurationInputArgs storageConfiguration) {
            this.storageConfiguration = Output.of(Objects.requireNonNull(storageConfiguration));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder timeSeriesIdProperties(Output<List<TimeSeriesIdPropertyArgs>> timeSeriesIdProperties) {
            this.timeSeriesIdProperties = Objects.requireNonNull(timeSeriesIdProperties);
            return this;
        }

        public Builder timeSeriesIdProperties(List<TimeSeriesIdPropertyArgs> timeSeriesIdProperties) {
            this.timeSeriesIdProperties = Output.of(Objects.requireNonNull(timeSeriesIdProperties));
            return this;
        }

        public Builder warmStoreConfiguration(@Nullable Output<WarmStoreConfigurationPropertiesArgs> warmStoreConfiguration) {
            this.warmStoreConfiguration = warmStoreConfiguration;
            return this;
        }

        public Builder warmStoreConfiguration(@Nullable WarmStoreConfigurationPropertiesArgs warmStoreConfiguration) {
            this.warmStoreConfiguration = Output.ofNullable(warmStoreConfiguration);
            return this;
        }
        public Gen2EnvironmentArgs build() {
            return new Gen2EnvironmentArgs(environmentName, kind, location, resourceGroupName, sku, storageConfiguration, tags, timeSeriesIdProperties, warmStoreConfiguration);
        }
    }
}
