// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.DatastoreColumn;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatastoreSchemaDefinition {
    private final @Nullable List<DatastoreColumn> columns;

    @OutputCustomType.Constructor({"columns"})
    private DatastoreSchemaDefinition(@Nullable List<DatastoreColumn> columns) {
        this.columns = columns;
    }

    public List<DatastoreColumn> getColumns() {
        return this.columns == null ? List.of() : this.columns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreSchemaDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DatastoreColumn> columns;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreSchemaDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
        }

        public Builder setColumns(@Nullable List<DatastoreColumn> columns) {
            this.columns = columns;
            return this;
        }
        public DatastoreSchemaDefinition build() {
            return new DatastoreSchemaDefinition(columns);
        }
    }
}
