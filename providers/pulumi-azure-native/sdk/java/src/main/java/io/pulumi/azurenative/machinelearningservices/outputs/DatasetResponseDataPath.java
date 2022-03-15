// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.DatasetResponseSqlDataPath;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetResponseDataPath {
    /**
     * Additional Properties.
     * 
     */
    private final @Nullable Map<String,Object> additionalProperties;
    /**
     * Azure path for Azure Blob or File
     * 
     */
    private final String azureFilePath;
    /**
     * Data store Name
     * 
     */
    private final String datastoreName;
    /**
     * HTTP URL.
     * 
     */
    private final String httpUrl;
    /**
     * Specify the partition format of path. Defaults to None.
     * 
     */
    private final String partitionFormat;
    /**
     * Whether or not to ignore unmatched path.
     * 
     */
    private final Boolean partitionFormatIgnoreError;
    /**
     * List of files expanded from a file GLOB specified
     * 
     */
    private final List<String> paths;
    /**
     * Relative path in the data store
     * 
     */
    private final String relativePath;
    /**
     * Sql Query/Table/Stored Procedure details.
     * 
     */
    private final @Nullable DatasetResponseSqlDataPath sqlDataPath;

    @CustomType.Constructor
    private DatasetResponseDataPath(
        @CustomType.Parameter("additionalProperties") @Nullable Map<String,Object> additionalProperties,
        @CustomType.Parameter("azureFilePath") String azureFilePath,
        @CustomType.Parameter("datastoreName") String datastoreName,
        @CustomType.Parameter("httpUrl") String httpUrl,
        @CustomType.Parameter("partitionFormat") String partitionFormat,
        @CustomType.Parameter("partitionFormatIgnoreError") Boolean partitionFormatIgnoreError,
        @CustomType.Parameter("paths") List<String> paths,
        @CustomType.Parameter("relativePath") String relativePath,
        @CustomType.Parameter("sqlDataPath") @Nullable DatasetResponseSqlDataPath sqlDataPath) {
        this.additionalProperties = additionalProperties;
        this.azureFilePath = azureFilePath;
        this.datastoreName = datastoreName;
        this.httpUrl = httpUrl;
        this.partitionFormat = partitionFormat;
        this.partitionFormatIgnoreError = partitionFormatIgnoreError;
        this.paths = paths;
        this.relativePath = relativePath;
        this.sqlDataPath = sqlDataPath;
    }

    /**
     * Additional Properties.
     * 
    */
    public Map<String,Object> getAdditionalProperties() {
        return this.additionalProperties == null ? Map.of() : this.additionalProperties;
    }
    /**
     * Azure path for Azure Blob or File
     * 
    */
    public String getAzureFilePath() {
        return this.azureFilePath;
    }
    /**
     * Data store Name
     * 
    */
    public String getDatastoreName() {
        return this.datastoreName;
    }
    /**
     * HTTP URL.
     * 
    */
    public String getHttpUrl() {
        return this.httpUrl;
    }
    /**
     * Specify the partition format of path. Defaults to None.
     * 
    */
    public String getPartitionFormat() {
        return this.partitionFormat;
    }
    /**
     * Whether or not to ignore unmatched path.
     * 
    */
    public Boolean getPartitionFormatIgnoreError() {
        return this.partitionFormatIgnoreError;
    }
    /**
     * List of files expanded from a file GLOB specified
     * 
    */
    public List<String> getPaths() {
        return this.paths;
    }
    /**
     * Relative path in the data store
     * 
    */
    public String getRelativePath() {
        return this.relativePath;
    }
    /**
     * Sql Query/Table/Stored Procedure details.
     * 
    */
    public Optional<DatasetResponseSqlDataPath> getSqlDataPath() {
        return Optional.ofNullable(this.sqlDataPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetResponseDataPath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> additionalProperties;
        private String azureFilePath;
        private String datastoreName;
        private String httpUrl;
        private String partitionFormat;
        private Boolean partitionFormatIgnoreError;
        private List<String> paths;
        private String relativePath;
        private @Nullable DatasetResponseSqlDataPath sqlDataPath;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetResponseDataPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalProperties = defaults.additionalProperties;
    	      this.azureFilePath = defaults.azureFilePath;
    	      this.datastoreName = defaults.datastoreName;
    	      this.httpUrl = defaults.httpUrl;
    	      this.partitionFormat = defaults.partitionFormat;
    	      this.partitionFormatIgnoreError = defaults.partitionFormatIgnoreError;
    	      this.paths = defaults.paths;
    	      this.relativePath = defaults.relativePath;
    	      this.sqlDataPath = defaults.sqlDataPath;
        }

        public Builder additionalProperties(@Nullable Map<String,Object> additionalProperties) {
            this.additionalProperties = additionalProperties;
            return this;
        }

        public Builder azureFilePath(String azureFilePath) {
            this.azureFilePath = Objects.requireNonNull(azureFilePath);
            return this;
        }

        public Builder datastoreName(String datastoreName) {
            this.datastoreName = Objects.requireNonNull(datastoreName);
            return this;
        }

        public Builder httpUrl(String httpUrl) {
            this.httpUrl = Objects.requireNonNull(httpUrl);
            return this;
        }

        public Builder partitionFormat(String partitionFormat) {
            this.partitionFormat = Objects.requireNonNull(partitionFormat);
            return this;
        }

        public Builder partitionFormatIgnoreError(Boolean partitionFormatIgnoreError) {
            this.partitionFormatIgnoreError = Objects.requireNonNull(partitionFormatIgnoreError);
            return this;
        }

        public Builder paths(List<String> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }

        public Builder relativePath(String relativePath) {
            this.relativePath = Objects.requireNonNull(relativePath);
            return this;
        }

        public Builder sqlDataPath(@Nullable DatasetResponseSqlDataPath sqlDataPath) {
            this.sqlDataPath = sqlDataPath;
            return this;
        }
        public DatasetResponseDataPath build() {
            return new DatasetResponseDataPath(additionalProperties, azureFilePath, datastoreName, httpUrl, partitionFormat, partitionFormatIgnoreError, paths, relativePath, sqlDataPath);
        }
    }
}
