// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.VpnLinkBgpSettingsResponse;
import io.pulumi.azurenative.network.outputs.VpnLinkProviderPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnSiteLinkResponse {
    /**
     * The set of bgp properties.
     * 
     */
    private final @Nullable VpnLinkBgpSettingsResponse bgpProperties;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * FQDN of vpn-site-link.
     * 
     */
    private final @Nullable String fqdn;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The ip-address for the vpn-site-link.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * The link provider properties.
     * 
     */
    private final @Nullable VpnLinkProviderPropertiesResponse linkProperties;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the VPN site link resource.
     * 
     */
    private final String provisioningState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private VpnSiteLinkResponse(
        @CustomType.Parameter("bgpProperties") @Nullable VpnLinkBgpSettingsResponse bgpProperties,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("fqdn") @Nullable String fqdn,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("linkProperties") @Nullable VpnLinkProviderPropertiesResponse linkProperties,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.bgpProperties = bgpProperties;
        this.etag = etag;
        this.fqdn = fqdn;
        this.id = id;
        this.ipAddress = ipAddress;
        this.linkProperties = linkProperties;
        this.name = name;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * The set of bgp properties.
     * 
    */
    public Optional<VpnLinkBgpSettingsResponse> getBgpProperties() {
        return Optional.ofNullable(this.bgpProperties);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * FQDN of vpn-site-link.
     * 
    */
    public Optional<String> getFqdn() {
        return Optional.ofNullable(this.fqdn);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The ip-address for the vpn-site-link.
     * 
    */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * The link provider properties.
     * 
    */
    public Optional<VpnLinkProviderPropertiesResponse> getLinkProperties() {
        return Optional.ofNullable(this.linkProperties);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the VPN site link resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnSiteLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VpnLinkBgpSettingsResponse bgpProperties;
        private String etag;
        private @Nullable String fqdn;
        private @Nullable String id;
        private @Nullable String ipAddress;
        private @Nullable VpnLinkProviderPropertiesResponse linkProperties;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnSiteLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpProperties = defaults.bgpProperties;
    	      this.etag = defaults.etag;
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.linkProperties = defaults.linkProperties;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder bgpProperties(@Nullable VpnLinkBgpSettingsResponse bgpProperties) {
            this.bgpProperties = bgpProperties;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder linkProperties(@Nullable VpnLinkProviderPropertiesResponse linkProperties) {
            this.linkProperties = linkProperties;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public VpnSiteLinkResponse build() {
            return new VpnSiteLinkResponse(bgpProperties, etag, fqdn, id, ipAddress, linkProperties, name, provisioningState, type);
        }
    }
}
