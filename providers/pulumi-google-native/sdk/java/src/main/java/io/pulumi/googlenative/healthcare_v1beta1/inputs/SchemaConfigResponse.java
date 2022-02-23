// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for the FHIR BigQuery schema. Determines how the server generates the schema.
 * 
 */
public final class SchemaConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SchemaConfigResponse Empty = new SchemaConfigResponse();

    /**
     * The depth for all recursive structures in the output analytics schema. For example, `concept` in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called `concept.concept` but not `concept.concept.concept`. If not specified or set to 0, the server will use the default value 2. The maximum depth allowed is 5.
     * 
     */
    @InputImport(name="recursiveStructureDepth", required=true)
      private final String recursiveStructureDepth;

    public String getRecursiveStructureDepth() {
        return this.recursiveStructureDepth;
    }

    /**
     * Specifies the output schema type. Schema type is required.
     * 
     */
    @InputImport(name="schemaType", required=true)
      private final String schemaType;

    public String getSchemaType() {
        return this.schemaType;
    }

    public SchemaConfigResponse(
        String recursiveStructureDepth,
        String schemaType) {
        this.recursiveStructureDepth = Objects.requireNonNull(recursiveStructureDepth, "expected parameter 'recursiveStructureDepth' to be non-null");
        this.schemaType = Objects.requireNonNull(schemaType, "expected parameter 'schemaType' to be non-null");
    }

    private SchemaConfigResponse() {
        this.recursiveStructureDepth = null;
        this.schemaType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recursiveStructureDepth;
        private String schemaType;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recursiveStructureDepth = defaults.recursiveStructureDepth;
    	      this.schemaType = defaults.schemaType;
        }

        public Builder setRecursiveStructureDepth(String recursiveStructureDepth) {
            this.recursiveStructureDepth = Objects.requireNonNull(recursiveStructureDepth);
            return this;
        }

        public Builder setSchemaType(String schemaType) {
            this.schemaType = Objects.requireNonNull(schemaType);
            return this;
        }
        public SchemaConfigResponse build() {
            return new SchemaConfigResponse(recursiveStructureDepth, schemaType);
        }
    }
}
