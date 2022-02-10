// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RestResourceDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestResourceDatasetArgs Empty = new RestResourceDatasetArgs();

    @InputImport(name="additionalHeaders")
    private final @Nullable Input<Object> additionalHeaders;

    public Input<Object> getAdditionalHeaders() {
        return this.additionalHeaders == null ? Input.empty() : this.additionalHeaders;
    }

    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="folder")
    private final @Nullable Input<DatasetFolderArgs> folder;

    public Input<DatasetFolderArgs> getFolder() {
        return this.folder == null ? Input.empty() : this.folder;
    }

    @InputImport(name="linkedServiceName", required=true)
    private final Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    @InputImport(name="paginationRules")
    private final @Nullable Input<Object> paginationRules;

    public Input<Object> getPaginationRules() {
        return this.paginationRules == null ? Input.empty() : this.paginationRules;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="relativeUrl")
    private final @Nullable Input<Object> relativeUrl;

    public Input<Object> getRelativeUrl() {
        return this.relativeUrl == null ? Input.empty() : this.relativeUrl;
    }

    @InputImport(name="requestBody")
    private final @Nullable Input<Object> requestBody;

    public Input<Object> getRequestBody() {
        return this.requestBody == null ? Input.empty() : this.requestBody;
    }

    @InputImport(name="requestMethod")
    private final @Nullable Input<Object> requestMethod;

    public Input<Object> getRequestMethod() {
        return this.requestMethod == null ? Input.empty() : this.requestMethod;
    }

    @InputImport(name="schema")
    private final @Nullable Input<Object> schema;

    public Input<Object> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    @InputImport(name="structure")
    private final @Nullable Input<Object> structure;

    public Input<Object> getStructure() {
        return this.structure == null ? Input.empty() : this.structure;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public RestResourceDatasetArgs(
        @Nullable Input<Object> additionalHeaders,
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<String> description,
        @Nullable Input<DatasetFolderArgs> folder,
        Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<Object> paginationRules,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Object> relativeUrl,
        @Nullable Input<Object> requestBody,
        @Nullable Input<Object> requestMethod,
        @Nullable Input<Object> schema,
        @Nullable Input<Object> structure,
        Input<String> type) {
        this.additionalHeaders = additionalHeaders;
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.paginationRules = paginationRules;
        this.parameters = parameters;
        this.relativeUrl = relativeUrl;
        this.requestBody = requestBody;
        this.requestMethod = requestMethod;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RestResourceDatasetArgs() {
        this.additionalHeaders = Input.empty();
        this.annotations = Input.empty();
        this.description = Input.empty();
        this.folder = Input.empty();
        this.linkedServiceName = Input.empty();
        this.paginationRules = Input.empty();
        this.parameters = Input.empty();
        this.relativeUrl = Input.empty();
        this.requestBody = Input.empty();
        this.requestMethod = Input.empty();
        this.schema = Input.empty();
        this.structure = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestResourceDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> additionalHeaders;
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<String> description;
        private @Nullable Input<DatasetFolderArgs> folder;
        private Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<Object> paginationRules;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Object> relativeUrl;
        private @Nullable Input<Object> requestBody;
        private @Nullable Input<Object> requestMethod;
        private @Nullable Input<Object> schema;
        private @Nullable Input<Object> structure;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RestResourceDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalHeaders = defaults.additionalHeaders;
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.paginationRules = defaults.paginationRules;
    	      this.parameters = defaults.parameters;
    	      this.relativeUrl = defaults.relativeUrl;
    	      this.requestBody = defaults.requestBody;
    	      this.requestMethod = defaults.requestMethod;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalHeaders(@Nullable Input<Object> additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }

        public Builder setAdditionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = Input.ofNullable(additionalHeaders);
            return this;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
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

        public Builder setPaginationRules(@Nullable Input<Object> paginationRules) {
            this.paginationRules = paginationRules;
            return this;
        }

        public Builder setPaginationRules(@Nullable Object paginationRules) {
            this.paginationRules = Input.ofNullable(paginationRules);
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

        public Builder setRelativeUrl(@Nullable Input<Object> relativeUrl) {
            this.relativeUrl = relativeUrl;
            return this;
        }

        public Builder setRelativeUrl(@Nullable Object relativeUrl) {
            this.relativeUrl = Input.ofNullable(relativeUrl);
            return this;
        }

        public Builder setRequestBody(@Nullable Input<Object> requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        public Builder setRequestBody(@Nullable Object requestBody) {
            this.requestBody = Input.ofNullable(requestBody);
            return this;
        }

        public Builder setRequestMethod(@Nullable Input<Object> requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder setRequestMethod(@Nullable Object requestMethod) {
            this.requestMethod = Input.ofNullable(requestMethod);
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

        public RestResourceDatasetArgs build() {
            return new RestResourceDatasetArgs(additionalHeaders, annotations, description, folder, linkedServiceName, paginationRules, parameters, relativeUrl, requestBody, requestMethod, schema, structure, type);
        }
    }
}