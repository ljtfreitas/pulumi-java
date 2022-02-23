// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.StandardSqlFieldArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardSqlStructTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardSqlStructTypeArgs Empty = new StandardSqlStructTypeArgs();

    @InputImport(name="fields")
      private final @Nullable Input<List<StandardSqlFieldArgs>> fields;

    public Input<List<StandardSqlFieldArgs>> getFields() {
        return this.fields == null ? Input.empty() : this.fields;
    }

    public StandardSqlStructTypeArgs(@Nullable Input<List<StandardSqlFieldArgs>> fields) {
        this.fields = fields;
    }

    private StandardSqlStructTypeArgs() {
        this.fields = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSqlStructTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<StandardSqlFieldArgs>> fields;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSqlStructTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
        }

        public Builder setFields(@Nullable Input<List<StandardSqlFieldArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setFields(@Nullable List<StandardSqlFieldArgs> fields) {
            this.fields = Input.ofNullable(fields);
            return this;
        }
        public StandardSqlStructTypeArgs build() {
            return new StandardSqlStructTypeArgs(fields);
        }
    }
}
