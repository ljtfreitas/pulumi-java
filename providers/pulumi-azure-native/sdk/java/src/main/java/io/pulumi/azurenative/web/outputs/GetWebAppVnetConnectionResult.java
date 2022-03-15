// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.VnetRouteResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppVnetConnectionResult {
    /**
     * A certificate file (.cer) blob containing the public key of the private key used to authenticate a
     * Point-To-Site VPN connection.
     * 
     */
    private final @Nullable String certBlob;
    /**
     * The client certificate thumbprint.
     * 
     */
    private final String certThumbprint;
    /**
     * DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
     * 
     */
    private final @Nullable String dnsServers;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Flag that is used to denote if this is VNET injection
     * 
     */
    private final @Nullable Boolean isSwift;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * <code>true</code> if a resync is required; otherwise, <code>false</code>.
     * 
     */
    private final Boolean resyncRequired;
    /**
     * The routes that this Virtual Network connection uses.
     * 
     */
    private final List<VnetRouteResponse> routes;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The Virtual Network's resource ID.
     * 
     */
    private final @Nullable String vnetResourceId;

    @CustomType.Constructor
    private GetWebAppVnetConnectionResult(
        @CustomType.Parameter("certBlob") @Nullable String certBlob,
        @CustomType.Parameter("certThumbprint") String certThumbprint,
        @CustomType.Parameter("dnsServers") @Nullable String dnsServers,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isSwift") @Nullable Boolean isSwift,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resyncRequired") Boolean resyncRequired,
        @CustomType.Parameter("routes") List<VnetRouteResponse> routes,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("vnetResourceId") @Nullable String vnetResourceId) {
        this.certBlob = certBlob;
        this.certThumbprint = certThumbprint;
        this.dnsServers = dnsServers;
        this.id = id;
        this.isSwift = isSwift;
        this.kind = kind;
        this.name = name;
        this.resyncRequired = resyncRequired;
        this.routes = routes;
        this.type = type;
        this.vnetResourceId = vnetResourceId;
    }

    /**
     * A certificate file (.cer) blob containing the public key of the private key used to authenticate a
     * Point-To-Site VPN connection.
     * 
    */
    public Optional<String> getCertBlob() {
        return Optional.ofNullable(this.certBlob);
    }
    /**
     * The client certificate thumbprint.
     * 
    */
    public String getCertThumbprint() {
        return this.certThumbprint;
    }
    /**
     * DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
     * 
    */
    public Optional<String> getDnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Flag that is used to denote if this is VNET injection
     * 
    */
    public Optional<Boolean> getIsSwift() {
        return Optional.ofNullable(this.isSwift);
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * <code>true</code> if a resync is required; otherwise, <code>false</code>.
     * 
    */
    public Boolean getResyncRequired() {
        return this.resyncRequired;
    }
    /**
     * The routes that this Virtual Network connection uses.
     * 
    */
    public List<VnetRouteResponse> getRoutes() {
        return this.routes;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The Virtual Network's resource ID.
     * 
    */
    public Optional<String> getVnetResourceId() {
        return Optional.ofNullable(this.vnetResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppVnetConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certBlob;
        private String certThumbprint;
        private @Nullable String dnsServers;
        private String id;
        private @Nullable Boolean isSwift;
        private @Nullable String kind;
        private String name;
        private Boolean resyncRequired;
        private List<VnetRouteResponse> routes;
        private String type;
        private @Nullable String vnetResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppVnetConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certBlob = defaults.certBlob;
    	      this.certThumbprint = defaults.certThumbprint;
    	      this.dnsServers = defaults.dnsServers;
    	      this.id = defaults.id;
    	      this.isSwift = defaults.isSwift;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resyncRequired = defaults.resyncRequired;
    	      this.routes = defaults.routes;
    	      this.type = defaults.type;
    	      this.vnetResourceId = defaults.vnetResourceId;
        }

        public Builder certBlob(@Nullable String certBlob) {
            this.certBlob = certBlob;
            return this;
        }

        public Builder certThumbprint(String certThumbprint) {
            this.certThumbprint = Objects.requireNonNull(certThumbprint);
            return this;
        }

        public Builder dnsServers(@Nullable String dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isSwift(@Nullable Boolean isSwift) {
            this.isSwift = isSwift;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resyncRequired(Boolean resyncRequired) {
            this.resyncRequired = Objects.requireNonNull(resyncRequired);
            return this;
        }

        public Builder routes(List<VnetRouteResponse> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder vnetResourceId(@Nullable String vnetResourceId) {
            this.vnetResourceId = vnetResourceId;
            return this;
        }
        public GetWebAppVnetConnectionResult build() {
            return new GetWebAppVnetConnectionResult(certBlob, certThumbprint, dnsServers, id, isSwift, kind, name, resyncRequired, routes, type, vnetResourceId);
        }
    }
}
