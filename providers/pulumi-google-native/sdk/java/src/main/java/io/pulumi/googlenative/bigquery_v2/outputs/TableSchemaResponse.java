// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.TableFieldSchemaResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TableSchemaResponse {
    /**
     * Describes the fields in a table.
     * 
     */
    private final List<TableFieldSchemaResponse> fields;

    @OutputCustomType.Constructor({"fields"})
    private TableSchemaResponse(List<TableFieldSchemaResponse> fields) {
        this.fields = Objects.requireNonNull(fields);
    }

    /**
     * Describes the fields in a table.
     * 
     */
    public List<TableFieldSchemaResponse> getFields() {
        return this.fields;
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

        public Builder setFields(List<TableFieldSchemaResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public TableSchemaResponse build() {
            return new TableSchemaResponse(fields);
        }
    }
}
