// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.bigquery_v2.inputs.TableFieldSchemaResponse;
import java.util.List;
import java.util.Objects;


public final class TableSchemaResponse extends io.pulumi.resources.InvokeArgs {

    public static final TableSchemaResponse Empty = new TableSchemaResponse();

    /**
     * Describes the fields in a table.
     * 
     */
    @Import(name="fields", required=true)
      private final List<TableFieldSchemaResponse> fields;

    public List<TableFieldSchemaResponse> getFields() {
        return this.fields;
    }

    public TableSchemaResponse(List<TableFieldSchemaResponse> fields) {
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
    }

    private TableSchemaResponse() {
        this.fields = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TableFieldSchemaResponse> fields;

        public Builder() {
    	      // Empty
        }

        public Builder(TableSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
        }

        public Builder fields(List<TableFieldSchemaResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public TableSchemaResponse build() {
            return new TableSchemaResponse(fields);
        }
    }
}
