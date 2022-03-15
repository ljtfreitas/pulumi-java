// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datastream_v1.inputs.OracleTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle schema.
 * 
 */
public final class OracleSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleSchemaArgs Empty = new OracleSchemaArgs();

    /**
     * Tables in the schema.
     * 
     */
    @Import(name="oracleTables")
      private final @Nullable Output<List<OracleTableArgs>> oracleTables;

    public Output<List<OracleTableArgs>> getOracleTables() {
        return this.oracleTables == null ? Output.empty() : this.oracleTables;
    }

    /**
     * Schema name.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<String> schema;

    public Output<String> getSchema() {
        return this.schema == null ? Output.empty() : this.schema;
    }

    public OracleSchemaArgs(
        @Nullable Output<List<OracleTableArgs>> oracleTables,
        @Nullable Output<String> schema) {
        this.oracleTables = oracleTables;
        this.schema = schema;
    }

    private OracleSchemaArgs() {
        this.oracleTables = Output.empty();
        this.schema = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OracleTableArgs>> oracleTables;
        private @Nullable Output<String> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleTables = defaults.oracleTables;
    	      this.schema = defaults.schema;
        }

        public Builder oracleTables(@Nullable Output<List<OracleTableArgs>> oracleTables) {
            this.oracleTables = oracleTables;
            return this;
        }

        public Builder oracleTables(@Nullable List<OracleTableArgs> oracleTables) {
            this.oracleTables = Output.ofNullable(oracleTables);
            return this;
        }

        public Builder schema(@Nullable Output<String> schema) {
            this.schema = schema;
            return this;
        }

        public Builder schema(@Nullable String schema) {
            this.schema = Output.ofNullable(schema);
            return this;
        }
        public OracleSchemaArgs build() {
            return new OracleSchemaArgs(oracleTables, schema);
        }
    }
}
