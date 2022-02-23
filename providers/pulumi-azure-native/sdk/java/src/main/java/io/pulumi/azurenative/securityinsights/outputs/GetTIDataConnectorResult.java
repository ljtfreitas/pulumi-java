// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.TIDataConnectorDataTypesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTIDataConnectorResult {
    /**
     * The available data types for the connector.
     * 
     */
    private final @Nullable TIDataConnectorDataTypesResponse dataTypes;
    /**
     * Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * The kind of the data connector
     * Expected value is 'ThreatIntelligence'.
     * 
     */
    private final String kind;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * The tenant id to connect to, and get the data from.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * The lookback period for the feed to be imported.
     * 
     */
    private final @Nullable String tipLookbackPeriod;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"dataTypes","etag","id","kind","name","tenantId","tipLookbackPeriod","type"})
    private GetTIDataConnectorResult(
        @Nullable TIDataConnectorDataTypesResponse dataTypes,
        @Nullable String etag,
        String id,
        String kind,
        String name,
        @Nullable String tenantId,
        @Nullable String tipLookbackPeriod,
        String type) {
        this.dataTypes = dataTypes;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.tenantId = tenantId;
        this.tipLookbackPeriod = tipLookbackPeriod;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The available data types for the connector.
     * 
     */
    public Optional<TIDataConnectorDataTypesResponse> getDataTypes() {
        return Optional.ofNullable(this.dataTypes);
    }
    /**
     * Etag of the azure resource
     * 
     */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Azure resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The kind of the data connector
     * Expected value is 'ThreatIntelligence'.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Azure resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The tenant id to connect to, and get the data from.
     * 
     */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * The lookback period for the feed to be imported.
     * 
     */
    public Optional<String> getTipLookbackPeriod() {
        return Optional.ofNullable(this.tipLookbackPeriod);
    }
    /**
     * Azure resource type
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTIDataConnectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TIDataConnectorDataTypesResponse dataTypes;
        private @Nullable String etag;
        private String id;
        private String kind;
        private String name;
        private @Nullable String tenantId;
        private @Nullable String tipLookbackPeriod;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTIDataConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTypes = defaults.dataTypes;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.tenantId = defaults.tenantId;
    	      this.tipLookbackPeriod = defaults.tipLookbackPeriod;
    	      this.type = defaults.type;
        }

        public Builder setDataTypes(@Nullable TIDataConnectorDataTypesResponse dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTipLookbackPeriod(@Nullable String tipLookbackPeriod) {
            this.tipLookbackPeriod = tipLookbackPeriod;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetTIDataConnectorResult build() {
            return new GetTIDataConnectorResult(dataTypes, etag, id, kind, name, tenantId, tipLookbackPeriod, type);
        }
    }
}
