// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptions;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptions;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionJobTriggerInspectJobStorageConfig {
    /**
     * Options defining BigQuery table and row identifiers.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionJobTriggerInspectJobStorageConfigBigQueryOptions bigQueryOptions;
    /**
     * Options defining a file or a set of files within a Google Cloud Storage bucket.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions cloudStorageOptions;
    /**
     * Options defining a data set within Google Cloud Datastore.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionJobTriggerInspectJobStorageConfigDatastoreOptions datastoreOptions;
    /**
     * Information on where to inspect
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionJobTriggerInspectJobStorageConfigTimespanConfig timespanConfig;

    @CustomType.Constructor
    private PreventionJobTriggerInspectJobStorageConfig(
        @CustomType.Parameter("bigQueryOptions") @Nullable PreventionJobTriggerInspectJobStorageConfigBigQueryOptions bigQueryOptions,
        @CustomType.Parameter("cloudStorageOptions") @Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions cloudStorageOptions,
        @CustomType.Parameter("datastoreOptions") @Nullable PreventionJobTriggerInspectJobStorageConfigDatastoreOptions datastoreOptions,
        @CustomType.Parameter("timespanConfig") @Nullable PreventionJobTriggerInspectJobStorageConfigTimespanConfig timespanConfig) {
        this.bigQueryOptions = bigQueryOptions;
        this.cloudStorageOptions = cloudStorageOptions;
        this.datastoreOptions = datastoreOptions;
        this.timespanConfig = timespanConfig;
    }

    /**
     * Options defining BigQuery table and row identifiers.
     * Structure is documented below.
     * 
    */
    public Optional<PreventionJobTriggerInspectJobStorageConfigBigQueryOptions> getBigQueryOptions() {
        return Optional.ofNullable(this.bigQueryOptions);
    }
    /**
     * Options defining a file or a set of files within a Google Cloud Storage bucket.
     * Structure is documented below.
     * 
    */
    public Optional<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions> getCloudStorageOptions() {
        return Optional.ofNullable(this.cloudStorageOptions);
    }
    /**
     * Options defining a data set within Google Cloud Datastore.
     * Structure is documented below.
     * 
    */
    public Optional<PreventionJobTriggerInspectJobStorageConfigDatastoreOptions> getDatastoreOptions() {
        return Optional.ofNullable(this.datastoreOptions);
    }
    /**
     * Information on where to inspect
     * Structure is documented below.
     * 
    */
    public Optional<PreventionJobTriggerInspectJobStorageConfigTimespanConfig> getTimespanConfig() {
        return Optional.ofNullable(this.timespanConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PreventionJobTriggerInspectJobStorageConfigBigQueryOptions bigQueryOptions;
        private @Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions cloudStorageOptions;
        private @Nullable PreventionJobTriggerInspectJobStorageConfigDatastoreOptions datastoreOptions;
        private @Nullable PreventionJobTriggerInspectJobStorageConfigTimespanConfig timespanConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryOptions = defaults.bigQueryOptions;
    	      this.cloudStorageOptions = defaults.cloudStorageOptions;
    	      this.datastoreOptions = defaults.datastoreOptions;
    	      this.timespanConfig = defaults.timespanConfig;
        }

        public Builder bigQueryOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigBigQueryOptions bigQueryOptions) {
            this.bigQueryOptions = bigQueryOptions;
            return this;
        }

        public Builder cloudStorageOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions cloudStorageOptions) {
            this.cloudStorageOptions = cloudStorageOptions;
            return this;
        }

        public Builder datastoreOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigDatastoreOptions datastoreOptions) {
            this.datastoreOptions = datastoreOptions;
            return this;
        }

        public Builder timespanConfig(@Nullable PreventionJobTriggerInspectJobStorageConfigTimespanConfig timespanConfig) {
            this.timespanConfig = timespanConfig;
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfig build() {
            return new PreventionJobTriggerInspectJobStorageConfig(bigQueryOptions, cloudStorageOptions, datastoreOptions, timespanConfig);
        }
    }
}
