// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SchemaSettingsResponse {
    /**
     * The encoding of messages validated against `schema`.
     * 
     */
    private final String encoding;
    /**
     * The name of the schema that messages published should be validated against. Format is `projects/{project}/schemas/{schema}`. The value of this field will be `_deleted-schema_` if the schema has been deleted.
     * 
     */
    private final String schema;

    @CustomType.Constructor
    private SchemaSettingsResponse(
        @CustomType.Parameter("encoding") String encoding,
        @CustomType.Parameter("schema") String schema) {
        this.encoding = encoding;
        this.schema = schema;
    }

    /**
     * The encoding of messages validated against `schema`.
     * 
    */
    public String getEncoding() {
        return this.encoding;
    }
    /**
     * The name of the schema that messages published should be validated against. Format is `projects/{project}/schemas/{schema}`. The value of this field will be `_deleted-schema_` if the schema has been deleted.
     * 
    */
    public String getSchema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encoding;
        private String schema;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.schema = defaults.schema;
        }

        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        public SchemaSettingsResponse build() {
            return new SchemaSettingsResponse(encoding, schema);
        }
    }
}
