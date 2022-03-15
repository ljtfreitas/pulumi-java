// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A column within a schema. Columns can be nested inside other columns.
 * 
 */
public final class GoogleCloudDatacatalogV1ColumnSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1ColumnSchemaArgs Empty = new GoogleCloudDatacatalogV1ColumnSchemaArgs();

    /**
     * Name of the column. Must be a UTF-8 string without dots (.). The maximum size is 64 bytes.
     * 
     */
    @Import(name="column", required=true)
      private final Output<String> column;

    public Output<String> getColumn() {
        return this.column;
    }

    /**
     * Optional. Description of the column. Default value is an empty string. The description must be a UTF-8 string with the maximum size of 2000 bytes.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Optional. A column's mode indicates whether values in this column are required, nullable, or repeated. Only `NULLABLE`, `REQUIRED`, and `REPEATED` values are supported. Default mode is `NULLABLE`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * Optional. Schema of sub-columns. A column can have zero or more sub-columns.
     * 
     */
    @Import(name="subcolumns")
      private final @Nullable Output<List<GoogleCloudDatacatalogV1ColumnSchemaArgs>> subcolumns;

    public Output<List<GoogleCloudDatacatalogV1ColumnSchemaArgs>> getSubcolumns() {
        return this.subcolumns == null ? Output.empty() : this.subcolumns;
    }

    /**
     * Type of the column. Must be a UTF-8 string with the maximum size of 128 bytes.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public GoogleCloudDatacatalogV1ColumnSchemaArgs(
        Output<String> column,
        @Nullable Output<String> description,
        @Nullable Output<String> mode,
        @Nullable Output<List<GoogleCloudDatacatalogV1ColumnSchemaArgs>> subcolumns,
        Output<String> type) {
        this.column = Objects.requireNonNull(column, "expected parameter 'column' to be non-null");
        this.description = description;
        this.mode = mode;
        this.subcolumns = subcolumns;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDatacatalogV1ColumnSchemaArgs() {
        this.column = Output.empty();
        this.description = Output.empty();
        this.mode = Output.empty();
        this.subcolumns = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1ColumnSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> column;
        private @Nullable Output<String> description;
        private @Nullable Output<String> mode;
        private @Nullable Output<List<GoogleCloudDatacatalogV1ColumnSchemaArgs>> subcolumns;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1ColumnSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.description = defaults.description;
    	      this.mode = defaults.mode;
    	      this.subcolumns = defaults.subcolumns;
    	      this.type = defaults.type;
        }

        public Builder column(Output<String> column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }

        public Builder column(String column) {
            this.column = Output.of(Objects.requireNonNull(column));
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

        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }

        public Builder subcolumns(@Nullable Output<List<GoogleCloudDatacatalogV1ColumnSchemaArgs>> subcolumns) {
            this.subcolumns = subcolumns;
            return this;
        }

        public Builder subcolumns(@Nullable List<GoogleCloudDatacatalogV1ColumnSchemaArgs> subcolumns) {
            this.subcolumns = Output.ofNullable(subcolumns);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public GoogleCloudDatacatalogV1ColumnSchemaArgs build() {
            return new GoogleCloudDatacatalogV1ColumnSchemaArgs(column, description, mode, subcolumns, type);
        }
    }
}
