// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.DatastoreFileFormatConfiguration;
import io.pulumi.awsnative.iotanalytics.outputs.DatastorePartitions;
import io.pulumi.awsnative.iotanalytics.outputs.DatastoreRetentionPeriod;
import io.pulumi.awsnative.iotanalytics.outputs.DatastoreStorage;
import io.pulumi.awsnative.iotanalytics.outputs.DatastoreTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDatastoreResult {
    private final @Nullable DatastorePartitions datastorePartitions;
    private final @Nullable DatastoreStorage datastoreStorage;
    private final @Nullable DatastoreFileFormatConfiguration fileFormatConfiguration;
    private final @Nullable String id;
    private final @Nullable DatastoreRetentionPeriod retentionPeriod;
    private final @Nullable List<DatastoreTag> tags;

    @OutputCustomType.Constructor({"datastorePartitions","datastoreStorage","fileFormatConfiguration","id","retentionPeriod","tags"})
    private GetDatastoreResult(
        @Nullable DatastorePartitions datastorePartitions,
        @Nullable DatastoreStorage datastoreStorage,
        @Nullable DatastoreFileFormatConfiguration fileFormatConfiguration,
        @Nullable String id,
        @Nullable DatastoreRetentionPeriod retentionPeriod,
        @Nullable List<DatastoreTag> tags) {
        this.datastorePartitions = datastorePartitions;
        this.datastoreStorage = datastoreStorage;
        this.fileFormatConfiguration = fileFormatConfiguration;
        this.id = id;
        this.retentionPeriod = retentionPeriod;
        this.tags = tags;
    }

    public Optional<DatastorePartitions> getDatastorePartitions() {
        return Optional.ofNullable(this.datastorePartitions);
    }
    public Optional<DatastoreStorage> getDatastoreStorage() {
        return Optional.ofNullable(this.datastoreStorage);
    }
    public Optional<DatastoreFileFormatConfiguration> getFileFormatConfiguration() {
        return Optional.ofNullable(this.fileFormatConfiguration);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<DatastoreRetentionPeriod> getRetentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }
    public List<DatastoreTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatastorePartitions datastorePartitions;
        private @Nullable DatastoreStorage datastoreStorage;
        private @Nullable DatastoreFileFormatConfiguration fileFormatConfiguration;
        private @Nullable String id;
        private @Nullable DatastoreRetentionPeriod retentionPeriod;
        private @Nullable List<DatastoreTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatastoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastorePartitions = defaults.datastorePartitions;
    	      this.datastoreStorage = defaults.datastoreStorage;
    	      this.fileFormatConfiguration = defaults.fileFormatConfiguration;
    	      this.id = defaults.id;
    	      this.retentionPeriod = defaults.retentionPeriod;
    	      this.tags = defaults.tags;
        }

        public Builder setDatastorePartitions(@Nullable DatastorePartitions datastorePartitions) {
            this.datastorePartitions = datastorePartitions;
            return this;
        }

        public Builder setDatastoreStorage(@Nullable DatastoreStorage datastoreStorage) {
            this.datastoreStorage = datastoreStorage;
            return this;
        }

        public Builder setFileFormatConfiguration(@Nullable DatastoreFileFormatConfiguration fileFormatConfiguration) {
            this.fileFormatConfiguration = fileFormatConfiguration;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setRetentionPeriod(@Nullable DatastoreRetentionPeriod retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }

        public Builder setTags(@Nullable List<DatastoreTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetDatastoreResult build() {
            return new GetDatastoreResult(datastorePartitions, datastoreStorage, fileFormatConfiguration, id, retentionPeriod, tags);
        }
    }
}
