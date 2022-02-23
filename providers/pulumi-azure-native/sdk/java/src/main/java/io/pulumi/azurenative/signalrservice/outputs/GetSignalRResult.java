// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.outputs;

import io.pulumi.azurenative.signalrservice.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.signalrservice.outputs.ResourceSkuResponse;
import io.pulumi.azurenative.signalrservice.outputs.ServerlessUpstreamSettingsResponse;
import io.pulumi.azurenative.signalrservice.outputs.SignalRCorsSettingsResponse;
import io.pulumi.azurenative.signalrservice.outputs.SignalRFeatureResponse;
import io.pulumi.azurenative.signalrservice.outputs.SignalRNetworkACLsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSignalRResult {
    /**
     * Cross-Origin Resource Sharing (CORS) settings.
     * 
     */
    private final @Nullable SignalRCorsSettingsResponse cors;
    /**
     * The publicly accessible IP of the SignalR service.
     * 
     */
    private final String externalIP;
    /**
     * List of SignalR featureFlags. e.g. ServiceMode.
     * 
     * FeatureFlags that are not included in the parameters for the update operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, SignalR service will use its globally default value.
     * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
     * 
     */
    private final @Nullable List<SignalRFeatureResponse> features;
    /**
     * FQDN of the SignalR service instance. Format: xxx.service.signalr.net
     * 
     */
    private final String hostName;
    /**
     * Prefix for the hostName of the SignalR service. Retained for future use.
     * The hostname will be of format: &lt;hostNamePrefix&gt;.service.signalr.net.
     * 
     */
    private final String hostNamePrefix;
    /**
     * Fully qualified resource Id for the resource.
     * 
     */
    private final String id;
    /**
     * The kind of the service - e.g. "SignalR", or "RawWebSockets" for "Microsoft.SignalRService/SignalR"
     * 
     */
    private final @Nullable String kind;
    /**
     * The GEO location of the SignalR service. e.g. West US | East US | North Central US | South Central US.
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
    private final @Nullable SignalRNetworkACLsResponse networkACLs;
    /**
     * Private endpoint connections to the SignalR resource.
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The publicly accessible port of the SignalR service which is designed for browser/client side usage.
     * 
     */
    private final Integer publicPort;
    /**
     * The publicly accessible port of the SignalR service which is designed for customer server side usage.
     * 
     */
    private final Integer serverPort;
    /**
     * The billing information of the resource.(e.g. Free, Standard)
     * 
     */
    private final @Nullable ResourceSkuResponse sku;
    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
     */
    private final String type;
    /**
     * Upstream settings when the Azure SignalR is in server-less mode.
     * 
     */
    private final @Nullable ServerlessUpstreamSettingsResponse upstream;
    /**
     * Version of the SignalR resource. Probably you need the same or higher version of client SDKs.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"cors","externalIP","features","hostName","hostNamePrefix","id","kind","location","name","networkACLs","privateEndpointConnections","provisioningState","publicPort","serverPort","sku","tags","type","upstream","version"})
    private GetSignalRResult(
        @Nullable SignalRCorsSettingsResponse cors,
        String externalIP,
        @Nullable List<SignalRFeatureResponse> features,
        String hostName,
        String hostNamePrefix,
        String id,
        @Nullable String kind,
        @Nullable String location,
        String name,
        @Nullable SignalRNetworkACLsResponse networkACLs,
        List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        Integer publicPort,
        Integer serverPort,
        @Nullable ResourceSkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable ServerlessUpstreamSettingsResponse upstream,
        String version) {
        this.cors = cors;
        this.externalIP = Objects.requireNonNull(externalIP);
        this.features = features;
        this.hostName = Objects.requireNonNull(hostName);
        this.hostNamePrefix = Objects.requireNonNull(hostNamePrefix);
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.networkACLs = networkACLs;
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicPort = Objects.requireNonNull(publicPort);
        this.serverPort = Objects.requireNonNull(serverPort);
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.upstream = upstream;
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Cross-Origin Resource Sharing (CORS) settings.
     * 
     */
    public Optional<SignalRCorsSettingsResponse> getCors() {
        return Optional.ofNullable(this.cors);
    }
    /**
     * The publicly accessible IP of the SignalR service.
     * 
     */
    public String getExternalIP() {
        return this.externalIP;
    }
    /**
     * List of SignalR featureFlags. e.g. ServiceMode.
     * 
     * FeatureFlags that are not included in the parameters for the update operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, SignalR service will use its globally default value.
     * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
     * 
     */
    public List<SignalRFeatureResponse> getFeatures() {
        return this.features == null ? List.of() : this.features;
    }
    /**
     * FQDN of the SignalR service instance. Format: xxx.service.signalr.net
     * 
     */
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Prefix for the hostName of the SignalR service. Retained for future use.
     * The hostname will be of format: &lt;hostNamePrefix&gt;.service.signalr.net.
     * 
     */
    public String getHostNamePrefix() {
        return this.hostNamePrefix;
    }
    /**
     * Fully qualified resource Id for the resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The kind of the service - e.g. "SignalR", or "RawWebSockets" for "Microsoft.SignalRService/SignalR"
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The GEO location of the SignalR service. e.g. West US | East US | North Central US | South Central US.
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
    public Optional<SignalRNetworkACLsResponse> getNetworkACLs() {
        return Optional.ofNullable(this.networkACLs);
    }
    /**
     * Private endpoint connections to the SignalR resource.
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
     * The publicly accessible port of the SignalR service which is designed for browser/client side usage.
     * 
     */
    public Integer getPublicPort() {
        return this.publicPort;
    }
    /**
     * The publicly accessible port of the SignalR service which is designed for customer server side usage.
     * 
     */
    public Integer getServerPort() {
        return this.serverPort;
    }
    /**
     * The billing information of the resource.(e.g. Free, Standard)
     * 
     */
    public Optional<ResourceSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Upstream settings when the Azure SignalR is in server-less mode.
     * 
     */
    public Optional<ServerlessUpstreamSettingsResponse> getUpstream() {
        return Optional.ofNullable(this.upstream);
    }
    /**
     * Version of the SignalR resource. Probably you need the same or higher version of client SDKs.
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSignalRResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SignalRCorsSettingsResponse cors;
        private String externalIP;
        private @Nullable List<SignalRFeatureResponse> features;
        private String hostName;
        private String hostNamePrefix;
        private String id;
        private @Nullable String kind;
        private @Nullable String location;
        private String name;
        private @Nullable SignalRNetworkACLsResponse networkACLs;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private Integer publicPort;
        private Integer serverPort;
        private @Nullable ResourceSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable ServerlessUpstreamSettingsResponse upstream;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSignalRResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cors = defaults.cors;
    	      this.externalIP = defaults.externalIP;
    	      this.features = defaults.features;
    	      this.hostName = defaults.hostName;
    	      this.hostNamePrefix = defaults.hostNamePrefix;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkACLs = defaults.networkACLs;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicPort = defaults.publicPort;
    	      this.serverPort = defaults.serverPort;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.upstream = defaults.upstream;
    	      this.version = defaults.version;
        }

        public Builder setCors(@Nullable SignalRCorsSettingsResponse cors) {
            this.cors = cors;
            return this;
        }

        public Builder setExternalIP(String externalIP) {
            this.externalIP = Objects.requireNonNull(externalIP);
            return this;
        }

        public Builder setFeatures(@Nullable List<SignalRFeatureResponse> features) {
            this.features = features;
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = Objects.requireNonNull(hostNamePrefix);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkACLs(@Nullable SignalRNetworkACLsResponse networkACLs) {
            this.networkACLs = networkACLs;
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicPort(Integer publicPort) {
            this.publicPort = Objects.requireNonNull(publicPort);
            return this;
        }

        public Builder setServerPort(Integer serverPort) {
            this.serverPort = Objects.requireNonNull(serverPort);
            return this;
        }

        public Builder setSku(@Nullable ResourceSkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpstream(@Nullable ServerlessUpstreamSettingsResponse upstream) {
            this.upstream = upstream;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetSignalRResult build() {
            return new GetSignalRResult(cors, externalIP, features, hostName, hostNamePrefix, id, kind, location, name, networkACLs, privateEndpointConnections, provisioningState, publicPort, serverPort, sku, tags, type, upstream, version);
        }
    }
}
