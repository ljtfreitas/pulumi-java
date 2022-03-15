// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DatasetResponseFolder;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The on-premises Oracle database dataset.
 * 
 */
public final class OracleTableDatasetResponse extends io.pulumi.resources.InvokeArgs {

    public static final OracleTableDatasetResponse Empty = new OracleTableDatasetResponse();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
      private final @Nullable DatasetResponseFolder folder;

    public Optional<DatasetResponseFolder> getFolder() {
        return this.folder == null ? Optional.empty() : Optional.ofNullable(this.folder);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final LinkedServiceReferenceResponse linkedServiceName;

    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
      private final @Nullable Object schema;

    public Optional<Object> getSchema() {
        return this.schema == null ? Optional.empty() : Optional.ofNullable(this.schema);
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
      private final @Nullable Object structure;

    public Optional<Object> getStructure() {
        return this.structure == null ? Optional.empty() : Optional.ofNullable(this.structure);
    }

    /**
     * The table name of the on-premises Oracle database. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="table")
      private final @Nullable Object table;

    public Optional<Object> getTable() {
        return this.table == null ? Optional.empty() : Optional.ofNullable(this.table);
    }

    /**
     * This property will be retired. Please consider using schema + table properties instead.
     * 
     */
    @Import(name="tableName")
      private final @Nullable Object tableName;

    public Optional<Object> getTableName() {
        return this.tableName == null ? Optional.empty() : Optional.ofNullable(this.tableName);
    }

    /**
     * Type of dataset.
     * Expected value is 'OracleTable'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public OracleTableDatasetResponse(
        @Nullable List<Object> annotations,
        @Nullable String description,
        @Nullable DatasetResponseFolder folder,
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object schema,
        @Nullable Object structure,
        @Nullable Object table,
        @Nullable Object tableName,
        String type) {
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.table = table;
        this.tableName = tableName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OracleTableDatasetResponse() {
        this.annotations = List.of();
        this.description = null;
        this.folder = null;
        this.linkedServiceName = null;
        this.parameters = Map.of();
        this.schema = null;
        this.structure = null;
        this.table = null;
        this.tableName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleTableDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private @Nullable DatasetResponseFolder folder;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private @Nullable Object table;
        private @Nullable Object tableName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleTableDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.table = defaults.table;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder folder(@Nullable DatasetResponseFolder folder) {
            this.folder = folder;
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder schema(@Nullable Object schema) {
            this.schema = schema;
            return this;
        }

        public Builder structure(@Nullable Object structure) {
            this.structure = structure;
            return this;
        }

        public Builder table(@Nullable Object table) {
            this.table = table;
            return this;
        }

        public Builder tableName(@Nullable Object tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public OracleTableDatasetResponse build() {
            return new OracleTableDatasetResponse(annotations, description, folder, linkedServiceName, parameters, schema, structure, table, tableName, type);
        }
    }
}
