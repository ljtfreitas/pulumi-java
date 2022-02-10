// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.DatasetResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureMariaDBTableDatasetResponse {
    private final @Nullable List<Object> annotations;
    private final @Nullable String description;
    private final @Nullable DatasetResponseFolder folder;
    private final LinkedServiceReferenceResponse linkedServiceName;
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    private final @Nullable Object schema;
    private final @Nullable Object structure;
    private final @Nullable Object tableName;
    private final String type;

    @OutputCustomType.Constructor({"annotations","description","folder","linkedServiceName","parameters","schema","structure","tableName","type"})
    private AzureMariaDBTableDatasetResponse(
        @Nullable List<Object> annotations,
        @Nullable String description,
        @Nullable DatasetResponseFolder folder,
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object schema,
        @Nullable Object structure,
        @Nullable Object tableName,
        String type) {
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.tableName = tableName;
        this.type = Objects.requireNonNull(type);
    }

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<DatasetResponseFolder> getFolder() {
        return Optional.ofNullable(this.folder);
    }
    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<Object> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    public Optional<Object> getStructure() {
        return Optional.ofNullable(this.structure);
    }
    public Optional<Object> getTableName() {
        return Optional.ofNullable(this.tableName);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMariaDBTableDatasetResponse defaults) {
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
        private @Nullable Object tableName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMariaDBTableDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
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

        public Builder setTableName(@Nullable Object tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AzureMariaDBTableDatasetResponse build() {
            return new AzureMariaDBTableDatasetResponse(annotations, description, folder, linkedServiceName, parameters, schema, structure, tableName, type);
        }
    }
}