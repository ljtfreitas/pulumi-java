// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.CassandraSchemaResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CassandraTableGetPropertiesResponseResource extends io.pulumi.resources.InvokeArgs {

    public static final CassandraTableGetPropertiesResponseResource Empty = new CassandraTableGetPropertiesResponseResource();

    /**
     * Analytical TTL.
     * 
     */
    @Import(name="analyticalStorageTtl")
      private final @Nullable Integer analyticalStorageTtl;

    public Optional<Integer> getAnalyticalStorageTtl() {
        return this.analyticalStorageTtl == null ? Optional.empty() : Optional.ofNullable(this.analyticalStorageTtl);
    }

    /**
     * Time to live of the Cosmos DB Cassandra table
     * 
     */
    @Import(name="defaultTtl")
      private final @Nullable Integer defaultTtl;

    public Optional<Integer> getDefaultTtl() {
        return this.defaultTtl == null ? Optional.empty() : Optional.ofNullable(this.defaultTtl);
    }

    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Name of the Cosmos DB Cassandra table
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * A system generated property. A unique identifier.
     * 
     */
    @Import(name="rid", required=true)
      private final String rid;

    public String getRid() {
        return this.rid;
    }

    /**
     * Schema of the Cosmos DB Cassandra table
     * 
     */
    @Import(name="schema")
      private final @Nullable CassandraSchemaResponse schema;

    public Optional<CassandraSchemaResponse> getSchema() {
        return this.schema == null ? Optional.empty() : Optional.ofNullable(this.schema);
    }

    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    @Import(name="ts", required=true)
      private final Double ts;

    public Double getTs() {
        return this.ts;
    }

    public CassandraTableGetPropertiesResponseResource(
        @Nullable Integer analyticalStorageTtl,
        @Nullable Integer defaultTtl,
        String etag,
        String id,
        String rid,
        @Nullable CassandraSchemaResponse schema,
        Double ts) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        this.defaultTtl = defaultTtl;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.rid = Objects.requireNonNull(rid, "expected parameter 'rid' to be non-null");
        this.schema = schema;
        this.ts = Objects.requireNonNull(ts, "expected parameter 'ts' to be non-null");
    }

    private CassandraTableGetPropertiesResponseResource() {
        this.analyticalStorageTtl = null;
        this.defaultTtl = null;
        this.etag = null;
        this.id = null;
        this.rid = null;
        this.schema = null;
        this.ts = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraTableGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer analyticalStorageTtl;
        private @Nullable Integer defaultTtl;
        private String etag;
        private String id;
        private String rid;
        private @Nullable CassandraSchemaResponse schema;
        private Double ts;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraTableGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticalStorageTtl = defaults.analyticalStorageTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.rid = defaults.rid;
    	      this.schema = defaults.schema;
    	      this.ts = defaults.ts;
        }

        public Builder analyticalStorageTtl(@Nullable Integer analyticalStorageTtl) {
            this.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }

        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder rid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }

        public Builder schema(@Nullable CassandraSchemaResponse schema) {
            this.schema = schema;
            return this;
        }

        public Builder ts(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }
        public CassandraTableGetPropertiesResponseResource build() {
            return new CassandraTableGetPropertiesResponseResource(analyticalStorageTtl, defaultTtl, etag, id, rid, schema, ts);
        }
    }
}
