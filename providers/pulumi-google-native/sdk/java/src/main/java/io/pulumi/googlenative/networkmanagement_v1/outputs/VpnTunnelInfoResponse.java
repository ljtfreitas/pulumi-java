// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VpnTunnelInfoResponse {
    /**
     * Name of a VPN tunnel.
     * 
     */
    private final String displayName;
    /**
     * URI of a Compute Engine network where the VPN tunnel is configured.
     * 
     */
    private final String networkUri;
    /**
     * Name of a Google Cloud region where this VPN tunnel is configured.
     * 
     */
    private final String region;
    /**
     * URI of a VPN gateway at remote end of the tunnel.
     * 
     */
    private final String remoteGateway;
    /**
     * Remote VPN gateway's IP address.
     * 
     */
    private final String remoteGatewayIp;
    /**
     * Type of the routing policy.
     * 
     */
    private final String routingType;
    /**
     * URI of the VPN gateway at local end of the tunnel.
     * 
     */
    private final String sourceGateway;
    /**
     * Local VPN gateway's IP address.
     * 
     */
    private final String sourceGatewayIp;
    /**
     * URI of a VPN tunnel.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"displayName","networkUri","region","remoteGateway","remoteGatewayIp","routingType","sourceGateway","sourceGatewayIp","uri"})
    private VpnTunnelInfoResponse(
        String displayName,
        String networkUri,
        String region,
        String remoteGateway,
        String remoteGatewayIp,
        String routingType,
        String sourceGateway,
        String sourceGatewayIp,
        String uri) {
        this.displayName = Objects.requireNonNull(displayName);
        this.networkUri = Objects.requireNonNull(networkUri);
        this.region = Objects.requireNonNull(region);
        this.remoteGateway = Objects.requireNonNull(remoteGateway);
        this.remoteGatewayIp = Objects.requireNonNull(remoteGatewayIp);
        this.routingType = Objects.requireNonNull(routingType);
        this.sourceGateway = Objects.requireNonNull(sourceGateway);
        this.sourceGatewayIp = Objects.requireNonNull(sourceGatewayIp);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * Name of a VPN tunnel.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * URI of a Compute Engine network where the VPN tunnel is configured.
     * 
     */
    public String getNetworkUri() {
        return this.networkUri;
    }
    /**
     * Name of a Google Cloud region where this VPN tunnel is configured.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * URI of a VPN gateway at remote end of the tunnel.
     * 
     */
    public String getRemoteGateway() {
        return this.remoteGateway;
    }
    /**
     * Remote VPN gateway's IP address.
     * 
     */
    public String getRemoteGatewayIp() {
        return this.remoteGatewayIp;
    }
    /**
     * Type of the routing policy.
     * 
     */
    public String getRoutingType() {
        return this.routingType;
    }
    /**
     * URI of the VPN gateway at local end of the tunnel.
     * 
     */
    public String getSourceGateway() {
        return this.sourceGateway;
    }
    /**
     * Local VPN gateway's IP address.
     * 
     */
    public String getSourceGatewayIp() {
        return this.sourceGatewayIp;
    }
    /**
     * URI of a VPN tunnel.
     * 
     */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnTunnelInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String networkUri;
        private String region;
        private String remoteGateway;
        private String remoteGatewayIp;
        private String routingType;
        private String sourceGateway;
        private String sourceGatewayIp;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnTunnelInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.networkUri = defaults.networkUri;
    	      this.region = defaults.region;
    	      this.remoteGateway = defaults.remoteGateway;
    	      this.remoteGatewayIp = defaults.remoteGatewayIp;
    	      this.routingType = defaults.routingType;
    	      this.sourceGateway = defaults.sourceGateway;
    	      this.sourceGatewayIp = defaults.sourceGatewayIp;
    	      this.uri = defaults.uri;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setNetworkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRemoteGateway(String remoteGateway) {
            this.remoteGateway = Objects.requireNonNull(remoteGateway);
            return this;
        }

        public Builder setRemoteGatewayIp(String remoteGatewayIp) {
            this.remoteGatewayIp = Objects.requireNonNull(remoteGatewayIp);
            return this;
        }

        public Builder setRoutingType(String routingType) {
            this.routingType = Objects.requireNonNull(routingType);
            return this;
        }

        public Builder setSourceGateway(String sourceGateway) {
            this.sourceGateway = Objects.requireNonNull(sourceGateway);
            return this;
        }

        public Builder setSourceGatewayIp(String sourceGatewayIp) {
            this.sourceGatewayIp = Objects.requireNonNull(sourceGatewayIp);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public VpnTunnelInfoResponse build() {
            return new VpnTunnelInfoResponse(displayName, networkUri, region, remoteGateway, remoteGatewayIp, routingType, sourceGateway, sourceGatewayIp, uri);
        }
    }
}
