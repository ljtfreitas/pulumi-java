// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.RouterBgpPeerResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RouterBgpResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RouterInterfaceResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RouterMd5AuthenticationKeyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RouterNatResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRouterResult {
    /**
     * BGP information specific to this router.
     * 
     */
    private final RouterBgpResponse bgp;
    /**
     * BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
     * 
     */
    private final List<RouterBgpPeerResponse> bgpPeers;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Indicates if a router is dedicated for use with encrypted VLAN attachments (interconnectAttachments). Not currently available publicly.
     * 
     */
    private final Boolean encryptedInterconnectRouter;
    /**
     * Router interfaces. Each interface requires either one linked resource, (for example, linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.
     * 
     */
    private final List<RouterInterfaceResponse> interfaces;
    /**
     * Type of resource. Always compute#router for routers.
     * 
     */
    private final String kind;
    /**
     * Keys used for MD5 authentication.
     * 
     */
    private final List<RouterMd5AuthenticationKeyResponse> md5AuthenticationKeys;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * A list of NAT services created in this router.
     * 
     */
    private final List<RouterNatResponse> nats;
    /**
     * URI of the network to which this router belongs.
     * 
     */
    private final String network;
    /**
     * URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;

    @OutputCustomType.Constructor({"bgp","bgpPeers","creationTimestamp","description","encryptedInterconnectRouter","interfaces","kind","md5AuthenticationKeys","name","nats","network","region","selfLink","selfLinkWithId"})
    private GetRouterResult(
        RouterBgpResponse bgp,
        List<RouterBgpPeerResponse> bgpPeers,
        String creationTimestamp,
        String description,
        Boolean encryptedInterconnectRouter,
        List<RouterInterfaceResponse> interfaces,
        String kind,
        List<RouterMd5AuthenticationKeyResponse> md5AuthenticationKeys,
        String name,
        List<RouterNatResponse> nats,
        String network,
        String region,
        String selfLink,
        String selfLinkWithId) {
        this.bgp = Objects.requireNonNull(bgp);
        this.bgpPeers = Objects.requireNonNull(bgpPeers);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.encryptedInterconnectRouter = Objects.requireNonNull(encryptedInterconnectRouter);
        this.interfaces = Objects.requireNonNull(interfaces);
        this.kind = Objects.requireNonNull(kind);
        this.md5AuthenticationKeys = Objects.requireNonNull(md5AuthenticationKeys);
        this.name = Objects.requireNonNull(name);
        this.nats = Objects.requireNonNull(nats);
        this.network = Objects.requireNonNull(network);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
    }

    /**
     * BGP information specific to this router.
     * 
     */
    public RouterBgpResponse getBgp() {
        return this.bgp;
    }
    /**
     * BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
     * 
     */
    public List<RouterBgpPeerResponse> getBgpPeers() {
        return this.bgpPeers;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Indicates if a router is dedicated for use with encrypted VLAN attachments (interconnectAttachments). Not currently available publicly.
     * 
     */
    public Boolean getEncryptedInterconnectRouter() {
        return this.encryptedInterconnectRouter;
    }
    /**
     * Router interfaces. Each interface requires either one linked resource, (for example, linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.
     * 
     */
    public List<RouterInterfaceResponse> getInterfaces() {
        return this.interfaces;
    }
    /**
     * Type of resource. Always compute#router for routers.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Keys used for MD5 authentication.
     * 
     */
    public List<RouterMd5AuthenticationKeyResponse> getMd5AuthenticationKeys() {
        return this.md5AuthenticationKeys;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * A list of NAT services created in this router.
     * 
     */
    public List<RouterNatResponse> getNats() {
        return this.nats;
    }
    /**
     * URI of the network to which this router belongs.
     * 
     */
    public String getNetwork() {
        return this.network;
    }
    /**
     * URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterBgpResponse bgp;
        private List<RouterBgpPeerResponse> bgpPeers;
        private String creationTimestamp;
        private String description;
        private Boolean encryptedInterconnectRouter;
        private List<RouterInterfaceResponse> interfaces;
        private String kind;
        private List<RouterMd5AuthenticationKeyResponse> md5AuthenticationKeys;
        private String name;
        private List<RouterNatResponse> nats;
        private String network;
        private String region;
        private String selfLink;
        private String selfLinkWithId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgp = defaults.bgp;
    	      this.bgpPeers = defaults.bgpPeers;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.encryptedInterconnectRouter = defaults.encryptedInterconnectRouter;
    	      this.interfaces = defaults.interfaces;
    	      this.kind = defaults.kind;
    	      this.md5AuthenticationKeys = defaults.md5AuthenticationKeys;
    	      this.name = defaults.name;
    	      this.nats = defaults.nats;
    	      this.network = defaults.network;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
        }

        public Builder setBgp(RouterBgpResponse bgp) {
            this.bgp = Objects.requireNonNull(bgp);
            return this;
        }

        public Builder setBgpPeers(List<RouterBgpPeerResponse> bgpPeers) {
            this.bgpPeers = Objects.requireNonNull(bgpPeers);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEncryptedInterconnectRouter(Boolean encryptedInterconnectRouter) {
            this.encryptedInterconnectRouter = Objects.requireNonNull(encryptedInterconnectRouter);
            return this;
        }

        public Builder setInterfaces(List<RouterInterfaceResponse> interfaces) {
            this.interfaces = Objects.requireNonNull(interfaces);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMd5AuthenticationKeys(List<RouterMd5AuthenticationKeyResponse> md5AuthenticationKeys) {
            this.md5AuthenticationKeys = Objects.requireNonNull(md5AuthenticationKeys);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNats(List<RouterNatResponse> nats) {
            this.nats = Objects.requireNonNull(nats);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        public GetRouterResult build() {
            return new GetRouterResult(bgp, bgpPeers, creationTimestamp, description, encryptedInterconnectRouter, interfaces, kind, md5AuthenticationKeys, name, nats, network, region, selfLink, selfLinkWithId);
        }
    }
}
