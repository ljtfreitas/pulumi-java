// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationCsvOptionsArgs;
import io.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationGoogleSheetsOptionsArgs;
import io.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationHivePartitioningOptionsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableExternalDataConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableExternalDataConfigurationArgs Empty = new TableExternalDataConfigurationArgs();

    /**
     * - Let BigQuery try to autodetect the schema
     *   and format of the table.
     * 
     */
    @InputImport(name="autodetect", required=true)
        private final Input<Boolean> autodetect;

    public Input<Boolean> getAutodetect() {
        return this.autodetect;
    }

    /**
     * The compression type of the data source.
     * Valid values are "NONE" or "GZIP".
     * 
     */
    @InputImport(name="compression")
        private final @Nullable Input<String> compression;

    public Input<String> getCompression() {
        return this.compression == null ? Input.empty() : this.compression;
    }

    /**
     * Additional properties to set if
     * `source_format` is set to "CSV". Structure is documented below.
     * 
     */
    @InputImport(name="csvOptions")
        private final @Nullable Input<TableExternalDataConfigurationCsvOptionsArgs> csvOptions;

    public Input<TableExternalDataConfigurationCsvOptionsArgs> getCsvOptions() {
        return this.csvOptions == null ? Input.empty() : this.csvOptions;
    }

    /**
     * Additional options if
     * `source_format` is set to "GOOGLE_SHEETS". Structure is
     * documented below.
     * 
     */
    @InputImport(name="googleSheetsOptions")
        private final @Nullable Input<TableExternalDataConfigurationGoogleSheetsOptionsArgs> googleSheetsOptions;

    public Input<TableExternalDataConfigurationGoogleSheetsOptionsArgs> getGoogleSheetsOptions() {
        return this.googleSheetsOptions == null ? Input.empty() : this.googleSheetsOptions;
    }

    /**
     * When set, configures hive partitioning
     * support. Not all storage formats support hive partitioning -- requesting hive
     * partitioning on an unsupported format will lead to an error, as will providing
     * an invalid specification. Structure is documented below.
     * 
     */
    @InputImport(name="hivePartitioningOptions")
        private final @Nullable Input<TableExternalDataConfigurationHivePartitioningOptionsArgs> hivePartitioningOptions;

    public Input<TableExternalDataConfigurationHivePartitioningOptionsArgs> getHivePartitioningOptions() {
        return this.hivePartitioningOptions == null ? Input.empty() : this.hivePartitioningOptions;
    }

    /**
     * Indicates if BigQuery should
     * allow extra values that are not represented in the table schema.
     * If true, the extra values are ignored. If false, records with
     * extra columns are treated as bad records, and if there are too
     * many bad records, an invalid error is returned in the job result.
     * The default value is false.
     * 
     */
    @InputImport(name="ignoreUnknownValues")
        private final @Nullable Input<Boolean> ignoreUnknownValues;

    public Input<Boolean> getIgnoreUnknownValues() {
        return this.ignoreUnknownValues == null ? Input.empty() : this.ignoreUnknownValues;
    }

    /**
     * The maximum number of bad records that
     * BigQuery can ignore when reading data.
     * 
     */
    @InputImport(name="maxBadRecords")
        private final @Nullable Input<Integer> maxBadRecords;

    public Input<Integer> getMaxBadRecords() {
        return this.maxBadRecords == null ? Input.empty() : this.maxBadRecords;
    }

    /**
     * A JSON schema for the external table. Schema is required
     * for CSV and JSON formats if autodetect is not on. Schema is disallowed
     * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
     * ~>**NOTE:** Because this field expects a JSON string, any changes to the
     * string will create a diff, even if the JSON itself hasn't changed.
     * Furthermore drift for this field cannot not be detected because BigQuery
     * only uses this schema to compute the effective schema for the table, therefore
     * any changes on the configured value will force the table to be recreated.
     * This schema is effectively only applied when creating a table from an external
     * datasource, after creation the computed schema will be stored in
     * `google_bigquery_table.schema`
     * 
     */
    @InputImport(name="schema")
        private final @Nullable Input<String> schema;

    public Input<String> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * The data format. Supported values are:
     * "CSV", "GOOGLE_SHEETS", "NEWLINE_DELIMITED_JSON", "AVRO", "PARQUET", "ORC",
     * "DATSTORE_BACKUP", and "BIGTABLE". To use "GOOGLE_SHEETS"
     * the `scopes` must include
     * "https://www.googleapis.com/auth/drive.readonly".
     * 
     */
    @InputImport(name="sourceFormat", required=true)
        private final Input<String> sourceFormat;

    public Input<String> getSourceFormat() {
        return this.sourceFormat;
    }

    /**
     * A list of the fully-qualified URIs that point to
     * your data in Google Cloud.
     * 
     */
    @InputImport(name="sourceUris", required=true)
        private final Input<List<String>> sourceUris;

    public Input<List<String>> getSourceUris() {
        return this.sourceUris;
    }

    public TableExternalDataConfigurationArgs(
        Input<Boolean> autodetect,
        @Nullable Input<String> compression,
        @Nullable Input<TableExternalDataConfigurationCsvOptionsArgs> csvOptions,
        @Nullable Input<TableExternalDataConfigurationGoogleSheetsOptionsArgs> googleSheetsOptions,
        @Nullable Input<TableExternalDataConfigurationHivePartitioningOptionsArgs> hivePartitioningOptions,
        @Nullable Input<Boolean> ignoreUnknownValues,
        @Nullable Input<Integer> maxBadRecords,
        @Nullable Input<String> schema,
        Input<String> sourceFormat,
        Input<List<String>> sourceUris) {
        this.autodetect = Objects.requireNonNull(autodetect, "expected parameter 'autodetect' to be non-null");
        this.compression = compression;
        this.csvOptions = csvOptions;
        this.googleSheetsOptions = googleSheetsOptions;
        this.hivePartitioningOptions = hivePartitioningOptions;
        this.ignoreUnknownValues = ignoreUnknownValues;
        this.maxBadRecords = maxBadRecords;
        this.schema = schema;
        this.sourceFormat = Objects.requireNonNull(sourceFormat, "expected parameter 'sourceFormat' to be non-null");
        this.sourceUris = Objects.requireNonNull(sourceUris, "expected parameter 'sourceUris' to be non-null");
    }

    private TableExternalDataConfigurationArgs() {
        this.autodetect = Input.empty();
        this.compression = Input.empty();
        this.csvOptions = Input.empty();
        this.googleSheetsOptions = Input.empty();
        this.hivePartitioningOptions = Input.empty();
        this.ignoreUnknownValues = Input.empty();
        this.maxBadRecords = Input.empty();
        this.schema = Input.empty();
        this.sourceFormat = Input.empty();
        this.sourceUris = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> autodetect;
        private @Nullable Input<String> compression;
        private @Nullable Input<TableExternalDataConfigurationCsvOptionsArgs> csvOptions;
        private @Nullable Input<TableExternalDataConfigurationGoogleSheetsOptionsArgs> googleSheetsOptions;
        private @Nullable Input<TableExternalDataConfigurationHivePartitioningOptionsArgs> hivePartitioningOptions;
        private @Nullable Input<Boolean> ignoreUnknownValues;
        private @Nullable Input<Integer> maxBadRecords;
        private @Nullable Input<String> schema;
        private Input<String> sourceFormat;
        private Input<List<String>> sourceUris;

        public Builder() {
    	      // Empty
        }

        public Builder(TableExternalDataConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autodetect = defaults.autodetect;
    	      this.compression = defaults.compression;
    	      this.csvOptions = defaults.csvOptions;
    	      this.googleSheetsOptions = defaults.googleSheetsOptions;
    	      this.hivePartitioningOptions = defaults.hivePartitioningOptions;
    	      this.ignoreUnknownValues = defaults.ignoreUnknownValues;
    	      this.maxBadRecords = defaults.maxBadRecords;
    	      this.schema = defaults.schema;
    	      this.sourceFormat = defaults.sourceFormat;
    	      this.sourceUris = defaults.sourceUris;
        }

        public Builder setAutodetect(Input<Boolean> autodetect) {
            this.autodetect = Objects.requireNonNull(autodetect);
            return this;
        }

        public Builder setAutodetect(Boolean autodetect) {
            this.autodetect = Input.of(Objects.requireNonNull(autodetect));
            return this;
        }

        public Builder setCompression(@Nullable Input<String> compression) {
            this.compression = compression;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = Input.ofNullable(compression);
            return this;
        }

        public Builder setCsvOptions(@Nullable Input<TableExternalDataConfigurationCsvOptionsArgs> csvOptions) {
            this.csvOptions = csvOptions;
            return this;
        }

        public Builder setCsvOptions(@Nullable TableExternalDataConfigurationCsvOptionsArgs csvOptions) {
            this.csvOptions = Input.ofNullable(csvOptions);
            return this;
        }

        public Builder setGoogleSheetsOptions(@Nullable Input<TableExternalDataConfigurationGoogleSheetsOptionsArgs> googleSheetsOptions) {
            this.googleSheetsOptions = googleSheetsOptions;
            return this;
        }

        public Builder setGoogleSheetsOptions(@Nullable TableExternalDataConfigurationGoogleSheetsOptionsArgs googleSheetsOptions) {
            this.googleSheetsOptions = Input.ofNullable(googleSheetsOptions);
            return this;
        }

        public Builder setHivePartitioningOptions(@Nullable Input<TableExternalDataConfigurationHivePartitioningOptionsArgs> hivePartitioningOptions) {
            this.hivePartitioningOptions = hivePartitioningOptions;
            return this;
        }

        public Builder setHivePartitioningOptions(@Nullable TableExternalDataConfigurationHivePartitioningOptionsArgs hivePartitioningOptions) {
            this.hivePartitioningOptions = Input.ofNullable(hivePartitioningOptions);
            return this;
        }

        public Builder setIgnoreUnknownValues(@Nullable Input<Boolean> ignoreUnknownValues) {
            this.ignoreUnknownValues = ignoreUnknownValues;
            return this;
        }

        public Builder setIgnoreUnknownValues(@Nullable Boolean ignoreUnknownValues) {
            this.ignoreUnknownValues = Input.ofNullable(ignoreUnknownValues);
            return this;
        }

        public Builder setMaxBadRecords(@Nullable Input<Integer> maxBadRecords) {
            this.maxBadRecords = maxBadRecords;
            return this;
        }

        public Builder setMaxBadRecords(@Nullable Integer maxBadRecords) {
            this.maxBadRecords = Input.ofNullable(maxBadRecords);
            return this;
        }

        public Builder setSchema(@Nullable Input<String> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable String schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setSourceFormat(Input<String> sourceFormat) {
            this.sourceFormat = Objects.requireNonNull(sourceFormat);
            return this;
        }

        public Builder setSourceFormat(String sourceFormat) {
            this.sourceFormat = Input.of(Objects.requireNonNull(sourceFormat));
            return this;
        }

        public Builder setSourceUris(Input<List<String>> sourceUris) {
            this.sourceUris = Objects.requireNonNull(sourceUris);
            return this;
        }

        public Builder setSourceUris(List<String> sourceUris) {
            this.sourceUris = Input.of(Objects.requireNonNull(sourceUris));
            return this;
        }
        public TableExternalDataConfigurationArgs build() {
            return new TableExternalDataConfigurationArgs(autodetect, compression, csvOptions, googleSheetsOptions, hivePartitioningOptions, ignoreUnknownValues, maxBadRecords, schema, sourceFormat, sourceUris);
        }
    }
}
