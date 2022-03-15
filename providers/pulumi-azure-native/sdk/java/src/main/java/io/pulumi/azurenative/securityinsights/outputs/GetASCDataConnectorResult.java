// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.AlertsDataTypeOfDataConnectorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetASCDataConnectorResult {
    /**
     * The available data types for the connector.
     * 
     */
    private final @Nullable AlertsDataTypeOfDataConnectorResponse dataTypes;
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
     * Expected value is 'AzureSecurityCenter'.
     * 
     */
    private final String kind;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * The subscription id to connect to, and get the data from.
     * 
     */
    private final @Nullable String subscriptionId;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetASCDataConnectorResult(
        @CustomType.Parameter("dataTypes") @Nullable AlertsDataTypeOfDataConnectorResponse dataTypes,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId,
        @CustomType.Parameter("type") String type) {
        this.dataTypes = dataTypes;
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.subscriptionId = subscriptionId;
        this.type = type;
    }

    /**
     * The available data types for the connector.
     * 
    */
    public Optional<AlertsDataTypeOfDataConnectorResponse> getDataTypes() {
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
     * Expected value is 'AzureSecurityCenter'.
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
     * The subscription id to connect to, and get the data from.
     * 
    */
    public Optional<String> getSubscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
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

    public static Builder builder(GetASCDataConnectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AlertsDataTypeOfDataConnectorResponse dataTypes;
        private @Nullable String etag;
        private String id;
        private String kind;
        private String name;
        private @Nullable String subscriptionId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetASCDataConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTypes = defaults.dataTypes;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.type = defaults.type;
        }

        public Builder dataTypes(@Nullable AlertsDataTypeOfDataConnectorResponse dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetASCDataConnectorResult build() {
            return new GetASCDataConnectorResult(dataTypes, etag, id, kind, name, subscriptionId, type);
        }
    }
}
