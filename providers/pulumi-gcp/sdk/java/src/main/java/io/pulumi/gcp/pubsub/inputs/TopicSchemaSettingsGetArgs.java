// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicSchemaSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicSchemaSettingsGetArgs Empty = new TopicSchemaSettingsGetArgs();

    /**
     * The encoding of messages validated against schema.
     * Default value is `ENCODING_UNSPECIFIED`.
     * Possible values are `ENCODING_UNSPECIFIED`, `JSON`, and `BINARY`.
     * 
     */
    @Import(name="encoding")
      private final @Nullable Output<String> encoding;

    public Output<String> getEncoding() {
        return this.encoding == null ? Output.empty() : this.encoding;
    }

    /**
     * The name of the schema that messages published should be
     * validated against. Format is projects/{project}/schemas/{schema}.
     * The value of this field will be _deleted-schema_
     * if the schema has been deleted.
     * 
     */
    @Import(name="schema", required=true)
      private final Output<String> schema;

    public Output<String> getSchema() {
        return this.schema;
    }

    public TopicSchemaSettingsGetArgs(
        @Nullable Output<String> encoding,
        Output<String> schema) {
        this.encoding = encoding;
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
    }

    private TopicSchemaSettingsGetArgs() {
        this.encoding = Output.empty();
        this.schema = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicSchemaSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> encoding;
        private Output<String> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicSchemaSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.schema = defaults.schema;
        }

        public Builder encoding(@Nullable Output<String> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder encoding(@Nullable String encoding) {
            this.encoding = Output.ofNullable(encoding);
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
        public TopicSchemaSettingsGetArgs build() {
            return new TopicSchemaSettingsGetArgs(encoding, schema);
        }
    }
}
