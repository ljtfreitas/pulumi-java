// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryOptionsArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CloudStorageOptionsArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DatastoreOptionsArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2HybridOptionsArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TimespanConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GooglePrivacyDlpV2StorageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2StorageConfigArgs Empty = new GooglePrivacyDlpV2StorageConfigArgs();

    @InputImport(name="bigQueryOptions")
    private final @Nullable Input<GooglePrivacyDlpV2BigQueryOptionsArgs> bigQueryOptions;

    public Input<GooglePrivacyDlpV2BigQueryOptionsArgs> getBigQueryOptions() {
        return this.bigQueryOptions == null ? Input.empty() : this.bigQueryOptions;
    }

    @InputImport(name="cloudStorageOptions")
    private final @Nullable Input<GooglePrivacyDlpV2CloudStorageOptionsArgs> cloudStorageOptions;

    public Input<GooglePrivacyDlpV2CloudStorageOptionsArgs> getCloudStorageOptions() {
        return this.cloudStorageOptions == null ? Input.empty() : this.cloudStorageOptions;
    }

    @InputImport(name="datastoreOptions")
    private final @Nullable Input<GooglePrivacyDlpV2DatastoreOptionsArgs> datastoreOptions;

    public Input<GooglePrivacyDlpV2DatastoreOptionsArgs> getDatastoreOptions() {
        return this.datastoreOptions == null ? Input.empty() : this.datastoreOptions;
    }

    @InputImport(name="hybridOptions")
    private final @Nullable Input<GooglePrivacyDlpV2HybridOptionsArgs> hybridOptions;

    public Input<GooglePrivacyDlpV2HybridOptionsArgs> getHybridOptions() {
        return this.hybridOptions == null ? Input.empty() : this.hybridOptions;
    }

    @InputImport(name="timespanConfig")
    private final @Nullable Input<GooglePrivacyDlpV2TimespanConfigArgs> timespanConfig;

    public Input<GooglePrivacyDlpV2TimespanConfigArgs> getTimespanConfig() {
        return this.timespanConfig == null ? Input.empty() : this.timespanConfig;
    }

    public GooglePrivacyDlpV2StorageConfigArgs(
        @Nullable Input<GooglePrivacyDlpV2BigQueryOptionsArgs> bigQueryOptions,
        @Nullable Input<GooglePrivacyDlpV2CloudStorageOptionsArgs> cloudStorageOptions,
        @Nullable Input<GooglePrivacyDlpV2DatastoreOptionsArgs> datastoreOptions,
        @Nullable Input<GooglePrivacyDlpV2HybridOptionsArgs> hybridOptions,
        @Nullable Input<GooglePrivacyDlpV2TimespanConfigArgs> timespanConfig) {
        this.bigQueryOptions = bigQueryOptions;
        this.cloudStorageOptions = cloudStorageOptions;
        this.datastoreOptions = datastoreOptions;
        this.hybridOptions = hybridOptions;
        this.timespanConfig = timespanConfig;
    }

    private GooglePrivacyDlpV2StorageConfigArgs() {
        this.bigQueryOptions = Input.empty();
        this.cloudStorageOptions = Input.empty();
        this.datastoreOptions = Input.empty();
        this.hybridOptions = Input.empty();
        this.timespanConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2StorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2BigQueryOptionsArgs> bigQueryOptions;
        private @Nullable Input<GooglePrivacyDlpV2CloudStorageOptionsArgs> cloudStorageOptions;
        private @Nullable Input<GooglePrivacyDlpV2DatastoreOptionsArgs> datastoreOptions;
        private @Nullable Input<GooglePrivacyDlpV2HybridOptionsArgs> hybridOptions;
        private @Nullable Input<GooglePrivacyDlpV2TimespanConfigArgs> timespanConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2StorageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryOptions = defaults.bigQueryOptions;
    	      this.cloudStorageOptions = defaults.cloudStorageOptions;
    	      this.datastoreOptions = defaults.datastoreOptions;
    	      this.hybridOptions = defaults.hybridOptions;
    	      this.timespanConfig = defaults.timespanConfig;
        }

        public Builder setBigQueryOptions(@Nullable Input<GooglePrivacyDlpV2BigQueryOptionsArgs> bigQueryOptions) {
            this.bigQueryOptions = bigQueryOptions;
            return this;
        }

        public Builder setBigQueryOptions(@Nullable GooglePrivacyDlpV2BigQueryOptionsArgs bigQueryOptions) {
            this.bigQueryOptions = Input.ofNullable(bigQueryOptions);
            return this;
        }

        public Builder setCloudStorageOptions(@Nullable Input<GooglePrivacyDlpV2CloudStorageOptionsArgs> cloudStorageOptions) {
            this.cloudStorageOptions = cloudStorageOptions;
            return this;
        }

        public Builder setCloudStorageOptions(@Nullable GooglePrivacyDlpV2CloudStorageOptionsArgs cloudStorageOptions) {
            this.cloudStorageOptions = Input.ofNullable(cloudStorageOptions);
            return this;
        }

        public Builder setDatastoreOptions(@Nullable Input<GooglePrivacyDlpV2DatastoreOptionsArgs> datastoreOptions) {
            this.datastoreOptions = datastoreOptions;
            return this;
        }

        public Builder setDatastoreOptions(@Nullable GooglePrivacyDlpV2DatastoreOptionsArgs datastoreOptions) {
            this.datastoreOptions = Input.ofNullable(datastoreOptions);
            return this;
        }

        public Builder setHybridOptions(@Nullable Input<GooglePrivacyDlpV2HybridOptionsArgs> hybridOptions) {
            this.hybridOptions = hybridOptions;
            return this;
        }

        public Builder setHybridOptions(@Nullable GooglePrivacyDlpV2HybridOptionsArgs hybridOptions) {
            this.hybridOptions = Input.ofNullable(hybridOptions);
            return this;
        }

        public Builder setTimespanConfig(@Nullable Input<GooglePrivacyDlpV2TimespanConfigArgs> timespanConfig) {
            this.timespanConfig = timespanConfig;
            return this;
        }

        public Builder setTimespanConfig(@Nullable GooglePrivacyDlpV2TimespanConfigArgs timespanConfig) {
            this.timespanConfig = Input.ofNullable(timespanConfig);
            return this;
        }

        public GooglePrivacyDlpV2StorageConfigArgs build() {
            return new GooglePrivacyDlpV2StorageConfigArgs(bigQueryOptions, cloudStorageOptions, datastoreOptions, hybridOptions, timespanConfig);
        }
    }
}