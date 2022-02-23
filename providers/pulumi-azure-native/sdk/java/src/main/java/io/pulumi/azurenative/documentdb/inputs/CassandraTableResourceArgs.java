// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.CassandraSchemaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB Cassandra table resource object
 * 
 */
public final class CassandraTableResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CassandraTableResourceArgs Empty = new CassandraTableResourceArgs();

    /**
     * Analytical TTL.
     * 
     */
    @InputImport(name="analyticalStorageTtl")
        private final @Nullable Input<Integer> analyticalStorageTtl;

    public Input<Integer> getAnalyticalStorageTtl() {
        return this.analyticalStorageTtl == null ? Input.empty() : this.analyticalStorageTtl;
    }

    /**
     * Time to live of the Cosmos DB Cassandra table
     * 
     */
    @InputImport(name="defaultTtl")
        private final @Nullable Input<Integer> defaultTtl;

    public Input<Integer> getDefaultTtl() {
        return this.defaultTtl == null ? Input.empty() : this.defaultTtl;
    }

    /**
     * Name of the Cosmos DB Cassandra table
     * 
     */
    @InputImport(name="id", required=true)
        private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Schema of the Cosmos DB Cassandra table
     * 
     */
    @InputImport(name="schema")
        private final @Nullable Input<CassandraSchemaArgs> schema;

    public Input<CassandraSchemaArgs> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    public CassandraTableResourceArgs(
        @Nullable Input<Integer> analyticalStorageTtl,
        @Nullable Input<Integer> defaultTtl,
        Input<String> id,
        @Nullable Input<CassandraSchemaArgs> schema) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        this.defaultTtl = defaultTtl;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.schema = schema;
    }

    private CassandraTableResourceArgs() {
        this.analyticalStorageTtl = Input.empty();
        this.defaultTtl = Input.empty();
        this.id = Input.empty();
        this.schema = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraTableResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> analyticalStorageTtl;
        private @Nullable Input<Integer> defaultTtl;
        private Input<String> id;
        private @Nullable Input<CassandraSchemaArgs> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraTableResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticalStorageTtl = defaults.analyticalStorageTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.id = defaults.id;
    	      this.schema = defaults.schema;
        }

        public Builder setAnalyticalStorageTtl(@Nullable Input<Integer> analyticalStorageTtl) {
            this.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }

        public Builder setAnalyticalStorageTtl(@Nullable Integer analyticalStorageTtl) {
            this.analyticalStorageTtl = Input.ofNullable(analyticalStorageTtl);
            return this;
        }

        public Builder setDefaultTtl(@Nullable Input<Integer> defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder setDefaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = Input.ofNullable(defaultTtl);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setSchema(@Nullable Input<CassandraSchemaArgs> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable CassandraSchemaArgs schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }
        public CassandraTableResourceArgs build() {
            return new CassandraTableResourceArgs(analyticalStorageTtl, defaultTtl, id, schema);
        }
    }
}
