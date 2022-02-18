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
 * Delimited text dataset.
 * 
 */
public final class DelimitedTextDatasetResponse extends io.pulumi.resources.InvokeArgs {

    public static final DelimitedTextDatasetResponse Empty = new DelimitedTextDatasetResponse();

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
     * The column delimiter. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="columnDelimiter")
    private final @Nullable Object columnDelimiter;

    public Optional<Object> getColumnDelimiter() {
        return this.columnDelimiter == null ? Optional.empty() : Optional.ofNullable(this.columnDelimiter);
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
     * The data compression method used for DelimitedText.
     * 
     */
    @InputImport(name="compressionLevel")
    private final @Nullable Object compressionLevel;

    public Optional<Object> getCompressionLevel() {
        return this.compressionLevel == null ? Optional.empty() : Optional.ofNullable(this.compressionLevel);
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
     * The code page name of the preferred encoding. If miss, the default value is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encodingName")
    private final @Nullable Object encodingName;

    public Optional<Object> getEncodingName() {
        return this.encodingName == null ? Optional.empty() : Optional.ofNullable(this.encodingName);
    }

    /**
     * The escape character. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="escapeChar")
    private final @Nullable Object escapeChar;

    public Optional<Object> getEscapeChar() {
        return this.escapeChar == null ? Optional.empty() : Optional.ofNullable(this.escapeChar);
    }

    /**
     * When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="firstRowAsHeader")
    private final @Nullable Object firstRowAsHeader;

    public Optional<Object> getFirstRowAsHeader() {
        return this.firstRowAsHeader == null ? Optional.empty() : Optional.ofNullable(this.firstRowAsHeader);
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
     * The location of the delimited text storage.
     * 
     */
    @InputImport(name="location", required=true)
    private final Object location;

    public Object getLocation() {
        return this.location;
    }

    /**
     * The null value string. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="nullValue")
    private final @Nullable Object nullValue;

    public Optional<Object> getNullValue() {
        return this.nullValue == null ? Optional.empty() : Optional.ofNullable(this.nullValue);
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
     * The quote character. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="quoteChar")
    private final @Nullable Object quoteChar;

    public Optional<Object> getQuoteChar() {
        return this.quoteChar == null ? Optional.empty() : Optional.ofNullable(this.quoteChar);
    }

    /**
     * The row delimiter. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="rowDelimiter")
    private final @Nullable Object rowDelimiter;

    public Optional<Object> getRowDelimiter() {
        return this.rowDelimiter == null ? Optional.empty() : Optional.ofNullable(this.rowDelimiter);
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
     * Expected value is 'DelimitedText'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public DelimitedTextDatasetResponse(
        @Nullable List<Object> annotations,
        @Nullable Object columnDelimiter,
        @Nullable Object compressionCodec,
        @Nullable Object compressionLevel,
        @Nullable String description,
        @Nullable Object encodingName,
        @Nullable Object escapeChar,
        @Nullable Object firstRowAsHeader,
        @Nullable DatasetResponseFolder folder,
        LinkedServiceReferenceResponse linkedServiceName,
        Object location,
        @Nullable Object nullValue,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object quoteChar,
        @Nullable Object rowDelimiter,
        @Nullable Object schema,
        @Nullable Object structure,
        String type) {
        this.annotations = annotations;
        this.columnDelimiter = columnDelimiter;
        this.compressionCodec = compressionCodec;
        this.compressionLevel = compressionLevel;
        this.description = description;
        this.encodingName = encodingName;
        this.escapeChar = escapeChar;
        this.firstRowAsHeader = firstRowAsHeader;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.nullValue = nullValue;
        this.parameters = parameters;
        this.quoteChar = quoteChar;
        this.rowDelimiter = rowDelimiter;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DelimitedTextDatasetResponse() {
        this.annotations = List.of();
        this.columnDelimiter = null;
        this.compressionCodec = null;
        this.compressionLevel = null;
        this.description = null;
        this.encodingName = null;
        this.escapeChar = null;
        this.firstRowAsHeader = null;
        this.folder = null;
        this.linkedServiceName = null;
        this.location = null;
        this.nullValue = null;
        this.parameters = Map.of();
        this.quoteChar = null;
        this.rowDelimiter = null;
        this.schema = null;
        this.structure = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelimitedTextDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object columnDelimiter;
        private @Nullable Object compressionCodec;
        private @Nullable Object compressionLevel;
        private @Nullable String description;
        private @Nullable Object encodingName;
        private @Nullable Object escapeChar;
        private @Nullable Object firstRowAsHeader;
        private @Nullable DatasetResponseFolder folder;
        private LinkedServiceReferenceResponse linkedServiceName;
        private Object location;
        private @Nullable Object nullValue;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object quoteChar;
        private @Nullable Object rowDelimiter;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DelimitedTextDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.columnDelimiter = defaults.columnDelimiter;
    	      this.compressionCodec = defaults.compressionCodec;
    	      this.compressionLevel = defaults.compressionLevel;
    	      this.description = defaults.description;
    	      this.encodingName = defaults.encodingName;
    	      this.escapeChar = defaults.escapeChar;
    	      this.firstRowAsHeader = defaults.firstRowAsHeader;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.location = defaults.location;
    	      this.nullValue = defaults.nullValue;
    	      this.parameters = defaults.parameters;
    	      this.quoteChar = defaults.quoteChar;
    	      this.rowDelimiter = defaults.rowDelimiter;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setColumnDelimiter(@Nullable Object columnDelimiter) {
            this.columnDelimiter = columnDelimiter;
            return this;
        }

        public Builder setCompressionCodec(@Nullable Object compressionCodec) {
            this.compressionCodec = compressionCodec;
            return this;
        }

        public Builder setCompressionLevel(@Nullable Object compressionLevel) {
            this.compressionLevel = compressionLevel;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncodingName(@Nullable Object encodingName) {
            this.encodingName = encodingName;
            return this;
        }

        public Builder setEscapeChar(@Nullable Object escapeChar) {
            this.escapeChar = escapeChar;
            return this;
        }

        public Builder setFirstRowAsHeader(@Nullable Object firstRowAsHeader) {
            this.firstRowAsHeader = firstRowAsHeader;
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

        public Builder setNullValue(@Nullable Object nullValue) {
            this.nullValue = nullValue;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setQuoteChar(@Nullable Object quoteChar) {
            this.quoteChar = quoteChar;
            return this;
        }

        public Builder setRowDelimiter(@Nullable Object rowDelimiter) {
            this.rowDelimiter = rowDelimiter;
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

        public DelimitedTextDatasetResponse build() {
            return new DelimitedTextDatasetResponse(annotations, columnDelimiter, compressionCodec, compressionLevel, description, encodingName, escapeChar, firstRowAsHeader, folder, linkedServiceName, location, nullValue, parameters, quoteChar, rowDelimiter, schema, structure, type);
        }
    }
}
