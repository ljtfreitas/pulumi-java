// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigArgs Empty = new PreventionJobTriggerInspectJobStorageConfigArgs();

    /**
     * Options defining BigQuery table and row identifiers.
     * Structure is documented below.
     * 
     */
    @InputImport(name="bigQueryOptions")
        private final @Nullable Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs> bigQueryOptions;

    public Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs> getBigQueryOptions() {
        return this.bigQueryOptions == null ? Input.empty() : this.bigQueryOptions;
    }

    /**
     * Options defining a file or a set of files within a Google Cloud Storage bucket.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cloudStorageOptions")
        private final @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs> cloudStorageOptions;

    public Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs> getCloudStorageOptions() {
        return this.cloudStorageOptions == null ? Input.empty() : this.cloudStorageOptions;
    }

    /**
     * Options defining a data set within Google Cloud Datastore.
     * Structure is documented below.
     * 
     */
    @InputImport(name="datastoreOptions")
        private final @Nullable Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs> datastoreOptions;

    public Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs> getDatastoreOptions() {
        return this.datastoreOptions == null ? Input.empty() : this.datastoreOptions;
    }

    /**
     * Information on where to inspect
     * Structure is documented below.
     * 
     */
    @InputImport(name="timespanConfig")
        private final @Nullable Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs> timespanConfig;

    public Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs> getTimespanConfig() {
        return this.timespanConfig == null ? Input.empty() : this.timespanConfig;
    }

    public PreventionJobTriggerInspectJobStorageConfigArgs(
        @Nullable Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs> bigQueryOptions,
        @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs> cloudStorageOptions,
        @Nullable Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs> datastoreOptions,
        @Nullable Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs> timespanConfig) {
        this.bigQueryOptions = bigQueryOptions;
        this.cloudStorageOptions = cloudStorageOptions;
        this.datastoreOptions = datastoreOptions;
        this.timespanConfig = timespanConfig;
    }

    private PreventionJobTriggerInspectJobStorageConfigArgs() {
        this.bigQueryOptions = Input.empty();
        this.cloudStorageOptions = Input.empty();
        this.datastoreOptions = Input.empty();
        this.timespanConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs> bigQueryOptions;
        private @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs> cloudStorageOptions;
        private @Nullable Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs> datastoreOptions;
        private @Nullable Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs> timespanConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryOptions = defaults.bigQueryOptions;
    	      this.cloudStorageOptions = defaults.cloudStorageOptions;
    	      this.datastoreOptions = defaults.datastoreOptions;
    	      this.timespanConfig = defaults.timespanConfig;
        }

        public Builder setBigQueryOptions(@Nullable Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs> bigQueryOptions) {
            this.bigQueryOptions = bigQueryOptions;
            return this;
        }

        public Builder setBigQueryOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs bigQueryOptions) {
            this.bigQueryOptions = Input.ofNullable(bigQueryOptions);
            return this;
        }

        public Builder setCloudStorageOptions(@Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs> cloudStorageOptions) {
            this.cloudStorageOptions = cloudStorageOptions;
            return this;
        }

        public Builder setCloudStorageOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs cloudStorageOptions) {
            this.cloudStorageOptions = Input.ofNullable(cloudStorageOptions);
            return this;
        }

        public Builder setDatastoreOptions(@Nullable Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs> datastoreOptions) {
            this.datastoreOptions = datastoreOptions;
            return this;
        }

        public Builder setDatastoreOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs datastoreOptions) {
            this.datastoreOptions = Input.ofNullable(datastoreOptions);
            return this;
        }

        public Builder setTimespanConfig(@Nullable Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs> timespanConfig) {
            this.timespanConfig = timespanConfig;
            return this;
        }

        public Builder setTimespanConfig(@Nullable PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs timespanConfig) {
            this.timespanConfig = Input.ofNullable(timespanConfig);
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigArgs(bigQueryOptions, cloudStorageOptions, datastoreOptions, timespanConfig);
        }
    }
}
