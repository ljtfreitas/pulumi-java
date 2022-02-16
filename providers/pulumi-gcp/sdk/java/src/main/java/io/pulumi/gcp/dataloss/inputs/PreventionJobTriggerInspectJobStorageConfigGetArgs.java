// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigGetArgs();

    @InputImport(name="bigQueryOptions")
    private final @Nullable Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs> bigQueryOptions;

    public Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs> getBigQueryOptions() {
        return this.bigQueryOptions == null ? Input.empty() : this.bigQueryOptions;
    }

    @InputImport(name="cloudStorageOptions")
    private final @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs> cloudStorageOptions;

    public Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs> getCloudStorageOptions() {
        return this.cloudStorageOptions == null ? Input.empty() : this.cloudStorageOptions;
    }

    @InputImport(name="datastoreOptions")
    private final @Nullable Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs> datastoreOptions;

    public Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs> getDatastoreOptions() {
        return this.datastoreOptions == null ? Input.empty() : this.datastoreOptions;
    }

    @InputImport(name="timespanConfig")
    private final @Nullable Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs> timespanConfig;

    public Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs> getTimespanConfig() {
        return this.timespanConfig == null ? Input.empty() : this.timespanConfig;
    }

    public PreventionJobTriggerInspectJobStorageConfigGetArgs(
        @Nullable Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs> bigQueryOptions,
        @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs> cloudStorageOptions,
        @Nullable Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs> datastoreOptions,
        @Nullable Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs> timespanConfig) {
        this.bigQueryOptions = bigQueryOptions;
        this.cloudStorageOptions = cloudStorageOptions;
        this.datastoreOptions = datastoreOptions;
        this.timespanConfig = timespanConfig;
    }

    private PreventionJobTriggerInspectJobStorageConfigGetArgs() {
        this.bigQueryOptions = Input.empty();
        this.cloudStorageOptions = Input.empty();
        this.datastoreOptions = Input.empty();
        this.timespanConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs> bigQueryOptions;
        private @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs> cloudStorageOptions;
        private @Nullable Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs> datastoreOptions;
        private @Nullable Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs> timespanConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryOptions = defaults.bigQueryOptions;
    	      this.cloudStorageOptions = defaults.cloudStorageOptions;
    	      this.datastoreOptions = defaults.datastoreOptions;
    	      this.timespanConfig = defaults.timespanConfig;
        }

        public Builder setBigQueryOptions(@Nullable Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs> bigQueryOptions) {
            this.bigQueryOptions = bigQueryOptions;
            return this;
        }

        public Builder setBigQueryOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs bigQueryOptions) {
            this.bigQueryOptions = Input.ofNullable(bigQueryOptions);
            return this;
        }

        public Builder setCloudStorageOptions(@Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs> cloudStorageOptions) {
            this.cloudStorageOptions = cloudStorageOptions;
            return this;
        }

        public Builder setCloudStorageOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsGetArgs cloudStorageOptions) {
            this.cloudStorageOptions = Input.ofNullable(cloudStorageOptions);
            return this;
        }

        public Builder setDatastoreOptions(@Nullable Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs> datastoreOptions) {
            this.datastoreOptions = datastoreOptions;
            return this;
        }

        public Builder setDatastoreOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs datastoreOptions) {
            this.datastoreOptions = Input.ofNullable(datastoreOptions);
            return this;
        }

        public Builder setTimespanConfig(@Nullable Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs> timespanConfig) {
            this.timespanConfig = timespanConfig;
            return this;
        }

        public Builder setTimespanConfig(@Nullable PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs timespanConfig) {
            this.timespanConfig = Input.ofNullable(timespanConfig);
            return this;
        }

        public PreventionJobTriggerInspectJobStorageConfigGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigGetArgs(bigQueryOptions, cloudStorageOptions, datastoreOptions, timespanConfig);
        }
    }
}