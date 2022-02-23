// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AvroFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetCompressionResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.JsonFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.OrcFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.ParquetFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.TextFormatResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureBlobFSDatasetResponse {
    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The data compression method used for the blob storage.
     * 
     */
    private final @Nullable DatasetCompressionResponse compression;
    /**
     * Dataset description.
     * 
     */
    private final @Nullable String description;
    /**
     * The name of the Azure Data Lake Storage Gen2. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileName;
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    private final @Nullable DatasetResponseFolder folder;
    /**
     * The path of the Azure Data Lake Storage Gen2 storage. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object folderPath;
    /**
     * The format of the Azure Data Lake Storage Gen2 storage.
     * 
     */
    private final @Nullable Object format;
    /**
     * Linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Parameters for dataset.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    private final @Nullable Object schema;
    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    private final @Nullable Object structure;
    /**
     * Type of dataset.
     * Expected value is 'AzureBlobFSFile'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"annotations","compression","description","fileName","folder","folderPath","format","linkedServiceName","parameters","schema","structure","type"})
    private AzureBlobFSDatasetResponse(
        @Nullable List<Object> annotations,
        @Nullable DatasetCompressionResponse compression,
        @Nullable String description,
        @Nullable Object fileName,
        @Nullable DatasetResponseFolder folder,
        @Nullable Object folderPath,
        @Nullable Object format,
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object schema,
        @Nullable Object structure,
        String type) {
        this.annotations = annotations;
        this.compression = compression;
        this.description = description;
        this.fileName = fileName;
        this.folder = folder;
        this.folderPath = folderPath;
        this.format = format;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The data compression method used for the blob storage.
     * 
     */
    public Optional<DatasetCompressionResponse> getCompression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * Dataset description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The name of the Azure Data Lake Storage Gen2. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getFileName() {
        return Optional.ofNullable(this.fileName);
    }
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    public Optional<DatasetResponseFolder> getFolder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * The path of the Azure Data Lake Storage Gen2 storage. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    /**
     * The format of the Azure Data Lake Storage Gen2 storage.
     * 
     */
    public Optional<Object> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Linked service reference.
     * 
     */
    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * Parameters for dataset.
     * 
     */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    public Optional<Object> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    public Optional<Object> getStructure() {
        return Optional.ofNullable(this.structure);
    }
    /**
     * Type of dataset.
     * Expected value is 'AzureBlobFSFile'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFSDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable DatasetCompressionResponse compression;
        private @Nullable String description;
        private @Nullable Object fileName;
        private @Nullable DatasetResponseFolder folder;
        private @Nullable Object folderPath;
        private @Nullable Object format;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFSDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.fileName = defaults.fileName;
    	      this.folder = defaults.folder;
    	      this.folderPath = defaults.folderPath;
    	      this.format = defaults.format;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setCompression(@Nullable DatasetCompressionResponse compression) {
            this.compression = compression;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setFolder(@Nullable DatasetResponseFolder folder) {
            this.folder = folder;
            return this;
        }

        public Builder setFolderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setFormat(@Nullable Object format) {
            this.format = format;
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setSchema(@Nullable Object schema) {
            this.schema = schema;
            return this;
        }

        public Builder setStructure(@Nullable Object structure) {
            this.structure = structure;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureBlobFSDatasetResponse build() {
            return new AzureBlobFSDatasetResponse(annotations, compression, description, fileName, folder, folderPath, format, linkedServiceName, parameters, schema, structure, type);
        }
    }
}
