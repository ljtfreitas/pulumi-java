// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.azurenative.webpubsub.outputs.EventHandlerSettingsResponse;
import io.pulumi.azurenative.webpubsub.outputs.ManagedIdentityResponse;
import io.pulumi.azurenative.webpubsub.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.webpubsub.outputs.ResourceSkuResponse;
import io.pulumi.azurenative.webpubsub.outputs.SharedPrivateLinkResourceResponse;
import io.pulumi.azurenative.webpubsub.outputs.SystemDataResponse;
import io.pulumi.azurenative.webpubsub.outputs.WebPubSubFeatureResponse;
import io.pulumi.azurenative.webpubsub.outputs.WebPubSubNetworkACLsResponse;
import io.pulumi.azurenative.webpubsub.outputs.WebPubSubTlsSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebPubSubResult {
    /**
     * The settings for event handler in webpubsub service.
     * 
     */
    private final @Nullable EventHandlerSettingsResponse eventHandler;
    /**
     * The publicly accessible IP of the resource.
     * 
     */
    private final String externalIP;
    /**
     * List of the featureFlags.
     * 
     * FeatureFlags that are not included in the parameters for the update operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, its globally default value will be used
     * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
     * 
     */
    private final @Nullable List<WebPubSubFeatureResponse> features;
    /**
     * FQDN of the service instance.
     * 
     */
    private final String hostName;
    /**
     * Fully qualified resource Id for the resource.
     * 
     */
    private final String id;
    /**
     * The managed identity response
     * 
     */
    private final @Nullable ManagedIdentityResponse identity;
    /**
     * The GEO location of the resource. e.g. West US | East US | North Central US | South Central US.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Network ACLs
     * 
     */
    private final @Nullable WebPubSubNetworkACLsResponse networkACLs;
    /**
     * Private endpoint connections to the resource.
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Enable or disable public network access. Default to "Enabled".
     * When it's Enabled, network ACLs still apply.
     * When it's Disabled, public network access is always disabled no matter what you set in network ACLs.
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * The publicly accessible port of the resource which is designed for browser/client side usage.
     * 
     */
    private final Integer publicPort;
    /**
     * The publicly accessible port of the resource which is designed for customer server side usage.
     * 
     */
    private final Integer serverPort;
    /**
     * The list of shared private link resources.
     * 
     */
    private final List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources;
    /**
     * The billing information of the resource.(e.g. Free, Standard)
     * 
     */
    private final @Nullable ResourceSkuResponse sku;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * TLS settings.
     * 
     */
    private final @Nullable WebPubSubTlsSettingsResponse tls;
    /**
     * The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
     */
    private final String type;
    /**
     * Version of the resource. Probably you need the same or higher version of client SDKs.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetWebPubSubResult(
        @CustomType.Parameter("eventHandler") @Nullable EventHandlerSettingsResponse eventHandler,
        @CustomType.Parameter("externalIP") String externalIP,
        @CustomType.Parameter("features") @Nullable List<WebPubSubFeatureResponse> features,
        @CustomType.Parameter("hostName") String hostName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ManagedIdentityResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkACLs") @Nullable WebPubSubNetworkACLsResponse networkACLs,
        @CustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @CustomType.Parameter("publicPort") Integer publicPort,
        @CustomType.Parameter("serverPort") Integer serverPort,
        @CustomType.Parameter("sharedPrivateLinkResources") List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources,
        @CustomType.Parameter("sku") @Nullable ResourceSkuResponse sku,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tls") @Nullable WebPubSubTlsSettingsResponse tls,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") String version) {
        this.eventHandler = eventHandler;
        this.externalIP = externalIP;
        this.features = features;
        this.hostName = hostName;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.networkACLs = networkACLs;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.publicPort = publicPort;
        this.serverPort = serverPort;
        this.sharedPrivateLinkResources = sharedPrivateLinkResources;
        this.sku = sku;
        this.systemData = systemData;
        this.tags = tags;
        this.tls = tls;
        this.type = type;
        this.version = version;
    }

    /**
     * The settings for event handler in webpubsub service.
     * 
    */
    public Optional<EventHandlerSettingsResponse> getEventHandler() {
        return Optional.ofNullable(this.eventHandler);
    }
    /**
     * The publicly accessible IP of the resource.
     * 
    */
    public String getExternalIP() {
        return this.externalIP;
    }
    /**
     * List of the featureFlags.
     * 
     * FeatureFlags that are not included in the parameters for the update operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, its globally default value will be used
     * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
     * 
    */
    public List<WebPubSubFeatureResponse> getFeatures() {
        return this.features == null ? List.of() : this.features;
    }
    /**
     * FQDN of the service instance.
     * 
    */
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Fully qualified resource Id for the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The managed identity response
     * 
    */
    public Optional<ManagedIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The GEO location of the resource. e.g. West US | East US | North Central US | South Central US.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Network ACLs
     * 
    */
    public Optional<WebPubSubNetworkACLsResponse> getNetworkACLs() {
        return Optional.ofNullable(this.networkACLs);
    }
    /**
     * Private endpoint connections to the resource.
     * 
    */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Provisioning state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Enable or disable public network access. Default to "Enabled".
     * When it's Enabled, network ACLs still apply.
     * When it's Disabled, public network access is always disabled no matter what you set in network ACLs.
     * 
    */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * The publicly accessible port of the resource which is designed for browser/client side usage.
     * 
    */
    public Integer getPublicPort() {
        return this.publicPort;
    }
    /**
     * The publicly accessible port of the resource which is designed for customer server side usage.
     * 
    */
    public Integer getServerPort() {
        return this.serverPort;
    }
    /**
     * The list of shared private link resources.
     * 
    */
    public List<SharedPrivateLinkResourceResponse> getSharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }
    /**
     * The billing information of the resource.(e.g. Free, Standard)
     * 
    */
    public Optional<ResourceSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * TLS settings.
     * 
    */
    public Optional<WebPubSubTlsSettingsResponse> getTls() {
        return Optional.ofNullable(this.tls);
    }
    /**
     * The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Version of the resource. Probably you need the same or higher version of client SDKs.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebPubSubResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventHandlerSettingsResponse eventHandler;
        private String externalIP;
        private @Nullable List<WebPubSubFeatureResponse> features;
        private String hostName;
        private String id;
        private @Nullable ManagedIdentityResponse identity;
        private @Nullable String location;
        private String name;
        private @Nullable WebPubSubNetworkACLsResponse networkACLs;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private Integer publicPort;
        private Integer serverPort;
        private List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources;
        private @Nullable ResourceSkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable WebPubSubTlsSettingsResponse tls;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebPubSubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHandler = defaults.eventHandler;
    	      this.externalIP = defaults.externalIP;
    	      this.features = defaults.features;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkACLs = defaults.networkACLs;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.publicPort = defaults.publicPort;
    	      this.serverPort = defaults.serverPort;
    	      this.sharedPrivateLinkResources = defaults.sharedPrivateLinkResources;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.tls = defaults.tls;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder eventHandler(@Nullable EventHandlerSettingsResponse eventHandler) {
            this.eventHandler = eventHandler;
            return this;
        }

        public Builder externalIP(String externalIP) {
            this.externalIP = Objects.requireNonNull(externalIP);
            return this;
        }

        public Builder features(@Nullable List<WebPubSubFeatureResponse> features) {
            this.features = features;
            return this;
        }

        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder identity(@Nullable ManagedIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder networkACLs(@Nullable WebPubSubNetworkACLsResponse networkACLs) {
            this.networkACLs = networkACLs;
            return this;
        }

        public Builder privateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder publicPort(Integer publicPort) {
            this.publicPort = Objects.requireNonNull(publicPort);
            return this;
        }

        public Builder serverPort(Integer serverPort) {
            this.serverPort = Objects.requireNonNull(serverPort);
            return this;
        }

        public Builder sharedPrivateLinkResources(List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources) {
            this.sharedPrivateLinkResources = Objects.requireNonNull(sharedPrivateLinkResources);
            return this;
        }

        public Builder sku(@Nullable ResourceSkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tls(@Nullable WebPubSubTlsSettingsResponse tls) {
            this.tls = tls;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetWebPubSubResult build() {
            return new GetWebPubSubResult(eventHandler, externalIP, features, hostName, id, identity, location, name, networkACLs, privateEndpointConnections, provisioningState, publicNetworkAccess, publicPort, serverPort, sharedPrivateLinkResources, sku, systemData, tags, tls, type, version);
        }
    }
}
