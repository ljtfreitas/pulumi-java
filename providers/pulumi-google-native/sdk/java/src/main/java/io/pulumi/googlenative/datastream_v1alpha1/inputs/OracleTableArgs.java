// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.OracleColumnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle table.
 * 
 */
public final class OracleTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleTableArgs Empty = new OracleTableArgs();

    /**
     * Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
     * 
     */
    @Import(name="oracleColumns")
      private final @Nullable Output<List<OracleColumnArgs>> oracleColumns;

    public Output<List<OracleColumnArgs>> getOracleColumns() {
        return this.oracleColumns == null ? Output.empty() : this.oracleColumns;
    }

    /**
     * Table name.
     * 
     */
    @Import(name="tableName")
      private final @Nullable Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName == null ? Output.empty() : this.tableName;
    }

    public OracleTableArgs(
        @Nullable Output<List<OracleColumnArgs>> oracleColumns,
        @Nullable Output<String> tableName) {
        this.oracleColumns = oracleColumns;
        this.tableName = tableName;
    }

    private OracleTableArgs() {
        this.oracleColumns = Output.empty();
        this.tableName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OracleColumnArgs>> oracleColumns;
        private @Nullable Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleColumns = defaults.oracleColumns;
    	      this.tableName = defaults.tableName;
        }

        public Builder oracleColumns(@Nullable Output<List<OracleColumnArgs>> oracleColumns) {
            this.oracleColumns = oracleColumns;
            return this;
        }

        public Builder oracleColumns(@Nullable List<OracleColumnArgs> oracleColumns) {
            this.oracleColumns = Output.ofNullable(oracleColumns);
            return this;
        }

        public Builder tableName(@Nullable Output<String> tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder tableName(@Nullable String tableName) {
            this.tableName = Output.ofNullable(tableName);
            return this;
        }
        public OracleTableArgs build() {
            return new OracleTableArgs(oracleColumns, tableName);
        }
    }
}
