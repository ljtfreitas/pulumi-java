// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureDataExplorerConnectionPropertiesResponse {
    /**
     * The name of the Azure Data Explorer database.
     * 
     */
    private final String adxDatabaseName;
    /**
     * The URI of the Azure Data Explorer endpoint.
     * 
     */
    private final String adxEndpointUri;
    /**
     * The resource ID of the Azure Data Explorer cluster.
     * 
     */
    private final String adxResourceId;
    /**
     * The name of the Azure Data Explorer table.
     * 
     */
    private final @Nullable String adxTableName;
    /**
     * The type of time series connection resource.
     * Expected value is 'AzureDataExplorer'.
     * 
     */
    private final String connectionType;
    /**
     * The EventHub consumer group to use when ADX reads from EventHub. Defaults to $Default.
     * 
     */
    private final @Nullable String eventHubConsumerGroup;
    /**
     * The URL of the EventHub namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    private final String eventHubEndpointUri;
    /**
     * The EventHub name in the EventHub namespace for identity-based authentication.
     * 
     */
    private final String eventHubEntityPath;
    /**
     * The resource ID of the EventHub namespace.
     * 
     */
    private final String eventHubNamespaceResourceId;
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;

    @CustomType.Constructor
    private AzureDataExplorerConnectionPropertiesResponse(
        @CustomType.Parameter("adxDatabaseName") String adxDatabaseName,
        @CustomType.Parameter("adxEndpointUri") String adxEndpointUri,
        @CustomType.Parameter("adxResourceId") String adxResourceId,
        @CustomType.Parameter("adxTableName") @Nullable String adxTableName,
        @CustomType.Parameter("connectionType") String connectionType,
        @CustomType.Parameter("eventHubConsumerGroup") @Nullable String eventHubConsumerGroup,
        @CustomType.Parameter("eventHubEndpointUri") String eventHubEndpointUri,
        @CustomType.Parameter("eventHubEntityPath") String eventHubEntityPath,
        @CustomType.Parameter("eventHubNamespaceResourceId") String eventHubNamespaceResourceId,
        @CustomType.Parameter("provisioningState") String provisioningState) {
        this.adxDatabaseName = adxDatabaseName;
        this.adxEndpointUri = adxEndpointUri;
        this.adxResourceId = adxResourceId;
        this.adxTableName = adxTableName;
        this.connectionType = connectionType;
        this.eventHubConsumerGroup = eventHubConsumerGroup;
        this.eventHubEndpointUri = eventHubEndpointUri;
        this.eventHubEntityPath = eventHubEntityPath;
        this.eventHubNamespaceResourceId = eventHubNamespaceResourceId;
        this.provisioningState = provisioningState;
    }

    /**
     * The name of the Azure Data Explorer database.
     * 
    */
    public String getAdxDatabaseName() {
        return this.adxDatabaseName;
    }
    /**
     * The URI of the Azure Data Explorer endpoint.
     * 
    */
    public String getAdxEndpointUri() {
        return this.adxEndpointUri;
    }
    /**
     * The resource ID of the Azure Data Explorer cluster.
     * 
    */
    public String getAdxResourceId() {
        return this.adxResourceId;
    }
    /**
     * The name of the Azure Data Explorer table.
     * 
    */
    public Optional<String> getAdxTableName() {
        return Optional.ofNullable(this.adxTableName);
    }
    /**
     * The type of time series connection resource.
     * Expected value is 'AzureDataExplorer'.
     * 
    */
    public String getConnectionType() {
        return this.connectionType;
    }
    /**
     * The EventHub consumer group to use when ADX reads from EventHub. Defaults to $Default.
     * 
    */
    public Optional<String> getEventHubConsumerGroup() {
        return Optional.ofNullable(this.eventHubConsumerGroup);
    }
    /**
     * The URL of the EventHub namespace for identity-based authentication. It must include the protocol sb://
     * 
    */
    public String getEventHubEndpointUri() {
        return this.eventHubEndpointUri;
    }
    /**
     * The EventHub name in the EventHub namespace for identity-based authentication.
     * 
    */
    public String getEventHubEntityPath() {
        return this.eventHubEntityPath;
    }
    /**
     * The resource ID of the EventHub namespace.
     * 
    */
    public String getEventHubNamespaceResourceId() {
        return this.eventHubNamespaceResourceId;
    }
    /**
     * The provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataExplorerConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adxDatabaseName;
        private String adxEndpointUri;
        private String adxResourceId;
        private @Nullable String adxTableName;
        private String connectionType;
        private @Nullable String eventHubConsumerGroup;
        private String eventHubEndpointUri;
        private String eventHubEntityPath;
        private String eventHubNamespaceResourceId;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataExplorerConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adxDatabaseName = defaults.adxDatabaseName;
    	      this.adxEndpointUri = defaults.adxEndpointUri;
    	      this.adxResourceId = defaults.adxResourceId;
    	      this.adxTableName = defaults.adxTableName;
    	      this.connectionType = defaults.connectionType;
    	      this.eventHubConsumerGroup = defaults.eventHubConsumerGroup;
    	      this.eventHubEndpointUri = defaults.eventHubEndpointUri;
    	      this.eventHubEntityPath = defaults.eventHubEntityPath;
    	      this.eventHubNamespaceResourceId = defaults.eventHubNamespaceResourceId;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder adxDatabaseName(String adxDatabaseName) {
            this.adxDatabaseName = Objects.requireNonNull(adxDatabaseName);
            return this;
        }

        public Builder adxEndpointUri(String adxEndpointUri) {
            this.adxEndpointUri = Objects.requireNonNull(adxEndpointUri);
            return this;
        }

        public Builder adxResourceId(String adxResourceId) {
            this.adxResourceId = Objects.requireNonNull(adxResourceId);
            return this;
        }

        public Builder adxTableName(@Nullable String adxTableName) {
            this.adxTableName = adxTableName;
            return this;
        }

        public Builder connectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }

        public Builder eventHubConsumerGroup(@Nullable String eventHubConsumerGroup) {
            this.eventHubConsumerGroup = eventHubConsumerGroup;
            return this;
        }

        public Builder eventHubEndpointUri(String eventHubEndpointUri) {
            this.eventHubEndpointUri = Objects.requireNonNull(eventHubEndpointUri);
            return this;
        }

        public Builder eventHubEntityPath(String eventHubEntityPath) {
            this.eventHubEntityPath = Objects.requireNonNull(eventHubEntityPath);
            return this;
        }

        public Builder eventHubNamespaceResourceId(String eventHubNamespaceResourceId) {
            this.eventHubNamespaceResourceId = Objects.requireNonNull(eventHubNamespaceResourceId);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public AzureDataExplorerConnectionPropertiesResponse build() {
            return new AzureDataExplorerConnectionPropertiesResponse(adxDatabaseName, adxEndpointUri, adxResourceId, adxTableName, connectionType, eventHubConsumerGroup, eventHubEndpointUri, eventHubEntityPath, eventHubNamespaceResourceId, provisioningState);
        }
    }
}
