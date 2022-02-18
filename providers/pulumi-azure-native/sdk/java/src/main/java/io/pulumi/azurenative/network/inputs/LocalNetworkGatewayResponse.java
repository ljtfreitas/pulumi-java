// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.inputs.BgpSettingsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A common class for general resource information.
 * 
 */
public final class LocalNetworkGatewayResponse extends io.pulumi.resources.InvokeArgs {

    public static final LocalNetworkGatewayResponse Empty = new LocalNetworkGatewayResponse();

    /**
     * Local network gateway's BGP speaker settings.
     * 
     */
    @InputImport(name="bgpSettings")
    private final @Nullable BgpSettingsResponse bgpSettings;

    public Optional<BgpSettingsResponse> getBgpSettings() {
        return this.bgpSettings == null ? Optional.empty() : Optional.ofNullable(this.bgpSettings);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * FQDN of local network gateway.
     * 
     */
    @InputImport(name="fqdn")
    private final @Nullable String fqdn;

    public Optional<String> getFqdn() {
        return this.fqdn == null ? Optional.empty() : Optional.ofNullable(this.fqdn);
    }

    /**
     * IP address of local network gateway.
     * 
     */
    @InputImport(name="gatewayIpAddress")
    private final @Nullable String gatewayIpAddress;

    public Optional<String> getGatewayIpAddress() {
        return this.gatewayIpAddress == null ? Optional.empty() : Optional.ofNullable(this.gatewayIpAddress);
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Local network site address space.
     * 
     */
    @InputImport(name="localNetworkAddressSpace")
    private final @Nullable AddressSpaceResponse localNetworkAddressSpace;

    public Optional<AddressSpaceResponse> getLocalNetworkAddressSpace() {
        return this.localNetworkAddressSpace == null ? Optional.empty() : Optional.ofNullable(this.localNetworkAddressSpace);
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Resource name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The provisioning state of the local network gateway resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The resource GUID property of the local network gateway resource.
     * 
     */
    @InputImport(name="resourceGuid", required=true)
    private final String resourceGuid;

    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public LocalNetworkGatewayResponse(
        @Nullable BgpSettingsResponse bgpSettings,
        String etag,
        @Nullable String fqdn,
        @Nullable String gatewayIpAddress,
        @Nullable String id,
        @Nullable AddressSpaceResponse localNetworkAddressSpace,
        @Nullable String location,
        String name,
        String provisioningState,
        String resourceGuid,
        @Nullable Map<String,String> tags,
        String type) {
        this.bgpSettings = bgpSettings;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.fqdn = fqdn;
        this.gatewayIpAddress = gatewayIpAddress;
        this.id = id;
        this.localNetworkAddressSpace = localNetworkAddressSpace;
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.resourceGuid = Objects.requireNonNull(resourceGuid, "expected parameter 'resourceGuid' to be non-null");
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private LocalNetworkGatewayResponse() {
        this.bgpSettings = null;
        this.etag = null;
        this.fqdn = null;
        this.gatewayIpAddress = null;
        this.id = null;
        this.localNetworkAddressSpace = null;
        this.location = null;
        this.name = null;
        this.provisioningState = null;
        this.resourceGuid = null;
        this.tags = Map.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalNetworkGatewayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BgpSettingsResponse bgpSettings;
        private String etag;
        private @Nullable String fqdn;
        private @Nullable String gatewayIpAddress;
        private @Nullable String id;
        private @Nullable AddressSpaceResponse localNetworkAddressSpace;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalNetworkGatewayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpSettings = defaults.bgpSettings;
    	      this.etag = defaults.etag;
    	      this.fqdn = defaults.fqdn;
    	      this.gatewayIpAddress = defaults.gatewayIpAddress;
    	      this.id = defaults.id;
    	      this.localNetworkAddressSpace = defaults.localNetworkAddressSpace;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setBgpSettings(@Nullable BgpSettingsResponse bgpSettings) {
            this.bgpSettings = bgpSettings;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setGatewayIpAddress(@Nullable String gatewayIpAddress) {
            this.gatewayIpAddress = gatewayIpAddress;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocalNetworkAddressSpace(@Nullable AddressSpaceResponse localNetworkAddressSpace) {
            this.localNetworkAddressSpace = localNetworkAddressSpace;
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
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

        public LocalNetworkGatewayResponse build() {
            return new LocalNetworkGatewayResponse(bgpSettings, etag, fqdn, gatewayIpAddress, id, localNetworkAddressSpace, location, name, provisioningState, resourceGuid, tags, type);
        }
    }
}
