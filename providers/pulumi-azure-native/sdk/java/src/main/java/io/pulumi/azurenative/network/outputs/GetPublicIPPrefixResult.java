// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.IpTagResponse;
import io.pulumi.azurenative.network.outputs.NatGatewayResponse;
import io.pulumi.azurenative.network.outputs.PublicIPPrefixSkuResponse;
import io.pulumi.azurenative.network.outputs.ReferencedPublicIpAddressResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPublicIPPrefixResult {
    /**
     * The customIpPrefix that this prefix is associated with.
     * 
     */
    private final @Nullable SubResourceResponse customIPPrefix;
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
     * The allocated Prefix.
     * 
     */
    private final String ipPrefix;
    /**
     * The list of tags associated with the public IP prefix.
     * 
     */
    private final @Nullable List<IpTagResponse> ipTags;
    /**
     * The reference to load balancer frontend IP configuration associated with the public IP prefix.
     * 
     */
    private final SubResourceResponse loadBalancerFrontendIpConfiguration;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * NatGateway of Public IP Prefix.
     * 
     */
    private final @Nullable NatGatewayResponse natGateway;
    /**
     * The Length of the Public IP Prefix.
     * 
     */
    private final @Nullable Integer prefixLength;
    /**
     * The provisioning state of the public IP prefix resource.
     * 
     */
    private final String provisioningState;
    /**
     * The public IP address version.
     * 
     */
    private final @Nullable String publicIPAddressVersion;
    /**
     * The list of all referenced PublicIPAddresses.
     * 
     */
    private final List<ReferencedPublicIpAddressResponse> publicIPAddresses;
    /**
     * The resource GUID property of the public IP prefix resource.
     * 
     */
    private final String resourceGuid;
    /**
     * The public IP prefix SKU.
     * 
     */
    private final @Nullable PublicIPPrefixSkuResponse sku;
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

    @CustomType.Constructor
    private GetPublicIPPrefixResult(
        @CustomType.Parameter("customIPPrefix") @Nullable SubResourceResponse customIPPrefix,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipPrefix") String ipPrefix,
        @CustomType.Parameter("ipTags") @Nullable List<IpTagResponse> ipTags,
        @CustomType.Parameter("loadBalancerFrontendIpConfiguration") SubResourceResponse loadBalancerFrontendIpConfiguration,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("natGateway") @Nullable NatGatewayResponse natGateway,
        @CustomType.Parameter("prefixLength") @Nullable Integer prefixLength,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicIPAddressVersion") @Nullable String publicIPAddressVersion,
        @CustomType.Parameter("publicIPAddresses") List<ReferencedPublicIpAddressResponse> publicIPAddresses,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("sku") @Nullable PublicIPPrefixSkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("zones") @Nullable List<String> zones) {
        this.customIPPrefix = customIPPrefix;
        this.etag = etag;
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.ipPrefix = ipPrefix;
        this.ipTags = ipTags;
        this.loadBalancerFrontendIpConfiguration = loadBalancerFrontendIpConfiguration;
        this.location = location;
        this.name = name;
        this.natGateway = natGateway;
        this.prefixLength = prefixLength;
        this.provisioningState = provisioningState;
        this.publicIPAddressVersion = publicIPAddressVersion;
        this.publicIPAddresses = publicIPAddresses;
        this.resourceGuid = resourceGuid;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.zones = zones;
    }

    /**
     * The customIpPrefix that this prefix is associated with.
     * 
    */
    public Optional<SubResourceResponse> getCustomIPPrefix() {
        return Optional.ofNullable(this.customIPPrefix);
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
     * The allocated Prefix.
     * 
    */
    public String getIpPrefix() {
        return this.ipPrefix;
    }
    /**
     * The list of tags associated with the public IP prefix.
     * 
    */
    public List<IpTagResponse> getIpTags() {
        return this.ipTags == null ? List.of() : this.ipTags;
    }
    /**
     * The reference to load balancer frontend IP configuration associated with the public IP prefix.
     * 
    */
    public SubResourceResponse getLoadBalancerFrontendIpConfiguration() {
        return this.loadBalancerFrontendIpConfiguration;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * NatGateway of Public IP Prefix.
     * 
    */
    public Optional<NatGatewayResponse> getNatGateway() {
        return Optional.ofNullable(this.natGateway);
    }
    /**
     * The Length of the Public IP Prefix.
     * 
    */
    public Optional<Integer> getPrefixLength() {
        return Optional.ofNullable(this.prefixLength);
    }
    /**
     * The provisioning state of the public IP prefix resource.
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
     * The list of all referenced PublicIPAddresses.
     * 
    */
    public List<ReferencedPublicIpAddressResponse> getPublicIPAddresses() {
        return this.publicIPAddresses;
    }
    /**
     * The resource GUID property of the public IP prefix resource.
     * 
    */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The public IP prefix SKU.
     * 
    */
    public Optional<PublicIPPrefixSkuResponse> getSku() {
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

    public static Builder builder(GetPublicIPPrefixResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse customIPPrefix;
        private String etag;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable String id;
        private String ipPrefix;
        private @Nullable List<IpTagResponse> ipTags;
        private SubResourceResponse loadBalancerFrontendIpConfiguration;
        private @Nullable String location;
        private String name;
        private @Nullable NatGatewayResponse natGateway;
        private @Nullable Integer prefixLength;
        private String provisioningState;
        private @Nullable String publicIPAddressVersion;
        private List<ReferencedPublicIpAddressResponse> publicIPAddresses;
        private String resourceGuid;
        private @Nullable PublicIPPrefixSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicIPPrefixResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customIPPrefix = defaults.customIPPrefix;
    	      this.etag = defaults.etag;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.ipPrefix = defaults.ipPrefix;
    	      this.ipTags = defaults.ipTags;
    	      this.loadBalancerFrontendIpConfiguration = defaults.loadBalancerFrontendIpConfiguration;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.natGateway = defaults.natGateway;
    	      this.prefixLength = defaults.prefixLength;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddressVersion = defaults.publicIPAddressVersion;
    	      this.publicIPAddresses = defaults.publicIPAddresses;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder customIPPrefix(@Nullable SubResourceResponse customIPPrefix) {
            this.customIPPrefix = customIPPrefix;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder ipPrefix(String ipPrefix) {
            this.ipPrefix = Objects.requireNonNull(ipPrefix);
            return this;
        }

        public Builder ipTags(@Nullable List<IpTagResponse> ipTags) {
            this.ipTags = ipTags;
            return this;
        }

        public Builder loadBalancerFrontendIpConfiguration(SubResourceResponse loadBalancerFrontendIpConfiguration) {
            this.loadBalancerFrontendIpConfiguration = Objects.requireNonNull(loadBalancerFrontendIpConfiguration);
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

        public Builder natGateway(@Nullable NatGatewayResponse natGateway) {
            this.natGateway = natGateway;
            return this;
        }

        public Builder prefixLength(@Nullable Integer prefixLength) {
            this.prefixLength = prefixLength;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publicIPAddressVersion(@Nullable String publicIPAddressVersion) {
            this.publicIPAddressVersion = publicIPAddressVersion;
            return this;
        }

        public Builder publicIPAddresses(List<ReferencedPublicIpAddressResponse> publicIPAddresses) {
            this.publicIPAddresses = Objects.requireNonNull(publicIPAddresses);
            return this;
        }

        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder sku(@Nullable PublicIPPrefixSkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GetPublicIPPrefixResult build() {
            return new GetPublicIPPrefixResult(customIPPrefix, etag, extendedLocation, id, ipPrefix, ipTags, loadBalancerFrontendIpConfiguration, location, name, natGateway, prefixLength, provisioningState, publicIPAddressVersion, publicIPAddresses, resourceGuid, sku, tags, type, zones);
        }
    }
}
