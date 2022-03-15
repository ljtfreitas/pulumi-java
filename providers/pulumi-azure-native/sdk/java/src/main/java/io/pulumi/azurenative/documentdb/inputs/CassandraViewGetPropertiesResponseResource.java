// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class CassandraViewGetPropertiesResponseResource extends io.pulumi.resources.InvokeArgs {

    public static final CassandraViewGetPropertiesResponseResource Empty = new CassandraViewGetPropertiesResponseResource();

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
     * Name of the Cosmos DB Cassandra view
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
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    @Import(name="ts", required=true)
      private final Double ts;

    public Double getTs() {
        return this.ts;
    }

    /**
     * View Definition of the Cosmos DB Cassandra view
     * 
     */
    @Import(name="viewDefinition", required=true)
      private final String viewDefinition;

    public String getViewDefinition() {
        return this.viewDefinition;
    }

    public CassandraViewGetPropertiesResponseResource(
        String etag,
        String id,
        String rid,
        Double ts,
        String viewDefinition) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.rid = Objects.requireNonNull(rid, "expected parameter 'rid' to be non-null");
        this.ts = Objects.requireNonNull(ts, "expected parameter 'ts' to be non-null");
        this.viewDefinition = Objects.requireNonNull(viewDefinition, "expected parameter 'viewDefinition' to be non-null");
    }

    private CassandraViewGetPropertiesResponseResource() {
        this.etag = null;
        this.id = null;
        this.rid = null;
        this.ts = null;
        this.viewDefinition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraViewGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String rid;
        private Double ts;
        private String viewDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraViewGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.rid = defaults.rid;
    	      this.ts = defaults.ts;
    	      this.viewDefinition = defaults.viewDefinition;
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

        public Builder ts(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }

        public Builder viewDefinition(String viewDefinition) {
            this.viewDefinition = Objects.requireNonNull(viewDefinition);
            return this;
        }
        public CassandraViewGetPropertiesResponseResource build() {
            return new CassandraViewGetPropertiesResponseResource(etag, id, rid, ts, viewDefinition);
        }
    }
}
