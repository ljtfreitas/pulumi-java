// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TableGetPropertiesResponseResource {
    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    private final String etag;
    /**
     * Name of the Cosmos DB table
     * 
     */
    private final String id;
    /**
     * A system generated property. A unique identifier.
     * 
     */
    private final String rid;
    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    private final Double ts;

    @OutputCustomType.Constructor({"etag","id","rid","ts"})
    private TableGetPropertiesResponseResource(
        String etag,
        String id,
        String rid,
        Double ts) {
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.rid = Objects.requireNonNull(rid);
        this.ts = Objects.requireNonNull(ts);
    }

    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Name of the Cosmos DB table
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * A system generated property. A unique identifier.
     * 
     */
    public String getRid() {
        return this.rid;
    }
    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    public Double getTs() {
        return this.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String rid;
        private Double ts;

        public Builder() {
    	      // Empty
        }

        public Builder(TableGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.rid = defaults.rid;
    	      this.ts = defaults.ts;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setRid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }

        public Builder setTs(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }

        public TableGetPropertiesResponseResource build() {
            return new TableGetPropertiesResponseResource(etag, id, rid, ts);
        }
    }
}
