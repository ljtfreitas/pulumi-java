// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datastream.v1.outputs.OracleColumnResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OracleTableResponse {
    /**
     * @return Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * 
     */
    private final List<OracleColumnResponse> oracleColumns;
    /**
     * @return Table name.
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
     * @return Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * 
     */
    public List<OracleColumnResponse> oracleColumns() {
        return this.oracleColumns;
    }
    /**
     * @return Table name.
     * 
     */
    public String table() {
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
        public Builder oracleColumns(OracleColumnResponse... oracleColumns) {
            return oracleColumns(List.of(oracleColumns));
        }
        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }        public OracleTableResponse build() {
            return new OracleTableResponse(oracleColumns, table);
        }
    }
}
