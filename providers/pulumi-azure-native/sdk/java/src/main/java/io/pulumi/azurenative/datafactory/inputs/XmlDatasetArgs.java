// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonS3LocationArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobStorageLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureFileStorageLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.DatasetCompressionArgs;
import io.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import io.pulumi.azurenative.datafactory.inputs.FileServerLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.FtpServerLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.HdfsLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.HttpServerLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.OracleCloudStorageLocationArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SftpLocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Xml dataset.
 * 
 */
public final class XmlDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final XmlDatasetArgs Empty = new XmlDatasetArgs();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * The data compression method used for the json dataset.
     * 
     */
    @InputImport(name="compression")
    private final @Nullable Input<DatasetCompressionArgs> compression;

    public Input<DatasetCompressionArgs> getCompression() {
        return this.compression == null ? Input.empty() : this.compression;
    }

    /**
     * Dataset description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The code page name of the preferred encoding. If not specified, the default value is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encodingName")
    private final @Nullable Input<Object> encodingName;

    public Input<Object> getEncodingName() {
        return this.encodingName == null ? Input.empty() : this.encodingName;
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @InputImport(name="folder")
    private final @Nullable Input<DatasetFolderArgs> folder;

    public Input<DatasetFolderArgs> getFolder() {
        return this.folder == null ? Input.empty() : this.folder;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName", required=true)
    private final Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The location of the json data storage.
     * 
     */
    @InputImport(name="location", required=true)
    private final Input<Object> location;

    public Input<Object> getLocation() {
        return this.location;
    }

    /**
     * The null value string. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="nullValue")
    private final @Nullable Input<Object> nullValue;

    public Input<Object> getNullValue() {
        return this.nullValue == null ? Input.empty() : this.nullValue;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @InputImport(name="schema")
    private final @Nullable Input<Object> schema;

    public Input<Object> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @InputImport(name="structure")
    private final @Nullable Input<Object> structure;

    public Input<Object> getStructure() {
        return this.structure == null ? Input.empty() : this.structure;
    }

    /**
     * Type of dataset.
     * Expected value is 'Xml'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public XmlDatasetArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<DatasetCompressionArgs> compression,
        @Nullable Input<String> description,
        @Nullable Input<Object> encodingName,
        @Nullable Input<DatasetFolderArgs> folder,
        Input<LinkedServiceReferenceArgs> linkedServiceName,
        Input<Object> location,
        @Nullable Input<Object> nullValue,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Object> schema,
        @Nullable Input<Object> structure,
        Input<String> type) {
        this.annotations = annotations;
        this.compression = compression;
        this.description = description;
        this.encodingName = encodingName;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.nullValue = nullValue;
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private XmlDatasetArgs() {
        this.annotations = Input.empty();
        this.compression = Input.empty();
        this.description = Input.empty();
        this.encodingName = Input.empty();
        this.folder = Input.empty();
        this.linkedServiceName = Input.empty();
        this.location = Input.empty();
        this.nullValue = Input.empty();
        this.parameters = Input.empty();
        this.schema = Input.empty();
        this.structure = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XmlDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<DatasetCompressionArgs> compression;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encodingName;
        private @Nullable Input<DatasetFolderArgs> folder;
        private Input<LinkedServiceReferenceArgs> linkedServiceName;
        private Input<Object> location;
        private @Nullable Input<Object> nullValue;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Object> schema;
        private @Nullable Input<Object> structure;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(XmlDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.encodingName = defaults.encodingName;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.location = defaults.location;
    	      this.nullValue = defaults.nullValue;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setCompression(@Nullable Input<DatasetCompressionArgs> compression) {
            this.compression = compression;
            return this;
        }

        public Builder setCompression(@Nullable DatasetCompressionArgs compression) {
            this.compression = Input.ofNullable(compression);
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

        public Builder setEncodingName(@Nullable Input<Object> encodingName) {
            this.encodingName = encodingName;
            return this;
        }

        public Builder setEncodingName(@Nullable Object encodingName) {
            this.encodingName = Input.ofNullable(encodingName);
            return this;
        }

        public Builder setFolder(@Nullable Input<DatasetFolderArgs> folder) {
            this.folder = folder;
            return this;
        }

        public Builder setFolder(@Nullable DatasetFolderArgs folder) {
            this.folder = Input.ofNullable(folder);
            return this;
        }

        public Builder setLinkedServiceName(Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }

        public Builder setLocation(Input<Object> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(Object location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setNullValue(@Nullable Input<Object> nullValue) {
            this.nullValue = nullValue;
            return this;
        }

        public Builder setNullValue(@Nullable Object nullValue) {
            this.nullValue = Input.ofNullable(nullValue);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setSchema(@Nullable Input<Object> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable Object schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setStructure(@Nullable Input<Object> structure) {
            this.structure = structure;
            return this;
        }

        public Builder setStructure(@Nullable Object structure) {
            this.structure = Input.ofNullable(structure);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public XmlDatasetArgs build() {
            return new XmlDatasetArgs(annotations, compression, description, encodingName, folder, linkedServiceName, location, nullValue, parameters, schema, structure, type);
        }
    }
}
