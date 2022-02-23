// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.AmazonS3LocationResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobStorageLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureFileStorageLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.DatasetResponseFolder;
import io.pulumi.azurenative.datafactory.inputs.FileServerLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.FtpServerLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.HdfsLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.HttpServerLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.OracleCloudStorageLocationResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SftpLocationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parquet dataset.
 * 
 */
public final class ParquetDatasetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ParquetDatasetResponse Empty = new ParquetDatasetResponse();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @InputImport(name="annotations")
        private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The data compressionCodec. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="compressionCodec")
        private final @Nullable Object compressionCodec;

    public Optional<Object> getCompressionCodec() {
        return this.compressionCodec == null ? Optional.empty() : Optional.ofNullable(this.compressionCodec);
    }

    /**
     * Dataset description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @InputImport(name="folder")
        private final @Nullable DatasetResponseFolder folder;

    public Optional<DatasetResponseFolder> getFolder() {
        return this.folder == null ? Optional.empty() : Optional.ofNullable(this.folder);
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName", required=true)
        private final LinkedServiceReferenceResponse linkedServiceName;

    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The location of the parquet storage.
     * 
     */
    @InputImport(name="location", required=true)
        private final Object location;

    public Object getLocation() {
        return this.location;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @InputImport(name="schema")
        private final @Nullable Object schema;

    public Optional<Object> getSchema() {
        return this.schema == null ? Optional.empty() : Optional.ofNullable(this.schema);
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @InputImport(name="structure")
        private final @Nullable Object structure;

    public Optional<Object> getStructure() {
        return this.structure == null ? Optional.empty() : Optional.ofNullable(this.structure);
    }

    /**
     * Type of dataset.
     * Expected value is 'Parquet'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public ParquetDatasetResponse(
        @Nullable List<Object> annotations,
        @Nullable Object compressionCodec,
        @Nullable String description,
        @Nullable DatasetResponseFolder folder,
        LinkedServiceReferenceResponse linkedServiceName,
        Object location,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object schema,
        @Nullable Object structure,
        String type) {
        this.annotations = annotations;
        this.compressionCodec = compressionCodec;
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ParquetDatasetResponse() {
        this.annotations = List.of();
        this.compressionCodec = null;
        this.description = null;
        this.folder = null;
        this.linkedServiceName = null;
        this.location = null;
        this.parameters = Map.of();
        this.schema = null;
        this.structure = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParquetDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object compressionCodec;
        private @Nullable String description;
        private @Nullable DatasetResponseFolder folder;
        private LinkedServiceReferenceResponse linkedServiceName;
        private Object location;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParquetDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.compressionCodec = defaults.compressionCodec;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.location = defaults.location;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setCompressionCodec(@Nullable Object compressionCodec) {
            this.compressionCodec = compressionCodec;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFolder(@Nullable DatasetResponseFolder folder) {
            this.folder = folder;
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setLocation(Object location) {
            this.location = Objects.requireNonNull(location);
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
        public ParquetDatasetResponse build() {
            return new ParquetDatasetResponse(annotations, compressionCodec, description, folder, linkedServiceName, location, parameters, schema, structure, type);
        }
    }
}
