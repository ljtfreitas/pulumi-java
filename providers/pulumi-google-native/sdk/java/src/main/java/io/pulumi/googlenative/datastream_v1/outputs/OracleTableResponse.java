// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datastream_v1.outputs.OracleColumnResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OracleTableResponse {
    /**
     * Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
     * 
     */
    private final List<OracleColumnResponse> oracleColumns;
    /**
     * Table name.
     * 
     */
    private final String table;

    @CustomType.Constructor
    private OracleTableResponse(
        @CustomType.Parameter("oracleColumns") List<OracleColumnResponse> oracleColumns,
        @CustomType.Parameter("table") String table) {
        this.oracleColumns = oracleColumns;
        this.table = table;
    }

    /**
     * Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
     * 
    */
    public List<OracleColumnResponse> getOracleColumns() {
        return this.oracleColumns;
    }
    /**
     * Table name.
     * 
    */
    public String getTable() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OracleColumnResponse> oracleColumns;
        private String table;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleColumns = defaults.oracleColumns;
    	      this.table = defaults.table;
        }

        public Builder oracleColumns(List<OracleColumnResponse> oracleColumns) {
            this.oracleColumns = Objects.requireNonNull(oracleColumns);
            return this;
        }

        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        public OracleTableResponse build() {
            return new OracleTableResponse(oracleColumns, table);
        }
    }
}
