// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.DatasetAccessArgs;
import io.pulumi.gcp.bigquery.inputs.DatasetDefaultEncryptionConfigurationArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetArgs Empty = new DatasetArgs();

    /**
     * An array of objects that define dataset access for one or more entities.
     * Structure is documented below.
     * 
     */
    @InputImport(name="accesses")
        private final @Nullable Input<List<DatasetAccessArgs>> accesses;

    public Input<List<DatasetAccessArgs>> getAccesses() {
        return this.accesses == null ? Input.empty() : this.accesses;
    }

    /**
     * The ID of the dataset containing this table.
     * 
     */
    @InputImport(name="datasetId", required=true)
        private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * The default encryption key for all tables in the dataset. Once this property is set,
     * all newly-created partitioned tables in the dataset will have encryption key set to
     * this value, unless table creation request (or query) overrides the key.
     * Structure is documented below.
     * 
     */
    @InputImport(name="defaultEncryptionConfiguration")
        private final @Nullable Input<DatasetDefaultEncryptionConfigurationArgs> defaultEncryptionConfiguration;

    public Input<DatasetDefaultEncryptionConfigurationArgs> getDefaultEncryptionConfiguration() {
        return this.defaultEncryptionConfiguration == null ? Input.empty() : this.defaultEncryptionConfiguration;
    }

    /**
     * The default partition expiration for all partitioned tables in
     * the dataset, in milliseconds.
     * 
     */
    @InputImport(name="defaultPartitionExpirationMs")
        private final @Nullable Input<Integer> defaultPartitionExpirationMs;

    public Input<Integer> getDefaultPartitionExpirationMs() {
        return this.defaultPartitionExpirationMs == null ? Input.empty() : this.defaultPartitionExpirationMs;
    }

    /**
     * The default lifetime of all tables in the dataset, in milliseconds.
     * The minimum value is 3600000 milliseconds (one hour).
     * 
     */
    @InputImport(name="defaultTableExpirationMs")
        private final @Nullable Input<Integer> defaultTableExpirationMs;

    public Input<Integer> getDefaultTableExpirationMs() {
        return this.defaultTableExpirationMs == null ? Input.empty() : this.defaultTableExpirationMs;
    }

    /**
     * If set to `true`, delete all the tables in the
     * dataset when destroying the resource; otherwise,
     * destroying the resource will fail if tables are present.
     * 
     */
    @InputImport(name="deleteContentsOnDestroy")
        private final @Nullable Input<Boolean> deleteContentsOnDestroy;

    public Input<Boolean> getDeleteContentsOnDestroy() {
        return this.deleteContentsOnDestroy == null ? Input.empty() : this.deleteContentsOnDestroy;
    }

    /**
     * A user-friendly description of the dataset
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A descriptive name for the dataset
     * 
     */
    @InputImport(name="friendlyName")
        private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * The labels associated with this dataset. You can use these to
     * organize and group your datasets
     * 
     */
    @InputImport(name="labels")
        private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The geographic location where the dataset should reside.
     * See [official docs](https://cloud.google.com/bigquery/docs/dataset-locations).
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public DatasetArgs(
        @Nullable Input<List<DatasetAccessArgs>> accesses,
        Input<String> datasetId,
        @Nullable Input<DatasetDefaultEncryptionConfigurationArgs> defaultEncryptionConfiguration,
        @Nullable Input<Integer> defaultPartitionExpirationMs,
        @Nullable Input<Integer> defaultTableExpirationMs,
        @Nullable Input<Boolean> deleteContentsOnDestroy,
        @Nullable Input<String> description,
        @Nullable Input<String> friendlyName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> project) {
        this.accesses = accesses;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.defaultEncryptionConfiguration = defaultEncryptionConfiguration;
        this.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
        this.defaultTableExpirationMs = defaultTableExpirationMs;
        this.deleteContentsOnDestroy = deleteContentsOnDestroy;
        this.description = description;
        this.friendlyName = friendlyName;
        this.labels = labels;
        this.location = location;
        this.project = project;
    }

    private DatasetArgs() {
        this.accesses = Input.empty();
        this.datasetId = Input.empty();
        this.defaultEncryptionConfiguration = Input.empty();
        this.defaultPartitionExpirationMs = Input.empty();
        this.defaultTableExpirationMs = Input.empty();
        this.deleteContentsOnDestroy = Input.empty();
        this.description = Input.empty();
        this.friendlyName = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DatasetAccessArgs>> accesses;
        private Input<String> datasetId;
        private @Nullable Input<DatasetDefaultEncryptionConfigurationArgs> defaultEncryptionConfiguration;
        private @Nullable Input<Integer> defaultPartitionExpirationMs;
        private @Nullable Input<Integer> defaultTableExpirationMs;
        private @Nullable Input<Boolean> deleteContentsOnDestroy;
        private @Nullable Input<String> description;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accesses = defaults.accesses;
    	      this.datasetId = defaults.datasetId;
    	      this.defaultEncryptionConfiguration = defaults.defaultEncryptionConfiguration;
    	      this.defaultPartitionExpirationMs = defaults.defaultPartitionExpirationMs;
    	      this.defaultTableExpirationMs = defaults.defaultTableExpirationMs;
    	      this.deleteContentsOnDestroy = defaults.deleteContentsOnDestroy;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setAccesses(@Nullable Input<List<DatasetAccessArgs>> accesses) {
            this.accesses = accesses;
            return this;
        }

        public Builder setAccesses(@Nullable List<DatasetAccessArgs> accesses) {
            this.accesses = Input.ofNullable(accesses);
            return this;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder setDefaultEncryptionConfiguration(@Nullable Input<DatasetDefaultEncryptionConfigurationArgs> defaultEncryptionConfiguration) {
            this.defaultEncryptionConfiguration = defaultEncryptionConfiguration;
            return this;
        }

        public Builder setDefaultEncryptionConfiguration(@Nullable DatasetDefaultEncryptionConfigurationArgs defaultEncryptionConfiguration) {
            this.defaultEncryptionConfiguration = Input.ofNullable(defaultEncryptionConfiguration);
            return this;
        }

        public Builder setDefaultPartitionExpirationMs(@Nullable Input<Integer> defaultPartitionExpirationMs) {
            this.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
            return this;
        }

        public Builder setDefaultPartitionExpirationMs(@Nullable Integer defaultPartitionExpirationMs) {
            this.defaultPartitionExpirationMs = Input.ofNullable(defaultPartitionExpirationMs);
            return this;
        }

        public Builder setDefaultTableExpirationMs(@Nullable Input<Integer> defaultTableExpirationMs) {
            this.defaultTableExpirationMs = defaultTableExpirationMs;
            return this;
        }

        public Builder setDefaultTableExpirationMs(@Nullable Integer defaultTableExpirationMs) {
            this.defaultTableExpirationMs = Input.ofNullable(defaultTableExpirationMs);
            return this;
        }

        public Builder setDeleteContentsOnDestroy(@Nullable Input<Boolean> deleteContentsOnDestroy) {
            this.deleteContentsOnDestroy = deleteContentsOnDestroy;
            return this;
        }

        public Builder setDeleteContentsOnDestroy(@Nullable Boolean deleteContentsOnDestroy) {
            this.deleteContentsOnDestroy = Input.ofNullable(deleteContentsOnDestroy);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public DatasetArgs build() {
            return new DatasetArgs(accesses, datasetId, defaultEncryptionConfiguration, defaultPartitionExpirationMs, defaultTableExpirationMs, deleteContentsOnDestroy, description, friendlyName, labels, location, project);
        }
    }
}
