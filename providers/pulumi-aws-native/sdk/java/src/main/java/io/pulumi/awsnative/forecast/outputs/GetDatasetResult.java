// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.forecast.outputs;

import io.pulumi.awsnative.forecast.enums.DatasetDomain;
import io.pulumi.awsnative.forecast.enums.DatasetType;
import io.pulumi.awsnative.forecast.outputs.EncryptionConfigProperties;
import io.pulumi.awsnative.forecast.outputs.SchemaProperties;
import io.pulumi.awsnative.forecast.outputs.TagsItemProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDatasetResult {
    private final @Nullable String arn;
    /**
     * Frequency of data collection. This parameter is required for RELATED_TIME_SERIES
     * 
     */
    private final @Nullable String dataFrequency;
    /**
     * The dataset type
     * 
     */
    private final @Nullable DatasetType datasetType;
    /**
     * The domain associated with the dataset
     * 
     */
    private final @Nullable DatasetDomain domain;
    private final @Nullable EncryptionConfigProperties encryptionConfig;
    private final @Nullable SchemaProperties schema;
    private final @Nullable List<TagsItemProperties> tags;

    @OutputCustomType.Constructor({"arn","dataFrequency","datasetType","domain","encryptionConfig","schema","tags"})
    private GetDatasetResult(
        @Nullable String arn,
        @Nullable String dataFrequency,
        @Nullable DatasetType datasetType,
        @Nullable DatasetDomain domain,
        @Nullable EncryptionConfigProperties encryptionConfig,
        @Nullable SchemaProperties schema,
        @Nullable List<TagsItemProperties> tags) {
        this.arn = arn;
        this.dataFrequency = dataFrequency;
        this.datasetType = datasetType;
        this.domain = domain;
        this.encryptionConfig = encryptionConfig;
        this.schema = schema;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Frequency of data collection. This parameter is required for RELATED_TIME_SERIES
     * 
     */
    public Optional<String> getDataFrequency() {
        return Optional.ofNullable(this.dataFrequency);
    }
    /**
     * The dataset type
     * 
     */
    public Optional<DatasetType> getDatasetType() {
        return Optional.ofNullable(this.datasetType);
    }
    /**
     * The domain associated with the dataset
     * 
     */
    public Optional<DatasetDomain> getDomain() {
        return Optional.ofNullable(this.domain);
    }
    public Optional<EncryptionConfigProperties> getEncryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }
    public Optional<SchemaProperties> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    public List<TagsItemProperties> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String dataFrequency;
        private @Nullable DatasetType datasetType;
        private @Nullable DatasetDomain domain;
        private @Nullable EncryptionConfigProperties encryptionConfig;
        private @Nullable SchemaProperties schema;
        private @Nullable List<TagsItemProperties> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataFrequency = defaults.dataFrequency;
    	      this.datasetType = defaults.datasetType;
    	      this.domain = defaults.domain;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.schema = defaults.schema;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDataFrequency(@Nullable String dataFrequency) {
            this.dataFrequency = dataFrequency;
            return this;
        }

        public Builder setDatasetType(@Nullable DatasetType datasetType) {
            this.datasetType = datasetType;
            return this;
        }

        public Builder setDomain(@Nullable DatasetDomain domain) {
            this.domain = domain;
            return this;
        }

        public Builder setEncryptionConfig(@Nullable EncryptionConfigProperties encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder setSchema(@Nullable SchemaProperties schema) {
            this.schema = schema;
            return this;
        }

        public Builder setTags(@Nullable List<TagsItemProperties> tags) {
            this.tags = tags;
            return this;
        }
        public GetDatasetResult build() {
            return new GetDatasetResult(arn, dataFrequency, datasetType, domain, encryptionConfig, schema, tags);
        }
    }
}
