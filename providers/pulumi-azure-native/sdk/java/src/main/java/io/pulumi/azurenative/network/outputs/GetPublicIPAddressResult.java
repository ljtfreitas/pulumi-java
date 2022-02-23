// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.DdosSettingsResponse;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.IPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.IpTagResponse;
import io.pulumi.azurenative.network.outputs.NatGatewayResponse;
import io.pulumi.azurenative.network.outputs.PublicIPAddressDnsSettingsResponse;
import io.pulumi.azurenative.network.outputs.PublicIPAddressResponse;
import io.pulumi.azurenative.network.outputs.PublicIPAddressSkuResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPublicIPAddressResult {
    /**
     * The DDoS protection custom policy associated with the public IP address.
     * 
     */
    private final @Nullable DdosSettingsResponse ddosSettings;
    /**
     * The FQDN of the DNS record associated with the public IP address.
     * 
     */
    private final @Nullable PublicIPAddressDnsSettingsResponse dnsSettings;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The extended location of the public ip address.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The idle timeout of the public IP address.
     * 
     */
    private final @Nullable Integer idleTimeoutInMinutes;
    /**
     * The IP address associated with the public IP address resource.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * The IP configuration associated with the public IP address.
     * 
     */
    private final IPConfigurationResponse ipConfiguration;
    /**
     * The list of tags associated with the public IP address.
     * 
     */
    private final @Nullable List<IpTagResponse> ipTags;
    /**
     * The linked public IP address of the public IP address resource.
     * 
     */
    private final @Nullable PublicIPAddressResponse linkedPublicIPAddress;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Migration phase of Public IP Address.
     * 
     */
    private final @Nullable String migrationPhase;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The NatGateway for the Public IP address.
     * 
     */
    private final @Nullable NatGatewayResponse natGateway;
    /**
     * The provisioning state of the public IP address resource.
     * 
     */
    private final String provisioningState;
    /**
     * The public IP address version.
     * 
     */
    private final @Nullable String publicIPAddressVersion;
    /**
     * The public IP address allocation method.
     * 
     */
    private final @Nullable String publicIPAllocationMethod;
    /**
     * The Public IP Prefix this Public IP Address should be allocated from.
     * 
     */
    private final @Nullable SubResourceResponse publicIPPrefix;
    /**
     * The resource GUID property of the public IP address resource.
     * 
     */
    private final String resourceGuid;
    /**
     * The service public IP address of the public IP address resource.
     * 
     */
    private final @Nullable PublicIPAddressResponse servicePublicIPAddress;
    /**
     * The public IP address SKU.
     * 
     */
    private final @Nullable PublicIPAddressSkuResponse sku;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"ddosSettings","dnsSettings","etag","extendedLocation","id","idleTimeoutInMinutes","ipAddress","ipConfiguration","ipTags","linkedPublicIPAddress","location","migrationPhase","name","natGateway","provisioningState","publicIPAddressVersion","publicIPAllocationMethod","publicIPPrefix","resourceGuid","servicePublicIPAddress","sku","tags","type","zones"})
    private GetPublicIPAddressResult(
        @Nullable DdosSettingsResponse ddosSettings,
        @Nullable PublicIPAddressDnsSettingsResponse dnsSettings,
        String etag,
        @Nullable ExtendedLocationResponse extendedLocation,
        @Nullable String id,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable String ipAddress,
        IPConfigurationResponse ipConfiguration,
        @Nullable List<IpTagResponse> ipTags,
        @Nullable PublicIPAddressResponse linkedPublicIPAddress,
        @Nullable String location,
        @Nullable String migrationPhase,
        String name,
        @Nullable NatGatewayResponse natGateway,
        String provisioningState,
        @Nullable String publicIPAddressVersion,
        @Nullable String publicIPAllocationMethod,
        @Nullable SubResourceResponse publicIPPrefix,
        String resourceGuid,
        @Nullable PublicIPAddressResponse servicePublicIPAddress,
        @Nullable PublicIPAddressSkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<String> zones) {
        this.ddosSettings = ddosSettings;
        this.dnsSettings = dnsSettings;
        this.etag = Objects.requireNonNull(etag);
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.ipAddress = ipAddress;
        this.ipConfiguration = Objects.requireNonNull(ipConfiguration);
        this.ipTags = ipTags;
        this.linkedPublicIPAddress = linkedPublicIPAddress;
        this.location = location;
        this.migrationPhase = migrationPhase;
        this.name = Objects.requireNonNull(name);
        this.natGateway = natGateway;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicIPAddressVersion = publicIPAddressVersion;
        this.publicIPAllocationMethod = publicIPAllocationMethod;
        this.publicIPPrefix = publicIPPrefix;
        this.resourceGuid = Objects.requireNonNull(resourceGuid);
        this.servicePublicIPAddress = servicePublicIPAddress;
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.zones = zones;
    }

    /**
     * The DDoS protection custom policy associated with the public IP address.
     * 
     */
    public Optional<DdosSettingsResponse> getDdosSettings() {
        return Optional.ofNullable(this.ddosSettings);
    }
    /**
     * The FQDN of the DNS record associated with the public IP address.
     * 
     */
    public Optional<PublicIPAddressDnsSettingsResponse> getDnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The extended location of the public ip address.
     * 
     */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The idle timeout of the public IP address.
     * 
     */
    public Optional<Integer> getIdleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    /**
     * The IP address associated with the public IP address resource.
     * 
     */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * The IP configuration associated with the public IP address.
     * 
     */
    public IPConfigurationResponse getIpConfiguration() {
        return this.ipConfiguration;
    }
    /**
     * The list of tags associated with the public IP address.
     * 
     */
    public List<IpTagResponse> getIpTags() {
        return this.ipTags == null ? List.of() : this.ipTags;
    }
    /**
     * The linked public IP address of the public IP address resource.
     * 
     */
    public Optional<PublicIPAddressResponse> getLinkedPublicIPAddress() {
        return Optional.ofNullable(this.linkedPublicIPAddress);
    }
    /**
     * Resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Migration phase of Public IP Address.
     * 
     */
    public Optional<String> getMigrationPhase() {
        return Optional.ofNullable(this.migrationPhase);
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The NatGateway for the Public IP address.
     * 
     */
    public Optional<NatGatewayResponse> getNatGateway() {
        return Optional.ofNullable(this.natGateway);
    }
    /**
     * The provisioning state of the public IP address resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The public IP address version.
     * 
     */
    public Optional<String> getPublicIPAddressVersion() {
        return Optional.ofNullable(this.publicIPAddressVersion);
    }
    /**
     * The public IP address allocation method.
     * 
     */
    public Optional<String> getPublicIPAllocationMethod() {
        return Optional.ofNullable(this.publicIPAllocationMethod);
    }
    /**
     * The Public IP Prefix this Public IP Address should be allocated from.
     * 
     */
    public Optional<SubResourceResponse> getPublicIPPrefix() {
        return Optional.ofNullable(this.publicIPPrefix);
    }
    /**
     * The resource GUID property of the public IP address resource.
     * 
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The service public IP address of the public IP address resource.
     * 
     */
    public Optional<PublicIPAddressResponse> getServicePublicIPAddress() {
        return Optional.ofNullable(this.servicePublicIPAddress);
    }
    /**
     * The public IP address SKU.
     * 
     */
    public Optional<PublicIPAddressSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicIPAddressResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DdosSettingsResponse ddosSettings;
        private @Nullable PublicIPAddressDnsSettingsResponse dnsSettings;
        private String etag;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable String id;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable String ipAddress;
        private IPConfigurationResponse ipConfiguration;
        private @Nullable List<IpTagResponse> ipTags;
        private @Nullable PublicIPAddressResponse linkedPublicIPAddress;
        private @Nullable String location;
        private @Nullable String migrationPhase;
        private String name;
        private @Nullable NatGatewayResponse natGateway;
        private String provisioningState;
        private @Nullable String publicIPAddressVersion;
        private @Nullable String publicIPAllocationMethod;
        private @Nullable SubResourceResponse publicIPPrefix;
        private String resourceGuid;
        private @Nullable PublicIPAddressResponse servicePublicIPAddress;
        private @Nullable PublicIPAddressSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicIPAddressResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddosSettings = defaults.ddosSettings;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.etag = defaults.etag;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.ipTags = defaults.ipTags;
    	      this.linkedPublicIPAddress = defaults.linkedPublicIPAddress;
    	      this.location = defaults.location;
    	      this.migrationPhase = defaults.migrationPhase;
    	      this.name = defaults.name;
    	      this.natGateway = defaults.natGateway;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddressVersion = defaults.publicIPAddressVersion;
    	      this.publicIPAllocationMethod = defaults.publicIPAllocationMethod;
    	      this.publicIPPrefix = defaults.publicIPPrefix;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.servicePublicIPAddress = defaults.servicePublicIPAddress;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder setDdosSettings(@Nullable DdosSettingsResponse ddosSettings) {
            this.ddosSettings = ddosSettings;
            return this;
        }

        public Builder setDnsSettings(@Nullable PublicIPAddressDnsSettingsResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpConfiguration(IPConfigurationResponse ipConfiguration) {
            this.ipConfiguration = Objects.requireNonNull(ipConfiguration);
            return this;
        }

        public Builder setIpTags(@Nullable List<IpTagResponse> ipTags) {
            this.ipTags = ipTags;
            return this;
        }

        public Builder setLinkedPublicIPAddress(@Nullable PublicIPAddressResponse linkedPublicIPAddress) {
            this.linkedPublicIPAddress = linkedPublicIPAddress;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMigrationPhase(@Nullable String migrationPhase) {
            this.migrationPhase = migrationPhase;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNatGateway(@Nullable NatGatewayResponse natGateway) {
            this.natGateway = natGateway;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicIPAddressVersion(@Nullable String publicIPAddressVersion) {
            this.publicIPAddressVersion = publicIPAddressVersion;
            return this;
        }

        public Builder setPublicIPAllocationMethod(@Nullable String publicIPAllocationMethod) {
            this.publicIPAllocationMethod = publicIPAllocationMethod;
            return this;
        }

        public Builder setPublicIPPrefix(@Nullable SubResourceResponse publicIPPrefix) {
            this.publicIPPrefix = publicIPPrefix;
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder setServicePublicIPAddress(@Nullable PublicIPAddressResponse servicePublicIPAddress) {
            this.servicePublicIPAddress = servicePublicIPAddress;
            return this;
        }

        public Builder setSku(@Nullable PublicIPAddressSkuResponse sku) {
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

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GetPublicIPAddressResult build() {
            return new GetPublicIPAddressResult(ddosSettings, dnsSettings, etag, extendedLocation, id, idleTimeoutInMinutes, ipAddress, ipConfiguration, ipTags, linkedPublicIPAddress, location, migrationPhase, name, natGateway, provisioningState, publicIPAddressVersion, publicIPAllocationMethod, publicIPPrefix, resourceGuid, servicePublicIPAddress, sku, tags, type, zones);
        }
    }
}
