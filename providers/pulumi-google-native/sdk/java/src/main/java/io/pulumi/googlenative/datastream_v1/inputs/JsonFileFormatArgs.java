// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1.enums.JsonFileFormatCompression;
import io.pulumi.googlenative.datastream_v1.enums.JsonFileFormatSchemaFileFormat;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * JSON file format configuration.
 * 
 */
public final class JsonFileFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final JsonFileFormatArgs Empty = new JsonFileFormatArgs();

    /**
     * Compression of the loaded JSON file.
     * 
     */
    @InputImport(name="compression")
      private final @Nullable Input<JsonFileFormatCompression> compression;

    public Input<JsonFileFormatCompression> getCompression() {
        return this.compression == null ? Input.empty() : this.compression;
    }

    /**
     * The schema file format along JSON data files.
     * 
     */
    @InputImport(name="schemaFileFormat")
      private final @Nullable Input<JsonFileFormatSchemaFileFormat> schemaFileFormat;

    public Input<JsonFileFormatSchemaFileFormat> getSchemaFileFormat() {
        return this.schemaFileFormat == null ? Input.empty() : this.schemaFileFormat;
    }

    public JsonFileFormatArgs(
        @Nullable Input<JsonFileFormatCompression> compression,
        @Nullable Input<JsonFileFormatSchemaFileFormat> schemaFileFormat) {
        this.compression = compression;
        this.schemaFileFormat = schemaFileFormat;
    }

    private JsonFileFormatArgs() {
        this.compression = Input.empty();
        this.schemaFileFormat = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonFileFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JsonFileFormatCompression> compression;
        private @Nullable Input<JsonFileFormatSchemaFileFormat> schemaFileFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonFileFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.schemaFileFormat = defaults.schemaFileFormat;
        }

        public Builder setCompression(@Nullable Input<JsonFileFormatCompression> compression) {
            this.compression = compression;
            return this;
        }

        public Builder setCompression(@Nullable JsonFileFormatCompression compression) {
            this.compression = Input.ofNullable(compression);
            return this;
        }

        public Builder setSchemaFileFormat(@Nullable Input<JsonFileFormatSchemaFileFormat> schemaFileFormat) {
            this.schemaFileFormat = schemaFileFormat;
            return this;
        }

        public Builder setSchemaFileFormat(@Nullable JsonFileFormatSchemaFileFormat schemaFileFormat) {
            this.schemaFileFormat = Input.ofNullable(schemaFileFormat);
            return this;
        }
        public JsonFileFormatArgs build() {
            return new JsonFileFormatArgs(compression, schemaFileFormat);
        }
    }
}
