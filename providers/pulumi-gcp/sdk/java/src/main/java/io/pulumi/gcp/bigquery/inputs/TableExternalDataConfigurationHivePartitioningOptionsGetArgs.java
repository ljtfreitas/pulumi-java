// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableExternalDataConfigurationHivePartitioningOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableExternalDataConfigurationHivePartitioningOptionsGetArgs Empty = new TableExternalDataConfigurationHivePartitioningOptionsGetArgs();

    /**
     * When set, what mode of hive partitioning to use when
     * reading data. The following modes are supported.
     * * AUTO: automatically infer partition key name(s) and type(s).
     * * STRINGS: automatically infer partition key name(s). All types are
     *   Not all storage formats support hive partitioning. Requesting hive
     *   partitioning on an unsupported format will lead to an error.
     *   Currently supported formats are: JSON, CSV, ORC, Avro and Parquet.
     * * CUSTOM: when set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    @InputImport(name="mode")
        private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * If set to true, queries over this table
     * require a partition filter that can be used for partition elimination to be
     * specified.
     * 
     */
    @InputImport(name="requirePartitionFilter")
        private final @Nullable Input<Boolean> requirePartitionFilter;

    public Input<Boolean> getRequirePartitionFilter() {
        return this.requirePartitionFilter == null ? Input.empty() : this.requirePartitionFilter;
    }

    /**
     * When hive partition detection is requested,
     * a common for all source uris must be required. The prefix must end immediately
     * before the partition key encoding begins. For example, consider files following
     * this data layout. `gs://bucket/path_to_table/dt=2019-06-01/country=USA/id=7/file.avro`
     * `gs://bucket/path_to_table/dt=2019-05-31/country=CA/id=3/file.avro` When hive
     * partitioning is requested with either AUTO or STRINGS detection, the common prefix
     * can be either of `gs://bucket/path_to_table` or `gs://bucket/path_to_table/`.
     * Note that when `mode` is set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    @InputImport(name="sourceUriPrefix")
        private final @Nullable Input<String> sourceUriPrefix;

    public Input<String> getSourceUriPrefix() {
        return this.sourceUriPrefix == null ? Input.empty() : this.sourceUriPrefix;
    }

    public TableExternalDataConfigurationHivePartitioningOptionsGetArgs(
        @Nullable Input<String> mode,
        @Nullable Input<Boolean> requirePartitionFilter,
        @Nullable Input<String> sourceUriPrefix) {
        this.mode = mode;
        this.requirePartitionFilter = requirePartitionFilter;
        this.sourceUriPrefix = sourceUriPrefix;
    }

    private TableExternalDataConfigurationHivePartitioningOptionsGetArgs() {
        this.mode = Input.empty();
        this.requirePartitionFilter = Input.empty();
        this.sourceUriPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfigurationHivePartitioningOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> mode;
        private @Nullable Input<Boolean> requirePartitionFilter;
        private @Nullable Input<String> sourceUriPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(TableExternalDataConfigurationHivePartitioningOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.sourceUriPrefix = defaults.sourceUriPrefix;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setRequirePartitionFilter(@Nullable Input<Boolean> requirePartitionFilter) {
            this.requirePartitionFilter = requirePartitionFilter;
            return this;
        }

        public Builder setRequirePartitionFilter(@Nullable Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Input.ofNullable(requirePartitionFilter);
            return this;
        }

        public Builder setSourceUriPrefix(@Nullable Input<String> sourceUriPrefix) {
            this.sourceUriPrefix = sourceUriPrefix;
            return this;
        }

        public Builder setSourceUriPrefix(@Nullable String sourceUriPrefix) {
            this.sourceUriPrefix = Input.ofNullable(sourceUriPrefix);
            return this;
        }
        public TableExternalDataConfigurationHivePartitioningOptionsGetArgs build() {
            return new TableExternalDataConfigurationHivePartitioningOptionsGetArgs(mode, requirePartitionFilter, sourceUriPrefix);
        }
    }
}
