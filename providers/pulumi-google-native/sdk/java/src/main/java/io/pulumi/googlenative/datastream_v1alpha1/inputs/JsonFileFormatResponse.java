// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * JSON file format configuration.
 * 
 */
public final class JsonFileFormatResponse extends io.pulumi.resources.InvokeArgs {

    public static final JsonFileFormatResponse Empty = new JsonFileFormatResponse();

    /**
     * Compression of the loaded JSON file.
     * 
     */
    @InputImport(name="compression", required=true)
      private final String compression;

    public String getCompression() {
        return this.compression;
    }

    /**
     * The schema file format along JSON data files.
     * 
     */
    @InputImport(name="schemaFileFormat", required=true)
      private final String schemaFileFormat;

    public String getSchemaFileFormat() {
        return this.schemaFileFormat;
    }

    public JsonFileFormatResponse(
        String compression,
        String schemaFileFormat) {
        this.compression = Objects.requireNonNull(compression, "expected parameter 'compression' to be non-null");
        this.schemaFileFormat = Objects.requireNonNull(schemaFileFormat, "expected parameter 'schemaFileFormat' to be non-null");
    }

    private JsonFileFormatResponse() {
        this.compression = null;
        this.schemaFileFormat = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonFileFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compression;
        private String schemaFileFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonFileFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.schemaFileFormat = defaults.schemaFileFormat;
        }

        public Builder setCompression(String compression) {
            this.compression = Objects.requireNonNull(compression);
            return this;
        }

        public Builder setSchemaFileFormat(String schemaFileFormat) {
            this.schemaFileFormat = Objects.requireNonNull(schemaFileFormat);
            return this;
        }
        public JsonFileFormatResponse build() {
            return new JsonFileFormatResponse(compression, schemaFileFormat);
        }
    }
}
