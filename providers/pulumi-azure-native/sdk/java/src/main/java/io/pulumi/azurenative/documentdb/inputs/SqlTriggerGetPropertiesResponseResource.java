// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlTriggerGetPropertiesResponseResource extends io.pulumi.resources.InvokeArgs {

    public static final SqlTriggerGetPropertiesResponseResource Empty = new SqlTriggerGetPropertiesResponseResource();

    /**
     * Body of the Trigger
     * 
     */
    @InputImport(name="body")
    private final @Nullable String body;

    public Optional<String> getBody() {
        return this.body == null ? Optional.empty() : Optional.ofNullable(this.body);
    }

    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Name of the Cosmos DB SQL trigger
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * A system generated property. A unique identifier.
     * 
     */
    @InputImport(name="rid", required=true)
    private final String rid;

    public String getRid() {
        return this.rid;
    }

    /**
     * The operation the trigger is associated with
     * 
     */
    @InputImport(name="triggerOperation")
    private final @Nullable String triggerOperation;

    public Optional<String> getTriggerOperation() {
        return this.triggerOperation == null ? Optional.empty() : Optional.ofNullable(this.triggerOperation);
    }

    /**
     * Type of the Trigger
     * 
     */
    @InputImport(name="triggerType")
    private final @Nullable String triggerType;

    public Optional<String> getTriggerType() {
        return this.triggerType == null ? Optional.empty() : Optional.ofNullable(this.triggerType);
    }

    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    @InputImport(name="ts", required=true)
    private final Double ts;

    public Double getTs() {
        return this.ts;
    }

    public SqlTriggerGetPropertiesResponseResource(
        @Nullable String body,
        String etag,
        String id,
        String rid,
        @Nullable String triggerOperation,
        @Nullable String triggerType,
        Double ts) {
        this.body = body;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.rid = Objects.requireNonNull(rid, "expected parameter 'rid' to be non-null");
        this.triggerOperation = triggerOperation;
        this.triggerType = triggerType;
        this.ts = Objects.requireNonNull(ts, "expected parameter 'ts' to be non-null");
    }

    private SqlTriggerGetPropertiesResponseResource() {
        this.body = null;
        this.etag = null;
        this.id = null;
        this.rid = null;
        this.triggerOperation = null;
        this.triggerType = null;
        this.ts = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlTriggerGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String body;
        private String etag;
        private String id;
        private String rid;
        private @Nullable String triggerOperation;
        private @Nullable String triggerType;
        private Double ts;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlTriggerGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.rid = defaults.rid;
    	      this.triggerOperation = defaults.triggerOperation;
    	      this.triggerType = defaults.triggerType;
    	      this.ts = defaults.ts;
        }

        public Builder setBody(@Nullable String body) {
            this.body = body;
            return this;
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

        public Builder setTriggerOperation(@Nullable String triggerOperation) {
            this.triggerOperation = triggerOperation;
            return this;
        }

        public Builder setTriggerType(@Nullable String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        public Builder setTs(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }

        public SqlTriggerGetPropertiesResponseResource build() {
            return new SqlTriggerGetPropertiesResponseResource(body, etag, id, rid, triggerOperation, triggerType, ts);
        }
    }
}
