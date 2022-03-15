// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelArgs Empty = new ModelArgs();

    /**
     * The API identifier.
     * 
     */
    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
     * 
     */
    @Import(name="contentType", required=true)
      private final Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType;
    }

    /**
     * The description of the model. Must be between 1 and 128 characters in length.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
     * 
     */
    @Import(name="schema", required=true)
      private final Output<String> schema;

    public Output<String> getSchema() {
        return this.schema;
    }

    public ModelArgs(
        Output<String> apiId,
        Output<String> contentType,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<String> schema) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.description = description;
        this.name = name;
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
    }

    private ModelArgs() {
        this.apiId = Output.empty();
        this.contentType = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.schema = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private Output<String> contentType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<String> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.contentType = defaults.contentType;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder contentType(Output<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Output.of(Objects.requireNonNull(contentType));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder schema(Output<String> schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder schema(String schema) {
            this.schema = Output.of(Objects.requireNonNull(schema));
            return this;
        }
        public ModelArgs build() {
            return new ModelArgs(apiId, contentType, description, name, schema);
        }
    }
}
