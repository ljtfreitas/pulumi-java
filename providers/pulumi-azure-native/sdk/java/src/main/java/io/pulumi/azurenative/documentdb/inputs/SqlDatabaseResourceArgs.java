// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Cosmos DB SQL database resource object
 * 
 */
public final class SqlDatabaseResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlDatabaseResourceArgs Empty = new SqlDatabaseResourceArgs();

    /**
     * Name of the Cosmos DB SQL database
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    public SqlDatabaseResourceArgs(Output<String> id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private SqlDatabaseResourceArgs() {
        this.id = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDatabaseResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDatabaseResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public SqlDatabaseResourceArgs build() {
            return new SqlDatabaseResourceArgs(id);
        }
    }
}
